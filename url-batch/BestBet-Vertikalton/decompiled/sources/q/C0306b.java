package q;

import G1.AbstractC0001b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import u0.C0372k;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0306b {
    public final C0305a d;

    /* renamed from: a, reason: collision with root package name */
    public C0310f f3718a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f3719b = RecyclerView.f1937A0;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3720c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3721e = false;

    public C0306b(C0372k c0372k) {
        this.d = new C0305a(this, c0372k);
    }

    public final void a(C0307c c0307c, int i) {
        this.d.g(c0307c.j(i), 1.0f);
        this.d.g(c0307c.j(i), -1.0f);
    }

    public final void b(C0310f c0310f, C0310f c0310f2, C0310f c0310f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3719b = i;
        }
        if (z2) {
            this.d.g(c0310f, 1.0f);
            this.d.g(c0310f2, -1.0f);
            this.d.g(c0310f3, -1.0f);
        } else {
            this.d.g(c0310f, -1.0f);
            this.d.g(c0310f2, 1.0f);
            this.d.g(c0310f3, 1.0f);
        }
    }

    public final void c(C0310f c0310f, C0310f c0310f2, C0310f c0310f3, int i) {
        boolean z2 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z2 = true;
            }
            this.f3719b = i;
        }
        if (z2) {
            this.d.g(c0310f, 1.0f);
            this.d.g(c0310f2, -1.0f);
            this.d.g(c0310f3, 1.0f);
        } else {
            this.d.g(c0310f, -1.0f);
            this.d.g(c0310f2, 1.0f);
            this.d.g(c0310f3, -1.0f);
        }
    }

    public C0310f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f3718a == null && this.f3719b == RecyclerView.f1937A0 && this.d.d() == 0;
    }

    public final C0310f f(boolean[] zArr, C0310f c0310f) {
        int i;
        int d = this.d.d();
        C0310f c0310f2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f3 = this.d.f(i2);
            if (f3 < RecyclerView.f1937A0) {
                C0310f e2 = this.d.e(i2);
                if ((zArr == null || !zArr[e2.f3740b]) && e2 != c0310f && (((i = e2.f3747l) == 3 || i == 4) && f3 < f2)) {
                    f2 = f3;
                    c0310f2 = e2;
                }
            }
        }
        return c0310f2;
    }

    public final void g(C0310f c0310f) {
        C0310f c0310f2 = this.f3718a;
        if (c0310f2 != null) {
            this.d.g(c0310f2, -1.0f);
            this.f3718a.f3741c = -1;
            this.f3718a = null;
        }
        float h = this.d.h(c0310f, true) * (-1.0f);
        this.f3718a = c0310f;
        if (h == 1.0f) {
            return;
        }
        this.f3719b /= h;
        C0305a c0305a = this.d;
        int i = c0305a.h;
        for (int i2 = 0; i != -1 && i2 < c0305a.f3711a; i2++) {
            float[] fArr = c0305a.f3716g;
            fArr[i] = fArr[i] / h;
            i = c0305a.f3715f[i];
        }
    }

    public final void h(C0307c c0307c, C0310f c0310f, boolean z2) {
        if (c0310f == null || !c0310f.f3743f) {
            return;
        }
        float c2 = this.d.c(c0310f);
        this.f3719b = (c0310f.f3742e * c2) + this.f3719b;
        this.d.h(c0310f, z2);
        if (z2) {
            c0310f.b(this);
        }
        if (this.d.d() == 0) {
            this.f3721e = true;
            c0307c.f3724a = true;
        }
    }

    public void i(C0307c c0307c, C0306b c0306b, boolean z2) {
        C0305a c0305a = this.d;
        c0305a.getClass();
        float c2 = c0305a.c(c0306b.f3718a);
        c0305a.h(c0306b.f3718a, z2);
        C0305a c0305a2 = c0306b.d;
        int d = c0305a2.d();
        for (int i = 0; i < d; i++) {
            C0310f e2 = c0305a2.e(i);
            c0305a.a(e2, c0305a2.c(e2) * c2, z2);
        }
        this.f3719b = (c0306b.f3719b * c2) + this.f3719b;
        if (z2) {
            c0306b.f3718a.b(this);
        }
        if (this.f3718a == null || this.d.d() != 0) {
            return;
        }
        this.f3721e = true;
        c0307c.f3724a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String g2 = AbstractC0001b.g(this.f3718a == null ? "0" : "" + this.f3718a, " = ");
        if (this.f3719b != RecyclerView.f1937A0) {
            g2 = g2 + this.f3719b;
            z2 = true;
        } else {
            z2 = false;
        }
        int d = this.d.d();
        for (int i = 0; i < d; i++) {
            C0310f e2 = this.d.e(i);
            if (e2 != null) {
                float f2 = this.d.f(i);
                if (f2 != RecyclerView.f1937A0) {
                    String c0310f = e2.toString();
                    if (!z2) {
                        if (f2 < RecyclerView.f1937A0) {
                            g2 = AbstractC0001b.g(g2, "- ");
                            f2 *= -1.0f;
                        }
                        g2 = f2 == 1.0f ? AbstractC0001b.g(g2, c0310f) : g2 + f2 + " " + c0310f;
                        z2 = true;
                    } else if (f2 > RecyclerView.f1937A0) {
                        g2 = AbstractC0001b.g(g2, " + ");
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        g2 = AbstractC0001b.g(g2, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? AbstractC0001b.g(g2, "0.0") : g2;
    }
}
