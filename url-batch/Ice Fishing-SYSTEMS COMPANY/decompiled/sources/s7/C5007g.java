package s7;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import r7.AbstractC4975f;

/* renamed from: s7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5007g extends AbstractC4975f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40520n;

    /* renamed from: u, reason: collision with root package name */
    public final C5006f f40521u;

    public /* synthetic */ C5007g(C5006f c5006f, int i) {
        this.f40520n = i;
        this.f40521u = c5006f;
    }

    @Override // r7.AbstractC4975f
    public final int a() {
        switch (this.f40520n) {
        }
        return this.f40521u.f40508B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f40520n) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f40520n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f40520n) {
            case 0:
                this.f40521u.clear();
                break;
            default:
                this.f40521u.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f40520n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.h.e(element, "element");
                return this.f40521u.g(element);
            default:
                return this.f40521u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f40520n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                return this.f40521u.f(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f40520n) {
        }
        return this.f40521u.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f40520n) {
            case 0:
                C5006f c5006f = this.f40521u;
                c5006f.getClass();
                return new C5004d(c5006f, 0);
            default:
                C5006f c5006f2 = this.f40521u;
                c5006f2.getClass();
                return new C5004d(c5006f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f40520n) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    kotlin.jvm.internal.h.e(element, "element");
                    C5006f c5006f = this.f40521u;
                    c5006f.getClass();
                    c5006f.d();
                    int i = c5006f.i(element.getKey());
                    if (i >= 0) {
                        Object[] objArr = c5006f.f40514u;
                        kotlin.jvm.internal.h.b(objArr);
                        if (kotlin.jvm.internal.h.a(objArr[i], element.getValue())) {
                            c5006f.m(i);
                            break;
                        }
                    }
                }
                break;
            default:
                C5006f c5006f2 = this.f40521u;
                c5006f2.d();
                int i4 = c5006f2.i(obj);
                if (i4 >= 0) {
                    c5006f2.m(i4);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f40520n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f40521u.d();
                break;
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f40521u.d();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f40520n) {
            case 0:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f40521u.d();
                break;
            default:
                kotlin.jvm.internal.h.e(elements, "elements");
                this.f40521u.d();
                break;
        }
        return super.retainAll(elements);
    }
}
