package id;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends kotlin.collections.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4707d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4708e;

    public /* synthetic */ j(int i3, Object obj) {
        this.f4707d = i3;
        this.f4708e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4707d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f4707d) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // kotlin.collections.k
    public final int b() {
        switch (this.f4707d) {
            case 0:
                return ((h) this.f4708e).f4702w;
            default:
                return ((x0.g) this.f4708e).c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4707d) {
            case 0:
                ((h) this.f4708e).clear();
                break;
            default:
                ((x0.g) this.f4708e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4707d) {
            case 0:
                return ((h) this.f4708e).containsValue(obj);
            default:
                return ((x0.g) this.f4708e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4707d) {
            case 0:
                return ((h) this.f4708e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4707d) {
            case 0:
                h hVar = (h) this.f4708e;
                hVar.getClass();
                return new f(hVar, 2);
            default:
                x0.g gVar = (x0.g) this.f4708e;
                u0.j[] jVarArr = new u0.j[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    jVarArr[i3] = new u0.k(2);
                }
                return new u0.f(gVar, jVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4707d) {
            case 0:
                h hVar = (h) this.f4708e;
                hVar.c();
                int h10 = hVar.h(obj);
                if (h10 < 0) {
                    return false;
                }
                hVar.k(h10);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f4707d) {
            case 0:
                collection.getClass();
                ((h) this.f4708e).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f4707d) {
            case 0:
                collection.getClass();
                ((h) this.f4708e).c();
                break;
        }
        return super.retainAll(collection);
    }
}
