package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.zB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4267zB extends C3943tB implements SortedSet {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3513lC f35496v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4267zB(C3513lC c3513lC, SortedMap sortedMap) {
        super(c3513lC, sortedMap);
        Objects.requireNonNull(c3513lC);
        this.f35496v = c3513lC;
    }

    public SortedMap a() {
        return (SortedMap) this.f34375n;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C4267zB(this.f35496v, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C4267zB(this.f35496v, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C4267zB(this.f35496v, a().tailMap(obj));
    }
}
