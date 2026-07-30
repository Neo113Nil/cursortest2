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
public class zc extends o4 {

    /* renamed from: n, reason: collision with root package name */
    public static final String f3827n = "zc";

    /* renamed from: i, reason: collision with root package name */
    public xc f3828i;

    /* renamed from: j, reason: collision with root package name */
    public HandlerThread f3829j;

    /* renamed from: k, reason: collision with root package name */
    public d f3830k;

    /* renamed from: l, reason: collision with root package name */
    public vc f3831l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f3832m = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zc.this.f3831l.a(zc.this.f3828i);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FramePixels f3834a;

        public b(FramePixels framePixels) {
            this.f3834a = framePixels;
        }

        @Override // java.lang.Runnable
        public void run() {
            zc.this.b(this.f3834a);
        }
    }

    public class c implements ICallbackWith<yc> {
        public c() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(yc ycVar) {
            if (zc.this.f2181b == null || zc.this.f3831l == null) {
                return;
            }
            if (ycVar != null) {
                ycVar.a(zc.this.getName());
            }
            zc.this.f2181b.a(ycVar);
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

    public zc(xc xcVar) {
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.f2878e = pixelReadParams;
        pixelReadParams.setOutputWidth(1280);
        this.f2878e.setOutputHeight(720);
        this.f3828i = xcVar;
    }

    @Override // com.baidu.ar.o4
    public void e() {
        d dVar = this.f3830k;
        if (dVar != null) {
            dVar.a();
            this.f3830k = null;
        }
        vc vcVar = this.f3831l;
        if (vcVar != null) {
            vcVar.a();
            this.f3831l = null;
        }
        HandlerThread handlerThread = this.f3829j;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3829j = null;
        }
    }

    @Override // com.baidu.ar.o4
    public void f() {
        if (this.f3828i != null) {
            h.a(f3827n, "setupFrameDetector modelPath: " + this.f3828i.d());
        }
        this.f3831l = new vc();
        HandlerThread handlerThread = new HandlerThread(f3827n);
        this.f3829j = handlerThread;
        handlerThread.start();
        d dVar = new d(this.f3829j.getLooper());
        this.f3830k = dVar;
        dVar.a(1001, new a());
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return f3827n;
    }

    public final void b(FramePixels framePixels) {
        if (this.f3831l == null || this.f3832m) {
            return;
        }
        this.f3831l.a(framePixels, new c());
    }

    public void c(boolean z7) {
        this.f3832m = z7;
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        if (this.f3831l == null || this.f3832m) {
            return true;
        }
        this.f3830k.a(1002, new b(framePixels));
        return true;
    }
}
