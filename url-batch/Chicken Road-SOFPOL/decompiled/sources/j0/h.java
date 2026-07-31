package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.e f3676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0.c f3677f;

    public /* synthetic */ h(p6.e eVar, u0.c cVar, int i) {
        this.f3675d = i;
        this.f3676e = eVar;
        this.f3677f = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        int i = this.f3675d;
        c6.m mVar = c6.m.f1757a;
        u0.c cVar = this.f3677f;
        p6.e eVar = this.f3676e;
        int i8 = 0;
        switch (i) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                if (!sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    sVar.Q();
                    break;
                } else {
                    if (eVar == null) {
                        sVar.V(-1102039173);
                    } else {
                        sVar.V(795734342);
                        eVar.g(sVar, 0);
                    }
                    sVar.p(false);
                    cVar.g(sVar, 0);
                    break;
                }
            default:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.Q();
                    break;
                } else {
                    float f6 = j.f3706a;
                    j.b(u0.h.d(-459506658, new h(eVar, cVar, i8), sVar2), sVar2, 438);
                    break;
                }
        }
        return mVar;
    }
}
