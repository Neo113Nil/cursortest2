package k0;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.datastore.preferences.protobuf.k0;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class l extends TextureView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2704e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2705f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f2706g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f2707h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2708i;

    public l(AbstractActivityC0187d abstractActivityC0187d) {
        super(abstractActivityC0187d, null);
        this.f2704e = false;
        this.f2705f = false;
        this.f2708i = false;
        setSurfaceTextureListener(new k(this));
        this.f2708i = k0.v(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        if (this.f2706g == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.i iVar = this.f2706g;
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
            Surface surface = this.f2707h;
            if (surface != null) {
                surface.release();
                this.f2707h = null;
            }
        }
        this.f2706g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        if (this.f2706g == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f2704e) {
            e();
        }
        this.f2705f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c(io.flutter.embedding.engine.renderer.i iVar) {
        io.flutter.embedding.engine.renderer.i iVar2 = this.f2706g;
        if (iVar2 != null) {
            iVar2.e();
        }
        this.f2706g = iVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d() {
        if (this.f2706g == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2705f = true;
        }
    }

    public final void e() {
        if (this.f2706g == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f2707h;
        if (surface != null) {
            surface.release();
            this.f2707h = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f2707h = surface2;
        io.flutter.embedding.engine.renderer.i iVar = this.f2706g;
        boolean z2 = this.f2705f;
        FlutterJNI flutterJNI = iVar.f2389a;
        if (!z2) {
            iVar.e();
        }
        iVar.f2390b = surface2;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f2706g;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f2708i) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f2707h = surface;
    }
}
