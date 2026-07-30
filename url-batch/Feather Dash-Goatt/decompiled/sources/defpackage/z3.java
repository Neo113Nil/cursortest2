package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z3 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3(int i, int i2) {
        super(1);
        this.d = i2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        int i2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(((o10) obj).G0(i2));
            case 1:
                return Boolean.valueOf(((o10) obj).G0(i2));
            case 2:
                return Boolean.valueOf(((o10) obj).G0(i2));
            default:
                return Boolean.valueOf(((o10) obj).z0(i2));
        }
    }
}
