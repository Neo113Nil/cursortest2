package com.mopub.common.util;

import android.os.AsyncTask;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class AsyncTasks {
    private static Executor sExecutor;

    static {
        init();
    }

    private static void init() {
        sExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
    }

    @VisibleForTesting
    public static void setExecutor(Executor executor) {
        sExecutor = executor;
    }

    public static <P> void safeExecuteOnExecutor(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        Preconditions.checkNotNull(asyncTask, "Unable to execute null AsyncTask.");
        Preconditions.checkUiThread("AsyncTask must be executed on the main thread");
        asyncTask.executeOnExecutor(sExecutor, pArr);
    }
}
