package com.withpersona.sdk2.inquiry.integration.fragment;

import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class IntegrationStepStateManager$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IntegrationStepStateManager f$0;

    public /* synthetic */ IntegrationStepStateManager$$ExternalSyntheticLambda2(IntegrationStepStateManager integrationStepStateManager, int i) {
        this.$r8$classId = i;
        this.f$0 = integrationStepStateManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        IntegrationStepStateManager integrationStepStateManager = this.f$0;
        switch (i) {
            case 0:
                ((UiComponent) obj).getClass();
                integrationStepStateManager.onEvent(IntegrationStepStateManager.Event.OpenBrowser.INSTANCE);
                break;
            default:
                IntegrationWorkflow$State$Starting integrationWorkflow$State$Starting = (IntegrationWorkflow$State$Starting) obj;
                if (integrationWorkflow$State$Starting != null) {
                    integrationStepStateManager.handleState((IntegrationWorkflow.Input) ((StateFlowImpl) integrationStepStateManager.firstChild).getValue(), integrationWorkflow$State$Starting);
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
