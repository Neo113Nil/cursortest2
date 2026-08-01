package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class g7 extends zd0 implements Map {
    public b7 i;
    public d7 j;
    public f7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(zd0 zd0Var) {
        super(0);
        int i = zd0Var.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(zd0Var.f(i2), zd0Var.i(i2));
            }
        } else if (i > 0) {
            j7.W(0, 0, i, zd0Var.f, this.f);
            j7.Y(zd0Var.g, this.g, 0, 0, i << 1);
            this.h = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        b7 b7Var = this.i;
        if (b7Var != null) {
            return b7Var;
        }
        b7 b7Var2 = new b7(this);
        this.i = b7Var2;
        return b7Var2;
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
        d7 d7Var = this.j;
        if (d7Var != null) {
            return d7Var;
        }
        d7 d7Var2 = new d7(this);
        this.j = d7Var2;
        return d7Var2;
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
        f7 f7Var = this.k;
        if (f7Var != null) {
            return f7Var;
        }
        f7 f7Var2 = new f7(this);
        this.k = f7Var2;
        return f7Var2;
    }
}
