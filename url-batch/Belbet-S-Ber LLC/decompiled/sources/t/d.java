package t;

import a0.j;
import androidx.emoji2.text.q;
import java.util.Arrays;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public f[] f3372f;

    /* renamed from: g, reason: collision with root package name */
    public f[] f3373g;
    public int h;
    public q i;

    @Override // t.b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i4 = 0; i4 < this.h; i4++) {
            f[] fVarArr = this.f3372f;
            f fVar = fVarArr[i4];
            if (!zArr[fVar.f3376g]) {
                q qVar = this.i;
                qVar.f466g = fVar;
                int i5 = 8;
                if (i == -1) {
                    while (i5 >= 0) {
                        float f5 = ((f) qVar.f466g).f3380m[i5];
                        if (f5 <= 0.0f) {
                            if (f5 < 0.0f) {
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
                            float f6 = fVar2.f3380m[i5];
                            float f7 = ((f) qVar.f466g).f3380m[i5];
                            if (f7 == f6) {
                                i5--;
                            } else if (f7 >= f6) {
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

    @Override // t.b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // t.b
    public final void i(c cVar, b bVar, boolean z4) {
        f fVar = bVar.f3354a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f3380m;
        a aVar = bVar.d;
        int d = aVar.d();
        for (int i = 0; i < d; i++) {
            f e4 = aVar.e(i);
            float f5 = aVar.f(i);
            q qVar = this.i;
            qVar.f466g = e4;
            if (e4.f3375f) {
                boolean z5 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = ((f) qVar.f466g).f3380m;
                    float f6 = (fArr[i4] * f5) + fArr2[i4];
                    fArr2[i4] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        ((f) qVar.f466g).f3380m[i4] = 0.0f;
                    } else {
                        z5 = false;
                    }
                }
                if (z5) {
                    ((d) qVar.h).k((f) qVar.f466g);
                }
            } else {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f7 = fArr[i5];
                    if (f7 != 0.0f) {
                        float f8 = f7 * f5;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        ((f) qVar.f466g).f3380m[i5] = f8;
                    } else {
                        ((f) qVar.f466g).f3380m[i5] = 0.0f;
                    }
                }
                j(e4);
            }
            this.f3355b = (bVar.f3355b * f5) + this.f3355b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i;
        int i4 = this.h + 1;
        f[] fVarArr = this.f3372f;
        if (i4 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f3372f = fVarArr2;
            this.f3373g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f3372f;
        int i5 = this.h;
        fVarArr3[i5] = fVar;
        int i6 = i5 + 1;
        this.h = i6;
        if (i6 > 1 && fVarArr3[i5].f3376g > fVar.f3376g) {
            int i7 = 0;
            while (true) {
                i = this.h;
                if (i7 >= i) {
                    break;
                }
                this.f3373g[i7] = this.f3372f[i7];
                i7++;
            }
            Arrays.sort(this.f3373g, 0, i, new j(6));
            for (int i8 = 0; i8 < this.h; i8++) {
                this.f3372f[i8] = this.f3373g[i8];
            }
        }
        fVar.f3375f = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f3372f[i] == fVar) {
                while (true) {
                    int i4 = this.h;
                    if (i >= i4 - 1) {
                        this.h = i4 - 1;
                        fVar.f3375f = false;
                        return;
                    } else {
                        f[] fVarArr = this.f3372f;
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
        String str = " goal -> (" + this.f3355b + ") : ";
        for (int i = 0; i < this.h; i++) {
            qVar.f466g = this.f3372f[i];
            str = str + qVar + " ";
        }
        return str;
    }
}
