package D3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: D3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0125m implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0126n f450a;

    public TextureViewSurfaceTextureListenerC0125m(C0126n c0126n) {
        this.f450a = c0126n;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        C0126n c0126n = this.f450a;
        c0126n.f451f = true;
        if (c0126n.f453h == null || c0126n.f452g) {
            return;
        }
        c0126n.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0126n c0126n = this.f450a;
        c0126n.f451f = false;
        io.flutter.embedding.engine.renderer.h hVar = c0126n.f453h;
        if (hVar != null && !c0126n.f452g) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = c0126n.f454i;
            if (surface != null) {
                surface.release();
                c0126n.f454i = null;
            }
        }
        Surface surface2 = c0126n.f454i;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        c0126n.f454i = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        C0126n c0126n = this.f450a;
        io.flutter.embedding.engine.renderer.h hVar = c0126n.f453h;
        if (hVar == null || c0126n.f452g) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f4486a.onSurfaceChanged(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
