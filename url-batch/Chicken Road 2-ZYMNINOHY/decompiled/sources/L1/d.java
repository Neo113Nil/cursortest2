package L1;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1623a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.c f1624b;

    /* renamed from: c, reason: collision with root package name */
    public static final A2.c f1625c;

    static {
        D2.a aVar = new D2.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(D2.d.class, aVar);
        f1624b = new A2.c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        D2.a aVar2 = new D2.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(D2.d.class, aVar2);
        f1625c = new A2.c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        O1.e eVar = (O1.e) obj;
        A2.e eVar2 = (A2.e) obj2;
        eVar2.a(f1624b, eVar.f2026a);
        eVar2.a(f1625c, eVar.f2027b);
    }
}
