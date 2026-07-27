package L;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1430n;

/* loaded from: classes.dex */
public final class g extends AbstractC1430n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3475d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3476e;

    public /* synthetic */ g(int i2, e eVar) {
        this.f3475d = i2;
        this.f3476e = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3475d) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        switch (this.f3475d) {
            case 2:
                Intrinsics.checkNotNullParameter(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3475d) {
            case 0:
                ((e) this.f3476e).clear();
                break;
            case 1:
                ((e) this.f3476e).clear();
                break;
            default:
                ((A2.e) this.f3476e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f3475d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                e eVar = (e) this.f3476e;
                Object obj2 = eVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && eVar.containsKey(entry.getKey());
            case 1:
                return ((e) this.f3476e).containsKey(obj);
            default:
                return ((A2.e) this.f3476e).containsKey(obj);
        }
    }

    @Override // z2.AbstractC1430n
    public final int e() {
        switch (this.f3475d) {
            case 0:
                return ((e) this.f3476e).d();
            case 1:
                return ((e) this.f3476e).d();
            default:
                return ((A2.e) this.f3476e).f827o;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.f3475d) {
            case 2:
                return ((A2.e) this.f3476e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3475d) {
            case 0:
                return new h((e) this.f3476e);
            case 1:
                n[] nVarArr = new n[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    nVarArr[i2] = new o(1);
                }
                return new i((e) this.f3476e, nVarArr);
            default:
                A2.e map = (A2.e) this.f3476e;
                map.getClass();
                Intrinsics.checkNotNullParameter(map, "map");
                return new A2.f(map, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f3475d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return ((e) this.f3476e).remove(entry.getKey(), entry.getValue());
            case 1:
                e eVar = (e) this.f3476e;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
            default:
                A2.e eVar2 = (A2.e) this.f3476e;
                eVar2.c();
                int h4 = eVar2.h(obj);
                if (h4 < 0) {
                    return false;
                }
                eVar2.n(h4);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        switch (this.f3475d) {
            case 2:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((A2.e) this.f3476e).c();
                return super.removeAll(elements);
            default:
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        switch (this.f3475d) {
            case 2:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((A2.e) this.f3476e).c();
                break;
        }
        return super.retainAll(elements);
    }

    public g(A2.e backing) {
        this.f3475d = 2;
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f3476e = backing;
    }
}
