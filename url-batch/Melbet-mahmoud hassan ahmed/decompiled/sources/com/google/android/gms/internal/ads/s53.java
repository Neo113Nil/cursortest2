package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
class s53 extends n53 implements SortedSet {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ x53 f11671h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s53(x53 x53Var, SortedMap sortedMap) {
        super(x53Var, sortedMap);
        this.f11671h = x53Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return i().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return i().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new s53(this.f11671h, i().headMap(obj));
    }

    SortedMap i() {
        return (SortedMap) this.f2680f;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return i().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new s53(this.f11671h, i().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new s53(this.f11671h, i().tailMap(obj));
    }
}
