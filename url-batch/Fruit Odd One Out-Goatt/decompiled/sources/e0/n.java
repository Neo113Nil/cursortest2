package e0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class n implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f187a;

    public n(o oVar) {
        this.f187a = oVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        o oVar = this.f187a;
        oVar.f189a = true;
        if (oVar.f191c == null || oVar.f190b) {
            return;
        }
        oVar.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        o oVar = this.f187a;
        oVar.f189a = false;
        io.flutter.embedding.engine.renderer.h hVar = oVar.f191c;
        if (hVar != null && !oVar.f190b) {
            if (hVar == null) {
                f0.l.b("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                return false;
            }
            hVar.e();
            Surface surface = oVar.f192d;
            if (surface != null) {
                surface.release();
                oVar.f192d = null;
            }
        }
        Surface surface2 = oVar.f192d;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        oVar.f192d = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        o oVar = this.f187a;
        io.flutter.embedding.engine.renderer.h hVar = oVar.f191c;
        if (hVar == null || oVar.f190b) {
            return;
        }
        if (hVar != null) {
            hVar.f422a.onSurfaceChanged(i2, i3);
        } else {
            f0.l.b("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
