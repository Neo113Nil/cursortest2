package m5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import l5.AbstractC0502f;

/* renamed from: m5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532i extends AbstractC0502f implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0532i f5485g;

    /* renamed from: f, reason: collision with root package name */
    public final C0529f f5486f;

    static {
        C0529f c0529f = C0529f.f5468s;
        f5485g = new C0532i(C0529f.f5468s);
    }

    public C0532i(C0529f backing) {
        kotlin.jvm.internal.i.e(backing, "backing");
        this.f5486f = backing;
    }

    @Override // l5.AbstractC0502f
    public final int a() {
        return this.f5486f.f5477n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f5486f.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5486f.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5486f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5486f.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5486f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0529f c0529f = this.f5486f;
        c0529f.getClass();
        return new C0527d(c0529f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0529f c0529f = this.f5486f;
        c0529f.c();
        int h7 = c0529f.h(obj);
        if (h7 < 0) {
            return false;
        }
        c0529f.l(h7);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5486f.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5486f.c();
        return super.retainAll(elements);
    }

    public C0532i() {
        this(new C0529f());
    }
}
