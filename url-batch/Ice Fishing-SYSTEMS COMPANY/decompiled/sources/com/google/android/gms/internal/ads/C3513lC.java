package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.lC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3513lC extends DB implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient Map f32551w;

    /* renamed from: x, reason: collision with root package name */
    public transient int f32552x;

    /* renamed from: y, reason: collision with root package name */
    public final transient C3620nB f32553y;

    public C3513lC(Map map, C3620nB c3620nB) {
        PA.n(map.isEmpty());
        this.f32551w = map;
        this.f32553y = c3620nB;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final Collection a() {
        return new CB(0, this);
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final Map c() {
        Map map = this.f32551w;
        return map instanceof NavigableMap ? new C4051vB(this, (NavigableMap) map) : map instanceof SortedMap ? new C4213yB(this, (SortedMap) map) : new C3889sB(this, map);
    }

    public final void f() {
        Map map = this.f32551w;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f32552x = 0;
    }
}
