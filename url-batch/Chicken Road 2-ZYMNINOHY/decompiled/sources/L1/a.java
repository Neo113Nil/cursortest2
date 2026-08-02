package L1;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1613a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.c f1614b;

    /* renamed from: c, reason: collision with root package name */
    public static final A2.c f1615c;

    /* renamed from: d, reason: collision with root package name */
    public static final A2.c f1616d;

    /* renamed from: e, reason: collision with root package name */
    public static final A2.c f1617e;

    static {
        D2.a aVar = new D2.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(D2.d.class, aVar);
        f1614b = new A2.c("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        D2.a aVar2 = new D2.a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(D2.d.class, aVar2);
        f1615c = new A2.c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        D2.a aVar3 = new D2.a(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(D2.d.class, aVar3);
        f1616d = new A2.c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        D2.a aVar4 = new D2.a(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(D2.d.class, aVar4);
        f1617e = new A2.c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        O1.a aVar = (O1.a) obj;
        A2.e eVar = (A2.e) obj2;
        eVar.a(f1614b, aVar.f2009a);
        eVar.a(f1615c, aVar.f2010b);
        eVar.a(f1616d, aVar.f2011c);
        eVar.a(f1617e, aVar.f2012d);
    }
}
