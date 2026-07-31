package m5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l5.AbstractC0502f;

/* renamed from: m5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530g extends AbstractC0502f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5482f;

    /* renamed from: g, reason: collision with root package name */
    public final C0529f f5483g;

    public /* synthetic */ C0530g(C0529f c0529f, int i7) {
        this.f5482f = i7;
        this.f5483g = c0529f;
    }

    @Override // l5.AbstractC0502f
    public final int a() {
        switch (this.f5482f) {
        }
        return this.f5483g.f5477n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f5482f) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f5482f) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f5482f) {
            case 0:
                this.f5483g.clear();
                break;
            default:
                this.f5483g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f5482f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(element, "element");
                return this.f5483g.f(element);
            default:
                return this.f5483g.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f5482f) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                return this.f5483g.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f5482f) {
        }
        return this.f5483g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f5482f) {
            case 0:
                C0529f c0529f = this.f5483g;
                c0529f.getClass();
                return new C0527d(c0529f, 0);
            default:
                C0529f c0529f2 = this.f5483g;
                c0529f2.getClass();
                return new C0527d(c0529f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f5482f) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    kotlin.jvm.internal.i.e(element, "element");
                    C0529f c0529f = this.f5483g;
                    c0529f.getClass();
                    c0529f.c();
                    int h7 = c0529f.h(element.getKey());
                    if (h7 >= 0) {
                        Object[] objArr = c0529f.f5470g;
                        kotlin.jvm.internal.i.b(objArr);
                        if (kotlin.jvm.internal.i.a(objArr[h7], element.getValue())) {
                            c0529f.l(h7);
                            break;
                        }
                    }
                }
                break;
            default:
                C0529f c0529f2 = this.f5483g;
                c0529f2.c();
                int h8 = c0529f2.h(obj);
                if (h8 >= 0) {
                    c0529f2.l(h8);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f5482f) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5483g.c();
                break;
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5483g.c();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f5482f) {
            case 0:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5483g.c();
                break;
            default:
                kotlin.jvm.internal.i.e(elements, "elements");
                this.f5483g.c();
                break;
        }
        return super.retainAll(elements);
    }
}
