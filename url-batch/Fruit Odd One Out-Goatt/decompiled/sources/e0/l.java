package e0;

import android.view.SurfaceHolder;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class l implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f177a;

    public l(m mVar) {
        this.f177a = mVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        m mVar = this.f177a;
        io.flutter.embedding.engine.renderer.h hVar = mVar.f181c;
        if (hVar == null || mVar.f180b) {
            return;
        }
        if (hVar != null) {
            hVar.f422a.onSurfaceChanged(i3, i4);
        } else {
            f0.l.b("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        m mVar = this.f177a;
        mVar.f179a = true;
        if (mVar.f181c == null || mVar.f180b) {
            return;
        }
        mVar.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        m mVar = this.f177a;
        mVar.f179a = false;
        io.flutter.embedding.engine.renderer.h hVar = mVar.f181c;
        if (hVar == null || mVar.f180b) {
            return;
        }
        if (hVar != null) {
            hVar.e();
        } else {
            f0.l.b("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
    }
}
