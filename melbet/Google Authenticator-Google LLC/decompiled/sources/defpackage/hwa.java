package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwa extends hun {
    public hvi a;
    public ScheduledFuture b;

    public hwa(hvi hviVar) {
        hviVar.getClass();
        this.a = hviVar;
    }

    @Override // defpackage.hsw
    protected final String a() {
        hvi hviVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (hviVar == null) {
            return null;
        }
        String aa = a.aa(hviVar, "inputFuture=[", "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return aa + ", remaining delay=[" + delay + " ms]";
            }
        }
        return aa;
    }

    @Override // defpackage.hsw
    protected final void b() {
        m(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
