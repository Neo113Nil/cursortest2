package com.yandex.div.core.dagger;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.DivParsingHistogramReporterImpl;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.util.DoubleCheckProvider;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivKitHistogramsModule {

    @NotNull
    public static final DivKitHistogramsModule INSTANCE = new DivKitHistogramsModule();

    private DivKitHistogramsModule() {
    }

    private final V1.a provideCalculateSizeExecutor(HistogramConfiguration histogramConfiguration, V1.a aVar) {
        if (!histogramConfiguration.isSizeRecordingEnabled()) {
            return new V1.a() { // from class: com.yandex.div.core.dagger.a
                @Override // V1.a
                public final Object get() {
                    Executor provideCalculateSizeExecutor$lambda$1;
                    provideCalculateSizeExecutor$lambda$1 = DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1();
                    return provideCalculateSizeExecutor$lambda$1;
                }
            };
        }
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type javax.inject.Provider<java.util.concurrent.Executor>");
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor provideCalculateSizeExecutor$lambda$1() {
        return new Executor() { // from class: com.yandex.div.core.dagger.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                DivKitHistogramsModule.provideCalculateSizeExecutor$lambda$1$lambda$0(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void provideCalculateSizeExecutor$lambda$1$lambda$0(Runnable runnable) {
    }

    private final V1.a provideHistogramReporter(HistogramReporterDelegate histogramReporterDelegate) {
        return new DoubleCheckProvider(new DivKitHistogramsModule$provideHistogramReporter$1(histogramReporterDelegate));
    }

    @NotNull
    public final DivParsingHistogramReporter provideDivParsingHistogramReporter(@NotNull HistogramConfiguration histogramConfiguration, @NotNull V1.a histogramReporterDelegate, @NotNull V1.a executorService) {
        Intrinsics.checkNotNullParameter(histogramConfiguration, "histogramConfiguration");
        Intrinsics.checkNotNullParameter(histogramReporterDelegate, "histogramReporterDelegate");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        if (!histogramConfiguration.isReportingEnabled()) {
            return DivParsingHistogramReporter.Companion.getDEFAULT();
        }
        V1.a provideCalculateSizeExecutor = provideCalculateSizeExecutor(histogramConfiguration, executorService);
        Object obj = histogramReporterDelegate.get();
        Intrinsics.checkNotNullExpressionValue(obj, "histogramReporterDelegate.get()");
        return new DivParsingHistogramReporterImpl(new DivKitHistogramsModule$provideDivParsingHistogramReporter$1(provideHistogramReporter((HistogramReporterDelegate) obj)), new DivKitHistogramsModule$provideDivParsingHistogramReporter$2(provideCalculateSizeExecutor));
    }

    @NotNull
    public final HistogramReporterDelegate provideHistogramReporterDelegate(@NotNull HistogramConfiguration histogramConfiguration, @NotNull V1.a histogramRecorderProvider, @NotNull V1.a histogramColdTypeCheckerProvider) {
        Intrinsics.checkNotNullParameter(histogramConfiguration, "histogramConfiguration");
        Intrinsics.checkNotNullParameter(histogramRecorderProvider, "histogramRecorderProvider");
        Intrinsics.checkNotNullParameter(histogramColdTypeCheckerProvider, "histogramColdTypeCheckerProvider");
        return histogramConfiguration.isReportingEnabled() ? DivHistogramsModuleKt.createHistogramReporterDelegate(histogramConfiguration, histogramRecorderProvider, histogramColdTypeCheckerProvider) : HistogramReporterDelegate.NoOp.INSTANCE;
    }
}
