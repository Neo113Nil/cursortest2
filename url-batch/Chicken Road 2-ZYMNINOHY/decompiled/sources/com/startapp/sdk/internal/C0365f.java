package com.startapp.sdk.internal;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365f extends Thread implements Handler.Callback, Printer {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0363d f6881a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0364e f6882b;

    /* renamed from: c, reason: collision with root package name */
    public final C0362c f6883c;

    /* renamed from: d, reason: collision with root package name */
    public x3 f6884d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f6885e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f6886f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6887g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f6888h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6889i;

    public C0365f(long j4, boolean z) {
        super("startapp-anr");
        this.f6881a = new C0360a();
        this.f6882b = new C0361b();
        this.f6883c = new C0362c();
        this.f6885e = new Handler(Looper.getMainLooper(), this);
        this.f6886f = new AtomicLong(0L);
        this.f6888h = new AtomicReference("");
        this.f6887g = j4;
        this.f6889i = z;
    }

    public final void a() {
        long j4 = this.f6887g;
        boolean z = false;
        boolean z4 = true;
        while (!isInterrupted()) {
            if (this.f6886f.getAndAdd(j4) == 0) {
                if (z && !a((String) this.f6888h.get())) {
                    this.f6881a.remove();
                    z = false;
                }
                this.f6885e.sendEmptyMessage(101);
                z4 = true;
            }
            try {
                synchronized (this) {
                    wait(j4);
                }
                long j5 = this.f6886f.get();
                String str = (String) this.f6888h.get();
                if (j5 > 0 && !z && (z4 || a(str))) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        z = true;
                    } else {
                        j4 = this.f6882b.a(j5);
                        if (j4 > 0) {
                            z4 = false;
                        } else {
                            z = this.f6881a.a(str, j5);
                            j4 = this.f6887g;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f6883c.getClass();
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f6886f.set(0L);
        return true;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f6888h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f6888h.set("");
            this.f6886f.set(0L);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        this.f6881a.a();
        this.f6881a.remove();
        if (this.f6889i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    public final boolean a(String str) {
        boolean z = (this.f6889i && TextUtils.isEmpty(str)) ? false : true;
        x3 x3Var = this.f6884d;
        return z && (x3Var == null || !si.c(x3Var.f7858a.f7644a));
    }
}
