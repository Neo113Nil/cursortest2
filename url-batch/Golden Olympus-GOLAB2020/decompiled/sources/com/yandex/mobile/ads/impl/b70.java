package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f23618a;

    /* JADX WARN: Multi-variable type inference failed */
    public b70(@NotNull List<? extends C2276uf<?>> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f23618a = assets;
    }

    @NotNull
    public final ArrayList a(@NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        List<C2276uf<?>> list = this.f23618a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((C2276uf) obj).f()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            InterfaceC2299vf<?> a4 = nativeAdViewAdapter.a((C2276uf) obj2);
            if (a4 == null || !a4.b()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            arrayList3.add(((C2276uf) obj3).b());
        }
        return arrayList3;
    }
}
