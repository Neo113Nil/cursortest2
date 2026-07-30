package g0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends m1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3984b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q6.a aVar) {
        super(aVar);
        t0 t0Var = t0.f3903k;
        this.f3985c = t0Var;
    }

    @Override // g0.m1
    public final n1 a(Object obj) {
        switch (this.f3984b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new n1(this, obj, obj == null, null, true);
            default:
                return new n1(this, obj, obj == null, (f2) this.f3985c, true);
        }
    }

    @Override // g0.m1
    public p2 b() {
        switch (this.f3984b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (a0) this.f3985c;
            default:
                return super.b();
        }
    }

    public z() {
        super(a.f3661i);
        this.f3985c = new a0();
    }
}
