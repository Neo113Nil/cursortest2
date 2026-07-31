package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

@RestrictTo
/* loaded from: classes10.dex */
public abstract class StatusRunnable<T> implements Runnable {
    private final SettableFuture mFuture = SettableFuture.create();

    abstract Object runInternal();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.mFuture.set(runInternal());
        } catch (Throwable th) {
            this.mFuture.setException(th);
        }
    }

    public ListenableFuture getFuture() {
        return this.mFuture;
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$1, reason: invalid class name */
    class AnonymousClass1 extends StatusRunnable<List<WorkInfo>> {
        final /* synthetic */ List val$ids;
        final /* synthetic */ WorkManagerImpl val$workManager;

        @Override // androidx.work.impl.utils.StatusRunnable
        public List runInternal() {
            return (List) WorkSpec.WORK_INFO_MAPPER.apply(this.val$workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(this.val$ids));
        }
    }

    public static StatusRunnable forUUID(final WorkManagerImpl workManagerImpl, final UUID uuid) {
        return new StatusRunnable<WorkInfo>() { // from class: androidx.work.impl.utils.StatusRunnable.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.work.impl.utils.StatusRunnable
            public WorkInfo runInternal() {
                WorkSpec.WorkInfoPojo workStatusPojoForId = WorkManagerImpl.this.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(uuid.toString());
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            }
        };
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$3, reason: invalid class name */
    class AnonymousClass3 extends StatusRunnable<List<WorkInfo>> {
        final /* synthetic */ String val$tag;
        final /* synthetic */ WorkManagerImpl val$workManager;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.StatusRunnable
        public List runInternal() {
            return (List) WorkSpec.WORK_INFO_MAPPER.apply(this.val$workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(this.val$tag));
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$4, reason: invalid class name */
    /* loaded from: classes11.dex */
    class AnonymousClass4 extends StatusRunnable<List<WorkInfo>> {
        final /* synthetic */ String val$name;
        final /* synthetic */ WorkManagerImpl val$workManager;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.StatusRunnable
        public List runInternal() {
            return (List) WorkSpec.WORK_INFO_MAPPER.apply(this.val$workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(this.val$name));
        }
    }

    /* renamed from: androidx.work.impl.utils.StatusRunnable$5, reason: invalid class name */
    /* loaded from: classes11.dex */
    class AnonymousClass5 extends StatusRunnable<List<WorkInfo>> {
        final /* synthetic */ WorkQuery val$querySpec;
        final /* synthetic */ WorkManagerImpl val$workManager;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.impl.utils.StatusRunnable
        public List runInternal() {
            return (List) WorkSpec.WORK_INFO_MAPPER.apply(this.val$workManager.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(this.val$querySpec)));
        }
    }
}
