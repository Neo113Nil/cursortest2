package X0;

import f1.p;

/* loaded from: classes.dex */
public final class b extends g1.g implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1151c = new b(2, 0);
    public static final b d = new b(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1152b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.f1152b = i2;
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f1152b) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                g1.f.e(str, "acc");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                g1.f.e(iVar, "acc");
                i p2 = iVar.p(gVar2.getKey());
                j jVar = j.f1156a;
                if (p2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f1155a;
                f fVar = (f) p2.j(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, p2);
                } else {
                    i p3 = p2.p(eVar);
                    if (p3 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, p3));
                }
                return cVar;
        }
    }
}
