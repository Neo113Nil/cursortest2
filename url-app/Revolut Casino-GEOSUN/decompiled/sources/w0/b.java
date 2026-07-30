package w0;

import E0.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3078e;

    public /* synthetic */ b(int i2) {
        this.f3078e = i2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        c cVar;
        switch (this.f3078e) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                F0.i.e(str, "acc");
                F0.i.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                F0.i.e(iVar, "acc");
                F0.i.e(gVar2, "element");
                i i2 = iVar.i(gVar2.getKey());
                j jVar = j.f3082e;
                if (i2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f3081e;
                f fVar = (f) i2.f(eVar);
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
