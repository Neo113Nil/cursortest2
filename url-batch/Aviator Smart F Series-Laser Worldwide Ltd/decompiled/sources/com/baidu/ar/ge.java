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
public class ge extends o4 {

    /* renamed from: i, reason: collision with root package name */
    public HandlerThread f2340i;

    /* renamed from: j, reason: collision with root package name */
    public c f2341j;

    /* renamed from: k, reason: collision with root package name */
    public f7 f2342k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ge.this.f2342k.a();
        }
    }

    public class b implements ICallbackWith<oe> {
        public b() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(oe oeVar) {
            oeVar.a(ge.this.getName());
            ge.this.f2181b.a(oeVar);
        }
    }

    public static final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public void a(int i8, Runnable runnable) {
            removeMessages(i8);
            Message obtain = Message.obtain();
            obtain.what = i8;
            obtain.obj = runnable;
            sendMessage(obtain);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ge(f7 f7Var) {
        this.f2342k = f7Var;
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.f2878e = pixelReadParams;
        pixelReadParams.setOutputWidth(1280);
        this.f2878e.setOutputHeight(720);
    }

    @Override // com.baidu.ar.o4
    public PixelReadParams b() {
        return super.b();
    }

    @Override // com.baidu.ar.o4
    public void e() {
    }

    @Override // com.baidu.ar.o4
    public void f() {
        HandlerThread handlerThread = new HandlerThread("VpasDetector");
        this.f2340i = handlerThread;
        handlerThread.start();
        c cVar = new c(this.f2340i.getLooper());
        this.f2341j = cVar;
        cVar.a(1001, new a());
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return "VpasDetector";
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        this.f2342k.a(framePixels, new b());
        return false;
    }
}
