package androidx.work;

import a4.j;
import android.content.Context;
import androidx.lifecycle.d0;
import com.google.common.util.concurrent.ListenableFuture;
import d6.l;
import e6.a;
import f8.j0;
import ge.a0;
import ge.e1;
import ge.h;
import ge.k0;
import ge.k1;
import ge.o;
import ge.t;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import le.d;
import md.f;
import t5.g;
import t5.i;
import t5.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\u00020$8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u0019\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lt5/n;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lt5/m;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Lt5/g;", "getForegroundInfo", "(Lld/a;)Ljava/lang/Object;", "Lt5/e;", "data", "", "setProgress", "(Lt5/e;Lld/a;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lt5/g;Lld/a;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Lge/o;", "job", "Lge/o;", "getJob$work_runtime_ktx_release", "()Lge/o;", "Le6/j;", "future", "Le6/j;", "getFuture$work_runtime_ktx_release", "()Le6/j;", "Lge/t;", "coroutineContext", "Lge/t;", "getCoroutineContext", "()Lge/t;", "getCoroutineContext$annotations", "work-runtime-ktx_release"}, k = 1, mv = {1, j.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends n {
    private final t coroutineContext;
    private final e6.j future;
    private final o job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.job = a0.c();
        e6.j jVar = new e6.j();
        this.future = jVar;
        jVar.a(new d0(18, this), (l) ((a1.n) getTaskExecutor()).f41i);
        this.coroutineContext = k0.f4372a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f3948d instanceof a) {
            ((k1) coroutineWorker.job).a(null);
        }
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, ld.a aVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(ld.a aVar);

    public t getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(ld.a aVar) {
        return getForegroundInfo$suspendImpl(this, aVar);
    }

    @Override // t5.n
    public final ListenableFuture getForegroundInfoAsync() {
        e1 c10 = a0.c();
        t coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        d b10 = a0.b(e.c(coroutineContext, c10));
        i iVar = new i(c10);
        a0.s(b10, null, new b5.t(iVar, this, null, 9), 3);
        return iVar;
    }

    /* renamed from: getFuture$work_runtime_ktx_release, reason: from getter */
    public final e6.j getFuture() {
        return this.future;
    }

    /* renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final o getJob() {
        return this.job;
    }

    @Override // t5.n
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(g gVar, ld.a aVar) {
        ListenableFuture foregroundAsync = setForegroundAsync(gVar);
        foregroundAsync.getClass();
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } else {
            h hVar = new h(1, f.b(aVar));
            hVar.s();
            foregroundAsync.a(new j0(29, hVar, foregroundAsync, false), t5.f.f9303d);
            hVar.u(new a3.e(22, foregroundAsync));
            Object r9 = hVar.r();
            if (r9 == md.a.f6622d) {
                return r9;
            }
        }
        return Unit.f5554a;
    }

    public final Object setProgress(t5.e eVar, ld.a aVar) {
        ListenableFuture progressAsync = setProgressAsync(eVar);
        progressAsync.getClass();
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } else {
            h hVar = new h(1, f.b(aVar));
            hVar.s();
            progressAsync.a(new j0(29, hVar, progressAsync, false), t5.f.f9303d);
            hVar.u(new a3.e(22, progressAsync));
            Object r9 = hVar.r();
            if (r9 == md.a.f6622d) {
                return r9;
            }
        }
        return Unit.f5554a;
    }

    @Override // t5.n
    public final ListenableFuture startWork() {
        t coroutineContext = getCoroutineContext();
        o oVar = this.job;
        coroutineContext.getClass();
        a0.s(a0.b(e.c(coroutineContext, oVar)), null, new b5.d0(this, null, 7), 3);
        return this.future;
    }

    @hd.a
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
