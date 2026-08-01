package s;

import G1.AbstractC0001b;
import I0.h;
import java.util.ArrayList;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0377b {

    /* renamed from: d, reason: collision with root package name */
    public final C0376a f4112d;

    /* renamed from: a, reason: collision with root package name */
    public C0381f f4109a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f4110b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4111c = new ArrayList();
    public boolean e = false;

    public C0377b(h hVar) {
        this.f4112d = new C0376a(this, hVar);
    }

    public final void a(C0378c c0378c, int i) {
        this.f4112d.g(c0378c.j(i), 1.0f);
        this.f4112d.g(c0378c.j(i), -1.0f);
    }

    public final void b(C0381f c0381f, C0381f c0381f2, C0381f c0381f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f4110b = i;
        }
        if (z2) {
            this.f4112d.g(c0381f, 1.0f);
            this.f4112d.g(c0381f2, -1.0f);
            this.f4112d.g(c0381f3, -1.0f);
        } else {
            this.f4112d.g(c0381f, -1.0f);
            this.f4112d.g(c0381f2, 1.0f);
            this.f4112d.g(c0381f3, 1.0f);
        }
    }

    public final void c(C0381f c0381f, C0381f c0381f2, C0381f c0381f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f4110b = i;
        }
        if (z2) {
            this.f4112d.g(c0381f, 1.0f);
            this.f4112d.g(c0381f2, -1.0f);
            this.f4112d.g(c0381f3, 1.0f);
        } else {
            this.f4112d.g(c0381f, -1.0f);
            this.f4112d.g(c0381f2, 1.0f);
            this.f4112d.g(c0381f3, -1.0f);
        }
    }

    public C0381f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f4109a == null && this.f4110b == 0.0f && this.f4112d.d() == 0;
    }

    public final C0381f f(boolean[] zArr, C0381f c0381f) {
        int i;
        int d2 = this.f4112d.d();
        C0381f c0381f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d2; i2++) {
            float f3 = this.f4112d.f(i2);
            if (f3 < 0.0f) {
                C0381f e = this.f4112d.e(i2);
                if ((zArr == null || !zArr[e.f4132b]) && e != c0381f && (((i = e.f4139l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0381f2 = e;
                }
            }
        }
        return c0381f2;
    }

    public final void g(C0381f c0381f) {
        C0381f c0381f2 = this.f4109a;
        if (c0381f2 != null) {
            this.f4112d.g(c0381f2, -1.0f);
            this.f4109a.f4133c = -1;
            this.f4109a = null;
        }
        float h2 = this.f4112d.h(c0381f, true) * (-1.0f);
        this.f4109a = c0381f;
        if (h2 == 1.0f) {
            return;
        }
        this.f4110b /= h2;
        C0376a c0376a = this.f4112d;
        int i = c0376a.f4108h;
        for (int i2 = 0; i != -1 && i2 < c0376a.f4102a; i2++) {
            float[] fArr = c0376a.f4107g;
            fArr[i] = fArr[i] / h2;
            i = c0376a.f4106f[i];
        }
    }

    public final void h(C0378c c0378c, C0381f c0381f, boolean z2) {
        if (c0381f == null || !c0381f.f4135f) {
            return;
        }
        float c2 = this.f4112d.c(c0381f);
        this.f4110b = (c0381f.e * c2) + this.f4110b;
        this.f4112d.h(c0381f, z2);
        if (z2) {
            c0381f.b(this);
        }
        if (this.f4112d.d() == 0) {
            this.e = true;
            c0378c.f4115a = true;
        }
    }

    public void i(C0378c c0378c, C0377b c0377b, boolean z2) {
        C0376a c0376a = this.f4112d;
        c0376a.getClass();
        float c2 = c0376a.c(c0377b.f4109a);
        c0376a.h(c0377b.f4109a, z2);
        C0376a c0376a2 = c0377b.f4112d;
        int d2 = c0376a2.d();
        for (int i = 0; i < d2; i++) {
            C0381f e = c0376a2.e(i);
            c0376a.a(e, c0376a2.c(e) * c2, z2);
        }
        this.f4110b = (c0377b.f4110b * c2) + this.f4110b;
        if (z2) {
            c0377b.f4109a.b(this);
        }
        if (this.f4109a == null || this.f4112d.d() != 0) {
            return;
        }
        this.e = true;
        c0378c.f4115a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String f2 = AbstractC0001b.f(this.f4109a == null ? "0" : "" + this.f4109a, " = ");
        if (this.f4110b != 0.0f) {
            f2 = f2 + this.f4110b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d2 = this.f4112d.d();
        for (int i = 0; i < d2; i++) {
            C0381f e = this.f4112d.e(i);
            if (e != null) {
                float f3 = this.f4112d.f(i);
                if (f3 != 0.0f) {
                    String c0381f = e.toString();
                    if (!z2) {
                        if (f3 < 0.0f) {
                            f2 = AbstractC0001b.f(f2, "- ");
                            f3 *= -1.0f;
                        }
                        f2 = f3 == 1.0f ? AbstractC0001b.f(f2, c0381f) : f2 + f3 + " " + c0381f;
                        z2 = true;
                    } else if (f3 > 0.0f) {
                        f2 = AbstractC0001b.f(f2, " + ");
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        f2 = AbstractC0001b.f(f2, " - ");
                        f3 *= -1.0f;
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0001b.f(f2, "0.0") : f2;
    }
}
