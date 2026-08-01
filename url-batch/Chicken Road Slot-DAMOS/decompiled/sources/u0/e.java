package u0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9586d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9587e;

    public /* synthetic */ e(int i3, Object obj) {
        this.f9586d = i3;
        this.f9587e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9586d) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.f9586d) {
            case 2:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // kotlin.collections.n
    public final int b() {
        switch (this.f9586d) {
            case 0:
                return ((x0.g) this.f9587e).c();
            case 1:
                return ((x0.g) this.f9587e).c();
            default:
                return ((id.h) this.f9587e).f4702w;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9586d) {
            case 0:
                ((x0.g) this.f9587e).clear();
                break;
            case 1:
                ((x0.g) this.f9587e).clear();
                break;
            default:
                ((id.h) this.f9587e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9586d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                x0.g gVar = (x0.g) this.f9587e;
                Object obj2 = gVar.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && gVar.containsKey(entry.getKey());
            case 1:
                return ((x0.g) this.f9587e).containsKey(obj);
            default:
                return ((id.h) this.f9587e).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.f9586d) {
            case 2:
                return ((id.h) this.f9587e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9586d) {
            case 0:
                return new kotlin.collections.h((x0.g) this.f9587e);
            case 1:
                x0.g gVar = (x0.g) this.f9587e;
                j[] jVarArr = new j[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    jVarArr[i3] = new k(1);
                }
                return new f(gVar, jVarArr);
            default:
                id.h hVar = (id.h) this.f9587e;
                hVar.getClass();
                return new id.f(hVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9586d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((x0.g) this.f9587e).remove(entry.getKey(), entry.getValue());
            case 1:
                x0.g gVar = (x0.g) this.f9587e;
                if (!gVar.containsKey(obj)) {
                    return false;
                }
                gVar.remove(obj);
                return true;
            default:
                id.h hVar = (id.h) this.f9587e;
                hVar.c();
                int g = hVar.g(obj);
                if (g < 0) {
                    return false;
                }
                hVar.k(g);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f9586d) {
            case 2:
                collection.getClass();
                ((id.h) this.f9587e).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f9586d) {
            case 2:
                collection.getClass();
                ((id.h) this.f9587e).c();
                break;
        }
        return super.retainAll(collection);
    }
}
