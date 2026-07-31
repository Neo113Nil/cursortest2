package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1281a0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    private static final int f12032r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    final View f12035c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f12036d;

    /* renamed from: g, reason: collision with root package name */
    private int f12039g;

    /* renamed from: h, reason: collision with root package name */
    private int f12040h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12044l;

    /* renamed from: m, reason: collision with root package name */
    boolean f12045m;

    /* renamed from: n, reason: collision with root package name */
    boolean f12046n;

    /* renamed from: o, reason: collision with root package name */
    boolean f12047o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12048p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12049q;

    /* renamed from: a, reason: collision with root package name */
    final C0101a f12033a = new C0101a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f12034b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f12037e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f12038f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private float[] f12041i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f12042j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f12043k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0101a {

        /* renamed from: a, reason: collision with root package name */
        private int f12050a;

        /* renamed from: b, reason: collision with root package name */
        private int f12051b;

        /* renamed from: c, reason: collision with root package name */
        private float f12052c;

        /* renamed from: d, reason: collision with root package name */
        private float f12053d;

        /* renamed from: j, reason: collision with root package name */
        private float f12059j;

        /* renamed from: k, reason: collision with root package name */
        private int f12060k;

        /* renamed from: e, reason: collision with root package name */
        private long f12054e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f12058i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f12055f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f12056g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f12057h = 0;

        C0101a() {
        }

        private float e(long j4) {
            if (j4 < this.f12054e) {
                return 0.0f;
            }
            long j5 = this.f12058i;
            if (j5 < 0 || j4 < j5) {
                return a.e((j4 - r0) / this.f12050a, 0.0f, 1.0f) * 0.5f;
            }
            float f4 = this.f12059j;
            return (1.0f - f4) + (f4 * a.e((j4 - j5) / this.f12060k, 0.0f, 1.0f));
        }

        private float g(float f4) {
            return ((-4.0f) * f4 * f4) + (f4 * 4.0f);
        }

        public void a() {
            if (this.f12055f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g4 = g(e(currentAnimationTimeMillis));
            long j4 = currentAnimationTimeMillis - this.f12055f;
            this.f12055f = currentAnimationTimeMillis;
            float f4 = j4 * g4;
            this.f12056g = (int) (this.f12052c * f4);
            this.f12057h = (int) (f4 * this.f12053d);
        }

        public int b() {
            return this.f12056g;
        }

        public int c() {
            return this.f12057h;
        }

        public int d() {
            float f4 = this.f12052c;
            return (int) (f4 / Math.abs(f4));
        }

        public int f() {
            float f4 = this.f12053d;
            return (int) (f4 / Math.abs(f4));
        }

        public boolean h() {
            return this.f12058i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f12058i + ((long) this.f12060k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f12060k = a.f((int) (currentAnimationTimeMillis - this.f12054e), 0, this.f12051b);
            this.f12059j = e(currentAnimationTimeMillis);
            this.f12058i = currentAnimationTimeMillis;
        }

        public void j(int i4) {
            this.f12051b = i4;
        }

        public void k(int i4) {
            this.f12050a = i4;
        }

        public void l(float f4, float f5) {
            this.f12052c = f4;
            this.f12053d = f5;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f12054e = currentAnimationTimeMillis;
            this.f12058i = -1L;
            this.f12055f = currentAnimationTimeMillis;
            this.f12059j = 0.5f;
            this.f12056g = 0;
            this.f12057h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f12047o) {
                if (aVar.f12045m) {
                    aVar.f12045m = false;
                    aVar.f12033a.m();
                }
                C0101a c0101a = a.this.f12033a;
                if (c0101a.h() || !a.this.u()) {
                    a.this.f12047o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f12046n) {
                    aVar2.f12046n = false;
                    aVar2.c();
                }
                c0101a.a();
                a.this.j(c0101a.b(), c0101a.c());
                AbstractC1281a0.g0(a.this.f12035c, this);
            }
        }
    }

    public a(View view) {
        this.f12035c = view;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = (int) ((1575.0f * f4) + 0.5f);
        o(f5, f5);
        float f6 = (int) ((f4 * 315.0f) + 0.5f);
        p(f6, f6);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f12032r);
        r(500);
        q(500);
    }

    private float d(int i4, float f4, float f5, float f6) {
        float h4 = h(this.f12037e[i4], f5, this.f12038f[i4], f4);
        if (h4 == 0.0f) {
            return 0.0f;
        }
        float f7 = this.f12041i[i4];
        float f8 = this.f12042j[i4];
        float f9 = this.f12043k[i4];
        float f10 = f7 * f6;
        return h4 > 0.0f ? e(h4 * f10, f8, f9) : -e((-h4) * f10, f8, f9);
    }

    static float e(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    static int f(int i4, int i5, int i6) {
        return i4 > i6 ? i6 : i4 < i5 ? i5 : i4;
    }

    private float g(float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        int i4 = this.f12039g;
        if (i4 == 0 || i4 == 1) {
            if (f4 < f5) {
                if (f4 >= 0.0f) {
                    return 1.0f - (f4 / f5);
                }
                if (this.f12047o && i4 == 1) {
                    return 1.0f;
                }
            }
        } else if (i4 == 2 && f4 < 0.0f) {
            return f4 / (-f5);
        }
        return 0.0f;
    }

    private float h(float f4, float f5, float f6, float f7) {
        float interpolation;
        float e4 = e(f4 * f5, 0.0f, f6);
        float g4 = g(f5 - f7, e4) - g(f7, e4);
        if (g4 < 0.0f) {
            interpolation = -this.f12034b.getInterpolation(-g4);
        } else {
            if (g4 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f12034b.getInterpolation(g4);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f12045m) {
            this.f12047o = false;
        } else {
            this.f12033a.i();
        }
    }

    private void v() {
        int i4;
        if (this.f12036d == null) {
            this.f12036d = new b();
        }
        this.f12047o = true;
        this.f12045m = true;
        if (this.f12044l || (i4 = this.f12040h) <= 0) {
            this.f12036d.run();
        } else {
            AbstractC1281a0.h0(this.f12035c, this.f12036d, i4);
        }
        this.f12044l = true;
    }

    public abstract boolean a(int i4);

    public abstract boolean b(int i4);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f12035c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i4, int i5);

    public a k(int i4) {
        this.f12040h = i4;
        return this;
    }

    public a l(int i4) {
        this.f12039g = i4;
        return this;
    }

    public a m(boolean z4) {
        if (this.f12048p && !z4) {
            i();
        }
        this.f12048p = z4;
        return this;
    }

    public a n(float f4, float f5) {
        float[] fArr = this.f12038f;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a o(float f4, float f5) {
        float[] fArr = this.f12043k;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f12048p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            i();
            return !this.f12049q && this.f12047o;
        }
        this.f12046n = true;
        this.f12044l = false;
        this.f12033a.l(d(0, motionEvent.getX(), view.getWidth(), this.f12035c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f12035c.getHeight()));
        if (!this.f12047o && u()) {
            v();
        }
        if (this.f12049q) {
        }
    }

    public a p(float f4, float f5) {
        float[] fArr = this.f12042j;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    public a q(int i4) {
        this.f12033a.j(i4);
        return this;
    }

    public a r(int i4) {
        this.f12033a.k(i4);
        return this;
    }

    public a s(float f4, float f5) {
        float[] fArr = this.f12037e;
        fArr[0] = f4;
        fArr[1] = f5;
        return this;
    }

    public a t(float f4, float f5) {
        float[] fArr = this.f12041i;
        fArr[0] = f4 / 1000.0f;
        fArr[1] = f5 / 1000.0f;
        return this;
    }

    boolean u() {
        C0101a c0101a = this.f12033a;
        int f4 = c0101a.f();
        int d4 = c0101a.d();
        if (f4 == 0 || !b(f4)) {
            return d4 != 0 && a(d4);
        }
        return true;
    }
}
