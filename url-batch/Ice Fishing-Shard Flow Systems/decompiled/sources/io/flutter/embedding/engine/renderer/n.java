package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;

/* loaded from: classes.dex */
public final class n implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f5606a;

    /* renamed from: b, reason: collision with root package name */
    public int f5607b;

    /* renamed from: c, reason: collision with root package name */
    public int f5608c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5609d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f5610e;

    /* renamed from: f, reason: collision with root package name */
    public final g f5611f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f5612g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f5613h;

    public n(long j, Handler handler, FlutterJNI flutterJNI, g gVar) {
        this.f5606a = j;
        this.f5612g = handler;
        this.f5613h = flutterJNI;
        this.f5611f = gVar;
    }

    public final void finalize() {
        try {
            if (this.f5609d) {
                return;
            }
            release();
            this.f5612g.post(new h(this.f5606a, this.f5613h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f5610e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f5608c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        Surface surface = this.f5610e;
        if (surface == null || !surface.isValid()) {
            this.f5610e = new Surface(this.f5611f.f5567b.surfaceTexture());
        }
        return this.f5610e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f5611f.f5567b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f5607b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f5606a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f5611f.release();
        this.f5610e.release();
        this.f5610e = null;
        this.f5609d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f5613h.markTextureFrameAvailable(this.f5606a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i2, int i5) {
        this.f5607b = i2;
        this.f5608c = i5;
        this.f5611f.f5567b.surfaceTexture().setDefaultBufferSize(i2, i5);
    }
}
