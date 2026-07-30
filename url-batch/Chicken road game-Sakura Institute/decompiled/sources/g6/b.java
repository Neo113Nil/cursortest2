package g6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4472b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f4473c = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4474a;

    public /* synthetic */ b(int i7) {
        this.f4474a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4474a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                k.f(comparable, "a");
                k.f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                k.f(comparable3, "a");
                k.f(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f4474a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return f4473c;
            default:
                return f4472b;
        }
    }
}
