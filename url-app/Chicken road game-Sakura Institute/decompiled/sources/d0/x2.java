package d0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2523g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2524h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2525i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(int i7, Collection collection) {
        super(1);
        this.f2524h = i7;
        this.f2525i = collection;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f2523g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p1.m0.d((p1.m0) obj, (p1.n0) this.f2525i, 0, -this.f2524h);
                return d6.z.f2639a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f2524h, (Collection) this.f2525i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(p1.n0 n0Var, int i7) {
        super(1);
        this.f2525i = n0Var;
        this.f2524h = i7;
    }
}
