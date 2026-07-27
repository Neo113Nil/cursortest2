package h4;

import g4.AbstractC0461f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: h4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491i extends AbstractC0461f implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0491i f5823b;

    /* renamed from: a, reason: collision with root package name */
    public final C0488f f5824a;

    static {
        C0488f c0488f = C0488f.f5806n;
        f5823b = new C0491i(C0488f.f5806n);
    }

    public C0491i(C0488f backing) {
        kotlin.jvm.internal.i.e(backing, "backing");
        this.f5824a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f5824a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5824a.d();
        return super.addAll(elements);
    }

    @Override // g4.AbstractC0461f
    public final int c() {
        return this.f5824a.f5815i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5824a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5824a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5824a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0488f c0488f = this.f5824a;
        c0488f.getClass();
        return new C0486d(c0488f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0488f c0488f = this.f5824a;
        c0488f.d();
        int i2 = c0488f.i(obj);
        if (i2 < 0) {
            return false;
        }
        c0488f.m(i2);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5824a.d();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        this.f5824a.d();
        return super.retainAll(elements);
    }

    public C0491i() {
        this(new C0488f());
    }
}
