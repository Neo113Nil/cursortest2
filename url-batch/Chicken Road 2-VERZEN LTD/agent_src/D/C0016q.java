package D;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: D.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f103a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f104b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f105c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f106d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107e;

    public C0016q(AbstractActivityC0005f abstractActivityC0005f) {
        super(abstractActivityC0005f, null);
        this.f103a = false;
        this.f104b = false;
        this.f107e = false;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0015p(this));
        this.f107e = a.a.p(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f105c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f105c = hVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f105c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f103a) {
            e();
        }
        this.f104b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f105c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f104b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f105c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f105c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = this.f106d;
            if (surface != null) {
                surface.release();
                this.f106d = null;
            }
        }
        this.f105c = null;
    }

    public final void e() {
        if (this.f105c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f106d;
        if (surface != null) {
            surface.release();
            this.f106d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f106d = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f105c;
        boolean z2 = this.f104b;
        if (!z2) {
            hVar.e();
        }
        hVar.f571b = surface2;
        FlutterJNI flutterJNI = hVar.f570a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f105c;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f107e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f106d = surface;
    }
}
