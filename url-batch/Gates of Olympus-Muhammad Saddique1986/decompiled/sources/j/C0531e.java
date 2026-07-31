package j;

import androidx.datastore.preferences.protobuf.h0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: j.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531e extends C0524F implements Map {

    /* renamed from: g, reason: collision with root package name */
    public h0 f6276g;

    /* renamed from: h, reason: collision with root package name */
    public C0528b f6277h;

    /* renamed from: i, reason: collision with root package name */
    public C0530d f6278i;

    @Override // java.util.Map
    public final Set entrySet() {
        h0 h0Var = this.f6276g;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this, 1);
        this.f6276g = h0Var2;
        return h0Var2;
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
        int i3 = this.f6258f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.f6258f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0528b c0528b = this.f6277h;
        if (c0528b != null) {
            return c0528b;
        }
        C0528b c0528b2 = new C0528b(this);
        this.f6277h = c0528b2;
        return c0528b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f6258f;
        int i3 = this.f6258f;
        int[] iArr = this.f6256d;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f6256d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f6257e, size * 2);
            f2.j.e(copyOf2, "copyOf(this, newSize)");
            this.f6257e = copyOf2;
        }
        if (this.f6258f != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0530d c0530d = this.f6278i;
        if (c0530d != null) {
            return c0530d;
        }
        C0530d c0530d2 = new C0530d(this);
        this.f6278i = c0530d2;
        return c0530d2;
    }
}
