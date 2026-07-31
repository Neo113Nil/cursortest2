package P1;

/* loaded from: classes.dex */
public final class b extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3067f = new b(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final b f3068g = new b(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i4) {
        super(i3);
        this.f3069e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        c cVar;
        switch (this.f3069e) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                Z1.i.f(str, "acc");
                Z1.i.f(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                Z1.i.f(iVar, "acc");
                Z1.i.f(gVar2, "element");
                i x3 = iVar.x(gVar2.getKey());
                j jVar = j.f3073d;
                if (x3 == jVar) {
                    return gVar2;
                }
                e eVar = e.f3072d;
                f fVar = (f) x3.k(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, x3);
                } else {
                    i x4 = x3.x(eVar);
                    if (x4 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, x4));
                }
                return cVar;
        }
    }
}
