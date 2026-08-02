package com.squareup.cash.task;

import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.boost.backend.RealBoostSyncer;
import com.squareup.cash.boost.backend.RealBoostSyncer$refresh$1;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.ui.gcm.RealGcmRegistrar;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$registerInBackground$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RepeatTaskAggregator$start$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RepeatTaskAggregator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepeatTaskAggregator$start$1(RepeatTaskAggregator repeatTaskAggregator, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = repeatTaskAggregator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        RepeatTaskAggregator repeatTaskAggregator = this.this$0;
        switch (i) {
            case 0:
                return new RepeatTaskAggregator$start$1(repeatTaskAggregator, continuation, 0);
            case 1:
                return new RepeatTaskAggregator$start$1(repeatTaskAggregator, continuation, 1);
            default:
                return new RepeatTaskAggregator$start$1(repeatTaskAggregator, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((RepeatTaskAggregator$start$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RepeatTaskAggregator repeatTaskAggregator = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                repeatTaskAggregator.clientSyncer.sync(SyncTrigger.POLLING, SyncScope.Global.INSTANCE);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealGcmRegistrar realGcmRegistrar = repeatTaskAggregator.gcmRegistrar;
                StandaloneCoroutine standaloneCoroutine = realGcmRegistrar.job;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                realGcmRegistrar.job = JobKt.launch$default(realGcmRegistrar.scope, realGcmRegistrar.ioDispatcher, null, new RealGcmRegistrar$registerInBackground$1(realGcmRegistrar, null), 2);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BoostSyncer boostSyncer = repeatTaskAggregator.boostSyncer;
                BoostSyncer.Companion companion = BoostSyncer.Companion;
                RealBoostSyncer realBoostSyncer = (RealBoostSyncer) boostSyncer;
                JobKt.launch$default(realBoostSyncer.scope, null, null, new RealBoostSyncer$refresh$1((Object) realBoostSyncer, false, (Continuation) null, 0), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
