package com.withpersona.sdk2.inquiry.ui;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.ui.UiState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiWorkflow$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ UiWorkflow f$1;
    public final /* synthetic */ UiState f$2;

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda17(UiWorkflow uiWorkflow, UiState uiState, StatefulWorkflow.RenderContext renderContext) {
        this.$r8$classId = 2;
        this.f$1 = uiWorkflow;
        this.f$2 = uiState;
        this.f$0 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        UiState uiState = this.f$2;
        UiWorkflow uiWorkflow = this.f$1;
        switch (i) {
            case 0:
                InputAddressComponent inputAddressComponent = (InputAddressComponent) obj;
                String str = (String) obj2;
                inputAddressComponent.getClass();
                str.getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(12, uiState, inputAddressComponent, str)));
                break;
            case 1:
                CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) obj;
                UiComponent uiComponent = (UiComponent) obj2;
                createPersonaSheetComponent.getClass();
                uiComponent.getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(16, uiState, createPersonaSheetComponent, uiComponent)));
                break;
            default:
                VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) obj;
                Map map = (Map) obj2;
                verifyPersonaButtonComponent.getClass();
                map.getClass();
                UiWorkflow.recurse(((UiState.Displaying) uiState).components, new UiWorkflow$$ExternalSyntheticLambda9(true, verifyPersonaButtonComponent, 0));
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(14, uiState, verifyPersonaButtonComponent, map)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda17(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, UiState uiState, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
        this.f$1 = uiWorkflow;
        this.f$2 = uiState;
    }
}
