package com.yandex.div.histogram;

import W1.h;
import W1.i;
import W1.l;
import android.os.SystemClock;
import com.yandex.div.histogram.metrics.RenderMetrics;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Div2ViewHistogramReporter {

    @Nullable
    private Long bindingPausedTime;

    @Nullable
    private Long bindingResumedTime;

    @Nullable
    private Long bindingStartedTime;

    @Nullable
    private String component;

    @Nullable
    private Long drawStartedTime;

    @NotNull
    private final Function0<HistogramReporter> histogramReporter;

    @Nullable
    private Long layoutStartedTime;

    @Nullable
    private Long measureStartedTime;

    @Nullable
    private Long rebindingStartedTime;

    @NotNull
    private final Function0<RenderConfiguration> renderConfig;

    @NotNull
    private final h renderMetrics$delegate;
    private boolean renderStarted;

    /* JADX WARN: Multi-variable type inference failed */
    public Div2ViewHistogramReporter(@NotNull Function0<? extends HistogramReporter> histogramReporter, @NotNull Function0<RenderConfiguration> renderConfig) {
        Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
        Intrinsics.checkNotNullParameter(renderConfig, "renderConfig");
        this.histogramReporter = histogramReporter;
        this.renderConfig = renderConfig;
        this.renderMetrics$delegate = i.a(l.f9608d, Div2ViewHistogramReporter$renderMetrics$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentUptime() {
        return SystemClock.uptimeMillis();
    }

    private final RenderMetrics getRenderMetrics() {
        return (RenderMetrics) this.renderMetrics$delegate.getValue();
    }

    private final void reportRenderMetrics(RenderMetrics renderMetrics) {
        HistogramReporter histogramReporter = (HistogramReporter) this.histogramReporter.invoke();
        RenderConfiguration renderConfiguration = (RenderConfiguration) this.renderConfig.invoke();
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Render.Total", renderMetrics.getTotalMs(), this.component, null, renderConfiguration.getTotalFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Render.Measure", renderMetrics.getMeasureMs(), this.component, null, renderConfiguration.getMeasureFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Render.Layout", renderMetrics.getLayoutMs(), this.component, null, renderConfiguration.getLayoutFilter(), 8, null);
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Render.Draw", renderMetrics.getDrawMs(), this.component, null, renderConfiguration.getDrawFilter(), 8, null);
    }

    private final void resetRenderMetrics() {
        this.renderStarted = false;
        this.layoutStartedTime = null;
        this.measureStartedTime = null;
        this.drawStartedTime = null;
        getRenderMetrics().reset();
    }

    private final long toTimePassed(long j4) {
        return getCurrentUptime() - j4;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }

    public final void onBindingFinished() {
        String str;
        long currentUptime;
        Long l4 = this.bindingStartedTime;
        Long l5 = this.bindingPausedTime;
        Long l6 = this.bindingResumedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l4 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                str = "start time of Div.Binding is null";
                Assert.fail(str);
            }
        } else {
            if (l5 != null && l6 != null) {
                currentUptime = ((getCurrentUptime() - l6.longValue()) + l5.longValue()) - l4.longValue();
            } else if (l5 == null && l6 == null) {
                currentUptime = getCurrentUptime() - l4.longValue();
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    str = "when Div.Binding has paused time it should have resumed time and otherwise";
                    Assert.fail(str);
                }
            }
            renderMetrics.binding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Binding", currentUptime, getComponent(), null, null, 24, null);
        }
        this.bindingStartedTime = null;
        this.bindingPausedTime = null;
        this.bindingResumedTime = null;
    }

    public final void onBindingPaused() {
        this.bindingPausedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingResumed() {
        this.bindingResumedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onBindingStarted() {
        this.bindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onDrawFinished() {
        Long l4 = this.drawStartedTime;
        if (l4 != null) {
            getRenderMetrics().addDraw(toTimePassed(l4.longValue()));
        }
        if (this.renderStarted) {
            reportRenderMetrics(getRenderMetrics());
        }
        resetRenderMetrics();
    }

    public final void onDrawStarted() {
        this.drawStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onLayoutFinished() {
        Long l4 = this.layoutStartedTime;
        if (l4 != null) {
            getRenderMetrics().addLayout(toTimePassed(l4.longValue()));
        }
    }

    public final void onLayoutStarted() {
        this.layoutStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onMeasureFinished() {
        Long l4 = this.measureStartedTime;
        if (l4 != null) {
            getRenderMetrics().addMeasure(toTimePassed(l4.longValue()));
        }
    }

    public final void onMeasureStarted() {
        this.measureStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRebindingFinished() {
        Long l4 = this.rebindingStartedTime;
        RenderMetrics renderMetrics = getRenderMetrics();
        if (l4 == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("start time of Div.Rebinding is null");
            }
        } else {
            long currentUptime = getCurrentUptime() - l4.longValue();
            renderMetrics.rebinding(currentUptime);
            HistogramReporter.reportDuration$default((HistogramReporter) this.histogramReporter.invoke(), "Div.Rebinding", currentUptime, getComponent(), null, null, 24, null);
        }
        this.rebindingStartedTime = null;
    }

    public final void onRebindingStarted() {
        this.rebindingStartedTime = Long.valueOf(getCurrentUptime());
    }

    public final void onRenderStarted() {
        this.renderStarted = true;
    }

    public final void setComponent(@Nullable String str) {
        this.component = str;
    }
}
