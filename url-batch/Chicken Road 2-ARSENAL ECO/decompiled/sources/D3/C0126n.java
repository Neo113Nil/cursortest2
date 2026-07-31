package D3;

import a.AbstractC0219a;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: D3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126n extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: f, reason: collision with root package name */
    public boolean f451f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f452g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f453h;

    /* renamed from: i, reason: collision with root package name */
    public Surface f454i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f455j;

    public C0126n(AbstractActivityC0117e abstractActivityC0117e) {
        super(abstractActivityC0117e, null);
        this.f451f = false;
        this.f452g = false;
        this.f455j = false;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0125m(this));
        this.f455j = AbstractC0219a.v(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
        if (this.f453h == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f453h;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = this.f454i;
            if (surface != null) {
                surface.release();
                this.f454i = null;
            }
        }
        this.f453h = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f453h == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f451f) {
            e();
        }
        this.f452g = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f453h;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f453h = hVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f453h == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f452g = true;
        }
    }

    public final void e() {
        if (this.f453h == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f454i;
        if (surface != null) {
            surface.release();
            this.f454i = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f454i = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f453h;
        boolean z5 = this.f452g;
        FlutterJNI flutterJNI = hVar.f4486a;
        if (!z5) {
            hVar.e();
        }
        hVar.f4487b = surface2;
        if (z5) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f453h;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        if (!this.f455j) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i7), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i8), View.MeasureSpec.getMode(i8) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f454i = surface;
    }
}
