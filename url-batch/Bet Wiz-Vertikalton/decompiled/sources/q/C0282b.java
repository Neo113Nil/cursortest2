package q;

import K.C0011l;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0282b {
    public final C0281a d;

    /* renamed from: a, reason: collision with root package name */
    public C0286f f3458a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3459b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3460c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3461e = false;

    public C0282b(C0011l c0011l) {
        this.d = new C0281a(this, c0011l);
    }

    public final void a(C0283c c0283c, int i) {
        this.d.g(c0283c.j(i), 1.0f);
        this.d.g(c0283c.j(i), -1.0f);
    }

    public final void b(C0286f c0286f, C0286f c0286f2, C0286f c0286f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3459b = i;
        }
        if (z2) {
            this.d.g(c0286f, 1.0f);
            this.d.g(c0286f2, -1.0f);
            this.d.g(c0286f3, -1.0f);
        } else {
            this.d.g(c0286f, -1.0f);
            this.d.g(c0286f2, 1.0f);
            this.d.g(c0286f3, 1.0f);
        }
    }

    public final void c(C0286f c0286f, C0286f c0286f2, C0286f c0286f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3459b = i;
        }
        if (z2) {
            this.d.g(c0286f, 1.0f);
            this.d.g(c0286f2, -1.0f);
            this.d.g(c0286f3, 1.0f);
        } else {
            this.d.g(c0286f, -1.0f);
            this.d.g(c0286f2, 1.0f);
            this.d.g(c0286f3, -1.0f);
        }
    }

    public C0286f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3458a == null && this.f3459b == 0.0f && this.d.d() == 0;
    }

    public final C0286f f(boolean[] zArr, C0286f c0286f) {
        int i;
        int d = this.d.d();
        C0286f c0286f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0286f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3480b]) && e2 != c0286f && (((i = e2.f3487l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0286f2 = e2;
                }
            }
        }
        return c0286f2;
    }

    public final void g(C0286f c0286f) {
        C0286f c0286f2 = this.f3458a;
        if (c0286f2 != null) {
            this.d.g(c0286f2, -1.0f);
            this.f3458a.f3481c = -1;
            this.f3458a = null;
        }
        float h = this.d.h(c0286f, true) * (-1.0f);
        this.f3458a = c0286f;
        if (h == 1.0f) {
            return;
        }
        this.f3459b /= h;
        C0281a c0281a = this.d;
        int i = c0281a.h;
        for (int i2 = 0; i != -1 && i2 < c0281a.f3451a; i2++) {
            float[] fArr = c0281a.f3456g;
            fArr[i] = fArr[i] / h;
            i = c0281a.f3455f[i];
        }
    }

    public final void h(C0283c c0283c, C0286f c0286f, boolean z2) {
        if (c0286f == null || !c0286f.f3483f) {
            return;
        }
        float c2 = this.d.c(c0286f);
        this.f3459b = (c0286f.f3482e * c2) + this.f3459b;
        this.d.h(c0286f, z2);
        if (z2) {
            c0286f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3461e = true;
            c0283c.f3464a = true;
        }
    }

    public void i(C0283c c0283c, C0282b c0282b, boolean z2) {
        C0281a c0281a = this.d;
        c0281a.getClass();
        float c2 = c0281a.c(c0282b.f3458a);
        c0281a.h(c0282b.f3458a, z2);
        C0281a c0281a2 = c0282b.d;
        int d = c0281a2.d();
        for (int i = 0; i < d; i++) {
            C0286f e2 = c0281a2.e(i);
            c0281a.a(e2, c0281a2.c(e2) * c2, z2);
        }
        this.f3459b = (c0282b.f3459b * c2) + this.f3459b;
        if (z2) {
            c0282b.f3458a.b(this);
        }
        if (this.f3458a == null || this.d.d() != 0) {
            return;
        }
        this.f3461e = true;
        c0283c.f3464a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = T0.c.e(this.f3458a == null ? "0" : "" + this.f3458a, " = ");
        if (this.f3459b != 0.0f) {
            e2 = e2 + this.f3459b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0286f e3 = this.d.e(i);
            if (e3 != null) {
                float f2 = this.d.f(i);
                if (f2 != 0.0f) {
                    String c0286f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = T0.c.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? T0.c.e(e2, c0286f) : e2 + f2 + " " + c0286f;
                        z2 = true;
                    } else if (f2 > 0.0f) {
                        e2 = T0.c.e(e2, " + ");
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        e2 = T0.c.e(e2, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? T0.c.e(e2, "0.0") : e2;
    }
}
