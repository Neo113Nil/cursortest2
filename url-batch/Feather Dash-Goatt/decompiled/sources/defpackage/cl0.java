package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cl0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;

    public /* synthetic */ cl0(int i, List list) {
        this.d = i;
        this.e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.get(((Number) obj).intValue());
                break;
            default:
                this.e.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
