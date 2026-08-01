package j0;

import android.R;
import android.content.Context;
import b0.w0;
import com.appsflyer.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.i0;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final i0.b f4897a = new i0.b();

    public static final void a(final int i3, d1.l lVar, g gVar, k1.f0 f0Var, final Function0 function0, i0 i0Var, boolean z10) {
        final d1.l lVar2;
        final g gVar2;
        final k1.f0 f0Var2;
        final boolean z11;
        g gVar3;
        k1.f0 f0Var3;
        k1.f0 f0Var4;
        d1.l lVar3;
        g gVar4;
        boolean z12;
        i0Var.X(1413012038);
        int i10 = i3 | 91568;
        if (i0Var.O(i10 & 1, (599187 & i10) != 599186)) {
            i0Var.T();
            if ((i3 & 1) == 0 || i0Var.y()) {
                long j = ((k1.p) i0Var.j(d.f4803a)).f5342a;
                a aVar = (a) i0Var.j(b.f4788a);
                g gVar5 = aVar.V;
                if (gVar5 == null) {
                    long j3 = k1.p.f5340f;
                    g gVar6 = new g(j3, j, j3, k1.p.b(j, m0.h.f6309a));
                    aVar.V = gVar6;
                    gVar5 = gVar6;
                }
                long j10 = gVar5.f4856b;
                if (k1.p.c(j10, j)) {
                    gVar3 = gVar5;
                } else {
                    long b10 = k1.p.b(j, m0.h.f6309a);
                    long j11 = gVar5.f4855a;
                    long j12 = gVar5.f4857c;
                    if (j == 16) {
                        j = j10;
                    }
                    if (b10 == 16) {
                        b10 = gVar5.f4858d;
                    }
                    gVar3 = new g(j11, j, j12, b10);
                }
                m0.e eVar = m0.g.f6306b;
                a0 a0Var = (a0) i0Var.j(b0.f4789a);
                switch (eVar.ordinal()) {
                    case 0:
                        f0Var3 = a0Var.f4787h;
                        break;
                    case 1:
                        f0Var3 = a0Var.f4785e;
                        break;
                    case 2:
                        f0Var3 = a0Var.g;
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        f0Var3 = b0.a(a0Var.f4785e);
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        f0Var3 = a0Var.f4781a;
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        f0Var3 = b0.a(a0Var.f4781a);
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        f0Var3 = d0.e.f3281a;
                        break;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        f0Var3 = a0Var.f4784d;
                        break;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        d0.d dVar = a0Var.f4784d;
                        d0.b bVar = z.f4909i;
                        f0Var3 = d0.d.b(dVar, bVar, null, null, bVar, 6);
                        break;
                    case 9:
                        f0Var3 = a0Var.f4786f;
                        break;
                    case 10:
                        d0.d dVar2 = a0Var.f4784d;
                        d0.b bVar2 = z.f4909i;
                        f0Var3 = d0.d.b(dVar2, null, bVar2, bVar2, null, 9);
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        f0Var3 = b0.a(a0Var.f4784d);
                        break;
                    case 12:
                        f0Var3 = a0Var.f4783c;
                        break;
                    case 13:
                        f0Var3 = k1.v.f5351b;
                        break;
                    case 14:
                        f0Var3 = a0Var.f4782b;
                        break;
                    default:
                        a2.r.p();
                        return;
                }
                f0Var4 = f0Var3;
                lVar3 = d1.i.f3304a;
                gVar4 = gVar3;
                z12 = true;
            } else {
                i0Var.R();
                lVar3 = lVar;
                gVar4 = gVar;
                f0Var4 = f0Var;
                z12 = z10;
            }
            i0Var.q();
            b(1769910, lVar3, gVar4, f0Var4, function0, i0Var, z12);
            lVar2 = lVar3;
            gVar2 = gVar4;
            f0Var2 = f0Var4;
            z11 = z12;
        } else {
            i0Var.R();
            lVar2 = lVar;
            gVar2 = gVar;
            f0Var2 = f0Var;
            z11 = z10;
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2(i3, lVar2, gVar2, f0Var2, function0, z11) { // from class: j0.h

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f4860d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ d1.l f4861e;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ boolean f4862i;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f4863r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ k1.f0 f4864s;

                {
                    this.f4860d = function0;
                    this.f4861e = lVar2;
                    this.f4862i = z11;
                    this.f4863r = gVar2;
                    this.f4864s = f0Var2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w.a(n0.h.z(1572871), this.f4861e, this.f4863r, this.f4864s, this.f4860d, (i0) obj, this.f4862i);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void b(final int i3, final d1.l lVar, final g gVar, final k1.f0 f0Var, final Function0 function0, i0 i0Var, final boolean z10) {
        int i10;
        i0Var.X(-1134296466);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.f(lVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.g(z10) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i10 |= i0Var.f(f0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i10 |= i0Var.f(gVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i10 |= i0Var.f(null) ? 131072 : 65536;
        }
        int i11 = 1572864 & i3;
        x0.d dVar = i9.a.f4672a;
        if (i11 == 0) {
            i10 |= i0Var.h(dVar) ? 1048576 : 524288;
        }
        if (i0Var.O(i10 & 1, (599187 & i10) != 599186)) {
            i0Var.W(977045485);
            Object L = i0Var.L();
            if (L == n0.k.f6729a) {
                L = new z.f();
                i0Var.g0(L);
            }
            z.f fVar = (z.f) L;
            i0Var.p(false);
            a2.i iVar = o.f4881a;
            d1.l c10 = lVar.c(s.f4894a);
            float f3 = m0.g.f6307c;
            d1.l c11 = x.g.d(x.g.c(k1.v.k(w0.e(c10, a.a.c(m0.g.f6308d + f3 + f3, m0.g.f6305a)), f0Var, 518143), z10 ? gVar.f4855a : gVar.f4857c, f0Var), fVar, x.a(), z10, new j2.g(0), function0, 8).c(new k0.b(new a1.f(27)));
            a2.g0 d10 = b0.p.d(d1.a.f3286s);
            int hashCode = Long.hashCode(i0Var.T);
            x0.h l10 = i0Var.l();
            d1.l C = z4.w.C(c11, i0Var);
            c2.g.f1541a.getClass();
            Function0 function02 = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(function02);
            } else {
                i0Var.j0();
            }
            n0.h.y(d10, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            Function2 function2 = c2.f.f1537f;
            if (i0Var.S || !Intrinsics.a(i0Var.L(), Integer.valueOf(hashCode))) {
                i0Var.g0(Integer.valueOf(hashCode));
                i0Var.b(Integer.valueOf(hashCode), function2);
            }
            n0.h.y(C, c2.f.f1534c, i0Var);
            n0.h.a(d.f4803a.a(new k1.p(z10 ? gVar.f4856b : gVar.f4858d)), dVar, i0Var, ((i10 >> 15) & 112) | 8);
            i0Var.p(true);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: j0.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w.b(n0.h.z(i3 | 1), lVar, gVar, f0Var, function0, (i0) obj, z10);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final e0 c(Context context) {
        d(context, R.color.system_neutral1_0);
        d(context, R.color.system_neutral1_10);
        e(d(context, R.color.system_neutral1_600), 98.0f);
        e(d(context, R.color.system_neutral1_600), 96.0f);
        d(context, R.color.system_neutral1_50);
        e(d(context, R.color.system_neutral1_600), 94.0f);
        e(d(context, R.color.system_neutral1_600), 92.0f);
        d(context, R.color.system_neutral1_100);
        e(d(context, R.color.system_neutral1_600), 87.0f);
        d(context, R.color.system_neutral1_200);
        d(context, R.color.system_neutral1_300);
        d(context, R.color.system_neutral1_400);
        d(context, R.color.system_neutral1_500);
        d(context, R.color.system_neutral1_600);
        d(context, R.color.system_neutral1_700);
        e(d(context, R.color.system_neutral1_600), 24.0f);
        e(d(context, R.color.system_neutral1_600), 22.0f);
        d(context, R.color.system_neutral1_800);
        e(d(context, R.color.system_neutral1_600), 17.0f);
        e(d(context, R.color.system_neutral1_600), 12.0f);
        d(context, R.color.system_neutral1_900);
        e(d(context, R.color.system_neutral1_600), 6.0f);
        e(d(context, R.color.system_neutral1_600), 4.0f);
        d(context, R.color.system_neutral1_1000);
        long d10 = d(context, R.color.system_neutral2_0);
        d(context, R.color.system_neutral2_10);
        long e2 = e(d(context, R.color.system_neutral2_600), 98.0f);
        long e9 = e(d(context, R.color.system_neutral2_600), 96.0f);
        long d11 = d(context, R.color.system_neutral2_50);
        long e10 = e(d(context, R.color.system_neutral2_600), 94.0f);
        long e11 = e(d(context, R.color.system_neutral2_600), 92.0f);
        long d12 = d(context, R.color.system_neutral2_100);
        long e12 = e(d(context, R.color.system_neutral2_600), 87.0f);
        long d13 = d(context, R.color.system_neutral2_200);
        d(context, R.color.system_neutral2_300);
        long d14 = d(context, R.color.system_neutral2_400);
        long d15 = d(context, R.color.system_neutral2_500);
        d(context, R.color.system_neutral2_600);
        long d16 = d(context, R.color.system_neutral2_700);
        long e13 = e(d(context, R.color.system_neutral2_600), 24.0f);
        long e14 = e(d(context, R.color.system_neutral2_600), 22.0f);
        long d17 = d(context, R.color.system_neutral2_800);
        long e15 = e(d(context, R.color.system_neutral2_600), 17.0f);
        long e16 = e(d(context, R.color.system_neutral2_600), 12.0f);
        long d18 = d(context, R.color.system_neutral2_900);
        long e17 = e(d(context, R.color.system_neutral2_600), 6.0f);
        long e18 = e(d(context, R.color.system_neutral2_600), 4.0f);
        long d19 = d(context, R.color.system_neutral2_1000);
        long d20 = d(context, R.color.system_accent1_0);
        d(context, R.color.system_accent1_10);
        d(context, R.color.system_accent1_50);
        long d21 = d(context, R.color.system_accent1_100);
        long d22 = d(context, R.color.system_accent1_200);
        d(context, R.color.system_accent1_300);
        d(context, R.color.system_accent1_400);
        d(context, R.color.system_accent1_500);
        long d23 = d(context, R.color.system_accent1_600);
        long d24 = d(context, R.color.system_accent1_700);
        long d25 = d(context, R.color.system_accent1_800);
        long d26 = d(context, R.color.system_accent1_900);
        d(context, R.color.system_accent1_1000);
        long d27 = d(context, R.color.system_accent2_0);
        d(context, R.color.system_accent2_10);
        d(context, R.color.system_accent2_50);
        long d28 = d(context, R.color.system_accent2_100);
        long d29 = d(context, R.color.system_accent2_200);
        d(context, R.color.system_accent2_300);
        d(context, R.color.system_accent2_400);
        d(context, R.color.system_accent2_500);
        long d30 = d(context, R.color.system_accent2_600);
        long d31 = d(context, R.color.system_accent2_700);
        long d32 = d(context, R.color.system_accent2_800);
        long d33 = d(context, R.color.system_accent2_900);
        d(context, R.color.system_accent2_1000);
        long d34 = d(context, R.color.system_accent3_0);
        d(context, R.color.system_accent3_10);
        d(context, R.color.system_accent3_50);
        long d35 = d(context, R.color.system_accent3_100);
        long d36 = d(context, R.color.system_accent3_200);
        d(context, R.color.system_accent3_300);
        d(context, R.color.system_accent3_400);
        d(context, R.color.system_accent3_500);
        long d37 = d(context, R.color.system_accent3_600);
        long d38 = d(context, R.color.system_accent3_700);
        long d39 = d(context, R.color.system_accent3_800);
        long d40 = d(context, R.color.system_accent3_900);
        d(context, R.color.system_accent3_1000);
        return new e0(d10, e2, e9, d11, e10, e11, d12, e12, d13, d14, d15, d16, e13, e14, d17, e15, e16, d18, e17, e18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31, d32, d33, d34, d35, d36, d37, d38, d39, d40);
    }

    public static long d(Context context, int i3) {
        return k1.v.b(context.getResources().getColor(i3, context.getTheme()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0214, code lost:
    
        if (r40 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0218, code lost:
    
        if (r0 <= 100.01d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x021b, code lost:
    
        r0 = (l0.a.d(r0) & 255) | ((((l0.a.d(r38) & 255) << 16) | (-16777216)) | ((l0.a.d(r40) & 255) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0210, code lost:
    
        if (r38 > 100.01d) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0320 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long e(long j, float f3) {
        int h10;
        boolean z10;
        float f10;
        float f11;
        double[] dArr;
        int i3;
        double d10;
        int ceil;
        double floor;
        double[] dArr2;
        double[] dArr3;
        double d11 = f3;
        if ((d11 < 1.0E-4d) || (d11 > 99.9999d)) {
            return k1.v.b(l0.a.b(d11));
        }
        g3.a e2 = l0.a.e(k1.v.r(j));
        float f12 = e2.f4230a;
        float f13 = e2.f4231b;
        l0.b bVar = l0.b.f5739k;
        if (Intrinsics.a(bVar, bVar)) {
            double d12 = f12;
            double d13 = f13;
            double[] dArr4 = l0.a.f5737h;
            if (d13 < 1.0E-4d || d11 < 1.0E-4d || d11 > 99.9999d) {
                h10 = l0.a.b(d11);
            } else {
                double d14 = d12 % 360.0d;
                if (d14 < 0.0d) {
                    d14 += 360.0d;
                }
                double radians = Math.toRadians(d14);
                double pow = (d11 > 8.0d ? Math.pow((d11 + 16.0d) / 116.0d, 3.0d) : d11 / 903.2962962962963d) * 100.0d;
                double sqrt = Math.sqrt(pow) * 11.0d;
                int i10 = 1;
                double pow2 = 1 / Math.pow(1.64d - Math.pow(0.29d, bVar.f5740a), 0.73d);
                int i11 = 2;
                double cos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * bVar.f5745f * bVar.f5743d;
                double sin = Math.sin(radians);
                double cos2 = Math.cos(radians);
                int i12 = 0;
                while (true) {
                    dArr = dArr4;
                    i3 = 8;
                    if (i12 >= 5) {
                        d10 = pow;
                        break;
                    }
                    d10 = pow;
                    double d15 = sqrt / 100.0d;
                    double d16 = sqrt;
                    double pow3 = Math.pow(((d13 == 0.0d || sqrt == 0.0d) ? 0.0d : d13 / Math.sqrt(d15)) * pow2, 1.1111111111111112d);
                    double pow4 = (Math.pow(d15, (1.0d / bVar.f5744e) / bVar.j) * bVar.f5741b) / bVar.f5742c;
                    double d17 = (((0.305d + pow4) * 23.0d) * pow3) / (((108.0d * pow3) * sin) + (((11 * pow3) * cos2) + (23.0d * cos)));
                    double d18 = d17 * cos2;
                    double d19 = d17 * sin;
                    double d20 = 460.0d * pow4;
                    double d21 = ((288.0d * d19) + ((451.0d * d18) + d20)) / 1403.0d;
                    double d22 = ((d20 - (891.0d * d18)) - (261.0d * d19)) / 1403.0d;
                    double d23 = ((d20 - (d18 * 220.0d)) - (d19 * 6300.0d)) / 1403.0d;
                    double i13 = l0.a.i(d21);
                    double i14 = l0.a.i(d22);
                    double i15 = l0.a.i(d23);
                    double[][] dArr5 = l0.a.g;
                    double[] dArr6 = dArr5[0];
                    double d24 = (dArr6[i11] * i15) + (dArr6[1] * i14) + (dArr6[0] * i13);
                    double[] dArr7 = dArr5[1];
                    double d25 = (dArr7[i11] * i15) + (dArr7[1] * i14) + (dArr7[0] * i13);
                    double[] dArr8 = dArr5[i11];
                    double d26 = (i15 * dArr8[i11]) + (i14 * dArr8[1]) + (i13 * dArr8[0]);
                    if (d24 < 0.0d || d25 < 0.0d || d26 < 0.0d) {
                        break;
                    }
                    double d27 = (dArr[i11] * d26) + (dArr[1] * d25) + (dArr[0] * d24);
                    if (d27 <= 0.0d) {
                        break;
                    }
                    if (i12 == 4) {
                        break;
                    }
                    double d28 = d27 - d10;
                    if (Math.abs(d28) < 0.002d) {
                        break;
                    }
                    sqrt = d16 - ((d28 * d16) / (i11 * d27));
                    i12++;
                    dArr4 = dArr;
                    pow = d10;
                    i11 = 2;
                }
                h10 = 0;
                if (h10 == 0) {
                    double d29 = -1.0d;
                    char c10 = 2;
                    double[] dArr9 = {-1.0d, -1.0d, -1.0d};
                    double d30 = 0.0d;
                    double d31 = 0.0d;
                    double[] dArr10 = dArr9;
                    boolean z11 = true;
                    boolean z12 = false;
                    int i16 = 0;
                    while (i16 < 12) {
                        double d32 = dArr[0];
                        double d33 = dArr[i10];
                        double d34 = dArr[c10];
                        double d35 = d29;
                        double d36 = i16 % 4 <= i10 ? 0.0d : 100.0d;
                        double d37 = i16 % 2 == 0 ? 0.0d : 100.0d;
                        if (i16 < 4) {
                            double d38 = ((d10 - (d33 * d36)) - (d34 * d37)) / d32;
                            dArr2 = l0.a.j(d38) ? new double[]{d38, d36, d37} : new double[]{d35, d35, d35};
                        } else if (i16 < i3) {
                            double d39 = ((d10 - (d32 * d37)) - (d34 * d36)) / d33;
                            if (l0.a.j(d39)) {
                                dArr3 = new double[]{d37, d39, d36};
                                if (dArr3[0] >= 0.0d) {
                                    double g = l0.a.g(dArr3);
                                    if (!z12) {
                                        dArr9 = dArr3;
                                        dArr10 = dArr9;
                                        d30 = g;
                                        d31 = d30;
                                        z12 = true;
                                    } else if (z11 || l0.a.a(d31, g, d30)) {
                                        if (l0.a.a(d31, radians, g)) {
                                            dArr10 = dArr3;
                                            d30 = g;
                                        } else {
                                            dArr9 = dArr3;
                                            d31 = g;
                                        }
                                        z11 = false;
                                    }
                                }
                                i16++;
                                d29 = d35;
                                c10 = 2;
                                i10 = 1;
                                i3 = 8;
                            } else {
                                dArr2 = new double[]{d35, d35, d35};
                            }
                        } else {
                            double d40 = ((d10 - (d32 * d36)) - (d33 * d37)) / d34;
                            if (l0.a.j(d40)) {
                                dArr3 = new double[]{d36, d37, d40};
                                if (dArr3[0] >= 0.0d) {
                                }
                                i16++;
                                d29 = d35;
                                c10 = 2;
                                i10 = 1;
                                i3 = 8;
                            } else {
                                dArr2 = new double[]{d35, d35, d35};
                            }
                        }
                        dArr3 = dArr2;
                        if (dArr3[0] >= 0.0d) {
                        }
                        i16++;
                        d29 = d35;
                        c10 = 2;
                        i10 = 1;
                        i3 = 8;
                    }
                    double[][] dArr11 = {dArr9, dArr10};
                    double[] dArr12 = dArr11[0];
                    double g2 = l0.a.g(dArr12);
                    double[] dArr13 = dArr11[1];
                    for (int i17 = 0; i17 < 3; i17++) {
                        double d41 = dArr12[i17];
                        double d42 = dArr13[i17];
                        if (d41 != d42) {
                            if (d41 < d42) {
                                ceil = (int) Math.floor(l0.a.l(d41) - 0.5d);
                                floor = Math.ceil(l0.a.l(dArr13[i17]) - 0.5d);
                            } else {
                                ceil = (int) Math.ceil(l0.a.l(d41) - 0.5d);
                                floor = Math.floor(l0.a.l(dArr13[i17]) - 0.5d);
                            }
                            int i18 = (int) floor;
                            double d43 = g2;
                            for (int i19 = 0; i19 < 8 && Math.abs(i18 - ceil) > 1.0d; i19++) {
                                int floor2 = (int) Math.floor((ceil + i18) / 2.0d);
                                double d44 = l0.a.f5738i[floor2];
                                double d45 = dArr12[i17];
                                double d46 = dArr13[i17];
                                if (d46 != d45) {
                                    d46 = (d44 - d45) / (d46 - d45);
                                }
                                double d47 = dArr12[0];
                                double d48 = ((dArr13[0] - d47) * d46) + d47;
                                double d49 = dArr12[1];
                                double d50 = ((dArr13[1] - d49) * d46) + d49;
                                double d51 = dArr12[2];
                                double[] dArr14 = {d48, d50, ((dArr13[2] - d51) * d46) + d51};
                                double g10 = l0.a.g(dArr14);
                                if (l0.a.a(d43, radians, g10)) {
                                    i18 = floor2;
                                    dArr13 = dArr14;
                                } else {
                                    ceil = floor2;
                                    dArr12 = dArr14;
                                    d43 = g10;
                                }
                            }
                            g2 = d43;
                        }
                    }
                    double d52 = 2;
                    h10 = ((l0.a.d((dArr12[0] + dArr13[0]) / d52) & 255) << 16) | (-16777216) | ((l0.a.d((dArr12[1] + dArr13[1]) / d52) & 255) << 8) | (l0.a.d((dArr12[2] + dArr13[2]) / d52) & 255);
                }
            }
        } else if (f13 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            h10 = l0.a.h(f3);
        } else {
            float f14 = 0.0f;
            float min = f12 < 0.0f ? 0.0f : Math.min(360.0f, f12);
            float f15 = 0.0f;
            float f16 = f13;
            boolean z13 = true;
            g3.a aVar = null;
            while (true) {
                if (Math.abs(f15 - f13) >= 0.4000000059604645d) {
                    float f17 = 1000.0f;
                    float f18 = f14;
                    float f19 = f18;
                    float f20 = 1000.0f;
                    float f21 = 100.0f;
                    g3.a aVar2 = null;
                    while (true) {
                        z10 = z13;
                        if (Math.abs(f19 - f21) <= 0.009999999776482582d) {
                            f10 = f16;
                            break;
                        }
                        float f22 = ((f21 - f19) / 2) + f19;
                        int d53 = l0.a.f(f22, f16, min).d(l0.b.f5739k);
                        float k10 = l0.a.k((d53 >> 16) & 255);
                        float k11 = l0.a.k((d53 >> 8) & 255);
                        float k12 = l0.a.k(d53 & 255);
                        double d54 = k10;
                        double[] dArr15 = l0.a.f5734d[1];
                        float f23 = ((float) ((k12 * dArr15[2]) + ((k11 * dArr15[1]) + (d54 * dArr15[0])))) / 100.0f;
                        float cbrt = f23 <= 0.008856452f ? f23 * 903.2963f : (((float) Math.cbrt(f23)) * 116.0f) - 16.0f;
                        f10 = f16;
                        float abs = (float) Math.abs(f3 - cbrt);
                        if (abs < 0.2f) {
                            g3.a e9 = l0.a.e(d53);
                            g3.a f24 = l0.a.f(e9.f4232c, e9.f4231b, min);
                            float f25 = e9.f4233d - f24.f4233d;
                            f11 = cbrt;
                            float f26 = e9.f4234e - f24.f4234e;
                            float f27 = e9.f4235f - f24.f4235f;
                            float pow5 = (float) (Math.pow(Math.sqrt((f27 * f27) + (f26 * f26) + (f25 * f25)), 0.63d) * 1.41d);
                            if (pow5 <= 1.0f) {
                                f20 = pow5;
                                aVar2 = e9;
                                f17 = abs;
                            }
                        } else {
                            f11 = cbrt;
                        }
                        if (f17 == f18 && f20 == f18) {
                            break;
                        }
                        if (f11 < f3) {
                            f16 = f10;
                            z13 = z10;
                            f19 = f22;
                        } else {
                            f16 = f10;
                            z13 = z10;
                            f21 = f22;
                        }
                    }
                    g3.a aVar3 = aVar2;
                    if (!z10) {
                        if (aVar3 == null) {
                            f13 = f10;
                        } else {
                            aVar = aVar3;
                            f15 = f10;
                        }
                        f16 = ((f13 - f15) / 2.0f) + f15;
                        f14 = f18;
                        z13 = z10;
                    } else {
                        if (aVar3 != null) {
                            h10 = aVar3.d(bVar);
                            break;
                        }
                        f16 = ((f13 - f15) / 2.0f) + f15;
                        f14 = f18;
                        z13 = false;
                    }
                } else {
                    h10 = aVar == null ? l0.a.h(f3) : aVar.d(bVar);
                }
            }
        }
        return k1.v.b(h10);
    }
}
