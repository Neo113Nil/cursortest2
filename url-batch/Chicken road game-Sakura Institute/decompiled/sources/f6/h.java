package f6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends e6.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3431f;

    /* renamed from: g, reason: collision with root package name */
    public final g f3432g;

    public /* synthetic */ h(g gVar, int i7) {
        this.f3431f = i7;
        this.f3432g = gVar;
    }

    @Override // e6.g
    public final int a() {
        switch (this.f3431f) {
        }
        return this.f3432g.f3426n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                k.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f3432g.clear();
                break;
            default:
                this.f3432g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f3432g.f((Map.Entry) obj);
            default:
                return this.f3432g.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f(collection, "elements");
                return this.f3432g.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f3431f) {
        }
        return this.f3432g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = this.f3432g;
                gVar.getClass();
                return new d(gVar, 0);
            default:
                g gVar2 = this.f3432g;
                gVar2.getClass();
                return new d(gVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    g gVar = this.f3432g;
                    gVar.getClass();
                    gVar.c();
                    int h3 = gVar.h(entry.getKey());
                    if (h3 >= 0) {
                        Object[] objArr = gVar.f3419g;
                        k.c(objArr);
                        if (k.a(objArr[h3], entry.getValue())) {
                            gVar.l(h3);
                            break;
                        }
                    }
                }
                break;
            default:
                g gVar2 = this.f3432g;
                gVar2.c();
                int h8 = gVar2.h(obj);
                if (h8 >= 0) {
                    gVar2.l(h8);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f(collection, "elements");
                this.f3432g.c();
                break;
            default:
                k.f(collection, "elements");
                this.f3432g.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f3431f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f(collection, "elements");
                this.f3432g.c();
                break;
            default:
                k.f(collection, "elements");
                this.f3432g.c();
                break;
        }
        return super.retainAll(collection);
    }
}
