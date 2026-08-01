package l8;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements t8.c, t8.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5923a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f5924b;

    /* renamed from: c, reason: collision with root package name */
    public final m8.k f5925c;

    public l() {
        m8.k kVar = m8.k.f6608d;
        this.f5923a = new HashMap();
        this.f5924b = new ArrayDeque();
        this.f5925c = kVar;
    }

    public final synchronized void a(Executor executor, t8.a aVar) {
        try {
            executor.getClass();
            if (!this.f5923a.containsKey(g8.b.class)) {
                this.f5923a.put(g8.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f5923a.get(g8.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
