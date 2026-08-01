package E;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: E.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0014o implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0015p f178a;

    public TextureViewSurfaceTextureListenerC0014o(C0015p c0015p) {
        this.f178a = c0015p;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0015p c0015p = this.f178a;
        c0015p.f179a = true;
        if ((c0015p.f181c == null || c0015p.f180b) ? false : true) {
            c0015p.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0015p c0015p = this.f178a;
        boolean z = false;
        c0015p.f179a = false;
        io.flutter.embedding.engine.renderer.h hVar = c0015p.f181c;
        if (hVar != null && !c0015p.f180b) {
            z = true;
        }
        if (z) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = c0015p.f182d;
            if (surface != null) {
                surface.release();
                c0015p.f182d = null;
            }
        }
        Surface surface2 = c0015p.f182d;
        if (surface2 != null) {
            surface2.release();
            c0015p.f182d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        C0015p c0015p = this.f178a;
        io.flutter.embedding.engine.renderer.h hVar = c0015p.f181c;
        if (hVar == null || c0015p.f180b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f623a.onSurfaceChanged(i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
