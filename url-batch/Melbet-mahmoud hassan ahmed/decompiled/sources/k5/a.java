package k5;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.d;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class a implements io.flutter.view.d {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f18235a;

    /* renamed from: c, reason: collision with root package name */
    private Surface f18237c;

    /* renamed from: g, reason: collision with root package name */
    private final k5.b f18241g;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f18236b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private boolean f18238d = false;

    /* renamed from: e, reason: collision with root package name */
    private Handler f18239e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<d.b>> f18240f = new HashSet();

    /* renamed from: k5.a$a, reason: collision with other inner class name */
    class C0086a implements k5.b {
        C0086a() {
        }

        @Override // k5.b
        public void c() {
            a.this.f18238d = false;
        }

        @Override // k5.b
        public void f() {
            a.this.f18238d = true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f18243a;

        /* renamed from: b, reason: collision with root package name */
        public final d f18244b;

        /* renamed from: c, reason: collision with root package name */
        public final c f18245c;

        public b(Rect rect, d dVar) {
            this.f18243a = rect;
            this.f18244b = dVar;
            this.f18245c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f18243a = rect;
            this.f18244b = dVar;
            this.f18245c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* renamed from: f, reason: collision with root package name */
        public final int f18250f;

        c(int i7) {
            this.f18250f = i7;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* renamed from: f, reason: collision with root package name */
        public final int f18256f;

        d(int i7) {
            this.f18256f = i7;
        }
    }

    static final class e implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final long f18257f;

        /* renamed from: g, reason: collision with root package name */
        private final FlutterJNI f18258g;

        e(long j7, FlutterJNI flutterJNI) {
            this.f18257f = j7;
            this.f18258g = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18258g.isAttached()) {
                z4.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f18257f + ").");
                this.f18258g.unregisterTexture(this.f18257f);
            }
        }
    }

    final class f implements d.c, d.b {

        /* renamed from: a, reason: collision with root package name */
        private final long f18259a;

        /* renamed from: b, reason: collision with root package name */
        private final SurfaceTextureWrapper f18260b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f18261c;

        /* renamed from: d, reason: collision with root package name */
        private d.b f18262d;

        /* renamed from: e, reason: collision with root package name */
        private d.a f18263e;

        /* renamed from: f, reason: collision with root package name */
        private final Runnable f18264f;

        /* renamed from: g, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f18265g;

        /* renamed from: k5.a$f$a, reason: collision with other inner class name */
        class RunnableC0087a implements Runnable {
            RunnableC0087a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f18263e != null) {
                    f.this.f18263e.a();
                }
            }
        }

        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (f.this.f18261c || !a.this.f18235a.isAttached()) {
                    return;
                }
                f fVar = f.this;
                a.this.m(fVar.f18259a);
            }
        }

        f(long j7, SurfaceTexture surfaceTexture) {
            RunnableC0087a runnableC0087a = new RunnableC0087a();
            this.f18264f = runnableC0087a;
            this.f18265g = new b();
            this.f18259a = j7;
            this.f18260b = new SurfaceTextureWrapper(surfaceTexture, runnableC0087a);
            if (Build.VERSION.SDK_INT >= 21) {
                d().setOnFrameAvailableListener(this.f18265g, new Handler());
            } else {
                d().setOnFrameAvailableListener(this.f18265g);
            }
        }

        private void i() {
            a.this.r(this);
        }

        @Override // io.flutter.view.d.c
        public void a() {
            if (this.f18261c) {
                return;
            }
            z4.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f18259a + ").");
            this.f18260b.release();
            a.this.y(this.f18259a);
            i();
            this.f18261c = true;
        }

        @Override // io.flutter.view.d.c
        public void b(d.b bVar) {
            this.f18262d = bVar;
        }

        @Override // io.flutter.view.d.c
        public void c(d.a aVar) {
            this.f18263e = aVar;
        }

        @Override // io.flutter.view.d.c
        public SurfaceTexture d() {
            return this.f18260b.surfaceTexture();
        }

        @Override // io.flutter.view.d.c
        public long e() {
            return this.f18259a;
        }

        protected void finalize() {
            try {
                if (this.f18261c) {
                    return;
                }
                a.this.f18239e.post(new e(this.f18259a, a.this.f18235a));
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper j() {
            return this.f18260b;
        }

        @Override // io.flutter.view.d.b
        public void onTrimMemory(int i7) {
            d.b bVar = this.f18262d;
            if (bVar != null) {
                bVar.onTrimMemory(i7);
            }
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public float f18269a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        public int f18270b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f18271c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f18272d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f18273e = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f18274f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f18275g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f18276h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f18277i = 0;

        /* renamed from: j, reason: collision with root package name */
        public int f18278j = 0;

        /* renamed from: k, reason: collision with root package name */
        public int f18279k = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f18280l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f18281m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f18282n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f18283o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f18284p = -1;

        /* renamed from: q, reason: collision with root package name */
        public List<b> f18285q = new ArrayList();

        boolean a() {
            return this.f18270b > 0 && this.f18271c > 0 && this.f18269a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0086a c0086a = new C0086a();
        this.f18241g = c0086a;
        this.f18235a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0086a);
    }

    private void i() {
        Iterator<WeakReference<d.b>> it = this.f18240f.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(long j7) {
        this.f18235a.markTextureFrameAvailable(j7);
    }

    private void p(long j7, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f18235a.registerTexture(j7, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(long j7) {
        this.f18235a.unregisterTexture(j7);
    }

    @Override // io.flutter.view.d
    public d.c a() {
        z4.b.e("FlutterRenderer", "Creating a SurfaceTexture.");
        return o(new SurfaceTexture(0));
    }

    public void g(k5.b bVar) {
        this.f18235a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f18238d) {
            bVar.f();
        }
    }

    void h(d.b bVar) {
        i();
        this.f18240f.add(new WeakReference<>(bVar));
    }

    public void j(ByteBuffer byteBuffer, int i7) {
        this.f18235a.dispatchPointerDataPacket(byteBuffer, i7);
    }

    public boolean k() {
        return this.f18238d;
    }

    public boolean l() {
        return this.f18235a.getIsSoftwareRenderingEnabled();
    }

    public void n(int i7) {
        Iterator<WeakReference<d.b>> it = this.f18240f.iterator();
        while (it.hasNext()) {
            d.b bVar = it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i7);
            } else {
                it.remove();
            }
        }
    }

    public d.c o(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f18236b.getAndIncrement(), surfaceTexture);
        z4.b.e("FlutterRenderer", "New SurfaceTexture ID: " + fVar.e());
        p(fVar.e(), fVar.j());
        h(fVar);
        return fVar;
    }

    public void q(k5.b bVar) {
        this.f18235a.removeIsDisplayingFlutterUiListener(bVar);
    }

    void r(d.b bVar) {
        for (WeakReference<d.b> weakReference : this.f18240f) {
            if (weakReference.get() == bVar) {
                this.f18240f.remove(weakReference);
                return;
            }
        }
    }

    public void s(boolean z6) {
        this.f18235a.setSemanticsEnabled(z6);
    }

    public void t(g gVar) {
        if (gVar.a()) {
            z4.b.e("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f18270b + " x " + gVar.f18271c + "\nPadding - L: " + gVar.f18275g + ", T: " + gVar.f18272d + ", R: " + gVar.f18273e + ", B: " + gVar.f18274f + "\nInsets - L: " + gVar.f18279k + ", T: " + gVar.f18276h + ", R: " + gVar.f18277i + ", B: " + gVar.f18278j + "\nSystem Gesture Insets - L: " + gVar.f18283o + ", T: " + gVar.f18280l + ", R: " + gVar.f18281m + ", B: " + gVar.f18281m + "\nDisplay Features: " + gVar.f18285q.size());
            int[] iArr = new int[gVar.f18285q.size() * 4];
            int[] iArr2 = new int[gVar.f18285q.size()];
            int[] iArr3 = new int[gVar.f18285q.size()];
            for (int i7 = 0; i7 < gVar.f18285q.size(); i7++) {
                b bVar = gVar.f18285q.get(i7);
                int i8 = i7 * 4;
                Rect rect = bVar.f18243a;
                iArr[i8] = rect.left;
                iArr[i8 + 1] = rect.top;
                iArr[i8 + 2] = rect.right;
                iArr[i8 + 3] = rect.bottom;
                iArr2[i7] = bVar.f18244b.f18256f;
                iArr3[i7] = bVar.f18245c.f18250f;
            }
            this.f18235a.setViewportMetrics(gVar.f18269a, gVar.f18270b, gVar.f18271c, gVar.f18272d, gVar.f18273e, gVar.f18274f, gVar.f18275g, gVar.f18276h, gVar.f18277i, gVar.f18278j, gVar.f18279k, gVar.f18280l, gVar.f18281m, gVar.f18282n, gVar.f18283o, gVar.f18284p, iArr, iArr2, iArr3);
        }
    }

    public void u(Surface surface, boolean z6) {
        if (this.f18237c != null && !z6) {
            v();
        }
        this.f18237c = surface;
        this.f18235a.onSurfaceCreated(surface);
    }

    public void v() {
        this.f18235a.onSurfaceDestroyed();
        this.f18237c = null;
        if (this.f18238d) {
            this.f18241g.c();
        }
        this.f18238d = false;
    }

    public void w(int i7, int i8) {
        this.f18235a.onSurfaceChanged(i7, i8);
    }

    public void x(Surface surface) {
        this.f18237c = surface;
        this.f18235a.onSurfaceWindowChanged(surface);
    }
}
