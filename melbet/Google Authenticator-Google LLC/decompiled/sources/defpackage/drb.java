package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drb implements dqy {
    public boolean b;
    public dra c;
    private final dov g;
    private hel h;
    private dpa i;
    private final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    private final Object e = new Object();
    private final Map f = new HashMap();
    public boolean a = true;

    public drb(dov dovVar) {
        int i = hel.d;
        this.h = his.a;
        this.g = dovVar;
    }

    private static Object j(dpa dpaVar) {
        if (dpaVar != null) {
            return dpaVar.a;
        }
        return null;
    }

    private final void k() {
        if (this.b) {
            return;
        }
        this.b = true;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((dja) it.next()).i();
        }
    }

    private final void l(int i) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            dja djaVar = (dja) it.next();
            Object j = j(this.i);
            djaVar.j(j);
            djaVar.k(j, i);
        }
    }

    @Override // defpackage.dqy
    public final Object a() {
        return j(this.i);
    }

    @Override // defpackage.dqy
    public final void b(Object obj) {
        i(obj, 4);
    }

    @Override // defpackage.dqy
    public final void c(Object obj) {
        throw null;
    }

    @Override // defpackage.dqy
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.dqy
    public final void e(dja djaVar) {
        this.d.add(djaVar);
    }

    @Override // defpackage.dqy
    public final void f(dja djaVar) {
        this.d.remove(djaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final hel g() {
        hel g;
        heg hegVar = new heg(4);
        synchronized (this.e) {
            hjs listIterator = this.h.listIterator(0);
            while (listIterator.hasNext()) {
                hegVar.h(((dpa) listIterator.next()).a);
            }
            g = hegVar.g();
        }
        return g;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(hel helVar) {
        boolean H;
        int i;
        dpa dpaVar;
        int i2 = 1;
        String.format(Locale.US, "setAvailableAccounts() %d -> %d.", Integer.valueOf(((his) g()).c), Integer.valueOf(helVar.size()));
        int i3 = 4;
        heg hegVar = new heg(4);
        Iterator it = helVar.iterator();
        while (it.hasNext()) {
            hegVar.h(dpa.a(it.next(), this.g));
        }
        hel g = hegVar.g();
        synchronized (this.e) {
            H = hnu.H(this.h, g);
        }
        if (H) {
            k();
            return;
        }
        HashMap hashMap = new HashMap();
        int i4 = ((his) g).c;
        for (int i5 = 0; i5 < i4; i5++) {
            dpa dpaVar2 = (dpa) g.get(i5);
            hashMap.put(this.g.c(dpaVar2.a), dpaVar2);
        }
        dpa dpaVar3 = this.i;
        if (dpaVar3 != null) {
            dpa dpaVar4 = (dpa) hashMap.get(this.g.c(dpaVar3.a));
            this.i = dpaVar4;
            if (dpaVar4 == null) {
                i = 4;
            } else if (!dpaVar4.equals(dpaVar3)) {
                i = 5;
            }
            synchronized (this.e) {
                g();
                r8 = null;
                r8 = null;
                Object obj = null;
                if (this.a) {
                    Map map = this.f;
                    dqz dqzVar = dqz.a;
                    dpaVar = (dqzVar.b || ((Boolean) dqzVar.c.a(new drv(i2)).d(false)).booleanValue()) ? null : (dpa) obj;
                    if (hashMap.size() == map.size() + 1) {
                        HashMap hashMap2 = new HashMap(hashMap);
                        hashMap2.keySet().removeAll(map.keySet());
                        if (hashMap2.size() == 1) {
                            obj = hnu.X(hashMap2.values());
                        }
                    }
                }
                this.h = g;
                Map map2 = this.f;
                map2.clear();
                map2.putAll(hashMap);
            }
            if (!this.a || dpaVar == null) {
                i3 = i;
            } else {
                this.i = dpaVar;
                dra draVar = this.c;
                if (draVar != null) {
                    draVar.a(helVar, dpaVar.a);
                }
                dqz dqzVar2 = dqz.a;
                dqzVar2.c = gyf.a;
                dqzVar2.b = false;
            }
            k();
            CopyOnWriteArraySet copyOnWriteArraySet = this.d;
            if (copyOnWriteArraySet.isEmpty()) {
                return;
            }
            Iterator it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                dja djaVar = (dja) it2.next();
                djaVar.h(g());
                if (i3 != 0) {
                    djaVar.j(a());
                    djaVar.k(a(), i3);
                }
            }
            return;
        }
        i = 0;
        synchronized (this.e) {
        }
    }

    public final void i(Object obj, int i) {
        dpa dpaVar;
        dpa dpaVar2 = this.i;
        if (obj == null) {
            if (dpaVar2 != null) {
                this.i = null;
                l(i);
                return;
            }
            return;
        }
        dov dovVar = this.g;
        Object obj2 = this.e;
        String c = dovVar.c(obj);
        synchronized (obj2) {
            dpaVar = (dpa) this.f.get(c);
        }
        hoq.y(dpaVar != null, "Selected account must be an available account");
        this.i = dpaVar;
        if (dpaVar.equals(dpaVar2)) {
            return;
        }
        l(i);
    }
}
