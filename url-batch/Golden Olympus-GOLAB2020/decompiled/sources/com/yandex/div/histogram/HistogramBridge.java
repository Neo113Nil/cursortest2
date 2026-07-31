package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface HistogramBridge {
    void recordTimeHistogram(@NonNull String str, long j4, long j5, long j6, @NonNull TimeUnit timeUnit, int i4);
}
