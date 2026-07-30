package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    @Beta
    protected class StandardDescendingSet extends Sets.DescendingSet<E> {
        public StandardDescendingSet(ForwardingNavigableSet forwardingNavigableSet) {
            super(forwardingNavigableSet);
        }
    }

    protected ForwardingNavigableSet() {
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E ceiling(@ParametricNullness E e8) {
        return delegate().ceiling(e8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract NavigableSet<E> delegate();

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return delegate().descendingSet();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E floor(@ParametricNullness E e8) {
        return delegate().floor(e8);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@ParametricNullness E e8, boolean z7) {
        return delegate().headSet(e8, z7);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E higher(@ParametricNullness E e8) {
        return delegate().higher(e8);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E lower(@ParametricNullness E e8) {
        return delegate().lower(e8);
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    public E pollLast() {
        return delegate().pollLast();
    }

    @CheckForNull
    protected E standardCeiling(@ParametricNullness E e8) {
        return (E) Iterators.getNext(tailSet(e8, true).iterator(), null);
    }

    @ParametricNullness
    protected E standardFirst() {
        return iterator().next();
    }

    @CheckForNull
    protected E standardFloor(@ParametricNullness E e8) {
        return (E) Iterators.getNext(headSet(e8, true).descendingIterator(), null);
    }

    protected SortedSet<E> standardHeadSet(@ParametricNullness E e8) {
        return headSet(e8, false);
    }

    @CheckForNull
    protected E standardHigher(@ParametricNullness E e8) {
        return (E) Iterators.getNext(tailSet(e8, false).iterator(), null);
    }

    @ParametricNullness
    protected E standardLast() {
        return descendingIterator().next();
    }

    @CheckForNull
    protected E standardLower(@ParametricNullness E e8) {
        return (E) Iterators.getNext(headSet(e8, false).descendingIterator(), null);
    }

    @CheckForNull
    protected E standardPollFirst() {
        return (E) Iterators.pollNext(iterator());
    }

    @CheckForNull
    protected E standardPollLast() {
        return (E) Iterators.pollNext(descendingIterator());
    }

    @Beta
    protected NavigableSet<E> standardSubSet(@ParametricNullness E e8, boolean z7, @ParametricNullness E e9, boolean z8) {
        return tailSet(e8, z7).headSet(e9, z8);
    }

    protected SortedSet<E> standardTailSet(@ParametricNullness E e8) {
        return tailSet(e8, true);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@ParametricNullness E e8, boolean z7, @ParametricNullness E e9, boolean z8) {
        return delegate().subSet(e8, z7, e9, z8);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@ParametricNullness E e8, boolean z7) {
        return delegate().tailSet(e8, z7);
    }

    @Override // com.google.common.collect.ForwardingSortedSet
    protected SortedSet<E> standardSubSet(@ParametricNullness E e8, @ParametricNullness E e9) {
        return subSet(e8, true, e9, false);
    }
}
