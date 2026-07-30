package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.draw.a;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qb2 implements Configurator, g, nb1, zm2, a21, px1, jq2 {
    public static b72 I;
    public static qb2 n;
    public final /* synthetic */ int m;
    public static final qb2 o = new qb2(1);
    public static final ao p = new ao(-1.0f, -1.0f);
    public static final ao q = new ao(0.0f, -1.0f);
    public static final ao r = new ao(1.0f, -1.0f);
    public static final ao s = new ao(-1.0f, 0.0f);
    public static final ao t = new ao(0.0f, 0.0f);
    public static final ao u = new ao(1.0f, 0.0f);
    public static final ao v = new ao(-1.0f, 1.0f);
    public static final ao w = new ao(0.0f, 1.0f);
    public static final ao x = new ao(1.0f, 1.0f);
    public static final zn y = new zn(-1.0f);
    public static final zn z = new zn(0.0f);
    public static final yn A = new yn(-1.0f);
    public static final yn B = new yn(0.0f);
    public static final yn C = new yn(1.0f);
    public static final qb2 D = new qb2(3);
    public static final qb2 E = new qb2(4);
    public static final qb2 F = new qb2(5);
    public static final qb2 G = new qb2(6);
    public static final qb2 H = new qb2(7);
    public static final w8 J = new w8();
    public static final qb2 K = new qb2(9);
    public static final qb2 L = new qb2(10);
    public static final /* synthetic */ qb2 M = new qb2(11);
    public static final qb2 N = new qb2(12);
    public static final qb2 O = new qb2(13);
    public static final qb2 P = new qb2(14);
    public static final qb2 Q = new qb2(15);
    public static final qb2 R = new qb2(16);
    public static final /* synthetic */ qb2 S = new qb2(17);
    public static final /* synthetic */ qb2 T = new qb2(18);
    public static final /* synthetic */ qb2 U = new qb2(19);
    public static final /* synthetic */ qb2 V = new qb2(20);
    public static final /* synthetic */ qb2 W = new qb2(21);
    public static final /* synthetic */ qb2 X = new qb2(22);
    public static final qb2 Y = new qb2(23);
    public static final qb2 Z = new qb2(24);
    public static final qb2 a0 = new qb2(25);
    public static final qb2 b0 = new qb2(26);
    public static final qb2 c0 = new qb2(27);
    public static final qb2 d0 = new qb2(28);
    public static final qb2 e0 = new qb2(29);

    public /* synthetic */ qb2(int i) {
        this.m = i;
    }

    public static du2 l(gw gwVar, a00 a00Var) {
        du2 du2Var = gwVar.N;
        a00Var.X(1540400102);
        if (du2Var == null) {
            long c = hw.c(gwVar, 18);
            long c2 = hw.c(gwVar, 18);
            long b = aw.b(hw.c(gwVar, 18), 0.38f);
            long c3 = hw.c(gwVar, 18);
            long j = aw.f;
            du2 du2Var2 = new du2(c, c2, b, c3, j, j, j, j, hw.c(gwVar, 26), hw.c(gwVar, 2), (kw2) a00Var.j(lw2.a), hw.c(gwVar, 26), hw.c(gwVar, 24), aw.b(hw.c(gwVar, 18), 0.12f), hw.c(gwVar, 2), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 19), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 2), hw.c(gwVar, 26), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 2), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 19), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 18), 0.38f), hw.c(gwVar, 2), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 19), 0.38f), hw.c(gwVar, 19), hw.c(gwVar, 19), hw.c(gwVar, 19), aw.b(hw.c(gwVar, 19), 0.38f), hw.c(gwVar, 19));
            gwVar.N = du2Var2;
            du2Var = du2Var2;
        }
        a00Var.q(false);
        return du2Var;
    }

    @Override // defpackage.nb1
    public int a(Object obj) {
        return -1;
    }

    @Override // defpackage.px1
    public Object b(long j, bg2 bg2Var, o30 o30Var) {
        bg2 bg2Var2 = new bg2(bg2Var.p, o30Var);
        bg2Var2.o = j;
        Object invokeSuspend = bg2Var2.invokeSuspend(Unit.a);
        return invokeSuspend == b50.m ? invokeSuspend : Unit.a;
    }

    @Override // defpackage.jq2
    public void c(iq2 iq2Var) {
        iq2Var.clear();
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        switch (this.m) {
            case 5:
                cl clVar = cl.a;
                encoderConfig.registerEncoder(un.class, clVar);
                encoderConfig.registerEncoder(sl.class, clVar);
                fl flVar = fl.a;
                encoderConfig.registerEncoder(eg1.class, flVar);
                encoderConfig.registerEncoder(zl.class, flVar);
                dl dlVar = dl.a;
                encoderConfig.registerEncoder(qu.class, dlVar);
                encoderConfig.registerEncoder(tl.class, dlVar);
                bl blVar = bl.a;
                encoderConfig.registerEncoder(b7.class, blVar);
                encoderConfig.registerEncoder(ql.class, blVar);
                el elVar = el.a;
                encoderConfig.registerEncoder(bg1.class, elVar);
                encoderConfig.registerEncoder(yl.class, elVar);
                gl glVar = gl.a;
                encoderConfig.registerEncoder(ur1.class, glVar);
                encoderConfig.registerEncoder(bm.class, glVar);
                break;
            default:
                encoderConfig.registerEncoder(p52.class, ml.a);
                encoderConfig.registerEncoder(ru.class, il.a);
                encoderConfig.registerEncoder(px2.class, ol.a);
                encoderConfig.registerEncoder(fg1.class, ll.a);
                encoderConfig.registerEncoder(dg1.class, kl.a);
                encoderConfig.registerEncoder(hv0.class, jl.a);
                encoderConfig.registerEncoder(hp2.class, nl.a);
                break;
        }
    }

    @Override // defpackage.zm2
    public boolean d(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.a21
    public void e(k91 k91Var) {
        k91Var.a();
    }

    @Override // defpackage.px1
    public long f(long j, int i, s72 s72Var) {
        s72Var.getClass();
        cg2 cg2Var = (cg2) s72Var.n;
        return new au1(cg2.a(cg2Var, cg2Var.h, j, cg2Var.g)).a;
    }

    @Override // defpackage.px1
    public boolean g() {
        return false;
    }

    @Override // defpackage.px1
    public vl1 h() {
        return sl1.a;
    }

    @Override // defpackage.jq2
    public boolean i(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(boolean z2, b41 b41Var, vl1 vl1Var, du2 du2Var, fk2 fk2Var, float f, float f2, a00 a00Var, int i, int i2) {
        vl1 vl1Var2;
        int i3;
        float f3;
        float f4;
        float f5;
        vl1 vl1Var3;
        float f6;
        float f7;
        n72 s2;
        int i4;
        int i5;
        du2 du2Var2 = du2Var;
        a00 a00Var2 = a00Var;
        a00Var2.Z(1035477640);
        int i6 = (a00Var2.g(z2) ? 4 : 2) | i | (a00Var2.g(false) ? 32 : 16) | (a00Var2.f(b41Var) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            vl1Var2 = vl1Var;
            i6 |= a00Var2.f(vl1Var2) ? 2048 : 1024;
            i3 = i6 | (!a00Var2.f(du2Var2) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE) | (!a00Var2.f(fk2Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    if (a00Var2.c(f3)) {
                        i5 = 1048576;
                        i3 |= i5;
                    }
                } else {
                    f3 = f;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                f3 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    if (a00Var2.c(f4)) {
                        i4 = 8388608;
                        i3 |= i4;
                    }
                } else {
                    f4 = f2;
                }
                i4 = 4194304;
                i3 |= i4;
            } else {
                f4 = f2;
            }
            if ((38347923 & i3) == 38347922 || !a00Var2.B()) {
                a00Var2.U();
                if ((i & 1) != 0 || a00Var2.z()) {
                    vl1 vl1Var4 = i7 == 0 ? sl1.a : vl1Var2;
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f3 = 2.0f;
                    }
                    if ((i2 & 128) == 0) {
                        i3 &= -29360129;
                        f5 = 1.0f;
                    } else {
                        f5 = f4;
                    }
                    vl1Var3 = vl1Var4;
                } else {
                    a00Var2.S();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    float f8 = f4;
                    vl1Var3 = vl1Var2;
                    f5 = f8;
                }
                float f9 = f3;
                a00Var2.r();
                int i8 = i3 >> 6;
                boolean booleanValue = ((Boolean) yk3.x(b41Var, a00Var2, i8 & 14).getValue()).booleanValue();
                zn1 d = pu2.d(z2, booleanValue, du2Var2, f9, f5, a00Var2, (i8 & 458752) | ((i3 >> 3) & 7168) | (i3 & 126) | (57344 & i8));
                a00Var2 = a00Var2;
                du2Var2 = du2Var2;
                so2 a = ml2.a(z2 ? du2Var2.g : booleanValue ? du2Var2.e : du2Var2.f, bd3.P(150, 6, null), a00Var2);
                yo yoVar = (yo) d.getValue();
                fp.a(a.b(vl1Var3.k(new BorderModifierNodeElement(yoVar.a, yoVar.b, fk2Var)), new ih2(5, fk2Var, new hu2(new ga1(0, 3, so2.class, a, "value", "getValue()Ljava/lang/Object;")))), a00Var2, 0);
                f6 = f9;
                f7 = f5;
                vl1Var2 = vl1Var3;
            } else {
                a00Var2.S();
                f6 = f3;
                f7 = f4;
            }
            s2 = a00Var2.s();
            if (s2 == null) {
                s2.d = new cx1(this, z2, b41Var, vl1Var2, du2Var2, fk2Var, f6, f7, i, i2);
                return;
            }
            return;
        }
        vl1Var2 = vl1Var;
        i3 = i6 | (!a00Var2.f(du2Var2) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE) | (!a00Var2.f(fk2Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        a00Var2.U();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        vl1Var3 = vl1Var4;
        float f92 = f3;
        a00Var2.r();
        int i82 = i3 >> 6;
        boolean booleanValue2 = ((Boolean) yk3.x(b41Var, a00Var2, i82 & 14).getValue()).booleanValue();
        zn1 d2 = pu2.d(z2, booleanValue2, du2Var2, f92, f5, a00Var2, (i82 & 458752) | ((i3 >> 3) & 7168) | (i3 & 126) | (57344 & i82));
        a00Var2 = a00Var2;
        du2Var2 = du2Var2;
        so2 a2 = ml2.a(z2 ? du2Var2.g : booleanValue2 ? du2Var2.e : du2Var2.f, bd3.P(150, 6, null), a00Var2);
        yo yoVar2 = (yo) d2.getValue();
        fp.a(a.b(vl1Var3.k(new BorderModifierNodeElement(yoVar2.a, yoVar2.b, fk2Var)), new ih2(5, fk2Var, new hu2(new ga1(0, 3, so2.class, a2, "value", "getValue()Ljava/lang/Object;")))), a00Var2, 0);
        f6 = f92;
        f7 = f5;
        vl1Var2 = vl1Var3;
        s2 = a00Var2.s();
        if (s2 == null) {
        }
    }

    public void k(String str, Function2 function2, boolean z2, boolean z3, ch2 ch2Var, b41 b41Var, Function2 function22, du2 du2Var, yx1 yx1Var, my myVar, a00 a00Var, int i) {
        String str2;
        int i2;
        boolean z4;
        boolean z5;
        ch2 ch2Var2;
        int i3;
        Function2 function23;
        int i4;
        yx1 zx1Var;
        a00Var.Z(-350442135);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (a00Var.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.h(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= a00Var.g(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= a00Var.g(z5) ? 2048 : 1024;
        } else {
            z5 = z3;
        }
        int i5 = i & 24576;
        int i6 = Utility.DEFAULT_STREAM_BUFFER_SIZE;
        if (i5 == 0) {
            ch2Var2 = ch2Var;
            i2 |= a00Var.f(ch2Var2) ? 16384 : 8192;
        } else {
            ch2Var2 = ch2Var;
        }
        if ((i & 196608) == 0) {
            i2 |= a00Var.f(b41Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= a00Var.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 = 12582912;
            function23 = function22;
            i2 |= a00Var.h(function23) ? 8388608 : 4194304;
        } else {
            i3 = 12582912;
            function23 = function22;
        }
        if ((i & 100663296) == 0) {
            i2 |= a00Var.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= a00Var.h(null) ? 536870912 : 268435456;
        }
        int i7 = 14155776 | (a00Var.h(null) ? 4 : 2) | (a00Var.h(null) ? 32 : 16) | (a00Var.h(null) ? 256 : 128) | (a00Var.h(null) ? 2048 : 1024);
        if (a00Var.f(du2Var)) {
            i6 = 16384;
        }
        int i8 = i7 | i6 | NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        if ((306783379 & i2) == 306783378 && (4793491 & i8) == 4793490 && a00Var.B()) {
            a00Var.S();
            zx1Var = yx1Var;
        } else {
            a00Var.U();
            if ((i & 1) == 0 || a00Var.z()) {
                float f = pu2.b;
                i4 = i8 & (-458753);
                zx1Var = new zx1(f, f, f, f);
            } else {
                a00Var.S();
                i4 = i8 & (-458753);
                zx1Var = yx1Var;
            }
            a00Var.r();
            int i9 = i2 << 3;
            int i10 = i2 >> 3;
            int i11 = i2 >> 9;
            int i12 = i4 << 21;
            pu2.a(mv2.n, str2, function2, ch2Var2, function23, null, null, z5, z4, b41Var, zx1Var, du2Var, myVar, a00Var, (i9 & 896) | (i9 & 112) | 6 | (i10 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), ((i4 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | (i11 & 7168) | (i10 & 57344) | ((i4 << 6) & 3670016) | i3);
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new dx1(this, str, function2, z2, z3, ch2Var, b41Var, function22, du2Var, zx1Var, myVar, i);
        }
    }

    public String toString() {
        switch (this.m) {
            case 24:
                return "NeverEqualPolicy";
            case 28:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }
}
