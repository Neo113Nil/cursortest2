package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ak2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bb2 f23349a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ek2 f23350b;

    public /* synthetic */ ak2(bb2 bb2Var) {
        this(bb2Var, new ek2());
    }

    @NotNull
    public final ArrayList a(@NotNull bb2 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        List<hu> wrapperAdCreatives = this.f23349a.e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = wrapperAdCreatives.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((hu) it.next()).j());
        }
        List<hu> e4 = videoAd.e();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(e4, 10));
        for (hu adCreative : e4) {
            this.f23350b.getClass();
            Intrinsics.checkNotNullParameter(adCreative, "adCreative");
            Intrinsics.checkNotNullParameter(wrapperAdCreatives, "wrapperAdCreatives");
            List<sh0> f4 = adCreative.f();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(f4, 10));
            Iterator<T> it2 = f4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((sh0) it2.next()).a());
            }
            Set mutableSet = CollectionsKt.toMutableSet(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it3 = wrapperAdCreatives.iterator();
            while (it3.hasNext()) {
                CollectionsKt.addAll(arrayList4, ((hu) it3.next()).f());
            }
            ArrayList arrayList5 = new ArrayList();
            int size = arrayList4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList4.get(i4);
                i4++;
                if (mutableSet.add(((sh0) obj).a())) {
                    arrayList5.add(obj);
                }
            }
            arrayList2.add(new hu.a().c(adCreative.g()).b(adCreative.h()).a(adCreative.f()).c(arrayList).b(adCreative.c()).a(adCreative.i()).a(adCreative.e()).a(arrayList5).c(adCreative.j()).a(adCreative.b()).a());
        }
        return arrayList2;
    }

    public ak2(@NotNull bb2 wrapperAd, @NotNull ek2 iconsProvider) {
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(iconsProvider, "iconsProvider");
        this.f23349a = wrapperAd;
        this.f23350b = iconsProvider;
    }
}
