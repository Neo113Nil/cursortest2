package com.baidu.ar;

import android.os.Handler;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;

/* loaded from: classes.dex */
public abstract class o4 extends f0 implements PixelReadListener {

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f2877h = true;

    /* renamed from: e, reason: collision with root package name */
    public PixelReadParams f2878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2879f = false;

    /* renamed from: g, reason: collision with root package name */
    public Handler f2880g;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FramePixels f2881a;

        public a(FramePixels framePixels) {
            this.f2881a = framePixels;
        }

        @Override // java.lang.Runnable
        public void run() {
            o4.this.a(this.f2881a);
        }
    }

    public final void a(Handler handler) {
        this.f2880g = handler;
    }

    public abstract boolean a(FramePixels framePixels);

    public PixelReadParams b() {
        return this.f2878e;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return this.f2879f;
    }

    public abstract void e();

    public abstract void f();

    @Override // com.baidu.ar.arplay.core.pixel.PixelReadListener
    public boolean onPixelRead(FramePixels framePixels) {
        if (this.f2879f && !f2877h) {
            return false;
        }
        Handler handler = this.f2880g;
        if (handler != null) {
            handler.post(new a(framePixels));
            return true;
        }
        a(framePixels);
        return true;
    }

    @Override // com.baidu.ar.f0, com.baidu.ar.t5
    public final void release() {
        Handler handler = this.f2880g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f2880g = null;
        }
        e();
        super.release();
    }

    public static void b(boolean z7) {
        f2877h = z7;
    }

    @Override // com.baidu.ar.f0, com.baidu.ar.t5
    public final void a(e3 e3Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("setup callback is ");
        sb.append(e3Var != null);
        h.a("FrameDetector", sb.toString());
        super.a(e3Var);
        f();
    }

    public void a(boolean z7) {
        this.f2879f = z7;
    }
}
