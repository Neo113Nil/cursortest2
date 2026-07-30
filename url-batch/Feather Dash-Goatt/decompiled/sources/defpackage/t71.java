package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t71 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ Object k;
    public /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t71(Object obj, long j, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.k = obj;
        this.l = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((t71) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 1:
                return ((t71) h((dn) obj2, (sn) obj)).k(Unit.a);
            case 2:
                long j = ((wq0) obj).a;
                t71 t71Var = new t71((v71) this.k, (dn) obj2);
                t71Var.l = j;
                return t71Var.k(Unit.a);
            default:
                return ((t71) h((dn) obj2, (sn) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Object obj2 = this.k;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new t71((v71) obj2, this.l, dnVar, 0);
            case 1:
                return new t71((v71) obj2, this.l, dnVar, 1);
            case 2:
                t71 t71Var = new t71((v71) obj2, dnVar);
                t71Var.l = ((wq0) obj).a;
                return t71Var;
            default:
                return new t71((c7) obj2, this.l, dnVar, 3);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        Object obj2 = this.k;
        dn dnVar = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    d81 d81Var = ((v71) obj2).R;
                    go0 go0Var = go0.e;
                    s71 s71Var = new s71(this.l, dnVar, 0);
                    this.j = 1;
                    if (d81Var.f(go0Var, s71Var, this) == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i2 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 1:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    d81 d81Var2 = ((v71) obj2).R;
                    long j = this.l;
                    this.j = 1;
                    if (d81Var2.b(j, true, this) == tnVar2) {
                        return tnVar2;
                    }
                } else {
                    if (i3 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            case 2:
                tn tnVar3 = tn.d;
                int i4 = this.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                long j2 = this.l;
                d81 d81Var3 = ((v71) obj2).R;
                this.j = 1;
                Object a = p71.a(d81Var3, j2, this);
                return a == tnVar3 ? tnVar3 : a;
            default:
                tn tnVar4 = tn.d;
                int i5 = this.j;
                if (i5 == 0) {
                    ca0.v(obj);
                    wo0 wo0Var = ((c7) obj2).d;
                    long j3 = this.l;
                    this.j = 1;
                    if (wo0Var.b(j3, this) == tnVar4) {
                        return tnVar4;
                    }
                } else {
                    if (i5 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t71(v71 v71Var, dn dnVar) {
        super(2, dnVar);
        this.i = 2;
        this.k = v71Var;
    }
}
