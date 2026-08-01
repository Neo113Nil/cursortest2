package s;

import androidx.datastore.preferences.protobuf.b1;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends r0 implements Map {

    /* renamed from: r, reason: collision with root package name */
    public b1 f8286r;

    /* renamed from: s, reason: collision with root package name */
    public b f8287s;

    /* renamed from: t, reason: collision with root package name */
    public d f8288t;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        b1 b1Var = this.f8286r;
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(3, this);
        this.f8286r = b1Var2;
        return b1Var2;
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
        int i3 = this.f8369i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.f8369i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f8287s;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f8287s = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f8369i;
        int i3 = this.f8369i;
        int[] iArr = this.f8367d;
        if (iArr.length < size) {
            this.f8367d = Arrays.copyOf(iArr, size);
            this.f8368e = Arrays.copyOf(this.f8368e, size * 2);
        }
        if (this.f8369i != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f8288t;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f8288t = dVar2;
        return dVar2;
    }
}
