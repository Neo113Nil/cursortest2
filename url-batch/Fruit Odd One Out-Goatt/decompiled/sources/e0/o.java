package e0;

import android.content.Context;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class o extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f189a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f190b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f191c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f192d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f193e;

    public o(Context context) {
        super(context, null);
        this.f189a = false;
        this.f190b = false;
        this.f193e = false;
        setSurfaceTextureListener(new n(this));
        this.f193e = a.a.n(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f191c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f191c = hVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f191c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f190b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void c() {
        if (this.f191c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f191c;
            if (hVar == null) {
                f0.l.b("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                return;
            }
            hVar.e();
            Surface surface = this.f192d;
            if (surface != null) {
                surface.release();
                this.f192d = null;
            }
        }
        this.f191c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void d() {
        if (this.f191c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f189a) {
            e();
        }
        this.f190b = false;
    }

    public final void e() {
        if (this.f191c == null || getSurfaceTexture() == null) {
            f0.l.b("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
            return;
        }
        Surface surface = this.f192d;
        if (surface != null) {
            surface.release();
            this.f192d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f192d = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f191c;
        boolean z2 = this.f190b;
        if (!z2) {
            hVar.e();
        }
        hVar.f423b = surface2;
        FlutterJNI flutterJNI = hVar.f422a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f191c;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!this.f193e) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i2), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i3), View.MeasureSpec.getMode(i3) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.f192d = surface;
    }
}
