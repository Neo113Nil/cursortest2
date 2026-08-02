package m0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class m implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3173a;

    public m(n nVar) {
        this.f3173a = nVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        n nVar = this.f3173a;
        nVar.f3174e = true;
        if ((nVar.f3176g == null || nVar.f3175f) ? false : true) {
            nVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n nVar = this.f3173a;
        boolean z2 = false;
        nVar.f3174e = false;
        io.flutter.embedding.engine.renderer.l lVar = nVar.f3176g;
        if (lVar != null && !nVar.f3175f) {
            z2 = true;
        }
        if (z2) {
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.g();
            Surface surface = nVar.f3177h;
            if (surface != null) {
                surface.release();
                nVar.f3177h = null;
            }
        }
        Surface surface2 = nVar.f3177h;
        if (surface2 != null) {
            surface2.release();
            nVar.f3177h = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        n nVar = this.f3173a;
        io.flutter.embedding.engine.renderer.l lVar = nVar.f3176g;
        if (lVar == null || nVar.f3175f) {
            return;
        }
        if (lVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        lVar.f2537a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
