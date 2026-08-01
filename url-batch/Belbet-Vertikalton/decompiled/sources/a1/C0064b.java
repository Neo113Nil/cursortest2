package a1;

import i1.p;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064b extends j1.i implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0064b f1667c = new C0064b(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0064b f1668d = new C0064b(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1669b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0064b(int i, int i2) {
        super(i);
        this.f1669b = i2;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        C0065c c0065c;
        switch (this.f1669b) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                j1.h.e(str, "acc");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                j1.h.e(iVar, "acc");
                i z2 = iVar.z(gVar2.getKey());
                j jVar = j.f1673a;
                if (z2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f1672a;
                f fVar = (f) z2.d(eVar);
                if (fVar == null) {
                    c0065c = new C0065c(gVar2, z2);
                } else {
                    i z3 = z2.z(eVar);
                    if (z3 == jVar) {
                        return new C0065c(fVar, gVar2);
                    }
                    c0065c = new C0065c(fVar, new C0065c(gVar2, z3));
                }
                return c0065c;
        }
    }
}
