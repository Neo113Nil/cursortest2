package u;

import android.widget.EdgeEffect;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f6948a;

    public c1(e1 e1Var) {
        this.f6948a = e1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(int i, long j7) {
        long j8;
        long j9;
        float intBitsToFloat;
        int i8;
        char c8;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long d8;
        boolean z3;
        boolean z7;
        boolean z8;
        int i9;
        boolean z9;
        e1 e1Var = this.f6948a;
        e1Var.f6970j = i;
        t.j jVar = e1Var.f6963b;
        if (jVar == null || !(e1Var.f6962a.d() || e1Var.f6962a.a())) {
            return e1Var.c(e1Var.f6971k, j7, i);
        }
        int i10 = e1Var.f6970j;
        a0.t tVar = e1Var.f6973m;
        t.a0 a0Var = jVar.f6788c;
        if (e1.e.c(jVar.f6792g)) {
            e1 e1Var2 = (e1) tVar.f142e;
            return new e1.b(e1Var2.c(e1Var2.f6971k, j7, e1Var2.f6970j)).f2455a;
        }
        if (!jVar.f6791f) {
            if (t.a0.g(a0Var.f6742f)) {
                jVar.f(0L);
            }
            if (t.a0.g(a0Var.f6743g)) {
                jVar.g(0L);
            }
            if (t.a0.g(a0Var.f6740d)) {
                jVar.h(0L);
            }
            if (t.a0.g(a0Var.f6741e)) {
                jVar.e(0L);
            }
            jVar.f6791f = true;
        }
        int i11 = t.l.f6801a;
        float f6 = i10 == 2 ? 4.0f : 1.0f;
        long f8 = e1.b.f(j7, f6);
        int i12 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i12) != 0.0f) {
            if (!t.a0.g(a0Var.f6740d) || Float.intBitsToFloat(i12) >= 0.0f) {
                j8 = 4294967295L;
                if (!t.a0.g(a0Var.f6741e) || Float.intBitsToFloat(i12) <= 0.0f) {
                    j9 = f8;
                } else {
                    float e8 = jVar.e(f8);
                    if (!t.a0.g(a0Var.f6741e)) {
                        a0Var.b().finish();
                    }
                    j9 = f8;
                    intBitsToFloat = e8 == Float.intBitsToFloat((int) (j9 & 4294967295L)) ? Float.intBitsToFloat(i12) : e8 / f6;
                }
            } else {
                float h8 = jVar.h(f8);
                j8 = 4294967295L;
                if (!t.a0.g(a0Var.f6740d)) {
                    a0Var.e().finish();
                }
                intBitsToFloat = h8 == Float.intBitsToFloat((int) (f8 & 4294967295L)) ? Float.intBitsToFloat(i12) : h8 / f6;
                j9 = f8;
            }
            i8 = (int) (j7 >> 32);
            if (Float.intBitsToFloat(i8) == 0.0f) {
                if (!t.a0.g(a0Var.f6742f) || Float.intBitsToFloat(i8) >= 0.0f) {
                    long j10 = j9;
                    c8 = ' ';
                    if (t.a0.g(a0Var.f6743g) && Float.intBitsToFloat(i8) > 0.0f) {
                        float g3 = jVar.g(j10);
                        if (!t.a0.g(a0Var.f6743g)) {
                            a0Var.d().finish();
                        }
                        intBitsToFloat2 = g3 == Float.intBitsToFloat((int) (j10 >> 32)) ? Float.intBitsToFloat(i8) : g3 / f6;
                    }
                } else {
                    long j11 = j9;
                    float f9 = jVar.f(j11);
                    c8 = ' ';
                    if (!t.a0.g(a0Var.f6742f)) {
                        a0Var.c().finish();
                    }
                    intBitsToFloat2 = f9 == Float.intBitsToFloat((int) (j11 >> 32)) ? Float.intBitsToFloat(i8) : f9 / f6;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & j8) | (Float.floatToRawIntBits(intBitsToFloat2) << c8);
                if (!e1.b.b(floatToRawIntBits, 0L)) {
                    jVar.d();
                }
                d8 = e1.b.d(j7, floatToRawIntBits);
                e1 e1Var3 = (e1) tVar.f142e;
                long j12 = new e1.b(e1Var3.c(e1Var3.f6971k, d8, e1Var3.f6970j)).f2455a;
                long d9 = e1.b.d(d8, j12);
                if ((Float.intBitsToFloat((int) (d8 >> c8)) == 0.0f || Float.intBitsToFloat((int) (d8 & j8)) != 0.0f) && ((Float.intBitsToFloat((int) (j12 >> c8)) != 0.0f || Float.intBitsToFloat((int) (j12 & j8)) != 0.0f) && (t.a0.g(a0Var.f6742f) || t.a0.g(a0Var.f6740d) || t.a0.g(a0Var.f6743g) || t.a0.g(a0Var.f6741e)))) {
                    jVar.a();
                }
                if (i10 == 1) {
                    int i13 = (int) (d9 >> c8);
                    if (Float.intBitsToFloat(i13) > 0.5f) {
                        jVar.f(d9);
                    } else {
                        if (Float.intBitsToFloat(i13) >= -0.5f) {
                            z8 = false;
                            i9 = (int) (d9 & j8);
                            if (Float.intBitsToFloat(i9) <= 0.5f) {
                                jVar.h(d9);
                            } else if (Float.intBitsToFloat(i9) < -0.5f) {
                                jVar.e(d9);
                            } else {
                                z9 = false;
                                if (!z8 || z9) {
                                    z3 = true;
                                    if (!e1.b.b(d8, 0L)) {
                                        if (!t.a0.f(a0Var.f6742f) || Float.intBitsToFloat(i8) >= 0.0f) {
                                            z7 = false;
                                        } else {
                                            EdgeEffect c9 = a0Var.c();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i8);
                                            if (c9 instanceof t.e0) {
                                                t.e0 e0Var = (t.e0) c9;
                                                float f10 = e0Var.f6768b + intBitsToFloat3;
                                                e0Var.f6768b = f10;
                                                if (Math.abs(f10) > e0Var.f6767a) {
                                                    e0Var.onRelease();
                                                }
                                            } else {
                                                c9.onRelease();
                                            }
                                            z7 = t.a0.f(a0Var.f6742f);
                                        }
                                        if (t.a0.f(a0Var.f6743g) && Float.intBitsToFloat(i8) > 0.0f) {
                                            EdgeEffect d10 = a0Var.d();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i8);
                                            if (d10 instanceof t.e0) {
                                                t.e0 e0Var2 = (t.e0) d10;
                                                float f11 = e0Var2.f6768b + intBitsToFloat4;
                                                e0Var2.f6768b = f11;
                                                if (Math.abs(f11) > e0Var2.f6767a) {
                                                    e0Var2.onRelease();
                                                }
                                            } else {
                                                d10.onRelease();
                                            }
                                            z7 = z7 || t.a0.f(a0Var.f6743g);
                                        }
                                        if (t.a0.f(a0Var.f6740d) && Float.intBitsToFloat(i12) < 0.0f) {
                                            EdgeEffect e9 = a0Var.e();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i12);
                                            if (e9 instanceof t.e0) {
                                                t.e0 e0Var3 = (t.e0) e9;
                                                float f12 = e0Var3.f6768b + intBitsToFloat5;
                                                e0Var3.f6768b = f12;
                                                if (Math.abs(f12) > e0Var3.f6767a) {
                                                    e0Var3.onRelease();
                                                }
                                            } else {
                                                e9.onRelease();
                                            }
                                            z7 = z7 || t.a0.f(a0Var.f6740d);
                                        }
                                        if (t.a0.f(a0Var.f6741e) && Float.intBitsToFloat(i12) > 0.0f) {
                                            EdgeEffect b8 = a0Var.b();
                                            float intBitsToFloat6 = Float.intBitsToFloat(i12);
                                            if (b8 instanceof t.e0) {
                                                t.e0 e0Var4 = (t.e0) b8;
                                                float f13 = e0Var4.f6768b + intBitsToFloat6;
                                                e0Var4.f6768b = f13;
                                                if (Math.abs(f13) > e0Var4.f6767a) {
                                                    e0Var4.onRelease();
                                                }
                                            } else {
                                                b8.onRelease();
                                            }
                                            z7 = z7 || t.a0.f(a0Var.f6741e);
                                        }
                                        z3 = z7 || z3;
                                    }
                                    if (z3) {
                                        jVar.d();
                                    }
                                    return e1.b.e(floatToRawIntBits, j12);
                                }
                            }
                            z9 = true;
                            if (!z8) {
                            }
                            z3 = true;
                            if (!e1.b.b(d8, 0L)) {
                            }
                            if (z3) {
                            }
                            return e1.b.e(floatToRawIntBits, j12);
                        }
                        jVar.g(d9);
                    }
                    z8 = true;
                    i9 = (int) (d9 & j8);
                    if (Float.intBitsToFloat(i9) <= 0.5f) {
                    }
                    z9 = true;
                    if (!z8) {
                    }
                    z3 = true;
                    if (!e1.b.b(d8, 0L)) {
                    }
                    if (z3) {
                    }
                    return e1.b.e(floatToRawIntBits, j12);
                }
                z3 = false;
                if (!e1.b.b(d8, 0L)) {
                }
                if (z3) {
                }
                return e1.b.e(floatToRawIntBits, j12);
            }
            c8 = ' ';
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & j8) | (Float.floatToRawIntBits(intBitsToFloat2) << c8);
            if (!e1.b.b(floatToRawIntBits, 0L)) {
            }
            d8 = e1.b.d(j7, floatToRawIntBits);
            e1 e1Var32 = (e1) tVar.f142e;
            long j122 = new e1.b(e1Var32.c(e1Var32.f6971k, d8, e1Var32.f6970j)).f2455a;
            long d92 = e1.b.d(d8, j122);
            if (Float.intBitsToFloat((int) (d8 >> c8)) == 0.0f) {
            }
            jVar.a();
            if (i10 == 1) {
            }
            z3 = false;
            if (!e1.b.b(d8, 0L)) {
            }
            if (z3) {
            }
            return e1.b.e(floatToRawIntBits, j122);
        }
        j9 = f8;
        j8 = 4294967295L;
        intBitsToFloat = 0.0f;
        i8 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i8) == 0.0f) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) & j8) | (Float.floatToRawIntBits(intBitsToFloat2) << c8);
        if (!e1.b.b(floatToRawIntBits, 0L)) {
        }
        d8 = e1.b.d(j7, floatToRawIntBits);
        e1 e1Var322 = (e1) tVar.f142e;
        long j1222 = new e1.b(e1Var322.c(e1Var322.f6971k, d8, e1Var322.f6970j)).f2455a;
        long d922 = e1.b.d(d8, j1222);
        if (Float.intBitsToFloat((int) (d8 >> c8)) == 0.0f) {
        }
        jVar.a();
        if (i10 == 1) {
        }
        z3 = false;
        if (!e1.b.b(d8, 0L)) {
        }
        if (z3) {
        }
        return e1.b.e(floatToRawIntBits, j1222);
    }
}
