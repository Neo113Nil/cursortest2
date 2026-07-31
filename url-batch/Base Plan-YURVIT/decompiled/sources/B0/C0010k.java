package B0;

import a.AbstractC0086a;
import java.util.List;

/* renamed from: B0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010k extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f89i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f90j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0010k(List list, G0.d dVar) {
        super(2, dVar);
        this.f90j = list;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        C0010k c0010k = new C0010k(this.f90j, dVar);
        c0010k.f89i = obj;
        return c0010k;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        C0010k c0010k = (C0010k) b((G0.d) obj2, (I.b) obj);
        D0.h hVar = D0.h.f206a;
        c0010k.m(hVar);
        return hVar;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        I.b bVar = (I.b) this.f89i;
        AbstractC0086a.I(obj);
        List<String> list = this.f90j;
        if (list != null) {
            for (String str : list) {
                P0.h.e(str, "name");
                I.d dVar = new I.d(str);
                bVar.b();
                bVar.f514a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f514a.clear();
        }
        return D0.h.f206a;
    }
}
