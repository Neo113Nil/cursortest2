package com.crrepa.w;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.crrepa.ble.util.BleLog;
import com.crrepa.u.c;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private static final int f13925o = 10;

    /* renamed from: h, reason: collision with root package name */
    private String f13926h;

    /* renamed from: i, reason: collision with root package name */
    private int f13927i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13928j;

    /* renamed from: k, reason: collision with root package name */
    private b f13929k;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f13931m;

    /* renamed from: l, reason: collision with root package name */
    private Socket f13930l = null;

    /* renamed from: n, reason: collision with root package name */
    private Handler f13932n = new HandlerC0247a(Looper.getMainLooper());

    /* renamed from: com.crrepa.w.a$a, reason: collision with other inner class name */
    class HandlerC0247a extends Handler {
        HandlerC0247a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (message.what == 10) {
                c.a(a.this.f13931m);
            }
        }
    }

    public a(String str, int i8) {
        this.f13926h = str;
        this.f13927i = i8;
    }

    private void a() {
        this.f13932n.removeMessages(10);
        this.f13932n.sendEmptyMessageDelayed(10, 200L);
    }

    private void c() {
        this.f13928j = false;
        a(0);
        try {
            this.f13930l.close();
        } catch (Exception unused) {
        }
        this.f13930l = null;
    }

    private void d() {
        try {
            byte[] bArr = new byte[CacheDataSink.DEFAULT_BUFFER_SIZE];
            while (true) {
                Socket socket = this.f13930l;
                if (socket == null) {
                    return;
                }
                byte[] copyOf = Arrays.copyOf(bArr, socket.getInputStream().read(bArr));
                BleLog.d(String.format("receive bytes: %s", com.crrepa.g1.c.c(copyOf)));
                a(copyOf);
                a();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            c();
        }
    }

    public void b() {
        this.f13929k = null;
        Socket socket = this.f13930l;
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
            this.f13930l = null;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"MissingPermission"})
    public void run() {
        try {
            this.f13930l = new Socket(this.f13926h, this.f13927i);
            this.f13928j = true;
            a(2);
            d();
        } catch (Exception e8) {
            e8.printStackTrace();
            c();
        }
    }

    private void a(int i8) {
        b bVar = this.f13929k;
        if (bVar != null) {
            bVar.onConnectionStateChanged(i8);
        }
    }

    public void b(byte[] bArr) {
        if (!this.f13928j || this.f13930l == null) {
            return;
        }
        try {
            this.f13931m = null;
            BleLog.d(String.format("send bytes: %s", com.crrepa.g1.c.c(bArr)));
            this.f13930l.getOutputStream().write(bArr);
        } catch (IOException e8) {
            e8.printStackTrace();
            c();
        }
    }

    public void a(b bVar) {
        this.f13929k = bVar;
        Executors.newSingleThreadExecutor().submit(this);
    }

    private void a(byte[] bArr) {
        byte[] bArr2 = this.f13931m;
        if (bArr2 == null) {
            byte[] bArr3 = new byte[bArr.length];
            this.f13931m = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        } else {
            byte[] bArr4 = new byte[bArr2.length + bArr.length];
            System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr4, this.f13931m.length, bArr.length);
            this.f13931m = bArr4;
        }
    }
}
