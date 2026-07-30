package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class au extends sf1 implements s30 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(int i, dn dnVar, int i2) {
        super(i, dnVar);
        this.i = i2;
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j = ((wq0) obj2).a;
                return new au(3, (dn) obj3, 0).k(Unit.a);
            case 1:
                ((Number) obj2).floatValue();
                return new au(3, (dn) obj3, 1).k(Unit.a);
            default:
                long j2 = ((wq0) obj2).a;
                return new au(3, (dn) obj3, 2).k(Unit.a);
        }
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                tn tnVar = tn.d;
                ca0.v(obj);
                break;
            case 1:
                tn tnVar2 = tn.d;
                ca0.v(obj);
                break;
            default:
                tn tnVar3 = tn.d;
                ca0.v(obj);
                break;
        }
        return Unit.a;
    }
}
