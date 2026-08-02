package com.withpersona.sdk2.inquiry.internal;

import androidx.lifecycle.SavedStateHandle;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InquiryViewModel$logUiLifecycle$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $foregrounded;
    public final /* synthetic */ InquiryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryViewModel$logUiLifecycle$1(boolean z, InquiryViewModel inquiryViewModel, Continuation continuation) {
        super(2, continuation);
        this.$foregrounded = z;
        this.this$0 = inquiryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InquiryViewModel$logUiLifecycle$1(this.$foregrounded, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InquiryViewModel$logUiLifecycle$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrackingEventsLogger trackingEventsLogger;
        TrackingEventsLogger trackingEventsLogger2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        InquiryViewModel inquiryViewModel = this.this$0;
        SavedStateHandle.SavingStateLiveData savingStateLiveData = inquiryViewModel.lastPage;
        SavedStateHandle.SavingStateLiveData savingStateLiveData2 = inquiryViewModel.lastStep;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = inquiryViewModel.component;
        if (this.$foregrounded) {
            if (daggerInquiryComponent$InquiryComponentImpl != null && (trackingEventsLogger2 = daggerInquiryComponent$InquiryComponentImpl.trackingEventsLogger()) != null) {
                TrackingEventsLogger.DefaultImpls.logForegroundEvent$default(trackingEventsLogger2, (String) savingStateLiveData2.getValue(), (String) savingStateLiveData.getValue(), false, 4, null);
            }
        } else if (daggerInquiryComponent$InquiryComponentImpl != null && (trackingEventsLogger = daggerInquiryComponent$InquiryComponentImpl.trackingEventsLogger()) != null) {
            TrackingEventsLogger.DefaultImpls.logBackgroundEvent$default(trackingEventsLogger, (String) savingStateLiveData2.getValue(), (String) savingStateLiveData.getValue(), false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
