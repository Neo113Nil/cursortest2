package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2163pg {
    @NotNull
    public static Set a(@NotNull List assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(assets, 10));
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2276uf) it.next()).d());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            List<ej0> listOf = obj instanceof ej0 ? CollectionsKt.listOf(obj) : obj instanceof mw0 ? ((mw0) obj).a() : null;
            if (listOf != null) {
                arrayList2.add(listOf);
            }
        }
        return CollectionsKt.toSet(CollectionsKt.flatten(arrayList2));
    }
}
