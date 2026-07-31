package com.ironsource.environment.workerthread;

import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class WorkerManager<T> {

    /* renamed from: a, reason: collision with root package name */
    List<Callable<T>> f16111a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f16112b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j4);

        void onWorkFailed(String str);
    }

    public WorkerManager(@NotNull ExecutorService executorService) {
        this.f16112b = executorService;
    }

    public void addCallable(@NotNull Callable<T> callable) {
        this.f16111a.add(callable);
    }

    public void startWork(@NotNull WorkEndedListener<T> workEndedListener, long j4, @NotNull TimeUnit timeUnit) {
        WorkerResult.Canceled canceled;
        if (this.f16112b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f16111a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> invokeAll = this.f16112b.invokeAll(this.f16111a, j4, timeUnit);
            for (int i4 = 0; i4 < invokeAll.size(); i4++) {
                Future<T> future = invokeAll.get(i4);
                if (!future.isDone() || future.isCancelled()) {
                    canceled = new WorkerResult.Canceled(this.f16111a.get(i4));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e4) {
                        e = e4;
                        o9.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f16111a.get(i4), e));
                    } catch (CancellationException e5) {
                        o9.d().a(e5);
                        canceled = new WorkerResult.Canceled(this.f16111a.get(i4));
                    } catch (ExecutionException e6) {
                        e = e6;
                        o9.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f16111a.get(i4), e));
                    }
                }
                arrayList.add(canceled);
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - currentTimeMillis);
            this.f16112b.shutdownNow();
        } catch (Exception e7) {
            o9.d().a(e7);
            IronLog.INTERNAL.error(e7.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e7.getMessage());
            this.f16112b.shutdownNow();
        }
    }
}
