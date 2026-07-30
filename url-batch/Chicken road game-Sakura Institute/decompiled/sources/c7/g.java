package c7;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements q6.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1695g;

    public /* synthetic */ g(int i7, Object obj) {
        this.f1694f = i7;
        this.f1695g = obj;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f1694f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((g4.b) this.f1695g).f((Throwable) obj);
                break;
            case 1:
                k7.c cVar = (k7.c) this.f1695g;
                k7.c.f5379g.set(cVar, null);
                cVar.e(null);
                break;
            default:
                ((k7.g) this.f1695g).b();
                break;
        }
        return d6.z.f2639a;
    }

    public /* synthetic */ g(k7.c cVar, k7.b bVar) {
        this.f1694f = 1;
        this.f1695g = cVar;
    }
}
