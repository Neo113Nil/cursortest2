package s7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import r7.AbstractC4975f;

/* renamed from: s7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5009i extends AbstractC4975f implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final C5009i f40523u;

    /* renamed from: n, reason: collision with root package name */
    public final C5006f f40524n;

    static {
        C5006f c5006f = C5006f.f40506G;
        f40523u = new C5009i(C5006f.f40506G);
    }

    public C5009i(C5006f backing) {
        kotlin.jvm.internal.h.e(backing, "backing");
        this.f40524n = backing;
    }

    @Override // r7.AbstractC4975f
    public final int a() {
        return this.f40524n.f40508B;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f40524n.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f40524n.d();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f40524n.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f40524n.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f40524n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C5006f c5006f = this.f40524n;
        c5006f.getClass();
        return new C5004d(c5006f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C5006f c5006f = this.f40524n;
        c5006f.d();
        int i = c5006f.i(obj);
        if (i < 0) {
            return false;
        }
        c5006f.m(i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f40524n.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        this.f40524n.d();
        return super.retainAll(elements);
    }

    public C5009i() {
        this(new C5006f());
    }
}
