package com.yandex.mobile.ads.impl;

import android.content.res.TypedArray;
import com.yandex.mobile.ads.R;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class of2 {
    @Nullable
    public static nf2 a(@NotNull TypedArray attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return (nf2) AbstractC3219i.N(nf2.values(), attributes.getInt(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_scale_type, -1));
    }
}
