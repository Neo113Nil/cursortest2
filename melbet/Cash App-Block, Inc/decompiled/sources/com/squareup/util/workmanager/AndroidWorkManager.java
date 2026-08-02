package com.squareup.util.workmanager;

import android.app.Application;
import androidx.core.os.BundleKt;
import androidx.room.TransactionExecutor;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.SystemClock;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import kotlin.Lazy;
import kotlin.LazyKt;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class AndroidWorkManager {
    public final Application context;
    public final Lazy workManager$delegate = LazyKt.lazy(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 9));

    public AndroidWorkManager(Application application) {
        this.context = application;
    }

    public final void cancelUniqueWork(String str) {
        if (WorkManagerImpl.getInstance() != null) {
            WorkManagerImpl workManagerImpl = (WorkManagerImpl) ((WorkManager) this.workManager$delegate.getValue());
            workManagerImpl.getClass();
            SystemClock systemClock = workManagerImpl.mConfiguration.tracer;
            String concat = "CancelWorkByName_".concat(str);
            TransactionExecutor transactionExecutor = ((WorkManagerTaskExecutor) workManagerImpl.mWorkTaskExecutor).mBackgroundExecutor;
            transactionExecutor.getClass();
            BundleKt.launchOperation(systemClock, concat, transactionExecutor, new ComponentRegistry$Builder$$ExternalSyntheticLambda3(11, str, workManagerImpl));
        }
    }

    public final void enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest oneTimeWorkRequest) {
        if (WorkManagerImpl.getInstance() != null) {
            ((WorkManager) this.workManager$delegate.getValue()).enqueueUniqueWork(str, existingWorkPolicy, oneTimeWorkRequest);
        }
    }
}
