package com.yandex.div.storage;

import V1.a;
import android.content.Context;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.LazyProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivStorageComponent {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ DivStorageComponent create$default(Companion companion, Context context, HistogramReporterDelegate histogramReporterDelegate, HistogramNameProvider histogramNameProvider, ParsingErrorLogger parsingErrorLogger, a aVar, a aVar2, String str, int i4, Object obj) {
            ParsingErrorLogger LOG;
            HistogramReporterDelegate histogramReporterDelegate2 = (i4 & 2) != 0 ? HistogramReporterDelegate.NoOp.INSTANCE : histogramReporterDelegate;
            HistogramNameProvider histogramNameProvider2 = (i4 & 4) != 0 ? null : histogramNameProvider;
            if ((i4 & 8) != 0) {
                LOG = ParsingErrorLogger.LOG;
                Intrinsics.checkNotNullExpressionValue(LOG, "LOG");
            } else {
                LOG = parsingErrorLogger;
            }
            return companion.create(context, histogramReporterDelegate2, histogramNameProvider2, LOG, (i4 & 16) == 0 ? aVar : null, (i4 & 32) != 0 ? new LazyProvider(DivStorageComponent$Companion$create$1.INSTANCE) : aVar2, (i4 & 64) != 0 ? "" : str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatabaseOpenHelper createInternal$lambda$0(Context c4, String name, int i4, DatabaseOpenHelper.CreateCallback ccb, DatabaseOpenHelper.UpgradeCallback ucb) {
            Intrinsics.checkNotNullParameter(c4, "c");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(ccb, "ccb");
            Intrinsics.checkNotNullParameter(ucb, "ucb");
            return new AndroidDatabaseOpenHelper(c4, name, i4, ccb, ucb);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable a aVar, @NotNull a parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
            Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
            Intrinsics.checkNotNullParameter(parsingHistogramReporter, "parsingHistogramReporter");
            Intrinsics.checkNotNullParameter(databaseNamePrefix, "databaseNamePrefix");
            return createInternal$div_storage_release(context, histogramReporter, histogramNameProvider, errorLogger, aVar, parsingHistogramReporter, databaseNamePrefix);
        }

        @NotNull
        public final InternalStorageComponent createInternal$div_storage_release(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporter, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger errorLogger, @Nullable a aVar, @NotNull a parsingHistogramReporter, @NotNull String databaseNamePrefix) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
            Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
            Intrinsics.checkNotNullParameter(parsingHistogramReporter, "parsingHistogramReporter");
            Intrinsics.checkNotNullParameter(databaseNamePrefix, "databaseNamePrefix");
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new DatabaseOpenHelperProvider() { // from class: M1.a
                @Override // com.yandex.div.storage.database.DatabaseOpenHelperProvider
                public final DatabaseOpenHelper provide(Context context2, String str, int i4, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
                    DatabaseOpenHelper createInternal$lambda$0;
                    createInternal$lambda$0 = DivStorageComponent.Companion.createInternal$lambda$0(context2, str, i4, createCallback, upgradeCallback);
                    return createInternal$lambda$0;
                }
            }, databaseNamePrefix);
            LazyProvider lazyProvider = new LazyProvider(new DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1(parsingHistogramReporter));
            HistogramRecorder histogramRecorder = new HistogramRecorder(histogramReporter, histogramNameProvider);
            TemplatesContainer templatesContainer = new TemplatesContainer(divStorageImpl, errorLogger, histogramRecorder, lazyProvider, histogramNameProvider);
            return new InternalStorageComponent(new DivDataRepositoryImpl(divStorageImpl, templatesContainer, histogramRecorder, histogramNameProvider, lazyProvider, new CardErrorLoggerFactory(aVar, templatesContainer, errorLogger)), new RawJsonRepositoryImpl(divStorageImpl), divStorageImpl);
        }
    }

    @NotNull
    RawJsonRepository getRawJsonRepository();
}
