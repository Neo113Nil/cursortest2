package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s9 extends qa1 implements Map {
    public n9 h;
    public p9 i;
    public r9 j;

    @Override // java.util.Map
    public final Set entrySet() {
        n9 n9Var = this.h;
        if (n9Var != null) {
            return n9Var;
        }
        n9 n9Var2 = new n9(this, 0);
        this.h = n9Var2;
        return n9Var2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        p9 p9Var = this.i;
        if (p9Var != null) {
            return p9Var;
        }
        p9 p9Var2 = new p9(this);
        this.i = p9Var2;
        return p9Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.g;
        int i = this.g;
        int[] iArr = this.d;
        if (iArr.length < size) {
            this.d = Arrays.copyOf(iArr, size);
            this.e = Arrays.copyOf(this.e, size * 2);
        }
        if (this.g != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        r9 r9Var = this.j;
        if (r9Var != null) {
            return r9Var;
        }
        r9 r9Var2 = new r9(this);
        this.j = r9Var2;
        return r9Var2;
    }
}
