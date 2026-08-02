package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.o;
import io.flutter.view.p;

/* loaded from: classes.dex */
public final class g implements TextureRegistry$SurfaceTextureEntry, p {

    /* renamed from: a, reason: collision with root package name */
    public final long f9133a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f9134b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9135c;

    /* renamed from: d, reason: collision with root package name */
    public p f9136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f9137e;

    public g(j jVar, long j3, SurfaceTexture surfaceTexture) {
        this.f9137e = jVar;
        this.f9133a = j3;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new b(this, 1));
        this.f9134b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                g gVar = g.this;
                if (gVar.f9135c) {
                    return;
                }
                j jVar2 = gVar.f9137e;
                if (jVar2.f9162a.isAttached()) {
                    gVar.f9134b.markDirty();
                    jVar2.f9162a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f9135c) {
                return;
            }
            j jVar = this.f9137e;
            jVar.f9166e.post(new h(this.f9133a, jVar.f9162a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f9133a;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i3) {
        p pVar = this.f9136d;
        if (pVar != null) {
            pVar.onTrimMemory(i3);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f9135c) {
            return;
        }
        this.f9134b.release();
        j jVar = this.f9137e;
        jVar.f9162a.unregisterTexture(this.f9133a);
        jVar.h(this);
        this.f9135c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(o oVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(p pVar) {
        this.f9136d = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f9134b.surfaceTexture();
    }
}
