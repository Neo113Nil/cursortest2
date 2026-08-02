package L1;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1618a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final A2.c f1619b;

    static {
        D2.a aVar = new D2.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(D2.d.class, aVar);
        f1619b = new A2.c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // A2.a
    public final void a(Object obj, Object obj2) {
        ((A2.e) obj2).a(f1619b, ((O1.b) obj).f2013a);
    }
}
