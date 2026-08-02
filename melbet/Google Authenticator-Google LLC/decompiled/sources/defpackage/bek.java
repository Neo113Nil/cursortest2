package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bek {
    private final beg a = new beg();
    private final bej b = new bej();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final int e;
    private int f;

    public bek(int i) {
        this.e = i;
    }

    private final beb f(Class cls) {
        beh behVar;
        Map map = this.d;
        beb bebVar = (beb) map.get(cls);
        if (bebVar != null) {
            return bebVar;
        }
        if (cls.equals(int[].class)) {
            behVar = new beh(0);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            behVar = new beh(1);
        }
        map.put(cls, behVar);
        return behVar;
    }

    private final Object g(bei beiVar, Class cls) {
        beg begVar = this.a;
        beb f = f(cls);
        Object a = begVar.a(beiVar);
        if (a != null) {
            this.f -= f.a(a) * f.b();
            i(f.a(a), cls);
        }
        return a == null ? f.c(beiVar.a) : a;
    }

    private final NavigableMap h(Class cls) {
        Map map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap h = h(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) h.get(valueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                h.remove(valueOf);
                return;
            } else {
                h.put(valueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object b = this.a.b();
            a.v(b, "Argument must not be null");
            beb f = f(b.getClass());
            this.f -= f.a(b) * f.b();
            i(f.a(b), b.getClass());
        }
    }

    public final synchronized Object a(int i, Class cls) {
        bei d;
        Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2 && num.intValue() > i * 8) {
            }
            d = this.b.d(num.intValue(), cls);
        }
        d = this.b.d(i, cls);
        return g(d, cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        beb f = f(cls);
        int a = f.a(obj);
        int b = f.b() * a;
        int i = this.e;
        if (b <= (i >> 1)) {
            bei d = this.b.d(a, cls);
            this.a.c(d, obj);
            NavigableMap h = h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(d.a));
            Integer valueOf = Integer.valueOf(d.a);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i2));
            this.f += b;
            j(i);
        }
    }

    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            j(this.e >> 1);
        }
    }

    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }
}
