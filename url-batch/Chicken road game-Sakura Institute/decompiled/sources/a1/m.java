package a1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f258b;

    public /* synthetic */ m(q qVar, int i7) {
        this.f257a = i7;
        this.f258b = qVar;
    }

    @Override // a1.i
    public final double d(double d8) {
        switch (this.f257a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return v1.g.c(this.f258b.f273k.d(d8), r10.f267e, r10.f268f);
            default:
                return this.f258b.f276n.d(v1.g.c(d8, r0.f267e, r0.f268f));
        }
    }
}
