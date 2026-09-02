package D0;

import android.os.Handler;
import android.os.Looper;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f352f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f353g;

    public /* synthetic */ q(int i7, Object obj) {
        this.f352f = i7;
        this.f353g = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f352f) {
            case 0:
                ((Executor) this.f353g).execute(new p(runnable, 0));
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((c1.e) this.f353g).post(runnable);
                return;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ((Handler) ((B0.c) this.f353g).f73i).post(runnable);
                return;
            default:
                Handler handler = (Handler) this.f353g;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public q() {
        this.f352f = 1;
        c1.e eVar = new c1.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f353g = eVar;
    }
}
