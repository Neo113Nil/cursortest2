package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public abstract class a extends JobSupport implements kotlin.coroutines.c, i0 {
    private final CoroutineContext context;

    public a(CoroutineContext coroutineContext, boolean z7, boolean z8) {
        super(z8);
        if (z7) {
            initParentJob((l1) coroutineContext.get(l1.Key));
        }
        this.context = coroutineContext.plus(this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    protected void afterResume(Object obj) {
        afterCompletion(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public String cancellationExceptionMessage() {
        return k0.getClassSimpleName(this) + " was cancelled";
    }

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.i0
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        h0.handleCoroutineException(this.context, th);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.l1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.JobSupport
    public String nameString$kotlinx_coroutines_core() {
        String coroutineName = CoroutineContextKt.getCoroutineName(this.context);
        if (coroutineName == null) {
            return super.nameString$kotlinx_coroutines_core();
        }
        return '\"' + coroutineName + "\":" + super.nameString$kotlinx_coroutines_core();
    }

    protected void onCancelled(Throwable th, boolean z7) {
    }

    protected void onCompleted(Object obj) {
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final void onCompletionInternal(Object obj) {
        if (!(obj instanceof b0)) {
            onCompleted(obj);
        } else {
            b0 b0Var = (b0) obj;
            onCancelled(b0Var.cause, b0Var.getHandled());
        }
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Object makeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(e0.toState$default(obj, null, 1, null));
        if (makeCompletingOnce$kotlinx_coroutines_core == s1.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        afterResume(makeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(CoroutineStart coroutineStart, R r8, f6.p pVar) {
        coroutineStart.invoke(pVar, r8, this);
    }
}
