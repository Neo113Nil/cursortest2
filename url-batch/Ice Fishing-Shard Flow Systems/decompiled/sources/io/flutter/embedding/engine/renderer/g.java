package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.o;

/* loaded from: classes.dex */
public final class g implements TextureRegistry$SurfaceTextureEntry, o {

    /* renamed from: a, reason: collision with root package name */
    public final long f5566a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f5567b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5568c;

    /* renamed from: d, reason: collision with root package name */
    public o f5569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f5570e;

    public g(j jVar, long j, SurfaceTexture surfaceTexture) {
        this.f5570e = jVar;
        this.f5566a = j;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new b(this, 1));
        this.f5567b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                g gVar = g.this;
                FlutterJNI flutterJNI = gVar.f5570e.f5598a;
                if (gVar.f5568c || !flutterJNI.isAttached()) {
                    return;
                }
                gVar.f5567b.markDirty();
                flutterJNI.scheduleFrame();
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f5568c) {
                return;
            }
            j jVar = this.f5570e;
            jVar.f5602e.post(new h(this.f5566a, jVar.f5598a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f5566a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i2) {
        o oVar = this.f5569d;
        if (oVar != null) {
            oVar.onTrimMemory(i2);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f5568c) {
            return;
        }
        this.f5567b.release();
        long j = this.f5566a;
        j jVar = this.f5570e;
        jVar.f5598a.unregisterTexture(j);
        jVar.h(this);
        this.f5568c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(o oVar) {
        this.f5569d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f5567b.surfaceTexture();
    }
}
