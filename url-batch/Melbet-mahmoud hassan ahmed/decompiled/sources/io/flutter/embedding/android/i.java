package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public class i extends TextureView implements k5.c {

    /* renamed from: f, reason: collision with root package name */
    private boolean f17110f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17111g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17112h;

    /* renamed from: i, reason: collision with root package name */
    private k5.a f17113i;

    /* renamed from: j, reason: collision with root package name */
    private Surface f17114j;

    /* renamed from: k, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f17115k;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
            z4.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            i.this.f17110f = true;
            if (i.this.f17111g) {
                i.this.k();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            z4.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            i.this.f17110f = false;
            if (i.this.f17111g) {
                i.this.l();
            }
            if (i.this.f17114j == null) {
                return true;
            }
            i.this.f17114j.release();
            i.this.f17114j = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
            z4.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (i.this.f17111g) {
                i.this.j(i7, i8);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17110f = false;
        this.f17111g = false;
        this.f17112h = false;
        this.f17115k = new a();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i7, int i8) {
        if (this.f17113i == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        z4.b.e("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i7 + " x " + i8);
        this.f17113i.w(i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f17113i == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f17114j;
        if (surface != null) {
            surface.release();
            this.f17114j = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f17114j = surface2;
        this.f17113i.u(surface2, this.f17112h);
        this.f17112h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        k5.a aVar = this.f17113i;
        if (aVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        aVar.v();
        Surface surface = this.f17114j;
        if (surface != null) {
            surface.release();
            this.f17114j = null;
        }
    }

    private void m() {
        setSurfaceTextureListener(this.f17115k);
    }

    @Override // k5.c
    public void Z() {
        if (this.f17113i == null) {
            z4.b.f("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f17113i = null;
        this.f17112h = true;
        this.f17111g = false;
    }

    @Override // k5.c
    public void a() {
        if (this.f17113i == null) {
            z4.b.f("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            z4.b.e("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        this.f17113i = null;
        this.f17111g = false;
    }

    @Override // k5.c
    public void b(k5.a aVar) {
        z4.b.e("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f17113i != null) {
            z4.b.e("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f17113i.v();
        }
        this.f17113i = aVar;
        this.f17111g = true;
        if (this.f17110f) {
            z4.b.e("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
    }

    @Override // k5.c
    public k5.a getAttachedRenderer() {
        return this.f17113i;
    }

    public void setRenderSurface(Surface surface) {
        this.f17114j = surface;
    }
}
