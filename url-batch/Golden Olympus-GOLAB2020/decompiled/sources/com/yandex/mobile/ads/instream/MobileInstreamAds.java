package com.yandex.mobile.ads.instream;

import com.yandex.mobile.ads.impl.in0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class MobileInstreamAds {

    @NotNull
    public static final MobileInstreamAds INSTANCE = new MobileInstreamAds();

    private MobileInstreamAds() {
    }

    public static final void setAdGroupPreloading(boolean z4) {
        int i4 = in0.f27295g;
        in0.a.a().a(z4);
    }
}
