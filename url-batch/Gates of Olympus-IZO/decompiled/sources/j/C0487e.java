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
public final class C0487e extends C0480F implements Map {

    /* renamed from: g, reason: collision with root package name */
    public h0 f5158g;

    /* renamed from: h, reason: collision with root package name */
    public C0484b f5159h;

    /* renamed from: i, reason: collision with root package name */
    public C0486d f5160i;

    @Override // java.util.Map
    public final Set entrySet() {
        h0 h0Var = this.f5158g;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this, 1);
        this.f5158g = h0Var2;
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
        int i3 = this.f5140f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.f5140f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0484b c0484b = this.f5159h;
        if (c0484b != null) {
            return c0484b;
        }
        C0484b c0484b2 = new C0484b(this);
        this.f5159h = c0484b2;
        return c0484b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f5140f;
        int i3 = this.f5140f;
        int[] iArr = this.f5138d;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            Z1.i.e(copyOf, "copyOf(this, newSize)");
            this.f5138d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f5139e, size * 2);
            Z1.i.e(copyOf2, "copyOf(this, newSize)");
            this.f5139e = copyOf2;
        }
        if (this.f5140f != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0486d c0486d = this.f5160i;
        if (c0486d != null) {
            return c0486d;
        }
        C0486d c0486d2 = new C0486d(this);
        this.f5160i = c0486d2;
        return c0486d2;
    }
}
