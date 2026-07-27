package w2;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class j extends TextureView implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12159a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12160b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f12161c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f12162d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12163e;

    public j(AbstractActivityC1515c abstractActivityC1515c) {
        super(abstractActivityC1515c, null);
        this.f12159a = false;
        this.f12160b = false;
        this.f12163e = false;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1521i(this));
        this.f12163e = e5.g.q(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
        if (this.f12161c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f12160b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        if (this.f12161c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.i iVar = this.f12161c;
            if (iVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            iVar.e();
            Surface surface = this.f12162d;
            if (surface != null) {
                surface.release();
                this.f12162d = null;
            }
        }
        this.f12161c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void c() {
        if (this.f12161c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f12159a) {
            e();
        }
        this.f12160b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void d(io.flutter.embedding.engine.renderer.i iVar) {
        io.flutter.embedding.engine.renderer.i iVar2 = this.f12161c;
        if (iVar2 != null) {
            iVar2.e();
        }
        this.f12161c = iVar;
        c();
    }

    public final void e() {
        if (this.f12161c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f12162d;
        if (surface != null) {
            surface.release();
            this.f12162d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f12162d = surface2;
        io.flutter.embedding.engine.renderer.i iVar = this.f12161c;
        boolean z = this.f12160b;
        if (!z) {
            iVar.e();
        }
        iVar.f10147b = surface2;
        FlutterJNI flutterJNI = iVar.f10146a;
        if (z) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public io.flutter.embedding.engine.renderer.i getAttachedRenderer() {
        return this.f12161c;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f12163e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f12162d = surface;
    }
}
