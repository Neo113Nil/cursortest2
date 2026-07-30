package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e92 implements Executor {
    public final /* synthetic */ int m;
    public final Object n;

    public e92() {
        this.m = 3;
        bb3 bb3Var = new bb3(Looper.getMainLooper());
        Looper.getMainLooper();
        this.n = bb3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Executor) obj).execute(new ed2(runnable, 0));
                return;
            case 2:
                lj3 lj3Var = ((pj3) ((jm3) obj).m).s;
                pj3.m(lj3Var);
                lj3Var.F(runnable);
                return;
            default:
                ((bb3) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ e92(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }
}
