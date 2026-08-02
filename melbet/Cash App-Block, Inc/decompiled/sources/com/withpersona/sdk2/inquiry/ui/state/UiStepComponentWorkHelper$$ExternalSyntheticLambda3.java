package com.withpersona.sdk2.inquiry.ui.state;

import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.sna.SnaClient$Response$Error;
import com.withpersona.sdk2.inquiry.steps.ui.components.BitmapValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SingleBooleanValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.ui.ComponentWorkHelperKt;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiStepComponentWorkHelper$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SubtreeManager f$0;
    public final /* synthetic */ UiState.Displaying f$1;
    public final /* synthetic */ UiComponent f$2;

    public /* synthetic */ UiStepComponentWorkHelper$$ExternalSyntheticLambda3(SubtreeManager subtreeManager, UiState.Displaying displaying, UiComponent uiComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = subtreeManager;
        this.f$1 = displaying;
        this.f$2 = uiComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        UiComponent uiComponent = this.f$2;
        SubtreeManager subtreeManager = this.f$0;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                UiState.Displaying displaying = this.f$1;
                List list = displaying.components;
                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) ((SingleBooleanValueComponent) uiComponent);
                String str = inputCheckboxComponent.name;
                JsonLogicBoolean jsonLogicBoolean = inputCheckboxComponent.hidden;
                JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxComponent.disabled;
                str.getClass();
                InputCheckboxComponent inputCheckboxComponent2 = new InputCheckboxComponent(str, booleanValue, jsonLogicBoolean, jsonLogicBoolean2);
                TextControllerImpl textControllerImpl = inputCheckboxComponent.twoStateViewController;
                textControllerImpl.getClass();
                inputCheckboxComponent2.twoStateViewController = textControllerImpl;
                subtreeManager.updateState(UiState.Displaying.copy$default(displaying, UiComponentKt.updateComponent(list, uiComponent, inputCheckboxComponent2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                break;
            case 1:
                UiState.Displaying displaying2 = this.f$1;
                subtreeManager.updateState(UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(displaying2.components, uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).updateNfcData((GovernmentIdNfcData) obj)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                UiState.Displaying displaying3 = this.f$1;
                List list2 = displaying3.components;
                MdocComponent mdocComponent = (MdocComponent) uiComponent;
                mdocComponent.getClass();
                MdocComponent copy$default = MdocComponent.copy$default(mdocComponent, null, str2, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                copy$default.mdocDataController = mdocComponent.mdocDataController;
                copy$default.errorTextController = mdocComponent.errorTextController;
                subtreeManager.updateState(UiState.Displaying.copy$default(displaying3, UiComponentKt.updateComponent(list2, uiComponent, copy$default), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                break;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                UiState.Displaying displaying4 = this.f$1;
                List list3 = displaying4.components;
                MdocComponent mdocComponent2 = (MdocComponent) uiComponent;
                mdocComponent2.getClass();
                MdocComponent copy$default2 = MdocComponent.copy$default(mdocComponent2, str3, null, 1535);
                copy$default2.mdocDataController = mdocComponent2.mdocDataController;
                copy$default2.errorTextController = mdocComponent2.errorTextController;
                subtreeManager.updateState(ComponentWorkHelperKt.autoSubmitState(UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list3, uiComponent, copy$default2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER), ((MdocComponent) uiComponent).successfulMdocRetrievalTransitionComponentName));
                break;
            case 4:
                if (!(obj instanceof SnaClient$Response$Error)) {
                    break;
                } else {
                    PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) uiComponent;
                    SnaClient$Response$Error snaClient$Response$Error = (SnaClient$Response$Error) obj;
                    String str4 = snaClient$Response$Error.errorName;
                    String str5 = snaClient$Response$Error.errorMessage;
                    String str6 = phoneNumberSnaComponent.name;
                    PhoneNumberSna phoneNumberSna = phoneNumberSnaComponent.config;
                    str6.getClass();
                    phoneNumberSna.getClass();
                    PhoneNumberSnaComponent phoneNumberSnaComponent2 = new PhoneNumberSnaComponent(str6, phoneNumberSna, null, str4, str5, null, 0);
                    UiState.Displaying displaying5 = this.f$1;
                    subtreeManager.updateState(UiState.Displaying.copy$default(displaying5, UiComponentKt.updateComponent(displaying5.components, uiComponent, phoneNumberSnaComponent2), null, null, null, new UiState.Displaying.AutoSubmit(phoneNumberSnaComponent2, 0, null), null, false, null, null, null, false, null, 0, 65470));
                    break;
                }
            case 5:
                ((Unit) obj).getClass();
                String str7 = ((InputFileUploadComponent) uiComponent).name;
                UiState.Displaying displaying6 = this.f$1;
                subtreeManager.updateState(UiState.Displaying.copy$default(displaying6, null, null, null, null, null, null, false, null, null, null, false, str7, displaying6.filePickRequestId + 1, 16383));
                break;
            case 6:
                UiStepFileSelectWorker.Output output = (UiStepFileSelectWorker.Output) obj;
                output.getClass();
                boolean z = output instanceof UiStepFileSelectWorker.Output.Success;
                UiState.Displaying displaying7 = this.f$1;
                if (!z) {
                    if (!(output instanceof UiStepFileSelectWorker.Output.Cancel) && !(output instanceof UiStepFileSelectWorker.Output.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        subtreeManager.updateState(UiState.Displaying.copy$default(displaying7, null, null, null, null, null, null, false, null, null, null, false, null, 0, 49151));
                    }
                } else {
                    subtreeManager.updateState(UiState.Displaying.copy$default(displaying7, UiComponentKt.updateComponent(displaying7.components, uiComponent, ((InputFileUploadComponent) uiComponent).updateFiles(((UiStepFileSelectWorker.Output.Success) output).files)), null, null, null, null, null, false, null, null, null, false, null, 0, 49150));
                }
                break;
            default:
                UiState.Displaying displaying8 = this.f$1;
                List list4 = displaying8.components;
                ESignatureComponent eSignatureComponent = (ESignatureComponent) ((BitmapValueComponent) uiComponent);
                String str8 = eSignatureComponent.name;
                JsonLogicBoolean jsonLogicBoolean3 = eSignatureComponent.hidden;
                JsonLogicBoolean jsonLogicBoolean4 = eSignatureComponent.disabled;
                str8.getClass();
                ESignatureComponent eSignatureComponent2 = new ESignatureComponent(str8, jsonLogicBoolean3, jsonLogicBoolean4);
                BitmapController bitmapController = eSignatureComponent.bitmapController;
                bitmapController.getClass();
                eSignatureComponent2.bitmapController = bitmapController;
                subtreeManager.updateState(UiState.Displaying.copy$default(displaying8, UiComponentKt.updateComponent(list4, uiComponent, eSignatureComponent2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UiStepComponentWorkHelper$$ExternalSyntheticLambda3(UiComponent uiComponent, SubtreeManager subtreeManager, UiState.Displaying displaying, int i) {
        this.$r8$classId = i;
        this.f$2 = uiComponent;
        this.f$0 = subtreeManager;
        this.f$1 = displaying;
    }
}
