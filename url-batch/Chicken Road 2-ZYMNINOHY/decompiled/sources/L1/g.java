package L1;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1630a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.c f1631b;

    /* renamed from: c, reason: collision with root package name */
    public static final A2.c f1632c;

    static {
        D2.a aVar = new D2.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(D2.d.class, aVar);
        f1631b = new A2.c("startMs", Collections.unmodifiableMap(new HashMap(hashMap)));
        D2.a aVar2 = new D2.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(D2.d.class, aVar2);
        f1632c = new A2.c("endMs", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        O1.g gVar = (O1.g) obj;
        A2.e eVar = (A2.e) obj2;
        eVar.b(f1631b, gVar.f2030a);
        eVar.b(f1632c, gVar.f2031b);
    }
}
