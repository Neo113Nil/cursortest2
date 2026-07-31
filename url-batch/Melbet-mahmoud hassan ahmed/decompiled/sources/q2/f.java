package q2;

import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p2.j;

/* loaded from: classes.dex */
public final class f extends GLSurfaceView {

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f20209f;

    /* renamed from: g, reason: collision with root package name */
    private final SensorManager f20210g;

    /* renamed from: h, reason: collision with root package name */
    private final Sensor f20211h;

    /* renamed from: i, reason: collision with root package name */
    private final c f20212i;

    /* renamed from: j, reason: collision with root package name */
    private final Handler f20213j;

    /* renamed from: k, reason: collision with root package name */
    private final d f20214k;

    /* renamed from: l, reason: collision with root package name */
    private SurfaceTexture f20215l;

    /* renamed from: m, reason: collision with root package name */
    private Surface f20216m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20217n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20218o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20219p;

    public interface a {
        void j(Surface surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Surface surface = this.f20216m;
        if (surface != null) {
            Iterator<a> it = this.f20209f.iterator();
            while (it.hasNext()) {
                it.next().j(surface);
            }
        }
        c(this.f20215l, surface);
        this.f20215l = null;
        this.f20216m = null;
    }

    private static void c(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void e() {
        boolean z6 = this.f20217n && this.f20218o;
        Sensor sensor = this.f20211h;
        if (sensor == null || z6 == this.f20219p) {
            return;
        }
        if (z6) {
            this.f20210g.registerListener(this.f20212i, sensor, 0);
        } else {
            this.f20210g.unregisterListener(this.f20212i);
        }
        this.f20219p = z6;
    }

    public void d(a aVar) {
        this.f20209f.remove(aVar);
    }

    public q2.a getCameraMotionListener() {
        return this.f20214k;
    }

    public j getVideoFrameMetadataListener() {
        return this.f20214k;
    }

    public Surface getVideoSurface() {
        return this.f20216m;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20213j.post(new Runnable() { // from class: q2.e
            @Override // java.lang.Runnable
            public final void run() {
                f.this.b();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f20218o = false;
        e();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f20218o = true;
        e();
    }

    public void setDefaultStereoMode(int i7) {
        throw null;
    }

    public void setUseSensorRotation(boolean z6) {
        this.f20217n = z6;
        e();
    }
}
