package com.yandex.div.histogram;

import V1.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface HistogramRecordConfiguration {
    @NotNull
    a getRenderConfiguration();

    boolean isColdRecordingEnabled();

    boolean isCoolRecordingEnabled();

    boolean isSizeRecordingEnabled();

    boolean isWarmRecordingEnabled();
}
