package w0;

import W.AbstractC0108a;
import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* renamed from: w0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486A {

    /* renamed from: a, reason: collision with root package name */
    public final C1498e f15737a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15738b;

    /* renamed from: c, reason: collision with root package name */
    public w f15739c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15740d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f15741e;

    /* renamed from: f, reason: collision with root package name */
    public float f15742f;

    /* renamed from: g, reason: collision with root package name */
    public float f15743g;

    /* renamed from: h, reason: collision with root package name */
    public float f15744h;

    /* renamed from: i, reason: collision with root package name */
    public float f15745i;

    /* renamed from: j, reason: collision with root package name */
    public int f15746j;

    /* renamed from: k, reason: collision with root package name */
    public long f15747k;

    /* renamed from: l, reason: collision with root package name */
    public long f15748l;

    /* renamed from: m, reason: collision with root package name */
    public long f15749m;
    public long n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public long f15750p;

    /* renamed from: q, reason: collision with root package name */
    public long f15751q;

    /* renamed from: r, reason: collision with root package name */
    public long f15752r;

    /* renamed from: s, reason: collision with root package name */
    public long f15753s;

    public C1486A(Context context) {
        this.f15738b = context;
        C1498e c1498e = new C1498e();
        c1498e.f15793a = new C1497d();
        c1498e.f15794b = new C1497d();
        c1498e.f15796d = -9223372036854775807L;
        this.f15737a = c1498e;
        this.f15742f = -1.0f;
        this.f15745i = 1.0f;
        this.f15746j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f15741e) == null || this.f15746j == Integer.MIN_VALUE || this.f15744h == 0.0f || !surface.isValid()) {
            return;
        }
        this.f15744h = 0.0f;
        try {
            this.f15741e.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e4) {
            AbstractC0108a.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
        }
    }

    public final void b() {
        this.f15749m = 0L;
        this.f15751q = -1L;
        this.n = -1L;
        this.f15747k = 0L;
        this.f15748l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f4;
        float f5;
        if (Build.VERSION.SDK_INT < 30 || this.f15741e == null) {
            return;
        }
        C1498e c1498e = this.f15737a;
        if (!c1498e.f15793a.a()) {
            f4 = this.f15742f;
        } else if (c1498e.f15793a.a()) {
            f4 = (float) (1.0E9d / (c1498e.f15793a.f15789e != 0 ? r2.f15790f / r4 : 0L));
        } else {
            f4 = -1.0f;
        }
        float f6 = this.f15743g;
        if (f4 == f6) {
            return;
        }
        if (f4 != -1.0f && f6 != -1.0f) {
            if (c1498e.f15793a.a()) {
                if ((c1498e.f15793a.a() ? c1498e.f15793a.f15790f : -9223372036854775807L) >= 5000000000L) {
                    f5 = 0.1f;
                    if (Math.abs(f4 - this.f15743g) < f5) {
                        return;
                    }
                }
            }
            f5 = 1.0f;
            if (Math.abs(f4 - this.f15743g) < f5) {
            }
        } else if (f4 == -1.0f && c1498e.f15797e < 30) {
            return;
        }
        this.f15743g = f4;
        d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        Surface surface;
        float f4;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f15741e) == null || this.f15746j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        try {
            if (this.f15740d) {
                float f5 = this.f15743g;
                if (f5 != -1.0f) {
                    f4 = f5 * this.f15745i;
                    if (z && this.f15744h == f4) {
                        return;
                    }
                    this.f15744h = f4;
                    this.f15741e.setFrameRate(f4, f4 != 0.0f ? 0 : 1);
                    return;
                }
            }
            this.f15741e.setFrameRate(f4, f4 != 0.0f ? 0 : 1);
            return;
        } catch (IllegalStateException e4) {
            AbstractC0108a.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
            return;
        }
        f4 = 0.0f;
        if (z) {
        }
        this.f15744h = f4;
    }
}
