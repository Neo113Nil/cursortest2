package D;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0015p implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0016q f102a;

    public TextureViewSurfaceTextureListenerC0015p(C0016q c0016q) {
        this.f102a = c0016q;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0016q c0016q = this.f102a;
        c0016q.f103a = true;
        if ((c0016q.f105c == null || c0016q.f104b) ? false : true) {
            c0016q.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0016q c0016q = this.f102a;
        boolean z2 = false;
        c0016q.f103a = false;
        io.flutter.embedding.engine.renderer.h hVar = c0016q.f105c;
        if (hVar != null && !c0016q.f104b) {
            z2 = true;
        }
        if (z2) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = c0016q.f106d;
            if (surface != null) {
                surface.release();
                c0016q.f106d = null;
            }
        }
        Surface surface2 = c0016q.f106d;
        if (surface2 != null) {
            surface2.release();
            c0016q.f106d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0016q c0016q = this.f102a;
        io.flutter.embedding.engine.renderer.h hVar = c0016q.f105c;
        if (hVar == null || c0016q.f104b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f570a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
