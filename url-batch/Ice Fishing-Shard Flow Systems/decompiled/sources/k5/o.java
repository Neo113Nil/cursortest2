package k5;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import v5.C0975a;
import z5.InterfaceC1060a;

/* loaded from: classes.dex */
public final class o implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public Map f6095a;

    /* renamed from: b, reason: collision with root package name */
    public C4.a f6096b;

    /* renamed from: c, reason: collision with root package name */
    public C4.a f6097c;

    /* renamed from: d, reason: collision with root package name */
    public g f6098d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f6096b.getClass();
        InterfaceC1060a interfaceC1060a = (InterfaceC1060a) obj;
        M5.a i2 = interfaceC1060a.i();
        Map map = (Map) this.f6095a.get(i2);
        if (map == null) {
            map = (Map) this.f6098d.f6079k.a();
            this.f6095a.put(i2, map);
        }
        this.f6097c.getClass();
        C0975a k7 = interfaceC1060a.k();
        List list = (List) map.get(k7);
        if (list == null) {
            list = (List) this.f6098d.f6080l.a();
            map.put(k7, list);
        }
        list.add(obj);
    }
}
