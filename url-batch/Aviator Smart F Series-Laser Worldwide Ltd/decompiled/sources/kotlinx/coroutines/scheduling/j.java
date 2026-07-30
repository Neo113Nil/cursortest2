package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.k0;

/* loaded from: classes5.dex */
public final class j extends g {
    public final Runnable block;

    public j(Runnable runnable, long j8, h hVar) {
        super(j8, hVar);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.afterTask();
        }
    }

    public String toString() {
        return "Task[" + k0.getClassSimpleName(this.block) + '@' + k0.getHexAddress(this.block) + ", " + this.submissionTime + ", " + this.taskContext + ']';
    }
}
