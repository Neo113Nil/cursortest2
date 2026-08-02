package com.squareup.cash.treehouse.android.platform;

import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.treehouse.errorreporter.ErrorReport;
import com.squareup.cash.treehouse.errorreporter.ErrorReporterService;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes7.dex */
public final class RealErrorReporterService implements ErrorReporterService {
    public final String appName;
    public final String committedAt;
    public final ErrorReporter errorReporter;
    public final String version;

    /* loaded from: classes.dex */
    public final class Factory {
        public final ErrorReporter errorReporter;

        public Factory(ErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
        }
    }

    public RealErrorReporterService(ErrorReporter errorReporter, String str, String str2, String str3) {
        str.getClass();
        this.errorReporter = errorReporter;
        this.appName = str;
        this.version = str2;
        this.committedAt = str3;
    }

    @Override // com.squareup.cash.treehouse.errorreporter.ErrorReporterService
    public final void report(ErrorReport errorReport) {
        final TreehouseError treehouseError = new TreehouseError(this.appName, this.version, this.committedAt, errorReport);
        if (errorReport.fatal) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            MainDispatcherLoader.dispatcher.dispatch(EmptyCoroutineContext.INSTANCE, new Runnable() { // from class: com.squareup.cash.treehouse.android.platform.RealErrorReporterService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    throw TreehouseError.this;
                }
            });
        }
        this.errorReporter.report(treehouseError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }
}
