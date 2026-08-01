package s;

import D.j;
import F0.n;
import java.util.Arrays;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266d extends C0264b {

    /* renamed from: f, reason: collision with root package name */
    public C0268f[] f3592f;

    /* renamed from: g, reason: collision with root package name */
    public C0268f[] f3593g;
    public int h;
    public j i;

    @Override // s.C0264b
    public final C0268f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0268f[] c0268fArr = this.f3592f;
            C0268f c0268f = c0268fArr[i2];
            if (!zArr[c0268f.f3596b]) {
                j jVar = this.i;
                jVar.f133b = c0268f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0268f) jVar.f133b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0268f c0268f2 = c0268fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0268f2.h[i3];
                            float f4 = ((C0268f) jVar.f133b).h[i3];
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
        return this.f3592f[i];
    }

    @Override // s.C0264b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // s.C0264b
    public final void i(C0265c c0265c, C0264b c0264b, boolean z2) {
        C0268f c0268f = c0264b.f3574a;
        if (c0268f == null) {
            return;
        }
        C0263a c0263a = c0264b.d;
        int d = c0263a.d();
        for (int i = 0; i < d; i++) {
            C0268f e2 = c0263a.e(i);
            float f2 = c0263a.f(i);
            j jVar = this.i;
            jVar.f133b = e2;
            boolean z3 = e2.f3595a;
            float[] fArr = c0268f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0268f) jVar.f133b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0268f) jVar.f133b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0266d) jVar.f134c).k((C0268f) jVar.f133b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0268f) jVar.f133b).h[i3] = f5;
                    } else {
                        ((C0268f) jVar.f133b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3575b = (c0264b.f3575b * f2) + this.f3575b;
        }
        k(c0268f);
    }

    public final void j(C0268f c0268f) {
        int i;
        int i2 = this.h + 1;
        C0268f[] c0268fArr = this.f3592f;
        if (i2 > c0268fArr.length) {
            C0268f[] c0268fArr2 = (C0268f[]) Arrays.copyOf(c0268fArr, c0268fArr.length * 2);
            this.f3592f = c0268fArr2;
            this.f3593g = (C0268f[]) Arrays.copyOf(c0268fArr2, c0268fArr2.length * 2);
        }
        C0268f[] c0268fArr3 = this.f3592f;
        int i3 = this.h;
        c0268fArr3[i3] = c0268f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0268fArr3[i3].f3596b > c0268f.f3596b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3593g[i5] = this.f3592f[i5];
                i5++;
            }
            Arrays.sort(this.f3593g, 0, i, new n(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3592f[i6] = this.f3593g[i6];
            }
        }
        c0268f.f3595a = true;
        c0268f.a(this);
    }

    public final void k(C0268f c0268f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3592f[i] == c0268f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0268f.f3595a = false;
                        return;
                    } else {
                        C0268f[] c0268fArr = this.f3592f;
                        int i3 = i + 1;
                        c0268fArr[i] = c0268fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // s.C0264b
    public final String toString() {
        String str = " goal -> (" + this.f3575b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0268f c0268f = this.f3592f[i];
            j jVar = this.i;
            jVar.f133b = c0268f;
            str = str + jVar + " ";
        }
        return str;
    }
}
