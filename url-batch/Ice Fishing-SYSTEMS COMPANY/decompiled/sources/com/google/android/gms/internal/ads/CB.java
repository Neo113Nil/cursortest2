package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CB extends AbstractCollection {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24147n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24148u;

    public /* synthetic */ CB(int i, Serializable serializable) {
        this.f24147n = i;
        this.f24148u = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f24147n) {
            case 0:
                ((C3513lC) this.f24148u).f();
                break;
            case 1:
                ((JB) this.f24148u).clear();
                break;
            default:
                ((C3889sB) this.f24148u).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f24147n) {
            case 0:
                return ((C3513lC) this.f24148u).d(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C3889sB) this.f24148u).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f24147n) {
            case 2:
                return ((C3889sB) this.f24148u).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f24147n) {
            case 0:
                C3513lC c3513lC = (C3513lC) this.f24148u;
                c3513lC.getClass();
                return new C3728pB(c3513lC);
            case 1:
                JB jb = (JB) this.f24148u;
                Map f6 = jb.f();
                return f6 != null ? f6.values().iterator() : new GB(jb, 2);
            default:
                return new C3459kC(((C3889sB) this.f24148u).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f24147n) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C3889sB c3889sB = (C3889sB) this.f24148u;
                    for (Map.Entry entry : c3889sB.entrySet()) {
                        if (Objects.equals(obj, entry.getValue())) {
                            c3889sB.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f24147n) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3889sB c3889sB = (C3889sB) this.f24148u;
                    for (Map.Entry entry : c3889sB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3889sB.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f24147n) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C3889sB c3889sB = (C3889sB) this.f24148u;
                    for (Map.Entry entry : c3889sB.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c3889sB.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f24147n) {
            case 0:
                return ((C3513lC) this.f24148u).f32552x;
            case 1:
                return ((JB) this.f24148u).size();
            default:
                return ((C3889sB) this.f24148u).f34209v.size();
        }
    }

    public CB(C3889sB c3889sB) {
        this.f24147n = 2;
        this.f24148u = c3889sB;
    }
}
