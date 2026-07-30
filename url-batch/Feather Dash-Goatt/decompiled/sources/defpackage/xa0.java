package defpackage;

import android.text.Spanned;
import android.util.Log;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class xa0 implements nn1 {
    public static final long a(int i) {
        long j = i << 32;
        int i2 = fc0.p;
        return j;
    }

    public static final void b(am0 am0Var, wf0 wf0Var, ku0 ku0Var, final j9 j9Var, id idVar, xp xpVar, boolean z, i5 i5Var, final Function1 function1, hl hlVar, final int i) {
        final am0 am0Var2;
        final wf0 wf0Var2;
        final ku0 ku0Var2;
        final id idVar2;
        final xp xpVar2;
        final boolean z2;
        final i5 i5Var2;
        wf0 wf0Var3;
        i5 i5Var3;
        xp xpVar3;
        int i2;
        am0 am0Var3;
        ku0 ku0Var3;
        i5 i5Var4;
        hlVar.Y(53695811);
        int i3 = i | 46861718 | (hlVar.h(function1) ? 536870912 : 268435456);
        boolean z3 = true;
        if (hlVar.O(i3 & 1, (306783379 & i3) != 306783378)) {
            hlVar.T();
            if ((i & 1) == 0 || hlVar.y()) {
                rf0 rf0Var = yf0.a;
                Object[] objArr = new Object[0];
                c51 c51Var = wf0.x;
                boolean d = hlVar.d(0) | hlVar.d(0);
                Object L = hlVar.L();
                Object obj = bl.a;
                if (d || L == obj) {
                    L = new dd(7);
                    hlVar.h0(L);
                }
                wf0Var3 = (wf0) y90.z(objArr, c51Var, (Function0) L, hlVar, 0);
                ku0 ku0Var4 = new ku0();
                idVar2 = j50.s;
                float f = mc1.a;
                nr nrVar = (nr) hlVar.j(yl.h);
                boolean c = hlVar.c(nrVar.k());
                Object L2 = hlVar.L();
                if (c || L2 == obj) {
                    L2 = new qp(new nq0(nrVar));
                    hlVar.h0(L2);
                }
                qp qpVar = (qp) L2;
                boolean f2 = hlVar.f(qpVar);
                Object L3 = hlVar.L();
                if (f2 || L3 == obj) {
                    L3 = new xp(qpVar);
                    hlVar.h0(L3);
                }
                xp xpVar4 = (xp) L3;
                zl zlVar = cu0.a;
                hlVar.W(282942128);
                j5 j5Var = (j5) hlVar.j(cu0.a);
                if (j5Var == null) {
                    hlVar.p(false);
                    i5Var3 = null;
                } else {
                    boolean f3 = hlVar.f(j5Var);
                    Object L4 = hlVar.L();
                    if (f3 || L4 == obj) {
                        Object i5Var5 = new i5(j5Var.a, j5Var.b, j5Var.c, j5Var.d);
                        hlVar.h0(i5Var5);
                        L4 = i5Var5;
                    }
                    i5Var3 = (i5) L4;
                    hlVar.p(false);
                }
                xpVar3 = xpVar4;
                i2 = i3 & (-238551153);
                am0Var3 = xl0.a;
                ku0Var3 = ku0Var4;
                i5Var4 = i5Var3;
            } else {
                hlVar.R();
                wf0Var3 = wf0Var;
                ku0Var3 = ku0Var;
                idVar2 = idVar;
                xpVar3 = xpVar;
                z3 = z;
                i5Var4 = i5Var;
                i2 = i3 & (-238551153);
                am0Var3 = am0Var;
            }
            hlVar.q();
            ca0.a(am0Var3, wf0Var3, ku0Var3, xpVar3, z3, i5Var4, idVar2, j9Var, function1, hlVar, 806907270, 6 | ((i2 >> 18) & 7168));
            xpVar2 = xpVar3;
            z2 = z3;
            i5Var2 = i5Var4;
            wf0Var2 = wf0Var3;
            ku0Var2 = ku0Var3;
            am0Var2 = am0Var3;
        } else {
            hlVar.R();
            am0Var2 = am0Var;
            wf0Var2 = wf0Var;
            ku0Var2 = ku0Var;
            idVar2 = idVar;
            xpVar2 = xpVar;
            z2 = z;
            i5Var2 = i5Var;
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new Function2(wf0Var2, ku0Var2, j9Var, idVar2, xpVar2, z2, i5Var2, function1, i) { // from class: ce0
                public final /* synthetic */ wf0 e;
                public final /* synthetic */ ku0 g;
                public final /* synthetic */ j9 h;
                public final /* synthetic */ id i;
                public final /* synthetic */ xp j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ i5 l;
                public final /* synthetic */ Function1 m;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int P = gb0.P(24577);
                    xa0.b(am0.this, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (hl) obj2, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final l41 c(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new l41(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final l81 d(jd0 jd0Var, boolean z) {
        zl0 zl0Var = (zl0) jd0Var.J.g;
        yq yqVar = null;
        if ((zl0Var.h & 8) != 0) {
            loop0: while (true) {
                if (zl0Var == null) {
                    break;
                }
                if ((zl0Var.g & 8) != 0) {
                    zl0 zl0Var2 = zl0Var;
                    eo0 eo0Var = null;
                    while (zl0Var2 != null) {
                        if (zl0Var2 instanceof j81) {
                            yqVar = zl0Var2;
                            break loop0;
                        }
                        if ((zl0Var2.g & 8) != 0 && (zl0Var2 instanceof zq)) {
                            int i = 0;
                            for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                if ((zl0Var3.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        zl0Var2 = zl0Var3;
                                    } else {
                                        if (eo0Var == null) {
                                            eo0Var = new eo0(new zl0[16]);
                                        }
                                        if (zl0Var2 != null) {
                                            eo0Var.b(zl0Var2);
                                            zl0Var2 = null;
                                        }
                                        eo0Var.b(zl0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        zl0Var2 = op.o(eo0Var);
                    }
                }
                if ((zl0Var.h & 8) == 0) {
                    break;
                }
                zl0Var = zl0Var.j;
            }
        }
        yqVar.getClass();
        zl0 zl0Var4 = ((zl0) ((j81) yqVar)).d;
        h81 v = jd0Var.v();
        if (v == null) {
            v = new h81();
        }
        return new l81(zl0Var4, z, jd0Var, v);
    }

    public static final Object[] e(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        w9.e(objArr, objArr2, 0, i, 6);
        w9.c(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        w9.e(objArr, objArr2, 0, i, 6);
        w9.c(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        w9.e(objArr, objArr2, 0, i, 6);
        w9.c(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static void h(db1 db1Var, List list, tl tlVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int c = db1Var.c((d3) list.get(i));
            int N = db1Var.N(db1Var.b, db1Var.r(c));
            Object obj = N < db1Var.g(db1Var.b, db1Var.r(c + 1)) ? db1Var.c[db1Var.h(N)] : bl.a;
            i11 i11Var = obj instanceof i11 ? (i11) obj : null;
            if (i11Var != null) {
                i11Var.a = tlVar;
            }
        }
    }

    public static final void i(tn1 tn1Var, c51 c51Var, xg0 xg0Var) {
        c51Var.getClass();
        xg0Var.getClass();
        y51 y51Var = (y51) tn1Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (y51Var == null || y51Var.g) {
            return;
        }
        y51Var.d(xg0Var, c51Var);
        og0 og0Var = xg0Var.c;
        if (og0Var == og0.e || og0Var.compareTo(og0.h) >= 0) {
            c51Var.l();
        } else {
            xg0Var.a(new kq(xg0Var, c51Var));
        }
    }

    public static final int j(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static void k(String str, String str2, Object obj) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, String.format(str2, obj));
        }
    }

    public static void l(String str, String str2, Exception exc) {
        String concat = "TRuntime.".concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean n(long j, long j2) {
        return j == j2;
    }

    public static final boolean o(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final int p(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean q(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static boolean r(byte b) {
        return b > -65;
    }

    public static gy0 s(String str, nq0 nq0Var, eb0 eb0Var, int i) {
        if ((i & 2) != 0) {
            nq0Var = null;
        }
        Function1 function1 = eb0Var;
        if ((i & 4) != 0) {
            function1 = y3.I;
        }
        nq nqVar = ls.a;
        fq fqVar = fq.g;
        kf1 c = ca0.c();
        fqVar.getClass();
        return new gy0(str, nq0Var, function1, la0.f(e.c(fqVar, c)));
    }

    public static sl0 t(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    sl0 sl0Var = new sl0();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    sl0Var.h = duplicate;
                    sl0Var.d = position;
                    int i6 = position - duplicate.getInt(position);
                    sl0Var.e = i6;
                    sl0Var.g = ((ByteBuffer) sl0Var.h).getShort(i6);
                    return sl0Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final String u(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static final long v(s11 s11Var) {
        float f = s11Var.c - s11Var.a;
        float f2 = s11Var.d - s11Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long w(String str, long j, long j2, long j3) {
        String str2;
        int i = hg1.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long r = StringsKt.r(str2);
        if (r == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = r.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static int x(String str, int i, int i2) {
        return (int) w(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final long y(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static String z(long j) {
        return "PointerId(value=" + j + ')';
    }
}
