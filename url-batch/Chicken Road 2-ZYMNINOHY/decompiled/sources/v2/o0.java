package v2;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f15665a;

    public o0(Iterator it) {
        it.getClass();
        this.f15665a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15665a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f15665a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15665a.remove();
    }
}
