package com.squareup.cash.ui.gcm;

import app.cash.badging.backend.BadgeClearingWorker;
import app.cash.cdp.backend.android.BatchUploadWorker;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.real.OfflineWorker;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class SandboxedCashWorkerFactory {
    public final BadgeClearingWorker badgeClearingWorker;
    public final BatchUploadWorker batchUploadWorker;
    public final OkHttpCall.AnonymousClass1 coroutineWorkerFactory;
    public final ErrorReporter errorReporter;
    public final NotificationWorker notificationWorker;
    public final OfflineWorker offlineWorker;

    public SandboxedCashWorkerFactory(BadgeClearingWorker badgeClearingWorker, NotificationWorker notificationWorker, BatchUploadWorker batchUploadWorker, OfflineWorker offlineWorker, OkHttpCall.AnonymousClass1 anonymousClass1, ErrorReporter errorReporter) {
        errorReporter.getClass();
        this.badgeClearingWorker = badgeClearingWorker;
        this.notificationWorker = notificationWorker;
        this.batchUploadWorker = batchUploadWorker;
        this.offlineWorker = offlineWorker;
        this.coroutineWorkerFactory = anonymousClass1;
        this.errorReporter = errorReporter;
    }
}
