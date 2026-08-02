package com.withpersona.sdk2.inquiry.ui;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.ui.UiState;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class UiWorkflow$render$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ StatefulWorkflow.RenderContext $context;
    public final /* synthetic */ UiState.Displaying.AutoSubmit $it;
    public final /* synthetic */ UiState $renderState;
    public int label;
    public final /* synthetic */ UiWorkflow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiWorkflow$render$4$1(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, UiState.Displaying.AutoSubmit autoSubmit, UiState uiState, Continuation continuation) {
        super(2, continuation);
        this.$context = renderContext;
        this.this$0 = uiWorkflow;
        this.$it = autoSubmit;
        this.$renderState = uiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UiWorkflow$render$4$1(this.$context, this.this$0, this.$it, this.$renderState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UiWorkflow$render$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            if (JobKt.delay(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        this.$context.$$delegate_0.getActionSink().send(Workflows.action$default(this.this$0, new BlurEffectKt$$ExternalSyntheticLambda1(15, this.$it, this.$renderState)));
        return Unit.INSTANCE;
    }
}
