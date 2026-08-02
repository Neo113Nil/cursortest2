package B0;

import java.util.List;

/* renamed from: B0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033k extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f159i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f160j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033k(List list, H0.d dVar) {
        super(2, dVar);
        this.f160j = list;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        C0033k c0033k = new C0033k(this.f160j, dVar);
        c0033k.f159i = obj;
        return c0033k;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        C0033k c0033k = (C0033k) b((H0.d) obj2, (L.b) obj);
        F0.h hVar = F0.h.f469a;
        c0033k.l(hVar);
        return hVar;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        F0.h hVar;
        i1.a.G(obj);
        L.b bVar = (L.b) this.f159i;
        F0.h hVar2 = F0.h.f469a;
        List<String> list = this.f160j;
        if (list != null) {
            for (String str : list) {
                Q0.h.e(str, "name");
                L.d dVar = new L.d(str);
                bVar.b();
                bVar.f757a.remove(dVar);
            }
            hVar = hVar2;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            bVar.b();
            bVar.f757a.clear();
        }
        return hVar2;
    }
}
