package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes15.dex */
public abstract class WorkManager {

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    public abstract Operation cancelAllWorkByTag(String str);

    public abstract Operation enqueue(List list);

    public abstract ListenableFuture getWorkInfoById(UUID uuid);

    public static WorkManager getInstance(Context context) {
        return WorkManagerImpl.getInstance(context);
    }

    public static void initialize(Context context, Configuration configuration) {
        WorkManagerImpl.initialize(context, configuration);
    }

    public final Operation enqueue(WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    protected WorkManager() {
    }
}
