package a0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: a0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0125A implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0130F f3838a;

    public SurfaceHolderCallbackC0125A(C0130F c0130f) {
        this.f3838a = c0130f;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        Surface surface = new Surface(surfaceTexture);
        C0130F c0130f = this.f3838a;
        c0130f.E(surface);
        c0130f.f3865U = surface;
        c0130f.A(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0130F c0130f = this.f3838a;
        c0130f.E(null);
        c0130f.A(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        this.f3838a.A(i4, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f3838a.A(i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0130F c0130f = this.f3838a;
        if (c0130f.f3867W) {
            c0130f.E(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0130F c0130f = this.f3838a;
        if (c0130f.f3867W) {
            c0130f.E(null);
        }
        c0130f.A(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
