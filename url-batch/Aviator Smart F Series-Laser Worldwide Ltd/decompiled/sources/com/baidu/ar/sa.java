package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.recg.RecognitionResult;

/* loaded from: classes.dex */
public class sa {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3204e = "sa";

    /* renamed from: f, reason: collision with root package name */
    public static volatile sa f3205f;

    /* renamed from: a, reason: collision with root package name */
    public j7 f3206a = j7.a();

    /* renamed from: b, reason: collision with root package name */
    public ra f3207b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f3208c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f3209d;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    sa.this.a((xa) message.obj);
                    break;
                case 1002:
                    sa.this.a((ua) message.obj);
                    break;
                case 1003:
                    sa.this.b();
                    break;
            }
            super.handleMessage(message);
        }
    }

    public static synchronized sa a() {
        sa saVar;
        synchronized (sa.class) {
            try {
                if (f3205f == null) {
                    f3205f = new sa();
                }
                saVar = f3205f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return saVar;
    }

    public static void d() {
        f3205f = null;
    }

    public final void b() {
        j7 j7Var = this.f3206a;
        boolean b8 = j7Var != null ? j7Var.b() : false;
        h.a(f3204e, "handleRelease result = " + b8);
        ra raVar = this.f3207b;
        if (raVar != null) {
            raVar.onRelease(b8);
            this.f3207b = null;
        }
        HandlerThread handlerThread = this.f3208c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3208c = null;
        }
        this.f3209d = null;
        d();
    }

    public void c() {
        Handler handler = this.f3209d;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1003));
        } else {
            h.b(f3204e, "track mRecgHandler is NULLLL!!!");
        }
    }

    public final void e() {
        HandlerThread handlerThread = new HandlerThread(f3204e);
        this.f3208c = handlerThread;
        handlerThread.start();
        this.f3209d = new a(this.f3208c.getLooper());
    }

    public void b(ua uaVar) {
        Handler handler = this.f3209d;
        if (handler == null) {
            h.b(f3204e, "track mRecgHandler is NULLLL!!!");
            return;
        }
        handler.removeMessages(1002);
        Handler handler2 = this.f3209d;
        handler2.sendMessage(handler2.obtainMessage(1002, uaVar));
    }

    public final void a(ua uaVar) {
        wa waVar;
        j7 j7Var = this.f3206a;
        if (j7Var == null || uaVar == null) {
            waVar = null;
        } else {
            RecognitionResult a8 = j7Var.a(uaVar.a(), uaVar.d(), uaVar.b());
            waVar = new wa(uaVar.c());
            waVar.a(a8.fileName);
            waVar.b(a8.errCode == 1);
            waVar.a(a8.errCode == 1);
            waVar.a(a8.time);
            waVar.b(uaVar.c());
        }
        ra raVar = this.f3207b;
        if (raVar == null || waVar == null) {
            return;
        }
        raVar.a(waVar);
    }

    public final void a(xa xaVar) {
        boolean a8 = this.f3206a.a(xaVar.a());
        h.a(f3204e, "handleSetup result = " + a8);
        ra raVar = this.f3207b;
        if (raVar != null) {
            raVar.onSetup(a8);
        }
    }

    public void a(xa xaVar, ra raVar) {
        if (xaVar == null) {
            h.b(f3204e, "setup RecgParams is NULLLL!!!");
            return;
        }
        this.f3207b = raVar;
        e();
        Handler handler = this.f3209d;
        handler.sendMessage(handler.obtainMessage(1001, xaVar));
    }
}
