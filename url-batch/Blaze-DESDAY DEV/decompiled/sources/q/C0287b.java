package q;

import K.C0014l;
import Y.V;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0287b {
    public final C0286a d;

    /* renamed from: a, reason: collision with root package name */
    public C0291f f3354a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3355b = RecyclerView.f1559A0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3356c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3357e = false;

    public C0287b(C0014l c0014l) {
        this.d = new C0286a(this, c0014l);
    }

    public final void a(C0288c c0288c, int i) {
        this.d.g(c0288c.j(i), 1.0f);
        this.d.g(c0288c.j(i), -1.0f);
    }

    public final void b(C0291f c0291f, C0291f c0291f2, C0291f c0291f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3355b = i;
        }
        if (z2) {
            this.d.g(c0291f, 1.0f);
            this.d.g(c0291f2, -1.0f);
            this.d.g(c0291f3, -1.0f);
        } else {
            this.d.g(c0291f, -1.0f);
            this.d.g(c0291f2, 1.0f);
            this.d.g(c0291f3, 1.0f);
        }
    }

    public final void c(C0291f c0291f, C0291f c0291f2, C0291f c0291f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3355b = i;
        }
        if (z2) {
            this.d.g(c0291f, 1.0f);
            this.d.g(c0291f2, -1.0f);
            this.d.g(c0291f3, 1.0f);
        } else {
            this.d.g(c0291f, -1.0f);
            this.d.g(c0291f2, 1.0f);
            this.d.g(c0291f3, -1.0f);
        }
    }

    public C0291f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3354a == null && this.f3355b == RecyclerView.f1559A0 && this.d.d() == 0;
    }

    public final C0291f f(boolean[] zArr, C0291f c0291f) {
        int i;
        int d = this.d.d();
        C0291f c0291f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < RecyclerView.f1559A0) {
                C0291f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3376b]) && e2 != c0291f && (((i = e2.f3383l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0291f2 = e2;
                }
            }
        }
        return c0291f2;
    }

    public final void g(C0291f c0291f) {
        C0291f c0291f2 = this.f3354a;
        if (c0291f2 != null) {
            this.d.g(c0291f2, -1.0f);
            this.f3354a.f3377c = -1;
            this.f3354a = null;
        }
        float h = this.d.h(c0291f, true) * (-1.0f);
        this.f3354a = c0291f;
        if (h == 1.0f) {
            return;
        }
        this.f3355b /= h;
        C0286a c0286a = this.d;
        int i = c0286a.h;
        for (int i2 = 0; i != -1 && i2 < c0286a.f3347a; i2++) {
            float[] fArr = c0286a.f3352g;
            fArr[i] = fArr[i] / h;
            i = c0286a.f3351f[i];
        }
    }

    public final void h(C0288c c0288c, C0291f c0291f, boolean z2) {
        if (c0291f == null || !c0291f.f3379f) {
            return;
        }
        float c2 = this.d.c(c0291f);
        this.f3355b = (c0291f.f3378e * c2) + this.f3355b;
        this.d.h(c0291f, z2);
        if (z2) {
            c0291f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3357e = true;
            c0288c.f3360a = true;
        }
    }

    public void i(C0288c c0288c, C0287b c0287b, boolean z2) {
        C0286a c0286a = this.d;
        c0286a.getClass();
        float c2 = c0286a.c(c0287b.f3354a);
        c0286a.h(c0287b.f3354a, z2);
        C0286a c0286a2 = c0287b.d;
        int d = c0286a2.d();
        for (int i = 0; i < d; i++) {
            C0291f e2 = c0286a2.e(i);
            c0286a.a(e2, c0286a2.c(e2) * c2, z2);
        }
        this.f3355b = (c0287b.f3355b * c2) + this.f3355b;
        if (z2) {
            c0287b.f3354a.b(this);
        }
        if (this.f3354a == null || this.d.d() != 0) {
            return;
        }
        this.f3357e = true;
        c0288c.f3360a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String f2 = V.f(this.f3354a == null ? "0" : "" + this.f3354a, " = ");
        if (this.f3355b != RecyclerView.f1559A0) {
            f2 = f2 + this.f3355b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0291f e2 = this.d.e(i);
            if (e2 != null) {
                float f3 = this.d.f(i);
                if (f3 != RecyclerView.f1559A0) {
                    String c0291f = e2.toString();
                    if (!z2) {
                        if (f3 < RecyclerView.f1559A0) {
                            f2 = V.f(f2, "- ");
                            f3 *= -1.0f;
                        }
                        f2 = f3 == 1.0f ? V.f(f2, c0291f) : f2 + f3 + " " + c0291f;
                        z2 = true;
                    } else if (f3 > RecyclerView.f1559A0) {
                        f2 = V.f(f2, " + ");
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        f2 = V.f(f2, " - ");
                        f3 *= -1.0f;
                        if (f3 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? V.f(f2, "0.0") : f2;
    }
}
