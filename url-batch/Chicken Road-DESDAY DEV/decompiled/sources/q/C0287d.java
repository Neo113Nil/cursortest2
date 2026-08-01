package q;

import B.j;
import C0.o;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287d extends C0285b {

    /* renamed from: f, reason: collision with root package name */
    public C0289f[] f3430f;

    /* renamed from: g, reason: collision with root package name */
    public C0289f[] f3431g;
    public int h;
    public j i;

    @Override // q.C0285b
    public final C0289f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0289f[] c0289fArr = this.f3430f;
            C0289f c0289f = c0289fArr[i2];
            if (!zArr[c0289f.f3434b]) {
                j jVar = this.i;
                jVar.f27b = c0289f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0289f) jVar.f27b).h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0289f c0289f2 = c0289fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0289f2.h[i3];
                            float f4 = ((C0289f) jVar.f27b).h[i3];
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
        return this.f3430f[i];
    }

    @Override // q.C0285b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0285b
    public final void i(C0286c c0286c, C0285b c0285b, boolean z2) {
        C0289f c0289f = c0285b.f3412a;
        if (c0289f == null) {
            return;
        }
        C0284a c0284a = c0285b.d;
        int d = c0284a.d();
        for (int i = 0; i < d; i++) {
            C0289f e2 = c0284a.e(i);
            float f2 = c0284a.f(i);
            j jVar = this.i;
            jVar.f27b = e2;
            boolean z3 = e2.f3433a;
            float[] fArr = c0289f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0289f) jVar.f27b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0289f) jVar.f27b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0287d) jVar.f28c).k((C0289f) jVar.f27b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0289f) jVar.f27b).h[i3] = f5;
                    } else {
                        ((C0289f) jVar.f27b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3413b = (c0285b.f3413b * f2) + this.f3413b;
        }
        k(c0289f);
    }

    public final void j(C0289f c0289f) {
        int i;
        int i2 = this.h + 1;
        C0289f[] c0289fArr = this.f3430f;
        if (i2 > c0289fArr.length) {
            C0289f[] c0289fArr2 = (C0289f[]) Arrays.copyOf(c0289fArr, c0289fArr.length * 2);
            this.f3430f = c0289fArr2;
            this.f3431g = (C0289f[]) Arrays.copyOf(c0289fArr2, c0289fArr2.length * 2);
        }
        C0289f[] c0289fArr3 = this.f3430f;
        int i3 = this.h;
        c0289fArr3[i3] = c0289f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0289fArr3[i3].f3434b > c0289f.f3434b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3431g[i5] = this.f3430f[i5];
                i5++;
            }
            Arrays.sort(this.f3431g, 0, i, new o(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3430f[i6] = this.f3431g[i6];
            }
        }
        c0289f.f3433a = true;
        c0289f.a(this);
    }

    public final void k(C0289f c0289f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3430f[i] == c0289f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0289f.f3433a = false;
                        return;
                    } else {
                        C0289f[] c0289fArr = this.f3430f;
                        int i3 = i + 1;
                        c0289fArr[i] = c0289fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0285b
    public final String toString() {
        String str = " goal -> (" + this.f3413b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0289f c0289f = this.f3430f[i];
            j jVar = this.i;
            jVar.f27b = c0289f;
            str = str + jVar + " ";
        }
        return str;
    }
}
