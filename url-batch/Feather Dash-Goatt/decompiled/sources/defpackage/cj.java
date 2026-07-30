package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                for (Function1 function1 : (Function1[]) obj3) {
                    int a = dj.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (a != 0) {
                        return a;
                    }
                }
                return 0;
            default:
                return ((Number) ((Function2) obj3).b(obj, obj2)).intValue();
        }
    }
}
