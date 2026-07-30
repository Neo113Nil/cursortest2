package q0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.c f7384h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.c f7385i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(q6.c cVar, q6.c cVar2, int i7) {
        super(1);
        this.f7383g = i7;
        this.f7384h = cVar;
        this.f7385i = cVar2;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7;
        switch (this.f7383g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l lVar = (l) obj;
                synchronized (n.f7427b) {
                    i7 = n.f7429d;
                    n.f7429d = i7 + 1;
                }
                return new c(i7, lVar, this.f7384h, this.f7385i);
            case 1:
                this.f7384h.f(obj);
                this.f7385i.f(obj);
                return d6.z.f2639a;
            default:
                this.f7384h.f(obj);
                this.f7385i.f(obj);
                return d6.z.f2639a;
        }
    }
}
