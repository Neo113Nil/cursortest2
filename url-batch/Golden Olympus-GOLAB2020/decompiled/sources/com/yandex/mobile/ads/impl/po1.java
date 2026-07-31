package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class po1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f30514a;

    /* JADX WARN: Multi-variable type inference failed */
    public po1(@NotNull List<? extends C2276uf<?>> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f30514a = assets;
    }

    @NotNull
    public final ArrayList a(@NotNull v61 viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        List<C2276uf<?>> list = this.f30514a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC2299vf<?> a4 = viewAdapter.a((C2276uf) obj);
            if (a4 != null && a4.b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((C2276uf) obj2).b());
        }
        return arrayList2;
    }
}
