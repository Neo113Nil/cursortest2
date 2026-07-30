package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rp extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(wf0 wf0Var, int i, dn dnVar) {
        super(2, dnVar);
        this.i = 6;
        this.k = wf0Var;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 1:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 2:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 3:
                ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
                return tn.d;
            case 4:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((rp) h((dn) obj2, (f71) obj)).k(Unit.a);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                return ((rp) h((dn) obj2, (sn) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = 2;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new rp((sp) this.k, dnVar, 0);
            case 1:
                return new rp((s10) this.k, dnVar, 1);
            case 2:
                return new rp((da) this.k, dnVar, i);
            case 3:
                return new rp((yu0) this.k, dnVar, 3);
            case 4:
                return new rp((fb0) this.k, dnVar, 4);
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return new rp((yw) this.k, dnVar, 5);
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new rp((wf0) this.k, this.j, dnVar);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                rp rpVar = new rp(i, dnVar);
                rpVar.k = obj;
                return rpVar;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return new rp((zr) this.k, dnVar, 8);
            default:
                return new rp((wf1) this.k, dnVar, 9);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        sn snVar;
        dn dnVar = null;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i = this.j;
                if (i != 0) {
                    if (i == 1) {
                        ca0.v(obj);
                        return Unit.a;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                x11 x11Var = new x11();
                x11 x11Var2 = new x11();
                x11 x11Var3 = new x11();
                sp spVar = (sp) this.k;
                ca1 ca1Var = spVar.s.a;
                lg lgVar = new lg(x11Var, x11Var2, x11Var3, spVar, 1);
                this.j = 1;
                ca1Var.getClass();
                ca1.k(ca1Var, lgVar, this);
                return tnVar;
            case 1:
                tn tnVar2 = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    s10 s10Var = (s10) this.k;
                    this.j = 1;
                    if (la0.w(s10Var, null, this) == tnVar2) {
                        return tnVar2;
                    }
                } else {
                    if (i2 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 2:
                tn tnVar3 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    da daVar = (da) this.k;
                    this.j = 1;
                    if (daVar.a(this) == tnVar3) {
                        return tnVar3;
                    }
                } else {
                    if (i3 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 3:
                tn tnVar4 = tn.d;
                int i4 = this.j;
                if (i4 != 0 && i4 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                do {
                    ((yu0) this.k).i(System.currentTimeMillis());
                    this.j = 1;
                } while (mo.l(1000L, this) != tnVar4);
                return tnVar4;
            case 4:
                tn tnVar5 = tn.d;
                int i5 = this.j;
                if (i5 == 0) {
                    ca0.v(obj);
                    c00 o = ((fb0) this.k).c.o();
                    this.j = 1;
                    obj = p4.G(o, this);
                    if (obj == tnVar5) {
                        return tnVar5;
                    }
                } else {
                    if (i5 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                qn0 qn0Var = (qn0) obj;
                if (qn0Var != null) {
                    return qn0Var.a();
                }
                ov ovVar = ov.d;
                ovVar.getClass();
                return ovVar;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                tn tnVar6 = tn.d;
                int i6 = this.j;
                if (i6 == 0) {
                    ca0.v(obj);
                    q7 q7Var = (q7) ((yw) this.k).g;
                    Float f = new Float(0.0f);
                    oc1 a0 = p4.a0(1, new Float(0.5f));
                    this.j = 1;
                    if (ka0.g(q7Var, f, a0, new k61(12), this) == tnVar6) {
                        return tnVar6;
                    }
                } else {
                    if (i6 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                tn tnVar7 = tn.d;
                ca0.v(obj);
                wf0 wf0Var = (wf0) this.k;
                int i7 = this.j;
                vg vgVar = wf0Var.e;
                if (((xu0) vgVar.b).h() != i7 || ((xu0) vgVar.c).h() != 0) {
                    ne0 ne0Var = wf0Var.n;
                    ne0Var.d();
                    ne0Var.b = null;
                }
                vgVar.b(i7, 0);
                vgVar.d = null;
                jd0 jd0Var = wf0Var.k;
                if (jd0Var != null) {
                    jd0Var.k();
                }
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                tn tnVar8 = tn.d;
                int i8 = this.j;
                if (i8 == 0) {
                    ca0.v(obj);
                    snVar = (sn) this.k;
                } else {
                    if (i8 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    snVar = (sn) this.k;
                    ca0.v(obj);
                }
                while (t80.B(snVar.f())) {
                    q1 q1Var = new q1(17);
                    this.k = snVar;
                    this.j = 1;
                    CoroutineContext coroutineContext = this.e;
                    coroutineContext.getClass();
                    if (t90.r(coroutineContext).j(q1Var, this) == tnVar8) {
                        return tnVar8;
                    }
                }
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                tn tnVar9 = tn.d;
                int i9 = this.j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                we weVar = (we) ((zr) this.k).f;
                this.j = 1;
                Object A = la0.A(new d(weVar, dnVar, 14), this);
                return A == tnVar9 ? tnVar9 : A;
            default:
                wf1 wf1Var = (wf1) this.k;
                tn tnVar10 = tn.d;
                int i10 = this.j;
                if (i10 == 0) {
                    ca0.v(obj);
                    PointerInputEventHandler pointerInputEventHandler = wf1Var.u;
                    this.j = 2;
                    if (pointerInputEventHandler.invoke(wf1Var, this) == tnVar10) {
                        return tnVar10;
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp(int i, dn dnVar) {
        super(i, dnVar);
        this.i = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp(Object obj, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = obj;
    }
}
