package N1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends M1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2888d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2889e;

    public h(g gVar, int i3) {
        this.f2888d = i3;
        switch (i3) {
            case 1:
                Z1.i.f(gVar, "backing");
                this.f2889e = gVar;
                break;
            default:
                Z1.i.f(gVar, "backing");
                this.f2889e = gVar;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2888d) {
            case 0:
                Z1.i.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f2888d) {
            case 0:
                Z1.i.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                Z1.i.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // M1.g
    public final int b() {
        switch (this.f2888d) {
        }
        return this.f2889e.f2884l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2888d) {
            case 0:
                this.f2889e.clear();
                break;
            default:
                this.f2889e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2888d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Z1.i.f(entry, "element");
                return this.f2889e.f(entry);
            default:
                return this.f2889e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f2888d) {
            case 0:
                Z1.i.f(collection, "elements");
                return this.f2889e.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f2888d) {
        }
        return this.f2889e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2888d) {
            case 0:
                g gVar = this.f2889e;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f2889e;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2888d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Z1.i.f(entry, "element");
                    g gVar = this.f2889e;
                    gVar.getClass();
                    gVar.c();
                    int h3 = gVar.h(entry.getKey());
                    if (h3 >= 0) {
                        Object[] objArr = gVar.f2877e;
                        Z1.i.c(objArr);
                        if (Z1.i.a(objArr[h3], entry.getValue())) {
                            gVar.l(h3);
                            break;
                        }
                    }
                }
                break;
            default:
                g gVar2 = this.f2889e;
                gVar2.c();
                int h4 = gVar2.h(obj);
                if (h4 >= 0) {
                    gVar2.l(h4);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f2888d) {
            case 0:
                Z1.i.f(collection, "elements");
                this.f2889e.c();
                break;
            default:
                Z1.i.f(collection, "elements");
                this.f2889e.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f2888d) {
            case 0:
                Z1.i.f(collection, "elements");
                this.f2889e.c();
                break;
            default:
                Z1.i.f(collection, "elements");
                this.f2889e.c();
                break;
        }
        return super.retainAll(collection);
    }
}
