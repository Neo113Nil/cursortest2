package com.withpersona.sdk2.inquiry.ui;

import android.graphics.Bitmap;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.sna.SnaClient$Response$Error;
import com.withpersona.sdk2.inquiry.steps.ui.components.BitmapValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SingleBooleanValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;

/* loaded from: classes9.dex */
public final /* synthetic */ class ComponentWorkHelper$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiState.Displaying f$0;
    public final /* synthetic */ UiComponent f$1;

    public /* synthetic */ ComponentWorkHelper$$ExternalSyntheticLambda1(UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap) {
        this.$r8$classId = 1;
        this.f$0 = displaying;
        this.f$1 = uiComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final int i2 = 1;
        final int i3 = 0;
        final UiState.Displaying displaying = this.f$0;
        final UiComponent uiComponent = this.f$1;
        switch (i) {
            case 0:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                String str = ((InputFileUploadComponent) uiComponent).name;
                UiState.Displaying displaying2 = this.f$0;
                updater.state = UiState.Displaying.copy$default(displaying2, null, null, null, null, null, null, false, null, null, null, false, str, displaying2.filePickRequestId + 1, 16383);
                return Unit.INSTANCE;
            case 1:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                UiState.Displaying displaying3 = this.f$0;
                List list = displaying3.components;
                ESignatureComponent eSignatureComponent = (ESignatureComponent) ((BitmapValueComponent) uiComponent);
                String str2 = eSignatureComponent.name;
                JsonLogicBoolean jsonLogicBoolean = eSignatureComponent.hidden;
                JsonLogicBoolean jsonLogicBoolean2 = eSignatureComponent.disabled;
                str2.getClass();
                ESignatureComponent eSignatureComponent2 = new ESignatureComponent(str2, jsonLogicBoolean, jsonLogicBoolean2);
                BitmapController bitmapController = eSignatureComponent.bitmapController;
                bitmapController.getClass();
                eSignatureComponent2.bitmapController = bitmapController;
                updater2.state = UiState.Displaying.copy$default(displaying3, UiComponentKt.updateComponent(list, uiComponent, eSignatureComponent2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                return Unit.INSTANCE;
            case 2:
                UiAddressAutocompleteWorker.Response response = (UiAddressAutocompleteWorker.Response) obj;
                response.getClass();
                return Workflows.action$default(new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(4, response, displaying, uiComponent));
            case 3:
                UiAddressDetailsWorker.Response response2 = (UiAddressDetailsWorker.Response) obj;
                response2.getClass();
                if (response2 instanceof UiAddressDetailsWorker.Response.Success) {
                    return Workflows.action$default(new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(5, uiComponent, response2, displaying));
                }
                if (response2 instanceof UiAddressDetailsWorker.Response.Error) {
                    return Workflows.action$default(new ForwardingFileSystem$$ExternalSyntheticLambda0(response2, 10));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 4:
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                return Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i4 = i2;
                        boolean z = booleanValue;
                        UiComponent uiComponent2 = uiComponent;
                        switch (i4) {
                            case 0:
                                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj2;
                                updater3.getClass();
                                UiState.Displaying displaying4 = displaying;
                                updater3.state = UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(displaying4.components, uiComponent2, ((InputAddressComponent) uiComponent2).updateCollapsedState(Boolean.valueOf(z))), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                                break;
                            default:
                                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj2;
                                updater4.getClass();
                                UiState.Displaying displaying5 = displaying;
                                List list2 = displaying5.components;
                                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) ((SingleBooleanValueComponent) uiComponent2);
                                String str3 = inputCheckboxComponent.name;
                                JsonLogicBoolean jsonLogicBoolean3 = inputCheckboxComponent.hidden;
                                JsonLogicBoolean jsonLogicBoolean4 = inputCheckboxComponent.disabled;
                                str3.getClass();
                                InputCheckboxComponent inputCheckboxComponent2 = new InputCheckboxComponent(str3, z, jsonLogicBoolean3, jsonLogicBoolean4);
                                TextControllerImpl textControllerImpl = inputCheckboxComponent.twoStateViewController;
                                textControllerImpl.getClass();
                                inputCheckboxComponent2.twoStateViewController = textControllerImpl;
                                updater4.state = UiState.Displaying.copy$default(displaying5, UiComponentKt.updateComponent(list2, uiComponent2, inputCheckboxComponent2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            case 5:
                return Workflows.action$default(new ComponentWorkHelper$$ExternalSyntheticLambda1(displaying, uiComponent, (Bitmap) obj));
            case 6:
                return Workflows.action$default(new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(3, displaying, uiComponent, (GovernmentIdNfcData) obj));
            case 7:
                final String str3 = (String) obj;
                str3.getClass();
                return Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i4 = i3;
                        String str4 = str3;
                        UiComponent uiComponent2 = uiComponent;
                        switch (i4) {
                            case 0:
                                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj2;
                                updater3.getClass();
                                UiState.Displaying displaying4 = displaying;
                                List list2 = displaying4.components;
                                MdocComponent mdocComponent = (MdocComponent) uiComponent2;
                                mdocComponent.getClass();
                                str4.getClass();
                                MdocComponent copy$default = MdocComponent.copy$default(mdocComponent, null, str4, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                                copy$default.mdocDataController = mdocComponent.mdocDataController;
                                copy$default.errorTextController = mdocComponent.errorTextController;
                                updater3.state = UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list2, uiComponent2, copy$default), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                                break;
                            default:
                                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj2;
                                updater4.getClass();
                                UiState.Displaying displaying5 = displaying;
                                List list3 = displaying5.components;
                                MdocComponent mdocComponent2 = (MdocComponent) uiComponent2;
                                mdocComponent2.getClass();
                                str4.getClass();
                                MdocComponent copy$default2 = MdocComponent.copy$default(mdocComponent2, str4, null, 1535);
                                copy$default2.mdocDataController = mdocComponent2.mdocDataController;
                                copy$default2.errorTextController = mdocComponent2.errorTextController;
                                updater4.state = ComponentWorkHelperKt.autoSubmitState(UiState.Displaying.copy$default(displaying5, UiComponentKt.updateComponent(list3, uiComponent2, copy$default2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER), ((MdocComponent) uiComponent2).successfulMdocRetrievalTransitionComponentName);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            case 8:
                final String str4 = (String) obj;
                str4.getClass();
                return Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i4 = i2;
                        String str42 = str4;
                        UiComponent uiComponent2 = uiComponent;
                        switch (i4) {
                            case 0:
                                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj2;
                                updater3.getClass();
                                UiState.Displaying displaying4 = displaying;
                                List list2 = displaying4.components;
                                MdocComponent mdocComponent = (MdocComponent) uiComponent2;
                                mdocComponent.getClass();
                                str42.getClass();
                                MdocComponent copy$default = MdocComponent.copy$default(mdocComponent, null, str42, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2);
                                copy$default.mdocDataController = mdocComponent.mdocDataController;
                                copy$default.errorTextController = mdocComponent.errorTextController;
                                updater3.state = UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(list2, uiComponent2, copy$default), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                                break;
                            default:
                                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj2;
                                updater4.getClass();
                                UiState.Displaying displaying5 = displaying;
                                List list3 = displaying5.components;
                                MdocComponent mdocComponent2 = (MdocComponent) uiComponent2;
                                mdocComponent2.getClass();
                                str42.getClass();
                                MdocComponent copy$default2 = MdocComponent.copy$default(mdocComponent2, str42, null, 1535);
                                copy$default2.mdocDataController = mdocComponent2.mdocDataController;
                                copy$default2.errorTextController = mdocComponent2.errorTextController;
                                updater4.state = ComponentWorkHelperKt.autoSubmitState(UiState.Displaying.copy$default(displaying5, UiComponentKt.updateComponent(list3, uiComponent2, copy$default2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER), ((MdocComponent) uiComponent2).successfulMdocRetrievalTransitionComponentName);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            case 9:
                SnaClient$Response$Error snaClient$Response$Error = (SnaClient$Response$Error) obj;
                snaClient$Response$Error.getClass();
                if (!(snaClient$Response$Error instanceof SnaClient$Response$Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) uiComponent;
                String str5 = snaClient$Response$Error.errorName;
                String str6 = snaClient$Response$Error.errorMessage;
                String str7 = phoneNumberSnaComponent.name;
                PhoneNumberSna phoneNumberSna = phoneNumberSnaComponent.config;
                str7.getClass();
                phoneNumberSna.getClass();
                return Workflows.action$default(new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(6, displaying, uiComponent, new PhoneNumberSnaComponent(str7, phoneNumberSna, null, str5, str6, null, 0)));
            case 10:
                ((Unit) obj).getClass();
                return Workflows.action$default(new ComponentWorkHelper$$ExternalSyntheticLambda1(displaying, uiComponent, i3));
            case 11:
                UiStepFileSelectWorker.Output output = (UiStepFileSelectWorker.Output) obj;
                output.getClass();
                if (output instanceof UiStepFileSelectWorker.Output.Success) {
                    return Workflows.action$default(new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(7, displaying, uiComponent, ((InputFileUploadComponent) uiComponent).updateFiles(((UiStepFileSelectWorker.Output.Success) output).files)));
                }
                if ((output instanceof UiStepFileSelectWorker.Output.Cancel) || (output instanceof UiStepFileSelectWorker.Output.Error)) {
                    return Workflows.action$default(new UiWorkflow$$ExternalSyntheticLambda4(displaying, 1));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                final boolean booleanValue2 = ((Boolean) obj).booleanValue();
                return Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i4 = i3;
                        boolean z = booleanValue2;
                        UiComponent uiComponent2 = uiComponent;
                        switch (i4) {
                            case 0:
                                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj2;
                                updater3.getClass();
                                UiState.Displaying displaying4 = displaying;
                                updater3.state = UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(displaying4.components, uiComponent2, ((InputAddressComponent) uiComponent2).updateCollapsedState(Boolean.valueOf(z))), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                                break;
                            default:
                                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj2;
                                updater4.getClass();
                                UiState.Displaying displaying5 = displaying;
                                List list2 = displaying5.components;
                                InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) ((SingleBooleanValueComponent) uiComponent2);
                                String str32 = inputCheckboxComponent.name;
                                JsonLogicBoolean jsonLogicBoolean3 = inputCheckboxComponent.hidden;
                                JsonLogicBoolean jsonLogicBoolean4 = inputCheckboxComponent.disabled;
                                str32.getClass();
                                InputCheckboxComponent inputCheckboxComponent2 = new InputCheckboxComponent(str32, z, jsonLogicBoolean3, jsonLogicBoolean4);
                                TextControllerImpl textControllerImpl = inputCheckboxComponent.twoStateViewController;
                                textControllerImpl.getClass();
                                inputCheckboxComponent2.twoStateViewController = textControllerImpl;
                                updater4.state = UiState.Displaying.copy$default(displaying5, UiComponentKt.updateComponent(list2, uiComponent2, inputCheckboxComponent2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
        }
    }

    public /* synthetic */ ComponentWorkHelper$$ExternalSyntheticLambda1(UiState.Displaying displaying, UiComponent uiComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = displaying;
        this.f$1 = uiComponent;
    }

    public /* synthetic */ ComponentWorkHelper$$ExternalSyntheticLambda1(UiComponent uiComponent, UiState.Displaying displaying, int i) {
        this.$r8$classId = i;
        this.f$1 = uiComponent;
        this.f$0 = displaying;
    }
}
