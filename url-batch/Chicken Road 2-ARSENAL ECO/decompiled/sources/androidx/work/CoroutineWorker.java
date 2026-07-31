package androidx.work;

import A.a;
import B0.c;
import H1.RunnableC0139m;
import H5.AbstractC0161v;
import H5.AbstractC0165z;
import H5.C0147g;
import H5.F;
import H5.InterfaceC0154n;
import H5.a0;
import H5.g0;
import J5.o;
import M5.e;
import a1.AbstractC0223a;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import k5.v;
import kotlin.jvm.internal.i;
import l0.f;
import l0.g;
import l0.h;
import l0.p;
import l1.InterfaceFutureC0490a;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import v0.k;
import w0.C0709a;
import w0.j;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends p {
    private final AbstractC0161v coroutineContext;
    private final j future;
    private final InterfaceC0154n job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        i.e(appContext, "appContext");
        i.e(params, "params");
        this.job = new a0();
        j jVar = new j();
        this.future = jVar;
        jVar.a(new RunnableC0139m(15, this), (k) ((c) getTaskExecutor()).f72h);
        this.coroutineContext = F.f1027a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f6173f instanceof C0709a) {
            ((g0) coroutineWorker.job).d(null);
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC0564d interfaceC0564d) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC0564d interfaceC0564d);

    public AbstractC0161v getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC0564d interfaceC0564d) {
        return getForegroundInfo$suspendImpl(this, interfaceC0564d);
    }

    @Override // l0.p
    public final InterfaceFutureC0490a getForegroundInfoAsync() {
        a0 a0Var = new a0();
        AbstractC0161v coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        e b7 = AbstractC0165z.b(AbstractC0223a.D(coroutineContext, a0Var));
        l0.k kVar = new l0.k(a0Var);
        AbstractC0165z.l(b7, null, new l0.e(kVar, this, null), 3);
        return kVar;
    }

    public final j getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC0154n getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // l0.p
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(l0.i iVar, InterfaceC0564d interfaceC0564d) {
        InterfaceFutureC0490a foregroundAsync = setForegroundAsync(iVar);
        i.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        } else {
            C0147g c0147g = new C0147g(1, AbstractC0676f.m(interfaceC0564d));
            c0147g.r();
            foregroundAsync.a(new a(c0147g, 20, foregroundAsync), h.f5272f);
            c0147g.t(new o(5, foregroundAsync));
            Object q6 = c0147g.q();
            if (q6 == EnumC0580a.f5697f) {
                return q6;
            }
        }
        return v.f5219a;
    }

    public final Object setProgress(g gVar, InterfaceC0564d interfaceC0564d) {
        InterfaceFutureC0490a progressAsync = setProgressAsync(gVar);
        i.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause == null) {
                    throw e4;
                }
                throw cause;
            }
        } else {
            C0147g c0147g = new C0147g(1, AbstractC0676f.m(interfaceC0564d));
            c0147g.r();
            progressAsync.a(new a(c0147g, 20, progressAsync), h.f5272f);
            c0147g.t(new o(5, progressAsync));
            Object q6 = c0147g.q();
            if (q6 == EnumC0580a.f5697f) {
                return q6;
            }
        }
        return v.f5219a;
    }

    @Override // l0.p
    public final InterfaceFutureC0490a startWork() {
        AbstractC0161v coroutineContext = getCoroutineContext();
        InterfaceC0154n interfaceC0154n = this.job;
        coroutineContext.getClass();
        AbstractC0165z.l(AbstractC0165z.b(AbstractC0223a.D(coroutineContext, interfaceC0154n)), null, new f(this, null), 3);
        return this.future;
    }
}
