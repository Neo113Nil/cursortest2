package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes.dex */
public final class y implements i {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.g f9327a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture f9328b;

    /* renamed from: c, reason: collision with root package name */
    public Surface f9329c;

    /* renamed from: d, reason: collision with root package name */
    public int f9330d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9331e = 0;
    public boolean f = false;

    public y(io.flutter.embedding.engine.renderer.g gVar) {
        x xVar = new x(this);
        this.f9327a = gVar;
        this.f9328b = gVar.f9134b.surfaceTexture();
        gVar.f9136d = xVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final void c(int i3, int i4) {
        this.f9330d = i3;
        this.f9331e = i4;
        SurfaceTexture surfaceTexture = this.f9328b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final int getHeight() {
        return this.f9331e;
    }

    @Override // io.flutter.plugin.platform.i
    public final long getId() {
        return this.f9327a.f9133a;
    }

    @Override // io.flutter.plugin.platform.i
    public final Surface getSurface() {
        boolean isReleased;
        Surface surface = this.f9329c;
        if (surface == null || this.f) {
            if (surface != null) {
                surface.release();
                this.f9329c = null;
            }
            this.f9329c = new Surface(this.f9328b);
            this.f = false;
        }
        SurfaceTexture surfaceTexture = this.f9328b;
        if (surfaceTexture != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                return this.f9329c;
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.i
    public final int getWidth() {
        return this.f9330d;
    }

    @Override // io.flutter.plugin.platform.i
    public final void release() {
        this.f9328b = null;
        Surface surface = this.f9329c;
        if (surface != null) {
            surface.release();
            this.f9329c = null;
        }
    }
}
