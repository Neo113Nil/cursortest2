package H0;

import P0.p;

/* loaded from: classes.dex */
public final class b extends Q0.i implements p {

    /* renamed from: g, reason: collision with root package name */
    public static final b f497g = new b(2, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final b f498h = new b(2, 1);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f499f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3) {
        super(i2);
        this.f499f = i3;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        c cVar;
        switch (this.f499f) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                Q0.h.e(str, "acc");
                Q0.h.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                Q0.h.e(iVar, "acc");
                Q0.h.e(gVar2, "element");
                i d2 = iVar.d(gVar2.getKey());
                j jVar = j.f503e;
                if (d2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f502e;
                f fVar = (f) d2.k(eVar);
                if (fVar == null) {
                    cVar = new c(d2, gVar2);
                } else {
                    i d3 = d2.d(eVar);
                    if (d3 == jVar) {
                        return new c(gVar2, fVar);
                    }
                    cVar = new c(new c(d3, gVar2), fVar);
                }
                return cVar;
        }
    }
}
