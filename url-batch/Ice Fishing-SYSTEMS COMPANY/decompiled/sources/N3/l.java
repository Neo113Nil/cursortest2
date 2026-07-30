package N3;

import com.anythink.core.common.n.b.A;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l implements V3.b, V3.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2180a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f2181b;

    /* renamed from: c, reason: collision with root package name */
    public final O3.k f2182c;

    public l() {
        O3.k kVar = O3.k.f2522n;
        this.f2180a = new HashMap();
        this.f2181b = new ArrayDeque();
        this.f2182c = kVar;
    }

    public final void a(A a9) {
        O3.k kVar = this.f2182c;
        synchronized (this) {
            try {
                kVar.getClass();
                if (!this.f2180a.containsKey(K3.b.class)) {
                    this.f2180a.put(K3.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2180a.get(K3.b.class)).put(a9, kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
