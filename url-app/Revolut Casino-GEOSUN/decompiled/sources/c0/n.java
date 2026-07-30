package c0;

import a.AbstractC0069a;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class n extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: e, reason: collision with root package name */
    public boolean f1727e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1728f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f1729g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f1730h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1731i;

    public n(AbstractActivityC0104f abstractActivityC0104f) {
        super(abstractActivityC0104f, null);
        this.f1727e = false;
        this.f1728f = false;
        this.f1731i = false;
        setSurfaceTextureListener(new m(this));
        this.f1731i = AbstractC0069a.s(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f1729g;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f1729g = hVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f1729g == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f1727e) {
            e();
        }
        this.f1728f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f1729g == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f1728f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f1729g == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f1729g;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = this.f1730h;
            if (surface != null) {
                surface.release();
                this.f1730h = null;
            }
        }
        this.f1729g = null;
    }

    public final void e() {
        if (this.f1729g == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f1730h;
        if (surface != null) {
            surface.release();
            this.f1730h = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f1730h = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f1729g;
        boolean z2 = this.f1728f;
        if (!z2) {
            hVar.e();
        }
        hVar.f2386b = surface2;
        FlutterJNI flutterJNI = hVar.f2385a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f1729g;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f1731i) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f1730h = surface;
    }
}
