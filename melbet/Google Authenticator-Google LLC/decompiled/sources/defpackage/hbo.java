package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hbo implements hhu {
    private transient Collection a;
    private transient Set b;
    public transient Collection c;
    private transient Map d;

    public abstract Collection e();

    @Override // defpackage.hhu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hhu) {
            return p().equals(((hhu) obj).p());
        }
        return false;
    }

    public abstract Iterator g();

    @Override // defpackage.hhu
    public final int hashCode() {
        return p().hashCode();
    }

    public abstract Map i();

    public abstract Set j();

    @Override // defpackage.hhu
    public boolean n(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.hhu
    public Collection o() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection e = e();
        this.a = e;
        return e;
    }

    @Override // defpackage.hhu
    public Map p() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map i = i();
        this.d = i;
        return i;
    }

    @Override // defpackage.hhu
    public Set q() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set j = j();
        this.b = j;
        return j;
    }

    @Override // defpackage.hhu
    public boolean r(Object obj, Object obj2) {
        Collection collection = (Collection) p().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.hhu
    public boolean s(Object obj, Object obj2) {
        Collection collection = (Collection) p().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return p().toString();
    }
}
