package y3;

import a4.AbstractC0197c;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class p implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public Map f12423a;

    /* renamed from: b, reason: collision with root package name */
    public A3.b f12424b;

    /* renamed from: c, reason: collision with root package name */
    public A3.b f12425c;

    /* renamed from: d, reason: collision with root package name */
    public g f12426d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f12424b.getClass();
        N3.a aVar = (N3.a) obj;
        AbstractC0197c j2 = aVar.j();
        Map map = (Map) this.f12423a.get(j2);
        if (map == null) {
            map = (Map) this.f12426d.f12406k.a();
            this.f12423a.put(j2, map);
        }
        this.f12425c.getClass();
        J3.a l2 = aVar.l();
        List list = (List) map.get(l2);
        if (list == null) {
            list = (List) this.f12426d.f12407l.a();
            map.put(l2, list);
        }
        list.add(obj);
    }
}
