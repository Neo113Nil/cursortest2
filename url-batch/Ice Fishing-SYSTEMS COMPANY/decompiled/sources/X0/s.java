package X0;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import f1.C4491b;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3715n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f3716u;

    public /* synthetic */ s(v vVar, int i) {
        this.f3715n = i;
        this.f3716u = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3715n) {
            case 0:
                Drawable drawable = this.f3716u;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                v vVar = this.f3716u;
                Semaphore semaphore = vVar.f3752s0;
                C4491b c4491b = vVar.f3729H;
                if (c4491b == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c4491b.r(vVar.f3754u.h());
                    if (v.f3720y0 && vVar.f3750q0) {
                        if (vVar.f3753t0 == null) {
                            vVar.f3753t0 = new Handler(Looper.getMainLooper());
                            vVar.f3755u0 = new s(vVar, 0);
                        }
                        vVar.f3753t0.post(vVar.f3755u0);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
        }
    }
}
