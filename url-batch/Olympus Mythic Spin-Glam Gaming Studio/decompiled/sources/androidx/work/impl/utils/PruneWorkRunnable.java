package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo
/* loaded from: classes4.dex */
public class PruneWorkRunnable implements Runnable {
    private final OperationImpl mOperation;
    private final WorkManagerImpl mWorkManagerImpl;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.mWorkManagerImpl.getWorkDatabase().workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
            this.mOperation.markState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.markState(new Operation.State.FAILURE(th));
        }
    }
}
