package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1975hg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f26737a;

    public C1975hg(@NotNull List<? extends C2276uf<?>> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(assets, 10)), 16));
        Iterator<T> it = assets.iterator();
        while (it.hasNext()) {
            C2276uf c2276uf = (C2276uf) it.next();
            Pair pair = TuplesKt.to(c2276uf.b(), c2276uf.d());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.f26737a = linkedHashMap;
    }

    @Nullable
    public final mw0 a() {
        Object obj = this.f26737a.get(b9.h.f15446I0);
        if (obj instanceof mw0) {
            return (mw0) obj;
        }
        return null;
    }
}
