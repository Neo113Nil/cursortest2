package h4;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class l implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f5222a;

    public l(m mVar) {
        this.f5222a = mVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i5) {
        m mVar = this.f5222a;
        mVar.f5223d = true;
        if (mVar.f5225i == null || mVar.f5224e) {
            return;
        }
        mVar.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m mVar = this.f5222a;
        mVar.f5223d = false;
        io.flutter.embedding.engine.renderer.j jVar = mVar.f5225i;
        if (jVar != null && !mVar.f5224e) {
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = mVar.f5226l;
            if (surface != null) {
                surface.release();
                mVar.f5226l = null;
            }
        }
        Surface surface2 = mVar.f5226l;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        mVar.f5226l = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i5) {
        m mVar = this.f5222a;
        io.flutter.embedding.engine.renderer.j jVar = mVar.f5225i;
        if (jVar == null || mVar.f5224e) {
            return;
        }
        if (jVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        jVar.f5598a.onSurfaceChanged(i2, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
