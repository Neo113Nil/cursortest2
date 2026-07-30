package s;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.l f8040b;

    public /* synthetic */ n(a0.l lVar, int i7) {
        this.f8039a = i7;
        this.f8040b = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8039a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj3 = ((r.m) obj).f7652g;
                a0.l lVar = this.f8040b;
                return a8.d.v(Integer.valueOf(lVar.b(obj3)), Integer.valueOf(lVar.b(((r.m) obj2).f7652g)));
            default:
                Object obj4 = ((r.m) obj2).f7652g;
                a0.l lVar2 = this.f8040b;
                return a8.d.v(Integer.valueOf(lVar2.b(obj4)), Integer.valueOf(lVar2.b(((r.m) obj).f7652g)));
        }
    }
}
