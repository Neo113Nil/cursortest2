package i;

import androidx.datastore.preferences.protobuf.g1;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends g0 implements Map {

    /* renamed from: i, reason: collision with root package name */
    public g1 f4733i;

    /* renamed from: j, reason: collision with root package name */
    public b f4734j;

    /* renamed from: k, reason: collision with root package name */
    public d f4735k;

    @Override // java.util.Map
    public final Set entrySet() {
        g1 g1Var = this.f4733i;
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(this, 1);
        this.f4733i = g1Var2;
        return g1Var2;
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
        int i7 = this.f4744h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f4744h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f4734j;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f4734j = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f4744h;
        int i7 = this.f4744h;
        int[] iArr = this.f4742f;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f4742f = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f4743g, size * 2);
            r6.k.e(copyOf2, "copyOf(this, newSize)");
            this.f4743g = copyOf2;
        }
        if (this.f4744h != i7) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f4735k;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f4735k = dVar2;
        return dVar2;
    }
}
