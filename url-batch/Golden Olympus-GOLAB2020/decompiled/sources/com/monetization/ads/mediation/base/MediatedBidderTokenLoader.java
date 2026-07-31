package com.monetization.ads.mediation.base;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface MediatedBidderTokenLoader {
    void loadBidderToken(@NotNull Context context, @NotNull Map<String, String> map, @NotNull MediatedBidderTokenLoadListener mediatedBidderTokenLoadListener);
}
