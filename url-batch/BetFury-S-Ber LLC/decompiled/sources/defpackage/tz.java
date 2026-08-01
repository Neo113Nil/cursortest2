package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class tz extends p {
    public final /* synthetic */ int f;
    public final sz g;

    public /* synthetic */ tz(sz szVar, int i) {
        this.f = i;
        this.g = szVar;
    }

    @Override // defpackage.p
    public final int a() {
        switch (this.f) {
        }
        return this.g.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f) {
            case 0:
                this.g.clear();
                break;
            default:
                this.g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f;
        sz szVar = this.g;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                szVar.getClass();
                int g = szVar.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = szVar.g;
                objArr.getClass();
                return mv.c(objArr[g], entry.getValue());
            default:
                return szVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f) {
            case 0:
                collection.getClass();
                return this.g.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f) {
        }
        return this.g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f;
        sz szVar = this.g;
        switch (i) {
            case 0:
                szVar.getClass();
                return new pz(szVar, 0);
            default:
                szVar.getClass();
                return new pz(szVar, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f;
        sz szVar = this.g;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    szVar.getClass();
                    szVar.c();
                    int g = szVar.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = szVar.g;
                        objArr.getClass();
                        if (mv.c(objArr[g], entry.getValue())) {
                            szVar.k(g);
                            break;
                        }
                    }
                }
                break;
            default:
                szVar.c();
                int g2 = szVar.g(obj);
                if (g2 >= 0) {
                    szVar.k(g2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f;
        sz szVar = this.g;
        collection.getClass();
        switch (i) {
            case 0:
                szVar.c();
                break;
            default:
                szVar.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f;
        sz szVar = this.g;
        collection.getClass();
        switch (i) {
            case 0:
                szVar.c();
                break;
            default:
                szVar.c();
                break;
        }
        return super.retainAll(collection);
    }
}
