package q;

import T.r;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0316b {

    /* renamed from: d, reason: collision with root package name */
    public final C0315a f3904d;

    /* renamed from: a, reason: collision with root package name */
    public C0320f f3901a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3902b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3903c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3905e = false;

    public C0316b(r rVar) {
        this.f3904d = new C0315a(this, rVar);
    }

    public final void a(C0317c c0317c, int i) {
        this.f3904d.g(c0317c.j(i), 1.0f);
        this.f3904d.g(c0317c.j(i), -1.0f);
    }

    public final void b(C0320f c0320f, C0320f c0320f2, C0320f c0320f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3902b = i;
        }
        if (z2) {
            this.f3904d.g(c0320f, 1.0f);
            this.f3904d.g(c0320f2, -1.0f);
            this.f3904d.g(c0320f3, -1.0f);
        } else {
            this.f3904d.g(c0320f, -1.0f);
            this.f3904d.g(c0320f2, 1.0f);
            this.f3904d.g(c0320f3, 1.0f);
        }
    }

    public final void c(C0320f c0320f, C0320f c0320f2, C0320f c0320f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3902b = i;
        }
        if (z2) {
            this.f3904d.g(c0320f, 1.0f);
            this.f3904d.g(c0320f2, -1.0f);
            this.f3904d.g(c0320f3, 1.0f);
        } else {
            this.f3904d.g(c0320f, -1.0f);
            this.f3904d.g(c0320f2, 1.0f);
            this.f3904d.g(c0320f3, -1.0f);
        }
    }

    public C0320f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3901a == null && this.f3902b == 0.0f && this.f3904d.d() == 0;
    }

    public final C0320f f(boolean[] zArr, C0320f c0320f) {
        int i;
        int d2 = this.f3904d.d();
        C0320f c0320f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d2; i2++) {
            float f3 = this.f3904d.f(i2);
            if (f3 < 0.0f) {
                C0320f e2 = this.f3904d.e(i2);
                if ((zArr == null || !zArr[e2.f3925b]) && e2 != c0320f && (((i = e2.f3933l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0320f2 = e2;
                }
            }
        }
        return c0320f2;
    }

    public final void g(C0320f c0320f) {
        C0320f c0320f2 = this.f3901a;
        if (c0320f2 != null) {
            this.f3904d.g(c0320f2, -1.0f);
            this.f3901a.f3926c = -1;
            this.f3901a = null;
        }
        float h = this.f3904d.h(c0320f, true) * (-1.0f);
        this.f3901a = c0320f;
        if (h == 1.0f) {
            return;
        }
        this.f3902b /= h;
        C0315a c0315a = this.f3904d;
        int i = c0315a.h;
        for (int i2 = 0; i != -1 && i2 < c0315a.f3893a; i2++) {
            float[] fArr = c0315a.f3899g;
            fArr[i] = fArr[i] / h;
            i = c0315a.f3898f[i];
        }
    }

    public final void h(C0317c c0317c, C0320f c0320f, boolean z2) {
        if (c0320f == null || !c0320f.f3929f) {
            return;
        }
        float c2 = this.f3904d.c(c0320f);
        this.f3902b = (c0320f.f3928e * c2) + this.f3902b;
        this.f3904d.h(c0320f, z2);
        if (z2) {
            c0320f.b(this);
        }
        if (this.f3904d.d() == 0) {
            this.f3905e = true;
            c0317c.f3908a = true;
        }
    }

    public void i(C0317c c0317c, C0316b c0316b, boolean z2) {
        C0315a c0315a = this.f3904d;
        c0315a.getClass();
        float c2 = c0315a.c(c0316b.f3901a);
        c0315a.h(c0316b.f3901a, z2);
        C0315a c0315a2 = c0316b.f3904d;
        int d2 = c0315a2.d();
        for (int i = 0; i < d2; i++) {
            C0320f e2 = c0315a2.e(i);
            c0315a.a(e2, c0315a2.c(e2) * c2, z2);
        }
        this.f3902b = (c0316b.f3902b * c2) + this.f3902b;
        if (z2) {
            c0316b.f3901a.b(this);
        }
        if (this.f3901a == null || this.f3904d.d() != 0) {
            return;
        }
        this.f3905e = true;
        c0317c.f3908a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = X0.e.e(this.f3901a == null ? "0" : "" + this.f3901a, " = ");
        if (this.f3902b != 0.0f) {
            e2 = e2 + this.f3902b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d2 = this.f3904d.d();
        for (int i = 0; i < d2; i++) {
            C0320f e3 = this.f3904d.e(i);
            if (e3 != null) {
                float f2 = this.f3904d.f(i);
                if (f2 != 0.0f) {
                    String c0320f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = X0.e.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? X0.e.e(e2, c0320f) : e2 + f2 + " " + c0320f;
                        z2 = true;
                    } else if (f2 > 0.0f) {
                        e2 = X0.e.e(e2, " + ");
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        e2 = X0.e.e(e2, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? X0.e.e(e2, "0.0") : e2;
    }
}
