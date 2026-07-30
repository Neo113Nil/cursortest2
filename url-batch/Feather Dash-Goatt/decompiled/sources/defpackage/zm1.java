package defpackage;

import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zm1 {
    public final boolean a;
    public final ym1 b;
    public final int c;
    public final qo[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public zm1(boolean z, ym1 ym1Var) {
        int i;
        this.a = z;
        this.b = ym1Var;
        if (z && ym1Var.equals(ym1.d)) {
            dd0.j("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = ym1Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                l.a();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new qo[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        qo[] qoVarArr = this.d;
        qo qoVar = qoVarArr[i];
        if (qoVar != null) {
            qoVar.a = j;
            qoVar.b = f;
        } else {
            qo qoVar2 = new qo();
            qoVar2.a = j;
            qoVar2.b = f;
            qoVarArr[i] = qoVar2;
        }
    }

    public final float b(float f) {
        ym1 ym1Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            o80.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        qo[] qoVarArr = this.d;
        qo qoVar = qoVarArr[i2];
        if (qoVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            qo qoVar2 = qoVar;
            while (true) {
                qo qoVar3 = qoVarArr[i2];
                boolean z2 = this.a;
                ym1Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (qoVar3 != null) {
                    long j = qoVar.a;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = qoVar3.a;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - qoVar2.a);
                    qoVar2 = (ym1Var == ym1.d || z) ? qoVar3 : qoVar;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = qoVar3.b;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.c) {
                int ordinal = ym1Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        ka0.y(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        l.a();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ zm1() {
        this(false, ym1.d);
    }

    public zm1(int i) {
        this(true, ym1.e);
    }
}
