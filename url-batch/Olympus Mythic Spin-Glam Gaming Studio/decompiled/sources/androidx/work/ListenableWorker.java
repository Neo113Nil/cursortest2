package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    public void onStopped() {
    }

    public abstract ListenableFuture startWork();

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.getId();
    }

    @NonNull
    public final Data getInputData() {
        return this.mWorkerParams.getInputData();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.getTags();
    }

    @NonNull
    @RequiresApi
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.getTriggeredContentUris();
    }

    @NonNull
    @RequiresApi
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.getTriggeredContentAuthorities();
    }

    @Nullable
    @RequiresApi
    public final Network getNetwork() {
        return this.mWorkerParams.getNetwork();
    }

    @IntRange
    public final int getRunAttemptCount() {
        return this.mWorkerParams.getRunAttemptCount();
    }

    @NonNull
    public ListenableFuture setProgressAsync(@NonNull Data data) {
        return this.mWorkerParams.getProgressUpdater().updateProgress(getApplicationContext(), getId(), data);
    }

    @NonNull
    public final ListenableFuture setForegroundAsync(@NonNull ForegroundInfo foregroundInfo) {
        return this.mWorkerParams.getForegroundUpdater().setForegroundAsync(getApplicationContext(), getId(), foregroundInfo);
    }

    public ListenableFuture getForegroundInfoAsync() {
        SettableFuture create = SettableFuture.create();
        create.setException(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return create;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    @RestrictTo
    public final boolean isUsed() {
        return this.mUsed;
    }

    @RestrictTo
    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    @RestrictTo
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.getBackgroundExecutor();
    }

    @NonNull
    @RestrictTo
    public TaskExecutor getTaskExecutor() {
        return this.mWorkerParams.getTaskExecutor();
    }

    @NonNull
    @RestrictTo
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.getWorkerFactory();
    }

    public static abstract class Result {
        public static Result success() {
            return new Success();
        }

        public static Result success(Data data) {
            return new Success(data);
        }

        public static Result retry() {
            return new Retry();
        }

        public static Result failure() {
            return new Failure();
        }

        Result() {
        }

        @RestrictTo
        public static final class Success extends Result {
            private final Data mOutputData;

            public Success() {
                this(Data.EMPTY);
            }

            public Success(Data data) {
                this.mOutputData = data;
            }

            public Data getOutputData() {
                return this.mOutputData;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Success.class != obj.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((Success) obj).mOutputData);
            }

            public int hashCode() {
                return (Success.class.getName().hashCode() * 31) + this.mOutputData.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.mOutputData + '}';
            }
        }

        @RestrictTo
        public static final class Failure extends Result {
            private final Data mOutputData;

            public Failure() {
                this(Data.EMPTY);
            }

            public Failure(Data data) {
                this.mOutputData = data;
            }

            public Data getOutputData() {
                return this.mOutputData;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || Failure.class != obj.getClass()) {
                    return false;
                }
                return this.mOutputData.equals(((Failure) obj).mOutputData);
            }

            public int hashCode() {
                return (Failure.class.getName().hashCode() * 31) + this.mOutputData.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.mOutputData + '}';
            }
        }

        @RestrictTo
        public static final class Retry extends Result {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && Retry.class == obj.getClass();
            }

            public int hashCode() {
                return Retry.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }
    }
}
