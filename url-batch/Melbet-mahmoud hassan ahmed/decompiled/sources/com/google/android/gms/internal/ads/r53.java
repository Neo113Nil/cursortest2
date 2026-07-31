package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
class r53 extends j53 implements SortedMap {

    /* renamed from: j, reason: collision with root package name */
    SortedSet f11033j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ x53 f11034k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r53(x53 x53Var, SortedMap sortedMap) {
        super(x53Var, sortedMap);
        this.f11034k = x53Var;
    }

    SortedMap c() {
        return (SortedMap) this.f6980h;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return c().comparator();
    }

    SortedSet d() {
        return new s53(this.f11034k, c());
    }

    @Override // com.google.android.gms.internal.ads.j53, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f11033j;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet d7 = d();
        this.f11033j = d7;
        return d7;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return c().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new r53(this.f11034k, c().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return c().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new r53(this.f11034k, c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new r53(this.f11034k, c().tailMap(obj));
    }
}
