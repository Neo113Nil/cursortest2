package E1;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class n extends TextureView implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f370a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f371b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.j f372c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f373d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f374e;

    public n(AbstractActivityC0029e abstractActivityC0029e) {
        super(abstractActivityC0029e, null);
        this.f370a = false;
        this.f371b = false;
        this.f374e = false;
        setSurfaceTextureListener(new m(this));
        this.f374e = android.support.v4.media.session.a.A(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        if (this.f372c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.j jVar = this.f372c;
            if (jVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            jVar.j();
            Surface surface = this.f373d;
            if (surface != null) {
                surface.release();
                this.f373d = null;
            }
        }
        this.f372c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        if (this.f372c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f371b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void c() {
        if (this.f372c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f370a) {
            e();
        }
        this.f371b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void d(io.flutter.embedding.engine.renderer.j jVar) {
        io.flutter.embedding.engine.renderer.j jVar2 = this.f372c;
        if (jVar2 != null) {
            jVar2.j();
        }
        this.f372c = jVar;
        c();
    }

    public final void e() {
        if (this.f372c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f373d;
        if (surface != null) {
            surface.release();
            this.f373d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f373d = surface2;
        io.flutter.embedding.engine.renderer.j jVar = this.f372c;
        boolean z = this.f371b;
        if (!z) {
            jVar.j();
        }
        jVar.f9164c = surface2;
        FlutterJNI flutterJNI = jVar.f9162a;
        if (z) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public io.flutter.embedding.engine.renderer.j getAttachedRenderer() {
        return this.f372c;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f374e) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f373d = surface;
    }
}
