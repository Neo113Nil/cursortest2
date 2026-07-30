package S1;

import b2.C0270a;
import b2.InterfaceC0271b;
import b2.InterfaceC0272c;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements InterfaceC0272c, InterfaceC0271b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2491a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f2492b;

    /* renamed from: c, reason: collision with root package name */
    public final T1.k f2493c;

    public l() {
        T1.k kVar = T1.k.f2597d;
        this.f2491a = new HashMap();
        this.f2492b = new ArrayDeque();
        this.f2493c = kVar;
    }

    @Override // b2.InterfaceC0271b
    public final void a(C0270a c0270a) {
        Set<Map.Entry> entrySet;
        c0270a.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f2492b;
                if (arrayDeque != null) {
                    arrayDeque.add(c0270a);
                    return;
                }
                synchronized (this) {
                    try {
                        Map map = (Map) this.f2491a.get(P1.b.class);
                        entrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                    } finally {
                    }
                }
                for (Map.Entry entry : entrySet) {
                    ((Executor) entry.getValue()).execute(new A.k(entry, c0270a));
                }
            } finally {
            }
        }
    }

    public final void b(com.google.firebase.messaging.r rVar) {
        T1.k kVar = this.f2493c;
        synchronized (this) {
            try {
                kVar.getClass();
                if (!this.f2491a.containsKey(P1.b.class)) {
                    this.f2491a.put(P1.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2491a.get(P1.b.class)).put(rVar, kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
