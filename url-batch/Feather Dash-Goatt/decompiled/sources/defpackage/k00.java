package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class k00 implements d00 {
    public final /* synthetic */ int d = 1;
    public final Object e;
    public final Object g;
    public final Function2 h;

    public k00(d00 d00Var, CoroutineContext coroutineContext) {
        this.e = coroutineContext;
        this.g = bi1.b(coroutineContext);
        this.h = new d(d00Var, null, 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    @Override // defpackage.d00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, dn dnVar) {
        j00 j00Var;
        int i;
        int i2 = this.d;
        Function2 function2 = this.h;
        Object obj2 = this.g;
        Object obj3 = this.e;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (dnVar instanceof j00) {
                    j00Var = (j00) dnVar;
                    int i3 = j00Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        j00Var.l = i3 - Integer.MIN_VALUE;
                        Object obj4 = j00Var.j;
                        tn tnVar = tn.d;
                        i = j00Var.l;
                        if (i != 0) {
                            ca0.v(obj4);
                            if (((v11) obj3).d) {
                                j00Var.l = 1;
                                if (((d00) obj2).e(obj, j00Var) == tnVar) {
                                    return tnVar;
                                }
                                return Unit.a;
                            }
                            j00Var.h = this;
                            j00Var.i = obj;
                            j00Var.l = 2;
                            obj4 = function2.b(obj, j00Var);
                            if (obj4 == tnVar) {
                                return tnVar;
                            }
                            if (!((Boolean) obj4).booleanValue()) {
                            }
                            return Unit.a;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                obj = j00Var.i;
                                this = j00Var.h;
                                ca0.v(obj4);
                                if (!((Boolean) obj4).booleanValue()) {
                                    ((v11) this.e).d = true;
                                    d00 d00Var = (d00) this.g;
                                    j00Var.h = null;
                                    j00Var.i = null;
                                    j00Var.l = 3;
                                    if (d00Var.e(obj, j00Var) == tnVar) {
                                        return tnVar;
                                    }
                                }
                                return Unit.a;
                            }
                            if (i != 3) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        ca0.v(obj4);
                        return Unit.a;
                    }
                }
                j00Var = new j00(this, dnVar);
                Object obj42 = j00Var.j;
                tn tnVar2 = tn.d;
                i = j00Var.l;
                if (i != 0) {
                }
            default:
                Object W = uq1.W((CoroutineContext) obj3, obj, obj2, (d) function2, dnVar);
                return W == tn.d ? W : Unit.a;
        }
    }

    public k00(v11 v11Var, d00 d00Var, Function2 function2) {
        this.e = v11Var;
        this.g = d00Var;
        this.h = function2;
    }
}
