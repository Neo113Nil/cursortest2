package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.ArrayIteratorKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdStepStateManager$renderScreen$2 extends AdaptedFunctionReference implements Function1 {
    public final /* synthetic */ GovernmentIdWorkflow.Input $renderProps;
    public final /* synthetic */ GovernmentIdState $renderState;
    public final /* synthetic */ GovernmentIdStepStateManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdStepStateManager$renderScreen$2(GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, GovernmentIdStepStateManager governmentIdStepStateManager) {
        super(1, ArrayIteratorKt.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepStateManager;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
        this.$renderState = governmentIdState;
        this.this$0 = governmentIdStepStateManager;
        this.$renderProps = input;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IdConfig idConfig = (IdConfig) obj;
        idConfig.getClass();
        GovernmentIdStateManagerUtilsKt.moveToNextStep$default((GovernmentIdState.ShowInstructions) this.$renderState, (SubtreeManager) r3.lastChild, this.$renderProps, null, idConfig, this.this$0.videoCaptureHelper, new CameraProperties(null, null, null, 0, 31, 0), true, idConfig.parts, 0, null, 3584);
        return Unit.INSTANCE;
    }
}
