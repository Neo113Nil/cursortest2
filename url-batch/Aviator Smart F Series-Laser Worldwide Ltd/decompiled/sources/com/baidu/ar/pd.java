package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelType;
import com.baidu.ar.callback.ICallbackWith;

/* loaded from: classes.dex */
public class pd extends o4 {

    /* renamed from: l, reason: collision with root package name */
    public static final String f2955l = "pd";

    /* renamed from: i, reason: collision with root package name */
    public HandlerThread f2956i;

    /* renamed from: j, reason: collision with root package name */
    public d f2957j;

    /* renamed from: k, reason: collision with root package name */
    public e7 f2958k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pd.this.f2958k.a();
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FramePixels f2960a;

        public b(FramePixels framePixels) {
            this.f2960a = framePixels;
        }

        @Override // java.lang.Runnable
        public void run() {
            pd.this.b(this.f2960a);
        }
    }

    public class c implements ICallbackWith<qd> {
        public c() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(qd qdVar) {
            if (pd.this.f2181b == null || pd.this.f2958k == null) {
                return;
            }
            if (qdVar != null) {
                qdVar.a(pd.this.getName());
            }
            pd.this.f2181b.a(qdVar);
        }
    }

    public static final class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void a() {
            removeMessages(1001);
            removeMessages(1002);
            Thread.currentThread().interrupt();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void a(int i8, Runnable runnable) {
            removeMessages(i8);
            Message obtain = Message.obtain();
            obtain.what = i8;
            obtain.obj = runnable;
            sendMessage(obtain);
        }
    }

    public pd(nd ndVar, e7 e7Var) {
        this.f2958k = e7Var;
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.f2878e = pixelReadParams;
        pixelReadParams.setOutputWidth(1280);
        this.f2878e.setOutputHeight(720);
    }

    @Override // com.baidu.ar.o4
    public void e() {
        d dVar = this.f2957j;
        if (dVar != null) {
            dVar.a();
            this.f2957j = null;
        }
        if (this.f2958k != null) {
            this.f2958k = null;
        }
        HandlerThread handlerThread = this.f2956i;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f2956i = null;
        }
    }

    @Override // com.baidu.ar.o4
    public void f() {
        HandlerThread handlerThread = new HandlerThread(f2955l);
        this.f2956i = handlerThread;
        handlerThread.start();
        d dVar = new d(this.f2956i.getLooper());
        this.f2957j = dVar;
        dVar.a(1001, new a());
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return f2955l;
    }

    public final void b(FramePixels framePixels) {
        e7 e7Var = this.f2958k;
        if (e7Var != null) {
            e7Var.a(framePixels, new c());
        }
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        if (this.f2958k == null) {
            return true;
        }
        this.f2957j.a(1002, new b(framePixels));
        return true;
    }
}
