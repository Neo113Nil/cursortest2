package v0;

import c1.p;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b extends d1.i implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1190d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1191e;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1192c;

    static {
        int i2 = 2;
        f1190d = new b(i2, 0);
        f1191e = new b(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i3) {
        super(i2);
        this.f1192c = i3;
    }

    @Override // c1.p
    public final Object g(Object obj, Object obj2) {
        c cVar;
        switch (this.f1192c) {
            case 0:
                String str = (String) obj;
                f fVar = (f) obj2;
                str.getClass();
                if (str.length() == 0) {
                    return fVar.toString();
                }
                return str + ", " + fVar;
            default:
                h hVar = (h) obj;
                f fVar2 = (f) obj2;
                hVar.getClass();
                h i2 = hVar.i(fVar2.getKey());
                i iVar = i.f1196b;
                if (i2 == iVar) {
                    return fVar2;
                }
                e eVar = e.f1195b;
                k1.p pVar = (k1.p) i2.j(eVar);
                if (pVar == null) {
                    cVar = new c(fVar2, i2);
                } else {
                    h i3 = i2.i(eVar);
                    if (i3 == iVar) {
                        return new c(pVar, fVar2);
                    }
                    cVar = new c(pVar, new c(fVar2, i3));
                }
                return cVar;
        }
    }
}
