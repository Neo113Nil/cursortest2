package defpackage;

import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m6 extends sf1 implements Function2 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(int i, dn dnVar, int i2) {
        super(i, dnVar);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((m6) h((dn) obj2, (sn) obj)).k(Unit.a);
            default:
                return ((m6) h((dn) obj2, (d00) obj)).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final dn h(dn dnVar, Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new m6(2, dnVar, 0);
            default:
                return new m6(2, dnVar, 1);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                ca0.v(obj);
                return Choreographer.getInstance();
            default:
                tn tnVar2 = tn.d;
                ca0.v(obj);
                return Unit.a;
        }
    }
}
