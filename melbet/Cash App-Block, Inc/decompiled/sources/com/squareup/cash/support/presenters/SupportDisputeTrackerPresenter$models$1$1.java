package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.disputeshistory.DisputesHistoryViewLoadMore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputeTrackerResult;
import com.squareup.cash.support.backend.real.RealDisputesTrackerService;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SupportDisputeTrackerPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $disputesResult$delegate;
    public final /* synthetic */ int $r8$classId = 1;
    public MutableState L$0;
    public int label;
    public final /* synthetic */ WorkHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportDisputeTrackerPresenter$models$1$1(WorkHomePresenter workHomePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = workHomePresenter;
        this.L$0 = mutableState;
        this.$disputesResult$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$disputesResult$delegate;
        WorkHomePresenter workHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new SupportDisputeTrackerPresenter$models$1$1(workHomePresenter, mutableState, continuation);
            default:
                return new SupportDisputeTrackerPresenter$models$1$1(workHomePresenter, this.L$0, mutableState, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SupportDisputeTrackerPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        int i = this.$r8$classId;
        WorkHomePresenter workHomePresenter = this.this$0;
        MutableState mutableState2 = this.$disputesResult$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDisputesTrackerService realDisputesTrackerService = (RealDisputesTrackerService) workHomePresenter.shiftsAnalytics;
                    this.L$0 = mutableState2;
                    this.label = 1;
                    obj = realDisputesTrackerService.getDisputesList(true, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableState = mutableState2;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((DisputesTrackerService$DisputeTrackerResult) obj);
                DisputesTrackerService$DisputeTrackerResult disputesTrackerService$DisputeTrackerResult = (DisputesTrackerService$DisputeTrackerResult) mutableState2.getValue();
                if (disputesTrackerService$DisputeTrackerResult != null) {
                    SupportScreens.FlowScreens.SupportDisputeTrackerScreen supportDisputeTrackerScreen = (SupportScreens.FlowScreens.SupportDisputeTrackerScreen) workHomePresenter.payPresenter;
                    Analytics analytics = (Analytics) workHomePresenter.shiftSection2Presenter;
                    if (disputesTrackerService$DisputeTrackerResult instanceof DisputesTrackerService$DisputeTrackerResult.Failure) {
                        SimpleMetadataDecoder.logViewDisputesList(analytics, supportDisputeTrackerScreen, false, null, null);
                    } else {
                        if (!(disputesTrackerService$DisputeTrackerResult instanceof DisputesTrackerService$DisputeTrackerResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        DisputesTrackerService$DisputeTrackerResult.Success success = (DisputesTrackerService$DisputeTrackerResult.Success) disputesTrackerService$DisputeTrackerResult;
                        SimpleMetadataDecoder.logViewDisputesList(analytics, supportDisputeTrackerScreen, true, Boolean.valueOf(success.hasMoreDisputes), workHomePresenter.buildDisputes(success));
                    }
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealDisputesTrackerService realDisputesTrackerService2 = (RealDisputesTrackerService) workHomePresenter.shiftsAnalytics;
                        this.label = 1;
                        obj = realDisputesTrackerService2.getDisputesList(false, this);
                        if (obj == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    DisputesTrackerService$DisputeTrackerResult disputesTrackerService$DisputeTrackerResult2 = (DisputesTrackerService$DisputeTrackerResult) obj;
                    Analytics analytics2 = (Analytics) workHomePresenter.shiftSection2Presenter;
                    SupportScreens.FlowScreens.SupportDisputeTrackerScreen supportDisputeTrackerScreen2 = (SupportScreens.FlowScreens.SupportDisputeTrackerScreen) workHomePresenter.payPresenter;
                    boolean z = disputesTrackerService$DisputeTrackerResult2 instanceof DisputesTrackerService$DisputeTrackerResult.Success;
                    supportDisputeTrackerScreen2.getClass();
                    analytics2.track(new DisputesHistoryViewLoadMore(z ? DisputesHistoryViewLoadMore.Status.SUCCESS : DisputesHistoryViewLoadMore.Status.FAILURE, supportDisputeTrackerScreen2.data.flowToken), null);
                    if (disputesTrackerService$DisputeTrackerResult2 instanceof DisputesTrackerService$DisputeTrackerResult.Success) {
                        this.L$0.setValue(disputesTrackerService$DisputeTrackerResult2);
                    }
                    mutableState2.setValue(Boolean.FALSE);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    mutableState2.setValue(Boolean.FALSE);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportDisputeTrackerPresenter$models$1$1(WorkHomePresenter workHomePresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = workHomePresenter;
        this.$disputesResult$delegate = mutableState;
    }
}
