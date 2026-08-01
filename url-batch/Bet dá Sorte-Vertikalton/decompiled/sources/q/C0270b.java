package q;

import K.C0011l;
import X.V;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0270b {
    public final C0269a d;

    /* renamed from: a, reason: collision with root package name */
    public C0274f f3445a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3446b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3447c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3448e = false;

    public C0270b(C0011l c0011l) {
        this.d = new C0269a(this, c0011l);
    }

    public final void a(C0271c c0271c, int i) {
        this.d.g(c0271c.j(i), 1.0f);
        this.d.g(c0271c.j(i), -1.0f);
    }

    public final void b(C0274f c0274f, C0274f c0274f2, C0274f c0274f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3446b = i;
        }
        if (z2) {
            this.d.g(c0274f, 1.0f);
            this.d.g(c0274f2, -1.0f);
            this.d.g(c0274f3, -1.0f);
        } else {
            this.d.g(c0274f, -1.0f);
            this.d.g(c0274f2, 1.0f);
            this.d.g(c0274f3, 1.0f);
        }
    }

    public final void c(C0274f c0274f, C0274f c0274f2, C0274f c0274f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3446b = i;
        }
        if (z2) {
            this.d.g(c0274f, 1.0f);
            this.d.g(c0274f2, -1.0f);
            this.d.g(c0274f3, 1.0f);
        } else {
            this.d.g(c0274f, -1.0f);
            this.d.g(c0274f2, 1.0f);
            this.d.g(c0274f3, -1.0f);
        }
    }

    public C0274f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3445a == null && this.f3446b == 0.0f && this.d.d() == 0;
    }

    public final C0274f f(boolean[] zArr, C0274f c0274f) {
        int i;
        int d = this.d.d();
        C0274f c0274f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < 0.0f) {
                C0274f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3467b]) && e2 != c0274f && (((i = e2.f3474l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0274f2 = e2;
                }
            }
        }
        return c0274f2;
    }

    public final void g(C0274f c0274f) {
        C0274f c0274f2 = this.f3445a;
        if (c0274f2 != null) {
            this.d.g(c0274f2, -1.0f);
            this.f3445a.f3468c = -1;
            this.f3445a = null;
        }
        float h = this.d.h(c0274f, true) * (-1.0f);
        this.f3445a = c0274f;
        if (h == 1.0f) {
            return;
        }
        this.f3446b /= h;
        C0269a c0269a = this.d;
        int i = c0269a.h;
        for (int i2 = 0; i != -1 && i2 < c0269a.f3438a; i2++) {
            float[] fArr = c0269a.f3443g;
            fArr[i] = fArr[i] / h;
            i = c0269a.f3442f[i];
        }
    }

    public final void h(C0271c c0271c, C0274f c0274f, boolean z2) {
        if (c0274f == null || !c0274f.f3470f) {
            return;
        }
        float c2 = this.d.c(c0274f);
        this.f3446b = (c0274f.f3469e * c2) + this.f3446b;
        this.d.h(c0274f, z2);
        if (z2) {
            c0274f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3448e = true;
            c0271c.f3451a = true;
        }
    }

    public void i(C0271c c0271c, C0270b c0270b, boolean z2) {
        C0269a c0269a = this.d;
        c0269a.getClass();
        float c2 = c0269a.c(c0270b.f3445a);
        c0269a.h(c0270b.f3445a, z2);
        C0269a c0269a2 = c0270b.d;
        int d = c0269a2.d();
        for (int i = 0; i < d; i++) {
            C0274f e2 = c0269a2.e(i);
            c0269a.a(e2, c0269a2.c(e2) * c2, z2);
        }
        this.f3446b = (c0270b.f3446b * c2) + this.f3446b;
        if (z2) {
            c0270b.f3445a.b(this);
        }
        if (this.f3445a == null || this.d.d() != 0) {
            return;
        }
        this.f3448e = true;
        c0271c.f3451a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = V.e(this.f3445a == null ? "0" : "" + this.f3445a, " = ");
        if (this.f3446b != 0.0f) {
            e2 = e2 + this.f3446b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0274f e3 = this.d.e(i);
            if (e3 != null) {
                float f2 = this.d.f(i);
                if (f2 != 0.0f) {
                    String c0274f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = V.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? V.e(e2, c0274f) : e2 + f2 + " " + c0274f;
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
