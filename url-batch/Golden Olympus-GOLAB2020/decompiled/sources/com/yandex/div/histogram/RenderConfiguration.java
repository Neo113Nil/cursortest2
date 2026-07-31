package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class RenderConfiguration {

    @NotNull
    private final HistogramFilter drawFilter;

    @NotNull
    private final HistogramFilter layoutFilter;

    @NotNull
    private final HistogramFilter measureFilter;

    @NotNull
    private final HistogramFilter totalFilter;

    public RenderConfiguration(@NotNull HistogramFilter measureFilter, @NotNull HistogramFilter layoutFilter, @NotNull HistogramFilter drawFilter, @NotNull HistogramFilter totalFilter) {
        Intrinsics.checkNotNullParameter(measureFilter, "measureFilter");
        Intrinsics.checkNotNullParameter(layoutFilter, "layoutFilter");
        Intrinsics.checkNotNullParameter(drawFilter, "drawFilter");
        Intrinsics.checkNotNullParameter(totalFilter, "totalFilter");
        this.measureFilter = measureFilter;
        this.layoutFilter = layoutFilter;
        this.drawFilter = drawFilter;
        this.totalFilter = totalFilter;
    }

    @NotNull
    public final HistogramFilter getDrawFilter() {
        return this.drawFilter;
    }

    @NotNull
    public final HistogramFilter getLayoutFilter() {
        return this.layoutFilter;
    }

    @NotNull
    public final HistogramFilter getMeasureFilter() {
        return this.measureFilter;
    }

    @NotNull
    public final HistogramFilter getTotalFilter() {
        return this.totalFilter;
    }

    public /* synthetic */ RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter, (i4 & 2) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter2, (i4 & 4) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter3, (i4 & 8) != 0 ? HistogramFilter.Companion.getON() : histogramFilter4);
    }
}
