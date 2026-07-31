package k0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class k implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2703a;

    public k(l lVar) {
        this.f2703a = lVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        l lVar = this.f2703a;
        lVar.f2704e = true;
        if (lVar.f2706g == null || lVar.f2705f) {
            return;
        }
        lVar.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.f2703a;
        lVar.f2704e = false;
        io.flutter.embedding.engine.renderer.i iVar = lVar.f2706g;
        if (iVar != null && !lVar.f2705f) {
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
            Surface surface = lVar.f2707h;
            if (surface != null) {
                surface.release();
                lVar.f2707h = null;
            }
        }
        Surface surface2 = lVar.f2707h;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        lVar.f2707h = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        l lVar = this.f2703a;
        io.flutter.embedding.engine.renderer.i iVar = lVar.f2706g;
        if (iVar == null || lVar.f2705f) {
            return;
        }
        if (iVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        iVar.f2389a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
