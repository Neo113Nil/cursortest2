package p2;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7114g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f7115h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(s sVar, int i7) {
        super(1);
        this.f7114g = i7;
        this.f7115h = sVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f7114g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s sVar = this.f7115h;
                sVar.show();
                return new c.g(1, sVar);
            default:
                s sVar2 = this.f7115h;
                sVar2.f7167j.getClass();
                sVar2.f7166i.a();
                return d6.z.f2639a;
        }
    }
}
