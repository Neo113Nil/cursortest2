package e6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements y6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2823a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2824b;

    public /* synthetic */ s(int i7, Object obj) {
        this.f2823a = i7;
        this.f2824b = obj;
    }

    @Override // y6.f
    public final Iterator iterator() {
        switch (this.f2823a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Iterable) this.f2824b).iterator();
            case 1:
                return new i.z(this);
            default:
                return (Iterator) this.f2824b;
        }
    }
}
