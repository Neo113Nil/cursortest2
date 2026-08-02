package m0;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class n extends TextureView implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3174e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3175f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f3176g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f3177h;

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f3176g;
        if (lVar2 != null) {
            lVar2.g();
        }
        this.f3176g = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f3176g == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f3175f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f3176g == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f3176g;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.g();
            Surface surface = this.f3177h;
            if (surface != null) {
                surface.release();
                this.f3177h = null;
            }
        }
        this.f3176g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f3176g == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f3174e) {
            e();
        }
        this.f3175f = false;
    }

    public final void e() {
        if (this.f3176g == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f3177h;
        if (surface != null) {
            surface.release();
            this.f3177h = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f3177h = surface2;
        io.flutter.embedding.engine.renderer.l lVar = this.f3176g;
        boolean z2 = this.f3175f;
        if (!z2) {
            lVar.g();
        }
        lVar.f2539c = surface2;
        FlutterJNI flutterJNI = lVar.f2537a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f3176g;
    }

    public void setRenderSurface(Surface surface) {
        this.f3177h = surface;
    }
}
