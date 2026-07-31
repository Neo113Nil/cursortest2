package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g61 {
    @NotNull
    public static Set a(@NotNull f61 nativeAdPrivate) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        return a(nativeAdPrivate, null);
    }

    @NotNull
    public static Set b(@NotNull f61 nativeAdPrivate) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        return a(nativeAdPrivate, i20.f27070b);
    }

    @NotNull
    public static Set c(@NotNull f61 nativeAdPrivate) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        return a(nativeAdPrivate, i20.f27071c);
    }

    private static Set a(f61 f61Var, i20 i20Var) {
        List<q20> c4 = f61Var.c();
        if (c4 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = c4.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((q20) it.next()).a());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                h20 h20Var = (h20) obj;
                if (i20Var == null || h20Var.b() == i20Var) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                arrayList3.add(((h20) obj2).a());
            }
            Set set = CollectionsKt.toSet(arrayList3);
            if (set != null) {
                return set;
            }
        }
        return kotlin.collections.T.e();
    }
}
