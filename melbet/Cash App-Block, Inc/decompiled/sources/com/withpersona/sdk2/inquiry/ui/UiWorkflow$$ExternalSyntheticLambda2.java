package com.withpersona.sdk2.inquiry.ui;

import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.ui.UiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiWorkflow$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiState f$0;

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda2(UiState uiState, int i) {
        this.$r8$classId = i;
        this.f$0 = uiState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        UiState uiState = this.f$0;
        switch (i) {
            case 0:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                UiState.Displaying displaying = (UiState.Displaying) uiState;
                updater.state = UiState.Displaying.copy$default(displaying, null, null, null, null, null, null, false, null, null, String.valueOf(Integer.parseInt(displaying.requestPermissionKey) + 1), false, null, 0, 60927);
                break;
            case 1:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.state = UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.JPEG_APP15_MARKER);
                break;
            case 2:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.state = UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, false, null, null, null, false, null, 0, 57343);
                break;
            default:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                updater4.state = UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65023);
                break;
        }
        return Unit.INSTANCE;
    }
}
