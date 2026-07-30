package s;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f8038b;

    public /* synthetic */ m(r rVar, int i7) {
        this.f8037a = i7;
        this.f8038b = rVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8037a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj3 = ((r.m) obj).f7652g;
                r rVar = this.f8038b;
                return a8.d.v(Integer.valueOf(rVar.b(obj3)), Integer.valueOf(rVar.b(((r.m) obj2).f7652g)));
            default:
                Object obj4 = ((r.m) obj2).f7652g;
                r rVar2 = this.f8038b;
                return a8.d.v(Integer.valueOf(rVar2.b(obj4)), Integer.valueOf(rVar2.b(((r.m) obj).f7652g)));
        }
    }
}
