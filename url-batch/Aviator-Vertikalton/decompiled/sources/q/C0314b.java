package q;

import T.r;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0314b {

    /* renamed from: d, reason: collision with root package name */
    public final C0313a f3900d;

    /* renamed from: a, reason: collision with root package name */
    public C0318f f3897a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3898b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3899c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3901e = false;

    public C0314b(r rVar) {
        this.f3900d = new C0313a(this, rVar);
    }

    public final void a(C0315c c0315c, int i) {
        this.f3900d.g(c0315c.j(i), 1.0f);
        this.f3900d.g(c0315c.j(i), -1.0f);
    }

    public final void b(C0318f c0318f, C0318f c0318f2, C0318f c0318f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3898b = i;
        }
        if (z2) {
            this.f3900d.g(c0318f, 1.0f);
            this.f3900d.g(c0318f2, -1.0f);
            this.f3900d.g(c0318f3, -1.0f);
        } else {
            this.f3900d.g(c0318f, -1.0f);
            this.f3900d.g(c0318f2, 1.0f);
            this.f3900d.g(c0318f3, 1.0f);
        }
    }

    public final void c(C0318f c0318f, C0318f c0318f2, C0318f c0318f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3898b = i;
        }
        if (z2) {
            this.f3900d.g(c0318f, 1.0f);
            this.f3900d.g(c0318f2, -1.0f);
            this.f3900d.g(c0318f3, 1.0f);
        } else {
            this.f3900d.g(c0318f, -1.0f);
            this.f3900d.g(c0318f2, 1.0f);
            this.f3900d.g(c0318f3, -1.0f);
        }
    }

    public C0318f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3897a == null && this.f3898b == 0.0f && this.f3900d.d() == 0;
    }

    public final C0318f f(boolean[] zArr, C0318f c0318f) {
        int i;
        int d2 = this.f3900d.d();
        C0318f c0318f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d2; i2++) {
            float f3 = this.f3900d.f(i2);
            if (f3 < 0.0f) {
                C0318f e2 = this.f3900d.e(i2);
                if ((zArr == null || !zArr[e2.f3921b]) && e2 != c0318f && (((i = e2.f3929l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0318f2 = e2;
                }
            }
        }
        return c0318f2;
    }

    public final void g(C0318f c0318f) {
        C0318f c0318f2 = this.f3897a;
        if (c0318f2 != null) {
            this.f3900d.g(c0318f2, -1.0f);
            this.f3897a.f3922c = -1;
            this.f3897a = null;
        }
        float h = this.f3900d.h(c0318f, true) * (-1.0f);
        this.f3897a = c0318f;
        if (h == 1.0f) {
            return;
        }
        this.f3898b /= h;
        C0313a c0313a = this.f3900d;
        int i = c0313a.h;
        for (int i2 = 0; i != -1 && i2 < c0313a.f3889a; i2++) {
            float[] fArr = c0313a.f3895g;
            fArr[i] = fArr[i] / h;
            i = c0313a.f3894f[i];
        }
    }

    public final void h(C0315c c0315c, C0318f c0318f, boolean z2) {
        if (c0318f == null || !c0318f.f3925f) {
            return;
        }
        float c2 = this.f3900d.c(c0318f);
        this.f3898b = (c0318f.f3924e * c2) + this.f3898b;
        this.f3900d.h(c0318f, z2);
        if (z2) {
            c0318f.b(this);
        }
        if (this.f3900d.d() == 0) {
            this.f3901e = true;
            c0315c.f3904a = true;
        }
    }

    public void i(C0315c c0315c, C0314b c0314b, boolean z2) {
        C0313a c0313a = this.f3900d;
        c0313a.getClass();
        float c2 = c0313a.c(c0314b.f3897a);
        c0313a.h(c0314b.f3897a, z2);
        C0313a c0313a2 = c0314b.f3900d;
        int d2 = c0313a2.d();
        for (int i = 0; i < d2; i++) {
            C0318f e2 = c0313a2.e(i);
            c0313a.a(e2, c0313a2.c(e2) * c2, z2);
        }
        this.f3898b = (c0314b.f3898b * c2) + this.f3898b;
        if (z2) {
            c0314b.f3897a.b(this);
        }
        if (this.f3897a == null || this.f3900d.d() != 0) {
            return;
        }
        this.f3901e = true;
        c0315c.f3904a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String e2 = X0.e.e(this.f3897a == null ? "0" : "" + this.f3897a, " = ");
        if (this.f3898b != 0.0f) {
            e2 = e2 + this.f3898b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d2 = this.f3900d.d();
        for (int i = 0; i < d2; i++) {
            C0318f e3 = this.f3900d.e(i);
            if (e3 != null) {
                float f2 = this.f3900d.f(i);
                if (f2 != 0.0f) {
                    String c0318f = e3.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            e2 = X0.e.e(e2, "- ");
                            f2 *= -1.0f;
                        }
                        e2 = f2 == 1.0f ? X0.e.e(e2, c0318f) : e2 + f2 + " " + c0318f;
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
