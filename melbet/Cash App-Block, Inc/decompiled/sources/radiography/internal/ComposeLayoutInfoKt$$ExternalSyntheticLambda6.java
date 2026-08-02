package radiography.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.GapCompositionDataImpl;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.tooling.data.EmptyGroup;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.unit.IntRect;
import androidx.datastore.core.SimpleActor;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Response;
import com.google.android.material.textfield.TextInputLayout;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker;
import com.withpersona.sdk2.inquiry.steps.ui.components.BitmapValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.DateValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MultiTextValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SingleBooleanValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SingleNumberValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SingleTextValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.StringSetValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.AddressAutocompleteMethod;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.BitmapController;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectListAdapter;
import com.withpersona.sdk2.inquiry.ui.ComponentWorkHelperKt;
import com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda14;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda15;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda9;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import com.withpersona.sdk2.inquiry.ui.network.LocationData;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressAutocompleteWorker;
import com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper;
import com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.workflows.NamedWorkflowWorker;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import dev.chrisbanes.haze.Pool;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.MatchResult;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import radiography.ScannableView;
import radiography.internal.ComposeLayoutInfo;

/* loaded from: classes9.dex */
public final /* synthetic */ class ComposeLayoutInfoKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ComposeLayoutInfoKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent;
        String[] strArr;
        InputFileUpload.Attributes attributes;
        Integer fileUploadLimit;
        InputFileUpload.Attributes attributes2;
        List<String> allowedFileTypes;
        Class<?> cls;
        int i = this.$r8$classId;
        int i2 = 9;
        int i3 = 5;
        CreateReusablePersonaWorker.Output.Complete complete = CreateReusablePersonaWorker.Output.Complete.INSTANCE;
        final int i4 = 0;
        final int i5 = 1;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                List list = (List) obj4;
                Group group = (Group) obj3;
                SimpleActor simpleActor = (SimpleActor) obj2;
                Composer composer = (Composer) obj;
                composer.getClass();
                ScannableView.CallGroupInfo callGroupInfo = (ScannableView.CallGroupInfo) CollectionsKt.firstOrNull(list);
                String str2 = callGroupInfo != null ? callGroupInfo.name : null;
                String str3 = str2 != null ? str2 : "";
                IntRect intRect = group.box;
                CompositionData compositionData = ((GapComposer) composer).getCompositionData();
                IntRect intRect2 = SlotTreeKt.emptyBox;
                CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.firstOrNull(((GapCompositionDataImpl) compositionData).getCompositionGroups());
                return new ComposeLayoutInfo.SubcompositionInfo(str3, list, intRect, ComposeLayoutInfoKt.computeLayoutInfos(compositionGroup != null ? SlotTreeKt.getGroup(compositionGroup, null) : EmptyGroup.INSTANCE, EmptyList.INSTANCE, simpleActor));
            case 1:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                Response response = (Response) obj2;
                Option option = (Option) obj;
                option.getClass();
                if (!((InputSelectBoxComponent) obj4).getCanSelectMultipleValues()) {
                    Function1 function1 = (Function1) ref$ObjectRef.element;
                    if (function1 != null) {
                        function1.invoke(CollectionsKt__CollectionsJVMKt.listOf(option));
                    }
                    ref$ObjectRef.element = null;
                    response.close();
                }
                return Unit.INSTANCE;
            case 2:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj4;
                InputSelectListAdapter inputSelectListAdapter = (InputSelectListAdapter) obj3;
                Response response2 = (Response) obj2;
                if (((Integer) obj).intValue() == 5) {
                    Function1 function12 = (Function1) ref$ObjectRef2.element;
                    if (function12 != null) {
                        function12.invoke(CollectionsKt.toList(CollectionsKt.toList(inputSelectListAdapter._selectedValues)));
                    }
                    ref$ObjectRef2.element = null;
                    Context context = ((ViewGroup) response2.result).getContext();
                    context.getClass();
                    ContextUtilsKt.hideKeyboard(context);
                }
                return Unit.INSTANCE;
            case 3:
                UiState.Displaying displaying = (UiState.Displaying) obj4;
                UiComponent uiComponent = (UiComponent) obj3;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                updater.state = UiState.Displaying.copy$default(displaying, UiComponentKt.updateComponent(displaying.components, uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).updateNfcData((GovernmentIdNfcData) obj2)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                return Unit.INSTANCE;
            case 4:
                UiAddressAutocompleteWorker.Response response3 = (UiAddressAutocompleteWorker.Response) obj4;
                UiState.Displaying displaying2 = (UiState.Displaying) obj3;
                UiComponent uiComponent2 = (UiComponent) obj2;
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                if (response3 instanceof UiAddressAutocompleteWorker.Response.Success) {
                    List list2 = displaying2.components;
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) uiComponent2;
                    List list3 = ((UiAddressAutocompleteWorker.Response.Success) response3).results;
                    inputAddressComponent.getClass();
                    InputAddressComponent copy$default = InputAddressComponent.copy$default(inputAddressComponent, null, null, null, null, null, null, list3, null, null, null, 15359);
                    InputAddressComponentKt.access$copyControllers(copy$default, inputAddressComponent);
                    updater2.state = UiState.Displaying.copy$default(displaying2, UiComponentKt.updateComponent(list2, uiComponent2, copy$default.updateSearchQuery(null)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                } else if (!(response3 instanceof UiAddressAutocompleteWorker.Response.Error)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 5:
                UiComponent uiComponent3 = (UiComponent) obj4;
                UiState.Displaying displaying3 = (UiState.Displaying) obj2;
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                Boolean bool = Boolean.FALSE;
                UiAddressDetailsWorker.Response.Success success = (UiAddressDetailsWorker.Response.Success) ((UiAddressDetailsWorker.Response) obj3);
                InputAddressComponent updateAddressStreet1 = ((InputAddressComponent) uiComponent3).updateCollapsedState(bool).updateAddressStreet1(success.result.addressStreet1);
                LocationData locationData = success.result;
                String str4 = locationData.addressStreet2;
                InputAddressComponent updateIsAddressAutocompleteLoading = updateAddressStreet1.updateAddressStreet2(str4 != null ? str4 : "").updateAddressCity(locationData.addressCity).updateAddressSubdivision(locationData.addressSubdivision).updateAddressPostalCode(locationData.addressPostalCode).updateSelectedSearchResultId(null).updateIsAddressAutocompleteLoading(bool);
                updater3.state = UiState.Displaying.copy$default(displaying3, UiComponentKt.updateComponent(displaying3.components, uiComponent3, updateIsAddressAutocompleteLoading), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                updateIsAddressAutocompleteLoading.textControllerForAddressStreet1.setTextValue(updateIsAddressAutocompleteLoading.street1);
                updateIsAddressAutocompleteLoading.textControllerForAddressStreet2.setTextValue(updateIsAddressAutocompleteLoading.street2);
                updateIsAddressAutocompleteLoading.textControllerForAddressCity.setTextValue(updateIsAddressAutocompleteLoading.city);
                updateIsAddressAutocompleteLoading.textControllerForAddressSubdivision.setTextValue(updateIsAddressAutocompleteLoading.subdivision);
                updateIsAddressAutocompleteLoading.textControllerForAddressPostalCode.setTextValue(updateIsAddressAutocompleteLoading.postalCode);
                return Unit.INSTANCE;
            case 6:
                UiState.Displaying displaying4 = (UiState.Displaying) obj4;
                PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) obj2;
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                updater4.state = UiState.Displaying.copy$default(displaying4, UiComponentKt.updateComponent(displaying4.components, (UiComponent) obj3, phoneNumberSnaComponent), null, null, null, new UiState.Displaying.AutoSubmit(phoneNumberSnaComponent, 0, null), null, false, null, null, null, false, null, 0, 65470);
                return Unit.INSTANCE;
            case 7:
                UiState.Displaying displaying5 = (UiState.Displaying) obj4;
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                updater5.state = UiState.Displaying.copy$default(displaying5, UiComponentKt.updateComponent(displaying5.components, (UiComponent) obj3, (InputFileUploadComponent) obj2), null, null, null, null, null, false, null, null, null, false, null, 0, 49150);
                return Unit.INSTANCE;
            case 8:
                VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) obj;
                verifyPersonaButtonComponent.getClass();
                ((UiWorkflow.Screen.EntryScreen) obj4).onVerifyPersonaClick.invoke(verifyPersonaButtonComponent, ((UiScreenRunner) obj3).getComponentsParams((ArrayList) obj2));
                return Unit.INSTANCE;
            case 9:
                TextInputLayout textInputLayout = (TextInputLayout) obj3;
                List list4 = (List) obj;
                list4.getClass();
                Pi2InquiryUiBinding pi2InquiryUiBinding = ((UiScreenRunner) obj4).binding;
                ((ImageView) pi2InquiryUiBinding.navigationBar.binding.navBarBackButton).setEnabled(true);
                textInputLayout.setEnabled(true);
                textInputLayout.requestLayout();
                pi2InquiryUiBinding.navigationBar.setImportantForAccessibility(1);
                pi2InquiryUiBinding.uiStepContainer.setImportantForAccessibility(1);
                ((MultiTextValueComponent) obj2).getSelectedOptionsController().setValue(list4);
                return Unit.INSTANCE;
            case 10:
                UiWorkflow uiWorkflow = (UiWorkflow) obj3;
                UiState.Displaying displaying6 = (UiState.Displaying) obj2;
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                updater6.state = ((VerifyReusablePersonaWorker.Output.Error) ((VerifyReusablePersonaWorker.Output) obj4)).errorInfo instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.copy$default(displaying6, null, null, uiWorkflow.applicationContext.getString(R.string.pi2_network_connection_error), null, null, null, false, null, null, null, false, null, 0, 65391) : UiState.Displaying.copy$default(displaying6, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65407);
                return Unit.INSTANCE;
            case 11:
                GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) obj;
                governmentIdNfcScanComponent2.getClass();
                UiState.Displaying displaying7 = (UiState.Displaying) ((UiState) obj3);
                UiWorkflow.recurse(displaying7.components, new UiWorkflow$$ExternalSyntheticLambda9(true, governmentIdNfcScanComponent2, 0));
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default((UiWorkflow) obj4, new BlurEffectKt$$ExternalSyntheticLambda1(i2, governmentIdNfcScanComponent2, displaying7)));
                return Unit.INSTANCE;
            case 12:
                InputAddressComponent inputAddressComponent2 = (InputAddressComponent) obj3;
                WorkflowAction.Updater updater7 = (WorkflowAction.Updater) obj;
                updater7.getClass();
                UiState.Displaying displaying8 = (UiState.Displaying) ((UiState) obj4);
                updater7.state = UiState.Displaying.copy$default(displaying8, UiComponentKt.updateComponent(displaying8.components, inputAddressComponent2, inputAddressComponent2.updateSelectedSearchResultId((String) obj2).updateIsAddressAutocompleteLoading(Boolean.TRUE)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER);
                return Unit.INSTANCE;
            case 13:
                UiState.PendingAction pendingAction = (UiState.PendingAction) obj4;
                UiWorkflow uiWorkflow2 = (UiWorkflow) obj3;
                UiState.Displaying displaying9 = (UiState.Displaying) obj2;
                CreateReusablePersonaWorker.Output output = (CreateReusablePersonaWorker.Output) obj;
                output.getClass();
                if (((UiState.PendingAction.CreateReusablePersona) pendingAction).createPersonaSheetComponent.autoCompleteOnDismiss) {
                    return Workflows.action$default(uiWorkflow2, new InstantKt$$ExternalSyntheticLambda0(9));
                }
                if (output.equals(complete)) {
                    return Workflows.action$default(uiWorkflow2, new BlurEffectKt$$ExternalSyntheticLambda1(8, displaying9, pendingAction));
                }
                if (output instanceof CreateReusablePersonaWorker.Output.Error) {
                    return Workflows.action$default(uiWorkflow2, new UiWorkflow$$ExternalSyntheticLambda14(output, displaying9, uiWorkflow2, pendingAction, 0));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 14:
                WorkflowAction.Updater updater8 = (WorkflowAction.Updater) obj;
                updater8.getClass();
                updater8.state = UiState.Displaying.copy$default((UiState.Displaying) ((UiState) obj4), null, null, null, null, null, new UiState.PendingAction.VerifyReusablePersona((VerifyPersonaButtonComponent) obj3, (Map) obj2), false, null, null, null, false, null, 0, 65407);
                return Unit.INSTANCE;
            case 15:
                WorkflowAction.Updater updater9 = (WorkflowAction.Updater) obj;
                updater9.getClass();
                updater9.state = UiState.Displaying.copy$default((UiState.Displaying) ((UiState) obj4), null, null, null, null, null, null, true, (Map) obj3, (UiComponent) obj2, null, false, null, 0, 61887);
                return Unit.INSTANCE;
            case 16:
                CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) obj3;
                UiComponent uiComponent4 = (UiComponent) obj2;
                WorkflowAction.Updater updater10 = (WorkflowAction.Updater) obj;
                updater10.getClass();
                UiState.Displaying displaying10 = (UiState.Displaying) ((UiState) obj4);
                List list5 = displaying10.components;
                ButtonComponent buttonComponent = uiComponent4 instanceof ButtonComponent ? (ButtonComponent) uiComponent4 : null;
                if (buttonComponent != null) {
                    buttonComponent.setWasTapped(true);
                }
                updater10.state = UiState.Displaying.copy$default(displaying10, UiComponentKt.updateComponent(list5, createPersonaSheetComponent, CreatePersonaSheetComponentKt.updateComponent(createPersonaSheetComponent, uiComponent4, uiComponent4)), null, null, null, null, new UiState.PendingAction.CreateReusablePersona(createPersonaSheetComponent), false, null, null, null, false, null, 0, 65406);
                return Unit.INSTANCE;
            case 17:
                UiState.Displaying displaying11 = (UiState.Displaying) obj2;
                WorkflowAction.Updater updater11 = (WorkflowAction.Updater) obj;
                updater11.getClass();
                String str5 = ((UiState.Displaying.NfcScan) obj4).component.name;
                GovernmentIdNfcScan.Attributes attributes3 = ((GovernmentIdNfcScanComponent) obj3).config.getAttributes();
                if (attributes3 == null || (str = attributes3.getScanDocumentError()) == null) {
                    str = "";
                }
                updater11.state = UiState.Displaying.copy$default(displaying11, null, CollectionsKt__CollectionsJVMKt.listOf(new UiComponentError.UiInputComponentError(str5, "", str)), null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.DQT_MARKER);
                return Unit.INSTANCE;
            case 18:
                PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) obj4;
                UiState.Displaying displaying12 = (UiState.Displaying) obj3;
                UiState.Displaying.NfcScan nfcScan = (UiState.Displaying.NfcScan) obj2;
                WorkflowAction.Updater updater12 = (WorkflowAction.Updater) obj;
                updater12.getClass();
                Object obj5 = updater12.state;
                UiState.Displaying displaying13 = obj5 instanceof UiState.Displaying ? (UiState.Displaying) obj5 : null;
                if (displaying13 != null && (governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) ExtensionsKt.findFirstComponentOrNull(displaying13.components, Reflection.factory.getOrCreateKotlinClass(GovernmentIdNfcScanComponent.class), new UiWorkflow$$ExternalSyntheticLambda15(nfcScan, 0))) != null) {
                    TextControllerImpl textControllerImpl = governmentIdNfcScanComponent.nfcDataController;
                    PassportNfcReaderOutput.Success success2 = (PassportNfcReaderOutput.Success) passportNfcReaderOutput;
                    GovernmentIdNfcData governmentIdNfcData = new GovernmentIdNfcData(success2.dg1Uri, success2.dg2Uri, success2.sodUri, success2.chipAuthenticationStatus);
                    StateFlowImpl stateFlowImpl = textControllerImpl._textValue;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, governmentIdNfcData);
                    updater12.state = ComponentWorkHelperKt.autoSubmitState(displaying12, success2.submitButtonComponentName);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 19:
                SubtreeManager subtreeManager = (SubtreeManager) obj4;
                UiComponent uiComponent5 = (UiComponent) obj3;
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = (TextFieldUIKt$TextField$4$1) obj2;
                UiAddressDetailsWorker.Response response4 = (UiAddressDetailsWorker.Response) obj;
                response4.getClass();
                WorkflowState state = subtreeManager.getState();
                UiState.Displaying displaying14 = state instanceof UiState.Displaying ? (UiState.Displaying) state : null;
                if (displaying14 == null) {
                    return Unit.INSTANCE;
                }
                List list6 = displaying14.components;
                UiComponent findComponent = UiComponentKt.findComponent(((InputAddressComponent) uiComponent5).name, list6);
                InputAddressComponent inputAddressComponent3 = findComponent instanceof InputAddressComponent ? (InputAddressComponent) findComponent : null;
                if (inputAddressComponent3 == null) {
                    return Unit.INSTANCE;
                }
                if (response4 instanceof UiAddressDetailsWorker.Response.Success) {
                    Boolean bool2 = Boolean.FALSE;
                    InputAddressComponent updateCollapsedState = inputAddressComponent3.updateCollapsedState(bool2);
                    LocationData locationData2 = ((UiAddressDetailsWorker.Response.Success) response4).result;
                    InputAddressComponent updateAddressStreet12 = updateCollapsedState.updateAddressStreet1(locationData2.addressStreet1);
                    String str6 = locationData2.addressStreet2;
                    InputAddressComponent updateIsAddressAutocompleteLoading2 = updateAddressStreet12.updateAddressStreet2(str6 != null ? str6 : "").updateAddressCity(locationData2.addressCity).updateAddressSubdivision(locationData2.addressSubdivision).updateAddressPostalCode(locationData2.addressPostalCode).updateSearchQuery(null).updateSelectedSearchResultId(null).updateIsAddressAutocompleteLoading(bool2);
                    subtreeManager.updateState(UiState.Displaying.copy$default(displaying14, UiComponentKt.updateComponent(list6, inputAddressComponent3, updateIsAddressAutocompleteLoading2), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                    updateIsAddressAutocompleteLoading2.textControllerForAddressStreet1.setTextValue(updateIsAddressAutocompleteLoading2.street1);
                    updateIsAddressAutocompleteLoading2.textControllerForAddressStreet2.setTextValue(updateIsAddressAutocompleteLoading2.street2);
                    updateIsAddressAutocompleteLoading2.textControllerForAddressCity.setTextValue(updateIsAddressAutocompleteLoading2.city);
                    updateIsAddressAutocompleteLoading2.textControllerForAddressSubdivision.setTextValue(updateIsAddressAutocompleteLoading2.subdivision);
                    updateIsAddressAutocompleteLoading2.textControllerForAddressPostalCode.setTextValue(updateIsAddressAutocompleteLoading2.postalCode);
                } else {
                    if (!(response4 instanceof UiAddressDetailsWorker.Response.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    textFieldUIKt$TextField$4$1.invoke(new UiWorkflow.Output.Error(((UiAddressDetailsWorker.Response.Error) response4).cause));
                }
                return Unit.INSTANCE;
            case 20:
                UiStepStateManager uiStepStateManager = (UiStepStateManager) obj4;
                UiWorkflow.Input input = (UiWorkflow.Input) obj3;
                final UiComponent uiComponent6 = (UiComponent) obj;
                uiComponent6.getClass();
                final UiStepComponentWorkHelper uiStepComponentWorkHelper = uiStepStateManager.componentWorkHelper;
                final UiState.Displaying displaying15 = (UiState.Displaying) ((UiState) obj2);
                final SubtreeManager subtreeManager2 = (SubtreeManager) uiStepStateManager.lastChild;
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$12 = new TextFieldUIKt$TextField$4$1(1, uiStepStateManager, UiStepStateManager.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0, 27);
                uiStepComponentWorkHelper.getClass();
                input.getClass();
                String str7 = input.sessionToken;
                displaying15.getClass();
                subtreeManager2.getClass();
                if (uiComponent6 instanceof SingleTextValueComponent) {
                    final int i6 = 0;
                    subtreeManager2.runningWorker(new RealWebSocket$connect$1(uiComponent6.getName(), ((SingleTextValueComponent) uiComponent6).getTextController().onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i7 = i6;
                            UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                            UiComponent uiComponent7 = uiComponent6;
                            SubtreeManager subtreeManager3 = subtreeManager2;
                            switch (i7) {
                                case 0:
                                    String str8 = (String) obj6;
                                    str8.getClass();
                                    UiState.Displaying displaying16 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str8)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str8.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 1:
                                    String str9 = (String) obj6;
                                    UiState.Displaying displaying17 = displaying15;
                                    ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str9));
                                    if (str9 != null && str9.length() != 0) {
                                        r2 = false;
                                    }
                                    List list7 = displaying17.componentErrors;
                                    String str10 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str10, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 2:
                                    List list8 = (List) obj6;
                                    list8.getClass();
                                    UiState.Displaying displaying18 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 3:
                                    List list9 = (List) obj6;
                                    list9.getClass();
                                    UiState.Displaying displaying19 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 4:
                                    List list10 = (List) obj6;
                                    list10.getClass();
                                    UiState.Displaying displaying20 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 5:
                                    String str11 = (String) obj6;
                                    str11.getClass();
                                    UiState.Displaying displaying21 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str11.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 6:
                                    List list11 = (List) obj6;
                                    list11.getClass();
                                    UiState.Displaying displaying22 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 7:
                                    Set set = (Set) obj6;
                                    set.getClass();
                                    UiState.Displaying displaying23 = displaying15;
                                    List list12 = displaying23.components;
                                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                    inputCheckboxGroupComponent.getClass();
                                    String str12 = inputCheckboxGroupComponent.name;
                                    JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                    JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                    str12.getClass();
                                    InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                    BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                    bitmapController.getClass();
                                    inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 8:
                                    Number number = (Number) obj6;
                                    UiState.Displaying displaying24 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 9:
                                    String str13 = (String) obj6;
                                    UiState.Displaying displaying25 = displaying15;
                                    ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                    if (str13 != null && str13.length() != 0) {
                                        r2 = false;
                                    }
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 10:
                                    String str14 = (String) obj6;
                                    str14.getClass();
                                    UiState.Displaying displaying26 = displaying15;
                                    ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                    r2 = str14.length() == 0;
                                    List list13 = displaying26.componentErrors;
                                    String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 11:
                                    String str16 = (String) obj6;
                                    str16.getClass();
                                    UiState.Displaying displaying27 = displaying15;
                                    ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                    r2 = str16.length() == 0;
                                    List list14 = displaying27.componentErrors;
                                    String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                default:
                                    String str18 = (String) obj6;
                                    UiState.Displaying displaying28 = displaying15;
                                    ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                    if (str18 != null && str18.length() != 0) {
                                        r2 = false;
                                    }
                                    List list15 = displaying28.componentErrors;
                                    String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    if (uiComponent6 instanceof InputPhoneNumberComponent) {
                        InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent6;
                        final int i7 = 2;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(inputPhoneNumberComponent.name, ":country"), inputPhoneNumberComponent.countryCodeOptionsController.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i7;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str8 = (String) obj6;
                                        str8.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str8)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str8.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str9 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str9));
                                        if (str9 != null && str9.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str10 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str10, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str11.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str12 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str12.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                } else if (uiComponent6 instanceof MultiTextValueComponent) {
                    final int i8 = 6;
                    subtreeManager2.runningWorker(new RealWebSocket$connect$1(uiComponent6.getName(), ((MultiTextValueComponent) uiComponent6).getSelectedOptionsController().onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i72 = i8;
                            UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                            UiComponent uiComponent7 = uiComponent6;
                            SubtreeManager subtreeManager3 = subtreeManager2;
                            switch (i72) {
                                case 0:
                                    String str8 = (String) obj6;
                                    str8.getClass();
                                    UiState.Displaying displaying16 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str8)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str8.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 1:
                                    String str9 = (String) obj6;
                                    UiState.Displaying displaying17 = displaying15;
                                    ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str9));
                                    if (str9 != null && str9.length() != 0) {
                                        r2 = false;
                                    }
                                    List list7 = displaying17.componentErrors;
                                    String str10 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str10, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 2:
                                    List list8 = (List) obj6;
                                    list8.getClass();
                                    UiState.Displaying displaying18 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 3:
                                    List list9 = (List) obj6;
                                    list9.getClass();
                                    UiState.Displaying displaying19 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 4:
                                    List list10 = (List) obj6;
                                    list10.getClass();
                                    UiState.Displaying displaying20 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 5:
                                    String str11 = (String) obj6;
                                    str11.getClass();
                                    UiState.Displaying displaying21 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str11.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 6:
                                    List list11 = (List) obj6;
                                    list11.getClass();
                                    UiState.Displaying displaying22 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 7:
                                    Set set = (Set) obj6;
                                    set.getClass();
                                    UiState.Displaying displaying23 = displaying15;
                                    List list12 = displaying23.components;
                                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                    inputCheckboxGroupComponent.getClass();
                                    String str12 = inputCheckboxGroupComponent.name;
                                    JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                    JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                    str12.getClass();
                                    InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                    BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                    bitmapController.getClass();
                                    inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 8:
                                    Number number = (Number) obj6;
                                    UiState.Displaying displaying24 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 9:
                                    String str13 = (String) obj6;
                                    UiState.Displaying displaying25 = displaying15;
                                    ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                    if (str13 != null && str13.length() != 0) {
                                        r2 = false;
                                    }
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 10:
                                    String str14 = (String) obj6;
                                    str14.getClass();
                                    UiState.Displaying displaying26 = displaying15;
                                    ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                    r2 = str14.length() == 0;
                                    List list13 = displaying26.componentErrors;
                                    String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 11:
                                    String str16 = (String) obj6;
                                    str16.getClass();
                                    UiState.Displaying displaying27 = displaying15;
                                    ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                    r2 = str16.length() == 0;
                                    List list14 = displaying27.componentErrors;
                                    String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                default:
                                    String str18 = (String) obj6;
                                    UiState.Displaying displaying28 = displaying15;
                                    ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                    if (str18 != null && str18.length() != 0) {
                                        r2 = false;
                                    }
                                    List list15 = displaying28.componentErrors;
                                    String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                } else if (uiComponent6 instanceof StringSetValueComponent) {
                    final int i9 = 7;
                    subtreeManager2.runningWorker(new RealWebSocket$connect$1(uiComponent6.getName(), ((InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent6)).stringSetController.onChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i72 = i9;
                            UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                            UiComponent uiComponent7 = uiComponent6;
                            SubtreeManager subtreeManager3 = subtreeManager2;
                            switch (i72) {
                                case 0:
                                    String str8 = (String) obj6;
                                    str8.getClass();
                                    UiState.Displaying displaying16 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str8)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str8.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 1:
                                    String str9 = (String) obj6;
                                    UiState.Displaying displaying17 = displaying15;
                                    ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str9));
                                    if (str9 != null && str9.length() != 0) {
                                        r2 = false;
                                    }
                                    List list7 = displaying17.componentErrors;
                                    String str10 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str10, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 2:
                                    List list8 = (List) obj6;
                                    list8.getClass();
                                    UiState.Displaying displaying18 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 3:
                                    List list9 = (List) obj6;
                                    list9.getClass();
                                    UiState.Displaying displaying19 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 4:
                                    List list10 = (List) obj6;
                                    list10.getClass();
                                    UiState.Displaying displaying20 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 5:
                                    String str11 = (String) obj6;
                                    str11.getClass();
                                    UiState.Displaying displaying21 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str11.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 6:
                                    List list11 = (List) obj6;
                                    list11.getClass();
                                    UiState.Displaying displaying22 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 7:
                                    Set set = (Set) obj6;
                                    set.getClass();
                                    UiState.Displaying displaying23 = displaying15;
                                    List list12 = displaying23.components;
                                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                    inputCheckboxGroupComponent.getClass();
                                    String str12 = inputCheckboxGroupComponent.name;
                                    JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                    JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                    str12.getClass();
                                    InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                    BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                    bitmapController.getClass();
                                    inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 8:
                                    Number number = (Number) obj6;
                                    UiState.Displaying displaying24 = displaying15;
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 9:
                                    String str13 = (String) obj6;
                                    UiState.Displaying displaying25 = displaying15;
                                    ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                    if (str13 != null && str13.length() != 0) {
                                        r2 = false;
                                    }
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 10:
                                    String str14 = (String) obj6;
                                    str14.getClass();
                                    UiState.Displaying displaying26 = displaying15;
                                    ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                    r2 = str14.length() == 0;
                                    List list13 = displaying26.componentErrors;
                                    String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                case 11:
                                    String str16 = (String) obj6;
                                    str16.getClass();
                                    UiState.Displaying displaying27 = displaying15;
                                    ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                    r2 = str16.length() == 0;
                                    List list14 = displaying27.componentErrors;
                                    String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                                default:
                                    String str18 = (String) obj6;
                                    UiState.Displaying displaying28 = displaying15;
                                    ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                    if (str18 != null && str18.length() != 0) {
                                        r2 = false;
                                    }
                                    List list15 = displaying28.componentErrors;
                                    String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                    uiStepComponentWorkHelper2.getClass();
                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                } else {
                    final int i10 = 4;
                    final int i11 = 3;
                    final int i12 = 2;
                    if (uiComponent6 instanceof InputAddressComponent) {
                        InputAddressComponent inputAddressComponent4 = (InputAddressComponent) uiComponent6;
                        String str8 = inputAddressComponent4.name;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str8, "UpdateCollapsedState"), inputAddressComponent4.isAddressFieldCollapsed.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i13 = i5;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i13) {
                                    case 0:
                                        WorkflowState state2 = subtreeManager3.getState();
                                        UiState.Displaying displaying16 = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                                        if (displaying16 != null) {
                                            List list7 = displaying16.components;
                                            UiComponent findComponent2 = UiComponentKt.findComponent(((InputAddressComponent) uiComponent7).name, list7);
                                            InputAddressComponent inputAddressComponent5 = findComponent2 instanceof InputAddressComponent ? (InputAddressComponent) findComponent2 : null;
                                            if (inputAddressComponent5 != null) {
                                                if (obj6 instanceof UiAddressAutocompleteWorker.Response.Success) {
                                                    InputAddressComponent copy$default2 = InputAddressComponent.copy$default(inputAddressComponent5, null, null, null, null, null, null, ((UiAddressAutocompleteWorker.Response.Success) obj6).results, null, null, null, 15359);
                                                    InputAddressComponentKt.access$copyControllers(copy$default2, inputAddressComponent5);
                                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(list7, inputAddressComponent5, copy$default2.updateSearchQuery(null).updateSelectedSearchResultId(null)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                                                }
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    default:
                                        Boolean bool3 = (Boolean) obj6;
                                        bool3.getClass();
                                        WorkflowState state3 = subtreeManager3.getState();
                                        UiState.Displaying displaying17 = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                                        if (displaying17 != null) {
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateCollapsedState(bool3)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str8, "UpdateAddressStreet1"), inputAddressComponent4.textControllerForAddressStreet1.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                boolean z;
                                int i13 = i4;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i13) {
                                    case 0:
                                        String str9 = (String) obj6;
                                        str9.getClass();
                                        WorkflowState state2 = subtreeManager3.getState();
                                        UiState.Displaying displaying16 = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                                        if (displaying16 != null) {
                                            ArrayList updateComponent = UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet1(str9).updateSearchQuery(str9));
                                            z = str9.length() == 0;
                                            List list7 = displaying16.componentErrors;
                                            String name = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, updateComponent, UiStepComponentWorkHelper.getComponentErrors(name, "street_1", list7, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        String str10 = (String) obj6;
                                        str10.getClass();
                                        WorkflowState state3 = subtreeManager3.getState();
                                        UiState.Displaying displaying17 = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                                        if (displaying17 != null) {
                                            ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet2(str10));
                                            z = str10.length() == 0;
                                            List list8 = displaying17.componentErrors;
                                            String name2 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent2, UiStepComponentWorkHelper.getComponentErrors(name2, "street_2", list8, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        WorkflowState state4 = subtreeManager3.getState();
                                        UiState.Displaying displaying18 = state4 instanceof UiState.Displaying ? (UiState.Displaying) state4 : null;
                                        if (displaying18 != null) {
                                            ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressCity(str11));
                                            z = str11.length() == 0;
                                            List list9 = displaying18.componentErrors;
                                            String name3 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(name3, "city", list9, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        String str12 = (String) obj6;
                                        str12.getClass();
                                        WorkflowState state5 = subtreeManager3.getState();
                                        UiState.Displaying displaying19 = state5 instanceof UiState.Displaying ? (UiState.Displaying) state5 : null;
                                        if (displaying19 != null) {
                                            ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressSubdivision(str12));
                                            z = str12.length() == 0;
                                            List list10 = displaying19.componentErrors;
                                            String name4 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(name4, "subdivision", list10, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    default:
                                        String str13 = (String) obj6;
                                        str13.getClass();
                                        WorkflowState state6 = subtreeManager3.getState();
                                        UiState.Displaying displaying20 = state6 instanceof UiState.Displaying ? (UiState.Displaying) state6 : null;
                                        if (displaying20 != null) {
                                            ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressPostalCode(str13));
                                            z = str13.length() == 0;
                                            List list11 = displaying20.componentErrors;
                                            String name5 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(name5, "postal_code", list11, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str8, "UpdateAddressStreet2"), inputAddressComponent4.textControllerForAddressStreet2.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                boolean z;
                                int i13 = i5;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i13) {
                                    case 0:
                                        String str9 = (String) obj6;
                                        str9.getClass();
                                        WorkflowState state2 = subtreeManager3.getState();
                                        UiState.Displaying displaying16 = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                                        if (displaying16 != null) {
                                            ArrayList updateComponent = UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet1(str9).updateSearchQuery(str9));
                                            z = str9.length() == 0;
                                            List list7 = displaying16.componentErrors;
                                            String name = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, updateComponent, UiStepComponentWorkHelper.getComponentErrors(name, "street_1", list7, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        String str10 = (String) obj6;
                                        str10.getClass();
                                        WorkflowState state3 = subtreeManager3.getState();
                                        UiState.Displaying displaying17 = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                                        if (displaying17 != null) {
                                            ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet2(str10));
                                            z = str10.length() == 0;
                                            List list8 = displaying17.componentErrors;
                                            String name2 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent2, UiStepComponentWorkHelper.getComponentErrors(name2, "street_2", list8, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        WorkflowState state4 = subtreeManager3.getState();
                                        UiState.Displaying displaying18 = state4 instanceof UiState.Displaying ? (UiState.Displaying) state4 : null;
                                        if (displaying18 != null) {
                                            ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressCity(str11));
                                            z = str11.length() == 0;
                                            List list9 = displaying18.componentErrors;
                                            String name3 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(name3, "city", list9, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        String str12 = (String) obj6;
                                        str12.getClass();
                                        WorkflowState state5 = subtreeManager3.getState();
                                        UiState.Displaying displaying19 = state5 instanceof UiState.Displaying ? (UiState.Displaying) state5 : null;
                                        if (displaying19 != null) {
                                            ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressSubdivision(str12));
                                            z = str12.length() == 0;
                                            List list10 = displaying19.componentErrors;
                                            String name4 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(name4, "subdivision", list10, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    default:
                                        String str13 = (String) obj6;
                                        str13.getClass();
                                        WorkflowState state6 = subtreeManager3.getState();
                                        UiState.Displaying displaying20 = state6 instanceof UiState.Displaying ? (UiState.Displaying) state6 : null;
                                        if (displaying20 != null) {
                                            ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressPostalCode(str13));
                                            z = str13.length() == 0;
                                            List list11 = displaying20.componentErrors;
                                            String name5 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(name5, "postal_code", list11, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str8, "UpdateAddressCity"), inputAddressComponent4.textControllerForAddressCity.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                boolean z;
                                int i13 = i12;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i13) {
                                    case 0:
                                        String str9 = (String) obj6;
                                        str9.getClass();
                                        WorkflowState state2 = subtreeManager3.getState();
                                        UiState.Displaying displaying16 = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                                        if (displaying16 != null) {
                                            ArrayList updateComponent = UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet1(str9).updateSearchQuery(str9));
                                            z = str9.length() == 0;
                                            List list7 = displaying16.componentErrors;
                                            String name = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, updateComponent, UiStepComponentWorkHelper.getComponentErrors(name, "street_1", list7, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        String str10 = (String) obj6;
                                        str10.getClass();
                                        WorkflowState state3 = subtreeManager3.getState();
                                        UiState.Displaying displaying17 = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                                        if (displaying17 != null) {
                                            ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet2(str10));
                                            z = str10.length() == 0;
                                            List list8 = displaying17.componentErrors;
                                            String name2 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent2, UiStepComponentWorkHelper.getComponentErrors(name2, "street_2", list8, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        WorkflowState state4 = subtreeManager3.getState();
                                        UiState.Displaying displaying18 = state4 instanceof UiState.Displaying ? (UiState.Displaying) state4 : null;
                                        if (displaying18 != null) {
                                            ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressCity(str11));
                                            z = str11.length() == 0;
                                            List list9 = displaying18.componentErrors;
                                            String name3 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(name3, "city", list9, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        String str12 = (String) obj6;
                                        str12.getClass();
                                        WorkflowState state5 = subtreeManager3.getState();
                                        UiState.Displaying displaying19 = state5 instanceof UiState.Displaying ? (UiState.Displaying) state5 : null;
                                        if (displaying19 != null) {
                                            ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressSubdivision(str12));
                                            z = str12.length() == 0;
                                            List list10 = displaying19.componentErrors;
                                            String name4 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(name4, "subdivision", list10, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    default:
                                        String str13 = (String) obj6;
                                        str13.getClass();
                                        WorkflowState state6 = subtreeManager3.getState();
                                        UiState.Displaying displaying20 = state6 instanceof UiState.Displaying ? (UiState.Displaying) state6 : null;
                                        if (displaying20 != null) {
                                            ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressPostalCode(str13));
                                            z = str13.length() == 0;
                                            List list11 = displaying20.componentErrors;
                                            String name5 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(name5, "postal_code", list11, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str8, "UpdateAddressSubdivision"), inputAddressComponent4.textControllerForAddressSubdivision.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                boolean z;
                                int i13 = i11;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i13) {
                                    case 0:
                                        String str9 = (String) obj6;
                                        str9.getClass();
                                        WorkflowState state2 = subtreeManager3.getState();
                                        UiState.Displaying displaying16 = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                                        if (displaying16 != null) {
                                            ArrayList updateComponent = UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet1(str9).updateSearchQuery(str9));
                                            z = str9.length() == 0;
                                            List list7 = displaying16.componentErrors;
                                            String name = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, updateComponent, UiStepComponentWorkHelper.getComponentErrors(name, "street_1", list7, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        String str10 = (String) obj6;
                                        str10.getClass();
                                        WorkflowState state3 = subtreeManager3.getState();
                                        UiState.Displaying displaying17 = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                                        if (displaying17 != null) {
                                            ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet2(str10));
                                            z = str10.length() == 0;
                                            List list8 = displaying17.componentErrors;
                                            String name2 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent2, UiStepComponentWorkHelper.getComponentErrors(name2, "street_2", list8, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        WorkflowState state4 = subtreeManager3.getState();
                                        UiState.Displaying displaying18 = state4 instanceof UiState.Displaying ? (UiState.Displaying) state4 : null;
                                        if (displaying18 != null) {
                                            ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressCity(str11));
                                            z = str11.length() == 0;
                                            List list9 = displaying18.componentErrors;
                                            String name3 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(name3, "city", list9, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        String str12 = (String) obj6;
                                        str12.getClass();
                                        WorkflowState state5 = subtreeManager3.getState();
                                        UiState.Displaying displaying19 = state5 instanceof UiState.Displaying ? (UiState.Displaying) state5 : null;
                                        if (displaying19 != null) {
                                            ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressSubdivision(str12));
                                            z = str12.length() == 0;
                                            List list10 = displaying19.componentErrors;
                                            String name4 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(name4, "subdivision", list10, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    default:
                                        String str13 = (String) obj6;
                                        str13.getClass();
                                        WorkflowState state6 = subtreeManager3.getState();
                                        UiState.Displaying displaying20 = state6 instanceof UiState.Displaying ? (UiState.Displaying) state6 : null;
                                        if (displaying20 != null) {
                                            ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressPostalCode(str13));
                                            z = str13.length() == 0;
                                            List list11 = displaying20.componentErrors;
                                            String name5 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(name5, "postal_code", list11, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str8, "UpdateAddressPostalCode"), inputAddressComponent4.textControllerForAddressPostalCode.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda24
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                boolean z;
                                int i13 = i10;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i13) {
                                    case 0:
                                        String str9 = (String) obj6;
                                        str9.getClass();
                                        WorkflowState state2 = subtreeManager3.getState();
                                        UiState.Displaying displaying16 = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                                        if (displaying16 != null) {
                                            ArrayList updateComponent = UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet1(str9).updateSearchQuery(str9));
                                            z = str9.length() == 0;
                                            List list7 = displaying16.componentErrors;
                                            String name = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, updateComponent, UiStepComponentWorkHelper.getComponentErrors(name, "street_1", list7, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        String str10 = (String) obj6;
                                        str10.getClass();
                                        WorkflowState state3 = subtreeManager3.getState();
                                        UiState.Displaying displaying17 = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                                        if (displaying17 != null) {
                                            ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressStreet2(str10));
                                            z = str10.length() == 0;
                                            List list8 = displaying17.componentErrors;
                                            String name2 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent2, UiStepComponentWorkHelper.getComponentErrors(name2, "street_2", list8, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        WorkflowState state4 = subtreeManager3.getState();
                                        UiState.Displaying displaying18 = state4 instanceof UiState.Displaying ? (UiState.Displaying) state4 : null;
                                        if (displaying18 != null) {
                                            ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressCity(str11));
                                            z = str11.length() == 0;
                                            List list9 = displaying18.componentErrors;
                                            String name3 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(name3, "city", list9, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        String str12 = (String) obj6;
                                        str12.getClass();
                                        WorkflowState state5 = subtreeManager3.getState();
                                        UiState.Displaying displaying19 = state5 instanceof UiState.Displaying ? (UiState.Displaying) state5 : null;
                                        if (displaying19 != null) {
                                            ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressSubdivision(str12));
                                            z = str12.length() == 0;
                                            List list10 = displaying19.componentErrors;
                                            String name4 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(name4, "subdivision", list10, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                    default:
                                        String str13 = (String) obj6;
                                        str13.getClass();
                                        WorkflowState state6 = subtreeManager3.getState();
                                        UiState.Displaying displaying20 = state6 instanceof UiState.Displaying ? (UiState.Displaying) state6 : null;
                                        if (displaying20 != null) {
                                            ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateAddressPostalCode(str13));
                                            z = str13.length() == 0;
                                            List list11 = displaying20.componentErrors;
                                            String name5 = uiComponent7.getName();
                                            uiStepComponentWorkHelper2.getClass();
                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(name5, "postal_code", list11, z), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        if (inputAddressComponent4.autocompleteMethod == AddressAutocompleteMethod.Server) {
                            String str9 = inputAddressComponent4.searchQuery;
                            if (str9 != null) {
                                Pool pool = uiStepComponentWorkHelper.addressAutocompleteWorker;
                                pool.getClass();
                                str7.getClass();
                                subtreeManager2.runningWorker(new NamedWorkflowWorker(Recorder$$ExternalSyntheticOutline2.m("autocomplete_", str8), new UiAddressAutocompleteWorker(str7, uiComponent6, str9, (UiService) pool.pool)), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        int i13 = i4;
                                        UiComponent uiComponent7 = uiComponent6;
                                        SubtreeManager subtreeManager3 = subtreeManager2;
                                        switch (i13) {
                                            case 0:
                                                WorkflowState state2 = subtreeManager3.getState();
                                                UiState.Displaying displaying16 = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                                                if (displaying16 != null) {
                                                    List list7 = displaying16.components;
                                                    UiComponent findComponent2 = UiComponentKt.findComponent(((InputAddressComponent) uiComponent7).name, list7);
                                                    InputAddressComponent inputAddressComponent5 = findComponent2 instanceof InputAddressComponent ? (InputAddressComponent) findComponent2 : null;
                                                    if (inputAddressComponent5 != null) {
                                                        if (obj6 instanceof UiAddressAutocompleteWorker.Response.Success) {
                                                            InputAddressComponent copy$default2 = InputAddressComponent.copy$default(inputAddressComponent5, null, null, null, null, null, null, ((UiAddressAutocompleteWorker.Response.Success) obj6).results, null, null, null, 15359);
                                                            InputAddressComponentKt.access$copyControllers(copy$default2, inputAddressComponent5);
                                                            subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(list7, inputAddressComponent5, copy$default2.updateSearchQuery(null).updateSelectedSearchResultId(null)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                                                        }
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            default:
                                                Boolean bool3 = (Boolean) obj6;
                                                bool3.getClass();
                                                WorkflowState state3 = subtreeManager3.getState();
                                                UiState.Displaying displaying17 = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                                                if (displaying17 != null) {
                                                    subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((InputAddressComponent) uiComponent7).updateCollapsedState(bool3)), null, null, null, null, null, false, null, null, null, false, null, 0, JpegConstants.COM_MARKER));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                            String str10 = inputAddressComponent4.selectedSearchResultId;
                            if (str10 != null) {
                                MatchResult.Destructured destructured = uiStepComponentWorkHelper.addressDetailsWorker;
                                destructured.getClass();
                                str7.getClass();
                                subtreeManager2.runningWorker(new UiAddressDetailsWorker(str7, str10, (UiService) destructured.match), new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(19, subtreeManager2, uiComponent6, textFieldUIKt$TextField$4$12));
                            }
                        }
                    } else if (uiComponent6 instanceof SingleBooleanValueComponent) {
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(uiComponent6.getName(), ((InputCheckboxComponent) ((SingleBooleanValueComponent) uiComponent6)).twoStateViewController.onTextChanged), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(subtreeManager2, displaying15, uiComponent6, i4));
                    } else if (uiComponent6 instanceof SingleNumberValueComponent) {
                        final int i13 = 8;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(uiComponent6.getName(), ((SingleNumberValueComponent) uiComponent6).getNumberController().onChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i13;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str11.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str12 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str12.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else if (uiComponent6 instanceof BitmapValueComponent) {
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(uiComponent6.getName(), ((ESignatureComponent) ((BitmapValueComponent) uiComponent6)).bitmapController.onChanged), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(subtreeManager2, displaying15, uiComponent6, 7));
                    } else if (uiComponent6 instanceof DateValueComponent) {
                        final int i14 = 9;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(uiComponent6.getName(), (SafeFlow) ((InputDateComponent) ((DateValueComponent) uiComponent6)).dateController.spansFactory), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i14;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str11 = (String) obj6;
                                        str11.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str11.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str12 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str12.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else if (uiComponent6 instanceof GovernmentIdNfcScanComponent) {
                        GovernmentIdNfcScanComponent governmentIdNfcScanComponent3 = (GovernmentIdNfcScanComponent) uiComponent6;
                        String str11 = governmentIdNfcScanComponent3.name;
                        final int i15 = 10;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str11, "UpdateCardAccessNumber"), governmentIdNfcScanComponent3.cardAccessNumberController.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i15;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str112 = (String) obj6;
                                        str112.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str112)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str112.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str12 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str12.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        final int i16 = 11;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str11, "UpdateDocumentNumber"), governmentIdNfcScanComponent3.documentNumberController.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i16;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str112 = (String) obj6;
                                        str112.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str112)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str112.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str12 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str12.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        final int i17 = 12;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str11, "UpdateDateOfBirth"), (SafeFlow) governmentIdNfcScanComponent3.dateOfBirthController.spansFactory), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i17;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str112 = (String) obj6;
                                        str112.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str112)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str112.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str12 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str12.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        final int i18 = 1;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str11, "UpdateExpirationDate"), (SafeFlow) governmentIdNfcScanComponent3.expirationDateController.spansFactory), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i18;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str112 = (String) obj6;
                                        str112.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str112)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str112.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str12 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str12.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str12, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(str11, governmentIdNfcScanComponent3.nfcDataController.onTextChanged), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(subtreeManager2, displaying15, uiComponent6, i5));
                    } else if (uiComponent6 instanceof InputInternationalDbComponent) {
                        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent6;
                        String str12 = inputInternationalDbComponent.name;
                        final int i19 = 3;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str12, ":country"), inputInternationalDbComponent.countryOptionsController.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i19;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str112 = (String) obj6;
                                        str112.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str112)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str112.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str122 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str122.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str122, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        final int i20 = 4;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str12, ":idType"), inputInternationalDbComponent.idTypeOptionsController.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i20;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str112 = (String) obj6;
                                        str112.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str112)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str112.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str122 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str122.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str122, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                        final int i21 = 5;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str12, ":idValue"), inputInternationalDbComponent.idValueController.onTextChanged), new Function1() { // from class: com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                int i72 = i21;
                                UiStepComponentWorkHelper uiStepComponentWorkHelper2 = uiStepComponentWorkHelper;
                                UiComponent uiComponent7 = uiComponent6;
                                SubtreeManager subtreeManager3 = subtreeManager2;
                                switch (i72) {
                                    case 0:
                                        String str82 = (String) obj6;
                                        str82.getClass();
                                        UiState.Displaying displaying16 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, uiComponent7, ((SingleTextValueComponent) uiComponent7).update(str82)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str82.length() == 0, displaying16.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 1:
                                        String str92 = (String) obj6;
                                        UiState.Displaying displaying17 = displaying15;
                                        ArrayList updateComponent = UiComponentKt.updateComponent(displaying17.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateExpirationDate(str92));
                                        if (str92 != null && str92.length() != 0) {
                                            r2 = false;
                                        }
                                        List list7 = displaying17.componentErrors;
                                        String str102 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying17, updateComponent, UiStepComponentWorkHelper.getComponentErrors(str102, GovernmentIdNfcScan.expirationDateName, list7, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 2:
                                        List list8 = (List) obj6;
                                        list8.getClass();
                                        UiState.Displaying displaying18 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying18, UiComponentKt.updateComponent(displaying18.components, uiComponent7, ((InputPhoneNumberComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list8))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list8.isEmpty(), displaying18.componentErrors, ((InputPhoneNumberComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 3:
                                        List list9 = (List) obj6;
                                        list9.getClass();
                                        UiState.Displaying displaying19 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying19, UiComponentKt.updateComponent(displaying19.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedCountry((Option) CollectionsKt.firstOrNull(list9))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list9.isEmpty(), displaying19.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 4:
                                        List list10 = (List) obj6;
                                        list10.getClass();
                                        UiState.Displaying displaying20 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying20, UiComponentKt.updateComponent(displaying20.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateSelectedIdType((Option) CollectionsKt.firstOrNull(list10))), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list10.isEmpty(), displaying20.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 5:
                                        String str112 = (String) obj6;
                                        str112.getClass();
                                        UiState.Displaying displaying21 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying21, UiComponentKt.updateComponent(displaying21.components, uiComponent7, ((InputInternationalDbComponent) uiComponent7).updateValue(str112)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, str112.length() == 0, displaying21.componentErrors, ((InputInternationalDbComponent) uiComponent7).name), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 6:
                                        List list11 = (List) obj6;
                                        list11.getClass();
                                        UiState.Displaying displaying22 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying22, UiComponentKt.updateComponent(displaying22.components, uiComponent7, ((MultiTextValueComponent) uiComponent7).update(list11)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, list11.isEmpty(), displaying22.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 7:
                                        Set set = (Set) obj6;
                                        set.getClass();
                                        UiState.Displaying displaying23 = displaying15;
                                        List list12 = displaying23.components;
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) ((StringSetValueComponent) uiComponent7);
                                        inputCheckboxGroupComponent.getClass();
                                        String str122 = inputCheckboxGroupComponent.name;
                                        JsonLogicBoolean jsonLogicBoolean = inputCheckboxGroupComponent.hidden;
                                        JsonLogicBoolean jsonLogicBoolean2 = inputCheckboxGroupComponent.disabled;
                                        str122.getClass();
                                        InputCheckboxGroupComponent inputCheckboxGroupComponent2 = new InputCheckboxGroupComponent(str122, set, jsonLogicBoolean, jsonLogicBoolean2);
                                        BitmapController bitmapController = inputCheckboxGroupComponent.stringSetController;
                                        bitmapController.getClass();
                                        inputCheckboxGroupComponent2.stringSetController = bitmapController;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying23, UiComponentKt.updateComponent(list12, uiComponent7, inputCheckboxGroupComponent2), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, set.isEmpty(), displaying23.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 8:
                                        Number number = (Number) obj6;
                                        UiState.Displaying displaying24 = displaying15;
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying24, UiComponentKt.updateComponent(displaying24.components, uiComponent7, ((SingleNumberValueComponent) uiComponent7).update(number)), UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, number == null, displaying24.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 9:
                                        String str13 = (String) obj6;
                                        UiState.Displaying displaying25 = displaying15;
                                        ArrayList updateComponent2 = UiComponentKt.updateComponent(displaying25.components, uiComponent7, ((InputDateComponent) ((DateValueComponent) uiComponent7)).update(str13));
                                        if (str13 != null && str13.length() != 0) {
                                            r2 = false;
                                        }
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying25, updateComponent2, UiStepComponentWorkHelper.getComponentErrors$default(uiStepComponentWorkHelper2, r2, displaying25.componentErrors, uiComponent7.getName()), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 10:
                                        String str14 = (String) obj6;
                                        str14.getClass();
                                        UiState.Displaying displaying26 = displaying15;
                                        ArrayList updateComponent3 = UiComponentKt.updateComponent(displaying26.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateCardAccessNumber(str14));
                                        r2 = str14.length() == 0;
                                        List list13 = displaying26.componentErrors;
                                        String str15 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying26, updateComponent3, UiStepComponentWorkHelper.getComponentErrors(str15, GovernmentIdNfcScan.cardAccessNumberName, list13, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    case 11:
                                        String str16 = (String) obj6;
                                        str16.getClass();
                                        UiState.Displaying displaying27 = displaying15;
                                        ArrayList updateComponent4 = UiComponentKt.updateComponent(displaying27.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDocumentNumber(str16));
                                        r2 = str16.length() == 0;
                                        List list14 = displaying27.componentErrors;
                                        String str17 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying27, updateComponent4, UiStepComponentWorkHelper.getComponentErrors(str17, GovernmentIdNfcScan.documentNumberName, list14, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                    default:
                                        String str18 = (String) obj6;
                                        UiState.Displaying displaying28 = displaying15;
                                        ArrayList updateComponent5 = UiComponentKt.updateComponent(displaying28.components, uiComponent7, ((GovernmentIdNfcScanComponent) uiComponent7).updateDateOfBirth(str18));
                                        if (str18 != null && str18.length() != 0) {
                                            r2 = false;
                                        }
                                        List list15 = displaying28.componentErrors;
                                        String str19 = ((GovernmentIdNfcScanComponent) uiComponent7).name;
                                        uiStepComponentWorkHelper2.getClass();
                                        subtreeManager3.updateState(UiState.Displaying.copy$default(displaying28, updateComponent5, UiStepComponentWorkHelper.getComponentErrors(str19, GovernmentIdNfcScan.dateOfBirthName, list15, r2), null, null, null, null, false, null, null, null, false, null, 0, 65530));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    } else if (uiComponent6 instanceof MdocComponent) {
                        MdocComponent mdocComponent = (MdocComponent) uiComponent6;
                        String str13 = mdocComponent.name;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str13, ":error"), mdocComponent.errorTextController.onTextChanged), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(subtreeManager2, displaying15, uiComponent6, i12));
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str13, ":data"), mdocComponent.mdocDataController.onTextChanged), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(subtreeManager2, displaying15, uiComponent6, i11));
                    } else if (uiComponent6 instanceof PhoneNumberSnaComponent) {
                        PhoneNumberSnaComponent phoneNumberSnaComponent2 = (PhoneNumberSnaComponent) uiComponent6;
                        PhoneNumberSna.Attributes attributes4 = phoneNumberSnaComponent2.config.getAttributes();
                        if (attributes4 != null) {
                            attributes4.getCheckUrl();
                        }
                        POPMatchingFactory pOPMatchingFactory = uiStepComponentWorkHelper.silentNetworkAuthWorker;
                        Context context2 = uiStepComponentWorkHelper.applicationContext;
                        int timeoutSeconds = attributes4 != null ? attributes4.getTimeoutSeconds() : 10;
                        pOPMatchingFactory.getClass();
                        context2.getClass();
                        try {
                            try {
                                cls = Class.forName("com.withpersona.sdk2.inquiry.sna.impl.VonageSnaClientFactory");
                            } catch (Exception unused) {
                            }
                        } catch (ClassNotFoundException unused2) {
                            cls = null;
                        }
                        if (cls != null) {
                            Object newInstance = cls.newInstance();
                            newInstance.getClass();
                            Recorder$$ExternalSyntheticOutline1.m(newInstance);
                            throw null;
                        }
                        SilentNetworkAuthWorker silentNetworkAuthWorker = new SilentNetworkAuthWorker(timeoutSeconds);
                        String str14 = phoneNumberSnaComponent2.name;
                        str14.getClass();
                        subtreeManager2.runningWorker(new NamedWorkflowWorker(str14, silentNetworkAuthWorker), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(uiComponent6, subtreeManager2, displaying15, i10));
                    } else if (uiComponent6 instanceof InputFileUploadComponent) {
                        InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) uiComponent6;
                        String str15 = inputFileUploadComponent.name;
                        subtreeManager2.runningWorker(new RealWebSocket$connect$1(Recorder$$ExternalSyntheticOutline2.m$1(str15, "_pick_request"), (SharedFlowImpl) inputFileUploadComponent.fileUploadController.plugins), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(subtreeManager2, displaying15, uiComponent6, i3));
                        if (Intrinsics.areEqual(displaying15.filePickComponentName, str15)) {
                            UiComponentConfig findComponentConfig = UiStepComponentWorkHelper.findComponentConfig(str15, input.components);
                            InputFileUpload inputFileUpload = findComponentConfig instanceof InputFileUpload ? (InputFileUpload) findComponentConfig : null;
                            if (inputFileUpload == null || (attributes2 = inputFileUpload.getAttributes()) == null || (allowedFileTypes = attributes2.getAllowedFileTypes()) == null || (strArr = (String[]) allowedFileTypes.toArray(new String[0])) == null) {
                                strArr = new String[]{"*/*"};
                            }
                            if (inputFileUpload != null && (attributes = inputFileUpload.getAttributes()) != null && (fileUploadLimit = attributes.getFileUploadLimit()) != null) {
                                i5 = fileUploadLimit.intValue();
                            }
                            subtreeManager2.runningWorker(uiStepComponentWorkHelper.fileSelectWorkerFactory.create(i5, Boxes$$ExternalSyntheticOutline1.m(displaying15.filePickRequestId, str15, "_"), strArr), new UiStepComponentWorkHelper$$ExternalSyntheticLambda3(uiComponent6, subtreeManager2, displaying15, 6));
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                UiStepStateManager uiStepStateManager2 = (UiStepStateManager) obj3;
                UiState.Displaying displaying16 = (UiState.Displaying) obj2;
                CreateReusablePersonaWorker.Output output2 = (CreateReusablePersonaWorker.Output) obj;
                output2.getClass();
                UiState.PendingAction.CreateReusablePersona createReusablePersona = (UiState.PendingAction.CreateReusablePersona) ((UiState.PendingAction) obj4);
                CreatePersonaSheetComponent createPersonaSheetComponent2 = createReusablePersona.createPersonaSheetComponent;
                CreatePersonaSheetComponent createPersonaSheetComponent3 = createReusablePersona.createPersonaSheetComponent;
                if (createPersonaSheetComponent2.autoCompleteOnDismiss) {
                    uiStepStateManager2.setOutput(UiWorkflow.Output.Completed.INSTANCE);
                    return Unit.INSTANCE;
                }
                if (output2.equals(complete)) {
                    uiStepStateManager2.updateState(UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, createPersonaSheetComponent3, CreatePersonaSheetComponent.copy$default(createPersonaSheetComponent3, null, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE)), null, null, null, null, null, false, null, null, null, false, null, 0, 65406));
                } else {
                    if (!(output2 instanceof CreateReusablePersonaWorker.Output.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    uiStepStateManager2.updateState(((CreateReusablePersonaWorker.Output.Error) output2).errorInfo instanceof InternalErrorInfo.NetworkErrorInfo ? UiState.Displaying.copy$default(displaying16, null, null, uiStepStateManager2.applicationContext.getString(R.string.pi2_network_connection_error), null, null, null, false, null, null, null, false, null, 0, 65391) : UiState.Displaying.copy$default(displaying16, UiComponentKt.updateComponent(displaying16.components, createPersonaSheetComponent3, CreatePersonaSheetComponent.copy$default(createPersonaSheetComponent3, null, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE)), null, null, null, null, null, false, null, null, null, false, null, 0, 65406));
                }
                return Unit.INSTANCE;
        }
    }
}
