package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bme {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public bme(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Object f(Object obj) {
        bsh bshVar = (bsh) this.a.get(obj);
        if (bshVar == null) {
            return null;
        }
        return bshVar.b;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        int a = a(obj2);
        long j = a;
        long j2 = this.b;
        if (j >= j2) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        bsh bshVar = (bsh) this.a.put(obj, obj2 == null ? null : new bsh(obj2, a));
        if (bshVar != null) {
            this.c -= bshVar.a;
            Object obj3 = bshVar.b;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        i(j2);
        if (bshVar != null) {
            return bshVar.b;
        }
        return null;
    }

    public final synchronized Object h(Object obj) {
        bsh bshVar = (bsh) this.a.remove(obj);
        if (bshVar == null) {
            return null;
        }
        this.c -= bshVar.a;
        return bshVar.b;
    }

    public final synchronized void i(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            bsh bshVar = (bsh) entry.getValue();
            this.c -= bshVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, bshVar.b);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
