package w2;

import a0.a0;
import d3.g;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f7861f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f7862g;

    /* renamed from: h, reason: collision with root package name */
    public int f7863h;
    public a0 i;

    @Override // w2.b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i8 = 0; i8 < this.f7863h; i8++) {
            f[] fVarArr = this.f7861f;
            f fVar = fVarArr[i8];
            if (!zArr[fVar.f7866e]) {
                a0 a0Var = this.i;
                a0Var.f11e = fVar;
                int i9 = 8;
                if (i == -1) {
                    while (i9 >= 0) {
                        float f6 = ((f) a0Var.f11e).f7871k[i9];
                        if (f6 <= 0.0f) {
                            if (f6 < 0.0f) {
                                i = i8;
                                break;
                            }
                            i9--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i];
                    while (true) {
                        if (i9 >= 0) {
                            float f8 = fVar2.f7871k[i9];
                            float f9 = ((f) a0Var.f11e).f7871k[i9];
                            if (f9 == f8) {
                                i9--;
                            } else if (f9 >= f8) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f7861f[i];
    }

    @Override // w2.b
    public final boolean e() {
        return this.f7863h == 0;
    }

    @Override // w2.b
    public final void i(c cVar, b bVar, boolean z3) {
        f fVar = bVar.f7840a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f7871k;
        a aVar = bVar.f7843d;
        int d8 = aVar.d();
        for (int i = 0; i < d8; i++) {
            f e8 = aVar.e(i);
            float f6 = aVar.f(i);
            a0 a0Var = this.i;
            a0Var.f11e = e8;
            if (e8.f7865d) {
                boolean z7 = true;
                for (int i8 = 0; i8 < 9; i8++) {
                    float[] fArr2 = ((f) a0Var.f11e).f7871k;
                    float f8 = (fArr[i8] * f6) + fArr2[i8];
                    fArr2[i8] = f8;
                    if (Math.abs(f8) < 1.0E-4f) {
                        ((f) a0Var.f11e).f7871k[i8] = 0.0f;
                    } else {
                        z7 = false;
                    }
                }
                if (z7) {
                    ((d) a0Var.f12f).k((f) a0Var.f11e);
                }
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f9 = fArr[i9];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f6;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        ((f) a0Var.f11e).f7871k[i9] = f10;
                    } else {
                        ((f) a0Var.f11e).f7871k[i9] = 0.0f;
                    }
                }
                j(e8);
            }
            this.f7841b = (bVar.f7841b * f6) + this.f7841b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i;
        int i8 = this.f7863h + 1;
        f[] fVarArr = this.f7861f;
        if (i8 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f7861f = fVarArr2;
            this.f7862g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f7861f;
        int i9 = this.f7863h;
        fVarArr3[i9] = fVar;
        int i10 = i9 + 1;
        this.f7863h = i10;
        if (i10 > 1 && fVarArr3[i9].f7866e > fVar.f7866e) {
            int i11 = 0;
            while (true) {
                i = this.f7863h;
                if (i11 >= i) {
                    break;
                }
                this.f7862g[i11] = this.f7861f[i11];
                i11++;
            }
            Arrays.sort(this.f7862g, 0, i, new g(2));
            for (int i12 = 0; i12 < this.f7863h; i12++) {
                this.f7861f[i12] = this.f7862g[i12];
            }
        }
        fVar.f7865d = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i = 0;
        while (i < this.f7863h) {
            if (this.f7861f[i] == fVar) {
                while (true) {
                    int i8 = this.f7863h;
                    if (i >= i8 - 1) {
                        this.f7863h = i8 - 1;
                        fVar.f7865d = false;
                        return;
                    } else {
                        f[] fVarArr = this.f7861f;
                        int i9 = i + 1;
                        fVarArr[i] = fVarArr[i9];
                        i = i9;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // w2.b
    public final String toString() {
        a0 a0Var = this.i;
        String str = " goal -> (" + this.f7841b + ") : ";
        for (int i = 0; i < this.f7863h; i++) {
            a0Var.f11e = this.f7861f[i];
            str = str + a0Var + " ";
        }
        return str;
    }
}
