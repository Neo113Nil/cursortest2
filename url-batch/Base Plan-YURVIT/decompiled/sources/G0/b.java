package G0;

import O0.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f496e;

    public /* synthetic */ b(int i2) {
        this.f496e = i2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        c cVar;
        switch (this.f496e) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                P0.h.e(str, "acc");
                P0.h.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                P0.h.e(iVar, "acc");
                P0.h.e(gVar2, "element");
                i i2 = iVar.i(gVar2.getKey());
                j jVar = j.f500e;
                if (i2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f499e;
                f fVar = (f) i2.m(eVar);
                if (fVar == null) {
                    cVar = new c(i2, gVar2);
                } else {
                    i i3 = i2.i(eVar);
                    if (i3 == jVar) {
                        return new c(gVar2, fVar);
                    }
                    cVar = new c(new c(i3, gVar2), fVar);
                }
                return cVar;
        }
    }
}
