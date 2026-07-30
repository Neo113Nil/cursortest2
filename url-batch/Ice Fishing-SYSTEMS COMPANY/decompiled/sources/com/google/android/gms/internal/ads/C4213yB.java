package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.yB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4213yB extends C3889sB implements SortedMap {

    /* renamed from: x, reason: collision with root package name */
    public SortedSet f35328x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C3513lC f35329y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4213yB(C3513lC c3513lC, SortedMap sortedMap) {
        super(c3513lC, sortedMap);
        Objects.requireNonNull(c3513lC);
        this.f35329y = c3513lC;
    }

    public SortedSet b() {
        return new C4267zB(this.f35329y, d());
    }

    @Override // com.google.android.gms.internal.ads.C3889sB, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f35328x;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b9 = b();
        this.f35328x = b9;
        return b9;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f34209v;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C4213yB(this.f35329y, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C4213yB(this.f35329y, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C4213yB(this.f35329y, d().tailMap(obj));
    }
}
