package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hi extends fl2 implements Map {
    public ci p;
    public ei q;
    public gi r;

    public hi() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ci ciVar = this.p;
        if (ciVar != null) {
            return ciVar;
        }
        ci ciVar2 = new ci(this, 0);
        this.p = ciVar2;
        return ciVar2;
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
        int i = this.o;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.o;
    }

    public final boolean k(Collection collection) {
        int i = this.o;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(e(i2))) {
                f(i2);
            }
        }
        return i != this.o;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ei eiVar = this.q;
        if (eiVar != null) {
            return eiVar;
        }
        ei eiVar2 = new ei(this);
        this.q = eiVar2;
        return eiVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.o;
        int i = this.o;
        int[] iArr = this.m;
        if (iArr.length < size) {
            this.m = Arrays.copyOf(iArr, size);
            this.n = Arrays.copyOf(this.n, size * 2);
        }
        if (this.o != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        gi giVar = this.r;
        if (giVar != null) {
            return giVar;
        }
        gi giVar2 = new gi(this);
        this.r = giVar2;
        return giVar2;
    }
}
