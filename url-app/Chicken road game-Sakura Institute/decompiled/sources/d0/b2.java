package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.a f1858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(boolean z8, q6.a aVar, int i7) {
        super(1);
        this.f1856g = i7;
        this.f1857h = z8;
        this.f1858i = aVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f1856g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((z0.n0) obj).b(this.f1857h ? 1.0f : ((Number) this.f1858i.a()).floatValue());
                break;
            default:
                ((z0.n0) obj).e(!this.f1857h && ((Boolean) this.f1858i.a()).booleanValue());
                break;
        }
        return d6.z.f2639a;
    }
}
