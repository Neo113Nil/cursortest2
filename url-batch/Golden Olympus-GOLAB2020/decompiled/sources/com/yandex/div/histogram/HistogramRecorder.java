package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class HistogramRecorder {

    @NonNull
    private final HistogramBridge mBridge;

    public HistogramRecorder(@NonNull HistogramBridge histogramBridge) {
        this.mBridge = histogramBridge;
    }

    public void recordShortTimeHistogram(@NonNull String str, long j4, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j4), 1L, 10000L, TimeUnit.MILLISECONDS, 50);
    }
}
