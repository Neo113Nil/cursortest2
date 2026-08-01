package q;

import K.C0012m;
import X.V;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0314b {
    public final C0313a d;

    /* renamed from: a, reason: collision with root package name */
    public C0318f f3406a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3407b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3408c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3409e = false;

    public C0314b(C0012m c0012m) {
        this.d = new C0313a(this, c0012m);
    }

    public final void a(C0315c c0315c, int i) {
        this.d.g(c0315c.j(i), 1.0f);
        this.d.g(c0315c.j(i), -1.0f);
    }

    public final void b(C0318f c0318f, C0318f c0318f2, C0318f c0318f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3407b = i;
        }
        if (z2) {
            this.d.g(c0318f, 1.0f);
            this.d.g(c0318f2, -1.0f);
            this.d.g(c0318f3, -1.0f);
        } else {
            this.d.g(c0318f, -1.0f);
            this.d.g(c0318f2, 1.0f);
            this.d.g(c0318f3, 1.0f);
        }
    }

    public final void c(C0318f c0318f, C0318f c0318f2, C0318f c0318f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3407b = i;
        }
        if (z2) {
            this.d.g(c0318f, 1.0f);
            this.d.g(c0318f2, -1.0f);
            this.d.g(c0318f3, 1.0f);
        } else {
            this.d.g(c0318f, -1.0f);
            this.d.g(c0318f2, 1.0f);
            this.d.g(c0318f3, -1.0f);
        }
    }

    public C0318f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3406a == null && this.f3407b == 0.0f && this.d.d() == 0;
    }

    public final C0318f f(boolean[] zArr, C0318f c0318f) {
        int i;
        int d = this.d.d();
        C0318f c0318f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0318f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3427b]) && e2 != c0318f && (((i = e2.f3434l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0318f2 = e2;
                }
            }
        }
        return c0318f2;
    }

    public final void g(C0318f c0318f) {
        C0318f c0318f2 = this.f3406a;
        if (c0318f2 != null) {
            this.d.g(c0318f2, -1.0f);
            this.f3406a.f3428c = -1;
            this.f3406a = null;
        }
        float h = this.d.h(c0318f, true) * (-1.0f);
        this.f3406a = c0318f;
        if (h == 1.0f) {
            return;
        }
        this.f3407b /= h;
        C0313a c0313a = this.d;
        int i = c0313a.h;
        for (int i2 = 0; i != -1 && i2 < c0313a.f3399a; i2++) {
            float[] fArr = c0313a.f3404g;
            fArr[i] = fArr[i] / h;
            i = c0313a.f3403f[i];
        }
    }

    public final void h(C0315c c0315c, C0318f c0318f, boolean z2) {
        if (c0318f == null || !c0318f.f3430f) {
            return;
        }
        float c2 = this.d.c(c0318f);
        this.f3407b = (c0318f.f3429e * c2) + this.f3407b;
        this.d.h(c0318f, z2);
        if (z2) {
            c0318f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3409e = true;
            c0315c.f3412a = true;
        }
    }

    public void i(C0315c c0315c, C0314b c0314b, boolean z2) {
        C0313a c0313a = this.d;
        c0313a.getClass();
        float c2 = c0313a.c(c0314b.f3406a);
        c0313a.h(c0314b.f3406a, z2);
        C0313a c0313a2 = c0314b.d;
        int d = c0313a2.d();
        for (int i = 0; i < d; i++) {
            C0318f e2 = c0313a2.e(i);
            c0313a.a(e2, c0313a2.c(e2) * c2, z2);
        }
        this.f3407b = (c0314b.f3407b * c2) + this.f3407b;
        if (z2) {
            c0314b.f3406a.b(this);
        }
        if (this.f3406a == null || this.d.d() != 0) {
            return;
        }
        this.f3409e = true;
        c0315c.f3412a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = V.e(this.f3406a == null ? "0" : "" + this.f3406a, " = ");
        if (this.f3407b != 0.0f) {
            e2 = e2 + this.f3407b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0318f e3 = this.d.e(i);
            if (e3 != null) {
                float f2 = this.d.f(i);
                if (f2 != 0.0f) {
                    String c0318f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = V.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? V.e(e2, c0318f) : e2 + f2 + " " + c0318f;
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
