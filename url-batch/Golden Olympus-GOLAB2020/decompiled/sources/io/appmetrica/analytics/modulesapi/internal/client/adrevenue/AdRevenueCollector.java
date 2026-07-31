package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface AdRevenueCollector {
    boolean getEnabled();

    @NotNull
    String getSourceIdentifier();
}
