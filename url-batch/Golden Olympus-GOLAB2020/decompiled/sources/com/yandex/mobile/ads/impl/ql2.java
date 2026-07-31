package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ql2 implements InstreamAd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qs f30834a;

    public ql2(@NotNull qs coreInstreamAd) {
        Intrinsics.checkNotNullParameter(coreInstreamAd, "coreInstreamAd");
        this.f30834a = coreInstreamAd;
    }

    @NotNull
    public final qs a() {
        return this.f30834a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql2) && Intrinsics.areEqual(this.f30834a, ((ql2) obj).f30834a);
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    @NotNull
    public final List<InstreamAdBreak> getAdBreaks() {
        List<ss> a4 = this.f30834a.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a4, 10));
        Iterator<T> it = a4.iterator();
        while (it.hasNext()) {
            arrayList.add(new rl2((ss) it.next()));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f30834a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexInstreamAd(coreInstreamAd=" + this.f30834a + ")";
    }
}
