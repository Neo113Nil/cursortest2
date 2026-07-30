package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    protected ForwardingList() {
    }

    public void add(int i8, @ParametricNullness E e8) {
        delegate().add(i8, e8);
    }

    @CanIgnoreReturnValue
    public boolean addAll(int i8, Collection<? extends E> collection) {
        return delegate().addAll(i8, collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract List<E> delegate();

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.List
    @ParametricNullness
    public E get(int i8) {
        return delegate().get(i8);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
        return delegate().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        return delegate().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return delegate().listIterator();
    }

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove(int i8) {
        return delegate().remove(i8);
    }

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E set(int i8, @ParametricNullness E e8) {
        return delegate().set(i8, e8);
    }

    protected boolean standardAdd(@ParametricNullness E e8) {
        add(size(), e8);
        return true;
    }

    protected boolean standardAddAll(int i8, Iterable<? extends E> iterable) {
        return Lists.addAllImpl(this, i8, iterable);
    }

    @Beta
    protected boolean standardEquals(@CheckForNull Object obj) {
        return Lists.equalsImpl(this, obj);
    }

    @Beta
    protected int standardHashCode() {
        return Lists.hashCodeImpl(this);
    }

    protected int standardIndexOf(@CheckForNull Object obj) {
        return Lists.indexOfImpl(this, obj);
    }

    protected Iterator<E> standardIterator() {
        return listIterator();
    }

    protected int standardLastIndexOf(@CheckForNull Object obj) {
        return Lists.lastIndexOfImpl(this, obj);
    }

    protected ListIterator<E> standardListIterator() {
        return listIterator(0);
    }

    @Beta
    protected List<E> standardSubList(int i8, int i9) {
        return Lists.subListImpl(this, i8, i9);
    }

    @Override // java.util.List
    public List<E> subList(int i8, int i9) {
        return delegate().subList(i8, i9);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i8) {
        return delegate().listIterator(i8);
    }

    @Beta
    protected ListIterator<E> standardListIterator(int i8) {
        return Lists.listIteratorImpl(this, i8);
    }
}
