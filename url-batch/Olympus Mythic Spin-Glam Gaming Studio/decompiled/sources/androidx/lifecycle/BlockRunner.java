package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR@\u0010\u000e\u001a.\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nj\b\u0012\u0004\u0012\u00028\u0000`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/BlockRunner;", "T", "", "", "maybeRun", "()V", "cancel", "Landroidx/lifecycle/CoroutineLiveData;", "liveData", "Landroidx/lifecycle/CoroutineLiveData;", "Lkotlin/Function2;", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/coroutines/Continuation;", "Landroidx/lifecycle/Block;", "block", "Lkotlin/jvm/functions/Function2;", "", "timeoutInMs", "J", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function0;", "onDone", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/Job;", "runningJob", "Lkotlinx/coroutines/Job;", "cancellationJob", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BlockRunner<T> {
    private final Function2 block;
    private Job cancellationJob;
    private final CoroutineLiveData liveData;
    private final Function0 onDone;
    private Job runningJob;
    private final CoroutineScope scope;
    private final long timeoutInMs;

    public final void maybeRun() {
        Job launch$default;
        Job job = this.cancellationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
        this.runningJob = launch$default;
    }

    public final void cancel() {
        Job launch$default;
        if (this.cancellationJob == null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, Dispatchers.getMain().getImmediate(), null, new BlockRunner$cancel$1(this, null), 2, null);
            this.cancellationJob = launch$default;
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
    }
}
