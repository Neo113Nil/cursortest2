package t3;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8825g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f8826h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(b0 b0Var, int i7) {
        super(1);
        this.f8825g = i7;
        this.f8826h = b0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        switch (this.f8825g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.k.f((v) obj, "destination");
                return Boolean.valueOf(!this.f8826h.f8757m.containsKey(Integer.valueOf(r2.f8862k)));
            default:
                r6.k.f((v) obj, "destination");
                return Boolean.valueOf(!this.f8826h.f8757m.containsKey(Integer.valueOf(r2.f8862k)));
        }
    }
}
