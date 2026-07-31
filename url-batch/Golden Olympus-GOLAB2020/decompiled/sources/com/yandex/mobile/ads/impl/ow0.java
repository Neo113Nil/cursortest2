package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ow0 {
    @NotNull
    public static Set a(@NotNull u31 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<C2276uf<?>> b4 = nativeAd.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b4, 10));
        Iterator<T> it = b4.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2276uf) it.next()).d());
        }
        return CollectionsKt.toSet(CollectionsKt.filterIsInstance(arrayList, mw0.class));
    }
}
