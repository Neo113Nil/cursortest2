package defpackage;

import android.widget.EdgeEffect;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b81 {
    public final /* synthetic */ d81 a;

    public b81(d81 d81Var) {
        this.a = d81Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(int i, long j) {
        long j2;
        float intBitsToFloat;
        int i2;
        float g;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long d;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        d81 d81Var = this.a;
        d81Var.j = i;
        i5 i5Var = d81Var.b;
        if (i5Var == null || !(d81Var.a.d() || d81Var.a.a())) {
            return d81Var.c(d81Var.k, j, i);
        }
        int i4 = d81Var.j;
        l lVar = d81Var.m;
        su suVar = i5Var.c;
        if (va1.c(i5Var.g)) {
            d81 d81Var2 = (d81) lVar.e;
            return new wq0(d81Var2.c(d81Var2.k, j, d81Var2.j)).a;
        }
        if (!i5Var.f) {
            if (su.g(suVar.f)) {
                i5Var.f(0L);
            }
            if (su.g(suVar.g)) {
                i5Var.g(0L);
            }
            if (su.g(suVar.d)) {
                i5Var.h(0L);
            }
            if (su.g(suVar.e)) {
                i5Var.e(0L);
            }
            i5Var.f = true;
        }
        int i5 = v5.a;
        float f = i4 == 2 ? 4.0f : 1.0f;
        long f2 = wq0.f(f, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!su.g(suVar.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (su.g(suVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float e = i5Var.e(f2);
                    if (!su.g(suVar.e)) {
                        suVar.b().finish();
                    }
                    intBitsToFloat = e == Float.intBitsToFloat((int) (f2 & 4294967295L)) ? Float.intBitsToFloat(i6) : e / f;
                }
            } else {
                float h = i5Var.h(f2);
                j2 = 4294967295L;
                if (!su.g(suVar.d)) {
                    suVar.e().finish();
                }
                intBitsToFloat = h == Float.intBitsToFloat((int) (f2 & 4294967295L)) ? Float.intBitsToFloat(i6) : h / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (su.g(suVar.f) && Float.intBitsToFloat(i2) < 0.0f) {
                    g = i5Var.f(f2);
                    if (!su.g(suVar.f)) {
                        suVar.c().finish();
                    }
                    if (g == Float.intBitsToFloat((int) (f2 >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = g / f;
                } else if (su.g(suVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    g = i5Var.g(f2);
                    if (!su.g(suVar.g)) {
                        suVar.d().finish();
                    }
                    if (g == Float.intBitsToFloat((int) (f2 >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = g / f;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
                if (!wq0.b(floatToRawIntBits, 0L)) {
                    i5Var.d();
                }
                d = wq0.d(j, floatToRawIntBits);
                d81 d81Var3 = (d81) lVar.e;
                long j3 = new wq0(d81Var3.c(d81Var3.k, d, d81Var3.j)).a;
                long d2 = wq0.d(d, j3);
                if ((Float.intBitsToFloat((int) (d >> 32)) == 0.0f || Float.intBitsToFloat((int) (d & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (su.g(suVar.f) || su.g(suVar.d) || su.g(suVar.g) || su.g(suVar.e)))) {
                    i5Var.a();
                }
                if (i4 == 1) {
                    int i7 = (int) (d2 >> 32);
                    if (Float.intBitsToFloat(i7) > 0.5f) {
                        i5Var.f(d2);
                    } else {
                        if (Float.intBitsToFloat(i7) >= -0.5f) {
                            z3 = false;
                            i3 = (int) (d2 & j2);
                            if (Float.intBitsToFloat(i3) <= 0.5f) {
                                i5Var.h(d2);
                            } else if (Float.intBitsToFloat(i3) < -0.5f) {
                                i5Var.e(d2);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (!wq0.b(d, 0L)) {
                                        if (!su.f(suVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                                            z2 = false;
                                        } else {
                                            EdgeEffect c = suVar.c();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i2);
                                            if (c instanceof z40) {
                                                z40 z40Var = (z40) c;
                                                float f3 = z40Var.b + intBitsToFloat3;
                                                z40Var.b = f3;
                                                if (Math.abs(f3) > z40Var.a) {
                                                    z40Var.onRelease();
                                                }
                                            } else {
                                                c.onRelease();
                                            }
                                            z2 = su.f(suVar.f);
                                        }
                                        if (su.f(suVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                                            EdgeEffect d3 = suVar.d();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i2);
                                            if (d3 instanceof z40) {
                                                z40 z40Var2 = (z40) d3;
                                                float f4 = z40Var2.b + intBitsToFloat4;
                                                z40Var2.b = f4;
                                                if (Math.abs(f4) > z40Var2.a) {
                                                    z40Var2.onRelease();
                                                }
                                            } else {
                                                d3.onRelease();
                                            }
                                            z2 = z2 || su.f(suVar.g);
                                        }
                                        if (su.f(suVar.d) && Float.intBitsToFloat(i6) < 0.0f) {
                                            EdgeEffect e2 = suVar.e();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i6);
                                            if (e2 instanceof z40) {
                                                z40 z40Var3 = (z40) e2;
                                                float f5 = z40Var3.b + intBitsToFloat5;
                                                z40Var3.b = f5;
                                                if (Math.abs(f5) > z40Var3.a) {
                                                    z40Var3.onRelease();
                                                }
                                            } else {
                                                e2.onRelease();
                                            }
                                            z2 = z2 || su.f(suVar.d);
                                        }
                                        if (su.f(suVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                                            EdgeEffect b = suVar.b();
                                            float intBitsToFloat6 = Float.intBitsToFloat(i6);
                                            if (b instanceof z40) {
                                                z40 z40Var4 = (z40) b;
                                                float f6 = z40Var4.b + intBitsToFloat6;
                                                z40Var4.b = f6;
                                                if (Math.abs(f6) > z40Var4.a) {
                                                    z40Var4.onRelease();
                                                }
                                            } else {
                                                b.onRelease();
                                            }
                                            z2 = z2 || su.f(suVar.e);
                                        }
                                        z = z2 || z;
                                    }
                                    if (z) {
                                        i5Var.d();
                                    }
                                    return wq0.e(floatToRawIntBits, j3);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (!wq0.b(d, 0L)) {
                            }
                            if (z) {
                            }
                            return wq0.e(floatToRawIntBits, j3);
                        }
                        i5Var.g(d2);
                    }
                    z3 = true;
                    i3 = (int) (d2 & j2);
                    if (Float.intBitsToFloat(i3) <= 0.5f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (!wq0.b(d, 0L)) {
                    }
                    if (z) {
                    }
                    return wq0.e(floatToRawIntBits, j3);
                }
                z = false;
                if (!wq0.b(d, 0L)) {
                }
                if (z) {
                }
                return wq0.e(floatToRawIntBits, j3);
            }
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
            if (!wq0.b(floatToRawIntBits, 0L)) {
            }
            d = wq0.d(j, floatToRawIntBits);
            d81 d81Var32 = (d81) lVar.e;
            long j32 = new wq0(d81Var32.c(d81Var32.k, d, d81Var32.j)).a;
            long d22 = wq0.d(d, j32);
            if (Float.intBitsToFloat((int) (d >> 32)) == 0.0f) {
            }
            i5Var.a();
            if (i4 == 1) {
            }
            z = false;
            if (!wq0.b(d, 0L)) {
            }
            if (z) {
            }
            return wq0.e(floatToRawIntBits, j32);
        }
        j2 = 4294967295L;
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        if (!wq0.b(floatToRawIntBits, 0L)) {
        }
        d = wq0.d(j, floatToRawIntBits);
        d81 d81Var322 = (d81) lVar.e;
        long j322 = new wq0(d81Var322.c(d81Var322.k, d, d81Var322.j)).a;
        long d222 = wq0.d(d, j322);
        if (Float.intBitsToFloat((int) (d >> 32)) == 0.0f) {
        }
        i5Var.a();
        if (i4 == 1) {
        }
        z = false;
        if (!wq0.b(d, 0L)) {
        }
        if (z) {
        }
        return wq0.e(floatToRawIntBits, j322);
    }
}
