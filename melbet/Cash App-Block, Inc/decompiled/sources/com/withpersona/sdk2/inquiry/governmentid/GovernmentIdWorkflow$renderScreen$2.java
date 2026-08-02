package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.ArrayIteratorKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdWorkflow$renderScreen$2 extends AdaptedFunctionReference implements Function1 {
    public final /* synthetic */ StatefulWorkflow.RenderContext $context;
    public final /* synthetic */ GovernmentIdWorkflow.Input $renderProps;
    public final /* synthetic */ GovernmentIdState $renderState;
    public final /* synthetic */ GovernmentIdWorkflow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GovernmentIdWorkflow$renderScreen$2(StatefulWorkflow.RenderContext renderContext, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, GovernmentIdWorkflow governmentIdWorkflow) {
        super(1, ArrayIteratorKt.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
        this.$renderState = governmentIdState;
        this.this$0 = governmentIdWorkflow;
        this.$context = renderContext;
        this.$renderProps = input;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IdConfig idConfig = (IdConfig) obj;
        idConfig.getClass();
        GovernmentIdWorkflowUtilsKt.moveToNextStep$default((GovernmentIdState.ShowInstructions) this.$renderState, this.$context, this.$renderProps, null, idConfig, this.this$0.videoCaptureHelper, new CameraProperties(null, null, null, 0, 31, 0), true, idConfig.parts, 0, null, 3584);
        return Unit.INSTANCE;
    }
}
