package s;

import H0.n;
import java.util.Arrays;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379d extends C0377b {

    /* renamed from: f, reason: collision with root package name */
    public C0381f[] f4127f;

    /* renamed from: g, reason: collision with root package name */
    public C0381f[] f4128g;

    /* renamed from: h, reason: collision with root package name */
    public int f4129h;
    public B1.c i;

    @Override // s.C0377b
    public final C0381f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f4129h; i2++) {
            C0381f[] c0381fArr = this.f4127f;
            C0381f c0381f = c0381fArr[i2];
            if (!zArr[c0381f.f4132b]) {
                B1.c cVar = this.i;
                cVar.f68b = c0381f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0381f) cVar.f68b).f4137h[i3];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0381f c0381f2 = c0381fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0381f2.f4137h[i3];
                            float f4 = ((C0381f) cVar.f68b).f4137h[i3];
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
        return this.f4127f[i];
    }

    @Override // s.C0377b
    public final boolean e() {
        return this.f4129h == 0;
    }

    @Override // s.C0377b
    public final void i(C0378c c0378c, C0377b c0377b, boolean z2) {
        C0381f c0381f = c0377b.f4109a;
        if (c0381f == null) {
            return;
        }
        C0376a c0376a = c0377b.f4112d;
        int d2 = c0376a.d();
        for (int i = 0; i < d2; i++) {
            C0381f e = c0376a.e(i);
            float f2 = c0376a.f(i);
            B1.c cVar = this.i;
            cVar.f68b = e;
            boolean z3 = e.f4131a;
            float[] fArr = c0381f.f4137h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0381f) cVar.f68b).f4137h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0381f) cVar.f68b).f4137h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0379d) cVar.f69c).k((C0381f) cVar.f68b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0381f) cVar.f68b).f4137h[i3] = f5;
                    } else {
                        ((C0381f) cVar.f68b).f4137h[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.f4110b = (c0377b.f4110b * f2) + this.f4110b;
        }
        k(c0381f);
    }

    public final void j(C0381f c0381f) {
        int i;
        int i2 = this.f4129h + 1;
        C0381f[] c0381fArr = this.f4127f;
        if (i2 > c0381fArr.length) {
            C0381f[] c0381fArr2 = (C0381f[]) Arrays.copyOf(c0381fArr, c0381fArr.length * 2);
            this.f4127f = c0381fArr2;
            this.f4128g = (C0381f[]) Arrays.copyOf(c0381fArr2, c0381fArr2.length * 2);
        }
        C0381f[] c0381fArr3 = this.f4127f;
        int i3 = this.f4129h;
        c0381fArr3[i3] = c0381f;
        int i4 = i3 + 1;
        this.f4129h = i4;
        if (i4 > 1 && c0381fArr3[i3].f4132b > c0381f.f4132b) {
            int i5 = 0;
            while (true) {
                i = this.f4129h;
                if (i5 >= i) {
                    break;
                }
                this.f4128g[i5] = this.f4127f[i5];
                i5++;
            }
            Arrays.sort(this.f4128g, 0, i, new n(2));
            for (int i6 = 0; i6 < this.f4129h; i6++) {
                this.f4127f[i6] = this.f4128g[i6];
            }
        }
        c0381f.f4131a = true;
        c0381f.a(this);
    }

    public final void k(C0381f c0381f) {
        int i = 0;
        while (i < this.f4129h) {
            if (this.f4127f[i] == c0381f) {
                while (true) {
                    int i2 = this.f4129h;
                    if (i >= i2 - 1) {
                        this.f4129h = i2 - 1;
                        c0381f.f4131a = false;
                        return;
                    } else {
                        C0381f[] c0381fArr = this.f4127f;
                        int i3 = i + 1;
                        c0381fArr[i] = c0381fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // s.C0377b
    public final String toString() {
        String str = " goal -> (" + this.f4110b + ") : ";
        for (int i = 0; i < this.f4129h; i++) {
            C0381f c0381f = this.f4127f[i];
            B1.c cVar = this.i;
            cVar.f68b = c0381f;
            str = str + cVar + " ";
        }
        return str;
    }
}
