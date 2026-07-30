package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h43 {
    public final g43 a;
    public final int b;
    public final l60[] c;
    public int d;
    public final float[] e;
    public final float[] f;
    public final float[] g;

    public h43() {
        int i;
        g43 g43Var = g43.m;
        this.a = g43Var;
        int ordinal = g43Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                a.b();
                throw null;
            }
            i = 2;
        }
        this.b = i;
        this.c = new l60[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.d + 1) % 20;
        this.d = i;
        l60[] l60VarArr = this.c;
        l60 l60Var = l60VarArr[i];
        if (l60Var != null) {
            l60Var.a = j;
            l60Var.b = f;
        } else {
            l60 l60Var2 = new l60();
            l60Var2.a = j;
            l60Var2.b = f;
            l60VarArr[i] = l60Var2;
        }
    }

    public final float b(float f) {
        float[] fArr;
        float[] fArr2;
        float f2;
        g43 g43Var;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            h21.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.d;
        l60[] l60VarArr = this.c;
        l60 l60Var = l60VarArr[i2];
        if (l60Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            l60 l60Var2 = l60Var;
            while (true) {
                l60 l60Var3 = l60VarArr[i2];
                g43 g43Var2 = this.a;
                fArr = this.e;
                fArr2 = this.f;
                if (l60Var3 != null) {
                    long j = l60Var.a;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = l60Var3.a;
                    float f6 = j - j2;
                    i = 1;
                    float abs = Math.abs(j2 - l60Var2.a);
                    g43Var = g43Var2;
                    l60 l60Var4 = g43Var != g43.m ? l60Var : l60Var3;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = l60Var3.b;
                    fArr2[i3] = -f6;
                    if (i4 == 0) {
                        i4 = 20;
                    }
                    int i5 = i4 - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    l60Var2 = l60Var4;
                    i2 = i5;
                    f5 = f2;
                } else {
                    f2 = f5;
                    g43Var = g43Var2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.b) {
                int ordinal = g43Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.g;
                        ph2.j(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        a.b();
                        return f2;
                    }
                    int i6 = i3 - i;
                    float f7 = fArr2[i6];
                    int i7 = i6;
                    float f8 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f9 = fArr2[i8];
                        if (f7 != f9) {
                            float f10 = (fArr[i7] - fArr[i8]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i7 == i6) {
                                f8 *= 0.5f;
                            }
                        }
                        i7--;
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
}
