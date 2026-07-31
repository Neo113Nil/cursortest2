package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a51 f30687a;

    public /* synthetic */ q61() {
        this(new a51());
    }

    @NotNull
    public final List<String> a(@NotNull n61 responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        List<u31> e4 = responseBody.e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(e4, 10));
        Iterator<T> it = e4.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f30687a.a((u31) it.next()));
        }
        return CollectionsKt.flatten(arrayList);
    }

    public q61(@NotNull a51 nativeAdDataExtractor) {
        Intrinsics.checkNotNullParameter(nativeAdDataExtractor, "nativeAdDataExtractor");
        this.f30687a = nativeAdDataExtractor;
    }
}
