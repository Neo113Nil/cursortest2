package com.monetization.ads.mediation.base.prefetch;

import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface MediatedAdapterPrefetchListener {
    void onPrefetchFailed(@Nullable Integer num, @Nullable String str);

    void onPrefetched(@NotNull MediatedPrefetchAdapterData mediatedPrefetchAdapterData);
}
