package q;

import B.j;
import D0.o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286d extends C0284b {

    /* renamed from: f, reason: collision with root package name */
    public C0288f[] f3486f;

    /* renamed from: g, reason: collision with root package name */
    public C0288f[] f3487g;
    public int h;
    public j i;

    @Override // q.C0284b
    public final C0288f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0288f[] c0288fArr = this.f3486f;
            C0288f c0288f = c0288fArr[i2];
            if (!zArr[c0288f.f3490b]) {
                j jVar = this.i;
                jVar.f31b = c0288f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0288f) jVar.f31b).h[i3];
                        if (f2 <= RecyclerView.f1530C0) {
                            if (f2 < RecyclerView.f1530C0) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0288f c0288f2 = c0288fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0288f2.h[i3];
                            float f4 = ((C0288f) jVar.f31b).h[i3];
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
        return this.f3486f[i];
    }

    @Override // q.C0284b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0284b
    public final void i(C0285c c0285c, C0284b c0284b, boolean z2) {
        C0288f c0288f = c0284b.f3468a;
        if (c0288f == null) {
            return;
        }
        C0283a c0283a = c0284b.d;
        int d = c0283a.d();
        for (int i = 0; i < d; i++) {
            C0288f e2 = c0283a.e(i);
            float f2 = c0283a.f(i);
            j jVar = this.i;
            jVar.f31b = e2;
            boolean z3 = e2.f3489a;
            float[] fArr = c0288f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0288f) jVar.f31b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0288f) jVar.f31b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0286d) jVar.f32c).k((C0288f) jVar.f31b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != RecyclerView.f1530C0) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0288f) jVar.f31b).h[i3] = f5;
                    } else {
                        ((C0288f) jVar.f31b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3469b = (c0284b.f3469b * f2) + this.f3469b;
        }
        k(c0288f);
    }

    public final void j(C0288f c0288f) {
        int i;
        int i2 = this.h + 1;
        C0288f[] c0288fArr = this.f3486f;
        if (i2 > c0288fArr.length) {
            C0288f[] c0288fArr2 = (C0288f[]) Arrays.copyOf(c0288fArr, c0288fArr.length * 2);
            this.f3486f = c0288fArr2;
            this.f3487g = (C0288f[]) Arrays.copyOf(c0288fArr2, c0288fArr2.length * 2);
        }
        C0288f[] c0288fArr3 = this.f3486f;
        int i3 = this.h;
        c0288fArr3[i3] = c0288f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0288fArr3[i3].f3490b > c0288f.f3490b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3487g[i5] = this.f3486f[i5];
                i5++;
            }
            Arrays.sort(this.f3487g, 0, i, new o(3));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3486f[i6] = this.f3487g[i6];
            }
        }
        c0288f.f3489a = true;
        c0288f.a(this);
    }

    public final void k(C0288f c0288f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3486f[i] == c0288f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0288f.f3489a = false;
                        return;
                    } else {
                        C0288f[] c0288fArr = this.f3486f;
                        int i3 = i + 1;
                        c0288fArr[i] = c0288fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0284b
    public final String toString() {
        String str = " goal -> (" + this.f3469b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0288f c0288f = this.f3486f[i];
            j jVar = this.i;
            jVar.f31b = c0288f;
            str = str + jVar + " ";
        }
        return str;
    }
}
