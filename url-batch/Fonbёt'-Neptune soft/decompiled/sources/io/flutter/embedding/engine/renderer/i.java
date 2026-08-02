package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;

/* loaded from: classes.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, io.flutter.view.o {

    /* renamed from: a, reason: collision with root package name */
    public final long f2512a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f2513b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2514c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.view.o f2515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f2516e;

    public i(l lVar, long j2, SurfaceTexture surfaceTexture) {
        this.f2516e = lVar;
        this.f2512a = j2;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f2513b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = i.this;
                if (iVar.f2514c) {
                    return;
                }
                l lVar2 = iVar.f2516e;
                if (lVar2.f2537a.isAttached()) {
                    iVar.f2513b.markDirty();
                    lVar2.f2537a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f2514c) {
                return;
            }
            l lVar = this.f2516e;
            lVar.f2541e.post(new j(this.f2512a, lVar.f2537a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f2512a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i2) {
        io.flutter.view.o oVar = this.f2515d;
        if (oVar != null) {
            oVar.onTrimMemory(i2);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f2514c) {
            return;
        }
        this.f2513b.release();
        l lVar = this.f2516e;
        lVar.f2537a.unregisterTexture(this.f2512a);
        lVar.f(this);
        this.f2514c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(io.flutter.view.o oVar) {
        this.f2515d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f2513b.surfaceTexture();
    }
}
