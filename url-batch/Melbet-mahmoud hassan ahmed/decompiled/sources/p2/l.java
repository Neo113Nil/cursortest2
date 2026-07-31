package p2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import o2.m0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final p2.e f20049a = new p2.e();

    /* renamed from: b, reason: collision with root package name */
    private final b f20050b;

    /* renamed from: c, reason: collision with root package name */
    private final e f20051c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20052d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f20053e;

    /* renamed from: f, reason: collision with root package name */
    private float f20054f;

    /* renamed from: g, reason: collision with root package name */
    private float f20055g;

    /* renamed from: h, reason: collision with root package name */
    private float f20056h;

    /* renamed from: i, reason: collision with root package name */
    private float f20057i;

    /* renamed from: j, reason: collision with root package name */
    private int f20058j;

    /* renamed from: k, reason: collision with root package name */
    private long f20059k;

    /* renamed from: l, reason: collision with root package name */
    private long f20060l;

    /* renamed from: m, reason: collision with root package name */
    private long f20061m;

    /* renamed from: n, reason: collision with root package name */
    private long f20062n;

    /* renamed from: o, reason: collision with root package name */
    private long f20063o;

    /* renamed from: p, reason: collision with root package name */
    private long f20064p;

    /* renamed from: q, reason: collision with root package name */
    private long f20065q;

    private static final class a {
        public static void a(Surface surface, float f7) {
            try {
                surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e7) {
                o2.r.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void b(a aVar);
    }

    private static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f20066a;

        private c(WindowManager windowManager) {
            this.f20066a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // p2.l.b
        public void a() {
        }

        @Override // p2.l.b
        public void b(b.a aVar) {
            aVar.a(this.f20066a.getDefaultDisplay());
        }
    }

    private static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f20067a;

        /* renamed from: b, reason: collision with root package name */
        private b.a f20068b;

        private d(DisplayManager displayManager) {
            this.f20067a = displayManager;
        }

        private Display c() {
            return this.f20067a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // p2.l.b
        public void a() {
            this.f20067a.unregisterDisplayListener(this);
            this.f20068b = null;
        }

        @Override // p2.l.b
        public void b(b.a aVar) {
            this.f20068b = aVar;
            this.f20067a.registerDisplayListener(this, m0.w());
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i7) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i7) {
            b.a aVar = this.f20068b;
            if (aVar == null || i7 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i7) {
        }
    }

    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: k, reason: collision with root package name */
        private static final e f20069k = new e();

        /* renamed from: f, reason: collision with root package name */
        public volatile long f20070f = -9223372036854775807L;

        /* renamed from: g, reason: collision with root package name */
        private final Handler f20071g;

        /* renamed from: h, reason: collision with root package name */
        private final HandlerThread f20072h;

        /* renamed from: i, reason: collision with root package name */
        private Choreographer f20073i;

        /* renamed from: j, reason: collision with root package name */
        private int f20074j;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f20072h = handlerThread;
            handlerThread.start();
            Handler v6 = m0.v(handlerThread.getLooper(), this);
            this.f20071g = v6;
            v6.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f20073i;
            if (choreographer != null) {
                int i7 = this.f20074j + 1;
                this.f20074j = i7;
                if (i7 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f20073i = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                o2.r.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
        }

        public static e d() {
            return f20069k;
        }

        private void f() {
            Choreographer choreographer = this.f20073i;
            if (choreographer != null) {
                int i7 = this.f20074j - 1;
                this.f20074j = i7;
                if (i7 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f20070f = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f20071g.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            this.f20070f = j7;
            ((Choreographer) o2.a.e(this.f20073i)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f20071g.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                c();
                return true;
            }
            if (i7 == 1) {
                b();
                return true;
            }
            if (i7 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public l(Context context) {
        b f7 = f(context);
        this.f20050b = f7;
        this.f20051c = f7 != null ? e.d() : null;
        this.f20059k = -9223372036854775807L;
        this.f20060l = -9223372036854775807L;
        this.f20054f = -1.0f;
        this.f20057i = 1.0f;
        this.f20058j = 0;
    }

    private static boolean c(long j7, long j8) {
        return Math.abs(j7 - j8) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (m0.f19752a < 30 || (surface = this.f20053e) == null || this.f20058j == Integer.MIN_VALUE || this.f20056h == 0.0f) {
            return;
        }
        this.f20056h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j7, long j8, long j9) {
        long j10;
        long j11 = j8 + (((j7 - j8) / j9) * j9);
        if (j7 <= j11) {
            j10 = j11 - j9;
        } else {
            j11 = j9 + j11;
            j10 = j11;
        }
        return j11 - j7 < j7 - j10 ? j11 : j10;
    }

    private static b f(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b d7 = m0.f19752a >= 17 ? d.d(applicationContext) : null;
        return d7 == null ? c.c(applicationContext) : d7;
    }

    private void n() {
        this.f20061m = 0L;
        this.f20064p = -1L;
        this.f20062n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        long j7;
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j8 = (long) (1.0E9d / refreshRate);
            this.f20059k = j8;
            j7 = (j8 * 80) / 100;
        } else {
            o2.r.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j7 = -9223372036854775807L;
            this.f20059k = -9223372036854775807L;
        }
        this.f20060l = j7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (java.lang.Math.abs(r0 - r8.f20055g) >= (r8.f20049a.e() && (r8.f20049a.d() > 5000000000L ? 1 : (r8.f20049a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r8.f20049a.c() >= 30) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q() {
        if (m0.f19752a < 30 || this.f20053e == null) {
            return;
        }
        float b7 = this.f20049a.e() ? this.f20049a.b() : this.f20054f;
        float f7 = this.f20055g;
        if (b7 == f7) {
            return;
        }
        boolean z6 = true;
        if (b7 == -1.0f || f7 == -1.0f) {
            if (b7 == -1.0f) {
            }
            if (z6) {
                this.f20055g = b7;
                r(false);
            }
        }
    }

    private void r(boolean z6) {
        Surface surface;
        if (m0.f19752a < 30 || (surface = this.f20053e) == null || this.f20058j == Integer.MIN_VALUE) {
            return;
        }
        float f7 = 0.0f;
        if (this.f20052d) {
            float f8 = this.f20055g;
            if (f8 != -1.0f) {
                f7 = this.f20057i * f8;
            }
        }
        if (z6 || this.f20056h != f7) {
            this.f20056h = f7;
            a.a(surface, f7);
        }
    }

    public long b(long j7) {
        long j8;
        e eVar;
        if (this.f20064p != -1 && this.f20049a.e()) {
            long a7 = this.f20065q + ((long) ((this.f20049a.a() * (this.f20061m - this.f20064p)) / this.f20057i));
            if (c(j7, a7)) {
                j8 = a7;
                this.f20062n = this.f20061m;
                this.f20063o = j8;
                eVar = this.f20051c;
                if (eVar != null || this.f20059k == -9223372036854775807L) {
                    return j8;
                }
                long j9 = eVar.f20070f;
                return j9 == -9223372036854775807L ? j8 : e(j8, j9, this.f20059k) - this.f20060l;
            }
            n();
        }
        j8 = j7;
        this.f20062n = this.f20061m;
        this.f20063o = j8;
        eVar = this.f20051c;
        if (eVar != null) {
        }
        return j8;
    }

    public void g(float f7) {
        this.f20054f = f7;
        this.f20049a.g();
        q();
    }

    public void h(long j7) {
        long j8 = this.f20062n;
        if (j8 != -1) {
            this.f20064p = j8;
            this.f20065q = this.f20063o;
        }
        this.f20061m++;
        this.f20049a.f(j7 * 1000);
        q();
    }

    public void i(float f7) {
        this.f20057i = f7;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f20052d = true;
        n();
        if (this.f20050b != null) {
            ((e) o2.a.e(this.f20051c)).a();
            this.f20050b.b(new b.a() { // from class: p2.k
                @Override // p2.l.b.a
                public final void a(Display display) {
                    l.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f20052d = false;
        b bVar = this.f20050b;
        if (bVar != null) {
            bVar.a();
            ((e) o2.a.e(this.f20051c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof i) {
            surface = null;
        }
        if (this.f20053e == surface) {
            return;
        }
        d();
        this.f20053e = surface;
        r(true);
    }

    public void o(int i7) {
        if (this.f20058j == i7) {
            return;
        }
        this.f20058j = i7;
        r(true);
    }
}
