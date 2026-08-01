package q;

import K.C0014l;
import Y.V;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0284b {
    public final C0283a d;

    /* renamed from: a, reason: collision with root package name */
    public C0288f f3468a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3469b = RecyclerView.f1530C0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3470c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3471e = false;

    public C0284b(C0014l c0014l) {
        this.d = new C0283a(this, c0014l);
    }

    public final void a(C0285c c0285c, int i) {
        this.d.g(c0285c.j(i), 1.0f);
        this.d.g(c0285c.j(i), -1.0f);
    }

    public final void b(C0288f c0288f, C0288f c0288f2, C0288f c0288f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3469b = i;
        }
        if (z2) {
            this.d.g(c0288f, 1.0f);
            this.d.g(c0288f2, -1.0f);
            this.d.g(c0288f3, -1.0f);
        } else {
            this.d.g(c0288f, -1.0f);
            this.d.g(c0288f2, 1.0f);
            this.d.g(c0288f3, 1.0f);
        }
    }

    public final void c(C0288f c0288f, C0288f c0288f2, C0288f c0288f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3469b = i;
        }
        if (z2) {
            this.d.g(c0288f, 1.0f);
            this.d.g(c0288f2, -1.0f);
            this.d.g(c0288f3, 1.0f);
        } else {
            this.d.g(c0288f, -1.0f);
            this.d.g(c0288f2, 1.0f);
            this.d.g(c0288f3, -1.0f);
        }
    }

    public C0288f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3468a == null && this.f3469b == RecyclerView.f1530C0 && this.d.d() == 0;
    }

    public final C0288f f(boolean[] zArr, C0288f c0288f) {
        int i;
        int d = this.d.d();
        C0288f c0288f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < RecyclerView.f1530C0) {
                C0288f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3490b]) && e2 != c0288f && (((i = e2.f3497l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0288f2 = e2;
                }
            }
        }
        return c0288f2;
    }

    public final void g(C0288f c0288f) {
        C0288f c0288f2 = this.f3468a;
        if (c0288f2 != null) {
            this.d.g(c0288f2, -1.0f);
            this.f3468a.f3491c = -1;
            this.f3468a = null;
        }
        float h = this.d.h(c0288f, true) * (-1.0f);
        this.f3468a = c0288f;
        if (h == 1.0f) {
            return;
        }
        this.f3469b /= h;
        C0283a c0283a = this.d;
        int i = c0283a.h;
        for (int i2 = 0; i != -1 && i2 < c0283a.f3461a; i2++) {
            float[] fArr = c0283a.f3466g;
            fArr[i] = fArr[i] / h;
            i = c0283a.f3465f[i];
        }
    }

    public final void h(C0285c c0285c, C0288f c0288f, boolean z2) {
        if (c0288f == null || !c0288f.f3493f) {
            return;
        }
        float c2 = this.d.c(c0288f);
        this.f3469b = (c0288f.f3492e * c2) + this.f3469b;
        this.d.h(c0288f, z2);
        if (z2) {
            c0288f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3471e = true;
            c0285c.f3474a = true;
        }
    }

    public void i(C0285c c0285c, C0284b c0284b, boolean z2) {
        C0283a c0283a = this.d;
        c0283a.getClass();
        float c2 = c0283a.c(c0284b.f3468a);
        c0283a.h(c0284b.f3468a, z2);
        C0283a c0283a2 = c0284b.d;
        int d = c0283a2.d();
        for (int i = 0; i < d; i++) {
            C0288f e2 = c0283a2.e(i);
            c0283a.a(e2, c0283a2.c(e2) * c2, z2);
        }
        this.f3469b = (c0284b.f3469b * c2) + this.f3469b;
        if (z2) {
            c0284b.f3468a.b(this);
        }
        if (this.f3468a == null || this.d.d() != 0) {
            return;
        }
        this.f3471e = true;
        c0285c.f3474a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String f2 = V.f(this.f3468a == null ? "0" : "" + this.f3468a, " = ");
        if (this.f3469b != RecyclerView.f1530C0) {
            f2 = f2 + this.f3469b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0288f e2 = this.d.e(i);
            if (e2 != null) {
                float f3 = this.d.f(i);
                if (f3 != RecyclerView.f1530C0) {
                    String c0288f = e2.toString();
                    if (!z2) {
                        if (f3 < RecyclerView.f1530C0) {
                            f2 = V.f(f2, "- ");
                            f3 *= -1.0f;
                        }
                        f2 = f3 == 1.0f ? V.f(f2, c0288f) : f2 + f3 + " " + c0288f;
                        z2 = true;
                    } else if (f3 > RecyclerView.f1530C0) {
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
