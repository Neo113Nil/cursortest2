package t;

import a0.i;
import androidx.emoji2.text.q;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f3259f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f3260g;

    /* renamed from: h, reason: collision with root package name */
    public int f3261h;
    public q i;

    @Override // t.b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i4 = 0; i4 < this.f3261h; i4++) {
            f[] fVarArr = this.f3259f;
            f fVar = fVarArr[i4];
            if (!zArr[fVar.f3263g]) {
                q qVar = this.i;
                qVar.f346g = fVar;
                int i5 = 8;
                if (i == -1) {
                    while (i5 >= 0) {
                        float f2 = ((f) qVar.f346g).f3268m[i5];
                        if (f2 <= 0.0f) {
                            if (f2 < 0.0f) {
                                i = i4;
                                break;
                            }
                            i5--;
                        }
                    }
                } else {
                    f fVar2 = fVarArr[i];
                    while (true) {
                        if (i5 >= 0) {
                            float f4 = fVar2.f3268m[i5];
                            float f5 = ((f) qVar.f346g).f3268m[i5];
                            if (f5 == f4) {
                                i5--;
                            } else if (f5 >= f4) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f3259f[i];
    }

    @Override // t.b
    public final boolean e() {
        return this.f3261h == 0;
    }

    @Override // t.b
    public final void i(c cVar, b bVar, boolean z3) {
        f fVar = bVar.f3240a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f3268m;
        a aVar = bVar.d;
        int d = aVar.d();
        for (int i = 0; i < d; i++) {
            f e4 = aVar.e(i);
            float f2 = aVar.f(i);
            q qVar = this.i;
            qVar.f346g = e4;
            if (e4.f3262f) {
                boolean z4 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = ((f) qVar.f346g).f3268m;
                    float f4 = (fArr[i4] * f2) + fArr2[i4];
                    fArr2[i4] = f4;
                    if (Math.abs(f4) < 1.0E-4f) {
                        ((f) qVar.f346g).f3268m[i4] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((d) qVar.f347h).k((f) qVar.f346g);
                }
            } else {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f5 = fArr[i5];
                    if (f5 != 0.0f) {
                        float f6 = f5 * f2;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        ((f) qVar.f346g).f3268m[i5] = f6;
                    } else {
                        ((f) qVar.f346g).f3268m[i5] = 0.0f;
                    }
                }
                j(e4);
            }
            this.f3241b = (bVar.f3241b * f2) + this.f3241b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i;
        int i4 = this.f3261h + 1;
        f[] fVarArr = this.f3259f;
        if (i4 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f3259f = fVarArr2;
            this.f3260g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f3259f;
        int i5 = this.f3261h;
        fVarArr3[i5] = fVar;
        int i6 = i5 + 1;
        this.f3261h = i6;
        if (i6 > 1 && fVarArr3[i5].f3263g > fVar.f3263g) {
            int i7 = 0;
            while (true) {
                i = this.f3261h;
                if (i7 >= i) {
                    break;
                }
                this.f3260g[i7] = this.f3259f[i7];
                i7++;
            }
            Arrays.sort(this.f3260g, 0, i, new i(3));
            for (int i8 = 0; i8 < this.f3261h; i8++) {
                this.f3259f[i8] = this.f3260g[i8];
            }
        }
        fVar.f3262f = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i = 0;
        while (i < this.f3261h) {
            if (this.f3259f[i] == fVar) {
                while (true) {
                    int i4 = this.f3261h;
                    if (i >= i4 - 1) {
                        this.f3261h = i4 - 1;
                        fVar.f3262f = false;
                        return;
                    } else {
                        f[] fVarArr = this.f3259f;
                        int i5 = i + 1;
                        fVarArr[i] = fVarArr[i5];
                        i = i5;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // t.b
    public final String toString() {
        q qVar = this.i;
        String str = " goal -> (" + this.f3241b + ") : ";
        for (int i = 0; i < this.f3261h; i++) {
            qVar.f346g = this.f3259f[i];
            str = str + qVar + " ";
        }
        return str;
    }
}
