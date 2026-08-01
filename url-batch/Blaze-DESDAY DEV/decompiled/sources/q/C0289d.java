package q;

import B.j;
import D0.o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289d extends C0287b {

    /* renamed from: f, reason: collision with root package name */
    public C0291f[] f3372f;

    /* renamed from: g, reason: collision with root package name */
    public C0291f[] f3373g;
    public int h;
    public j i;

    @Override // q.C0287b
    public final C0291f d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            C0291f[] c0291fArr = this.f3372f;
            C0291f c0291f = c0291fArr[i2];
            if (!zArr[c0291f.f3376b]) {
                j jVar = this.i;
                jVar.f45b = c0291f;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f2 = ((C0291f) jVar.f45b).h[i3];
                        if (f2 <= RecyclerView.f1559A0) {
                            if (f2 < RecyclerView.f1559A0) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C0291f c0291f2 = c0291fArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = c0291f2.h[i3];
                            float f4 = ((C0291f) jVar.f45b).h[i3];
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
        return this.f3372f[i];
    }

    @Override // q.C0287b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.C0287b
    public final void i(C0288c c0288c, C0287b c0287b, boolean z2) {
        C0291f c0291f = c0287b.f3354a;
        if (c0291f == null) {
            return;
        }
        C0286a c0286a = c0287b.d;
        int d = c0286a.d();
        for (int i = 0; i < d; i++) {
            C0291f e2 = c0286a.e(i);
            float f2 = c0286a.f(i);
            j jVar = this.i;
            jVar.f45b = e2;
            boolean z3 = e2.f3375a;
            float[] fArr = c0291f.h;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C0291f) jVar.f45b).h;
                    float f3 = (fArr[i2] * f2) + fArr2[i2];
                    fArr2[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        ((C0291f) jVar.f45b).h[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C0289d) jVar.f46c).k((C0291f) jVar.f45b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = fArr[i3];
                    if (f4 != RecyclerView.f1559A0) {
                        float f5 = f4 * f2;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        ((C0291f) jVar.f45b).h[i3] = f5;
                    } else {
                        ((C0291f) jVar.f45b).h[i3] = 0.0f;
                    }
                }
                j(e2);
            }
            this.f3355b = (c0287b.f3355b * f2) + this.f3355b;
        }
        k(c0291f);
    }

    public final void j(C0291f c0291f) {
        int i;
        int i2 = this.h + 1;
        C0291f[] c0291fArr = this.f3372f;
        if (i2 > c0291fArr.length) {
            C0291f[] c0291fArr2 = (C0291f[]) Arrays.copyOf(c0291fArr, c0291fArr.length * 2);
            this.f3372f = c0291fArr2;
            this.f3373g = (C0291f[]) Arrays.copyOf(c0291fArr2, c0291fArr2.length * 2);
        }
        C0291f[] c0291fArr3 = this.f3372f;
        int i3 = this.h;
        c0291fArr3[i3] = c0291f;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && c0291fArr3[i3].f3376b > c0291f.f3376b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.f3373g[i5] = this.f3372f[i5];
                i5++;
            }
            Arrays.sort(this.f3373g, 0, i, new o(2));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f3372f[i6] = this.f3373g[i6];
            }
        }
        c0291f.f3375a = true;
        c0291f.a(this);
    }

    public final void k(C0291f c0291f) {
        int i = 0;
        while (i < this.h) {
            if (this.f3372f[i] == c0291f) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        c0291f.f3375a = false;
                        return;
                    } else {
                        C0291f[] c0291fArr = this.f3372f;
                        int i3 = i + 1;
                        c0291fArr[i] = c0291fArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // q.C0287b
    public final String toString() {
        String str = " goal -> (" + this.f3355b + ") : ";
        for (int i = 0; i < this.h; i++) {
            C0291f c0291f = this.f3372f[i];
            j jVar = this.i;
            jVar.f45b = c0291f;
            str = str + jVar + " ";
        }
        return str;
    }
}
