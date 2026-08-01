package b1;

import j1.p;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082b extends k1.f implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0082b f2042c = new C0082b(2, 0);
    public static final C0082b d = new C0082b(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0082b(int i, int i2) {
        super(i);
        this.f2043b = i2;
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f2043b) {
            case 0:
                String str = (String) obj;
                h hVar = (h) obj2;
                k1.e.e(str, "acc");
                if (str.length() == 0) {
                    return hVar.toString();
                }
                return str + ", " + hVar;
            default:
                j jVar = (j) obj;
                h hVar2 = (h) obj2;
                k1.e.e(jVar, "acc");
                j d2 = jVar.d(hVar2.getKey());
                k kVar = k.f2050a;
                if (d2 == kVar) {
                    return hVar2;
                }
                e eVar = e.f2046a;
                f fVar = (f) d2.p(eVar);
                if (fVar == null) {
                    cVar = new c(hVar2, d2);
                } else {
                    j d3 = d2.d(eVar);
                    if (d3 == kVar) {
                        return new c(fVar, hVar2);
                    }
                    cVar = new c(fVar, new c(hVar2, d3));
                }
                return cVar;
        }
    }
}
