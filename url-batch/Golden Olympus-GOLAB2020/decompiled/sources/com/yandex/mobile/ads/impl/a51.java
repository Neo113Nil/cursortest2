package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2163pg f23165a;

    public /* synthetic */ a51() {
        this(new C2163pg());
    }

    @NotNull
    public final List<String> a(@NotNull u31 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        C2163pg c2163pg = this.f23165a;
        List<C2276uf<?>> b4 = nativeAd.b();
        c2163pg.getClass();
        Set a4 = C2163pg.a(b4);
        ArrayList arrayList = new ArrayList();
        Iterator it = a4.iterator();
        while (it.hasNext()) {
            String d4 = ((ej0) it.next()).d();
            if (d4 != null) {
                arrayList.add(d4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.toList(arrayList2);
    }

    public a51(@NotNull C2163pg assetsImagesProvider) {
        Intrinsics.checkNotNullParameter(assetsImagesProvider, "assetsImagesProvider");
        this.f23165a = assetsImagesProvider;
    }
}
