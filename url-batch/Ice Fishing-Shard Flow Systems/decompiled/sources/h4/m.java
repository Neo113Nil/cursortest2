package h4;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class m extends TextureView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: d, reason: collision with root package name */
    public boolean f5223d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5224e;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f5225i;

    /* renamed from: l, reason: collision with root package name */
    public Surface f5226l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5227m;

    public m(AbstractActivityC0488c abstractActivityC0488c) {
        super(abstractActivityC0488c, null);
        this.f5223d = false;
        this.f5224e = false;
        this.f5227m = false;
        setSurfaceTextureListener(new l(this));
        this.f5227m = P0.f.y(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        if (this.f5225i == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f5225i;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = this.f5226l;
            if (surface != null) {
                surface.release();
                this.f5226l = null;
            }
        }
        this.f5225i = null;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f5225i == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f5223d) {
            e();
        }
        this.f5224e = false;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f5225i;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f5225i = jVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d() {
        if (this.f5225i == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f5224e = true;
        }
    }

    public final void e() {
        if (this.f5225i == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f5226l;
        if (surface != null) {
            surface.release();
            this.f5226l = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f5226l = surface2;
        io.flutter.embedding.engine.renderer.j jVar = this.f5225i;
        boolean z7 = this.f5224e;
        FlutterJNI flutterJNI = jVar.f5598a;
        if (!z7) {
            jVar.j();
        }
        jVar.f5600c = surface2;
        if (z7) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f5225i;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i5) {
        if (!this.f5227m) {
            super.onMeasure(i2, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i5), View.MeasureSpec.getMode(i5) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f5226l = surface;
    }
}
