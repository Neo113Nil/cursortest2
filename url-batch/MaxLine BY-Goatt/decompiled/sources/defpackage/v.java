package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Object obj2, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
        this.p = obj2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                return new v((bn1) this.o, (cy0) obj2, o30Var, 0);
            case 1:
                return new v((bn1) this.o, (dy0) obj2, o30Var, 1);
            case 2:
                v vVar = new v(2, o30Var, (nu) obj2);
                vVar.o = obj;
                return vVar;
            case 3:
                v vVar2 = new v(3, o30Var, (q9) obj2);
                vVar2.o = obj;
                return vVar2;
            case 4:
                return new v((ea) this.o, (t21) obj2, o30Var, 4);
            case 5:
                v vVar3 = new v(5, o30Var, (ua) obj2);
                vVar3.o = obj;
                return vVar3;
            case 6:
                v vVar4 = new v(6, o30Var, (m32) obj2);
                vVar4.o = obj;
                return vVar4;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                v vVar5 = new v(7, o30Var, (kj) obj2);
                vVar5.o = obj;
                return vVar5;
            case 8:
                return new v((sp) this.o, (bn) obj2, o30Var, 8);
            case 9:
                return new v((b41) this.o, (fn2) obj2, o30Var, 9);
            case 10:
                v vVar6 = new v(10, o30Var, (jt) obj2);
                vVar6.o = obj;
                return vVar6;
            case 11:
                v vVar7 = new v(11, o30Var, (kt) obj2);
                vVar7.o = obj;
                return vVar7;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return new v(12, o30Var, (iz) obj2);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return new v((lz) this.o, (Runnable) obj2, o30Var, 13);
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return new v((Function2) this.o, (j32) obj2, o30Var, 14);
            case 15:
                return new v((Function2) this.o, (c82) obj2, o30Var, 15);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                v vVar8 = new v(16, o30Var, (g30) obj2);
                vVar8.o = obj;
                return vVar8;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new v((x22) this.o, (gv2) obj2, o30Var, 17);
            case 18:
                return new v((g61) this.o, (q50) obj2, o30Var, 18);
            case 19:
                return new v((lb2) this.o, (Function1) obj2, o30Var, 19);
            case 20:
                v vVar9 = new v(20, o30Var, (List) obj2);
                vVar9.o = obj;
                return vVar9;
            case 21:
                return new v((Function2) this.o, (h60) obj2, o30Var, 21);
            case 22:
                v vVar10 = new v(22, o30Var, (i70) obj2);
                vVar10.o = obj;
                return vVar10;
            case 23:
                v vVar11 = new v(23, o30Var, (tf2) obj2);
                vVar11.o = obj;
                return vVar11;
            case 24:
                return new v((b41) this.o, (zn1) obj2, o30Var, 24);
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return new v((x22) this.o, (q80) obj2, o30Var, 25);
            case 26:
                v vVar12 = new v(26, o30Var, (q80) obj2);
                vVar12.o = obj;
                return vVar12;
            case 27:
                return new v((nc1) this.o, (j5) obj2, o30Var, 27);
            case 28:
                v vVar13 = new v(28, o30Var, (ij1) obj2);
                vVar13.o = obj;
                return vVar13;
            default:
                return new v((uj1) this.o, (Uri) obj2, o30Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 5:
                ((v) create((u21) obj, (o30) obj2)).invokeSuspend(Unit.a);
                break;
            case 18:
                ((v) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
                break;
            case 27:
                ((v) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((v) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02b2, code lost:
    
        if (defpackage.n90.a(500, r18) != r0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0294, code lost:
    
        if (r5 == r0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0565, code lost:
    
        if (r1 == r0) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
    
        if (r0 == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0683, code lost:
    
        if (defpackage.iv1.F(getContext()).B(new defpackage.lv0(r2, r8 ? 1 : 0), r18) == r0) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r0 == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05f9  */
    /* JADX WARN: Type inference failed for: r9v0, types: [o30] */
    /* JADX WARN: Type inference failed for: r9v15, types: [xy1] */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x02b2 -> B:134:0x0297). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:319:0x05d7 -> B:310:0x05db). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a50 a50Var;
        Object V;
        y72 y72Var;
        Object U;
        Object ba2Var;
        int i = this.m;
        int i2 = 3;
        int i3 = 0;
        Object obj2 = this.p;
        int i4 = 1;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        lp lpVar = null;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i5 = this.n;
                if (i5 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    if (((bn1) this.o).b((cy0) obj2, this) == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i5 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 1:
                b50 b50Var2 = b50.m;
                int i6 = this.n;
                if (i6 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    if (((bn1) this.o).b((dy0) obj2, this) == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i6 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 2:
                b50 b50Var3 = b50.m;
                int i7 = this.n;
                if (i7 == 0) {
                    ca2.b(obj);
                    x22 x22Var = (x22) this.o;
                    nu nuVar = (nu) obj2;
                    this.n = 1;
                    mu muVar = new mu(nuVar, null);
                    j6 j6Var = new j6(9, nuVar);
                    qd0 qd0Var = zs2.a;
                    Object t = j8.t(new da(x22Var, muVar, j6Var, new s42(x22Var), null), this);
                    Object obj3 = t;
                    if (t != b50Var3) {
                        obj3 = Unit.a;
                    }
                    if (obj3 != b50Var3) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == b50Var3) {
                        return b50Var3;
                    }
                } else {
                    if (i7 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 3:
                b50 b50Var4 = b50.m;
                int i8 = this.n;
                if (i8 == 0) {
                    ca2.b(obj);
                    x22 x22Var2 = (x22) this.o;
                    p9 p9Var = new p9(i3, r9, (q9) obj2);
                    this.n = 1;
                    if (yj1.j(x22Var2, p9Var, this) == b50Var4) {
                        return b50Var4;
                    }
                } else {
                    if (i8 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 4:
                b50 b50Var5 = b50.m;
                int i9 = this.n;
                if (i9 == 0) {
                    ca2.b(obj);
                    o3 o3Var = o3.t;
                    this.n = 1;
                    break;
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                        throw new k81();
                    }
                    ca2.b(obj);
                }
                xn1 i10 = ((ea) this.o).i();
                if (i10 == null) {
                    return Unit.a;
                }
                ba baVar = new ba(i3, (t21) obj2);
                this.n = 2;
                sk2.k((sk2) i10, baVar, this);
                return b50Var5;
            case 5:
                b50 b50Var6 = b50.m;
                int i11 = this.n;
                if (i11 == 0) {
                    ca2.b(obj);
                    u21 u21Var = (u21) this.o;
                    ua uaVar = (ua) obj2;
                    this.o = u21Var;
                    this.n = 1;
                    fs fsVar = new fs(1, q41.b(this));
                    fsVar.u();
                    sv2 sv2Var = uaVar.n;
                    i22 i22Var = sv2Var.a;
                    i22Var.a();
                    sv2Var.b.set(new wv2(sv2Var, i22Var));
                    fsVar.w(new p8(i2, u21Var, uaVar));
                    if (fsVar.s() == b50Var6) {
                        return b50Var6;
                    }
                } else {
                    if (i11 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                throw new k81();
            case 6:
                b50 b50Var7 = b50.m;
                int i12 = this.n;
                if (i12 == 0) {
                    ca2.b(obj);
                    a50Var = (a50) this.o;
                    if (j8.J(a50Var)) {
                    }
                } else {
                    if (i12 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a50Var = (a50) this.o;
                    ca2.b(obj);
                    m32 m32Var = (m32) obj2;
                    int[] iArr = m32Var.M;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    m32Var.x.getLocationOnScreen(iArr);
                    if (i13 == iArr[0] || i14 != iArr[1]) {
                        m32Var.k();
                    }
                    if (j8.J(a50Var)) {
                        o3 o3Var2 = o3.u;
                        this.o = a50Var;
                        this.n = 1;
                        if (getContext().m(qb2.T) != null) {
                            b71.o();
                            return null;
                        }
                        if (iv1.F(getContext()).B(o3Var2, this) == b50Var7) {
                            return b50Var7;
                        }
                        m32 m32Var2 = (m32) obj2;
                        int[] iArr2 = m32Var2.M;
                        int i132 = iArr2[0];
                        int i142 = iArr2[1];
                        m32Var2.x.getLocationOnScreen(iArr2);
                        if (i132 == iArr2[0]) {
                        }
                        m32Var2.k();
                        if (j8.J(a50Var)) {
                            return Unit.a;
                        }
                    }
                }
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                kj kjVar = (kj) obj2;
                Object obj4 = b50.m;
                int i15 = this.n;
                if (i15 == 0) {
                    ca2.b(obj);
                    r01 r01Var = (r01) this.o;
                    b72 b72Var = (b72) kjVar.E.getValue();
                    q01 a = r01.a(r01Var);
                    a.d = new gj(kjVar);
                    a.n = null;
                    a.o = null;
                    a.p = null;
                    l90 l90Var = r01Var.y;
                    if (l90Var.a == null) {
                        a.l = new gj(kjVar);
                        a.n = null;
                        a.o = null;
                        a.p = null;
                    }
                    if (l90Var.b == null) {
                        q20 q20Var = kjVar.z;
                        h72 h72Var = p33.b;
                        a.m = (Intrinsics.b(q20Var, p20.b) || Intrinsics.b(q20Var, p20.c)) ? me2.n : me2.m;
                    }
                    if (l90Var.c != s32.m) {
                        a.e = s32.n;
                    }
                    r01 a2 = a.a();
                    this.o = kjVar;
                    this.n = 1;
                    b72Var.getClass();
                    t80 t80Var = vb0.a;
                    V = z71.V(qh1.a.r, new z62(b72Var, a2, r9, i3), this);
                    break;
                } else {
                    if (i15 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kjVar = (kj) this.o;
                    ca2.b(obj);
                    V = obj;
                }
                s01 s01Var = (s01) V;
                kjVar.getClass();
                if (s01Var instanceof mq2) {
                    mq2 mq2Var = (mq2) s01Var;
                    return new bj(kjVar.j(mq2Var.a), mq2Var);
                }
                if (!(s01Var instanceof ni0)) {
                    a.b();
                    return null;
                }
                ni0 ni0Var = (ni0) s01Var;
                Drawable drawable = ni0Var.a;
                obj4 = new zi(drawable != null ? kjVar.j(drawable) : 0, ni0Var);
                return obj4;
            case 8:
                sp spVar = (sp) this.o;
                b50 b50Var8 = b50.m;
                int i16 = this.n;
                if (i16 == 0) {
                    ca2.b(obj);
                    if (spVar.z) {
                        if (spVar.m.z && (lpVar = (lp) nk2.i(spVar, sp.C)) == null) {
                            lpVar = new tp(spVar);
                        }
                        if (lpVar != null) {
                            this.n = 1;
                            if (lpVar.t0(s03.I(spVar), (bn) obj2, this) == b50Var8) {
                                return b50Var8;
                            }
                        }
                    }
                } else {
                    if (i16 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 9:
                b50 b50Var9 = b50.m;
                int i17 = this.n;
                if (i17 == 0) {
                    ca2.b(obj);
                    xm0 a3 = ((b41) this.o).a();
                    ba baVar2 = new ba(z2 ? 1 : 0, (fn2) obj2);
                    this.n = 1;
                    if (a3.a(baVar2, this) == b50Var9) {
                        return b50Var9;
                    }
                } else {
                    if (i17 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 10:
                b50 b50Var10 = b50.m;
                int i18 = this.n;
                if (i18 == 0) {
                    ca2.b(obj);
                    e52 e52Var = (e52) this.o;
                    this.n = 1;
                    if (((jt) obj2).d(e52Var, this) == b50Var10) {
                        return b50Var10;
                    }
                } else {
                    if (i18 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 11:
                b50 b50Var11 = b50.m;
                int i19 = this.n;
                if (i19 == 0) {
                    ca2.b(obj);
                    ym0 ym0Var = (ym0) this.o;
                    this.n = 1;
                    if (((kt) obj2).h(ym0Var, this) == b50Var11) {
                        return b50Var11;
                    }
                } else {
                    if (i19 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                iz izVar = (iz) obj2;
                b50 b50Var12 = b50.m;
                int i20 = this.n;
                if (i20 == 0) {
                    ca2.b(obj);
                    if (izVar.a()) {
                        y72 y72Var2 = new y72();
                        Function2 function2 = izVar.d;
                        lq lqVar = izVar.e;
                        lqVar.getClass();
                        dn0 dn0Var = new dn0(new ht(lqVar, z3 ? 1 : 0), new hz(y72Var2, null));
                        this.o = y72Var2;
                        this.n = 1;
                        if (function2.invoke(dn0Var, this) == b50Var12) {
                            return b50Var12;
                        }
                        y72Var = y72Var2;
                    }
                    return Unit.a;
                }
                if (i20 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y72Var = (y72) this.o;
                ca2.b(obj);
                if (!y72Var.m) {
                    lh.g("You must collect the progress flow");
                    return null;
                }
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                lz lzVar = (lz) this.o;
                b50 b50Var13 = b50.m;
                int i21 = this.n;
                if (i21 == 0) {
                    ca2.b(obj);
                    yx0 yx0Var = lzVar.f;
                    this.n = 1;
                    Object b = yx0Var.b(0.0f - yx0Var.b, this);
                    if (b != b50Var13) {
                        b = Unit.a;
                    }
                    if (b == b50Var13) {
                        return b50Var13;
                    }
                } else {
                    if (i21 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                ((lz1) lzVar.c.b).setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                b50 b50Var14 = b50.m;
                int i22 = this.n;
                if (i22 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    Object invoke = ((Function2) this.o).invoke((j32) obj2, this);
                    return invoke == b50Var14 ? b50Var14 : invoke;
                }
                if (i22 == 1) {
                    ca2.b(obj);
                    return obj;
                }
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                b50 b50Var15 = b50.m;
                int i23 = this.n;
                if (i23 != 0) {
                    if (i23 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                Function2 function22 = (Function2) this.o;
                Object obj5 = ((c82) obj2).m;
                this.n = 1;
                Object invoke2 = function22.invoke(obj5, this);
                return invoke2 == b50Var15 ? b50Var15 : invoke2;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                Object obj6 = b50.m;
                int i24 = this.n;
                if (i24 == 0) {
                    ca2.b(obj);
                    x22 x22Var3 = (x22) this.o;
                    j6 j6Var2 = new j6(12, (g30) obj2);
                    this.n = 1;
                    Object j = yj1.j(x22Var3, new p9(z4 ? 1 : 0, r9, j6Var2), this);
                    Object obj7 = j;
                    if (j != obj6) {
                        obj7 = Unit.a;
                    }
                    if (obj7 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i24 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                Object obj8 = b50.m;
                int i25 = this.n;
                if (i25 == 0) {
                    ca2.b(obj);
                    x22 x22Var4 = (x22) this.o;
                    y30 y30Var = new y30((gv2) obj2, z5 ? 1 : 0);
                    this.n = 1;
                    Object t2 = j8.t(new j5(x22Var4, zs2.a, y30Var, (o30) null, 11), this);
                    Object obj9 = t2;
                    if (t2 != obj8) {
                        obj9 = Unit.a;
                    }
                    if (obj9 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i25 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 18:
                q50 q50Var = (q50) obj2;
                b50 b50Var16 = b50.m;
                int i26 = this.n;
                try {
                    if (i26 == 0) {
                        ca2.b(obj);
                        g61 g61Var = (g61) this.o;
                        if (g61Var != null) {
                            this.n = 1;
                            g61Var.f(null);
                            Object J = g61Var.J(this);
                            if (J != b50Var16) {
                                J = Unit.a;
                                break;
                            }
                        }
                    } else if (i26 == 1) {
                        ca2.b(obj);
                    } else if (i26 == 2) {
                        ca2.b(obj);
                        q50Var.b.i(0.0f);
                        this.n = 3;
                        break;
                    } else {
                        if (i26 != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                    }
                    q50Var.b.i(1.0f);
                    this.n = 2;
                    if (n90.a(500L, this) == b50Var16) {
                        return b50Var16;
                    }
                    q50Var.b.i(0.0f);
                    this.n = 3;
                } catch (Throwable th) {
                    q50Var.b.i(0.0f);
                    throw th;
                }
                break;
            case 19:
                b50 b50Var17 = b50.m;
                int i27 = this.n;
                if (i27 != 0) {
                    if (i27 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                lb2 lb2Var = (lb2) this.o;
                b60 b60Var = new b60(lb2Var, r9, (Function1) obj2, z6 ? 1 : 0);
                this.n = 1;
                Object i28 = lb2Var.i(false, b60Var, this);
                return i28 == b50Var17 ? b50Var17 : i28;
            case 20:
                b50 b50Var18 = b50.m;
                int i29 = this.n;
                if (i29 == 0) {
                    ca2.b(obj);
                    q60 q60Var = (q60) this.o;
                    this.n = 1;
                    if (z71.b((List) obj2, q60Var, this) == b50Var18) {
                        return b50Var18;
                    }
                } else {
                    if (i29 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 21:
                b50 b50Var19 = b50.m;
                int i30 = this.n;
                if (i30 != 0) {
                    if (i30 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                Function2 function23 = (Function2) this.o;
                Object obj10 = ((h60) obj2).b;
                this.n = 1;
                Object invoke3 = function23.invoke(obj10, this);
                return invoke3 == b50Var19 ? b50Var19 : invoke3;
            case 22:
                b50 b50Var20 = b50.m;
                int i31 = this.n;
                if (i31 == 0) {
                    ca2.b(obj);
                    el1 el1Var = (el1) this.o;
                    this.n = 1;
                    if (i70.c((i70) obj2, el1Var, this) == b50Var20) {
                        return b50Var20;
                    }
                } else {
                    if (i31 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 23:
                b50 b50Var21 = b50.m;
                int i32 = this.n;
                if (i32 == 0) {
                    ca2.b(obj);
                    x22 x22Var5 = (x22) this.o;
                    i43 i43Var = new i43();
                    tf2 tf2Var = (tf2) obj2;
                    hd0 hd0Var = new hd0(tf2Var, x22Var5, new j30(i4, tf2Var, i43Var), new p8(16, i43Var, tf2Var), new id0(tf2Var, i3), new id0(tf2Var, z7 ? 1 : 0), new n8(10, i43Var, tf2Var), null);
                    this.n = 1;
                    if (j8.t(hd0Var, this) == b50Var21) {
                        return b50Var21;
                    }
                } else {
                    if (i32 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 24:
                b50 b50Var22 = b50.m;
                int i33 = this.n;
                if (i33 == 0) {
                    ca2.b(obj);
                    ArrayList arrayList = new ArrayList();
                    xm0 a4 = ((b41) this.o).a();
                    kc0 kc0Var = new kc0(i2, arrayList, (zn1) obj2);
                    this.n = 1;
                    if (a4.a(kc0Var, this) == b50Var22) {
                        return b50Var22;
                    }
                } else {
                    if (i33 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                b50 b50Var23 = b50.m;
                int i34 = this.n;
                if (i34 == 0) {
                    ca2.b(obj);
                    x22 x22Var6 = (x22) this.o;
                    sb1 sb1Var = new sb1(i3, r9, (q80) obj2);
                    this.n = 1;
                    if (yj1.j(x22Var6, sb1Var, this) == b50Var23) {
                        return b50Var23;
                    }
                } else {
                    if (i34 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 26:
                b50 b50Var24 = b50.m;
                int i35 = this.n;
                if (i35 == 0) {
                    ca2.b(obj);
                    v vVar = new v((x22) this.o, (q80) obj2, r9, 25);
                    this.n = 1;
                    if (j8.t(vVar, this) == b50Var24) {
                        return b50Var24;
                    }
                } else {
                    if (i35 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 27:
                b50 b50Var25 = b50.m;
                int i36 = this.n;
                if (i36 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    h22.a((nc1) this.o, (j5) obj2, this);
                    return b50Var25;
                }
                if (i36 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                throw new k81();
            case 28:
                ij1 ij1Var = (ij1) obj2;
                hk hkVar = ij1Var.b;
                a50 a50Var2 = (a50) this.o;
                b50 b50Var26 = b50.m;
                int i37 = this.n;
                if (i37 == 0) {
                    ca2.b(obj);
                    this.o = a50Var2;
                    this.n = 1;
                    U = l41.U(this, hkVar.a, new zd(5), true, false);
                    break;
                } else {
                    if (i37 != 1) {
                        if (i37 == 2) {
                            ca2.b(obj);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                    U = obj;
                }
                if (((Number) U).intValue() == 0) {
                    try {
                        aa2.a aVar = aa2.m;
                        Context context = ij1Var.a;
                        context.getClass();
                        ba2Var = bd3.A(context);
                    } catch (Throwable th2) {
                        aa2.a aVar2 = aa2.m;
                        ba2Var = new ba2(th2);
                    }
                    if (!(ba2Var instanceof ba2)) {
                        List list = (List) ba2Var;
                        if (!list.isEmpty()) {
                            this.o = null;
                            this.n = 2;
                            Object U2 = l41.U(this, hkVar.a, new ak(hkVar, list, i3), false, true);
                            if (U2 != b50.m) {
                                U2 = Unit.a;
                                break;
                            }
                        }
                    }
                }
                return Unit.a;
            default:
                b50 b50Var27 = b50.m;
                int i38 = this.n;
                if (i38 == 0) {
                    ca2.b(obj);
                    this.n = 1;
                    if (((uj1) this.o).a.S((Uri) obj2, this) == b50Var27) {
                        return b50Var27;
                    }
                } else {
                    if (i38 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, o30 o30Var, Object obj) {
        super(2, o30Var);
        this.m = i;
        this.p = obj;
    }
}
