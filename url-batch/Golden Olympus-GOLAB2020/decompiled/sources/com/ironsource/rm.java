package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class rm {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f18917a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f18918b;

    @Nullable
    public final AdapterNativeAdData a() {
        return this.f18918b;
    }

    @Nullable
    public final AdapterNativeAdViewBinder b() {
        return this.f18917a;
    }

    public final void a(@Nullable AdapterNativeAdData adapterNativeAdData) {
        this.f18918b = adapterNativeAdData;
    }

    public final void a(@Nullable AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f18917a = adapterNativeAdViewBinder;
    }
}
