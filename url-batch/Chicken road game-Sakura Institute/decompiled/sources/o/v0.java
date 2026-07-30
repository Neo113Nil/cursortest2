package o;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6764g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6765h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6766i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(long j8, h6.d dVar, int i7) {
        super(2, dVar);
        this.f6764g = i7;
        this.f6766i = j8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        switch (this.f6764g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                v0 v0Var = new v0(this.f6766i, dVar, 0);
                v0Var.f6765h = obj;
                return v0Var;
            default:
                v0 v0Var2 = new v0(this.f6766i, dVar, 1);
                v0Var2.f6765h = obj;
                return v0Var2;
        }
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        h6.d dVar = (h6.d) obj2;
        switch (this.f6764g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                v0 v0Var = (v0) create(d1Var, dVar);
                d6.z zVar = d6.z.f2639a;
                v0Var.invokeSuspend(zVar);
                return zVar;
            default:
                v0 v0Var2 = (v0) create(d1Var, dVar);
                d6.z zVar2 = d6.z.f2639a;
                v0Var2.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6764g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.a.e(obj);
                f1 f1Var = ((d1) this.f6765h).f6593a;
                f1.a(f1Var, f1Var.f6616h, this.f6766i, 1);
                break;
            default:
                d6.a.e(obj);
                f1 f1Var2 = ((d1) this.f6765h).f6593a;
                f1.a(f1Var2, f1Var2.f6616h, this.f6766i, 1);
                break;
        }
        return d6.z.f2639a;
    }
}
