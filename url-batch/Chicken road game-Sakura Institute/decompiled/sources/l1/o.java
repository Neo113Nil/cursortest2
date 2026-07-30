package l1;

import com.android.installreferrer.api.InstallReferrerClient;
import r1.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i7) {
        super(i7);
        this.f5823g = 2;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f5823g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((p) obj).getClass();
                return Boolean.TRUE;
            case 1:
                v0.c cVar = (v0.c) obj;
                if (!cVar.f8104f.f8116r) {
                    return p1.f7877g;
                }
                cVar.f9099s = null;
                return p1.f7876f;
            default:
                r6.k.f(obj, "it");
                u6.d.f9089f.getClass();
                return Integer.valueOf(u6.d.f9090g.a().nextInt(2147418112) + 65536);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i7, Object obj) {
        super(1);
        this.f5823g = i7;
    }
}
