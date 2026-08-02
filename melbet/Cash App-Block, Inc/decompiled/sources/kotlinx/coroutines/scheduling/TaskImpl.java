package kotlinx.coroutines.scheduling;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class TaskImpl extends Task {
    public final Runnable block;

    public TaskImpl(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.block.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.block;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(JobKt.getHexAddress(runnable));
        sb.append(", ");
        sb.append(this.submissionTime);
        sb.append(", ");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.taskContext ? "Blocking" : "Non-blocking", ']');
    }
}
