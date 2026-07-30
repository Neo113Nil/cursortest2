package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.record.EncoderParams;

/* loaded from: classes.dex */
public class ae {

    /* renamed from: f, reason: collision with root package name */
    public static final String f1640f = "ae";

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f1641a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f1642b;

    /* renamed from: c, reason: collision with root package name */
    public yd f1643c;

    /* renamed from: d, reason: collision with root package name */
    public z8 f1644d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1645e = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    ae.this.a((EncoderParams) message.obj);
                    break;
                case 1002:
                    ae.this.c();
                    break;
                case 1003:
                    ae.this.b((message.arg1 << 32) | (message.arg2 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32));
                    break;
                case 1004:
                    ae.this.d();
                    break;
                case 1005:
                    ae.this.b();
                    break;
                case 1006:
                    ae.this.a();
                    break;
            }
        }
    }

    public final void a() {
        Handler handler = this.f1642b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f1642b = null;
        }
        HandlerThread handlerThread = this.f1641a;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1641a = null;
        }
    }

    public final void b() {
        this.f1643c.c();
        this.f1643c.a();
        this.f1643c = null;
        this.f1644d = null;
    }

    public final void c() {
        this.f1643c.b();
    }

    public final void d() {
        this.f1643c.b(true);
    }

    public boolean e() {
        HandlerThread handlerThread = this.f1641a;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void f() {
        Handler handler = this.f1642b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.f1642b;
            handler2.sendMessage(handler2.obtainMessage(1005));
            Handler handler3 = this.f1642b;
            handler3.sendMessage(handler3.obtainMessage(1006));
        }
    }

    public void g() {
        Handler handler = this.f1642b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1002));
        }
    }

    public void h() {
        if (this.f1642b == null || !this.f1645e) {
            return;
        }
        this.f1645e = false;
        Handler handler = this.f1642b;
        handler.sendMessage(handler.obtainMessage(1004));
    }

    public void a(long j8) {
        int i8 = (int) (j8 >> 32);
        int i9 = (int) j8;
        if (this.f1642b == null || !this.f1645e) {
            return;
        }
        Handler handler = this.f1642b;
        handler.sendMessage(handler.obtainMessage(1003, i8, i9));
    }

    public final void b(long j8) {
        this.f1643c.b(false);
    }

    public final void a(EncoderParams encoderParams) {
        this.f1643c.a(encoderParams, this.f1644d);
    }

    public final void a(z8 z8Var, p3 p3Var) {
        HandlerThread handlerThread = new HandlerThread("VideoRecorderThread");
        this.f1641a = handlerThread;
        handlerThread.start();
        this.f1642b = new a(this.f1641a.getLooper());
        yd ydVar = new yd();
        this.f1643c = ydVar;
        ydVar.a(p3Var);
        this.f1644d = z8Var;
    }

    public boolean a(EncoderParams encoderParams, z8 z8Var, p3 p3Var) {
        if (e()) {
            h.b(f1640f, "setupRecorder error! As last video recorder thread is alive!");
            return false;
        }
        a(z8Var, p3Var);
        Handler handler = this.f1642b;
        handler.sendMessage(handler.obtainMessage(1001, encoderParams));
        this.f1645e = true;
        return true;
    }
}
