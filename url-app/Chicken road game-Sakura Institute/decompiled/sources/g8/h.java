package g8;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4560a;

    public /* synthetic */ h(int i7) {
        this.f4560a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4560a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return a8.d.v(((g) obj).f4552a, ((g) obj2).f4552a);
            default:
                return ((t5.c) obj).compareTo((t5.c) obj2);
        }
    }
}
