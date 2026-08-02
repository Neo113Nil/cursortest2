package com.squareup.cash.threedsdataonly.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkInitializationFailure;
import com.squareup.cash.cdf.threeds.ThreeDsAuthenticationSdkInitializationSuccess;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.threedsdataonly.backend.api.InitializationResult;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$EndSdkInitializationSpan;
import com.squareup.cash.threedsdataonly.backend.api.ThreeDsSpanAction$StartSdkInitializationSpan;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ThreeDsServiceInitializer$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ RealSignatureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreeDsServiceInitializer$setup$1$1(RealSignatureManager realSignatureManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realSignatureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealSignatureManager realSignatureManager = this.this$0;
        switch (i) {
            case 0:
                ThreeDsServiceInitializer$setup$1$1 threeDsServiceInitializer$setup$1$1 = new ThreeDsServiceInitializer$setup$1$1(realSignatureManager, continuation, 0);
                threeDsServiceInitializer$setup$1$1.L$0 = obj;
                return threeDsServiceInitializer$setup$1$1;
            default:
                ThreeDsServiceInitializer$setup$1$1 threeDsServiceInitializer$setup$1$12 = new ThreeDsServiceInitializer$setup$1$1(realSignatureManager, continuation, 1);
                threeDsServiceInitializer$setup$1$12.L$0 = obj;
                return threeDsServiceInitializer$setup$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ThreeDsServiceInitializer$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        int i = this.$r8$classId;
        RealSignatureManager realSignatureManager = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Analytics analytics = (Analytics) realSignatureManager.signedInStateManager;
                RealThreeDsSpanTrackingService realThreeDsSpanTrackingService = (RealThreeDsSpanTrackingService) realSignatureManager.signatureRepo;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    realThreeDsSpanTrackingService.onAction(ThreeDsSpanAction$StartSdkInitializationSpan.INSTANCE);
                    RealThreeDsService realThreeDsService = (RealThreeDsService) realSignatureManager.logger;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = realThreeDsService.init.awaitInternal(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                InitializationResult initializationResult = (InitializationResult) obj;
                if (initializationResult instanceof InitializationResult.Success) {
                    realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$EndSdkInitializationSpan(false, false, ThreeDsSpanAction$EndSdkInitializationSpan.Source.APP_START));
                    analytics.track(new ThreeDsAuthenticationSdkInitializationSuccess(null), null);
                    JobKt.launch$default(coroutineScope, null, null, new ThreeDsServiceInitializer$setup$1$1(realSignatureManager, continuation, i2), 3);
                } else {
                    if (!(initializationResult instanceof InitializationResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("3DSInitializer");
                    Throwable th = ((InitializationResult.Failure) initializationResult).throwable;
                    forest.e("Failed to cleanup 3DS SDK", new Object[0], th);
                    realThreeDsSpanTrackingService.onAction(new ThreeDsSpanAction$EndSdkInitializationSpan(false, true, ThreeDsSpanAction$EndSdkInitializationSpan.Source.APP_START));
                    analytics.track(new ThreeDsAuthenticationSdkInitializationFailure(null, th.getMessage(), 1), null);
                    StateFlowImpl stateFlowImpl = ((RealThreeDsWarningsRepository) realSignatureManager.checkJob).warnings;
                    Result.Companion companion = Result.Companion;
                    Result result = new Result(new Result.Failure(th));
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, result);
                }
                return Unit.INSTANCE;
            default:
                RealThreeDsWarningsRepository realThreeDsWarningsRepository = (RealThreeDsWarningsRepository) realSignatureManager.checkJob;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Result.Companion companion2 = Result.Companion;
                        RealThreeDsService realThreeDsService2 = (RealThreeDsService) realSignatureManager.logger;
                        this.L$0 = null;
                        this.label = 1;
                        try {
                            obj = new RealThreeDsService$$ExternalSyntheticLambda0(realThreeDsService2, 0).invoke();
                            if (obj == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                        } catch (Exception e) {
                            throw RealThreeDsService.asCashType(e);
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    failure = (List) obj;
                    Result.Companion companion3 = Result.Companion;
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    failure = new Result.Failure(th2);
                }
                if (!(failure instanceof Result.Failure)) {
                    List list = (List) failure;
                    list.getClass();
                    StateFlowImpl stateFlowImpl2 = realThreeDsWarningsRepository.warnings;
                    Result result2 = new Result(list);
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.updateState(null, result2);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    StateFlowImpl stateFlowImpl3 = realThreeDsWarningsRepository.warnings;
                    Result result3 = new Result(new Result.Failure(m4120exceptionOrNullimpl));
                    stateFlowImpl3.getClass();
                    stateFlowImpl3.updateState(null, result3);
                }
                return Unit.INSTANCE;
        }
    }
}
