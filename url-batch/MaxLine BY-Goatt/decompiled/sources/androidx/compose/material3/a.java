package androidx.compose.material3;

import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.b;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import defpackage.a00;
import defpackage.b41;
import defpackage.bd3;
import defpackage.bf0;
import defpackage.bn1;
import defpackage.bp2;
import defpackage.c41;
import defpackage.fb2;
import defpackage.fk2;
import defpackage.fp;
import defpackage.h03;
import defpackage.iv1;
import defpackage.kk2;
import defpackage.l41;
import defpackage.mm2;
import defpackage.n72;
import defpackage.o00;
import defpackage.oj1;
import defpackage.oz;
import defpackage.pz;
import defpackage.q40;
import defpackage.qb2;
import defpackage.sc;
import defpackage.sl1;
import defpackage.sz;
import defpackage.uj2;
import defpackage.v02;
import defpackage.vl1;
import defpackage.wr2;
import defpackage.xr2;
import defpackage.yr2;
import defpackage.za2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a {
    public static final float a = 4.0f;
    public static final mm2 b = new mm2();
    public static final h03 c = new h03(100, (bf0) null, 6);

    public static final void a(boolean z, Function1 function1, vl1 vl1Var, boolean z2, wr2 wr2Var, a00 a00Var, int i) {
        int i2;
        boolean z3;
        vl1 vl1Var2;
        boolean z4;
        vl1 vl1Var3;
        a00Var.Z(1580463220);
        if ((i & 6) == 0) {
            i2 = i | (a00Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.h(function1) ? 32 : 16;
        }
        int i3 = i2 | 28032;
        if ((i & 196608) == 0) {
            i3 |= a00Var.f(wr2Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        int i4 = i3 | 1572864;
        if ((599187 & i4) == 599186 && a00Var.B()) {
            a00Var.S();
            vl1Var3 = vl1Var;
            z4 = z2;
        } else {
            a00Var.U();
            int i5 = i & 1;
            vl1 vl1Var4 = sl1.a;
            if (i5 == 0 || a00Var.z()) {
                z3 = true;
                vl1Var2 = vl1Var4;
            } else {
                a00Var.S();
                vl1Var2 = vl1Var;
                z3 = z2;
            }
            a00Var.r();
            a00Var.X(783532531);
            Object M = a00Var.M();
            if (M == sz.a) {
                M = new bn1();
                a00Var.i0(M);
            }
            bn1 bn1Var = (bn1) M;
            a00Var.q(false);
            if (function1 != null) {
                bp2 bp2Var = c41.a;
                vl1Var4 = androidx.compose.foundation.selection.a.b(MinimumInteractiveModifier.a, z, bn1Var, z3, new fb2(2), function1);
                bn1Var = bn1Var;
            }
            boolean z5 = z3;
            int i6 = i4 << 3;
            int i7 = i4 >> 6;
            b(b.f(b.m(vl1Var2.k(vl1Var4))), z, z5, wr2Var, bn1Var, kk2.a(5, a00Var), a00Var, (i6 & 57344) | (i6 & 112) | (i7 & 896) | (i7 & 7168));
            z4 = z5;
            vl1Var3 = vl1Var2;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new xr2(z, function1, vl1Var3, z4, wr2Var, i);
        }
    }

    public static final void b(vl1 vl1Var, boolean z, boolean z2, wr2 wr2Var, b41 b41Var, fk2 fk2Var, a00 a00Var, int i) {
        int i2;
        a00Var.Z(-1594099146);
        if ((i & 6) == 0) {
            i2 = (a00Var.f(vl1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= a00Var.f(wr2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= a00Var.h(null) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= a00Var.f(b41Var) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((1572864 & i) == 0) {
            i2 |= a00Var.f(fk2Var) ? 1048576 : 524288;
        }
        if ((i2 & 599187) == 599186 && a00Var.B()) {
            a00Var.S();
        } else {
            long j = z2 ? z ? wr2Var.b : wr2Var.f : z ? wr2Var.j : wr2Var.n;
            long j2 = z2 ? z ? wr2Var.a : wr2Var.e : z ? wr2Var.i : wr2Var.m;
            fk2 a2 = kk2.a(5, a00Var);
            vl1 b2 = androidx.compose.foundation.a.b(l41.q(2.0f, z2 ? z ? wr2Var.c : wr2Var.g : z ? wr2Var.k : wr2Var.o, vl1Var, a2), j, a2);
            oj1 e = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, b2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var, e, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var, l, scVar2);
            sc scVar3 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var, E, scVar4);
            vl1 b3 = androidx.compose.foundation.a.b(d.a(androidx.compose.foundation.layout.a.c(qb2.s).k(new ThumbElement(b41Var, z)), b41Var, za2.a(a00Var, 54, 4)), j2, fk2Var);
            oj1 e2 = fp.e(qb2.t, false);
            int D2 = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E2 = bd3.E(a00Var, b3);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, scVar);
            uj2.e(a00Var, l2, scVar2);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var, D2, scVar3);
            }
            uj2.e(a00Var, E2, scVar4);
            a00Var.X(1163457794);
            a00Var.q(false);
            a00Var.q(true);
            a00Var.q(true);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new yr2(vl1Var, z, z2, wr2Var, b41Var, fk2Var, i);
        }
    }
}
