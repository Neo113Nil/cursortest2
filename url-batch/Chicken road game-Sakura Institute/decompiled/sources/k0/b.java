package k0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;
import r6.l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Collection f5295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, Collection collection) {
        super(1);
        this.f5294g = i7;
        this.f5295h = collection;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5294g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(this.f5295h.contains(obj));
            case 1:
                return Boolean.valueOf(this.f5295h.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f5295h));
        }
    }
}
