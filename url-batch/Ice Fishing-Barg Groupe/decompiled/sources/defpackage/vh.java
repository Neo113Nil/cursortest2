package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vh implements wh {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final Object lS5Rgt96tfkO;

    public /* synthetic */ vh(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // defpackage.wh
    public final void PxuCJdSBwIXG(Throwable th) {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                break;
            case 1:
                ((le0) obj).OPXfSBeufaJ8(th);
                break;
            default:
                ((s00) obj).PxuCJdSBwIXG();
                break;
        }
    }

    public final String toString() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((le0) obj).getClass().getSimpleName() + '@' + zv.VhhvGxCb8gfr(this) + ']';
            default:
                return "DisposeOnCancel[" + ((s00) obj) + ']';
        }
    }
}
