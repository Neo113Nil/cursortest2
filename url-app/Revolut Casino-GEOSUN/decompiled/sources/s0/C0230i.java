package s0;

import java.util.List;
import u0.C0247g;

/* renamed from: s0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230i extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2898i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f2899j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230i(List list, w0.d dVar) {
        super(2, dVar);
        this.f2899j = list;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        C0230i c0230i = new C0230i(this.f2899j, dVar);
        c0230i.f2898i = obj;
        return c0230i;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        C0230i c0230i = (C0230i) b((G.b) obj, (w0.d) obj2);
        C0247g c0247g = C0247g.f3005a;
        c0230i.l(c0247g);
        return c0247g;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        o.g.z(obj);
        G.b bVar = (G.b) this.f2898i;
        List<String> list = this.f2899j;
        if (list != null) {
            for (String str : list) {
                F0.i.e(str, "name");
                G.d dVar = new G.d(str);
                bVar.b();
                bVar.f327a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f327a.clear();
        }
        return C0247g.f3005a;
    }
}
