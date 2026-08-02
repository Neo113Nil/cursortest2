package E1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class m implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f369a;

    public m(n nVar) {
        this.f369a = nVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        n nVar = this.f369a;
        nVar.f370a = true;
        if ((nVar.f372c == null || nVar.f371b) ? false : true) {
            nVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n nVar = this.f369a;
        boolean z = false;
        nVar.f370a = false;
        io.flutter.embedding.engine.renderer.j jVar = nVar.f372c;
        if (jVar != null && !nVar.f371b) {
            z = true;
        }
        if (z) {
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = nVar.f373d;
            if (surface != null) {
                surface.release();
                nVar.f373d = null;
            }
        }
        Surface surface2 = nVar.f373d;
        if (surface2 != null) {
            surface2.release();
            nVar.f373d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        n nVar = this.f369a;
        io.flutter.embedding.engine.renderer.j jVar = nVar.f372c;
        if (jVar == null || nVar.f371b) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar.f9162a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
