package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.record.EncoderParams;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f3730f = "y0";

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f3731a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f3732b;

    /* renamed from: c, reason: collision with root package name */
    public t0 f3733c;

    /* renamed from: d, reason: collision with root package name */
    public z8 f3734d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f3735e = false;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public ByteBuffer f3736a;

        /* renamed from: b, reason: collision with root package name */
        public int f3737b;

        /* renamed from: c, reason: collision with root package name */
        public long f3738c;

        public a(y0 y0Var, ByteBuffer byteBuffer, int i8, long j8) {
            this.f3736a = byteBuffer;
            this.f3737b = i8;
            this.f3738c = j8;
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    y0.this.a((EncoderParams) message.obj);
                    break;
                case 1002:
                    y0.this.c();
                    break;
                case 1003:
                    a aVar = (a) message.obj;
                    y0.this.b(aVar.f3736a, aVar.f3737b, aVar.f3738c);
                    break;
                case 1004:
                    y0.this.d();
                    break;
                case 1005:
                    y0.this.b();
                    break;
                case 1006:
                    y0.this.a();
                    break;
            }
        }
    }

    public final void a() {
        Handler handler = this.f3732b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3732b = null;
        }
        HandlerThread handlerThread = this.f3731a;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3731a = null;
        }
    }

    public final void b() {
        this.f3733c.c();
        this.f3733c.a();
        this.f3733c = null;
        this.f3734d = null;
    }

    public final void c() {
        this.f3733c.b();
    }

    public final void d() {
        this.f3733c.a(true, (ByteBuffer) null, 0, 0L);
    }

    public boolean e() {
        HandlerThread handlerThread = this.f3731a;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void f() {
        Handler handler = this.f3732b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.f3732b;
            handler2.sendMessage(handler2.obtainMessage(1005));
            Handler handler3 = this.f3732b;
            handler3.sendMessage(handler3.obtainMessage(1006));
        }
    }

    public void g() {
        Handler handler = this.f3732b;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1002));
        }
    }

    public void h() {
        if (this.f3732b == null || !this.f3735e) {
            return;
        }
        this.f3735e = false;
        Handler handler = this.f3732b;
        handler.sendMessage(handler.obtainMessage(1004));
    }

    public final void a(EncoderParams encoderParams) {
        this.f3733c.a(encoderParams, this.f3734d);
    }

    public final void b(ByteBuffer byteBuffer, int i8, long j8) {
        this.f3733c.a(false, byteBuffer, i8, j8);
    }

    public final void a(z8 z8Var, p3 p3Var) {
        HandlerThread handlerThread = new HandlerThread("AudioRecorderThread");
        this.f3731a = handlerThread;
        handlerThread.start();
        this.f3732b = new b(this.f3731a.getLooper());
        t0 t0Var = new t0();
        this.f3733c = t0Var;
        this.f3734d = z8Var;
        t0Var.a(p3Var);
    }

    public void a(ByteBuffer byteBuffer, int i8, long j8) {
        if (byteBuffer == null || i8 <= 0) {
            return;
        }
        a aVar = new a(this, byteBuffer, i8, j8);
        if (this.f3732b == null || !this.f3735e) {
            return;
        }
        Handler handler = this.f3732b;
        handler.sendMessage(handler.obtainMessage(1003, aVar));
    }

    public boolean a(EncoderParams encoderParams, z8 z8Var, p3 p3Var) {
        if (e()) {
            h.b(f3730f, "setupRecorder error! As last audio recorder thread is alive!");
            return false;
        }
        a(z8Var, p3Var);
        Handler handler = this.f3732b;
        handler.sendMessage(handler.obtainMessage(1001, encoderParams));
        this.f3735e = true;
        return true;
    }
}
