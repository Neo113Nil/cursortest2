package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gk extends t2 implements Function2 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.l;
        Object obj3 = this.d;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hk hkVar = (hk) obj3;
                hkVar.c(((Number) obj2).intValue(), (hl) obj);
                break;
            default:
                v71 v71Var = (v71) obj3;
                uq1.N(v71Var.O.c(), null, new t71(v71Var, ((xm1) obj).a, null, 1), 3);
                break;
        }
        return Unit.a;
    }
}
