package L1;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1627a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.c f1628b;

    /* renamed from: c, reason: collision with root package name */
    public static final A2.c f1629c;

    static {
        D2.a aVar = new D2.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(D2.d.class, aVar);
        f1628b = new A2.c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)));
        D2.a aVar2 = new D2.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(D2.d.class, aVar2);
        f1629c = new A2.c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        O1.f fVar = (O1.f) obj;
        A2.e eVar = (A2.e) obj2;
        eVar.b(f1628b, fVar.f2028a);
        eVar.b(f1629c, fVar.f2029b);
    }
}
