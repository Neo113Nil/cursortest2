package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lf0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;

    public /* synthetic */ lf0(int i, int i2, Object obj) {
        this.d = i2;
        this.g = obj;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.e;
        Object obj3 = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                mf0 mf0Var = (mf0) obj3;
                hl hlVar = (hl) obj;
                int intValue = ((Integer) obj2).intValue();
                if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    ja0 a = mf0Var.b.a.a(i2);
                    ((hk) a.c.g).f(mf0Var.c, Integer.valueOf(i2 - a.a), hlVar, 0);
                } else {
                    hlVar.R();
                }
                break;
            default:
                ((Integer) obj2).intValue();
                gb0.a((Function0) obj3, (hl) obj, gb0.P(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
