package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class e7 extends h30 implements Map {
    public z6 i;
    public b7 j;
    public d7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(h30 h30Var) {
        super(0);
        int i = h30Var.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(h30Var.f(i2), h30Var.i(i2));
            }
        } else if (i > 0) {
            h7.e0(0, 0, i, h30Var.f, this.f);
            h7.g0(h30Var.g, this.g, 0, 0, i << 1);
            this.h = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        z6 z6Var = this.i;
        if (z6Var != null) {
            return z6Var;
        }
        z6 z6Var2 = new z6(this);
        this.i = z6Var2;
        return z6Var2;
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
        b7 b7Var = this.j;
        if (b7Var != null) {
            return b7Var;
        }
        b7 b7Var2 = new b7(this);
        this.j = b7Var2;
        return b7Var2;
    }

    public final boolean l(Collection collection) {
        int i = this.h;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        return i != this.h;
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
        d7 d7Var = this.k;
        if (d7Var != null) {
            return d7Var;
        }
        d7 d7Var2 = new d7(this);
        this.k = d7Var2;
        return d7Var2;
    }
}
