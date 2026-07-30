package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mf1 implements Function2 {
    public final /* synthetic */ u91 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ hk i;

    public mf1(u91 u91Var, long j, float f, float f2, hk hkVar) {
        this.d = u91Var;
        this.e = j;
        this.g = f;
        this.h = f2;
        this.i = hkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        boolean z;
        u91 u91Var;
        xl0 xl0Var;
        am0 am0Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        hl hlVar = (hl) obj;
        int intValue = ((Number) obj2).intValue();
        if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
            mi miVar = (mi) hlVar.j(oi.a);
            boolean booleanValue = ((Boolean) hlVar.j(oi.b)).booleanValue();
            long j = miVar.p;
            long j2 = this.e;
            if (hi.c(j2, j) && booleanValue) {
                if (!bt.a(this.g, 0.0f)) {
                    long a = hi.a(hi.b(((((float) Math.log(r3 + 1.0f)) * 4.5f) + 2.0f) / 100.0f, miVar.t), hi.f(j));
                    float d = hi.d(j);
                    float d2 = hi.d(a);
                    float f = 1.0f - d2;
                    float f2 = (d * f) + d2;
                    float h = f2 == 0.0f ? 0.0f : (((hi.h(j) * d) * f) + (hi.h(a) * d2)) / f2;
                    float g = f2 == 0.0f ? 0.0f : (((hi.g(j) * d) * f) + (hi.g(a) * d2)) / f2;
                    float e = f2 == 0.0f ? 0.0f : (((hi.e(j) * d) * f) + (hi.e(a) * d2)) / f2;
                    if (hi.f(j).c()) {
                        jk1 jk1Var = kk1.d;
                        j = (((int) ((e * 255.0f) + 0.5f)) | (((((int) ((f2 * 255.0f) + 0.5f)) << 24) | (((int) ((h * 255.0f) + 0.5f)) << 16)) | (((int) ((g * 255.0f) + 0.5f)) << 8))) << 32;
                    } else {
                        int floatToRawIntBits = Float.floatToRawIntBits(h);
                        int i11 = floatToRawIntBits >>> 31;
                        int i12 = (floatToRawIntBits >>> 23) & 255;
                        int i13 = floatToRawIntBits & 8388607;
                        int i14 = 49;
                        if (i12 == 255) {
                            i2 = i13 != 0 ? 512 : 0;
                            i = 31;
                        } else {
                            i = i12 - 112;
                            if (i >= 31) {
                                i2 = 0;
                                i = 49;
                            } else if (i > 0) {
                                int i15 = i13 >> 13;
                                if ((floatToRawIntBits & 4096) != 0) {
                                    i3 = (((i << 10) | i15) + 1) | (i11 << 15);
                                    short s = (short) i3;
                                    int floatToRawIntBits2 = Float.floatToRawIntBits(g);
                                    int i16 = floatToRawIntBits2 >>> 31;
                                    z = true;
                                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                                    int i17 = floatToRawIntBits2 & 8388607;
                                    if (i4 != 255) {
                                        i6 = i17 != 0 ? 512 : 0;
                                        i5 = 31;
                                    } else {
                                        i5 = i4 - 112;
                                        if (i5 >= 31) {
                                            i6 = 0;
                                            i5 = 49;
                                        } else if (i5 > 0) {
                                            i6 = i17 >> 13;
                                            if ((floatToRawIntBits2 & 4096) != 0) {
                                                i7 = (((i5 << 10) | i6) + 1) | (i16 << 15);
                                                short s2 = (short) i7;
                                                int floatToRawIntBits3 = Float.floatToRawIntBits(e);
                                                int i18 = floatToRawIntBits3 >>> 31;
                                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                                int i19 = floatToRawIntBits3 & 8388607;
                                                if (i8 == 255) {
                                                    i9 = i19 == 0 ? 0 : 512;
                                                    i14 = 31;
                                                } else {
                                                    int i20 = i8 - 112;
                                                    if (i20 >= 31) {
                                                        i9 = 0;
                                                    } else if (i20 > 0) {
                                                        i9 = i19 >> 13;
                                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                                            i10 = (((i20 << 10) | i9) + 1) | (i18 << 15);
                                                            j = ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((short) i10) & 65535) << 16) | (r2.c & 63);
                                                            jk1 jk1Var2 = kk1.d;
                                                        } else {
                                                            i14 = i20;
                                                        }
                                                    } else if (i20 >= -10) {
                                                        int i21 = (i19 | 8388608) >> (1 - i20);
                                                        if ((i21 & 4096) != 0) {
                                                            i21 += 8192;
                                                        }
                                                        i9 = i21 >> 13;
                                                        i14 = 0;
                                                    } else {
                                                        i14 = 0;
                                                        i9 = 0;
                                                    }
                                                }
                                                i10 = (i18 << 15) | (i14 << 10) | i9;
                                                j = ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((short) i10) & 65535) << 16) | (r2.c & 63);
                                                jk1 jk1Var22 = kk1.d;
                                            }
                                        } else if (i5 >= -10) {
                                            int i22 = (i17 | 8388608) >> (1 - i5);
                                            if ((i22 & 4096) != 0) {
                                                i22 += 8192;
                                            }
                                            i6 = i22 >> 13;
                                            i5 = 0;
                                        } else {
                                            i5 = 0;
                                            i6 = 0;
                                        }
                                    }
                                    i7 = (i5 << 10) | (i16 << 15) | i6;
                                    short s22 = (short) i7;
                                    int floatToRawIntBits32 = Float.floatToRawIntBits(e);
                                    int i182 = floatToRawIntBits32 >>> 31;
                                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                                    int i192 = floatToRawIntBits32 & 8388607;
                                    if (i8 == 255) {
                                    }
                                    i10 = (i182 << 15) | (i14 << 10) | i9;
                                    j = ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((short) i10) & 65535) << 16) | (r2.c & 63);
                                    jk1 jk1Var222 = kk1.d;
                                } else {
                                    i2 = i15;
                                }
                            } else if (i >= -10) {
                                int i23 = (i13 | 8388608) >> (1 - i);
                                if ((i23 & 4096) != 0) {
                                    i23 += 8192;
                                }
                                i2 = i23 >> 13;
                                i = 0;
                            } else {
                                i2 = 0;
                                i = 0;
                            }
                        }
                        i3 = i2 | (i11 << 15) | (i << 10);
                        short s3 = (short) i3;
                        int floatToRawIntBits22 = Float.floatToRawIntBits(g);
                        int i162 = floatToRawIntBits22 >>> 31;
                        z = true;
                        i4 = (floatToRawIntBits22 >>> 23) & 255;
                        int i172 = floatToRawIntBits22 & 8388607;
                        if (i4 != 255) {
                        }
                        i7 = (i5 << 10) | (i162 << 15) | i6;
                        short s222 = (short) i7;
                        int floatToRawIntBits322 = Float.floatToRawIntBits(e);
                        int i1822 = floatToRawIntBits322 >>> 31;
                        i8 = (floatToRawIntBits322 >>> 23) & 255;
                        int i1922 = floatToRawIntBits322 & 8388607;
                        if (i8 == 255) {
                        }
                        i10 = (i1822 << 15) | (i14 << 10) | i9;
                        j = ((((int) ((Math.max(0.0f, Math.min(f2, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((short) i10) & 65535) << 16) | (r2.c & 63);
                        jk1 jk1Var2222 = kk1.d;
                    }
                }
                z = true;
            } else {
                z = true;
                j = j2;
            }
            float s4 = ((nr) hlVar.j(yl.h)).s(this.h);
            xl0 xl0Var2 = xl0.a;
            u91 u91Var2 = this.d;
            if (s4 > 0.0f) {
                long j3 = aj1.a;
                long j4 = o50.a;
                am0Var = mo.u(xl0Var2, 1.0f, s4, j3, u91Var2, false, j4, j4);
                xl0Var = xl0Var2;
                u91Var = u91Var2;
            } else {
                u91Var = u91Var2;
                xl0Var = xl0Var2;
                am0Var = xl0Var;
            }
            am0 h2 = mo.h(mo.g(am0Var.c(xl0Var), j, u91Var), u91Var);
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (L == j41Var) {
                L = new k61(11);
                hlVar.h0(L);
            }
            am0 a2 = i81.a(h2, false, (Function1) L);
            Unit unit = Unit.a;
            Object L2 = hlVar.L();
            if (L2 == j41Var) {
                L2 = lf1.a;
                hlVar.h0(L2);
            }
            mx0 mx0Var = uf1.a;
            am0 c = a2.c(new tf1(unit, null, (PointerInputEventHandler) L2, 6));
            vk0 d3 = vd.d(j50.g, z);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l = hlVar.l();
            am0 N = p4.N(hlVar, c);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d3, xk.e);
            ka0.C(hlVar, l, xk.d);
            e7 e7Var = xk.f;
            if (hlVar.S || !Intrinsics.a(hlVar.L(), Integer.valueOf(hashCode))) {
                hlVar.h0(Integer.valueOf(hashCode));
                hlVar.b(Integer.valueOf(hashCode), e7Var);
            }
            ka0.C(hlVar, N, xk.c);
            this.i.b(hlVar, 0);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        return Unit.a;
    }
}
