package u0;

import a.AbstractC0235a;
import a0.AbstractC0236a;
import a0.C0238c;
import a0.C0239d;
import a0.C0240e;
import a0.C0241f;
import android.graphics.Outline;
import android.os.Build;
import b0.C0341j;

/* renamed from: u0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132w0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9536a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f9537b;

    /* renamed from: c, reason: collision with root package name */
    public b0.K f9538c;

    /* renamed from: d, reason: collision with root package name */
    public C0341j f9539d;

    /* renamed from: e, reason: collision with root package name */
    public b0.L f9540e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9541f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9542g;

    /* renamed from: h, reason: collision with root package name */
    public b0.L f9543h;

    /* renamed from: i, reason: collision with root package name */
    public C0240e f9544i;

    /* renamed from: j, reason: collision with root package name */
    public float f9545j;

    /* renamed from: k, reason: collision with root package name */
    public long f9546k;

    /* renamed from: l, reason: collision with root package name */
    public long f9547l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9548m;

    public C1132w0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f9537b = outline;
        this.f9546k = 0L;
        this.f9547l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (a0.AbstractC0236a.b(r5.f4732e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b0.r rVar) {
        d();
        b0.L l3 = this.f9540e;
        if (l3 != null) {
            rVar.i(l3, 1);
            return;
        }
        float f3 = this.f9545j;
        if (f3 <= 0.0f) {
            rVar.r(C0238c.d(this.f9546k), C0238c.e(this.f9546k), C0238c.d(this.f9546k) + C0241f.d(this.f9547l), C0238c.e(this.f9546k) + C0241f.b(this.f9547l), 1);
            return;
        }
        b0.L l4 = this.f9543h;
        C0240e c0240e = this.f9544i;
        if (l4 != null) {
            long j3 = this.f9546k;
            long j4 = this.f9547l;
            if (c0240e != null && O2.l.j0(c0240e)) {
                if (c0240e.f4728a == C0238c.d(j3)) {
                    if (c0240e.f4729b == C0238c.e(j3)) {
                        if (c0240e.f4730c == C0241f.d(j4) + C0238c.d(j3)) {
                            if (c0240e.f4731d == C0241f.b(j4) + C0238c.e(j3)) {
                            }
                        }
                    }
                }
            }
        }
        float d3 = C0238c.d(this.f9546k);
        float e3 = C0238c.e(this.f9546k);
        float d4 = C0241f.d(this.f9547l) + C0238c.d(this.f9546k);
        float b3 = C0241f.b(this.f9547l) + C0238c.e(this.f9546k);
        float f4 = this.f9545j;
        long b4 = AbstractC0235a.b(f4, f4);
        long b5 = AbstractC0235a.b(AbstractC0236a.b(b4), AbstractC0236a.c(b4));
        C0240e c0240e2 = new C0240e(d3, e3, d4, b3, b5, b5, b5, b5);
        if (l4 == null) {
            l4 = b0.M.h();
        } else {
            ((C0341j) l4).e();
        }
        b0.L.a(l4, c0240e2);
        this.f9544i = c0240e2;
        this.f9543h = l4;
        rVar.i(l4, 1);
    }

    public final Outline b() {
        d();
        if (this.f9548m && this.f9536a) {
            return this.f9537b;
        }
        return null;
    }

    public final boolean c(b0.K k3, float f3, boolean z3, float f4, long j3) {
        this.f9537b.setAlpha(f3);
        boolean a3 = f2.j.a(this.f9538c, k3);
        boolean z4 = !a3;
        if (!a3) {
            this.f9538c = k3;
            this.f9541f = true;
        }
        this.f9547l = j3;
        boolean z5 = k3 != null && (z3 || f4 > 0.0f);
        if (this.f9548m != z5) {
            this.f9548m = z5;
            this.f9541f = true;
        }
        return z4;
    }

    public final void d() {
        if (this.f9541f) {
            this.f9546k = 0L;
            this.f9545j = 0.0f;
            this.f9540e = null;
            this.f9541f = false;
            this.f9542g = false;
            b0.K k3 = this.f9538c;
            Outline outline = this.f9537b;
            if (k3 == null || !this.f9548m || C0241f.d(this.f9547l) <= 0.0f || C0241f.b(this.f9547l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f9536a = true;
            if (k3 instanceof b0.I) {
                C0239d c0239d = ((b0.I) k3).f5352a;
                float f3 = c0239d.f4724a;
                float f4 = c0239d.f4725b;
                this.f9546k = l0.c.e(f3, f4);
                this.f9547l = AbstractC0235a.e(c0239d.c(), c0239d.b());
                outline.setRect(Math.round(f3), Math.round(f4), Math.round(c0239d.f4726c), Math.round(c0239d.f4727d));
                return;
            }
            if (!(k3 instanceof b0.J)) {
                if (k3 instanceof b0.H) {
                    e(((b0.H) k3).f5351a);
                    return;
                }
                return;
            }
            C0240e c0240e = ((b0.J) k3).f5353a;
            float b3 = AbstractC0236a.b(c0240e.f4732e);
            float f5 = c0240e.f4728a;
            float f6 = c0240e.f4729b;
            this.f9546k = l0.c.e(f5, f6);
            this.f9547l = AbstractC0235a.e(c0240e.b(), c0240e.a());
            if (O2.l.j0(c0240e)) {
                this.f9537b.setRoundRect(Math.round(f5), Math.round(f6), Math.round(c0240e.f4730c), Math.round(c0240e.f4731d), b3);
                this.f9545j = b3;
                return;
            }
            C0341j c0341j = this.f9539d;
            if (c0341j == null) {
                c0341j = b0.M.h();
                this.f9539d = c0341j;
            }
            c0341j.e();
            b0.L.a(c0341j, c0240e);
            e(c0341j);
        }
    }

    public final void e(b0.L l3) {
        int i3 = Build.VERSION.SDK_INT;
        Outline outline = this.f9537b;
        if (i3 <= 28 && !((C0341j) l3).f5420a.isConvex()) {
            this.f9536a = false;
            outline.setEmpty();
            this.f9542g = true;
        } else {
            if (!(l3 instanceof C0341j)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C0341j) l3).f5420a);
            this.f9542g = !outline.canClip();
        }
        this.f9540e = l3;
    }
}
