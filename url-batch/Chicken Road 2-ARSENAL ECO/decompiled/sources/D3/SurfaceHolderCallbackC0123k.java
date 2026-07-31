package D3;

import android.view.SurfaceHolder;

/* renamed from: D3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0123k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0124l f444a;

    public SurfaceHolderCallbackC0123k(C0124l c0124l) {
        this.f444a = c0124l;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        C0124l c0124l = this.f444a;
        io.flutter.embedding.engine.renderer.h hVar = c0124l.f447h;
        if (hVar == null || c0124l.f446g) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f4486a.onSurfaceChanged(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0124l c0124l = this.f444a;
        c0124l.f445f = true;
        if (c0124l.f447h == null || c0124l.f446g) {
            return;
        }
        c0124l.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0124l c0124l = this.f444a;
        c0124l.f445f = false;
        io.flutter.embedding.engine.renderer.h hVar = c0124l.f447h;
        if (hVar == null || c0124l.f446g) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        hVar.e();
    }
}
