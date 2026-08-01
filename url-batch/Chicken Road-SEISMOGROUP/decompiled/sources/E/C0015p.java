package E;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: E.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p extends TextureView implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f179a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f180b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f181c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f182d;

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f181c;
        if (hVar2 != null) {
            hVar2.e();
        }
        this.f181c = hVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        if (this.f181c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f179a) {
            e();
        }
        this.f180b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void c() {
        if (this.f181c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f180b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void d() {
        if (this.f181c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f181c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.e();
            Surface surface = this.f182d;
            if (surface != null) {
                surface.release();
                this.f182d = null;
            }
        }
        this.f181c = null;
    }

    public final void e() {
        if (this.f181c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f182d;
        if (surface != null) {
            surface.release();
            this.f182d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f182d = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f181c;
        boolean z = this.f180b;
        if (!z) {
            hVar.e();
        }
        hVar.f624b = surface2;
        FlutterJNI flutterJNI = hVar.f623a;
        if (z) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f181c;
    }

    public void setRenderSurface(Surface surface) {
        this.f182d = surface;
    }
}
