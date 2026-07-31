package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivKitComponent {

    @Metadata
    public interface Builder {
        @NotNull
        Builder applicationContext(@NotNull Context context);

        @NotNull
        DivKitComponent build();

        @NotNull
        Builder configuration(@NotNull DivKitConfiguration divKitConfiguration);
    }

    @NotNull
    Div2Component.Builder div2Component();

    @NotNull
    HistogramRecordConfiguration getHistogramRecordConfiguration();
}
