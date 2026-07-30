package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n60 extends pc0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ o60[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n60(o60[] o60VarArr, int i) {
        super(2);
        this.d = i;
        this.e = o60VarArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        o60[] o60VarArr = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Float.valueOf(t80.a((yw0) obj, true, o60VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(t80.a((yw0) obj, false, o60VarArr, ((Number) obj2).floatValue()));
        }
    }
}
