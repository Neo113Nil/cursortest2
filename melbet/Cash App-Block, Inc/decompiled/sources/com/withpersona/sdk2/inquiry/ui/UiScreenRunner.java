package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.net.UriKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.core.widget.NestedScrollView;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.b2$$ExternalSyntheticLambda0;
import com.android.volley.Response;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.StartCompoundLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.io.Files;
import com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.squareup.workflow1.ui.BuilderViewFactory;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewFactory;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.squareup.workflow1.ui.backstack.BackStackContainer$Companion$1;
import com.squareup.workflow1.ui.backstack.BackStackScreen;
import com.squareup.workflow1.ui.modal.AlertContainer$AlertContainerViewFactory$1;
import com.squareup.workflow1.ui.modal.AlertContainerScreen;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.internal.ui.DisableableScreen;
import com.withpersona.sdk2.inquiry.modal.CustomModalViewContainer;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.BottomSheetUtilsKt$setup$1;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import com.withpersona.sdk2.inquiry.steps.ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepUtils;
import com.withpersona.sdk2.inquiry.steps.ui.adapter.StyleableSelectArrayAdapter;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.DisableableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LinkButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MaskTextInputState;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponentViewHolder;
import com.withpersona.sdk2.inquiry.steps.ui.components.MultiTextValueComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetViewModel;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeUtils;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputFileUploadBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import com.withpersona.sdk2.inquiry.steps.ui.styling.StackState;
import com.withpersona.sdk2.inquiry.steps.ui.styling.StackStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import com.withpersona.sdk2.inquiry.steps.ui.view.StackGapView;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda17;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import dev.chrisbanes.haze.HazeStyleKt$$ExternalSyntheticLambda0;
import io.noties.markwon.MarkwonImpl;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import net.idrnd.face.iad.capture.internal.o0;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import operations.array.Map$evaluateLogic$1;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;
import org.slf4j.Marker;
import papa.Choreographers$$ExternalSyntheticLambda1;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;
import sqip.internal.BaseCardEntryActivity$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class UiScreenRunner implements LayoutRunner {
    public static final Companion Companion = new Companion(0);
    public final Pi2InquiryUiBinding binding;
    public final Map componentNameToConfig;
    public final LinkedHashMap componentNameToView;
    public final HelpBottomSheetController helpBottomSheetController;
    public final Response inputSelectBottomSheetController;
    public Function1 launchNfcScan;
    public final MarkwonImpl nestedUiBottomSheetController;
    public Function0 onCancel;
    public Function2 onClick;
    public Function0 onComplete;
    public Function1 onVerifyPersonaClick;
    public final SignatureBottomSheetController signatureBottomSheetController;

    public final class Companion implements ViewFactory {
        public final /* synthetic */ ViewFactory $$delegate_0;
        public final /* synthetic */ int $r8$classId;

        public Companion(int i) {
            this.$r8$classId = i;
            final int i2 = 2;
            switch (i) {
                case 1:
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(BackStackScreen.class), BackStackContainer$Companion$1.INSTANCE);
                    break;
                case 2:
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(AlertContainerScreen.class), new AlertContainer$AlertContainerViewFactory$1(4));
                    break;
                case 3:
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(Screen.AutoClassificationSelectCountryAndIdClassScreen.class), new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(27));
                    break;
                case 4:
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(Screen.ReviewScreen.class), new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(28));
                    break;
                case 5:
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(DisableableScreen.class), new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(29));
                    break;
                case 6:
                    final int i3 = 1;
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(ModalContainerScreen.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            Context context;
                            switch (i3) {
                                case 0:
                                    UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) obj;
                                    ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                                    Context context2 = (Context) obj3;
                                    ViewGroup viewGroup = (ViewGroup) obj4;
                                    entryScreen.getClass();
                                    viewEnvironment.getClass();
                                    context2.getClass();
                                    if (viewGroup == null || (context = viewGroup.getContext()) == null) {
                                        context = context2;
                                    }
                                    Pi2InquiryUiBinding inflate = Pi2InquiryUiBinding.inflate(LayoutInflater.from(context).cloneInContext(context2), null, false);
                                    CoordinatorLayout coordinatorLayout = inflate.rootView;
                                    coordinatorLayout.getClass();
                                    ViewShowRenderingKt.bindShowRendering(coordinatorLayout, entryScreen, viewEnvironment, new Map$evaluateLogic$1(2, new UiScreenRunner(inflate, entryScreen), UiScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 4));
                                    return coordinatorLayout;
                                case 1:
                                    ModalContainerScreen modalContainerScreen = (ModalContainerScreen) obj;
                                    ViewEnvironment viewEnvironment2 = (ViewEnvironment) obj2;
                                    Context context3 = (Context) obj3;
                                    modalContainerScreen.getClass();
                                    viewEnvironment2.getClass();
                                    context3.getClass();
                                    CustomModalViewContainer customModalViewContainer = new CustomModalViewContainer(context3, null, 0, 14);
                                    customModalViewContainer.setId(R.id.pi2_modal_container);
                                    customModalViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    ViewShowRenderingKt.bindShowRendering(customModalViewContainer, modalContainerScreen, viewEnvironment2, new WorkApplet$applet$1(2, customModalViewContainer, CustomModalViewContainer.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 29));
                                    return customModalViewContainer;
                                default:
                                    ScreenWithTransition screenWithTransition = (ScreenWithTransition) obj;
                                    ViewEnvironment viewEnvironment3 = (ViewEnvironment) obj2;
                                    Context context4 = (Context) obj3;
                                    screenWithTransition.getClass();
                                    viewEnvironment3.getClass();
                                    context4.getClass();
                                    ScreenWithTransitionContainer screenWithTransitionContainer = new ScreenWithTransitionContainer(context4, null, 0, 14);
                                    screenWithTransitionContainer.setId(R.id.pi2_back_stack_screen_runner);
                                    screenWithTransitionContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    ViewShowRenderingKt.bindShowRendering(screenWithTransitionContainer, screenWithTransition, viewEnvironment3, new Map$evaluateLogic$1(2, screenWithTransitionContainer, ScreenWithTransitionContainer.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 3));
                                    return screenWithTransitionContainer;
                            }
                        }
                    });
                    break;
                case 7:
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(ScreenWithTransition.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            Context context;
                            switch (i2) {
                                case 0:
                                    UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) obj;
                                    ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                                    Context context2 = (Context) obj3;
                                    ViewGroup viewGroup = (ViewGroup) obj4;
                                    entryScreen.getClass();
                                    viewEnvironment.getClass();
                                    context2.getClass();
                                    if (viewGroup == null || (context = viewGroup.getContext()) == null) {
                                        context = context2;
                                    }
                                    Pi2InquiryUiBinding inflate = Pi2InquiryUiBinding.inflate(LayoutInflater.from(context).cloneInContext(context2), null, false);
                                    CoordinatorLayout coordinatorLayout = inflate.rootView;
                                    coordinatorLayout.getClass();
                                    ViewShowRenderingKt.bindShowRendering(coordinatorLayout, entryScreen, viewEnvironment, new Map$evaluateLogic$1(2, new UiScreenRunner(inflate, entryScreen), UiScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 4));
                                    return coordinatorLayout;
                                case 1:
                                    ModalContainerScreen modalContainerScreen = (ModalContainerScreen) obj;
                                    ViewEnvironment viewEnvironment2 = (ViewEnvironment) obj2;
                                    Context context3 = (Context) obj3;
                                    modalContainerScreen.getClass();
                                    viewEnvironment2.getClass();
                                    context3.getClass();
                                    CustomModalViewContainer customModalViewContainer = new CustomModalViewContainer(context3, null, 0, 14);
                                    customModalViewContainer.setId(R.id.pi2_modal_container);
                                    customModalViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    ViewShowRenderingKt.bindShowRendering(customModalViewContainer, modalContainerScreen, viewEnvironment2, new WorkApplet$applet$1(2, customModalViewContainer, CustomModalViewContainer.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 29));
                                    return customModalViewContainer;
                                default:
                                    ScreenWithTransition screenWithTransition = (ScreenWithTransition) obj;
                                    ViewEnvironment viewEnvironment3 = (ViewEnvironment) obj2;
                                    Context context4 = (Context) obj3;
                                    screenWithTransition.getClass();
                                    viewEnvironment3.getClass();
                                    context4.getClass();
                                    ScreenWithTransitionContainer screenWithTransitionContainer = new ScreenWithTransitionContainer(context4, null, 0, 14);
                                    screenWithTransitionContainer.setId(R.id.pi2_back_stack_screen_runner);
                                    screenWithTransitionContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    ViewShowRenderingKt.bindShowRendering(screenWithTransitionContainer, screenWithTransition, viewEnvironment3, new Map$evaluateLogic$1(2, screenWithTransitionContainer, ScreenWithTransitionContainer.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 3));
                                    return screenWithTransitionContainer;
                            }
                        }
                    });
                    break;
                case 8:
                    this.$$delegate_0 = new Companion(2);
                    break;
                default:
                    final int i4 = 0;
                    this.$$delegate_0 = new BuilderViewFactory(Reflection.factory.getOrCreateKotlinClass(UiWorkflow.Screen.EntryScreen.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            Context context;
                            switch (i4) {
                                case 0:
                                    UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) obj;
                                    ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                                    Context context2 = (Context) obj3;
                                    ViewGroup viewGroup = (ViewGroup) obj4;
                                    entryScreen.getClass();
                                    viewEnvironment.getClass();
                                    context2.getClass();
                                    if (viewGroup == null || (context = viewGroup.getContext()) == null) {
                                        context = context2;
                                    }
                                    Pi2InquiryUiBinding inflate = Pi2InquiryUiBinding.inflate(LayoutInflater.from(context).cloneInContext(context2), null, false);
                                    CoordinatorLayout coordinatorLayout = inflate.rootView;
                                    coordinatorLayout.getClass();
                                    ViewShowRenderingKt.bindShowRendering(coordinatorLayout, entryScreen, viewEnvironment, new Map$evaluateLogic$1(2, new UiScreenRunner(inflate, entryScreen), UiScreenRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 4));
                                    return coordinatorLayout;
                                case 1:
                                    ModalContainerScreen modalContainerScreen = (ModalContainerScreen) obj;
                                    ViewEnvironment viewEnvironment2 = (ViewEnvironment) obj2;
                                    Context context3 = (Context) obj3;
                                    modalContainerScreen.getClass();
                                    viewEnvironment2.getClass();
                                    context3.getClass();
                                    CustomModalViewContainer customModalViewContainer = new CustomModalViewContainer(context3, null, 0, 14);
                                    customModalViewContainer.setId(R.id.pi2_modal_container);
                                    customModalViewContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    ViewShowRenderingKt.bindShowRendering(customModalViewContainer, modalContainerScreen, viewEnvironment2, new WorkApplet$applet$1(2, customModalViewContainer, CustomModalViewContainer.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 29));
                                    return customModalViewContainer;
                                default:
                                    ScreenWithTransition screenWithTransition = (ScreenWithTransition) obj;
                                    ViewEnvironment viewEnvironment3 = (ViewEnvironment) obj2;
                                    Context context4 = (Context) obj3;
                                    screenWithTransition.getClass();
                                    viewEnvironment3.getClass();
                                    context4.getClass();
                                    ScreenWithTransitionContainer screenWithTransitionContainer = new ScreenWithTransitionContainer(context4, null, 0, 14);
                                    screenWithTransitionContainer.setId(R.id.pi2_back_stack_screen_runner);
                                    screenWithTransitionContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                    ViewShowRenderingKt.bindShowRendering(screenWithTransitionContainer, screenWithTransition, viewEnvironment3, new Map$evaluateLogic$1(2, screenWithTransitionContainer, ScreenWithTransitionContainer.class, "update", "update(Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 3));
                                    return screenWithTransitionContainer;
                            }
                        }
                    });
                    break;
            }
        }

        @Override // com.squareup.workflow1.ui.ViewFactory
        public final View buildView(Object obj, ViewEnvironment viewEnvironment, Context context, ViewGroup viewGroup) {
            int i = this.$r8$classId;
            ViewFactory viewFactory = this.$$delegate_0;
            switch (i) {
                case 0:
                    UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) obj;
                    entryScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return ((BuilderViewFactory) viewFactory).buildView(entryScreen, viewEnvironment, context, viewGroup);
                case 1:
                    BackStackScreen backStackScreen = (BackStackScreen) obj;
                    backStackScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return ((BuilderViewFactory) viewFactory).buildView(backStackScreen, viewEnvironment, context, viewGroup);
                case 2:
                    AlertContainerScreen alertContainerScreen = (AlertContainerScreen) obj;
                    alertContainerScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return ((BuilderViewFactory) viewFactory).buildView(alertContainerScreen, viewEnvironment, context, viewGroup);
                case 3:
                    Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen = (Screen.AutoClassificationSelectCountryAndIdClassScreen) obj;
                    autoClassificationSelectCountryAndIdClassScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return ((BuilderViewFactory) viewFactory).buildView(autoClassificationSelectCountryAndIdClassScreen, viewEnvironment, context, viewGroup);
                case 4:
                    Screen.ReviewScreen reviewScreen = (Screen.ReviewScreen) obj;
                    reviewScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return ((BuilderViewFactory) viewFactory).buildView(reviewScreen, viewEnvironment, context, viewGroup);
                case 5:
                    throw Boxes$$ExternalSyntheticOutline1.m(obj);
                case 6:
                    ModalContainerScreen modalContainerScreen = (ModalContainerScreen) obj;
                    modalContainerScreen.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return ((BuilderViewFactory) viewFactory).buildView(modalContainerScreen, viewEnvironment, context, viewGroup);
                case 7:
                    ScreenWithTransition screenWithTransition = (ScreenWithTransition) obj;
                    screenWithTransition.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    return ((BuilderViewFactory) viewFactory).buildView(screenWithTransition, viewEnvironment, context, viewGroup);
                default:
                    AlertContainerScreen alertContainerScreen2 = (AlertContainerScreen) obj;
                    alertContainerScreen2.getClass();
                    viewEnvironment.getClass();
                    context.getClass();
                    Companion companion = (Companion) viewFactory;
                    companion.getClass();
                    return ((BuilderViewFactory) companion.$$delegate_0).buildView(alertContainerScreen2, viewEnvironment, context, viewGroup);
            }
        }

        @Override // com.squareup.workflow1.ui.ViewFactory
        public final KClass getType() {
            int i = this.$r8$classId;
            ViewFactory viewFactory = this.$$delegate_0;
            switch (i) {
                case 0:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                case 1:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                case 2:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                case 3:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                case 4:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                case 5:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                case 6:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                case 7:
                    return (KClass) ((BuilderViewFactory) viewFactory).f1422type;
                default:
                    return (KClass) ((BuilderViewFactory) ((Companion) viewFactory).$$delegate_0).f1422type;
            }
        }
    }

    public UiScreenRunner(Pi2InquiryUiBinding pi2InquiryUiBinding, UiWorkflow.Screen.EntryScreen entryScreen) {
        Map map;
        AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        StyleElements.SimpleElementColor headerButton;
        StyleElements.SimpleElementColorValue base;
        pi2InquiryUiBinding.getClass();
        ConstraintLayout constraintLayout = pi2InquiryUiBinding.rootLayout;
        entryScreen.getClass();
        this.binding = pi2InquiryUiBinding;
        CoordinatorLayout coordinatorLayout = pi2InquiryUiBinding.rootView;
        coordinatorLayout.getClass();
        this.inputSelectBottomSheetController = new Response(coordinatorLayout);
        coordinatorLayout.getClass();
        this.signatureBottomSheetController = new SignatureBottomSheetController(coordinatorLayout);
        coordinatorLayout.getClass();
        this.nestedUiBottomSheetController = new MarkwonImpl(coordinatorLayout);
        coordinatorLayout.getClass();
        this.helpBottomSheetController = new HelpBottomSheetController(coordinatorLayout);
        int i = 2;
        this.onComplete = new HazeStyleKt$$ExternalSyntheticLambda0(2);
        this.onCancel = new HazeStyleKt$$ExternalSyntheticLambda0(3);
        this.onClick = new Equals$$ExternalSyntheticLambda0(18);
        this.launchNfcScan = new InstantKt$$ExternalSyntheticLambda0(6);
        int i2 = 7;
        this.onVerifyPersonaClick = new InstantKt$$ExternalSyntheticLambda0(i2);
        Context context = coordinatorLayout.getContext();
        context.getClass();
        List list = entryScreen.components;
        StepStyles.UiStepStyle uiStepStyle = entryScreen.styles;
        List list2 = entryScreen.componentConfigs;
        int i3 = 0;
        MarkwonImpl generateViewsFromUiScreen$default = UiStepUtils.generateViewsFromUiScreen$default(UiStepUtils.INSTANCE, context, new UiComponentScreen(list, list2 == null ? EmptyList.INSTANCE : list2, uiStepStyle), false);
        View view = (View) generateViewsFromUiScreen$default.plugins;
        Integer backgroundColorValue = uiStepStyle != null ? uiStepStyle.getBackgroundColorValue() : null;
        if (backgroundColorValue != null) {
            constraintLayout.setBackgroundColor(backgroundColorValue.intValue());
        }
        Drawable backgroundImageDrawable = uiStepStyle != null ? AbstractHashFunction.backgroundImageDrawable(uiStepStyle, context) : null;
        if (backgroundImageDrawable != null) {
            constraintLayout.setBackground(backgroundImageDrawable);
            pi2InquiryUiBinding.footerContainer.setBackgroundColor(0);
        }
        Integer value = (uiStepStyle == null || (headerButtonColor = uiStepStyle.getHeaderButtonColor()) == null || (headerButton = headerButtonColor.getHeaderButton()) == null || (base = headerButton.getBase()) == null) ? null : base.getValue();
        if (value != null) {
            pi2InquiryUiBinding.navigationBar.setControlsColor(value.intValue());
        }
        if (list2 != null) {
            map = UiComponentKt.toMap(list2);
        } else {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        this.componentNameToConfig = map;
        Set<Map.Entry> entrySet = ((LinkedHashMap) ((o0) generateViewsFromUiScreen$default.parser).a).entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(entry.getKey(), ((ComponentView) entry.getValue()).view);
        }
        this.componentNameToView = linkedHashMap;
        this.binding.uiStepContainer.addView((ConstraintLayout) generateViewsFromUiScreen$default.visitorFactory);
        if ((uiStepStyle != null ? uiStepStyle.getPageLevelVerticalAlignment() : null) == StyleElements.PositionType.CENTER) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this.binding.container);
            constraintSet.connect$1(this.binding.uiStepContainer.getId(), 4, this.binding.container.getId(), 4);
            constraintSet.applyTo(this.binding.container);
        }
        if (view != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof FooterComponent) {
                    arrayList.add(obj);
                }
            }
            FooterComponent footerComponent = (FooterComponent) CollectionsKt.firstOrNull((List) arrayList);
            if (footerComponent != null) {
                Integer num = footerComponent.firstBelowTheFoldChildIndex;
                Pi2InquiryUiBinding pi2InquiryUiBinding2 = this.binding;
                if (num != null) {
                    int intValue = num.intValue();
                    MaterialDivider materialDivider = pi2InquiryUiBinding2.footerDivider;
                    NestedScrollView nestedScrollView = pi2InquiryUiBinding2.footerSheetScrollView;
                    LinearLayout linearLayout = pi2InquiryUiBinding2.footerSheet;
                    materialDivider.setVisibility(0);
                    pi2InquiryUiBinding2.footerSheetCoordinatorLayout.setVisibility(0);
                    Drawable background = view.getBackground();
                    ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                    int color = colorDrawable != null ? colorDrawable.getColor() : 0;
                    Drawable background2 = nestedScrollView.getBackground();
                    LayerDrawable layerDrawable = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
                    Drawable findDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.footer_sheet_rectangle) : null;
                    GradientDrawable gradientDrawable = findDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.setColor(color);
                    }
                    linearLayout.addView(view);
                    UiComponent uiComponent = (UiComponent) CollectionsKt.getOrNull(intValue, footerComponent.children);
                    View view2 = (View) this.componentNameToView.get(uiComponent != null ? uiComponent.getName() : null);
                    final BottomSheetBehavior from = BottomSheetBehavior.from(nestedScrollView);
                    pi2InquiryUiBinding2.nestedScroll.setVerticalFadingEdgeEnabled(false);
                    View view3 = pi2InquiryUiBinding2.footerSheetGrabber;
                    if (view2 != null) {
                        view3.setVisibility(0);
                        linearLayout.addOnLayoutChangeListener(new UiScreenRunner$$ExternalSyntheticLambda33(i3, this, view2, from));
                    } else {
                        view3.setVisibility(4);
                        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda34
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                                Pi2InquiryUiBinding pi2InquiryUiBinding3 = UiScreenRunner.this.binding;
                                int bottom = pi2InquiryUiBinding3.footerSheet.getBottom();
                                BottomSheetBehavior bottomSheetBehavior = from;
                                bottomSheetBehavior.setPeekHeight(bottom);
                                bottomSheetBehavior.maxHeight = bottom;
                                ShadowedNestedScrollView shadowedNestedScrollView = pi2InquiryUiBinding3.nestedScroll;
                                int paddingLeft = shadowedNestedScrollView.getPaddingLeft();
                                ShadowedNestedScrollView shadowedNestedScrollView2 = pi2InquiryUiBinding3.nestedScroll;
                                shadowedNestedScrollView.setPadding(paddingLeft, shadowedNestedScrollView2.getPaddingTop(), shadowedNestedScrollView2.getPaddingRight(), bottom);
                            }
                        });
                    }
                    from.addBottomSheetCallback(new BottomSheetUtilsKt$setup$1(i, this, from));
                } else {
                    pi2InquiryUiBinding2.footerContainer.addView(view);
                }
            }
        }
        CoordinatorLayout coordinatorLayout2 = this.binding.rootView;
        coordinatorLayout2.getClass();
        InsetsUtilsKt.onInsetsChanged(coordinatorLayout2, new BlurEffectKt$$ExternalSyntheticLambda1(i2, generateViewsFromUiScreen$default, this));
    }

    public static void applyComponentState(View view, LinkedHashMap linkedHashMap, UiComponent uiComponent, boolean z) {
        applyHiddenState(view, linkedHashMap, uiComponent);
        applyDisabledState(view, linkedHashMap, uiComponent, z);
    }

    public static void applyDisabledState(View view, LinkedHashMap linkedHashMap, UiComponent uiComponent, boolean z) {
        Boolean value;
        if (uiComponent instanceof DisableableComponent) {
            JsonLogicBoolean disabled = ((DisableableComponent) uiComponent).getDisabled();
            boolean z2 = false;
            boolean booleanValue = (disabled == null || (value = disabled.getValue(linkedHashMap, linkedHashMap.get(uiComponent.getName()))) == null) ? false : value.booleanValue();
            if (!z && !booleanValue) {
                z2 = true;
            }
            view.setEnabled(z2);
            view.requestLayout();
        }
    }

    public static void applyHiddenState(View view, LinkedHashMap linkedHashMap, UiComponent uiComponent) {
        boolean z;
        Boolean value;
        Boolean value2;
        if (uiComponent instanceof HideableComponent) {
            HideableComponent hideableComponent = (HideableComponent) uiComponent;
            JsonLogicBoolean hidden = hideableComponent.getHidden();
            boolean booleanValue = (hidden == null || (value2 = hidden.getValue(linkedHashMap, linkedHashMap.get(uiComponent.getName()))) == null) ? false : value2.booleanValue();
            view.setVisibility(booleanValue ? 8 : 0);
            for (StackGapView stackGapView : hideableComponent.getAssociatedViews()) {
                stackGapView.getClass();
                if (booleanValue) {
                    stackGapView.setVisibility(8);
                } else {
                    Iterator it = stackGapView.associatedComponents.iterator();
                    while (true) {
                        z = false;
                        while (it.hasNext()) {
                            UiComponent uiComponent2 = (UiComponent) ((WeakReference) it.next()).get();
                            JsonLogicBoolean jsonLogicBoolean = null;
                            HideableComponent hideableComponent2 = uiComponent2 instanceof HideableComponent ? (HideableComponent) uiComponent2 : null;
                            if (hideableComponent2 != null) {
                                jsonLogicBoolean = hideableComponent2.getHidden();
                            }
                            if (jsonLogicBoolean != null && (value = jsonLogicBoolean.getValue(linkedHashMap, uiComponent2)) != null) {
                                z = value.booleanValue();
                            }
                        }
                        break;
                    }
                    stackGapView.setVisibility(z ? 8 : 0);
                }
            }
        }
    }

    public static LinkedHashMap toComponentValues(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> entrySet = linkedHashMap.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry : entrySet) {
            linkedHashMap2.put(entry.getKey(), Files.toValue((ComponentParam) entry.getValue()));
        }
        return linkedHashMap2;
    }

    public static final void updateRendering$lambda$69$showInputSelectBottomSheet$64(UiScreenRunner uiScreenRunner, InputSelectBoxComponent inputSelectBoxComponent, Function1 function1) {
        if (inputSelectBoxComponent == null) {
            return;
        }
        Pi2InquiryUiBinding pi2InquiryUiBinding = uiScreenRunner.binding;
        ((ImageView) pi2InquiryUiBinding.navigationBar.binding.navBarBackButton).setEnabled(false);
        pi2InquiryUiBinding.navigationBar.setImportantForAccessibility(4);
        pi2InquiryUiBinding.uiStepContainer.setImportantForAccessibility(4);
        uiScreenRunner.inputSelectBottomSheetController.show(inputSelectBoxComponent, new BlurEffectKt$$ExternalSyntheticLambda1(5, uiScreenRunner, function1));
    }

    public static final void updateRendering$showInputSelectBottomSheet(UiScreenRunner uiScreenRunner, TextInputLayout textInputLayout, InputSelectBoxComponent inputSelectBoxComponent, MultiTextValueComponent multiTextValueComponent) {
        Pi2InquiryUiBinding pi2InquiryUiBinding = uiScreenRunner.binding;
        ((ImageView) pi2InquiryUiBinding.navigationBar.binding.navBarBackButton).setEnabled(false);
        textInputLayout.setEnabled(false);
        pi2InquiryUiBinding.navigationBar.setImportantForAccessibility(4);
        pi2InquiryUiBinding.uiStepContainer.setImportantForAccessibility(4);
        uiScreenRunner.inputSelectBottomSheetController.show(inputSelectBoxComponent, new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(9, uiScreenRunner, textInputLayout, multiTextValueComponent));
    }

    public final LinkedHashMap getComponentsParams(ArrayList arrayList) {
        LinkedHashMap linkedHashMap;
        Map map = EmptyMap.INSTANCE;
        map.getClass();
        int i = 0;
        while (true) {
            linkedHashMap = new LinkedHashMap();
            parseComponentsParamsInto(map, linkedHashMap, arrayList);
            LinkedHashMap componentValues = toComponentValues(linkedHashMap);
            if (map.equals(componentValues) || i >= 20) {
                break;
            }
            i++;
            map = componentValues;
        }
        return linkedHashMap;
    }

    public final void parseComponentsParamsInto(Map map, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        List split$default;
        Boolean value;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UiComponent uiComponent = ((ComponentView) it.next()).component;
            HideableComponent hideableComponent = uiComponent instanceof HideableComponent ? (HideableComponent) uiComponent : null;
            JsonLogicBoolean hidden = hideableComponent != null ? hideableComponent.getHidden() : null;
            if (!((hidden == null || (value = hidden.getValue(map, map.get(uiComponent.getName()))) == null) ? false : value.booleanValue())) {
                if (uiComponent instanceof InputTextComponent) {
                    InputTextComponent inputTextComponent = (InputTextComponent) uiComponent;
                    linkedHashMap.put(inputTextComponent.name, new ComponentParam.ComponentString(inputTextComponent.textController.getTextValue()));
                } else if (uiComponent instanceof InputTextAreaComponent) {
                    InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) uiComponent;
                    linkedHashMap.put(inputTextAreaComponent.name, new ComponentParam.ComponentString(inputTextAreaComponent.textController.getTextValue()));
                } else if (uiComponent instanceof InputPhoneNumberComponent) {
                    Lazy lazy = CountryCodeUtils.countryOptions$delegate;
                    InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent;
                    Option option = (Option) CollectionsKt.first((List) inputPhoneNumberComponent.countryCodeOptionsController._textValue.getValue());
                    option.getClass();
                    split$default = StringsKt__StringsKt.split$default(StringsKt.trim(option.value).toString(), new String[]{" "}, false, 0, 6, null);
                    linkedHashMap.put(inputPhoneNumberComponent.name, new ComponentParam.ComponentString(Recorder$$ExternalSyntheticOutline2.m(StringsKt.trim((String) CollectionsKt.last(split$default)).toString(), " ", inputPhoneNumberComponent.textController.getTextValue())));
                } else if (uiComponent instanceof InputConfirmationCodeComponent) {
                    InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) uiComponent;
                    linkedHashMap.put(inputConfirmationCodeComponent.name, new ComponentParam.ComponentString(inputConfirmationCodeComponent.textController.getTextValue()));
                } else if (uiComponent instanceof InputDateComponent) {
                    InputDateComponent inputDateComponent = (InputDateComponent) uiComponent;
                    linkedHashMap.put(inputDateComponent.name, new ComponentParam.ComponentString(inputDateComponent.dateController.getValue()));
                } else if (uiComponent instanceof InputInternationalDbComponent) {
                    InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                    linkedHashMap.put(inputInternationalDbComponent.name, new ComponentParam.InternationalDbParams(inputInternationalDbComponent.selectedCountry, inputInternationalDbComponent.selectedIdType, inputInternationalDbComponent.idValue));
                } else if (uiComponent instanceof InputMaskedTextComponent) {
                    InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) uiComponent;
                    linkedHashMap.put(inputMaskedTextComponent.name, new ComponentParam.ComponentString(inputMaskedTextComponent.textController.getTextValue()));
                } else if (uiComponent instanceof InputSelectComponent) {
                    InputSelectComponent inputSelectComponent = (InputSelectComponent) uiComponent;
                    List list = inputSelectComponent.selectedOptions;
                    if (!list.isEmpty()) {
                        linkedHashMap.put(inputSelectComponent.name, new ComponentParam.ComponentString(((Option) CollectionsKt.first(list)).value));
                    }
                } else if (uiComponent instanceof InputMultiSelectComponent) {
                    InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) uiComponent;
                    List list2 = inputMultiSelectComponent.selectedOptions;
                    if (!list2.isEmpty()) {
                        String str = inputMultiSelectComponent.name;
                        List list3 = list2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Option) it2.next()).value);
                        }
                        linkedHashMap.put(str, new ComponentParam.ComponentStringList(arrayList2));
                    }
                } else if (uiComponent instanceof InputAddressComponent) {
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) uiComponent;
                    linkedHashMap.put(inputAddressComponent.name, new ComponentParam.Address(inputAddressComponent.textControllerForAddressStreet1.getTextValue(), inputAddressComponent.textControllerForAddressStreet2.getTextValue(), inputAddressComponent.textControllerForAddressCity.getTextValue(), inputAddressComponent.textControllerForAddressSubdivision.getTextValue(), inputAddressComponent.textControllerForAddressPostalCode.getTextValue()));
                } else if (uiComponent instanceof UiComponentGroup) {
                    List<UiComponent> children = ((UiComponentGroup) uiComponent).getChildren();
                    ArrayList arrayList3 = new ArrayList();
                    for (UiComponent uiComponent2 : children) {
                        View view = (View) this.componentNameToView.get(uiComponent2.getName());
                        ComponentView componentView = view == null ? null : new ComponentView(uiComponent2, view);
                        if (componentView != null) {
                            arrayList3.add(componentView);
                        }
                    }
                    parseComponentsParamsInto(map, linkedHashMap, arrayList3);
                } else if (uiComponent instanceof InputCheckboxComponent) {
                    InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) uiComponent;
                    linkedHashMap.put(inputCheckboxComponent.name, new ComponentParam.ComponentBoolean(((Boolean) inputCheckboxComponent.twoStateViewController._textValue.getValue()).booleanValue()));
                } else if (uiComponent instanceof InputCheckboxGroupComponent) {
                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) uiComponent;
                    linkedHashMap.put(inputCheckboxGroupComponent.name, new ComponentParam.ComponentStringList(CollectionsKt.toList(inputCheckboxGroupComponent.value)));
                } else if (uiComponent instanceof InputRadioGroupComponent) {
                    InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) uiComponent;
                    linkedHashMap.put(inputRadioGroupComponent.name, new ComponentParam.ComponentString(inputRadioGroupComponent.textController.getTextValue()));
                } else if (uiComponent instanceof InputNumberComponent) {
                    InputNumberComponent inputNumberComponent = (InputNumberComponent) uiComponent;
                    Number number = (Number) inputNumberComponent.numberController._bitmapValue.getValue();
                    if (number != null) {
                        linkedHashMap.put(inputNumberComponent.name, new ComponentParam.ComponentNumber(number));
                    }
                } else if (uiComponent instanceof InputCurrencyComponent) {
                    InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) uiComponent;
                    Number number2 = (Number) inputCurrencyComponent.numberController._bitmapValue.getValue();
                    if (number2 != null) {
                        linkedHashMap.put(inputCurrencyComponent.name, new ComponentParam.ComponentNumber(number2));
                    }
                } else if (uiComponent instanceof ESignatureComponent) {
                    ESignatureComponent eSignatureComponent = (ESignatureComponent) uiComponent;
                    Bitmap bitmap = (Bitmap) eSignatureComponent.bitmapController._bitmapValue.getValue();
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        r2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3);
                        r2.getClass();
                    }
                    linkedHashMap.put(eSignatureComponent.name, new ComponentParam.ESignature(r2));
                } else if (uiComponent instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
                    GovernmentIdNfcData governmentIdNfcData = (GovernmentIdNfcData) governmentIdNfcScanComponent.nfcDataController._textValue.getValue();
                    if (governmentIdNfcData != null) {
                        Uri uri = governmentIdNfcData.dg1Uri;
                        String encodeToString = uri != null ? Base64.encodeToString(FilesKt__FileReadWriteKt.readBytes(UriKt.toFile(uri)), 0) : null;
                        Uri uri2 = governmentIdNfcData.dg2Uri;
                        String encodeToString2 = uri2 != null ? Base64.encodeToString(FilesKt__FileReadWriteKt.readBytes(UriKt.toFile(uri2)), 0) : null;
                        Uri uri3 = governmentIdNfcData.sodUri;
                        linkedHashMap.put(governmentIdNfcScanComponent.name, new ComponentParam.GovernmentIdNfcScan(encodeToString, encodeToString2, uri3 != null ? Base64.encodeToString(FilesKt__FileReadWriteKt.readBytes(UriKt.toFile(uri3)), 0) : null, governmentIdNfcData.chipAuthenticationStatus));
                    }
                } else if (uiComponent instanceof MdocComponent) {
                    MdocComponent mdocComponent = (MdocComponent) uiComponent;
                    String textValue = mdocComponent.mdocDataController.getTextValue();
                    if (!StringsKt.isBlank(textValue)) {
                        linkedHashMap.put(mdocComponent.name, new ComponentParam.ComponentString(textValue));
                    }
                } else if (uiComponent instanceof InputFileUploadComponent) {
                    InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) uiComponent;
                    String str2 = inputFileUploadComponent.name;
                    List list4 = inputFileUploadComponent.selectedFiles;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((SelectedFile) it3.next()).uri);
                    }
                    linkedHashMap.put(str2, new ComponentParam.FileUpload(arrayList4, inputFileUploadComponent.hasPrefill));
                } else if (!(uiComponent instanceof ActionButtonComponent) && !(uiComponent instanceof CancelButtonComponent) && !(uiComponent instanceof CombinedStepButtonComponent) && !(uiComponent instanceof CompleteButtonComponent) && !(uiComponent instanceof LinkButtonComponent) && !(uiComponent instanceof SubmitButtonComponent) && !(uiComponent instanceof ImagePreviewComponent) && !(uiComponent instanceof LocalImageComponent) && !(uiComponent instanceof PrivacyPolicyComponent) && !(uiComponent instanceof QRCodeComponent) && !(uiComponent instanceof RemoteImageComponent) && !(uiComponent instanceof SpacerComponent) && !(uiComponent instanceof TextComponent) && !(uiComponent instanceof TitleComponent) && !(uiComponent instanceof BrandingComponent) && !(uiComponent instanceof CreatePersonaSheetComponent) && !(uiComponent instanceof VerifyPersonaButtonComponent) && !(uiComponent instanceof HelpBottomSheetComponent) && !(uiComponent instanceof PhoneNumberSnaComponent)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
        }
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(UiWorkflow.Screen.EntryScreen entryScreen, ViewEnvironment viewEnvironment) {
        LinkedHashMap linkedHashMap;
        int colorFromAttr$default;
        LinkedHashMap linkedHashMap2;
        Map map;
        HelpBottomSheetViewModel helpBottomSheetViewModel;
        Object obj;
        BottomSheetBehavior bottomSheetBehavior;
        ViewEnvironment viewEnvironment2 = viewEnvironment;
        entryScreen.getClass();
        viewEnvironment2.getClass();
        Pi2InquiryUiBinding pi2InquiryUiBinding = this.binding;
        CoordinatorLayout coordinatorLayout = pi2InquiryUiBinding.rootView;
        CoordinatorLayout coordinatorLayout2 = pi2InquiryUiBinding.rootView;
        Context context = coordinatorLayout.getContext();
        List list = entryScreen.components;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.componentNameToView;
            if (!hasNext) {
                break;
            }
            UiComponent uiComponent = (UiComponent) it.next();
            View view = (View) linkedHashMap.get(uiComponent.getName());
            ComponentView componentView = view != null ? new ComponentView(uiComponent, view) : null;
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        LinkedHashMap componentsParams = getComponentsParams(arrayList);
        LinkedHashMap componentValues = toComponentValues(componentsParams);
        ArrayList arrayList2 = entryScreen.componentErrors;
        int i = 10;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((UiComponentError) obj2).getName(), obj2);
        }
        StepStyles.UiStepStyle uiStepStyle = entryScreen.styles;
        Integer backgroundColorValue = uiStepStyle != null ? uiStepStyle.getBackgroundColorValue() : null;
        if (backgroundColorValue == null || backgroundColorValue.intValue() == 0) {
            context.getClass();
            colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context, android.R.attr.colorBackground);
        } else {
            colorFromAttr$default = backgroundColorValue.intValue();
        }
        context.getClass();
        zzat.updateSystemUiColor(viewEnvironment2, context, colorFromAttr$default);
        this.launchNfcScan = entryScreen.launchNfcScan;
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            linkedHashMap2 = linkedHashMap3;
            map = this.componentNameToConfig;
            if (!hasNext2) {
                break;
            }
            ComponentView componentView2 = (ComponentView) it2.next();
            updateRendering(entryScreen, componentView2.component, componentView2.view, componentValues, linkedHashMap2, viewEnvironment2, map);
            linkedHashMap3 = linkedHashMap2;
        }
        NavigationState navigationState = entryScreen.navigationState;
        Pi2NavigationBar pi2NavigationBar = pi2InquiryUiBinding.navigationBar;
        coordinatorLayout2.getClass();
        zzai.applyNavigationState(navigationState, new UiScreenRunner$$ExternalSyntheticLambda6(this, entryScreen), new Choreographers$$ExternalSyntheticLambda1(entryScreen, i), new UiScreenRunner$$ExternalSyntheticLambda6(entryScreen, this), pi2NavigationBar, coordinatorLayout2);
        coordinatorLayout2.getClass();
        LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout2, entryScreen.error, entryScreen.onErrorDismissed, null, 2, 0);
        Function0 function0 = entryScreen.onComplete;
        this.onComplete = function0;
        Function0 function02 = entryScreen.onCancel;
        this.onCancel = function02;
        PayCellViewKt$$ExternalSyntheticLambda0 payCellViewKt$$ExternalSyntheticLambda0 = new PayCellViewKt$$ExternalSyntheticLambda0(25, entryScreen, this, arrayList);
        this.onClick = payCellViewKt$$ExternalSyntheticLambda0;
        this.onVerifyPersonaClick = new ComposeLayoutInfoKt$$ExternalSyntheticLambda6(8, entryScreen, this, arrayList);
        UiWorkflow.Screen.EntryScreen.AutoSubmit autoSubmit = entryScreen.autoSubmit;
        if (autoSubmit != null) {
            AutoSubmitableComponent autoSubmitableComponent = autoSubmit.component;
            String str = autoSubmit.countdownText;
            if (autoSubmit.isReadyToSubmit) {
                if ((autoSubmitableComponent instanceof ActionButtonComponent) || (autoSubmitableComponent instanceof SubmitButtonComponent)) {
                    View view2 = (View) linkedHashMap.get(((ButtonComponent) autoSubmitableComponent).getName());
                    payCellViewKt$$ExternalSyntheticLambda0.invoke(autoSubmitableComponent, Boolean.valueOf(view2 != null && view2.getVisibility() == 0));
                } else if (autoSubmitableComponent instanceof CancelButtonComponent) {
                    function02.invoke();
                } else if (autoSubmitableComponent instanceof CompleteButtonComponent) {
                    function0.invoke();
                } else if (autoSubmitableComponent instanceof PhoneNumberSnaComponent) {
                    PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) autoSubmitableComponent;
                    entryScreen.onClick.invoke(autoSubmitableComponent, Boolean.FALSE, MapsKt__MapsJVMKt.mapOf(new Pair(phoneNumberSnaComponent.name, new ComponentParam.PhoneNumberSnaParams(phoneNumberSnaComponent.code, phoneNumberSnaComponent.errorName, phoneNumberSnaComponent.errorMessage))));
                }
            } else if (str != null) {
                View view3 = (View) linkedHashMap.get(autoSubmitableComponent.getName());
                if (view3 instanceof ButtonWithLoadingIndicator) {
                    ((ButtonWithLoadingIndicator) view3).setText(str);
                } else if (view3 instanceof MaterialButton) {
                    ((MaterialButton) view3).setText(str);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof SheetComponent) {
                arrayList3.add(obj3);
            }
        }
        MarkwonImpl markwonImpl = this.nestedUiBottomSheetController;
        SheetComponent sheetComponent = (SheetComponent) markwonImpl.plugins;
        if (sheetComponent != null) {
            Iterator it3 = arrayList3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (Intrinsics.areEqual(((CreatePersonaSheetComponent) ((SheetComponent) obj)).name, ((CreatePersonaSheetComponent) sheetComponent).name)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SheetComponent sheetComponent2 = (SheetComponent) obj;
            if (sheetComponent2 != null && !((CreatePersonaSheetComponent) sheetComponent2).showing) {
                UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) markwonImpl.visitorFactory;
                if (uiStepBottomSheet != null && (bottomSheetBehavior = uiStepBottomSheet.bottomSheetBehavior) != null) {
                    bottomSheetBehavior.setState(5);
                }
                markwonImpl.plugins = null;
            }
        }
        if (((SheetComponent) markwonImpl.plugins) == null) {
            Iterator it4 = arrayList3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                SheetComponent sheetComponent3 = (SheetComponent) it4.next();
                if (!((CreatePersonaSheetComponent) sheetComponent3).shown) {
                    CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) sheetComponent3;
                    createPersonaSheetComponent.showing = true;
                    markwonImpl.plugins = sheetComponent3;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = new HazeStyleKt$$ExternalSyntheticLambda0(1);
                    UiStepBottomSheet uiStepBottomSheet2 = new UiStepBottomSheet(createPersonaSheetComponent.screen, EmptyList.INSTANCE, new b2$$ExternalSyntheticLambda0(13, ref$ObjectRef), null, createPersonaSheetComponent.hideWhenTappedOutside);
                    markwonImpl.visitorFactory = uiStepBottomSheet2;
                    ViewGroup viewGroup = (ViewGroup) markwonImpl.parser;
                    Context context2 = viewGroup.getContext();
                    context2.getClass();
                    View buildView = uiStepBottomSheet2.viewFactory.buildView(uiStepBottomSheet2, viewEnvironment2, context2, viewGroup);
                    viewGroup.addView(buildView);
                    ViewShowRenderingKt.start(buildView);
                    ref$ObjectRef.element = new UiScreenRunner$$ExternalSyntheticLambda29(sheetComponent3, markwonImpl, buildView);
                    break;
                }
            }
        }
        SheetComponent sheetComponent4 = (SheetComponent) markwonImpl.plugins;
        if (sheetComponent4 != null) {
            if (!(sheetComponent4 instanceof CreatePersonaSheetComponent)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = ((CreatePersonaSheetComponent) sheetComponent4).ctaCard.getComponentNameMapping();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            String startButton = componentNameMapping != null ? componentNameMapping.getStartButton() : null;
            BlurEffectKt$$ExternalSyntheticLambda1 blurEffectKt$$ExternalSyntheticLambda1 = new BlurEffectKt$$ExternalSyntheticLambda1(4, entryScreen, sheetComponent4);
            if (startButton != null) {
                linkedHashMap4.put(startButton, blurEffectKt$$ExternalSyntheticLambda1);
            }
            String dismissButton = componentNameMapping != null ? componentNameMapping.getDismissButton() : null;
            ForwardingFileSystem$$ExternalSyntheticLambda0 forwardingFileSystem$$ExternalSyntheticLambda0 = new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 11);
            if (dismissButton != null) {
                linkedHashMap4.put(dismissButton, forwardingFileSystem$$ExternalSyntheticLambda0);
            }
            List<Pair> list2 = MapsKt___MapsKt.toList(linkedHashMap4);
            UiStepBottomSheet uiStepBottomSheet3 = (UiStepBottomSheet) markwonImpl.visitorFactory;
            MarkwonImpl markwonImpl2 = uiStepBottomSheet3 != null ? uiStepBottomSheet3.uiScreenGenerationResult : null;
            if (markwonImpl2 != null) {
                LinkedHashMap linkedHashMap5 = (LinkedHashMap) ((o0) markwonImpl2.parser).a;
                for (Map.Entry entry : linkedHashMap5.entrySet()) {
                    updateRendering(entryScreen, ((ComponentView) entry.getValue()).component, ((ComponentView) entry.getValue()).view, componentsParams, linkedHashMap2, viewEnvironment2, map);
                    viewEnvironment2 = viewEnvironment;
                }
                for (Pair pair : list2) {
                    String str2 = (String) pair.first;
                    Function1 function1 = (Function1) pair.second;
                    ComponentView componentView3 = (ComponentView) linkedHashMap5.get(str2);
                    if (componentView3 != null) {
                        componentView3.view.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda13(function1, componentView3, 0));
                    }
                }
            }
        }
        if (!entryScreen.shouldLaunchHelpBottomSheet || (helpBottomSheetViewModel = entryScreen.helpBottomSheetViewModel) == null) {
            return;
        }
        this.helpBottomSheetController.show(entryScreen.styles, helpBottomSheetViewModel, entryScreen.onHelpBottomSheetDismissed, entryScreen.launchActionFromHelpSheet, entryScreen.launchSecondaryActionFromHelpSheet);
    }

    public final void updateRendering(final UiWorkflow.Screen.EntryScreen entryScreen, final UiComponent uiComponent, final View view, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ViewEnvironment viewEnvironment, Map map) {
        ArrayList arrayList;
        InputFileUpload.Attributes attributes;
        List<InputFileUpload.PrefillItem> prefill;
        InputTextBasedComponentStyle documentNumberStyle;
        InputTextBasedComponentStyle cardAccessNumberStyle;
        String str;
        InputTextBasedComponentStyle styles;
        List split$default;
        int i;
        int color;
        boolean z;
        int i2;
        final int i3;
        final int i4;
        InputInternationalDb.IdType idType;
        Object obj;
        LinkedHashMap linkedHashMap3;
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        final UiScreenRunner uiScreenRunner = this;
        UiWorkflow.Screen.EntryScreen entryScreen2 = entryScreen;
        LinkedHashMap linkedHashMap4 = linkedHashMap;
        LinkedHashMap linkedHashMap5 = linkedHashMap2;
        Map map2 = map;
        boolean z2 = false;
        r9 = false;
        boolean z3 = false;
        r9 = false;
        boolean z4 = false;
        z2 = false;
        if (uiComponent instanceof CompleteButtonComponent) {
            final int i5 = z2 ? 1 : 0;
            ((Button) view).setOnClickListener(new View.OnClickListener(uiScreenRunner) { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda14
                public final /* synthetic */ UiScreenRunner f$0;

                {
                    this.f$0 = uiScreenRunner;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = i5;
                    UiScreenRunner uiScreenRunner2 = this.f$0;
                    switch (i6) {
                        case 0:
                            uiScreenRunner2.onComplete.invoke();
                            break;
                        default:
                            uiScreenRunner2.onCancel.invoke();
                            break;
                    }
                }
            });
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        final int i6 = 1;
        if (uiComponent instanceof SubmitButtonComponent) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener(uiScreenRunner) { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda16
                public final /* synthetic */ UiScreenRunner f$0;

                {
                    this.f$0 = uiScreenRunner;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i7 = i6;
                    View view3 = view;
                    UiComponent uiComponent2 = uiComponent;
                    UiScreenRunner uiScreenRunner2 = this.f$0;
                    switch (i7) {
                        case 0:
                            uiScreenRunner2.onClick.invoke(uiComponent2, Boolean.valueOf(view3.getVisibility() == 0));
                            break;
                        case 1:
                            uiScreenRunner2.onClick.invoke(uiComponent2, Boolean.valueOf(view3.getVisibility() == 0));
                            break;
                        default:
                            uiScreenRunner2.onClick.invoke(uiComponent2, Boolean.valueOf(view3.getVisibility() == 0));
                            break;
                    }
                }
            });
            if (entryScreen2.isLoading && ((SubmitButtonComponent) uiComponent).wasTapped) {
                z3 = true;
            }
            buttonWithLoadingIndicator.setIsLoading(z3);
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        final int i7 = 2;
        if (uiComponent instanceof ActionButtonComponent) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator2.setOnClickListener(new View.OnClickListener(uiScreenRunner) { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda16
                public final /* synthetic */ UiScreenRunner f$0;

                {
                    this.f$0 = uiScreenRunner;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i72 = i7;
                    View view3 = view;
                    UiComponent uiComponent2 = uiComponent;
                    UiScreenRunner uiScreenRunner2 = this.f$0;
                    switch (i72) {
                        case 0:
                            uiScreenRunner2.onClick.invoke(uiComponent2, Boolean.valueOf(view3.getVisibility() == 0));
                            break;
                        case 1:
                            uiScreenRunner2.onClick.invoke(uiComponent2, Boolean.valueOf(view3.getVisibility() == 0));
                            break;
                        default:
                            uiScreenRunner2.onClick.invoke(uiComponent2, Boolean.valueOf(view3.getVisibility() == 0));
                            break;
                    }
                }
            });
            if (entryScreen2.isLoading && ((ActionButtonComponent) uiComponent).wasTapped) {
                z4 = true;
            }
            buttonWithLoadingIndicator2.setIsLoading(z4);
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        if (uiComponent instanceof LinkButtonComponent) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator3 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator3.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(13, uiComponent, buttonWithLoadingIndicator3));
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        if (uiComponent instanceof CancelButtonComponent) {
            ((Button) view).setOnClickListener(new View.OnClickListener(uiScreenRunner) { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda14
                public final /* synthetic */ UiScreenRunner f$0;

                {
                    this.f$0 = uiScreenRunner;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i62 = i6;
                    UiScreenRunner uiScreenRunner2 = this.f$0;
                    switch (i62) {
                        case 0:
                            uiScreenRunner2.onComplete.invoke();
                            break;
                        default:
                            uiScreenRunner2.onCancel.invoke();
                            break;
                    }
                }
            });
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        if (uiComponent instanceof VerifyPersonaButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i8 = i6;
                    UiComponent uiComponent2 = uiComponent;
                    UiScreenRunner uiScreenRunner2 = uiScreenRunner;
                    switch (i8) {
                        case 0:
                            uiScreenRunner2.launchNfcScan.invoke(uiComponent2);
                            break;
                        default:
                            uiScreenRunner2.onVerifyPersonaClick.invoke(uiComponent2);
                            break;
                    }
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator4 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator4 != null) {
                if (entryScreen2.isLoading && ((VerifyPersonaButtonComponent) uiComponent).wasTapped) {
                    z2 = true;
                }
                buttonWithLoadingIndicator4.setIsLoading(z2);
            }
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        if (uiComponent instanceof InputTextComponent) {
            TextInputLayout textInputLayout = (TextInputLayout) view;
            InputTextComponent inputTextComponent = (InputTextComponent) uiComponent;
            Object obj2 = linkedHashMap5.get(inputTextComponent.name);
            UiComponentError.UiInputComponentError uiInputComponentError = obj2 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj2 : null;
            ViewUtilsKt.setOrClearError(textInputLayout, uiInputComponentError != null ? uiInputComponentError.getMessage() : null, inputTextComponent.errorTextStyle);
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        if (uiComponent instanceof InputTextAreaComponent) {
            TextInputLayout textInputLayout2 = (TextInputLayout) view;
            InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) uiComponent;
            Object obj3 = linkedHashMap5.get(inputTextAreaComponent.name);
            UiComponentError.UiInputComponentError uiInputComponentError2 = obj3 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj3 : null;
            ViewUtilsKt.setOrClearError(textInputLayout2, uiInputComponentError2 != null ? uiInputComponentError2.getMessage() : null, inputTextAreaComponent.errorTextStyle);
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        if (uiComponent instanceof InputConfirmationCodeComponent) {
            ((InputConfirmationCodeComponent) uiComponent).submitCodeHelper.a = new UiScreenRunner$$ExternalSyntheticLambda29(z2 ? 1 : 0, view, entryScreen2, uiScreenRunner);
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            return;
        }
        if (uiComponent instanceof InputAddressComponent) {
            Object tag = view.getTag();
            tag.getClass();
            final Pi2UiAddressFieldBinding pi2UiAddressFieldBinding = (Pi2UiAddressFieldBinding) tag;
            TextView textView = pi2UiAddressFieldBinding.addressLabel;
            TextInputLayout textInputLayout3 = pi2UiAddressFieldBinding.addressPostalCode;
            TextInputLayout textInputLayout4 = pi2UiAddressFieldBinding.addressSubdivision;
            TextInputLayout textInputLayout5 = pi2UiAddressFieldBinding.addressCity;
            TextInputLayout textInputLayout6 = pi2UiAddressFieldBinding.addressSuite;
            TextInputLayout textInputLayout7 = pi2UiAddressFieldBinding.addressFieldExpanded;
            ConstraintLayout constraintLayout = pi2UiAddressFieldBinding.addressFieldsExpanded;
            ConstraintLayout constraintLayout2 = pi2UiAddressFieldBinding.addressFieldsCollapsed;
            final List<TextInputLayout> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TextInputLayout[]{textInputLayout7, textInputLayout6, textInputLayout5, textInputLayout4, textInputLayout3});
            InputAddressComponent inputAddressComponent = (InputAddressComponent) uiComponent;
            String str2 = inputAddressComponent.name;
            Object obj4 = map2.get(str2);
            obj4.getClass();
            InputAddress inputAddress = (InputAddress) obj4;
            Object obj5 = linkedHashMap5.get(str2);
            UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = obj5 instanceof UiComponentError.UiInputAddressComponentError ? (UiComponentError.UiInputAddressComponentError) obj5 : null;
            List list = inputAddressComponent.searchResults;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            Context context = view.getContext();
            context.getClass();
            List list2 = list;
            final List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(String.valueOf(((Suggestion) it.next()).address));
            }
            List list4 = CollectionsKt.toList(arrayList2);
            InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
            StyleableSelectArrayAdapter styleableSelectArrayAdapter = new StyleableSelectArrayAdapter(context, android.R.layout.simple_list_item_1, list4, (styles2 == null || (inputTextStyle2 = styles2.getInputTextStyle()) == null) ? null : inputTextStyle2.getFocusedTextBasedStyle());
            final MaterialAutoCompleteTextView materialAutoCompleteTextView = pi2UiAddressFieldBinding.addressFieldExpandedTextView;
            materialAutoCompleteTextView.setAdapter(styleableSelectArrayAdapter);
            styleableSelectArrayAdapter.notifyDataSetChanged();
            materialAutoCompleteTextView.setThreshold(1);
            materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda38
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i8, long j) {
                    Iterator it2 = listOf.iterator();
                    while (it2.hasNext()) {
                        ((TextInputLayout) it2.next()).setEnabled(false);
                    }
                    pi2UiAddressFieldBinding.progressIndicator.setVisibility(0);
                    Context context2 = materialAutoCompleteTextView.getContext();
                    context2.getClass();
                    ContextUtilsKt.hideKeyboard(context2);
                    entryScreen.onSuggestionSelected.invoke(uiComponent, ((Suggestion) list3.get(i8)).id);
                }
            });
            final MaterialAutoCompleteTextView materialAutoCompleteTextView2 = pi2UiAddressFieldBinding.addressFieldCollapsedTextView;
            materialAutoCompleteTextView2.setAdapter(styleableSelectArrayAdapter);
            styleableSelectArrayAdapter.notifyDataSetChanged();
            materialAutoCompleteTextView2.setThreshold(1);
            materialAutoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda38
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i8, long j) {
                    Iterator it2 = listOf.iterator();
                    while (it2.hasNext()) {
                        ((TextInputLayout) it2.next()).setEnabled(false);
                    }
                    pi2UiAddressFieldBinding.progressIndicator.setVisibility(0);
                    Context context2 = materialAutoCompleteTextView2.getContext();
                    context2.getClass();
                    ContextUtilsKt.hideKeyboard(context2);
                    entryScreen.onSuggestionSelected.invoke(uiComponent, ((Suggestion) list3.get(i8)).id);
                }
            });
            if (Intrinsics.areEqual(inputAddressComponent.isAddressAutocompleteLoading, Boolean.FALSE)) {
                Iterator it2 = listOf.iterator();
                while (it2.hasNext()) {
                    ((TextInputLayout) it2.next()).setEnabled(true);
                }
                pi2UiAddressFieldBinding.progressIndicator.setVisibility(8);
            }
            if (uiInputAddressComponentError != null) {
                inputAddressComponent.isAddressComponentsCollapsed = Boolean.FALSE;
            }
            if (Intrinsics.areEqual(inputAddressComponent.isAddressComponentsCollapsed, Boolean.FALSE)) {
                constraintLayout2.setVisibility(8);
                constraintLayout.setVisibility(0);
                textView.setLabelFor(constraintLayout.getId());
            } else if (Intrinsics.areEqual(inputAddressComponent.isAddressComponentsCollapsed, Boolean.TRUE) || inputAddressComponent.isAddressComponentsCollapsed == null) {
                constraintLayout2.setVisibility(0);
                constraintLayout.setVisibility(8);
                textView.setLabelFor(constraintLayout2.getId());
            }
            applyHiddenState(view, linkedHashMap4, uiComponent);
            for (TextInputLayout textInputLayout8 : listOf) {
                textInputLayout8.getClass();
                applyDisabledState(textInputLayout8, linkedHashMap4, uiComponent, entryScreen.isLoading);
            }
            InputAddress.AddressComponentStyle styles3 = inputAddress.getStyles();
            TextBasedComponentStyle errorTextStyle = (styles3 == null || (inputTextStyle = styles3.getInputTextStyle()) == null) ? null : inputTextStyle.getErrorTextStyle();
            ViewUtilsKt.setOrClearError(pi2UiAddressFieldBinding.addressFieldCollapsed, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            ViewUtilsKt.setOrClearError(textInputLayout7, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            ViewUtilsKt.setOrClearError(textInputLayout6, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_2") : null, errorTextStyle);
            ViewUtilsKt.setOrClearError(textInputLayout5, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("city") : null, errorTextStyle);
            ViewUtilsKt.setOrClearError(textInputLayout4, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("subdivision") : null, errorTextStyle);
            ViewUtilsKt.setOrClearError(textInputLayout3, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("postal_code") : null, errorTextStyle);
            return;
        }
        int i8 = 5;
        if ((uiComponent instanceof InputSelectComponent) || (uiComponent instanceof InputMultiSelectComponent)) {
            final TextInputLayout textInputLayout9 = (TextInputLayout) view;
            uiComponent.getClass();
            final InputSelectBoxComponent inputSelectBoxComponent = (InputSelectBoxComponent) uiComponent;
            final MultiTextValueComponent multiTextValueComponent = (MultiTextValueComponent) uiComponent;
            final int i9 = 0;
            textInputLayout9.setOnClickListener(new View.OnClickListener(uiScreenRunner) { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda30
                public final /* synthetic */ UiScreenRunner f$0;

                {
                    this.f$0 = uiScreenRunner;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = i9;
                    MultiTextValueComponent multiTextValueComponent2 = multiTextValueComponent;
                    InputSelectBoxComponent inputSelectBoxComponent2 = inputSelectBoxComponent;
                    TextInputLayout textInputLayout10 = textInputLayout9;
                    UiScreenRunner uiScreenRunner2 = this.f$0;
                    switch (i10) {
                        case 0:
                            UiScreenRunner.updateRendering$showInputSelectBottomSheet(uiScreenRunner2, textInputLayout10, inputSelectBoxComponent2, multiTextValueComponent2);
                            break;
                        default:
                            UiScreenRunner.updateRendering$showInputSelectBottomSheet(uiScreenRunner2, textInputLayout10, inputSelectBoxComponent2, multiTextValueComponent2);
                            break;
                    }
                }
            });
            EditText editText = textInputLayout9.editText;
            if (editText != null) {
                final int i10 = 1;
                editText.setOnClickListener(new View.OnClickListener(this) { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda30
                    public final /* synthetic */ UiScreenRunner f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i102 = i10;
                        MultiTextValueComponent multiTextValueComponent2 = multiTextValueComponent;
                        InputSelectBoxComponent inputSelectBoxComponent2 = inputSelectBoxComponent;
                        TextInputLayout textInputLayout10 = textInputLayout9;
                        UiScreenRunner uiScreenRunner2 = this.f$0;
                        switch (i102) {
                            case 0:
                                UiScreenRunner.updateRendering$showInputSelectBottomSheet(uiScreenRunner2, textInputLayout10, inputSelectBoxComponent2, multiTextValueComponent2);
                                break;
                            default:
                                UiScreenRunner.updateRendering$showInputSelectBottomSheet(uiScreenRunner2, textInputLayout10, inputSelectBoxComponent2, multiTextValueComponent2);
                                break;
                        }
                    }
                });
            }
            EditText editText2 = textInputLayout9.editText;
            if (editText2 != null) {
                editText2.setText(CollectionsKt.joinToString$default((List) multiTextValueComponent.getSelectedOptionsController()._textValue.getValue(), "\n", null, null, 0, null, new InstantKt$$ExternalSyntheticLambda0(i8), 30));
            }
            Object obj6 = linkedHashMap5.get(uiComponent.getName());
            UiComponentError.UiInputComponentError uiInputComponentError3 = obj6 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj6 : null;
            String message = uiInputComponentError3 != null ? uiInputComponentError3.getMessage() : null;
            InputSelectBoxComponentStyle styles4 = inputSelectBoxComponent.getStyles();
            ViewUtilsKt.setOrClearError(textInputLayout9, message, styles4 != null ? styles4.getErrorTextStyle() : null);
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading());
            return;
        }
        String str3 = "";
        if (uiComponent instanceof InputRadioGroupComponent) {
            Object tag2 = view.getTag();
            tag2.getClass();
            Pi2UiInputRadioGroupBinding pi2UiInputRadioGroupBinding = (Pi2UiInputRadioGroupBinding) tag2;
            Object obj7 = linkedHashMap5.get(((InputRadioGroupComponent) uiComponent).name);
            UiComponentError.UiInputComponentError uiInputComponentError4 = obj7 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj7 : null;
            String message2 = uiInputComponentError4 != null ? uiInputComponentError4.getMessage() : null;
            TextView textView2 = pi2UiInputRadioGroupBinding.radioGroupError;
            if (message2 == null || StringsKt.isBlank(message2)) {
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView2.setVisibility(0);
                textView2.setText(message2);
            }
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            View findViewById = view.findViewById(R.id.radio_button_container);
            findViewById.getClass();
            Iterator it3 = new ViewGroupKt$children$1((ViewGroup) findViewById).iterator();
            while (true) {
                ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it3;
                if (!viewGroupKt$iterator$1.hasNext()) {
                    return;
                } else {
                    applyDisabledState((View) viewGroupKt$iterator$1.next(), linkedHashMap4, uiComponent, entryScreen2.isLoading);
                }
            }
        } else {
            if (uiComponent instanceof UiComponentGroup) {
                for (UiComponent uiComponent2 : ((UiComponentGroup) uiComponent).getChildren()) {
                    View view2 = (View) uiScreenRunner.componentNameToView.get(uiComponent2.getName());
                    if (view2 != null) {
                        LinkedHashMap linkedHashMap6 = linkedHashMap5;
                        UiScreenRunner uiScreenRunner2 = uiScreenRunner;
                        UiWorkflow.Screen.EntryScreen entryScreen3 = entryScreen2;
                        LinkedHashMap linkedHashMap7 = linkedHashMap4;
                        Map map3 = map2;
                        uiScreenRunner2.updateRendering(entryScreen3, uiComponent2, view2, linkedHashMap7, linkedHashMap6, viewEnvironment, map3);
                        linkedHashMap3 = linkedHashMap6;
                        map2 = map3;
                        linkedHashMap4 = linkedHashMap7;
                        entryScreen2 = entryScreen3;
                        uiScreenRunner = uiScreenRunner2;
                    } else {
                        linkedHashMap3 = linkedHashMap5;
                    }
                    linkedHashMap5 = linkedHashMap3;
                }
                if ((uiComponent instanceof ClickableStackComponent) && (view instanceof ConstraintLayout)) {
                    ClickableStackComponent clickableStackComponent = (ClickableStackComponent) uiComponent;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                    constraintLayout3.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda39(0, clickableStackComponent, uiScreenRunner, constraintLayout3));
                    boolean z5 = clickableStackComponent.isActive;
                    ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = clickableStackComponent.styles;
                    if (z5) {
                        if (clickableStackComponentStyle != null) {
                            StackStylingKt.applyMarginsAndPadding(constraintLayout3, clickableStackComponentStyle);
                            constraintLayout3.setBackground(StackStylingKt.getStyledBackground(clickableStackComponentStyle, StackState.ACTIVE));
                        }
                    } else if (entryScreen2.isLoading && clickableStackComponentStyle != null) {
                        StackStylingKt.applyMarginsAndPadding(constraintLayout3, clickableStackComponentStyle);
                        constraintLayout3.setBackground(StackStylingKt.getStyledBackground(clickableStackComponentStyle, StackState.DISABLED));
                    }
                }
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                return;
            }
            if (uiComponent instanceof MdocComponent) {
                Object tag3 = view.getTag();
                tag3.getClass();
                MdocComponentViewHolder mdocComponentViewHolder = (MdocComponentViewHolder) tag3;
                TextView textView3 = mdocComponentViewHolder.errorLabel;
                View view3 = mdocComponentViewHolder.launchButton;
                MdocComponent mdocComponent = (MdocComponent) uiComponent;
                String str4 = mdocComponent.errorText;
                view3.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(11, uiComponent, view));
                applyComponentState(view3, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                Object obj8 = linkedHashMap5.get(mdocComponent.name);
                UiComponentError.UiInputComponentError uiInputComponentError5 = obj8 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj8 : null;
                if (uiInputComponentError5 != null) {
                    str4 = uiInputComponentError5.getMessage();
                }
                if (str4 == null || StringsKt.isBlank(str4)) {
                    textView3.setVisibility(8);
                    return;
                } else {
                    textView3.setText(str4);
                    textView3.setVisibility(0);
                    return;
                }
            }
            final int i11 = 0;
            if (uiComponent instanceof ButtonComponent) {
                view.setOnClickListener(new View.OnClickListener(uiScreenRunner) { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda16
                    public final /* synthetic */ UiScreenRunner f$0;

                    {
                        this.f$0 = uiScreenRunner;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view22) {
                        int i72 = i11;
                        View view32 = view;
                        UiComponent uiComponent22 = uiComponent;
                        UiScreenRunner uiScreenRunner22 = this.f$0;
                        switch (i72) {
                            case 0:
                                uiScreenRunner22.onClick.invoke(uiComponent22, Boolean.valueOf(view32.getVisibility() == 0));
                                break;
                            case 1:
                                uiScreenRunner22.onClick.invoke(uiComponent22, Boolean.valueOf(view32.getVisibility() == 0));
                                break;
                            default:
                                uiScreenRunner22.onClick.invoke(uiComponent22, Boolean.valueOf(view32.getVisibility() == 0));
                                break;
                        }
                    }
                });
                ButtonWithLoadingIndicator buttonWithLoadingIndicator5 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
                if (buttonWithLoadingIndicator5 != null) {
                    buttonWithLoadingIndicator5.setIsLoading(entryScreen2.isLoading && ((ButtonComponent) uiComponent).getWasTapped());
                }
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                return;
            }
            if (uiComponent instanceof InputDateComponent) {
                Object tag4 = view.getTag();
                tag4.getClass();
                Pi2UiDateFieldBinding pi2UiDateFieldBinding = (Pi2UiDateFieldBinding) tag4;
                TextInputLayout textInputLayout10 = pi2UiDateFieldBinding.month;
                TextInputLayout textInputLayout11 = pi2UiDateFieldBinding.year;
                TextInputLayout textInputLayout12 = pi2UiDateFieldBinding.day;
                TextView textView4 = pi2UiDateFieldBinding.errorLabel;
                Object obj9 = linkedHashMap5.get(((InputDateComponent) uiComponent).name);
                UiComponentError.UiInputComponentError uiInputComponentError6 = obj9 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj9 : null;
                if (uiInputComponentError6 != null) {
                    textInputLayout10.setError(uiInputComponentError6.getMessage());
                    textInputLayout12.setError(uiInputComponentError6.getMessage());
                    textInputLayout11.setError(uiInputComponentError6.getMessage());
                    textView4.setText(uiInputComponentError6.getMessage());
                    textView4.setVisibility(0);
                } else {
                    textInputLayout10.setError("");
                    textInputLayout12.setError("");
                    textInputLayout11.setError("");
                    textView4.setText("");
                    textView4.setVisibility(8);
                }
                applyHiddenState(view, linkedHashMap4, uiComponent);
                boolean z6 = entryScreen2.isLoading;
                boolean z7 = entryScreen2.isLoading;
                applyDisabledState(textInputLayout10, linkedHashMap4, uiComponent, z6);
                applyDisabledState(textInputLayout12, linkedHashMap4, uiComponent, z7);
                applyDisabledState(textInputLayout11, linkedHashMap4, uiComponent, z7);
                return;
            }
            if (uiComponent instanceof InputInternationalDbComponent) {
                Object tag5 = view.getTag();
                tag5.getClass();
                Pi2UiInternationalDbFieldBinding pi2UiInternationalDbFieldBinding = (Pi2UiInternationalDbFieldBinding) tag5;
                InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                Object obj10 = linkedHashMap5.get(inputInternationalDbComponent.name);
                UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError = obj10 instanceof UiComponentError.UiInputInternationalDbComponentError ? (UiComponentError.UiInputInternationalDbComponentError) obj10 : null;
                Map<String, String> message3 = uiInputInternationalDbComponentError != null ? uiInputInternationalDbComponentError.getMessage() : null;
                final UiScreenRunner$$ExternalSyntheticLambda17 uiScreenRunner$$ExternalSyntheticLambda17 = new UiScreenRunner$$ExternalSyntheticLambda17(0, uiComponent, uiScreenRunner);
                final UiScreenRunner$$ExternalSyntheticLambda17 uiScreenRunner$$ExternalSyntheticLambda172 = new UiScreenRunner$$ExternalSyntheticLambda17(1, uiComponent, uiScreenRunner);
                String str5 = message3 != null ? message3.get("idb_country") : null;
                String str6 = message3 != null ? message3.get("idb_type") : null;
                String str7 = message3 != null ? message3.get("idb_value") : null;
                TextInputLayout textInputLayout13 = pi2UiInternationalDbFieldBinding.idbCountryInput;
                TextView textView5 = pi2UiInternationalDbFieldBinding.idbDescription;
                TextInputLayout textInputLayout14 = pi2UiInternationalDbFieldBinding.idbValueInput;
                TextInputLayout textInputLayout15 = pi2UiInternationalDbFieldBinding.idbIdTypeInput;
                EditText editText3 = textInputLayout13.editText;
                if (editText3 != null) {
                    editText3.setText(CollectionsKt.joinToString$default((List) inputInternationalDbComponent.countryOptionsController._textValue.getValue(), "\n", null, null, 0, null, new SelfieWorkflow$$ExternalSyntheticLambda79(29), 30));
                }
                EditText editText4 = textInputLayout15.editText;
                if (editText4 != null) {
                    editText4.setText(CollectionsKt.joinToString$default((List) inputInternationalDbComponent.idTypeOptionsController._textValue.getValue(), "\n", null, null, 0, null, new InstantKt$$ExternalSyntheticLambda0(1), 30));
                }
                String str8 = inputInternationalDbComponent.selectedCountry;
                String str9 = inputInternationalDbComponent.selectedIdType;
                List list5 = inputInternationalDbComponent.countryOptions;
                LinkedHashMap linkedHashMap8 = inputInternationalDbComponent.typesByCountryCode;
                List list6 = linkedHashMap8 != null ? (List) linkedHashMap8.get(str8) : null;
                boolean z8 = inputInternationalDbComponent.hideCountryField;
                boolean z9 = inputInternationalDbComponent.hideIdTypeField;
                if (str8 == null) {
                    z = z9;
                    textInputLayout15.setEnabled(false);
                    i2 = 1;
                } else {
                    z = z9;
                    i2 = 1;
                    textInputLayout15.setEnabled(true);
                }
                if (str8 == null && list5 != null && list5.size() == i2) {
                    TextControllerImpl textControllerImpl = inputInternationalDbComponent.countryOptionsController;
                    InputInternationalDbComponent.CountryOption countryOption = (InputInternationalDbComponent.CountryOption) CollectionsKt.first(list5);
                    textControllerImpl.setValue(CollectionsKt__CollectionsJVMKt.listOf(new Option(countryOption.countryName, countryOption.countryCode)));
                    if (Intrinsics.areEqual(inputInternationalDbComponent.hideCountryIfSingleChoice, Boolean.TRUE)) {
                        z8 = true;
                    }
                }
                if (str8 != null && list6 != null && list6.size() == 1) {
                    TextControllerImpl textControllerImpl2 = inputInternationalDbComponent.idTypeOptionsController;
                    InputInternationalDbComponent.IdOption idOption = (InputInternationalDbComponent.IdOption) CollectionsKt.first(list6);
                    textControllerImpl2.setValue(CollectionsKt__CollectionsJVMKt.listOf(new Option(idOption.name, idOption.idType)));
                    if (Intrinsics.areEqual(inputInternationalDbComponent.hideTypeIfSingleChoice, Boolean.TRUE)) {
                        z = true;
                    }
                }
                textInputLayout13.setVisibility(z8 ? 8 : 0);
                textInputLayout15.setVisibility(z ? 8 : 0);
                if (str8 == null || str9 == null) {
                    i3 = 0;
                    textInputLayout14.setEnabled(false);
                    textView5.setVisibility(8);
                } else {
                    textInputLayout14.setEnabled(true);
                    List list7 = inputInternationalDbComponent.allowedIdTypes;
                    if (list7 != null) {
                        Iterator it4 = list7.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            InputInternationalDb.IdType idType2 = (InputInternationalDb.IdType) obj;
                            if (Intrinsics.areEqual(idType2.getCountryCode(), str8) && Intrinsics.areEqual(idType2.getIdType(), str9)) {
                                break;
                            }
                        }
                        idType = (InputInternationalDb.IdType) obj;
                    } else {
                        idType = null;
                    }
                    InputMaskedTextComponentKt.bindMaskTextInputState(textInputLayout14, new MaskTextInputState(idType != null ? idType.getSecure() : null, null, idType != null ? idType.getMask() : null, null, idType != null ? idType.getPlaceholder() : null));
                    String description = idType != null ? idType.getDescription() : null;
                    if (description == null || StringsKt.isBlank(description)) {
                        textView5.setVisibility(8);
                    } else {
                        textView5.setVisibility(0);
                        textView5.setText(idType != null ? idType.getDescription() : null);
                    }
                    i3 = 0;
                }
                textInputLayout13.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i12 = i3;
                        UiScreenRunner$$ExternalSyntheticLambda17 uiScreenRunner$$ExternalSyntheticLambda173 = uiScreenRunner$$ExternalSyntheticLambda17;
                        switch (i12) {
                            case 0:
                                uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                break;
                            default:
                                uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                break;
                        }
                    }
                });
                EditText editText5 = textInputLayout13.editText;
                if (editText5 != null) {
                    i4 = 1;
                    editText5.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i12 = i4;
                            UiScreenRunner$$ExternalSyntheticLambda17 uiScreenRunner$$ExternalSyntheticLambda173 = uiScreenRunner$$ExternalSyntheticLambda17;
                            switch (i12) {
                                case 0:
                                    uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                    break;
                                default:
                                    uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                    break;
                            }
                        }
                    });
                } else {
                    i4 = 1;
                }
                textInputLayout15.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i12 = i3;
                        UiScreenRunner$$ExternalSyntheticLambda17 uiScreenRunner$$ExternalSyntheticLambda173 = uiScreenRunner$$ExternalSyntheticLambda172;
                        switch (i12) {
                            case 0:
                                uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                break;
                            default:
                                uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                break;
                        }
                    }
                });
                EditText editText6 = textInputLayout15.editText;
                if (editText6 != null) {
                    editText6.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt$$ExternalSyntheticLambda5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i12 = i4;
                            UiScreenRunner$$ExternalSyntheticLambda17 uiScreenRunner$$ExternalSyntheticLambda173 = uiScreenRunner$$ExternalSyntheticLambda172;
                            switch (i12) {
                                case 0:
                                    uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                    break;
                                default:
                                    uiScreenRunner$$ExternalSyntheticLambda173.invoke();
                                    break;
                            }
                        }
                    });
                }
                textInputLayout13.setError(str5);
                textInputLayout15.setError(str6);
                textInputLayout14.setError(str7);
                applyComponentState(view, linkedHashMap, uiComponent, entryScreen.isLoading);
                return;
            }
            if (uiComponent instanceof InputMaskedTextComponent) {
                InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) uiComponent;
                Object obj11 = linkedHashMap5.get(inputMaskedTextComponent.name);
                UiComponentError.UiInputComponentError uiInputComponentError7 = obj11 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj11 : null;
                TextInputLayout textInputLayout16 = (TextInputLayout) view;
                String message4 = uiInputComponentError7 != null ? uiInputComponentError7.getMessage() : null;
                InputTextBasedComponentStyle inputTextBasedComponentStyle = inputMaskedTextComponent.styles;
                ViewUtilsKt.setOrClearError(textInputLayout16, message4, inputTextBasedComponentStyle != null ? inputTextBasedComponentStyle.getErrorTextStyle() : null);
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                return;
            }
            int i12 = 4;
            if (uiComponent instanceof InputPhoneNumberComponent) {
                Object tag6 = view.getTag();
                tag6.getClass();
                Pi2UiInputPhoneNumberBinding pi2UiInputPhoneNumberBinding = (Pi2UiInputPhoneNumberBinding) tag6;
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent;
                Object obj12 = linkedHashMap5.get(inputPhoneNumberComponent.name);
                UiComponentError.UiInputComponentError uiInputComponentError8 = obj12 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj12 : null;
                ViewUtilsKt.setOrClearError(pi2UiInputPhoneNumberBinding.inputLayout, uiInputComponentError8 != null ? uiInputComponentError8.getMessage() : null, inputPhoneNumberComponent.errorTextStyle);
                UiScreenRunner$$ExternalSyntheticLambda17 uiScreenRunner$$ExternalSyntheticLambda173 = new UiScreenRunner$$ExternalSyntheticLambda17(i7, uiComponent, uiScreenRunner);
                inputPhoneNumberComponent.getClass();
                Lazy lazy = CountryCodeUtils.countryOptions$delegate;
                TextControllerImpl textControllerImpl3 = inputPhoneNumberComponent.countryCodeOptionsController;
                String str10 = inputPhoneNumberComponent.selectedCountryCode;
                Option option = (Option) CollectionsKt.first((List) textControllerImpl3._textValue.getValue());
                option.getClass();
                split$default = StringsKt__StringsKt.split$default(option.text, new String[]{" "}, false, 0, 6, null);
                String str11 = (String) CollectionsKt.getOrNull(0, split$default);
                if (str11 == null) {
                    str11 = CountryCodeUtils.DEFAULT_COUNTRY_OPTION.text;
                }
                String str12 = (String) CollectionsKt.lastOrNull(split$default);
                if (str12 != null) {
                    String str13 = StringsKt__StringsJVMKt.startsWith(str12, Marker.ANY_NON_NULL_MARKER, false) ? str12 : null;
                    if (str13 != null) {
                        str3 = str13;
                    }
                }
                String obj13 = StringsKt.trim(str11 + " " + str3).toString();
                TextInputLayout textInputLayout17 = pi2UiInputPhoneNumberBinding.inputLayout;
                StartCompoundLayout startCompoundLayout = textInputLayout17.startLayout;
                textInputLayout17.setPrefixText(obj13);
                List list8 = inputPhoneNumberComponent.countryCodeOptions;
                if (str10 == null) {
                    i = 1;
                    if (list8.size() == 1) {
                        inputPhoneNumberComponent.countryCodeOptionsController.setValue(CollectionsKt__CollectionsJVMKt.listOf(CollectionsKt.first(list8)));
                    }
                } else {
                    i = 1;
                }
                startCompoundLayout.prefixTextView.setOnClickListener(new BaseCardEntryActivity$$ExternalSyntheticLambda1(uiScreenRunner$$ExternalSyntheticLambda173, i));
                AppCompatTextView appCompatTextView = startCompoundLayout.prefixTextView;
                Context context2 = pi2UiInputPhoneNumberBinding.rootView.getContext();
                context2.getClass();
                int defaultColor = startCompoundLayout.prefixTextView.getTextColors().getDefaultColor();
                int measureText = (int) startCompoundLayout.prefixTextView.getPaint().measureText(String.valueOf(startCompoundLayout.prefixText));
                Integer num = inputPhoneNumberComponent.activeOptionBackgroundColor;
                if (num != null) {
                    color = num.intValue();
                } else {
                    int color2 = context2.getColor(R.color.pi2_country_code_selector_color);
                    color = context2.getColor(R.color.pi2_country_code_selector_color_dark);
                    if (ColorUtils.calculateContrast(defaultColor, color2) >= ColorUtils.calculateContrast(defaultColor, color)) {
                        color = color2;
                    }
                }
                float dpToPx = (float) ExtensionsKt.getDpToPx(8.0d);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(color);
                gradientDrawable.setCornerRadii(new float[]{dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx, dpToPx});
                gradientDrawable.setSize(measureText + ((int) ExtensionsKt.getDpToPx(24.0d)), gradientDrawable.getMinimumHeight());
                appCompatTextView.setBackground(new InsetDrawable((Drawable) gradientDrawable, (int) ExtensionsKt.getDpToPx(4.0d)));
                EditText editText7 = textInputLayout17.editText;
                if (editText7 != null) {
                    PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = new PhoneNumberFormattingTextWatcher(str10);
                    Object tag7 = editText7.getTag(R.id.text_changed_listener);
                    if (tag7 != null) {
                        editText7.removeTextChangedListener((TextWatcher) tag7);
                    }
                    editText7.addTextChangedListener(phoneNumberFormattingTextWatcher);
                    editText7.setTag(R.id.text_changed_listener, phoneNumberFormattingTextWatcher);
                }
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                return;
            }
            if (uiComponent instanceof InputNumberComponent) {
                String str14 = ((InputNumberComponent) uiComponent).name;
                Object obj14 = linkedHashMap5.get(str14);
                UiComponentError.UiInputComponentError uiInputComponentError9 = obj14 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj14 : null;
                TextInputLayout textInputLayout18 = (TextInputLayout) view;
                String message5 = uiInputComponentError9 != null ? uiInputComponentError9.getMessage() : null;
                Object obj15 = map2.get(str14);
                InputNumber inputNumber = obj15 instanceof InputNumber ? (InputNumber) obj15 : null;
                ViewUtilsKt.setOrClearError(textInputLayout18, message5, (inputNumber == null || (styles = inputNumber.getStyles()) == null) ? null : styles.getErrorTextStyle());
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                return;
            }
            if (uiComponent instanceof InputCurrencyComponent) {
                InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) uiComponent;
                Object obj16 = linkedHashMap5.get(inputCurrencyComponent.name);
                UiComponentError.UiInputComponentError uiInputComponentError10 = obj16 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj16 : null;
                ViewUtilsKt.setOrClearError((TextInputLayout) view, uiInputComponentError10 != null ? uiInputComponentError10.getMessage() : null, inputCurrencyComponent.errorTextStyle);
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                return;
            }
            if (uiComponent instanceof InputCheckboxComponent) {
                Object tag8 = view.getTag();
                tag8.getClass();
                TextView textView6 = ((Pi2UiInputCheckboxBinding) tag8).checkboxError;
                Object obj17 = linkedHashMap5.get(((InputCheckboxComponent) uiComponent).name);
                UiComponentError.UiInputComponentError uiInputComponentError11 = obj17 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj17 : null;
                if (uiInputComponentError11 != null) {
                    textView6.setText(uiInputComponentError11.getMessage());
                    textView6.setVisibility(0);
                } else {
                    textView6.setText("");
                    textView6.setVisibility(8);
                }
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                return;
            }
            if (!(uiComponent instanceof InputCheckboxGroupComponent)) {
                if (uiComponent instanceof ESignatureComponent) {
                    Object tag9 = view.getTag();
                    tag9.getClass();
                    Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding = (Pi2UiSignatureFieldBinding) tag9;
                    MaterialCardView materialCardView = pi2UiSignatureFieldBinding.signatureContainer;
                    TextView textView7 = pi2UiSignatureFieldBinding.label;
                    TextView textView8 = pi2UiSignatureFieldBinding.errorLabel;
                    ESignatureComponent eSignatureComponent = (ESignatureComponent) uiComponent;
                    String str15 = eSignatureComponent.name;
                    Object obj18 = map2.get(str15);
                    obj18.getClass();
                    ESignature eSignature = (ESignature) obj18;
                    Object obj19 = linkedHashMap5.get(str15);
                    UiComponentError.UiInputComponentError uiInputComponentError12 = obj19 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj19 : null;
                    if (uiInputComponentError12 != null) {
                        textView8.setText(uiInputComponentError12.getMessage());
                        textView8.setVisibility(0);
                    } else {
                        textView8.setText("");
                        textView8.setVisibility(8);
                    }
                    ESignature.Attributes attributes2 = eSignature.getAttributes();
                    if ((attributes2 != null ? attributes2.getLabel() : null) != null) {
                        ESignature.Attributes attributes3 = eSignature.getAttributes();
                        textView7.setText(attributes3 != null ? attributes3.getLabel() : null);
                        textView7.setVisibility(0);
                    } else {
                        textView7.setText("");
                        textView7.setVisibility(8);
                    }
                    Bitmap bitmap = (Bitmap) eSignatureComponent.bitmapController._bitmapValue.getValue();
                    if (bitmap == null) {
                        Object tag10 = view.getTag();
                        tag10.getClass();
                        ((Pi2UiSignatureFieldBinding) tag10).addSignatureLabel.setVisibility(0);
                        Object tag11 = view.getTag();
                        tag11.getClass();
                        TextView textView9 = ((Pi2UiSignatureFieldBinding) tag11).addSignatureLabel;
                        ESignature.Attributes attributes4 = eSignature.getAttributes();
                        if (attributes4 == null || (str = attributes4.getPlaceholder()) == null) {
                            str = "+ Add signature";
                        }
                        textView9.setText(str);
                        Object tag12 = view.getTag();
                        tag12.getClass();
                        ((Pi2UiSignatureFieldBinding) tag12).signaturePreview.setVisibility(8);
                        Object tag13 = view.getTag();
                        tag13.getClass();
                        ((Pi2UiSignatureFieldBinding) tag13).editSignatureIcon.setVisibility(8);
                    } else {
                        Object tag14 = view.getTag();
                        tag14.getClass();
                        ((Pi2UiSignatureFieldBinding) tag14).signaturePreview.setImageBitmap(bitmap);
                        Object tag15 = view.getTag();
                        tag15.getClass();
                        ((Pi2UiSignatureFieldBinding) tag15).addSignatureLabel.setVisibility(8);
                        Object tag16 = view.getTag();
                        tag16.getClass();
                        ((Pi2UiSignatureFieldBinding) tag16).signaturePreview.setVisibility(0);
                        Object tag17 = view.getTag();
                        tag17.getClass();
                        ((Pi2UiSignatureFieldBinding) tag17).editSignatureIcon.setVisibility(0);
                    }
                    materialCardView.setOnClickListener(new SsoCookieHelper$$ExternalSyntheticLambda1(uiScreenRunner, uiComponent, eSignature, entryScreen2, viewEnvironment, 1));
                    applyHiddenState(view, linkedHashMap4, uiComponent);
                    applyDisabledState(materialCardView, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                    return;
                }
                if (uiComponent instanceof GovernmentIdNfcScanComponent) {
                    Object tag18 = view.getTag();
                    tag18.getClass();
                    GovernmentIdNfcScanViewHolder governmentIdNfcScanViewHolder = (GovernmentIdNfcScanViewHolder) tag18;
                    Pi2UiDateFieldBinding pi2UiDateFieldBinding2 = governmentIdNfcScanViewHolder.expirationDateBinding;
                    Pi2UiDateFieldBinding pi2UiDateFieldBinding3 = governmentIdNfcScanViewHolder.dateOfBirthBinding;
                    TextView textView10 = governmentIdNfcScanViewHolder.errorLabel;
                    ButtonWithLoadingIndicator buttonWithLoadingIndicator6 = governmentIdNfcScanViewHolder.launchButton;
                    buttonWithLoadingIndicator6.setIsLoading(entryScreen2.isLoading && ((GovernmentIdNfcScanComponent) uiComponent).wasTapped);
                    applyComponentState(buttonWithLoadingIndicator6, linkedHashMap4, uiComponent, entryScreen2.isLoading);
                    final int i13 = 0;
                    buttonWithLoadingIndicator6.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda21
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view22) {
                            int i82 = i13;
                            UiComponent uiComponent22 = uiComponent;
                            UiScreenRunner uiScreenRunner22 = uiScreenRunner;
                            switch (i82) {
                                case 0:
                                    uiScreenRunner22.launchNfcScan.invoke(uiComponent22);
                                    break;
                                default:
                                    uiScreenRunner22.onVerifyPersonaClick.invoke(uiComponent22);
                                    break;
                            }
                        }
                    });
                    View view4 = governmentIdNfcScanViewHolder.tipsButton;
                    if (view4 != null) {
                        view4.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(12, entryScreen2, uiScreenRunner));
                    }
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
                    GovernmentIdNfcScan governmentIdNfcScan = governmentIdNfcScanComponent.config;
                    UiComponentError uiComponentError = (UiComponentError) linkedHashMap5.get(governmentIdNfcScanComponent.getName());
                    if (uiComponentError instanceof UiComponentError.UiInputComponentError) {
                        textView10.setText(((UiComponentError.UiInputComponentError) uiComponentError).getMessage());
                        textView10.setVisibility(0);
                        return;
                    }
                    if (!(uiComponentError instanceof UiComponentError.UiGovernmentIdNfcScanComponentError)) {
                        textView10.setVisibility(8);
                        return;
                    }
                    TextInputLayout textInputLayout19 = governmentIdNfcScanViewHolder.cardAccessNumber;
                    UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentError;
                    String str16 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.cardAccessNumberName);
                    GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = governmentIdNfcScan.getStyles();
                    ViewUtilsKt.setOrClearError(textInputLayout19, str16, (styles5 == null || (cardAccessNumberStyle = styles5.getCardAccessNumberStyle()) == null) ? null : cardAccessNumberStyle.getErrorTextStyle());
                    TextInputLayout textInputLayout20 = governmentIdNfcScanViewHolder.documentNumber;
                    String str17 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.documentNumberName);
                    GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles6 = governmentIdNfcScan.getStyles();
                    ViewUtilsKt.setOrClearError(textInputLayout20, str17, (styles6 == null || (documentNumberStyle = styles6.getDocumentNumberStyle()) == null) ? null : documentNumberStyle.getErrorTextStyle());
                    pi2UiDateFieldBinding3.errorLabel.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.dateOfBirthName));
                    pi2UiDateFieldBinding3.errorLabel.setVisibility(0);
                    pi2UiDateFieldBinding2.errorLabel.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.expirationDateName));
                    pi2UiDateFieldBinding2.errorLabel.setVisibility(0);
                    return;
                }
                if ((uiComponent instanceof CreatePersonaSheetComponent) || (uiComponent instanceof ImagePreviewComponent) || (uiComponent instanceof LocalImageComponent) || (uiComponent instanceof PrivacyPolicyComponent) || (uiComponent instanceof QRCodeComponent) || (uiComponent instanceof RemoteImageComponent) || (uiComponent instanceof SpacerComponent) || (uiComponent instanceof TextComponent) || (uiComponent instanceof TitleComponent) || (uiComponent instanceof BrandingComponent)) {
                    applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading());
                    return;
                }
                if (!(uiComponent instanceof InputFileUploadComponent)) {
                    if (!(uiComponent instanceof PhoneNumberSnaComponent) && !(uiComponent instanceof HelpBottomSheetComponent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                Object tag19 = view.getTag();
                tag19.getClass();
                Pi2UiInputFileUploadBinding pi2UiInputFileUploadBinding = (Pi2UiInputFileUploadBinding) tag19;
                TextView textView11 = pi2UiInputFileUploadBinding.errorText;
                TextView textView12 = pi2UiInputFileUploadBinding.chosenFilesList;
                InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) uiComponent;
                List list9 = inputFileUploadComponent.selectedFiles;
                Object obj20 = map2.get(inputFileUploadComponent.getName());
                InputFileUpload inputFileUpload = obj20 instanceof InputFileUpload ? (InputFileUpload) obj20 : null;
                if (!list9.isEmpty()) {
                    textView12.setText(CollectionsKt.joinToString$default(list9, ", ", null, null, 0, null, new InstantKt$$ExternalSyntheticLambda0(i12), 30));
                    textView12.setVisibility(0);
                } else if (inputFileUploadComponent.hasPrefill) {
                    if (inputFileUpload == null || (attributes = inputFileUpload.getAttributes()) == null || (prefill = attributes.getPrefill()) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<T> it5 = prefill.iterator();
                        while (it5.hasNext()) {
                            String filename = ((InputFileUpload.PrefillItem) it5.next()).getFilename();
                            if (filename != null) {
                                arrayList3.add(filename);
                            }
                        }
                        arrayList = arrayList3;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        textView12.setText(R.string.pi2_file_upload_no_file_chosen);
                        textView12.setVisibility(0);
                    } else {
                        textView12.setText(CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62));
                        textView12.setVisibility(0);
                    }
                } else {
                    textView12.setText(R.string.pi2_file_upload_no_file_chosen);
                    textView12.setVisibility(0);
                }
                Object obj21 = linkedHashMap5.get(inputFileUploadComponent.getName());
                UiComponentError.UiInputComponentError uiInputComponentError13 = obj21 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj21 : null;
                if (uiInputComponentError13 != null) {
                    textView11.setText(uiInputComponentError13.getMessage());
                    textView11.setVisibility(0);
                } else {
                    textView11.setText("");
                    textView11.setVisibility(8);
                }
                applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading());
                return;
            }
            Object tag20 = view.getTag();
            tag20.getClass();
            TextView textView13 = ((Pi2UiInputCheckboxGroupBinding) tag20).checkboxGroupError;
            Object obj22 = linkedHashMap5.get(((InputCheckboxGroupComponent) uiComponent).name);
            UiComponentError.UiInputComponentError uiInputComponentError14 = obj22 instanceof UiComponentError.UiInputComponentError ? (UiComponentError.UiInputComponentError) obj22 : null;
            if (uiInputComponentError14 != null) {
                textView13.setText(uiInputComponentError14.getMessage());
                textView13.setVisibility(0);
            } else {
                textView13.setText("");
                textView13.setVisibility(8);
            }
            applyComponentState(view, linkedHashMap4, uiComponent, entryScreen2.isLoading);
            View findViewById2 = view.findViewById(R.id.checkbox_group_container);
            findViewById2.getClass();
            Iterator it6 = new ViewGroupKt$children$1((ViewGroup) findViewById2).iterator();
            while (true) {
                ViewGroupKt$iterator$1 viewGroupKt$iterator$12 = (ViewGroupKt$iterator$1) it6;
                if (!viewGroupKt$iterator$12.hasNext()) {
                    return;
                } else {
                    applyDisabledState((View) viewGroupKt$iterator$12.next(), linkedHashMap4, uiComponent, entryScreen2.isLoading);
                }
            }
        }
    }
}
