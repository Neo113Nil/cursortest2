package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
final class la4 extends HandlerThread implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private f32 f7898f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f7899g;

    /* renamed from: h, reason: collision with root package name */
    private Error f7900h;

    /* renamed from: i, reason: collision with root package name */
    private RuntimeException f7901i;

    /* renamed from: j, reason: collision with root package name */
    private na4 f7902j;

    public la4() {
        super("ExoPlayer:DummySurface");
    }

    public final na4 a(int i7) {
        boolean z6;
        start();
        this.f7899g = new Handler(getLooper(), this);
        this.f7898f = new f32(this.f7899g, null);
        synchronized (this) {
            z6 = false;
            this.f7899g.obtainMessage(1, i7, 0).sendToTarget();
            while (this.f7902j == null && this.f7901i == null && this.f7900h == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f7901i;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f7900h;
        if (error != null) {
            throw error;
        }
        na4 na4Var = this.f7902j;
        Objects.requireNonNull(na4Var);
        return na4Var;
    }

    public final void b() {
        Handler handler = this.f7899g;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 != 1) {
                if (i7 != 2) {
                    return true;
                }
                try {
                    f32 f32Var = this.f7898f;
                    Objects.requireNonNull(f32Var);
                    f32Var.c();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i8 = message.arg1;
                f32 f32Var2 = this.f7898f;
                Objects.requireNonNull(f32Var2);
                f32Var2.b(i8);
                this.f7902j = new na4(this, this.f7898f.a(), i8 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e7) {
                oc2.a("DummySurface", "Failed to initialize dummy surface", e7);
                this.f7900h = e7;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e8) {
                oc2.a("DummySurface", "Failed to initialize dummy surface", e8);
                this.f7901i = e8;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
