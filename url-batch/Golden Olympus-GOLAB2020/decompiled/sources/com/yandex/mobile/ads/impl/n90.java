package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.q90;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m90 f29521a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v80 f29522b;

    public n90(@NotNull m90 feedItemLoadControllerCreator, @NotNull v80 feedAdRequestDataProvider) {
        Intrinsics.checkNotNullParameter(feedItemLoadControllerCreator, "feedItemLoadControllerCreator");
        Intrinsics.checkNotNullParameter(feedAdRequestDataProvider, "feedAdRequestDataProvider");
        this.f29521a = feedItemLoadControllerCreator;
        this.f29522b = feedAdRequestDataProvider;
    }

    @Nullable
    public final Object a(@NotNull C1918f7 adRequestData, @NotNull List<d90> feedItemList, @NotNull kotlin.coroutines.d dVar) {
        List<u31> e4;
        C2360y7<String> a4;
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC1241b.c(dVar));
        a aVar = new a(hVar);
        d90 d90Var = (d90) CollectionsKt.lastOrNull((List) feedItemList);
        aa0 A4 = (d90Var == null || (a4 = d90Var.a()) == null) ? null : a4.A();
        this.f29522b.getClass();
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(feedItemList, "feedItemList");
        int size = feedItemList.size() + 1;
        Iterator<T> it = feedItemList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            n61 a5 = ((d90) it.next()).c().a();
            i4 += (a5 == null || (e4 = a5.e()) == null) ? 0 : e4.size();
        }
        Map createMapBuilder = MapsKt.createMapBuilder();
        Map<String, String> h4 = adRequestData.h();
        if (h4 == null) {
            h4 = MapsKt.emptyMap();
        }
        createMapBuilder.putAll(h4);
        createMapBuilder.put("feed-page", String.valueOf(size));
        createMapBuilder.put("feed-ads-count", String.valueOf(i4));
        this.f29521a.a(aVar, C1918f7.a(adRequestData, MapsKt.build(createMapBuilder), null, 4031), A4).x();
        Object a6 = hVar.a();
        if (a6 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return a6;
    }

    private static final class a implements p90 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlin.coroutines.d f29523a;

        public a(@NotNull kotlin.coroutines.h continuation) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f29523a = continuation;
        }

        @Override // com.yandex.mobile.ads.impl.p90
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            kotlin.coroutines.d dVar = this.f29523a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m243constructorimpl(new q90.a(adRequestError)));
        }

        @Override // com.yandex.mobile.ads.impl.p90
        public final void a(@NotNull or0 loadedFeedItem) {
            Intrinsics.checkNotNullParameter(loadedFeedItem, "loadedFeedItem");
            kotlin.coroutines.d dVar = this.f29523a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m243constructorimpl(new q90.b(loadedFeedItem)));
        }
    }
}
