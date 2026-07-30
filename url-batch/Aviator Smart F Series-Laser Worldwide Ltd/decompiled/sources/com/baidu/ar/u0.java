package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.audio.AudioParams;
import com.baidu.ar.audio.VolumeListener;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final String f3365d = "u0";

    /* renamed from: e, reason: collision with root package name */
    public static volatile u0 f3366e;

    /* renamed from: a, reason: collision with root package name */
    public v0 f3367a;

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f3368b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f3369c;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    u0.this.a((AudioParams) message.obj);
                    break;
                case 1002:
                    u0.this.e();
                    break;
                case 1003:
                    u0.this.f();
                    break;
                case 1004:
                    u0.this.d();
                    break;
                case 1005:
                    u0.this.c();
                    break;
            }
        }
    }

    public static u0 b() {
        if (f3366e == null) {
            synchronized (u0.class) {
                try {
                    if (f3366e == null) {
                        f3366e = new u0();
                    }
                } finally {
                }
            }
        }
        return f3366e;
    }

    public static void i() {
        f3366e = null;
    }

    public AudioParams a() {
        v0 v0Var = this.f3367a;
        if (v0Var != null) {
            return v0Var.a();
        }
        return null;
    }

    public final void c() {
        i();
        Handler handler = this.f3369c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3369c = null;
        }
        HandlerThread handlerThread = this.f3368b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3368b = null;
        }
    }

    public final void d() {
        v0 v0Var = this.f3367a;
        if (v0Var != null) {
            v0Var.c();
        }
        this.f3367a = null;
    }

    public final void e() {
        v0 v0Var = this.f3367a;
        if (v0Var != null) {
            v0Var.d();
        }
    }

    public final void f() {
        v0 v0Var = this.f3367a;
        if (v0Var != null) {
            v0Var.f();
        }
    }

    public boolean g() {
        HandlerThread handlerThread = this.f3368b;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void h() {
        Handler handler = this.f3369c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.f3369c;
            handler2.sendMessage(handler2.obtainMessage(1004));
            Handler handler3 = this.f3369c;
            handler3.sendMessage(handler3.obtainMessage(1005));
        }
    }

    public void j() {
        Handler handler = this.f3369c;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1002));
        }
    }

    public final void k() {
        HandlerThread handlerThread = new HandlerThread("AudioHandlerThread");
        this.f3368b = handlerThread;
        handlerThread.start();
        this.f3369c = new a(this.f3368b.getLooper());
    }

    public void l() {
        f();
    }

    public final void a(AudioParams audioParams) {
        v0 v0Var = this.f3367a;
        if (v0Var != null) {
            v0Var.a(audioParams);
        }
    }

    public void a(VolumeListener volumeListener) {
        if (volumeListener != null) {
            if (this.f3367a == null) {
                this.f3367a = new v0();
            }
            this.f3367a.a(volumeListener);
        }
    }

    public boolean a(AudioParams audioParams, s0 s0Var) {
        if (g()) {
            h.b(f3365d, "setupAudio error! As last audio thread is alive!");
            return false;
        }
        if (this.f3367a == null) {
            this.f3367a = new v0();
        }
        this.f3367a.a(s0Var);
        k();
        Handler handler = this.f3369c;
        handler.sendMessage(handler.obtainMessage(1001, audioParams));
        return true;
    }
}
