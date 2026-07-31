package com.monetization.ads.mediation.nativeads;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class MediatedNativeAdapter extends a {
    public abstract void loadAd(@NotNull Context context, @NotNull MediatedNativeAdapterListener mediatedNativeAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);
}
