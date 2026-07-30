package s1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8137a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f8138b;

    public b0(Comparator comparator) {
        this.f8138b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8137a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int compare = this.f8138b.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return r1.d0.N.compare(((y1.m) obj).f9839c, ((y1.m) obj2).f9839c);
            default:
                int compare2 = ((b0) this.f8138b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : a8.d.v(Integer.valueOf(((y1.m) obj).f9843g), Integer.valueOf(((y1.m) obj2).f9843g));
        }
    }

    public b0(b0 b0Var) {
        this.f8138b = b0Var;
    }
}
