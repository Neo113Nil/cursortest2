package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hks {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected hks() {
    }

    protected abstract Object a();

    public final Object b(hkr hkrVar, hma hmaVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(hkrVar);
        if (obj != null) {
            return obj;
        }
        Object a = a();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(hkrVar, a);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int i = ((hkm) hmaVar).b;
        evb evbVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (hkl.f.equals(hmaVar.c(i2))) {
                Object e = hmaVar.e(i2);
                if (e instanceof hkw) {
                    if (evbVar == null) {
                        evbVar = new evb(this, hkrVar, 16);
                    }
                    ((hkw) e).a();
                }
            }
        }
        return a;
    }
}
