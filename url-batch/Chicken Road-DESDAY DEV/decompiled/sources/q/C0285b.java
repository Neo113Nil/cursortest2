package q;

import K.C0011l;
import X.V;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0285b {
    public final C0284a d;

    /* renamed from: a, reason: collision with root package name */
    public C0289f f3412a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3413b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3414c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3415e = false;

    public C0285b(C0011l c0011l) {
        this.d = new C0284a(this, c0011l);
    }

    public final void a(C0286c c0286c, int i) {
        this.d.g(c0286c.j(i), 1.0f);
        this.d.g(c0286c.j(i), -1.0f);
    }

    public final void b(C0289f c0289f, C0289f c0289f2, C0289f c0289f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3413b = i;
        }
        if (z2) {
            this.d.g(c0289f, 1.0f);
            this.d.g(c0289f2, -1.0f);
            this.d.g(c0289f3, -1.0f);
        } else {
            this.d.g(c0289f, -1.0f);
            this.d.g(c0289f2, 1.0f);
            this.d.g(c0289f3, 1.0f);
        }
    }

    public final void c(C0289f c0289f, C0289f c0289f2, C0289f c0289f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3413b = i;
        }
        if (z2) {
            this.d.g(c0289f, 1.0f);
            this.d.g(c0289f2, -1.0f);
            this.d.g(c0289f3, 1.0f);
        } else {
            this.d.g(c0289f, -1.0f);
            this.d.g(c0289f2, 1.0f);
            this.d.g(c0289f3, -1.0f);
        }
    }

    public C0289f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3412a == null && this.f3413b == 0.0f && this.d.d() == 0;
    }

    public final C0289f f(boolean[] zArr, C0289f c0289f) {
        int i;
        int d = this.d.d();
        C0289f c0289f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0289f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3434b]) && e2 != c0289f && (((i = e2.f3441l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0289f2 = e2;
                }
            }
        }
        return c0289f2;
    }

    public final void g(C0289f c0289f) {
        C0289f c0289f2 = this.f3412a;
        if (c0289f2 != null) {
            this.d.g(c0289f2, -1.0f);
            this.f3412a.f3435c = -1;
            this.f3412a = null;
        }
        float h = this.d.h(c0289f, true) * (-1.0f);
        this.f3412a = c0289f;
        if (h == 1.0f) {
            return;
        }
        this.f3413b /= h;
        C0284a c0284a = this.d;
        int i = c0284a.h;
        for (int i2 = 0; i != -1 && i2 < c0284a.f3405a; i2++) {
            float[] fArr = c0284a.f3410g;
            fArr[i] = fArr[i] / h;
            i = c0284a.f3409f[i];
        }
    }

    public final void h(C0286c c0286c, C0289f c0289f, boolean z2) {
        if (c0289f == null || !c0289f.f3437f) {
            return;
        }
        float c2 = this.d.c(c0289f);
        this.f3413b = (c0289f.f3436e * c2) + this.f3413b;
        this.d.h(c0289f, z2);
        if (z2) {
            c0289f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3415e = true;
            c0286c.f3418a = true;
        }
    }

    public void i(C0286c c0286c, C0285b c0285b, boolean z2) {
        C0284a c0284a = this.d;
        c0284a.getClass();
        float c2 = c0284a.c(c0285b.f3412a);
        c0284a.h(c0285b.f3412a, z2);
        C0284a c0284a2 = c0285b.d;
        int d = c0284a2.d();
        for (int i = 0; i < d; i++) {
            C0289f e2 = c0284a2.e(i);
            c0284a.a(e2, c0284a2.c(e2) * c2, z2);
        }
        this.f3413b = (c0285b.f3413b * c2) + this.f3413b;
        if (z2) {
            c0285b.f3412a.b(this);
        }
        if (this.f3412a == null || this.d.d() != 0) {
            return;
        }
        this.f3415e = true;
        c0286c.f3418a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = V.e(this.f3412a == null ? "0" : "" + this.f3412a, " = ");
        if (this.f3413b != 0.0f) {
            e2 = e2 + this.f3413b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0289f e3 = this.d.e(i);
            if (e3 != null) {
                float f2 = this.d.f(i);
                if (f2 != 0.0f) {
                    String c0289f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = V.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? V.e(e2, c0289f) : e2 + f2 + " " + c0289f;
                        z2 = true;
                    } else if (f2 > 0.0f) {
                        e2 = V.e(e2, " + ");
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        e2 = V.e(e2, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? V.e(e2, "0.0") : e2;
    }
}
