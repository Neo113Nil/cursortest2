package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class x6 extends w50 implements Map {
    public s6 i;
    public u6 j;
    public w6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(w50 w50Var) {
        super(0);
        int i = w50Var.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(w50Var.f(i2), w50Var.i(i2));
            }
        } else if (i > 0) {
            a7.X(0, 0, i, w50Var.f, this.f);
            a7.Z(w50Var.g, this.g, 0, 0, i << 1);
            this.h = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        s6 s6Var = this.i;
        if (s6Var != null) {
            return s6Var;
        }
        s6 s6Var2 = new s6(this);
        this.i = s6Var2;
        return s6Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        u6 u6Var = this.j;
        if (u6Var != null) {
            return u6Var;
        }
        u6 u6Var2 = new u6(this);
        this.j = u6Var2;
        return u6Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        w6 w6Var = this.k;
        if (w6Var != null) {
            return w6Var;
        }
        w6 w6Var2 = new w6(this);
        this.k = w6Var2;
        return w6Var2;
    }
}
