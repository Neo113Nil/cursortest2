package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fy0 extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fy0(Function2 function2, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        qn0 qn0Var = (qn0) obj;
        dn dnVar = (dn) obj2;
        switch (this.i) {
        }
        return ((fy0) h(dnVar, qn0Var)).k(Unit.a);
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        Function2 function2 = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                fy0 fy0Var = new fy0(function2, dnVar, 0);
                fy0Var.k = obj;
                return fy0Var;
            default:
                fy0 fy0Var2 = new fy0(function2, dnVar, 1);
                fy0Var2.k = obj;
                return fy0Var2;
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        Function2 function2 = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    qn0 qn0Var = (qn0) this.k;
                    this.j = 1;
                    obj = function2.b(qn0Var, this);
                    if (obj == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i2 != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                qn0 qn0Var2 = (qn0) obj;
                qn0Var2.getClass();
                ((AtomicBoolean) qn0Var2.b.e).set(true);
                return qn0Var2;
            default:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    qn0 qn0Var3 = new qn0(new LinkedHashMap(((qn0) this.k).a()), false);
                    this.k = qn0Var3;
                    this.j = 1;
                    return function2.b(qn0Var3, this) == tnVar2 ? tnVar2 : qn0Var3;
                }
                if (i3 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qn0 qn0Var4 = (qn0) this.k;
                ca0.v(obj);
                return qn0Var4;
        }
    }
}
