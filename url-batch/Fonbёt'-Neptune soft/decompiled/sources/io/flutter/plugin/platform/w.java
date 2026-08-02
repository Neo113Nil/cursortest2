package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class w implements h {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f2688a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture f2689b;

    /* renamed from: c, reason: collision with root package name */
    public Surface f2690c;

    /* renamed from: d, reason: collision with root package name */
    public int f2691d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2692e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2693f = false;

    public w(io.flutter.embedding.engine.renderer.i iVar) {
        v vVar = new v(this);
        if (Build.VERSION.SDK_INT < 23) {
            throw new UnsupportedOperationException("Platform views cannot be displayed below API level 23You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
        }
        this.f2688a = iVar;
        this.f2689b = iVar.f2513b.surfaceTexture();
        iVar.f2515d = vVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final long a() {
        return this.f2688a.f2512a;
    }

    @Override // io.flutter.plugin.platform.h
    public final void b(int i2, int i3) {
        this.f2691d = i2;
        this.f2692e = i3;
        SurfaceTexture surfaceTexture = this.f2689b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final int getHeight() {
        return this.f2692e;
    }

    @Override // io.flutter.plugin.platform.h
    public final Surface getSurface() {
        boolean isReleased;
        Surface surface = this.f2690c;
        if (surface == null || this.f2693f) {
            if (surface != null) {
                surface.release();
                this.f2690c = null;
            }
            this.f2690c = new Surface(this.f2689b);
            this.f2693f = false;
        }
        SurfaceTexture surfaceTexture = this.f2689b;
        if (surfaceTexture != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                return this.f2690c;
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.h
    public final int getWidth() {
        return this.f2691d;
    }

    @Override // io.flutter.plugin.platform.h
    public final void release() {
        this.f2689b = null;
        Surface surface = this.f2690c;
        if (surface != null) {
            surface.release();
            this.f2690c = null;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final /* synthetic */ void scheduleFrame() {
    }
}
