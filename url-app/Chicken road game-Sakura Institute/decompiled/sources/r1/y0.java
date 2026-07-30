package r1;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f7920h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0.n f7921i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f7922j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7923k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f7924l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f7925m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f7926n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f7927o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(a1 a1Var, s0.n nVar, d dVar, long j8, r rVar, boolean z8, boolean z9, float f9, int i7) {
        super(0);
        this.f7919g = i7;
        this.f7920h = a1Var;
        this.f7921i = nVar;
        this.f7922j = dVar;
        this.f7923k = j8;
        this.f7924l = rVar;
        this.f7925m = z8;
        this.f7926n = z9;
        this.f7927o = f9;
    }

    @Override // q6.a
    public final Object a() {
        switch (this.f7919g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s0.n e9 = f.e(this.f7921i, this.f7922j.a());
                a1 a1Var = this.f7920h;
                d dVar = this.f7922j;
                long j8 = this.f7923k;
                r rVar = this.f7924l;
                boolean z8 = this.f7925m;
                boolean z9 = this.f7926n;
                if (e9 == null) {
                    a1Var.R0(dVar, j8, rVar, z8, z9);
                } else {
                    float f9 = this.f7927o;
                    rVar.g(e9, f9, z9, new y0(a1Var, e9, dVar, j8, rVar, z8, z9, f9, 0));
                }
                break;
            default:
                this.f7920h.c1(f.e(this.f7921i, this.f7922j.a()), this.f7922j, this.f7923k, this.f7924l, this.f7925m, this.f7926n, this.f7927o);
                break;
        }
        return d6.z.f2639a;
    }
}
