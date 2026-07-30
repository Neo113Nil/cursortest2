package p0;

import g0.n2;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6999a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7000b = true;

    /* renamed from: c, reason: collision with root package name */
    public final j f7001c;

    public f(g gVar, Object obj) {
        this.f6999a = obj;
        Map map = (Map) gVar.f7003a.get(obj);
        c1.a aVar = new c1.a(23, gVar);
        n2 n2Var = k.f7012a;
        this.f7001c = new j(map, aVar);
    }
}
