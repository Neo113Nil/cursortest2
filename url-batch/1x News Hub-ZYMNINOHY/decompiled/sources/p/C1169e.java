package p;

import androidx.datastore.preferences.protobuf.b0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1169e extends C1174j implements Map {

    /* renamed from: d, reason: collision with root package name */
    public b0 f10188d;

    /* renamed from: e, reason: collision with root package name */
    public C1166b f10189e;
    public C1168d f;

    @Override // java.util.Map
    public final Set entrySet() {
        b0 b0Var = this.f10188d;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(1, this);
        this.f10188d = b0Var2;
        return b0Var2;
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
        int i3 = this.f10206c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.f10206c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1166b c1166b = this.f10189e;
        if (c1166b != null) {
            return c1166b;
        }
        C1166b c1166b2 = new C1166b(this);
        this.f10189e = c1166b2;
        return c1166b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f10206c;
        int i3 = this.f10206c;
        int[] iArr = this.f10204a;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f10204a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f10205b, size * 2);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f10205b = copyOf2;
        }
        if (this.f10206c != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1168d c1168d = this.f;
        if (c1168d != null) {
            return c1168d;
        }
        C1168d c1168d2 = new C1168d(this);
        this.f = c1168d2;
        return c1168d2;
    }
}
