package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;

/* loaded from: classes3.dex */
public interface SchedulerMultiWorkerSupport {

    public interface WorkerCallback {
        void onWorker(int i8, @NonNull Scheduler.Worker worker);
    }

    void createWorkers(int i8, @NonNull WorkerCallback workerCallback);
}
