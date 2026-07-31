package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.storage.DivStorageComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivStorageModule {

    @NotNull
    public static final DivStorageModule INSTANCE = new DivStorageModule();

    private DivStorageModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivParsingHistogramReporter provideDivStorageComponent$lambda$0(DivParsingHistogramReporter parsingHistogramReporter) {
        Intrinsics.checkNotNullParameter(parsingHistogramReporter, "$parsingHistogramReporter");
        return parsingHistogramReporter;
    }

    @NotNull
    public final DivStorageComponent provideDivStorageComponent(@NotNull ExternalOptional<DivStorageComponent> externalDivStorageComponent, @NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @NotNull final DivParsingHistogramReporter parsingHistogramReporter) {
        Intrinsics.checkNotNullParameter(externalDivStorageComponent, "externalDivStorageComponent");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        Intrinsics.checkNotNullParameter(parsingHistogramReporter, "parsingHistogramReporter");
        return externalDivStorageComponent.getOptional().c() ? (DivStorageComponent) externalDivStorageComponent.getOptional().b() : DivStorageComponent.Companion.create$default(DivStorageComponent.Companion, context, histogramReporterDelegate, null, null, null, new V1.a() { // from class: com.yandex.div.core.dagger.c
            @Override // V1.a
            public final Object get() {
                DivParsingHistogramReporter provideDivStorageComponent$lambda$0;
                provideDivStorageComponent$lambda$0 = DivStorageModule.provideDivStorageComponent$lambda$0(DivParsingHistogramReporter.this);
                return provideDivStorageComponent$lambda$0;
            }
        }, null, 92, null);
    }
}
