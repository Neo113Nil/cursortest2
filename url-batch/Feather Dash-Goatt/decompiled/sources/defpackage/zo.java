package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zo extends sf1 implements s30 {
    public final /* synthetic */ int i = 1;
    public int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(mp mpVar, dn dnVar) {
        super(3, dnVar);
        this.k = mpVar;
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new zo((mp) this.k, (dn) obj3).k(Unit.a);
            default:
                ((Boolean) obj2).getClass();
                zo zoVar = new zo(3, (dn) obj3);
                zoVar.k = (cy) obj;
                return zoVar.k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                int i = this.j;
                if (i == 0) {
                    ca0.v(obj);
                    mp mpVar = (mp) this.k;
                    this.j = 1;
                    if (mp.a(mpVar, this) == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                return Unit.a;
            default:
                tn tnVar2 = tn.d;
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ca0.v(obj);
                        return obj;
                    }
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca0.v(obj);
                cy cyVar = (cy) this.k;
                this.j = 1;
                cyVar.getClass();
                Object a = cy.a(cyVar, this);
                return a == tnVar2 ? tnVar2 : a;
        }
    }

    public /* synthetic */ zo(int i, dn dnVar) {
        super(i, dnVar);
    }
}
