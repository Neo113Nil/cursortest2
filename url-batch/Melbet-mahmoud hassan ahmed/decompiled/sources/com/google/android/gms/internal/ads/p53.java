package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class p53 extends s53 implements NavigableSet {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ x53 f10105i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p53(x53 x53Var, NavigableMap navigableMap) {
        super(x53Var, navigableMap);
        this.f10105i = x53Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2680f)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new p53(this.f10105i, ((NavigableMap) ((SortedMap) this.f2680f)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2680f)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z6) {
        return new p53(this.f10105i, ((NavigableMap) ((SortedMap) this.f2680f)).headMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.s53, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2680f)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.s53
    final /* synthetic */ SortedMap i() {
        return (NavigableMap) ((SortedMap) this.f2680f);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2680f)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return t73.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return t73.a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z6, Object obj2, boolean z7) {
        return new p53(this.f10105i, ((NavigableMap) ((SortedMap) this.f2680f)).subMap(obj, z6, obj2, z7));
    }

    @Override // com.google.android.gms.internal.ads.s53, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z6) {
        return new p53(this.f10105i, ((NavigableMap) ((SortedMap) this.f2680f)).tailMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.s53, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
