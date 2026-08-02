package com.withpersona.sdk2.inquiry.ui;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class UiWorkflow$render$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ StatefulWorkflow.RenderContext $context;
    public final /* synthetic */ ButtonComponent $it;
    public final /* synthetic */ UiState $renderState;
    public final /* synthetic */ UiWorkflow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiWorkflow$render$3$1(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, UiState uiState, ButtonComponent buttonComponent, Continuation continuation) {
        super(2, continuation);
        this.$context = renderContext;
        this.this$0 = uiWorkflow;
        this.$renderState = uiState;
        this.$it = buttonComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UiWorkflow$render$3$1(this.$context, this.this$0, this.$renderState, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UiWorkflow$render$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.$context.$$delegate_0.getActionSink().send(Workflows.action$default(this.this$0, new BlurEffectKt$$ExternalSyntheticLambda1(14, this.$renderState, this.$it)));
        return Unit.INSTANCE;
    }
}
