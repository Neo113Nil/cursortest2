package q;

import B.j;
import G0.n;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272d extends C0270b {

    /* renamed from: f, reason: collision with root package name */
    public C0274f[] f3463f;

    /* renamed from: g, reason: collision with root package name */
    public C0274f[] f3464g;
    public int h;
    public j i;

    @Override // q.C0270b
    public final C0274f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0274f[] c0274fArr = this.f3463f;
            C0274f c0274f = c0274fArr[i2];
            if (!zArr[c0274f.f3467b]) {
                j jVar = this.i;
                jVar.f53b = c0274f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0274f) jVar.f53b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0274f c0274f2 = c0274fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0274f2.h[i3];
                            float f4 = ((C0274f) jVar.f53b).h[i3];
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
        return this.f3463f[i];
    }

    @Override // q.C0270b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0270b
    public final void i(C0271c c0271c, C0270b c0270b, boolean z2) {
        C0274f c0274f = c0270b.f3445a;
        if (c0274f == null) {
            return;
        }
        C0269a c0269a = c0270b.d;
        int d = c0269a.d();
        for (int i = 0; i < d; i++) {
            C0274f e2 = c0269a.e(i);
            float f2 = c0269a.f(i);
            j jVar = this.i;
            jVar.f53b = e2;
            boolean z3 = e2.f3466a;
            float[] fArr = c0274f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0274f) jVar.f53b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0274f) jVar.f53b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0272d) jVar.f54c).k((C0274f) jVar.f53b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0274f) jVar.f53b).h[i3] = f5;
                    } else {
                        ((C0274f) jVar.f53b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3446b = (c0270b.f3446b * f2) + this.f3446b;
        }
        k(c0274f);
    }

    public final void j(C0274f c0274f) {
        int i;
        int i2 = this.h + 1;
        C0274f[] c0274fArr = this.f3463f;
        if (i2 > c0274fArr.length) {
            C0274f[] c0274fArr2 = (C0274f[]) Arrays.copyOf(c0274fArr, c0274fArr.length * 2);
            this.f3463f = c0274fArr2;
            this.f3464g = (C0274f[]) Arrays.copyOf(c0274fArr2, c0274fArr2.length * 2);
        }
        C0274f[] c0274fArr3 = this.f3463f;
        int i3 = this.h;
        c0274fArr3[i3] = c0274f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0274fArr3[i3].f3467b > c0274f.f3467b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3464g[i5] = this.f3463f[i5];
                i5++;
            }
            Arrays.sort(this.f3464g, 0, i, new n(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3463f[i6] = this.f3464g[i6];
            }
        }
        c0274f.f3466a = true;
        c0274f.a(this);
    }

    public final void k(C0274f c0274f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3463f[i] == c0274f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0274f.f3466a = false;
                        return;
                    } else {
                        C0274f[] c0274fArr = this.f3463f;
                        int i3 = i + 1;
                        c0274fArr[i] = c0274fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0270b
    public final String toString() {
        String str = " goal -> (" + this.f3446b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0274f c0274f = this.f3463f[i];
            j jVar = this.i;
            jVar.f53b = c0274f;
            str = str + jVar + " ";
        }
        return str;
    }
}
