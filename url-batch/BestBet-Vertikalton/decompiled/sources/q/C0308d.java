package q;

import L0.l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import u0.C0365d;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308d extends C0306b {

    /* renamed from: f, reason: collision with root package name */
    public C0310f[] f3736f;

    /* renamed from: g, reason: collision with root package name */
    public C0310f[] f3737g;
    public int h;
    public C0365d i;

    @Override // q.C0306b
    public final C0310f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0310f[] c0310fArr = this.f3736f;
            C0310f c0310f = c0310fArr[i2];
            if (!zArr[c0310f.f3740b]) {
                C0365d c0365d = this.i;
                c0365d.f4175b = c0310f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0310f) c0365d.f4175b).h[i3];
                        if (f2 <= RecyclerView.f1937A0) {
                            if (f2 < RecyclerView.f1937A0) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0310f c0310f2 = c0310fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0310f2.h[i3];
                            float f4 = ((C0310f) c0365d.f4175b).h[i3];
                            if (f4 == f3) {
                                i3--;
                            } else if (f4 >= f3) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f3736f[i];
    }

    @Override // q.C0306b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0306b
    public final void i(C0307c c0307c, C0306b c0306b, boolean z2) {
        C0310f c0310f = c0306b.f3718a;
        if (c0310f == null) {
            return;
        }
        C0305a c0305a = c0306b.d;
        int d = c0305a.d();
        for (int i = 0; i < d; i++) {
            C0310f e2 = c0305a.e(i);
            float f2 = c0305a.f(i);
            C0365d c0365d = this.i;
            c0365d.f4175b = e2;
            boolean z3 = e2.f3739a;
            float[] fArr = c0310f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0310f) c0365d.f4175b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0310f) c0365d.f4175b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0308d) c0365d.f4176c).k((C0310f) c0365d.f4175b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != RecyclerView.f1937A0) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0310f) c0365d.f4175b).h[i3] = f5;
                    } else {
                        ((C0310f) c0365d.f4175b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3719b = (c0306b.f3719b * f2) + this.f3719b;
        }
        k(c0310f);
    }

    public final void j(C0310f c0310f) {
        int i;
        int i2 = this.h + 1;
        C0310f[] c0310fArr = this.f3736f;
        if (i2 > c0310fArr.length) {
            C0310f[] c0310fArr2 = (C0310f[]) Arrays.copyOf(c0310fArr, c0310fArr.length * 2);
            this.f3736f = c0310fArr2;
            this.f3737g = (C0310f[]) Arrays.copyOf(c0310fArr2, c0310fArr2.length * 2);
        }
        C0310f[] c0310fArr3 = this.f3736f;
        int i3 = this.h;
        c0310fArr3[i3] = c0310f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0310fArr3[i3].f3740b > c0310f.f3740b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3737g[i5] = this.f3736f[i5];
                i5++;
            }
            Arrays.sort(this.f3737g, 0, i, new l(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3736f[i6] = this.f3737g[i6];
            }
        }
        c0310f.f3739a = true;
        c0310f.a(this);
    }

    public final void k(C0310f c0310f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3736f[i] == c0310f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0310f.f3739a = false;
                        return;
                    } else {
                        C0310f[] c0310fArr = this.f3736f;
                        int i3 = i + 1;
                        c0310fArr[i] = c0310fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0306b
    public final String toString() {
        String str = " goal -> (" + this.f3719b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0310f c0310f = this.f3736f[i];
            C0365d c0365d = this.i;
            c0365d.f4175b = c0310f;
            str = str + c0365d + " ";
        }
        return str;
    }
}
