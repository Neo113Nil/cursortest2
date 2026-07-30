package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rk2 implements Executor {
    public final ArrayDeque OPXfSBeufaJ8 = new ArrayDeque();
    public final Object dgRBjINgWbAK = new Object();
    public final Executor rtx2ld2ELZv4;
    public Runnable wdg6QnbFHrFF;

    public rk2(Executor executor) {
        this.rtx2ld2ELZv4 = executor;
    }

    public final void PxuCJdSBwIXG() {
        synchronized (this.dgRBjINgWbAK) {
            Object poll = this.OPXfSBeufaJ8.poll();
            Runnable runnable = (Runnable) poll;
            this.wdg6QnbFHrFF = runnable;
            if (poll != null) {
                this.rtx2ld2ELZv4.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.dgRBjINgWbAK) {
            this.OPXfSBeufaJ8.offer(new l2(2, runnable, this));
            if (this.wdg6QnbFHrFF == null) {
                PxuCJdSBwIXG();
            }
        }
    }
}
