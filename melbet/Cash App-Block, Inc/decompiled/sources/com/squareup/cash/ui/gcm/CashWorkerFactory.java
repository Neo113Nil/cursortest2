package com.squareup.cash.ui.gcm;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import app.cash.badging.backend.BadgeClearingWorker;
import app.cash.cdp.backend.android.BatchUploadWorker;
import com.squareup.cash.CashApp;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.real.OfflineWorker;
import com.squareup.util.workmanager.SandboxedCoroutineWorker;
import com.squareup.util.workmanager.SandboxedWork;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class CashWorkerFactory extends WorkerFactory {
    public final SandboxedCashWorkerFactoryProvider provider;

    public CashWorkerFactory(SandboxedCashWorkerFactoryProvider sandboxedCashWorkerFactoryProvider) {
        this.provider = sandboxedCashWorkerFactoryProvider;
    }

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker createWorker(Context context, String str, WorkerParameters workerParameters) {
        SandboxedCashWorkerFactory onCreate$lambda$1;
        SandboxedWork sandboxedWork;
        context.getClass();
        str.getClass();
        onCreate$lambda$1 = CashApp.onCreate$lambda$1((CashApp) ((OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) this.provider).f$0);
        onCreate$lambda$1.getClass();
        if (!str.equals(SandboxedCoroutineWorker.class.getName())) {
            return null;
        }
        String string2 = workerParameters.mInputData.getString("SANDBOXED_WORK_FQCN");
        if (Intrinsics.areEqual(string2, BadgeClearingWorker.class.getName())) {
            sandboxedWork = onCreate$lambda$1.badgeClearingWorker;
        } else if (Intrinsics.areEqual(string2, NotificationWorker.class.getName())) {
            sandboxedWork = onCreate$lambda$1.notificationWorker;
        } else if (Intrinsics.areEqual(string2, BatchUploadWorker.class.getName())) {
            sandboxedWork = onCreate$lambda$1.batchUploadWorker;
        } else if (Intrinsics.areEqual(string2, OfflineWorker.class.getName())) {
            sandboxedWork = onCreate$lambda$1.offlineWorker;
        } else {
            onCreate$lambda$1.errorReporter.report(new UnknownSandboxWorkerError(string2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            sandboxedWork = null;
        }
        if (sandboxedWork == null) {
            return null;
        }
        OkHttpCall.AnonymousClass1 anonymousClass1 = onCreate$lambda$1.coroutineWorkerFactory;
        Context context2 = (Context) anonymousClass1.this$0;
        context2.getClass();
        return new SandboxedCoroutineWorker(context2, workerParameters, (CoroutineScope) anonymousClass1.val$callback, sandboxedWork);
    }
}
