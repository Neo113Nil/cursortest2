package D4;

import f5.C0387a;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class q implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public Map f557a;

    /* renamed from: b, reason: collision with root package name */
    public A4.b f558b;

    /* renamed from: c, reason: collision with root package name */
    public A4.b f559c;

    /* renamed from: d, reason: collision with root package name */
    public i f560d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f558b.getClass();
        S4.a aVar = (S4.a) obj;
        C0387a i7 = aVar.i();
        Map map = (Map) this.f557a.get(i7);
        if (map == null) {
            map = (Map) this.f560d.f541k.a();
            this.f557a.put(i7, map);
        }
        this.f559c.getClass();
        O4.a k4 = aVar.k();
        List list = (List) map.get(k4);
        if (list == null) {
            list = (List) this.f560d.f542l.a();
            map.put(k4, list);
        }
        list.add(obj);
    }
}
