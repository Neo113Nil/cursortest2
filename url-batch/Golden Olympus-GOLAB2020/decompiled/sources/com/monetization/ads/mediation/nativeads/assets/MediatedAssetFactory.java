package com.monetization.ads.mediation.nativeads.assets;

import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface MediatedAssetFactory {
    @NotNull
    MediatedNativeAdImage makeDefaultFeedback();

    @NotNull
    String makeDefaultSponsored();
}
