package w2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: w2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC1521i implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12158a;

    public TextureViewSurfaceTextureListenerC1521i(j jVar) {
        this.f12158a = jVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        j jVar = this.f12158a;
        jVar.f12159a = true;
        if ((jVar.f12161c == null || jVar.f12160b) ? false : true) {
            jVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        j jVar = this.f12158a;
        boolean z = false;
        jVar.f12159a = false;
        io.flutter.embedding.engine.renderer.i iVar = jVar.f12161c;
        if (iVar != null && !jVar.f12160b) {
            z = true;
        }
        if (z) {
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
            Surface surface = jVar.f12162d;
            if (surface != null) {
                surface.release();
                jVar.f12162d = null;
            }
        }
        Surface surface2 = jVar.f12162d;
        if (surface2 != null) {
            surface2.release();
            jVar.f12162d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        j jVar = this.f12158a;
        io.flutter.embedding.engine.renderer.i iVar = jVar.f12161c;
        if (iVar == null || jVar.f12160b) {
            return;
        }
        if (iVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        iVar.f10146a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
