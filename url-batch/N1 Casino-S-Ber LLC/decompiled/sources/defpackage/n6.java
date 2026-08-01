package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class n6 extends u20 implements Map {
    public i6 i;
    public k6 j;
    public m6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(u20 u20Var) {
        super(0);
        int i = u20Var.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(u20Var.f(i2), u20Var.i(i2));
            }
        } else if (i > 0) {
            q6.b0(0, 0, i, u20Var.f, this.f);
            q6.d0(u20Var.g, this.g, 0, 0, i << 1);
            this.h = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i6 i6Var = this.i;
        if (i6Var != null) {
            return i6Var;
        }
        i6 i6Var2 = new i6(this);
        this.i = i6Var2;
        return i6Var2;
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
        k6 k6Var = this.j;
        if (k6Var != null) {
            return k6Var;
        }
        k6 k6Var2 = new k6(this);
        this.j = k6Var2;
        return k6Var2;
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
        m6 m6Var = this.k;
        if (m6Var != null) {
            return m6Var;
        }
        m6 m6Var2 = new m6(this);
        this.k = m6Var2;
        return m6Var2;
    }
}
