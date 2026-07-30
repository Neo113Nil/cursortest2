package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w21 implements Executor {
    public final /* synthetic */ int d;
    public final Object e;

    public w21() {
        this.d = 2;
        gt1 gt1Var = new gt1(Looper.getMainLooper());
        Looper.getMainLooper();
        this.e = gt1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Handler handler = (Handler) obj;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                ((Executor) obj).execute(new m51(runnable, 0));
                return;
            default:
                ((gt1) obj).post(runnable);
                return;
        }
    }

    public /* synthetic */ w21(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
