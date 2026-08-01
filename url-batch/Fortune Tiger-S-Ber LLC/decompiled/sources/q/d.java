package q;

import a2.q;
import a2.s;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f3079f;
    public f[] g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public s f3080i;

    @Override // q.b
    public final f d(boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.h; i5++) {
            f[] fVarArr = this.f3079f;
            f fVar = fVarArr[i5];
            if (!zArr[fVar.g]) {
                s sVar = this.f3080i;
                sVar.g = fVar;
                int i6 = 8;
                if (i4 == -1) {
                    while (i6 >= 0) {
                        float f4 = ((f) sVar.g).f3087m[i6];
                        if (f4 <= 0.0f) {
                            if (f4 < 0.0f) {
                                i4 = i5;
                                break;
                            }
                            i6--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i4];
                    while (true) {
                        if (i6 >= 0) {
                            float f5 = fVar2.f3087m[i6];
                            float f6 = ((f) sVar.g).f3087m[i6];
                            if (f6 == f5) {
                                i6--;
                            } else if (f6 >= f5) {
                            }
                        }
                    }
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f3079f[i4];
    }

    @Override // q.b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // q.b
    public final void i(c cVar, b bVar, boolean z3) {
        f fVar = bVar.f3061a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f3087m;
        a aVar = bVar.f3063d;
        int d4 = aVar.d();
        for (int i4 = 0; i4 < d4; i4++) {
            f e4 = aVar.e(i4);
            float f4 = aVar.f(i4);
            s sVar = this.f3080i;
            sVar.g = e4;
            if (e4.f3082f) {
                boolean z4 = true;
                for (int i5 = 0; i5 < 9; i5++) {
                    float[] fArr2 = ((f) sVar.g).f3087m;
                    float f5 = (fArr[i5] * f4) + fArr2[i5];
                    fArr2[i5] = f5;
                    if (Math.abs(f5) < 1.0E-4f) {
                        ((f) sVar.g).f3087m[i5] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((d) sVar.h).k((f) sVar.g);
                }
            } else {
                for (int i6 = 0; i6 < 9; i6++) {
                    float f6 = fArr[i6];
                    if (f6 != 0.0f) {
                        float f7 = f6 * f4;
                        if (Math.abs(f7) < 1.0E-4f) {
                            f7 = 0.0f;
                        }
                        ((f) sVar.g).f3087m[i6] = f7;
                    } else {
                        ((f) sVar.g).f3087m[i6] = 0.0f;
                    }
                }
                j(e4);
            }
            this.f3062b = (bVar.f3062b * f4) + this.f3062b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i4;
        int i5 = this.h + 1;
        f[] fVarArr = this.f3079f;
        if (i5 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f3079f = fVarArr2;
            this.g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f3079f;
        int i6 = this.h;
        fVarArr3[i6] = fVar;
        int i7 = i6 + 1;
        this.h = i7;
        if (i7 > 1 && fVarArr3[i6].g > fVar.g) {
            int i8 = 0;
            while (true) {
                i4 = this.h;
                if (i8 >= i4) {
                    break;
                }
                this.g[i8] = this.f3079f[i8];
                i8++;
            }
            Arrays.sort(this.g, 0, i4, new q(2));
            for (int i9 = 0; i9 < this.h; i9++) {
                this.f3079f[i9] = this.g[i9];
            }
        }
        fVar.f3082f = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i4 = 0;
        while (i4 < this.h) {
            if (this.f3079f[i4] == fVar) {
                while (true) {
                    int i5 = this.h;
                    if (i4 >= i5 - 1) {
                        this.h = i5 - 1;
                        fVar.f3082f = false;
                        return;
                    } else {
                        f[] fVarArr = this.f3079f;
                        int i6 = i4 + 1;
                        fVarArr[i4] = fVarArr[i6];
                        i4 = i6;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // q.b
    public final String toString() {
        s sVar = this.f3080i;
        String str = " goal -> (" + this.f3062b + ") : ";
        for (int i4 = 0; i4 < this.h; i4++) {
            sVar.g = this.f3079f[i4];
            str = str + sVar + " ";
        }
        return str;
    }
}
