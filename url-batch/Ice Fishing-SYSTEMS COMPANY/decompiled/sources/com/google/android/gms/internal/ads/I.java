package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class I implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25496n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25497u;

    public /* synthetic */ I(int i, Object obj) {
        this.f25496n = i;
        this.f25497u = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f25496n) {
            case 0:
                ((ExecutorService) this.f25497u).execute(runnable);
                return;
            case 1:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((t2.D) this.f25497u).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    t2.G g9 = p2.j.f39798C.f39803c;
                    Context context = p2.j.f39798C.f39808h.f29016e;
                    if (context != null) {
                        try {
                            if (((Boolean) AbstractC2802Ua.f28036b.r()).booleanValue()) {
                                S2.b.a(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
            default:
                ((C3709ot) this.f25497u).e(runnable);
                return;
        }
    }

    public I() {
        this.f25496n = 1;
        this.f25497u = new t2.D(Looper.getMainLooper(), 3);
    }
}
