package com.withpersona.sdk2.inquiry.internal.workflows;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InquiryWorkflowFragment$onViewCreated$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ InquiryStateManager $inquiryStateManager;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ InquiryWorkflowFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InquiryWorkflowFragment$onViewCreated$1(InquiryStateManager inquiryStateManager, InquiryWorkflowFragment inquiryWorkflowFragment, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$inquiryStateManager = inquiryStateManager;
        this.this$0 = inquiryWorkflowFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InquiryWorkflowFragment inquiryWorkflowFragment = this.this$0;
        InquiryStateManager inquiryStateManager = this.$inquiryStateManager;
        switch (i) {
            case 0:
                return new InquiryWorkflowFragment$onViewCreated$1(inquiryStateManager, inquiryWorkflowFragment, continuation, 0);
            default:
                return new InquiryWorkflowFragment$onViewCreated$1(inquiryStateManager, inquiryWorkflowFragment, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((InquiryWorkflowFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
            default:
                ((InquiryWorkflowFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        InquiryWorkflowFragment inquiryWorkflowFragment = this.this$0;
        InquiryStateManager inquiryStateManager = this.$inquiryStateManager;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl = (StateFlowImpl) inquiryStateManager.next;
                ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(inquiryWorkflowFragment, 29);
                this.label = 1;
                stateFlowImpl.collect(anonymousClass1, this);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                StateFlowImpl stateFlowImpl2 = (StateFlowImpl) inquiryStateManager.prev;
                FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2 anonymousClass2 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(5, inquiryStateManager, inquiryWorkflowFragment);
                this.label = 1;
                stateFlowImpl2.collect(anonymousClass2, this);
                return coroutineSingletons2;
        }
    }
}
