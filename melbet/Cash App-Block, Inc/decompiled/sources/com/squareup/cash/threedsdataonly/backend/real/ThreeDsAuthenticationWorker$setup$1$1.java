package com.squareup.cash.threedsdataonly.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfers_3dsPreAuthentication;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.util.coroutines.DerivedStateFlow;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ThreeDsAuthenticationWorker$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ActivityTransitionsSideEffectsPerformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreeDsAuthenticationWorker$setup$1$1(ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = activityTransitionsSideEffectsPerformer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer = this.this$0;
        switch (i) {
            case 0:
                return new ThreeDsAuthenticationWorker$setup$1$1(activityTransitionsSideEffectsPerformer, continuation, 0);
            default:
                return new ThreeDsAuthenticationWorker$setup$1$1(activityTransitionsSideEffectsPerformer, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((ThreeDsAuthenticationWorker$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((ThreeDsAuthenticationWorker$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(Trace.valuesStateExperiment((FeatureFlagManager) activityTransitionsSideEffectsPerformer.activity, AmplitudeExperiments$ClientTransfers_3dsPreAuthentication.INSTANCE), new Badger$collect$$inlined$combine$2$3(continuation, activityTransitionsSideEffectsPerformer, 7));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(activityTransitionsSideEffectsPerformer, 0);
                    this.label = 1;
                    if (transformLatest.collect(anonymousClass2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DerivedStateFlow valuesStateExperiment = Trace.valuesStateExperiment((FeatureFlagManager) activityTransitionsSideEffectsPerformer.activity, AmplitudeExperiments$ClientTransfers_3dsPreAuthentication.INSTANCE);
                AnonymousClass2 anonymousClass22 = new AnonymousClass2(activityTransitionsSideEffectsPerformer, i2);
                this.label = 1;
                valuesStateExperiment.collect(anonymousClass22, this);
                return coroutineSingletons2;
        }
    }

    /* renamed from: com.squareup.cash.threedsdataonly.backend.real.ThreeDsAuthenticationWorker$setup$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ ActivityTransitionsSideEffectsPerformer this$0;

        public /* synthetic */ AnonymousClass2(ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer, int i) {
            this.$r8$classId = i;
            this.this$0 = activityTransitionsSideEffectsPerformer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        
            if (r6 != r8) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        
            if (r7.invalidateCache(r0) == r8) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(List list, Continuation continuation) {
            ThreeDsAuthenticationWorker$setup$1$1$2$emit$1 threeDsAuthenticationWorker$setup$1$1$2$emit$1;
            Object obj;
            int i;
            Object withContext;
            RealThreeDsAuthenticationManager realThreeDsAuthenticationManager = (RealThreeDsAuthenticationManager) this.this$0.activityEvents;
            if (continuation instanceof ThreeDsAuthenticationWorker$setup$1$1$2$emit$1) {
                threeDsAuthenticationWorker$setup$1$1$2$emit$1 = (ThreeDsAuthenticationWorker$setup$1$1$2$emit$1) continuation;
                int i2 = threeDsAuthenticationWorker$setup$1$1$2$emit$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    threeDsAuthenticationWorker$setup$1$1$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = threeDsAuthenticationWorker$setup$1$1$2$emit$1.result;
                    obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = threeDsAuthenticationWorker$setup$1$1$2$emit$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("3DS-authentication-worker");
                        forest.d("Force refreshing 3ds transactions due to instrument change.", new Object[0]);
                        threeDsAuthenticationWorker$setup$1$1$2$emit$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                SafeTrace.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    threeDsAuthenticationWorker$setup$1$1$2$emit$1.label = 2;
                    withContext = JobKt.withContext(realThreeDsAuthenticationManager.ioDispatcher, new RealThreeDsAuthenticationManager$prepareTransactions$2(realThreeDsAuthenticationManager, null), threeDsAuthenticationWorker$setup$1$1$2$emit$1);
                    if (withContext != obj) {
                        withContext = Unit.INSTANCE;
                    }
                }
            }
            threeDsAuthenticationWorker$setup$1$1$2$emit$1 = new ThreeDsAuthenticationWorker$setup$1$1$2$emit$1(this, continuation);
            Object obj22 = threeDsAuthenticationWorker$setup$1$1$2$emit$1.result;
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = threeDsAuthenticationWorker$setup$1$1$2$emit$1.label;
            if (i != 0) {
            }
            threeDsAuthenticationWorker$setup$1$1$2$emit$1.label = 2;
            withContext = JobKt.withContext(realThreeDsAuthenticationManager.ioDispatcher, new RealThreeDsAuthenticationManager$prepareTransactions$2(realThreeDsAuthenticationManager, null), threeDsAuthenticationWorker$setup$1$1$2$emit$1);
            if (withContext != obj) {
            }
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return emit((List) obj, continuation);
                default:
                    if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj).enabled()) {
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("3DS-authentication-worker");
                        forest.d("Checking if 3ds transactions need to be prepared.", new Object[0]);
                        RealThreeDsAuthenticationManager realThreeDsAuthenticationManager = (RealThreeDsAuthenticationManager) this.this$0.activityEvents;
                        Object withContext = JobKt.withContext(realThreeDsAuthenticationManager.ioDispatcher, new RealThreeDsAuthenticationManager$prepareTransactions$2(realThreeDsAuthenticationManager, null), continuation);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (withContext != coroutineSingletons) {
                            withContext = Unit.INSTANCE;
                        }
                        return withContext == coroutineSingletons ? withContext : Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
            }
        }
    }
}
