package u3;

import com.android.installreferrer.api.InstallReferrerClient;
import t3.b0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f9037h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t3.y f9038i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0.o f9039j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s0.c f9040k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q6.c f9041l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q6.c f9042m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q6.c f9043n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q6.c f9044o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f9045p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(b0 b0Var, t3.y yVar, s0.o oVar, s0.c cVar, q6.c cVar2, q6.c cVar3, q6.c cVar4, q6.c cVar5, int i7, int i8) {
        super(2);
        this.f9036g = i8;
        this.f9037h = b0Var;
        this.f9038i = yVar;
        this.f9039j = oVar;
        this.f9040k = cVar;
        this.f9041l = cVar2;
        this.f9042m = cVar3;
        this.f9043n = cVar4;
        this.f9044o = cVar5;
        this.f9045p = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f9036g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                z.b(this.f9037h, this.f9038i, this.f9039j, this.f9040k, this.f9041l, this.f9042m, this.f9043n, this.f9044o, (g0.p) obj, g0.d.T(this.f9045p | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                z.b(this.f9037h, this.f9038i, this.f9039j, this.f9040k, this.f9041l, this.f9042m, this.f9043n, this.f9044o, (g0.p) obj, g0.d.T(this.f9045p | 1));
                break;
            default:
                ((Number) obj2).intValue();
                z.b(this.f9037h, this.f9038i, this.f9039j, this.f9040k, this.f9041l, this.f9042m, this.f9043n, this.f9044o, (g0.p) obj, g0.d.T(this.f9045p | 1));
                break;
        }
        return d6.z.f2639a;
    }
}
