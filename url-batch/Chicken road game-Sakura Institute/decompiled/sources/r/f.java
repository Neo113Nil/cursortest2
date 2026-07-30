package r;

import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f7598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7599h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, int i7) {
        super(2);
        this.f7598g = hVar;
        this.f7599h = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            h hVar = this.f7598g;
            a0.l lVar = hVar.f7605b.f7597a;
            int i7 = this.f7599h;
            s.g d8 = lVar.d(i7);
            ((o0.a) d8.f8006c.f1232i).j(hVar.f7606c, Integer.valueOf(i7 - d8.f8004a), pVar, 0);
        }
        return z.f2639a;
    }
}
