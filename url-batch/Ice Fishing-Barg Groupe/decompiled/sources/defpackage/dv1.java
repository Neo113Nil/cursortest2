package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dv1 implements Executor {
    public final Handler OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 1;

    public dv1() {
        sw2 sw2Var = new sw2(Looper.getMainLooper());
        Looper.getMainLooper();
        this.OPXfSBeufaJ8 = sw2Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.rtx2ld2ELZv4;
        Handler handler = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((sw2) handler).post(runnable);
                return;
        }
    }

    public dv1(Handler handler) {
        this.OPXfSBeufaJ8 = handler;
    }
}
