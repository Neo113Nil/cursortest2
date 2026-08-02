package com.withpersona.sdk2.inquiry;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1", f = "InquiryActivityBroadcastManager.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class InquiryActivityBroadcastManager$cancelRunningInquiries$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $skipBackendCall;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InquiryActivityBroadcastManager$cancelRunningInquiries$1(boolean z, Continuation<? super InquiryActivityBroadcastManager$cancelRunningInquiries$1> continuation) {
        super(2, continuation);
        this.$skipBackendCall = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InquiryActivityBroadcastManager$cancelRunningInquiries$1(this.$skipBackendCall, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InquiryActivityBroadcastManager$cancelRunningInquiries$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            mutableSharedFlow = InquiryActivityBroadcastManager._eventFlow;
            InquiryActivityEvent.CancelInquiry cancelInquiry = new InquiryActivityEvent.CancelInquiry(this.$skipBackendCall);
            this.label = 1;
            if (mutableSharedFlow.emit(cancelInquiry, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
