package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rx extends ru {
    public int f;
    final rw g;
    private ry[] h;
    private ry[] i;

    public rx(byo byoVar) {
        super(byoVar);
        this.h = new ry[128];
        this.i = new ry[128];
        this.f = 0;
        this.g = new rw(this);
    }

    @Override // defpackage.ru
    public final void d(rv rvVar, ru ruVar, boolean z) {
        ry ryVar = ruVar.a;
        if (ryVar == null) {
            return;
        }
        rt rtVar = ruVar.e;
        int i = rtVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            ry d = rtVar.d(i2);
            float b = rtVar.b(i2);
            rw rwVar = this.g;
            rwVar.a = d;
            if (rwVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = rwVar.a.i;
                    float f = fArr[i3] + (ryVar.i[i3] * b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        rwVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    rwVar.b.n(rwVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = ryVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        rwVar.a.i[i4] = f3;
                    } else {
                        rwVar.a.i[i4] = 0.0f;
                    }
                }
                m(d);
            }
            this.b += ruVar.b * b;
        }
        n(ryVar);
    }

    @Override // defpackage.ru
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.ru
    public final ry k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            ry[] ryVarArr = this.h;
            ry ryVar = ryVarArr[i2];
            if (!zArr[ryVar.c]) {
                rw rwVar = this.g;
                rwVar.a = ryVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = rwVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    ry ryVar2 = ryVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = ryVar2.i[i3];
                            float f3 = rwVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(ry ryVar) {
        int i;
        ry[] ryVarArr;
        int i2 = this.f + 1;
        ry[] ryVarArr2 = this.h;
        int length = ryVarArr2.length;
        if (i2 > length) {
            ry[] ryVarArr3 = (ry[]) Arrays.copyOf(ryVarArr2, length + length);
            this.h = ryVarArr3;
            int length2 = ryVarArr3.length;
            this.i = (ry[]) Arrays.copyOf(ryVarArr3, length2 + length2);
        }
        ry[] ryVarArr4 = this.h;
        int i3 = this.f;
        ryVarArr4[i3] = ryVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && ryVarArr4[i3].c > ryVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                ryVarArr = this.i;
                if (i5 >= i) {
                    break;
                }
                ryVarArr[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(ryVarArr, 0, i, new ju(2));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        ryVar.b = true;
        ryVar.a(this);
    }

    public final void n(ry ryVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == ryVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        ryVar.b = false;
                        return;
                    } else {
                        ry[] ryVarArr = this.h;
                        int i3 = i + 1;
                        ryVarArr[i] = ryVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ru
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            ry ryVar = this.h[i];
            rw rwVar = this.g;
            rwVar.a = ryVar;
            str = str + String.valueOf(rwVar) + " ";
        }
        return str;
    }
}
