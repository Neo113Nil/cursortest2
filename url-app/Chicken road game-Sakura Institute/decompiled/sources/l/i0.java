package l;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5527g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5528h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5529i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5530j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5531k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Number number, f0 f0Var, Number number2, e0 e0Var) {
        super(0);
        this.f5527g = 0;
        this.f5528h = number;
        this.f5530j = f0Var;
        this.f5529i = number2;
        this.f5531k = e0Var;
    }

    @Override // q6.a
    public final Object a() {
        f7.w i7;
        switch (this.f5527g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Number number = (Number) this.f5529i;
                Number number2 = (Number) this.f5528h;
                f0 f0Var = (f0) this.f5530j;
                if (!number2.equals(f0Var.f5473f) || !number.equals(f0Var.f5474g)) {
                    e0 e0Var = (e0) this.f5531k;
                    f0Var.f5473f = number2;
                    f0Var.f5474g = number;
                    f0Var.f5477j = new i1(e0Var, f0Var.f5475h, number2, number, null);
                    f0Var.f5481n.f5501b.setValue(Boolean.TRUE);
                    f0Var.f5478k = false;
                    f0Var.f5479l = true;
                }
                return d6.z.f2639a;
            case 1:
                ((p2.s) this.f5528h).g((q6.a) this.f5529i, (p2.r) this.f5530j, (m2.k) this.f5531k);
                return d6.z.f2639a;
            default:
                if (!((w.j0) this.f5528h).b()) {
                    ((x0.n) this.f5529i).a(x0.h.f9609k);
                }
                int i8 = ((g2.m) this.f5530j).f4045d;
                if (i8 != 7 && i8 != 8 && (i7 = ((y.d) this.f5531k).i()) != null) {
                    ((f7.e0) i7).i(d6.z.f2639a);
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(0);
        this.f5527g = i7;
        this.f5528h = obj;
        this.f5529i = obj2;
        this.f5530j = obj3;
        this.f5531k = obj4;
    }
}
