package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.l1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class q1 {
    /* renamed from: Job, reason: collision with other method in class */
    public static final z m1297Job(l1 l1Var) {
        return new n1(l1Var);
    }

    /* renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ z m1298Job$default(l1 l1Var, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l1Var = null;
        }
        return o1.m1295Job(l1Var);
    }

    public static final void cancel(CoroutineContext coroutineContext, CancellationException cancellationException) {
        l1 l1Var = (l1) coroutineContext.get(l1.Key);
        if (l1Var != null) {
            l1Var.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancel$default(CoroutineContext coroutineContext, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        o1.cancel(coroutineContext, cancellationException);
    }

    public static final Object cancelAndJoin(l1 l1Var, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        l1.a.cancel$default(l1Var, (CancellationException) null, 1, (Object) null);
        Object join = l1Var.join(cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return join == coroutine_suspended ? join : y5.w.INSTANCE;
    }

    public static final void cancelChildren(l1 l1Var, CancellationException cancellationException) {
        Iterator<Object> it = l1Var.getChildren().iterator();
        while (it.hasNext()) {
            ((l1) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(l1 l1Var, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        o1.cancelChildren(l1Var, cancellationException);
    }

    public static final u0 disposeOnCompletion(l1 l1Var, u0 u0Var) {
        return l1Var.invokeOnCompletion(new w0(u0Var));
    }

    public static final void ensureActive(l1 l1Var) {
        if (!l1Var.isActive()) {
            throw l1Var.getCancellationException();
        }
    }

    public static final l1 getJob(CoroutineContext coroutineContext) {
        l1 l1Var = (l1) coroutineContext.get(l1.Key);
        if (l1Var != null) {
            return l1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final boolean isActive(CoroutineContext coroutineContext) {
        l1 l1Var = (l1) coroutineContext.get(l1.Key);
        if (l1Var != null) {
            return l1Var.isActive();
        }
        return true;
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable th, l1 l1Var) {
        return th == null ? new JobCancellationException("Job was cancelled", null, l1Var) : th;
    }

    public static final /* synthetic */ l1 Job(l1 l1Var) {
        return o1.m1295Job(l1Var);
    }

    public static /* synthetic */ l1 Job$default(l1 l1Var, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            l1Var = null;
        }
        return Job(l1Var);
    }

    public static /* synthetic */ void cancel$default(l1 l1Var, String str, Throwable th, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            th = null;
        }
        o1.cancel(l1Var, str, th);
    }

    public static /* synthetic */ void cancelChildren$default(l1 l1Var, Throwable th, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        cancelChildren(l1Var, th);
    }

    public static final void ensureActive(CoroutineContext coroutineContext) {
        l1 l1Var = (l1) coroutineContext.get(l1.Key);
        if (l1Var != null) {
            o1.ensureActive(l1Var);
        }
    }

    public static final void cancel(l1 l1Var, String str, Throwable th) {
        l1Var.cancel(d1.CancellationException(str, th));
    }

    public static /* synthetic */ boolean cancel$default(CoroutineContext coroutineContext, Throwable th, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        return cancel(coroutineContext, th);
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext coroutineContext, CancellationException cancellationException, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cancellationException = null;
        }
        o1.cancelChildren(coroutineContext, cancellationException);
    }

    public static final /* synthetic */ boolean cancel(CoroutineContext coroutineContext, Throwable th) {
        CoroutineContext.a aVar = coroutineContext.get(l1.Key);
        JobSupport jobSupport = aVar instanceof JobSupport ? (JobSupport) aVar : null;
        if (jobSupport == null) {
            return false;
        }
        jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, jobSupport));
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext coroutineContext, Throwable th, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        cancelChildren(coroutineContext, th);
    }

    public static final /* synthetic */ void cancelChildren(l1 l1Var, Throwable th) {
        for (l1 l1Var2 : l1Var.getChildren()) {
            JobSupport jobSupport = l1Var2 instanceof JobSupport ? (JobSupport) l1Var2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, l1Var));
            }
        }
    }

    public static final void cancelChildren(CoroutineContext coroutineContext, CancellationException cancellationException) {
        kotlin.sequences.m children;
        l1 l1Var = (l1) coroutineContext.get(l1.Key);
        if (l1Var == null || (children = l1Var.getChildren()) == null) {
            return;
        }
        Iterator<Object> it = children.iterator();
        while (it.hasNext()) {
            ((l1) it.next()).cancel(cancellationException);
        }
    }

    public static final /* synthetic */ void cancelChildren(CoroutineContext coroutineContext, Throwable th) {
        l1 l1Var = (l1) coroutineContext.get(l1.Key);
        if (l1Var == null) {
            return;
        }
        for (l1 l1Var2 : l1Var.getChildren()) {
            JobSupport jobSupport = l1Var2 instanceof JobSupport ? (JobSupport) l1Var2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(orCancellation$JobKt__JobKt(th, l1Var));
            }
        }
    }
}
