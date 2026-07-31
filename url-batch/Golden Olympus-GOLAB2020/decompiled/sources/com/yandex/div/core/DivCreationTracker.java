package com.yandex.div.core;

import android.os.SystemClock;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivCreationTracker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicBoolean isColdContextCreate = new AtomicBoolean(true);

    @NotNull
    private static final AtomicBoolean isColdViewCreate = new AtomicBoolean(true);

    @NotNull
    private final String contextCreateCallType;
    private long contextCreatedTime = -1;

    @NotNull
    private final AtomicBoolean contextCreationReported = new AtomicBoolean(false);
    private final long contextCreationStarted;

    @NotNull
    private final AtomicBoolean isFirstViewCreate;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getCurrentUptimeMillis() {
            return SystemClock.uptimeMillis();
        }

        private Companion() {
        }
    }

    public DivCreationTracker(long j4) {
        this.contextCreationStarted = j4;
        this.contextCreateCallType = isColdContextCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        this.isFirstViewCreate = new AtomicBoolean(true);
    }

    private final void sendContextCreationHistogram(HistogramReporter histogramReporter) {
        long j4 = this.contextCreatedTime;
        if (j4 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.Context.Create", j4 - this.contextCreationStarted, null, this.contextCreateCallType, null, 20, null);
        this.contextCreatedTime = -1L;
    }

    @NotNull
    public final String getViewCreateCallType() {
        return this.isFirstViewCreate.compareAndSet(true, false) ? isColdViewCreate.compareAndSet(true, false) ? "Cold" : "Cool" : "Warm";
    }

    public final void onContextCreationFinished() {
        if (this.contextCreatedTime >= 0) {
            return;
        }
        this.contextCreatedTime = Companion.getCurrentUptimeMillis();
    }

    public final void sendHistograms(long j4, long j5, @NotNull HistogramReporter histogramReporter, @NotNull String viewCreateCallType) {
        Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
        Intrinsics.checkNotNullParameter(viewCreateCallType, "viewCreateCallType");
        if (j5 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, "Div.View.Create", j5 - j4, null, viewCreateCallType, null, 20, null);
        if (this.contextCreationReported.compareAndSet(false, true)) {
            sendContextCreationHistogram(histogramReporter);
        }
    }
}
