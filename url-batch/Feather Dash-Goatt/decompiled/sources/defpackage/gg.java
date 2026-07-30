package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gg extends sf1 implements Function2 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hg l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg(hg hgVar, dn dnVar, int i) {
        super(2, dnVar);
        this.i = i;
        this.l = hgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((gg) h((dn) obj2, (jz0) obj)).k(Unit.a);
            default:
                return ((gg) h((dn) obj2, (d00) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        int i = this.i;
        hg hgVar = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                gg ggVar = new gg(hgVar, dnVar, 0);
                ggVar.k = obj;
                return ggVar;
            default:
                gg ggVar2 = new gg(hgVar, dnVar, 1);
                ggVar2.k = obj;
                return ggVar2;
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        int i = this.i;
        hg hgVar = this.l;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i2 = this.j;
                if (i2 == 0) {
                    ca0.v(obj);
                    jz0 jz0Var = (jz0) this.k;
                    this.j = 1;
                    Object c = hgVar.c(new e91(jz0Var), this);
                    if (c != tnVar) {
                        c = Unit.a;
                    }
                    if (c == tnVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
            default:
                tn tnVar2 = tn.d;
                int i3 = this.j;
                if (i3 == 0) {
                    ca0.v(obj);
                    d00 d00Var = (d00) this.k;
                    this.j = 1;
                    if (hgVar.c(d00Var, this) == tnVar2) {
                        break;
                    }
                } else if (i3 != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca0.v(obj);
                }
                break;
        }
        return Unit.a;
    }
}
