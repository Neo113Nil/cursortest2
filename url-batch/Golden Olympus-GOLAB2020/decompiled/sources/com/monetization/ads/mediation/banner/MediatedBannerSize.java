package com.monetization.ads.mediation.banner;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class MediatedBannerSize {
    private final int height;
    private final int width;

    public MediatedBannerSize(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @NotNull
    public final Map<String, Integer> toSizeData() {
        return MapsKt.mapOf(TuplesKt.to("width", Integer.valueOf(this.width)), TuplesKt.to("height", Integer.valueOf(this.height)));
    }
}
