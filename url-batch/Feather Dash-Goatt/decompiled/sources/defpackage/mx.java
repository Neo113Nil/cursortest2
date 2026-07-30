package defpackage;

import android.app.Activity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mx implements Function1 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;

    public /* synthetic */ mx(int i, Collection collection) {
        this.e = i;
        this.g = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Object obj2 = this.g;
        int i2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ps) obj).getClass();
                ((Activity) obj2).setRequestedOrientation(i2);
                return new px();
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ mx(Activity activity, int i) {
        this.g = activity;
        this.e = i;
    }
}
