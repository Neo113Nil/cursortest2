package A2;

import L.n;
import L.o;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1427k;

/* loaded from: classes.dex */
public final class j extends AbstractC1427k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f840d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f841e;

    public j(e backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f841e = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f840d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f840d) {
            case 0:
                Intrinsics.checkNotNullParameter(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f840d) {
            case 0:
                ((e) this.f841e).clear();
                break;
            default:
                ((L.e) this.f841e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f840d) {
            case 0:
                return ((e) this.f841e).containsValue(obj);
            default:
                return ((L.e) this.f841e).containsValue(obj);
        }
    }

    @Override // z2.AbstractC1427k
    public final int e() {
        switch (this.f840d) {
            case 0:
                return ((e) this.f841e).f827o;
            default:
                return ((L.e) this.f841e).d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f840d) {
            case 0:
                return ((e) this.f841e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f840d) {
            case 0:
                e map = (e) this.f841e;
                map.getClass();
                Intrinsics.checkNotNullParameter(map, "map");
                return new f(map, 2);
            default:
                n[] nVarArr = new n[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    nVarArr[i2] = new o(2);
                }
                return new L.i((L.e) this.f841e, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f840d) {
            case 0:
                e eVar = (e) this.f841e;
                eVar.c();
                int i2 = eVar.i(obj);
                if (i2 < 0) {
                    return false;
                }
                eVar.n(i2);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f840d) {
            case 0:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((e) this.f841e).c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f840d) {
            case 0:
                Intrinsics.checkNotNullParameter(elements, "elements");
                ((e) this.f841e).c();
                break;
        }
        return super.retainAll(elements);
    }

    public j(L.e eVar) {
        this.f841e = eVar;
    }
}
