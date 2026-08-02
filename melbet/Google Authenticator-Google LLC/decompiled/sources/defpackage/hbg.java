package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hbg extends hbo implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    public hbg(Map map) {
        hoq.x(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    public abstract Collection b(Object obj, Collection collection);

    @Override // defpackage.hhu
    public final int d() {
        return this.b;
    }

    @Override // defpackage.hbo
    public final Collection e() {
        return this instanceof hbr ? new hbm(this) : new hhz(this);
    }

    public final Collection f(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = a();
        }
        return b(obj, collection);
    }

    @Override // defpackage.hbo
    public final Iterator g() {
        return new hap(this);
    }

    final List h(Object obj, List list, hbc hbcVar) {
        return list instanceof RandomAccess ? new hay(this, obj, list, hbcVar) : new hbe(this, obj, list, hbcVar);
    }

    @Override // defpackage.hbo
    public Map i() {
        return new has(this, this.a);
    }

    @Override // defpackage.hbo
    public Set j() {
        return new hav(this, this.a);
    }

    @Override // defpackage.hhu
    public final void k() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    final void l(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            hoq.x(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.hhu
    public final boolean m(Object obj) {
        throw null;
    }

    @Override // defpackage.hbo, defpackage.hhu
    public final boolean n(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.b++;
            return true;
        }
        Collection a = a();
        if (!a.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.b++;
        this.a.put(obj, a);
        return true;
    }
}
