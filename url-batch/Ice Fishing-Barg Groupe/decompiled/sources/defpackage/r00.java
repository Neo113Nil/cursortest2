package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r00 implements s00 {
    public final ScheduledFuture rtx2ld2ELZv4;

    public r00(ScheduledFuture scheduledFuture) {
        this.rtx2ld2ELZv4 = scheduledFuture;
    }

    @Override // defpackage.s00
    public final void PxuCJdSBwIXG() {
        this.rtx2ld2ELZv4.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.rtx2ld2ELZv4 + ']';
    }
}
