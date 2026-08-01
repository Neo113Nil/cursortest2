package q;

import B.j;
import C0.o;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284d extends C0282b {

    /* renamed from: f, reason: collision with root package name */
    public C0286f[] f3476f;

    /* renamed from: g, reason: collision with root package name */
    public C0286f[] f3477g;
    public int h;
    public j i;

    @Override // q.C0282b
    public final C0286f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0286f[] c0286fArr = this.f3476f;
            C0286f c0286f = c0286fArr[i2];
            if (!zArr[c0286f.f3480b]) {
                j jVar = this.i;
                jVar.f25b = c0286f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0286f) jVar.f25b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0286f c0286f2 = c0286fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0286f2.h[i3];
                            float f4 = ((C0286f) jVar.f25b).h[i3];
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
        return this.f3476f[i];
    }

    @Override // q.C0282b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0282b
    public final void i(C0283c c0283c, C0282b c0282b, boolean z2) {
        C0286f c0286f = c0282b.f3458a;
        if (c0286f == null) {
            return;
        }
        C0281a c0281a = c0282b.d;
        int d = c0281a.d();
        for (int i = 0; i < d; i++) {
            C0286f e2 = c0281a.e(i);
            float f2 = c0281a.f(i);
            j jVar = this.i;
            jVar.f25b = e2;
            boolean z3 = e2.f3479a;
            float[] fArr = c0286f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0286f) jVar.f25b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0286f) jVar.f25b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0284d) jVar.f26c).k((C0286f) jVar.f25b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0286f) jVar.f25b).h[i3] = f5;
                    } else {
                        ((C0286f) jVar.f25b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3459b = (c0282b.f3459b * f2) + this.f3459b;
        }
        k(c0286f);
    }

    public final void j(C0286f c0286f) {
        int i;
        int i2 = this.h + 1;
        C0286f[] c0286fArr = this.f3476f;
        if (i2 > c0286fArr.length) {
            C0286f[] c0286fArr2 = (C0286f[]) Arrays.copyOf(c0286fArr, c0286fArr.length * 2);
            this.f3476f = c0286fArr2;
            this.f3477g = (C0286f[]) Arrays.copyOf(c0286fArr2, c0286fArr2.length * 2);
        }
        C0286f[] c0286fArr3 = this.f3476f;
        int i3 = this.h;
        c0286fArr3[i3] = c0286f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0286fArr3[i3].f3480b > c0286f.f3480b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3477g[i5] = this.f3476f[i5];
                i5++;
            }
            Arrays.sort(this.f3477g, 0, i, new o(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3476f[i6] = this.f3477g[i6];
            }
        }
        c0286f.f3479a = true;
        c0286f.a(this);
    }

    public final void k(C0286f c0286f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3476f[i] == c0286f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0286f.f3479a = false;
                        return;
                    } else {
                        C0286f[] c0286fArr = this.f3476f;
                        int i3 = i + 1;
                        c0286fArr[i] = c0286fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0282b
    public final String toString() {
        String str = " goal -> (" + this.f3459b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0286f c0286f = this.f3476f[i];
            j jVar = this.i;
            jVar.f25b = c0286f;
            str = str + jVar + " ";
        }
        return str;
    }
}
