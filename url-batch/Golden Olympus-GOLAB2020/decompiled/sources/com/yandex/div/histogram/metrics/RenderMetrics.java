package com.yandex.div.histogram.metrics;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class RenderMetrics {
    private long bindingMs;
    private long drawMs;
    private long layoutMs;
    private long measureMs;
    private long rebindingMs;

    public final void addDraw(long j4) {
        this.drawMs += j4;
    }

    public final void addLayout(long j4) {
        this.layoutMs += j4;
    }

    public final void addMeasure(long j4) {
        this.measureMs += j4;
    }

    public final void binding(long j4) {
        this.bindingMs = j4;
    }

    public final long getDrawMs() {
        return this.drawMs;
    }

    public final long getLayoutMs() {
        return this.layoutMs;
    }

    public final long getMeasureMs() {
        return this.measureMs;
    }

    public final long getTotalMs() {
        return Math.max(this.bindingMs, this.rebindingMs) + this.measureMs + this.layoutMs + this.drawMs;
    }

    public final void rebinding(long j4) {
        this.rebindingMs = j4;
    }

    public final void reset() {
        this.measureMs = 0L;
        this.layoutMs = 0L;
        this.drawMs = 0L;
        this.bindingMs = 0L;
        this.rebindingMs = 0L;
    }
}
