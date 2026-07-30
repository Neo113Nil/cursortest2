package androidx.work;

import D0.j;
import G0.f;
import G0.g;
import G0.h;
import G0.i;
import G0.l;
import G0.r;
import Q0.m;
import R0.a;
import R0.k;
import V5.b;
import W5.d;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0786t;
import n6.AbstractC0792z;
import n6.C0775h;
import n6.F;
import n6.InterfaceC0782o;
import n6.Z;
import n6.f0;
import s6.c;

@Metadata
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends r {
    private final AbstractC0786t coroutineContext;
    private final k future;
    private final InterfaceC0782o job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = new Z();
        k kVar = new k();
        Intrinsics.checkNotNullExpressionValue(kVar, "create()");
        this.future = kVar;
        kVar.a(new A.k(1, this), (m) ((j) getTaskExecutor()).f330e);
        this.coroutineContext = F.f7011a;
    }

    public static void a(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.f2395d instanceof a) {
            ((f0) this$0.job).d(null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, b bVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(b bVar);

    public AbstractC0786t getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(b bVar) {
        return getForegroundInfo$suspendImpl(this, bVar);
    }

    @Override // G0.r
    public final O1.a getForegroundInfoAsync() {
        Z z7 = new Z();
        AbstractC0786t coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        c b7 = AbstractC0792z.b(e.c(coroutineContext, z7));
        G0.m mVar = new G0.m(z7);
        AbstractC0792z.l(b7, null, new f(mVar, this, null), 3);
        return mVar;
    }

    public final k getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC0782o getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // G0.r
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(G0.j jVar, b frame) {
        O1.a foregroundAsync = setForegroundAsync(jVar);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e7) {
                Throwable cause = e7.getCause();
                if (cause == null) {
                    throw e7;
                }
                throw cause;
            }
        } else {
            C0775h c0775h = new C0775h(1, d.b(frame));
            c0775h.s();
            foregroundAsync.a(new F.a(c0775h, 2, foregroundAsync), i.f811d);
            c0775h.u(new l(1, foregroundAsync));
            Object r7 = c0775h.r();
            W5.a aVar = W5.a.f2787d;
            if (r7 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (r7 == aVar) {
                return r7;
            }
        }
        return Unit.f6114a;
    }

    public final Object setProgress(h hVar, b frame) {
        O1.a progressAsync = setProgressAsync(hVar);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e7) {
                Throwable cause = e7.getCause();
                if (cause == null) {
                    throw e7;
                }
                throw cause;
            }
        } else {
            C0775h c0775h = new C0775h(1, d.b(frame));
            c0775h.s();
            progressAsync.a(new F.a(c0775h, 2, progressAsync), i.f811d);
            c0775h.u(new l(1, progressAsync));
            Object r7 = c0775h.r();
            W5.a aVar = W5.a.f2787d;
            if (r7 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (r7 == aVar) {
                return r7;
            }
        }
        return Unit.f6114a;
    }

    @Override // G0.r
    public final O1.a startWork() {
        AbstractC0786t coroutineContext = getCoroutineContext();
        InterfaceC0782o interfaceC0782o = this.job;
        coroutineContext.getClass();
        AbstractC0792z.l(AbstractC0792z.b(e.c(coroutineContext, interfaceC0782o)), null, new g(this, null), 3);
        return this.future;
    }
}
