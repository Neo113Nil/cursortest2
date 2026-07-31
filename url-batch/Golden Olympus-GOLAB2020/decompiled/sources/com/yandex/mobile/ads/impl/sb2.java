package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sb2<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kd2 f31674a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ha2 f31675b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qb2<T> f31676c;

    public /* synthetic */ sb2(Context context, hc2 hc2Var) {
        this(context, hc2Var, new kd2(), new ha2(context), new qb2(hc2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0079  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(@NotNull List videoAds) {
        List sortedWith;
        int size;
        int i4;
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        this.f31674a.getClass();
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        if (!(videoAds instanceof Collection) || !videoAds.isEmpty()) {
            Iterator<T> it = videoAds.iterator();
            while (it.hasNext()) {
                if (((bb2) it.next()).i() != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t4 : videoAds) {
                        if (((bb2) t4).i() != null) {
                            arrayList.add(t4);
                        }
                    }
                    sortedWith = CollectionsKt.sortedWith(arrayList, new jd2());
                    ArrayList a4 = this.f31675b.a(sortedWith);
                    int size2 = a4.size();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a4, 10));
                    size = a4.size();
                    int i5 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        Object obj = a4.get(i4);
                        i4++;
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        arrayList2.add(this.f31676c.a((ga2) obj, size2, i5));
                        i5 = i6;
                    }
                    return arrayList2;
                }
            }
        }
        sortedWith = CollectionsKt.toList(videoAds);
        ArrayList a42 = this.f31675b.a(sortedWith);
        int size22 = a42.size();
        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a42, 10));
        size = a42.size();
        int i52 = 0;
        i4 = 0;
        while (i4 < size) {
        }
        return arrayList22;
    }

    public sb2(@NotNull Context context, @NotNull hc2<T> playbackInfoCreator, @NotNull kd2 videoAdsOrderFilter, @NotNull ha2 vastVideoAdsDataProvider, @NotNull qb2<T> videoAdInfoCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playbackInfoCreator, "playbackInfoCreator");
        Intrinsics.checkNotNullParameter(videoAdsOrderFilter, "videoAdsOrderFilter");
        Intrinsics.checkNotNullParameter(vastVideoAdsDataProvider, "vastVideoAdsDataProvider");
        Intrinsics.checkNotNullParameter(videoAdInfoCreator, "videoAdInfoCreator");
        this.f31674a = videoAdsOrderFilter;
        this.f31675b = vastVideoAdsDataProvider;
        this.f31676c = videoAdInfoCreator;
    }
}
