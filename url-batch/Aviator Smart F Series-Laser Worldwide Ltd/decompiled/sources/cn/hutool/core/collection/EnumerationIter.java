package cn.hutool.core.collection;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes.dex */
public class EnumerationIter<E> implements m0, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    private final Enumeration<E> f413e;

    public EnumerationIter(Enumeration<E> enumeration) {
        this.f413e = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f413e.hasMoreElements();
    }

    @Override // cn.hutool.core.collection.m0, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return l0.a(this);
    }

    @Override // java.util.Iterator
    public E next() {
        return this.f413e.nextElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
