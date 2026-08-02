package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.q;

/* loaded from: classes.dex */
public final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f9169a;

    /* renamed from: b, reason: collision with root package name */
    public int f9170b;

    /* renamed from: c, reason: collision with root package name */
    public int f9171c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9172d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f9173e;
    public final g f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f9174g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f9175h;

    public n(long j3, Handler handler, FlutterJNI flutterJNI, g gVar) {
        this.f9169a = j3;
        this.f9174g = handler;
        this.f9175h = flutterJNI;
        this.f = gVar;
    }

    public final void finalize() {
        try {
            if (this.f9172d) {
                return;
            }
            release();
            this.f9174g.post(new h(this.f9169a, this.f9175h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f9173e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f9171c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        Surface surface = this.f9173e;
        if (surface == null || !surface.isValid()) {
            this.f9173e = new Surface(this.f.f9134b.surfaceTexture());
        }
        return this.f9173e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f.f9134b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f9170b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f9169a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f.release();
        this.f9173e.release();
        this.f9173e = null;
        this.f9172d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f9175h.markTextureFrameAvailable(this.f9169a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(q qVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i3, int i4) {
        this.f9170b = i3;
        this.f9171c = i4;
        this.f.f9134b.surfaceTexture().setDefaultBufferSize(i3, i4);
    }
}
