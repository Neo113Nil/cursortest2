package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v81 implements Comparator {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Comparator b;

    public v81(v81 v81Var) {
        this.b = v81Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Comparator comparator = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int compare = comparator.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return jd0.X.compare(((l81) obj).c, ((l81) obj2).c);
            default:
                int compare2 = ((v81) comparator).compare(obj, obj2);
                return compare2 != 0 ? compare2 : dj.a(Integer.valueOf(((l81) obj).g), Integer.valueOf(((l81) obj2).g));
        }
    }

    public v81(Comparator comparator) {
        this.b = comparator;
    }
}
