package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4355g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f4356h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i7, List list) {
        super(1);
        this.f4355g = i7;
        this.f4356h = list;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f4355g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f4356h.get(((Number) obj).intValue());
                return null;
            case 1:
                this.f4356h.get(((Number) obj).intValue());
                return null;
            case 2:
                this.f4356h.get(((Number) obj).intValue());
                return null;
            case 3:
                this.f4356h.get(((Number) obj).intValue());
                return null;
            default:
                List list = this.f4356h;
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((q6.c) list.get(i7)).f(obj);
                }
                return d6.z.f2639a;
        }
    }
}
