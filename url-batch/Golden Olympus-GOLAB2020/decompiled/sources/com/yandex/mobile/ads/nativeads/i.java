package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.f61;
import com.yandex.mobile.ads.impl.pz1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i extends e implements SliderAd {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final pz1 f35905d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final g f35906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull pz1 sliderAdPrivate, @NotNull g nativeAdViewBinderAdapter) {
        super(sliderAdPrivate);
        Intrinsics.checkNotNullParameter(sliderAdPrivate, "sliderAdPrivate");
        Intrinsics.checkNotNullParameter(nativeAdViewBinderAdapter, "nativeAdViewBinderAdapter");
        this.f35905d = sliderAdPrivate;
        this.f35906e = nativeAdViewBinderAdapter;
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    public final void bindSliderAd(@NotNull NativeAdViewBinder viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.f35906e.getClass();
        this.f35905d.a(g.a(viewBinder));
    }

    @Override // com.yandex.mobile.ads.nativeads.e
    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof i) && Intrinsics.areEqual(((i) obj).f35905d, this.f35905d);
    }

    @Override // com.yandex.mobile.ads.nativeads.SliderAd
    @NotNull
    public final List<NativeAd> getNativeAds() {
        ArrayList d4 = this.f35905d.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(d4, 10));
        int size = d4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = d4.get(i4);
            i4++;
            arrayList.add(new e((f61) obj));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.nativeads.e
    public final int hashCode() {
        return this.f35905d.hashCode();
    }
}
