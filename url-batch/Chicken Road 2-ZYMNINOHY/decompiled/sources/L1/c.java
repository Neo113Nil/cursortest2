package L1;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1620a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.c f1621b;

    /* renamed from: c, reason: collision with root package name */
    public static final A2.c f1622c;

    static {
        D2.a aVar = new D2.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(D2.d.class, aVar);
        f1621b = new A2.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)));
        D2.a aVar2 = new D2.a(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(D2.d.class, aVar2);
        f1622c = new A2.c("reason", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        O1.d dVar = (O1.d) obj;
        A2.e eVar = (A2.e) obj2;
        eVar.b(f1621b, dVar.f2023a);
        eVar.a(f1622c, dVar.f2024b);
    }
}
