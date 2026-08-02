package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;

/* loaded from: classes.dex */
public final class o implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f2545a;

    /* renamed from: b, reason: collision with root package name */
    public int f2546b;

    /* renamed from: c, reason: collision with root package name */
    public int f2547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2548d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f2549e;

    /* renamed from: f, reason: collision with root package name */
    public final i f2550f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f2551g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f2552h;

    public o(long j2, Handler handler, FlutterJNI flutterJNI, i iVar) {
        this.f2545a = j2;
        this.f2551g = handler;
        this.f2552h = flutterJNI;
        this.f2550f = iVar;
    }

    public final void finalize() {
        try {
            if (this.f2548d) {
                return;
            }
            release();
            this.f2551g.post(new j(this.f2545a, this.f2552h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f2547c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f2549e == null) {
            this.f2549e = new Surface(this.f2550f.f2513b.surfaceTexture());
        }
        return this.f2549e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f2550f.f2513b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f2546b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f2545a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f2550f.release();
        this.f2548d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f2552h.markTextureFrameAvailable(this.f2545a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i2, int i3) {
        this.f2546b = i2;
        this.f2547c = i3;
        this.f2550f.f2513b.surfaceTexture().setDefaultBufferSize(i2, i3);
    }
}
