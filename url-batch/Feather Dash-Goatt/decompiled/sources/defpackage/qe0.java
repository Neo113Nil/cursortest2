package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qe0 implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ mf0 e;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qe0(int i, mf0 mf0Var, Object obj) {
        this.e = mf0Var;
        this.g = i;
        this.h = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        Object obj3 = this.h;
        int i2 = this.g;
        mf0 mf0Var = this.e;
        hl hlVar = (hl) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int intValue = num.intValue();
                if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    mf0Var.a(i2, obj3, hlVar, 0);
                } else {
                    hlVar.R();
                }
                break;
            default:
                num.getClass();
                mf0Var.a(i2, obj3, hlVar, gb0.P(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qe0(mf0 mf0Var, int i, Object obj, int i2) {
        this.e = mf0Var;
        this.g = i;
        this.h = obj;
    }
}
