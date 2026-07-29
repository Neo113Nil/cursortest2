package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* compiled from: PlatformServiceClient.java */
/* loaded from: classes.dex */
public abstract class x implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6206a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f6207b;

    /* renamed from: c, reason: collision with root package name */
    private a f6208c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6209d;
    private Messenger e;
    private int f;
    private int g;
    private final String h;
    private final int i;

    /* compiled from: PlatformServiceClient.java */
    public interface a {
        void a(Bundle bundle);
    }

    protected abstract void a(Bundle bundle);

    public x(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f6206a = applicationContext != null ? applicationContext : context;
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = i3;
        this.f6207b = new Handler() { // from class: com.facebook.internal.x.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                x.this.a(message);
            }
        };
    }

    public void a(a aVar) {
        this.f6208c = aVar;
    }

    public boolean a() {
        Intent a2;
        if (this.f6209d || w.b(this.i) == -1 || (a2 = w.a(this.f6206a)) == null) {
            return false;
        }
        this.f6209d = true;
        this.f6206a.bindService(a2, this, 1);
        return true;
    }

    public void b() {
        this.f6209d = false;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.e = new Messenger(iBinder);
        c();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.e = null;
        try {
            this.f6206a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        b(null);
    }

    private void c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        a(bundle);
        Message obtain = Message.obtain((Handler) null, this.f);
        obtain.arg1 = this.i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f6207b);
        try {
            this.e.send(obtain);
        } catch (RemoteException unused) {
            b(null);
        }
    }

    protected void a(Message message) {
        if (message.what == this.g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                b(null);
            } else {
                b(data);
            }
            this.f6206a.unbindService(this);
        }
    }

    private void b(Bundle bundle) {
        if (this.f6209d) {
            this.f6209d = false;
            a aVar = this.f6208c;
            if (aVar != null) {
                aVar.a(bundle);
            }
        }
    }
}
