package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j6 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6(int i, Object obj) {
        super(1);
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x070c, code lost:
    
        if (r14 != false) goto L337;
     */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        mo moVar;
        int i;
        l01 l01Var;
        l01 l01Var2;
        boolean z;
        ns nsVar;
        mh mhVar;
        float f;
        float f2;
        long v;
        float d;
        Bitmap bitmap;
        float f3;
        pa1 pa1Var;
        float f4;
        int i2;
        int i3 = this.m;
        int i4 = 5;
        int i5 = 1;
        Object obj2 = this.n;
        switch (i3) {
            case 0:
                k6 k6Var = (k6) obj;
                j91 j91Var = (j91) obj2;
                if (k6Var.r()) {
                    if (k6Var.a().b) {
                        k6Var.q();
                    }
                    for (Map.Entry entry : k6Var.a().g.entrySet()) {
                        j91.a(j91Var, (xx0) entry.getKey(), ((Number) entry.getValue()).intValue(), k6Var.n());
                    }
                    ks1 ks1Var = k6Var.n().C;
                    ks1Var.getClass();
                    while (!ks1Var.equals(j91Var.a.n())) {
                        for (xx0 xx0Var : j91Var.b(ks1Var).keySet()) {
                            j91.a(j91Var, xx0Var, j91Var.c(ks1Var, xx0Var), ks1Var);
                        }
                        ks1Var = ks1Var.C;
                        ks1Var.getClass();
                    }
                }
                return Unit.a;
            case 1:
                return Boolean.valueOf(((q31) obj2).a(((ai2) obj).g));
            case 2:
                return Boolean.valueOf(ll3.h((ai2) obj, (Resources) obj2));
            case 3:
                return new l4(i5, (fc0) obj2);
            case 4:
                ((sh2) obj).d(lh2.a, new kh2(xw0.m, ((du1) obj2).a(), 2, true));
                return Unit.a;
            case 5:
                return Boolean.valueOf(Intrinsics.b(obj, obj2));
            case 6:
                so2 so2Var = (so2) ((zc) obj2).d.g(obj);
                return new x31(so2Var != null ? ((x31) so2Var.getValue()).a : 0L);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ir irVar = (ir) obj;
                xo xoVar = (xo) obj2;
                if (irVar.d() * xoVar.D < 0.0f || ql2.c(irVar.m.f()) <= 0.0f) {
                    return irVar.a(o3.A);
                }
                float min = Math.min(pc0.a(xoVar.D, 0.0f) ? 1.0f : (float) Math.ceil(irVar.d() * xoVar.D), (float) Math.ceil(ql2.c(irVar.m.f()) / 2.0f));
                float f5 = min / 2.0f;
                long i6 = ap.i(f5, f5);
                long a = ph2.a(ql2.d(irVar.m.f()) - min, ql2.b(irVar.m.f()) - min);
                float f6 = min * 2.0f;
                boolean z2 = f6 > ql2.c(irVar.m.f());
                bx1 a2 = xoVar.F.a(irVar.m.f(), irVar.m.getLayoutDirection(), irVar);
                if (!(a2 instanceof yw1)) {
                    if (!(a2 instanceof ax1)) {
                        boolean z3 = z2;
                        if (!(a2 instanceof zw1)) {
                            a.b();
                            return null;
                        }
                        nn2 nn2Var = xoVar.E;
                        long j = z3 ? 0L : i6;
                        if (z3) {
                            a = irVar.m.f();
                        }
                        return irVar.a(new uo(nn2Var, j, a, z3 ? vl0.a : new xp2(min, 0.0f, 0, 0, 30), 0));
                    }
                    nn2 nn2Var2 = xoVar.E;
                    ub2 ub2Var = ((ax1) a2).a;
                    if (l41.O(ub2Var)) {
                        return irVar.a(new wo(z2, nn2Var2, ub2Var.e, f5, min, i6, a, new xp2(min, 0.0f, 0, 0, 30)));
                    }
                    boolean z4 = z2;
                    if (xoVar.C == null) {
                        xoVar.C = new to();
                    }
                    to toVar = xoVar.C;
                    toVar.getClass();
                    oa oaVar = toVar.d;
                    if (oaVar == null) {
                        oaVar = qa.a();
                        toVar.d = oaVar;
                    }
                    oaVar.a.reset();
                    oa.a(oaVar, ub2Var);
                    if (!z4) {
                        oa a3 = qa.a();
                        oa.a(a3, new ub2(min, min, (ub2Var.c - ub2Var.a) - min, (ub2Var.d - ub2Var.b) - min, l41.a0(ub2Var.e, min), l41.a0(ub2Var.f, min), l41.a0(ub2Var.g, min), l41.a0(ub2Var.h, min)));
                        oaVar.d(oaVar, a3, 0);
                    }
                    return irVar.a(new p8(12, oaVar, nn2Var2));
                }
                nn2 nn2Var3 = xoVar.E;
                yw1 yw1Var = (yw1) a2;
                oa oaVar2 = yw1Var.a;
                if (z2) {
                    return irVar.a(new p8(11, yw1Var, nn2Var3));
                }
                if (nn2Var3 != null) {
                    moVar = new mo(nn2Var3.a, 5);
                    i = 1;
                } else {
                    moVar = null;
                    i = 0;
                }
                w72 b = oaVar2.b();
                float f7 = b.b;
                float f8 = b.a;
                if (xoVar.C == null) {
                    xoVar.C = new to();
                }
                to toVar2 = xoVar.C;
                toVar2.getClass();
                oa oaVar3 = toVar2.d;
                if (oaVar3 == null) {
                    oaVar3 = qa.a();
                    toVar2.d = oaVar3;
                }
                oaVar3.a.reset();
                pz1[] pz1VarArr = pz1.m;
                float f9 = b.a;
                float f10 = b.d;
                float f11 = b.c;
                float f12 = b.b;
                if (Float.isNaN(f9) || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
                    qa.b("Invalid rectangle, make sure no value is NaN");
                }
                if (oaVar3.b == null) {
                    oaVar3.b = new RectF();
                }
                RectF rectF = oaVar3.b;
                rectF.getClass();
                rectF.set(f9, f12, f11, f10);
                Path path = oaVar3.a;
                RectF rectF2 = oaVar3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                oaVar3.d(oaVar3, oaVar2, 0);
                c82 c82Var = new c82();
                long d2 = zm3.d((int) Math.ceil(b.c - f8), (int) Math.ceil(b.d - f7));
                to toVar3 = xoVar.C;
                toVar3.getClass();
                y9 y9Var = toVar3.a;
                y6 y6Var = toVar3.b;
                if (y9Var != null) {
                    Bitmap.Config config = y9Var.a.getConfig();
                    config.getClass();
                    l01Var = new l01(k31.I(config));
                } else {
                    l01Var = null;
                }
                try {
                    try {
                        if (l01Var == null || l01Var.a != 0) {
                            if (y9Var != null) {
                                Bitmap.Config config2 = y9Var.a.getConfig();
                                config2.getClass();
                                l01Var2 = new l01(k31.I(config2));
                            } else {
                                l01Var2 = null;
                            }
                            if (l01Var2 == null || i != l01Var2.a) {
                                z = false;
                                if (y9Var != null && y6Var != null) {
                                    d = ql2.d(irVar.m.f());
                                    bitmap = y9Var.a;
                                    if (d <= bitmap.getWidth()) {
                                        if (ql2.b(irVar.m.f()) <= bitmap.getHeight()) {
                                        }
                                    }
                                }
                                y9Var = o70.c((int) (d2 >> 32), (int) (d2 & 4294967295L), i);
                                toVar3.a = y9Var;
                                y6Var = zm3.a(y9Var);
                                toVar3.b = y6Var;
                                nsVar = toVar3.c;
                                if (nsVar == null) {
                                    nsVar = new ns();
                                    toVar3.c = nsVar;
                                }
                                mhVar = nsVar.n;
                                ms msVar = nsVar.m;
                                long Q = zm3.Q(d2);
                                u81 layoutDirection = irVar.m.getLayoutDirection();
                                ca0 ca0Var = msVar.a;
                                ns nsVar2 = nsVar;
                                u81 u81Var = msVar.b;
                                ls lsVar = msVar.c;
                                long j2 = msVar.d;
                                msVar.a = irVar;
                                msVar.b = layoutDirection;
                                msVar.c = y6Var;
                                msVar.d = Q;
                                y6Var.m();
                                yd0.H(nsVar2, aw.b, Q, 58);
                                f = -f8;
                                f2 = -f7;
                                ((ar0) mhVar.n).z(f, f2);
                                yd0.x(nsVar2, yw1Var.a, nn2Var3, 0.0f, new xp2(f6, 0.0f, 0, 0, 30), 52);
                                float d3 = (ql2.d(nsVar2.f()) + 1.0f) / ql2.d(nsVar2.f());
                                float b2 = (ql2.b(nsVar2.f()) + 1.0f) / ql2.b(nsVar2.f());
                                long Z = nsVar2.Z();
                                y6 y6Var2 = y6Var;
                                oa oaVar4 = oaVar3;
                                v = mhVar.v();
                                mhVar.o().m();
                                ((ar0) mhVar.n).y(d3, b2, Z);
                                yd0.x(nsVar2, oaVar4, nn2Var3, 0.0f, null, 28);
                                ((ar0) mhVar.n).z(-f, -f2);
                                y6Var2.j();
                                msVar.a = ca0Var;
                                msVar.b = u81Var;
                                msVar.c = lsVar;
                                msVar.d = j2;
                                y9Var.a.prepareToDraw();
                                c82Var.m = y9Var;
                                return irVar.a(new vo(b, c82Var, d2, moVar));
                            }
                        }
                        ((ar0) mhVar.n).y(d3, b2, Z);
                        yd0.x(nsVar2, oaVar4, nn2Var3, 0.0f, null, 28);
                        ((ar0) mhVar.n).z(-f, -f2);
                        y6Var2.j();
                        msVar.a = ca0Var;
                        msVar.b = u81Var;
                        msVar.c = lsVar;
                        msVar.d = j2;
                        y9Var.a.prepareToDraw();
                        c82Var.m = y9Var;
                        return irVar.a(new vo(b, c82Var, d2, moVar));
                    } finally {
                        mhVar.o().j();
                        mhVar.J(v);
                    }
                    yd0.x(nsVar2, yw1Var.a, nn2Var3, 0.0f, new xp2(f6, 0.0f, 0, 0, 30), 52);
                    float d32 = (ql2.d(nsVar2.f()) + 1.0f) / ql2.d(nsVar2.f());
                    float b22 = (ql2.b(nsVar2.f()) + 1.0f) / ql2.b(nsVar2.f());
                    long Z2 = nsVar2.Z();
                    y6 y6Var22 = y6Var;
                    oa oaVar42 = oaVar3;
                    v = mhVar.v();
                    mhVar.o().m();
                } catch (Throwable th) {
                    ((ar0) mhVar.n).z(-f, -f2);
                    throw th;
                }
                z = true;
                if (y9Var != null) {
                    d = ql2.d(irVar.m.f());
                    bitmap = y9Var.a;
                    if (d <= bitmap.getWidth()) {
                    }
                }
                y9Var = o70.c((int) (d2 >> 32), (int) (d2 & 4294967295L), i);
                toVar3.a = y9Var;
                y6Var = zm3.a(y9Var);
                toVar3.b = y6Var;
                nsVar = toVar3.c;
                if (nsVar == null) {
                }
                mhVar = nsVar.n;
                ms msVar2 = nsVar.m;
                long Q2 = zm3.Q(d2);
                u81 layoutDirection2 = irVar.m.getLayoutDirection();
                ca0 ca0Var2 = msVar2.a;
                ns nsVar22 = nsVar;
                u81 u81Var2 = msVar2.b;
                ls lsVar2 = msVar2.c;
                long j22 = msVar2.d;
                msVar2.a = irVar;
                msVar2.b = layoutDirection2;
                msVar2.c = y6Var;
                msVar2.d = Q2;
                y6Var.m();
                yd0.H(nsVar22, aw.b, Q2, 58);
                f = -f8;
                f2 = -f7;
                ((ar0) mhVar.n).z(f, f2);
                break;
            case 8:
                k91 k91Var = (k91) obj;
                ((ih2) obj2).invoke(k91Var);
                k91Var.a();
                return Unit.a;
            case 9:
                long j3 = ((au1) obj).a;
                nu nuVar = (nu) obj2;
                if (nuVar.G) {
                    nuVar.H.invoke();
                }
                return Unit.a;
            case 10:
                rd rdVar = (rd) obj;
                float f13 = rdVar.b;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                float f14 = rdVar.c;
                if (f14 < -0.5f) {
                    f14 = -0.5f;
                }
                if (f14 > 0.5f) {
                    f14 = 0.5f;
                }
                float f15 = rdVar.d;
                float f16 = f15 < -0.5f ? -0.5f : f15;
                float f17 = f16 > 0.5f ? 0.5f : f16;
                float f18 = rdVar.a;
                float f19 = f18 < 0.0f ? 0.0f : f18;
                if (f19 > 1.0f) {
                    f19 = 1.0f;
                }
                return new aw(aw.a(ap.b(f13, f14, f17, f19, kw.x), (iw) obj2));
            case 11:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ((g30) obj2).a.setValue(new e30(((au1) obj).a));
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                Throwable th2 = (Throwable) obj;
                i70 i70Var = (i70) obj2;
                y91 y91Var = i70Var.v;
                if (th2 != null) {
                    i70Var.t.c(new zl0(th2));
                }
                if (y91Var.a()) {
                    ((fl0) y91Var.getValue()).close();
                }
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                uc0 uc0Var = (uc0) obj;
                if (!uc0Var.m.z) {
                    return qz2.n;
                }
                uc0 uc0Var2 = uc0Var.B;
                if (uc0Var2 != null) {
                    j6 j6Var = new j6(14, (ar0) obj2);
                    if (j6Var.invoke(uc0Var2) == qz2.m) {
                        nk2.p(uc0Var2, j6Var);
                    }
                }
                uc0Var.B = null;
                uc0Var.A = null;
                return qz2.m;
            case 15:
                ((kg1) obj2).invoke();
                return Unit.a;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                if (nv0.b.compareAndSet(false, true)) {
                    ((lq) obj2).d(Unit.a);
                }
                return Unit.a;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                yd0 yd0Var = (yd0) obj;
                dw0 dw0Var = (dw0) obj2;
                oa oaVar5 = dw0Var.l;
                if (dw0Var.n && dw0Var.w && oaVar5 != null) {
                    mh F = yd0Var.F();
                    long v2 = F.v();
                    F.o().m();
                    try {
                        ((mh) ((ar0) F.n).n).o().s(oaVar5);
                        dw0Var.c(yd0Var);
                    } finally {
                        F.o().j();
                        F.J(v2);
                    }
                } else {
                    dw0Var.c(yd0Var);
                }
                return Unit.a;
            case 18:
                yd0 yd0Var2 = (yd0) obj;
                ls o = yd0Var2.F().o();
                Function2 function2 = ((fw0) obj2).p;
                if (function2 != null) {
                    function2.invoke(o, (dw0) yd0Var2.F().o);
                }
                return Unit.a;
            case 19:
                q33 q33Var = (q33) obj;
                ow0 ow0Var = (ow0) obj2;
                ow0Var.g(q33Var);
                Function1 function1 = ow0Var.i;
                if (function1 != null) {
                    function1.invoke(q33Var);
                }
                return Unit.a;
            case 20:
                jt1 jt1Var = (jt1) obj;
                u72 u72Var = jt1Var.b;
                if (u72Var != null) {
                    u72Var.closeConnection();
                    jt1Var.b = null;
                }
                u21 u21Var = (u21) obj2;
                eo1 eo1Var = u21Var.d;
                Object[] objArr = eo1Var.m;
                int i7 = eo1Var.o;
                int i8 = 0;
                while (true) {
                    if (i8 >= i7) {
                        i8 = -1;
                    } else if (!Intrinsics.b((k63) objArr[i8], jt1Var)) {
                        i8++;
                    }
                }
                if (i8 >= 0) {
                    eo1Var.l(i8);
                }
                if (eo1Var.o == 0) {
                    u21Var.b.invoke();
                }
                return Unit.a;
            case 21:
                va1 va1Var = (va1) obj2;
                float f20 = -((Number) obj).floatValue();
                if ((f20 >= 0.0f || va1Var.c()) && (f20 <= 0.0f || va1Var.a())) {
                    float abs = Math.abs(va1Var.e);
                    float f21 = va1Var.e;
                    if (abs > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + f21).toString());
                    }
                    float f22 = f21 + f20;
                    va1Var.e = f22;
                    if (Math.abs(f22) > 0.5f) {
                        na1 na1Var = (na1) va1Var.c.getValue();
                        float f23 = va1Var.e;
                        int b3 = si1.b(f23);
                        int i9 = na1Var.i;
                        int i10 = na1Var.h;
                        ww1 ww1Var = na1Var.k;
                        List list = na1Var.g;
                        if (!na1Var.e && !list.isEmpty() && (pa1Var = na1Var.a) != null) {
                            int i11 = pa1Var.g;
                            int i12 = na1Var.b - b3;
                            if (i12 >= 0 && i12 < i11) {
                                oa1 oa1Var = (oa1) zv.u(list);
                                oa1 oa1Var2 = (oa1) zv.B(list);
                                oa1Var.getClass();
                                oa1Var2.getClass();
                                if (b3 >= 0 ? Math.min(i10 - z71.K(oa1Var, ww1Var), i9 - z71.K(oa1Var2, ww1Var)) > b3 : Math.min((z71.K(oa1Var, ww1Var) + oa1Var.l) - i10, (z71.K(oa1Var2, ww1Var) + oa1Var2.l) - i9) > (-b3)) {
                                    na1Var.b -= b3;
                                    int size = list.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        oa1 oa1Var3 = (oa1) list.get(i13);
                                        oa1Var3.getClass();
                                        long j4 = oa1Var3.o;
                                        oa1Var3.o = yk3.h((int) (j4 >> 32), ((int) (j4 & 4294967295L)) + b3);
                                        int size2 = oa1Var3.e.size();
                                        for (int i14 = 0; i14 < size2; i14++) {
                                            q40.t(oa1Var3.h.a.g(oa1Var3.b));
                                        }
                                    }
                                    na1Var.d = b3;
                                    if (!na1Var.c && b3 > 0) {
                                        na1Var.c = true;
                                    }
                                    va1Var.f(na1Var, true);
                                    va1Var.p.setValue(Unit.a);
                                    va1Var.h(f23 - va1Var.e, na1Var);
                                }
                            }
                        }
                        i91 i91Var = va1Var.h;
                        if (i91Var != null) {
                            i91Var.k();
                        }
                        va1Var.h(f23 - va1Var.e, va1Var.g());
                    }
                    if (Math.abs(va1Var.e) > 0.5f) {
                        f20 -= va1Var.e;
                        va1Var.e = 0.0f;
                    }
                    f3 = f20;
                } else {
                    f3 = 0.0f;
                }
                return Float.valueOf(-f3);
            case 22:
                return new l4(i4, (jb1) obj2);
            case 23:
                return new l4(7, (tb1) obj2);
            case 24:
                ((iz1) obj2).i((int) (((x31) obj).a >> 32));
                return Unit.a;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                cp1 cp1Var = (cp1) obj;
                cr1 cr1Var = (cr1) obj2;
                cp1Var.getClass();
                op1 op1Var = cp1Var.n;
                if (op1Var == null) {
                    op1Var = null;
                }
                if (op1Var == null) {
                    return null;
                }
                cp1Var.a();
                op1 c = cr1Var.c(op1Var);
                if (c == null) {
                    return null;
                }
                if (c.equals(op1Var)) {
                    return cp1Var;
                }
                fp1 b4 = cr1Var.b();
                Bundle a4 = c.a(cp1Var.a());
                up1 up1Var = b4.h;
                return nm1.n(up1Var.a, c, a4, up1Var.g(), up1Var.p);
            case 26:
                return obj == ((jn1) obj2) ? "(this)" : String.valueOf(obj);
            case 27:
                return obj == ((ln1) obj2) ? "(this)" : String.valueOf(obj);
            case 28:
                float floatValue = ((Number) obj).floatValue();
                ry1 ry1Var = (ry1) obj2;
                long c2 = si1.c(ry1Var.k() * ry1Var.o()) + (ry1Var.j() * ry1Var.o());
                float f24 = ry1Var.h + floatValue;
                long c3 = si1.c(f24);
                ry1Var.h = f24 - c3;
                if (Math.abs(floatValue) >= 1.0E-4f) {
                    long j5 = c2 + c3;
                    long d4 = d.d(j5, ry1Var.g, ry1Var.f);
                    boolean z5 = j5 != d4;
                    long j6 = d4 - c2;
                    float f25 = j6;
                    ry1Var.i = f25;
                    if (Math.abs(j6) != 0) {
                        ry1Var.E.setValue(Boolean.valueOf(f25 > 0.0f));
                        ry1Var.F.setValue(Boolean.valueOf(f25 < 0.0f));
                    }
                    ky1 ky1Var = (ky1) ry1Var.o.getValue();
                    int i15 = (int) j6;
                    int i16 = -i15;
                    int i17 = ky1Var.g;
                    int i18 = ky1Var.f;
                    List list2 = ky1Var.a;
                    int i19 = ky1Var.b + ky1Var.c;
                    if (ky1Var.n || list2.isEmpty() || ky1Var.h == null || (i2 = ky1Var.k - i16) < 0 || i2 >= i19) {
                        f4 = 0.0f;
                    } else {
                        float f26 = i19 != 0 ? i16 / i19 : 0.0f;
                        float f27 = ky1Var.j - f26;
                        f4 = 0.0f;
                        if (ky1Var.i != null && f27 < 0.5f && f27 > -0.5f) {
                            rj1 rj1Var = (rj1) zv.u(list2);
                            rj1 rj1Var2 = (rj1) zv.B(list2);
                            if (i16 >= 0 ? Math.min(i18 - rj1Var.l, i17 - rj1Var2.l) > i16 : Math.min((rj1Var.l + i19) - i18, (rj1Var2.l + i19) - i17) > (-i16)) {
                                ky1Var.j -= f26;
                                ky1Var.k -= i16;
                                int size3 = list2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    ((rj1) list2.get(i20)).a(i16);
                                }
                                List list3 = ky1Var.o;
                                int size4 = list3.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    ((rj1) list3.get(i21)).a(i16);
                                }
                                List list4 = ky1Var.p;
                                int size5 = list4.size();
                                for (int i22 = 0; i22 < size5; i22++) {
                                    ((rj1) list4.get(i22)).a(i16);
                                }
                                if (!ky1Var.l && i16 > 0) {
                                    ky1Var.l = true;
                                }
                                ry1Var.h(ky1Var, true);
                                ry1Var.A.setValue(Unit.a);
                                floatValue = (!z5 ? Long.valueOf(j6) : Float.valueOf(floatValue)).floatValue();
                            }
                        }
                    }
                    my1 my1Var = ry1Var.c;
                    ry1 ry1Var2 = (ry1) my1Var.n;
                    hz1 hz1Var = (hz1) my1Var.p;
                    hz1Var.i(hz1Var.h() + (ry1Var2.o() == 0 ? f4 : i15 / ry1Var2.o()));
                    i91 i91Var2 = (i91) ry1Var.w.getValue();
                    if (i91Var2 != null) {
                        i91Var2.k();
                    }
                    floatValue = (!z5 ? Long.valueOf(j6) : Float.valueOf(floatValue)).floatValue();
                }
                return Float.valueOf(floatValue);
            default:
                float floatValue2 = ((Number) obj).floatValue();
                q80 q80Var = ((wy1) obj2).b;
                q80Var.r.i(q80Var.i(q80Var.j() + si1.b(q80Var.o() != 0 ? floatValue2 / q80Var.o() : 0.0f)));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6(int i, Object obj, Object obj2) {
        super(1);
        this.m = i;
        this.n = obj;
    }
}
