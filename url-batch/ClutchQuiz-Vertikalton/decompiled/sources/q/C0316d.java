package q;

import B.j;
import I0.l;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316d extends C0314b {

    /* renamed from: f, reason: collision with root package name */
    public C0318f[] f3424f;

    /* renamed from: g, reason: collision with root package name */
    public C0318f[] f3425g;
    public int h;
    public j i;

    @Override // q.C0314b
    public final C0318f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0318f[] c0318fArr = this.f3424f;
            C0318f c0318f = c0318fArr[i2];
            if (!zArr[c0318f.f3427b]) {
                j jVar = this.i;
                jVar.f56b = c0318f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0318f) jVar.f56b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0318f c0318f2 = c0318fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0318f2.h[i3];
                            float f4 = ((C0318f) jVar.f56b).h[i3];
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
        return this.f3424f[i];
    }

    @Override // q.C0314b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0314b
    public final void i(C0315c c0315c, C0314b c0314b, boolean z2) {
        C0318f c0318f = c0314b.f3406a;
        if (c0318f == null) {
            return;
        }
        C0313a c0313a = c0314b.d;
        int d = c0313a.d();
        for (int i = 0; i < d; i++) {
            C0318f e2 = c0313a.e(i);
            float f2 = c0313a.f(i);
            j jVar = this.i;
            jVar.f56b = e2;
            boolean z3 = e2.f3426a;
            float[] fArr = c0318f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0318f) jVar.f56b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0318f) jVar.f56b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0316d) jVar.f57c).k((C0318f) jVar.f56b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0318f) jVar.f56b).h[i3] = f5;
                    } else {
                        ((C0318f) jVar.f56b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3407b = (c0314b.f3407b * f2) + this.f3407b;
        }
        k(c0318f);
    }

    public final void j(C0318f c0318f) {
        int i;
        int i2 = this.h + 1;
        C0318f[] c0318fArr = this.f3424f;
        if (i2 > c0318fArr.length) {
            C0318f[] c0318fArr2 = (C0318f[]) Arrays.copyOf(c0318fArr, c0318fArr.length * 2);
            this.f3424f = c0318fArr2;
            this.f3425g = (C0318f[]) Arrays.copyOf(c0318fArr2, c0318fArr2.length * 2);
        }
        C0318f[] c0318fArr3 = this.f3424f;
        int i3 = this.h;
        c0318fArr3[i3] = c0318f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0318fArr3[i3].f3427b > c0318f.f3427b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3425g[i5] = this.f3424f[i5];
                i5++;
            }
            Arrays.sort(this.f3425g, 0, i, new l(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3424f[i6] = this.f3425g[i6];
            }
        }
        c0318f.f3426a = true;
        c0318f.a(this);
    }

    public final void k(C0318f c0318f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3424f[i] == c0318f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0318f.f3426a = false;
                        return;
                    } else {
                        C0318f[] c0318fArr = this.f3424f;
                        int i3 = i + 1;
                        c0318fArr[i] = c0318fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0314b
    public final String toString() {
        String str = " goal -> (" + this.f3407b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0318f c0318f = this.f3424f[i];
            j jVar = this.i;
            jVar.f56b = c0318f;
            str = str + jVar + " ";
        }
        return str;
    }
}
