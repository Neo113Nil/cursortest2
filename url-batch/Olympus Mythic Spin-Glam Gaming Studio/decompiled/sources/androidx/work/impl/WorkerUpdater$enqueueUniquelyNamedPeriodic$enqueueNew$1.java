package androidx.work.impl;

import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkerUpdater.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
final class WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1 extends Lambda implements Function0 {
    final /* synthetic */ String $name;
    final /* synthetic */ OperationImpl $operation;
    final /* synthetic */ WorkManagerImpl $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ WorkRequest $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(WorkRequest workRequest, WorkManagerImpl workManagerImpl, String str, OperationImpl operationImpl) {
        super(0);
        this.$workRequest = workRequest;
        this.$this_enqueueUniquelyNamedPeriodic = workManagerImpl;
        this.$name = str;
        this.$operation = operationImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo4828invoke() {
        m2890invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2890invoke() {
        new EnqueueRunnable(new WorkContinuationImpl(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, CollectionsKt.listOf(this.$workRequest)), this.$operation).run();
    }
}
