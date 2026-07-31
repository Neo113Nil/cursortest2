package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bb4 {

    /* renamed from: a, reason: collision with root package name */
    private final pa4 f3317a = new pa4();

    /* renamed from: b, reason: collision with root package name */
    private final wa4 f3318b;

    /* renamed from: c, reason: collision with root package name */
    private final ab4 f3319c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3320d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f3321e;

    /* renamed from: f, reason: collision with root package name */
    private float f3322f;

    /* renamed from: g, reason: collision with root package name */
    private float f3323g;

    /* renamed from: h, reason: collision with root package name */
    private float f3324h;

    /* renamed from: i, reason: collision with root package name */
    private float f3325i;

    /* renamed from: j, reason: collision with root package name */
    private int f3326j;

    /* renamed from: k, reason: collision with root package name */
    private long f3327k;

    /* renamed from: l, reason: collision with root package name */
    private long f3328l;

    /* renamed from: m, reason: collision with root package name */
    private long f3329m;

    /* renamed from: n, reason: collision with root package name */
    private long f3330n;

    /* renamed from: o, reason: collision with root package name */
    private long f3331o;

    /* renamed from: p, reason: collision with root package name */
    private long f3332p;

    /* renamed from: q, reason: collision with root package name */
    private long f3333q;

    public bb4(Context context) {
        wa4 wa4Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            wa4Var = n13.f8865a >= 17 ? za4.b(applicationContext) : null;
            if (wa4Var == null) {
                wa4Var = ya4.b(applicationContext);
            }
        } else {
            wa4Var = null;
        }
        this.f3318b = wa4Var;
        this.f3319c = wa4Var != null ? ab4.a() : null;
        this.f3327k = -9223372036854775807L;
        this.f3328l = -9223372036854775807L;
        this.f3322f = -1.0f;
        this.f3325i = 1.0f;
        this.f3326j = 0;
    }

    public static /* synthetic */ void b(bb4 bb4Var, Display display) {
        long j7;
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j8 = (long) (1.0E9d / refreshRate);
            bb4Var.f3327k = j8;
            j7 = (j8 * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j7 = -9223372036854775807L;
            bb4Var.f3327k = -9223372036854775807L;
        }
        bb4Var.f3328l = j7;
    }

    private final void m() {
        Surface surface;
        if (n13.f8865a < 30 || (surface = this.f3321e) == null || this.f3326j == Integer.MIN_VALUE || this.f3324h == 0.0f) {
            return;
        }
        this.f3324h = 0.0f;
        va4.a(surface, 0.0f);
    }

    private final void n() {
        this.f3329m = 0L;
        this.f3332p = -1L;
        this.f3330n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (java.lang.Math.abs(r0 - r9.f3323g) >= r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r9.f3317a.b() >= 30) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void o() {
        if (n13.f8865a < 30 || this.f3321e == null) {
            return;
        }
        float a7 = this.f3317a.g() ? this.f3317a.a() : this.f3322f;
        float f7 = this.f3323g;
        if (a7 == f7) {
            return;
        }
        boolean z6 = true;
        if (a7 != -1.0f && f7 != -1.0f) {
            float f8 = 1.0f;
            if (this.f3317a.g() && this.f3317a.d() >= 5000000000L) {
                f8 = 0.02f;
            }
        } else if (a7 == -1.0f) {
        }
        this.f3323g = a7;
        p(false);
    }

    private final void p(boolean z6) {
        Surface surface;
        if (n13.f8865a < 30 || (surface = this.f3321e) == null || this.f3326j == Integer.MIN_VALUE) {
            return;
        }
        float f7 = 0.0f;
        if (this.f3320d) {
            float f8 = this.f3323g;
            if (f8 != -1.0f) {
                f7 = this.f3325i * f8;
            }
        }
        if (z6 || this.f3324h != f7) {
            this.f3324h = f7;
            va4.a(surface, f7);
        }
    }

    public final long a(long j7) {
        long j8;
        if (this.f3332p != -1 && this.f3317a.g()) {
            long c7 = this.f3333q + ((long) ((this.f3317a.c() * (this.f3329m - this.f3332p)) / this.f3325i));
            if (Math.abs(j7 - c7) <= 20000000) {
                j7 = c7;
            } else {
                n();
            }
        }
        this.f3330n = this.f3329m;
        this.f3331o = j7;
        ab4 ab4Var = this.f3319c;
        if (ab4Var == null || this.f3327k == -9223372036854775807L) {
            return j7;
        }
        long j9 = ab4Var.f2718f;
        if (j9 == -9223372036854775807L) {
            return j7;
        }
        long j10 = this.f3327k;
        long j11 = j9 + (((j7 - j9) / j10) * j10);
        if (j7 <= j11) {
            j8 = j11 - j10;
        } else {
            j11 = j10 + j11;
            j8 = j11;
        }
        if (j11 - j7 >= j7 - j8) {
            j11 = j8;
        }
        return j11 - this.f3328l;
    }

    public final void c() {
        wa4 wa4Var = this.f3318b;
        if (wa4Var != null) {
            wa4Var.zza();
            ab4 ab4Var = this.f3319c;
            Objects.requireNonNull(ab4Var);
            ab4Var.c();
        }
    }

    public final void d() {
        if (this.f3318b != null) {
            ab4 ab4Var = this.f3319c;
            Objects.requireNonNull(ab4Var);
            ab4Var.b();
            this.f3318b.a(new ua4(this));
        }
    }

    public final void e(float f7) {
        this.f3322f = f7;
        this.f3317a.f();
        o();
    }

    public final void f(long j7) {
        long j8 = this.f3330n;
        if (j8 != -1) {
            this.f3332p = j8;
            this.f3333q = this.f3331o;
        }
        this.f3329m++;
        this.f3317a.e(j7 * 1000);
        o();
    }

    public final void g(float f7) {
        this.f3325i = f7;
        n();
        p(false);
    }

    public final void h() {
        n();
    }

    public final void i() {
        this.f3320d = true;
        n();
        p(false);
    }

    public final void j() {
        this.f3320d = false;
        m();
    }

    public final void k(Surface surface) {
        if (true == (surface instanceof na4)) {
            surface = null;
        }
        if (this.f3321e == surface) {
            return;
        }
        m();
        this.f3321e = surface;
        p(true);
    }

    public final void l(int i7) {
        if (this.f3326j == i7) {
            return;
        }
        this.f3326j = i7;
        p(true);
    }
}
