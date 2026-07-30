package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class C implements j {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f5669d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceTexture f5670e;

    /* renamed from: i, reason: collision with root package name */
    public Surface f5671i;

    /* renamed from: l, reason: collision with root package name */
    public int f5672l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f5673m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5674n = false;

    public C(io.flutter.embedding.engine.renderer.g gVar) {
        B b7 = new B(this);
        this.f5669d = gVar;
        this.f5670e = gVar.f5567b.surfaceTexture();
        gVar.f5569d = b7;
    }

    @Override // io.flutter.plugin.platform.j
    public final void a(int i2, int i5) {
        this.f5672l = i2;
        this.f5673m = i5;
        SurfaceTexture surfaceTexture = this.f5670e;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i2, i5);
        }
    }

    @Override // io.flutter.plugin.platform.j
    public final int getHeight() {
        return this.f5673m;
    }

    @Override // io.flutter.plugin.platform.j
    public final long getId() {
        return this.f5669d.f5566a;
    }

    @Override // io.flutter.plugin.platform.j
    public final Surface getSurface() {
        boolean isReleased;
        Surface surface = this.f5671i;
        if (surface == null || this.f5674n) {
            if (surface != null) {
                surface.release();
                this.f5671i = null;
            }
            this.f5671i = new Surface(this.f5670e);
            this.f5674n = false;
        }
        SurfaceTexture surfaceTexture = this.f5670e;
        if (surfaceTexture != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                return this.f5671i;
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.j
    public final int getWidth() {
        return this.f5672l;
    }

    @Override // io.flutter.plugin.platform.j
    public final void release() {
        this.f5670e = null;
        Surface surface = this.f5671i;
        if (surface != null) {
            surface.release();
            this.f5671i = null;
        }
    }
}
