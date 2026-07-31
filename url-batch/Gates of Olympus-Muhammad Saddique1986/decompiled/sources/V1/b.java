package V1;

import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class b extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final b f4552f = new b(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final b f4553g = new b(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i4) {
        super(i3);
        this.f4554e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        c cVar;
        switch (this.f4554e) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                f2.j.f(str, "acc");
                f2.j.f(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                f2.j.f(iVar, "acc");
                f2.j.f(gVar2, "element");
                i l3 = iVar.l(gVar2.getKey());
                j jVar = j.f4558d;
                if (l3 == jVar) {
                    return gVar2;
                }
                e eVar = e.f4557d;
                f fVar = (f) l3.v(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, l3);
                } else {
                    i l4 = l3.l(eVar);
                    if (l4 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, l4));
                }
                return cVar;
        }
    }
}
