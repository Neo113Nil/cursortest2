package s;

import A1.j;
import java.util.ArrayList;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0264b {
    public final C0263a d;

    /* renamed from: a, reason: collision with root package name */
    public C0268f f3574a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3575b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3576c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3577e = false;

    public C0264b(j jVar) {
        this.d = new C0263a(this, jVar);
    }

    public final void a(C0265c c0265c, int i) {
        this.d.g(c0265c.j(i), 1.0f);
        this.d.g(c0265c.j(i), -1.0f);
    }

    public final void b(C0268f c0268f, C0268f c0268f2, C0268f c0268f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3575b = i;
        }
        if (z2) {
            this.d.g(c0268f, 1.0f);
            this.d.g(c0268f2, -1.0f);
            this.d.g(c0268f3, -1.0f);
        } else {
            this.d.g(c0268f, -1.0f);
            this.d.g(c0268f2, 1.0f);
            this.d.g(c0268f3, 1.0f);
        }
    }

    public final void c(C0268f c0268f, C0268f c0268f2, C0268f c0268f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3575b = i;
        }
        if (z2) {
            this.d.g(c0268f, 1.0f);
            this.d.g(c0268f2, -1.0f);
            this.d.g(c0268f3, 1.0f);
        } else {
            this.d.g(c0268f, -1.0f);
            this.d.g(c0268f2, 1.0f);
            this.d.g(c0268f3, -1.0f);
        }
    }

    public C0268f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3574a == null && this.f3575b == 0.0f && this.d.d() == 0;
    }

    public final C0268f f(boolean[] zArr, C0268f c0268f) {
        int i;
        int d = this.d.d();
        C0268f c0268f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0268f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3596b]) && e2 != c0268f && (((i = e2.f3603l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0268f2 = e2;
                }
            }
        }
        return c0268f2;
    }

    public final void g(C0268f c0268f) {
        C0268f c0268f2 = this.f3574a;
        if (c0268f2 != null) {
            this.d.g(c0268f2, -1.0f);
            this.f3574a.f3597c = -1;
            this.f3574a = null;
        }
        float h = this.d.h(c0268f, true) * (-1.0f);
        this.f3574a = c0268f;
        if (h == 1.0f) {
            return;
        }
        this.f3575b /= h;
        C0263a c0263a = this.d;
        int i = c0263a.h;
        for (int i2 = 0; i != -1 && i2 < c0263a.f3567a; i2++) {
            float[] fArr = c0263a.f3572g;
            fArr[i] = fArr[i] / h;
            i = c0263a.f3571f[i];
        }
    }

    public final void h(C0265c c0265c, C0268f c0268f, boolean z2) {
        if (c0268f == null || !c0268f.f3599f) {
            return;
        }
        float c2 = this.d.c(c0268f);
        this.f3575b = (c0268f.f3598e * c2) + this.f3575b;
        this.d.h(c0268f, z2);
        if (z2) {
            c0268f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3577e = true;
            c0265c.f3580a = true;
        }
    }

    public void i(C0265c c0265c, C0264b c0264b, boolean z2) {
        C0263a c0263a = this.d;
        c0263a.getClass();
        float c2 = c0263a.c(c0264b.f3574a);
        c0263a.h(c0264b.f3574a, z2);
        C0263a c0263a2 = c0264b.d;
        int d = c0263a2.d();
        for (int i = 0; i < d; i++) {
            C0268f e2 = c0263a2.e(i);
            c0263a.a(e2, c0263a2.c(e2) * c2, z2);
        }
        this.f3575b = (c0264b.f3575b * c2) + this.f3575b;
        if (z2) {
            c0264b.f3574a.b(this);
        }
        if (this.f3574a == null || this.d.d() != 0) {
            return;
        }
        this.f3577e = true;
        c0265c.f3580a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String f2 = X0.a.f(this.f3574a == null ? "0" : "" + this.f3574a, " = ");
        if (this.f3575b != 0.0f) {
            f2 = f2 + this.f3575b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0268f e2 = this.d.e(i);
            if (e2 != null) {
                float f3 = this.d.f(i);
                if (f3 != 0.0f) {
                    String c0268f = e2.toString();
                    if (!z2) {
                        if (f3 < 0.0f) {
                            f2 = X0.a.f(f2, "- ");
                            f3 *= -1.0f;
                        }
                        f2 = f3 == 1.0f ? X0.a.f(f2, c0268f) : f2 + f3 + " " + c0268f;
                        z2 = true;
                    } else if (f3 > 0.0f) {
                        f2 = X0.a.f(f2, " + ");
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        f2 = X0.a.f(f2, " - ");
                        f3 *= -1.0f;
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? X0.a.f(f2, "0.0") : f2;
    }
}
