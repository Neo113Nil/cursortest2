package f6;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import l0.l;
import l0.m;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, s6.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3433f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3434g;

    public /* synthetic */ i(int i7, Object obj) {
        this.f3433f = i7;
        this.f3434g = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((g) this.f3434g).clear();
                break;
            default:
                ((o0.c) this.f3434g).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g) this.f3434g).containsValue(obj);
            default:
                return ((o0.c) this.f3434g).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g) this.f3434g).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) this.f3434g;
                gVar.getClass();
                return new d(gVar, 2);
            default:
                o0.c cVar = (o0.c) this.f3434g;
                l[] lVarArr = new l[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    lVarArr[i7] = new m(2);
                }
                return new l0.g(cVar, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) this.f3434g;
                gVar.c();
                int i7 = gVar.i(obj);
                if (i7 < 0) {
                    return false;
                }
                gVar.l(i7);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f(collection, "elements");
                ((g) this.f3434g).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k.f(collection, "elements");
                ((g) this.f3434g).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f3433f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g) this.f3434g).f3426n;
            default:
                o0.c cVar = (o0.c) this.f3434g;
                cVar.getClass();
                return cVar.f6820j;
        }
    }
}
