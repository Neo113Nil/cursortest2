package com.withpersona.sdk2.inquiry.steps.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.google.android.play.integrity.internal.ah;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputConfirmationCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputDate;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMaskedText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputMultiSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputRadioGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LinkButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HorizontalStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HorizontalStackComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponentKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.LinkButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.MaskTextInputState;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputFileUploadBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSecureTextBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiTextBinding;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda29;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import net.idrnd.face.iad.capture.internal.o0;
import papa.Choreographers$$ExternalSyntheticLambda1;
import sqip.internal.CreditCardEditor$$ExternalSyntheticLambda1;
import sqip.internal.GiftCardEditor$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class UiStepUtils {
    public static final UiStepUtils INSTANCE = new UiStepUtils();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    public static MarkwonImpl generateViewsFromUiScreen$default(UiStepUtils uiStepUtils, Context context, UiComponentScreen uiComponentScreen, boolean z) {
        Iterable<UiComponent> iterable;
        FooterComponent footerComponent;
        Object obj;
        Object obj2;
        Editable text;
        ComponentView componentView;
        uiComponentScreen.getClass();
        List list = uiComponentScreen.components;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MarkwonImpl markwonImpl = new MarkwonImpl(context);
        FooterComponent footerComponent2 = null;
        int i = 0;
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_main_view_container, (ViewGroup) null, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        List list2 = uiComponentScreen.componentConfigs;
        if (list != null) {
            iterable = new ArrayList();
            for (Object obj3 : list) {
                if (!(((UiComponent) obj3) instanceof FooterComponent)) {
                    iterable.add(obj3);
                }
            }
        } else {
            iterable = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parseTreeView = parseTreeView(iterable, UiComponentKt.toMap(list2), arrayList, markwonImpl);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        Iterator it = parseTreeView.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setId(View.generateViewId());
            view.setSaveEnabled(false);
            constraintLayout.addView(view);
            constraintSet.connect$1(view.getId(), 6, 0, 6);
            constraintSet.connect$1(view.getId(), 7, 0, 7);
            constraintSet.get(view.getId()).layout.mHeight = -2;
            constraintSet.get(view.getId()).layout.widthDefault = 0;
            constraintSet.setVerticalBias(0.5f, view.getId());
            footerComponent2 = footerComponent2;
        }
        FooterComponent footerComponent3 = footerComponent2;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((ComponentView) next).component.getName(), next);
        }
        if (parseTreeView.size() > 1) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parseTreeView, 10));
            Iterator it3 = parseTreeView.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((View) it3.next()).getId()));
            }
            constraintSet.createVerticalChain(3, CollectionsKt.toIntArray(arrayList2));
            if (uiComponentScreen.styles == null) {
                int i2 = 0;
                for (UiComponent uiComponent : iterable) {
                    int i3 = i2 + 1;
                    if (!(uiComponent instanceof SpacerComponent) && (componentView = (ComponentView) linkedHashMap.get(uiComponent.getName())) != null) {
                        View view2 = componentView.view;
                        if (i2 != CollectionsKt__CollectionsKt.getLastIndex(iterable)) {
                            constraintSet.get(view2.getId()).layout.bottomMargin = (int) ExtensionsKt.getDpToPx(16.0d);
                        }
                    }
                    i2 = i3;
                }
            }
        }
        if (!z) {
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) ExtensionsKt.getDpToPx(24.0d));
        }
        constraintSet.applyTo(constraintLayout);
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        Object systemService = context2.getSystemService("accessibility");
        systemService.getClass();
        if (!((AccessibilityManager) systemService).isEnabled()) {
            ArrayList<View> focusables = constraintLayout.getFocusables(2);
            focusables.getClass();
            Iterator it4 = focusables.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = footerComponent3;
                    break;
                }
                obj2 = it4.next();
                View view3 = (View) obj2;
                if ((view3 instanceof EditText) && ((text = ((EditText) view3).getText()) == null || StringsKt.isBlank(text))) {
                    break;
                }
            }
            View view4 = (View) obj2;
            if (view4 != null) {
                view4.requestFocus();
                view4.post(new ViewUtils$$ExternalSyntheticLambda0(view4, 7));
            }
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof FooterComponent) {
                    arrayList3.add(obj4);
                }
            }
            footerComponent = (FooterComponent) CollectionsKt.firstOrNull((List) arrayList3);
        } else {
            footerComponent = footerComponent3;
        }
        if (footerComponent != null) {
            LinkedHashMap map = UiComponentKt.toMap(list2);
            ArrayList arrayList4 = new ArrayList();
            ArrayList parseTreeView2 = parseTreeView(CollectionsKt__CollectionsJVMKt.listOf(footerComponent), map, arrayList4, markwonImpl);
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                linkedHashMap.put(((ComponentView) next2).component.getName(), next2);
            }
            obj = (View) CollectionsKt.first((List) parseTreeView2);
        } else {
            obj = footerComponent3;
        }
        ah.addOneShotPreDrawListenerAndDiscardFrame(constraintLayout, new UiStepUtils$$ExternalSyntheticLambda0(markwonImpl, i));
        return new MarkwonImpl(new o0(linkedHashMap, 17), constraintLayout, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0f3d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0f49  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0f4c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator] */
    /* JADX WARN: Type inference failed for: r18v4, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r21v2, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r9v112, types: [com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator] */
    /* JADX WARN: Type inference failed for: r9v115, types: [com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator] */
    /* JADX WARN: Type inference failed for: r9v118, types: [com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton] */
    /* JADX WARN: Type inference failed for: r9v121, types: [com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator] */
    /* JADX WARN: Type inference failed for: r9v124, types: [com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton] */
    /* JADX WARN: Type inference failed for: r9v131, types: [com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator] */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r9v22, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r9v26, types: [com.google.android.material.imageview.ShapeableImageView] */
    /* JADX WARN: Type inference failed for: r9v28, types: [com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView] */
    /* JADX WARN: Type inference failed for: r9v29, types: [com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView] */
    /* JADX WARN: Type inference failed for: r9v31, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v33, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r9v35, types: [android.widget.TextView, com.withpersona.sdk2.inquiry.shared.ui.PersonaTextView] */
    /* JADX WARN: Type inference failed for: r9v36, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v52, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r9v68, types: [androidx.constraintlayout.widget.ConstraintLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v79, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r9v84, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList parseTreeView(List list, LinkedHashMap linkedHashMap, ArrayList arrayList, MarkwonImpl markwonImpl) {
        Iterator it;
        ArrayList arrayList2;
        MarkwonImpl markwonImpl2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        TextInputLayout buttonViewWithLoadingIndicator;
        LinearLayout linearLayout;
        EditText editText;
        String label;
        InputConfirmationCodeComponent inputConfirmationCodeComponent;
        List list2;
        EditText editText2;
        List<OptionWithDescription> list3;
        LinearLayout linearLayout2;
        TextBasedComponentStyle errorTextStyle;
        List<String> prefill;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        InputText.InputType inputType;
        String str;
        String str2;
        ButtonWithLoadingIndicator buttonWithLoadingIndicator;
        TextInputLayout textInputLayout;
        ButtonWithLoadingIndicator buttonWithLoadingIndicator2;
        List<GovernmentIdNfcScan.ScanHint> scanHints;
        GovernmentIdNfcScan.TipsButtonLocation tipsButtonLocation;
        String str3;
        ButtonWithLoadingIndicator buttonWithLoadingIndicator3;
        ButtonSubmitComponentStyle secondaryButtonStyle;
        Boolean hidePrefilledInputs;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        MarkwonImpl markwonImpl3 = markwonImpl;
        Context context = (Context) markwonImpl3.parser;
        LayoutInflater layoutInflater = (LayoutInflater) markwonImpl3.visitorFactory;
        LinkedList linkedList = (LinkedList) markwonImpl3.plugins;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            UiComponent uiComponent = (UiComponent) it2.next();
            if (uiComponent instanceof ActionButtonComponent) {
                ActionButtonComponent actionButtonComponent = (ActionButtonComponent) uiComponent;
                Object obj = linkedHashMap3.get(actionButtonComponent.name);
                obj.getClass();
                linearLayout7 = UiComponentKt.buttonViewWithLoadingIndicator(actionButtonComponent, markwonImpl3, (ActionButton) obj);
            } else if (uiComponent instanceof CancelButtonComponent) {
                CancelButtonComponent cancelButtonComponent = (CancelButtonComponent) uiComponent;
                Object obj2 = linkedHashMap3.get(cancelButtonComponent.name);
                obj2.getClass();
                linearLayout7 = UiComponentKt.buttonView(cancelButtonComponent, markwonImpl3, (CancelButton) obj2);
            } else if (uiComponent instanceof CombinedStepButtonComponent) {
                CombinedStepButtonComponent combinedStepButtonComponent = (CombinedStepButtonComponent) uiComponent;
                Object obj3 = linkedHashMap3.get(combinedStepButtonComponent.name);
                obj3.getClass();
                linearLayout7 = UiComponentKt.buttonViewWithLoadingIndicator(combinedStepButtonComponent, markwonImpl3, (CombinedStepButton) obj3);
            } else if (uiComponent instanceof CompleteButtonComponent) {
                CompleteButtonComponent completeButtonComponent = (CompleteButtonComponent) uiComponent;
                Object obj4 = linkedHashMap3.get(completeButtonComponent.name);
                obj4.getClass();
                linearLayout7 = UiComponentKt.buttonView(completeButtonComponent, markwonImpl3, (CompleteButton) obj4);
            } else if (uiComponent instanceof LinkButtonComponent) {
                LinkButtonComponent linkButtonComponent = (LinkButtonComponent) uiComponent;
                Object obj5 = linkedHashMap3.get(linkButtonComponent.name);
                obj5.getClass();
                linearLayout7 = UiComponentKt.buttonViewWithLoadingIndicator(linkButtonComponent, markwonImpl3, (LinkButton) obj5);
            } else if (uiComponent instanceof SubmitButtonComponent) {
                SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) uiComponent;
                Object obj6 = linkedHashMap3.get(submitButtonComponent.name);
                obj6.getClass();
                linearLayout7 = UiComponentKt.buttonViewWithLoadingIndicator(submitButtonComponent, markwonImpl3, (SubmitButton) obj6);
            } else {
                int i = 24;
                if (uiComponent instanceof ESignatureComponent) {
                    ESignatureComponent eSignatureComponent = (ESignatureComponent) uiComponent;
                    Object obj7 = linkedHashMap3.get(eSignatureComponent.name);
                    obj7.getClass();
                    ESignature eSignature = (ESignature) obj7;
                    View inflate = layoutInflater.inflate(R.layout.pi2_ui_signature_field, (ViewGroup) null, false);
                    int i2 = R.id.add_signature_label;
                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.add_signature_label);
                    if (textView != null) {
                        i2 = R.id.edit_signature_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.edit_signature_icon);
                        if (imageView != null) {
                            i2 = R.id.error_label;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.error_label);
                            if (textView2 != null) {
                                i2 = R.id.label;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.label);
                                if (textView3 != null) {
                                    i2 = R.id.signature_container;
                                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(inflate, R.id.signature_container);
                                    if (materialCardView != null) {
                                        i2 = R.id.signature_preview;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.signature_preview);
                                        if (imageView2 != null) {
                                            ?? r18 = (ConstraintLayout) inflate;
                                            Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding = new Pi2UiSignatureFieldBinding(r18, textView, imageView, textView2, textView3, materialCardView, imageView2);
                                            linkedList.add(new UiScreenRunner$$ExternalSyntheticLambda29(i, eSignature, pi2UiSignatureFieldBinding, eSignatureComponent));
                                            r18.setTag(pi2UiSignatureFieldBinding);
                                            it = it2;
                                            arrayList2 = arrayList4;
                                            linearLayout5 = r18;
                                            arrayList3 = arrayList;
                                            markwonImpl2 = markwonImpl3;
                                            linearLayout6 = linearLayout5;
                                            linkedHashMap2 = linkedHashMap3;
                                            linearLayout = linearLayout6;
                                            if (linearLayout != null) {
                                                arrayList3.add(new ComponentView(uiComponent, linearLayout));
                                            }
                                            ArrayList arrayList5 = arrayList2;
                                            if (linearLayout == null) {
                                                arrayList5.add(linearLayout);
                                            }
                                            arrayList4 = arrayList5;
                                            linkedHashMap3 = linkedHashMap2;
                                            markwonImpl3 = markwonImpl2;
                                            it2 = it;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                    return null;
                }
                if (uiComponent instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) uiComponent;
                    Object obj8 = linkedHashMap3.get(governmentIdNfcScanComponent.name);
                    obj8.getClass();
                    GovernmentIdNfcScan governmentIdNfcScan = (GovernmentIdNfcScan) obj8;
                    LinearLayout linearLayout8 = new LinearLayout(context);
                    linearLayout8.setOrientation(1);
                    GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScan.getAttributes();
                    String cardAccessNumberLabel = attributes != null ? attributes.getCardAccessNumberLabel() : null;
                    GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScan.getAttributes();
                    String prefillCardAccessNumber = attributes2 != null ? attributes2.getPrefillCardAccessNumber() : null;
                    InputText.InputType inputType2 = InputText.InputType.TEXT;
                    GovernmentIdNfcScan.Attributes attributes3 = governmentIdNfcScan.getAttributes();
                    JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
                    GovernmentIdNfcScan.Attributes attributes4 = governmentIdNfcScan.getAttributes();
                    InputText.Attributes attributes5 = new InputText.Attributes(prefillCardAccessNumber, cardAccessNumberLabel, null, inputType2, null, attributes4 != null ? attributes4.getHidden() : null, disabled);
                    GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles = governmentIdNfcScan.getStyles();
                    InputText inputText = new InputText("can_access_code", attributes5, styles != null ? styles.getDocumentNumberStyle() : null);
                    TextInputLayout makeView = InputTextComponentKt.makeView(new InputTextComponent(inputText), markwonImpl3, inputText, governmentIdNfcScanComponent.cardAccessNumberController);
                    makeView.setId(R.id.pi2_government_id_nfc_scan_can_access_code);
                    linearLayout8.addView(makeView);
                    GovernmentIdNfcScan.Attributes attributes6 = governmentIdNfcScan.getAttributes();
                    String documentNumberLabel = attributes6 != null ? attributes6.getDocumentNumberLabel() : null;
                    GovernmentIdNfcScan.Attributes attributes7 = governmentIdNfcScan.getAttributes();
                    if (attributes7 != null) {
                        inputType = inputType2;
                        str = attributes7.getPrefillDocumentNumber();
                    } else {
                        inputType = inputType2;
                        str = null;
                    }
                    GovernmentIdNfcScan.Attributes attributes8 = governmentIdNfcScan.getAttributes();
                    JsonLogicBoolean disabled2 = attributes8 != null ? attributes8.getDisabled() : null;
                    GovernmentIdNfcScan.Attributes attributes9 = governmentIdNfcScan.getAttributes();
                    InputText.Attributes attributes10 = new InputText.Attributes(str, documentNumberLabel, null, inputType, null, attributes9 != null ? attributes9.getHidden() : null, disabled2);
                    GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles2 = governmentIdNfcScan.getStyles();
                    it = it2;
                    InputText inputText2 = new InputText("doc_number", attributes10, styles2 != null ? styles2.getDocumentNumberStyle() : null);
                    TextInputLayout makeView2 = InputTextComponentKt.makeView(new InputTextComponent(inputText2), markwonImpl3, inputText2, governmentIdNfcScanComponent.documentNumberController);
                    makeView2.setId(R.id.pi2_government_id_nfc_scan_document_number);
                    linearLayout8.addView(makeView2);
                    GovernmentIdNfcScan.Attributes attributes11 = governmentIdNfcScan.getAttributes();
                    String dateOfBirthLabel = attributes11 != null ? attributes11.getDateOfBirthLabel() : null;
                    GovernmentIdNfcScan.Attributes attributes12 = governmentIdNfcScan.getAttributes();
                    String prefillDateOfBirth = attributes12 != null ? attributes12.getPrefillDateOfBirth() : null;
                    GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.INSTANCE;
                    List<String> generateTextMonths = companion.generateTextMonths();
                    GovernmentIdNfcScan.Attributes attributes13 = governmentIdNfcScan.getAttributes();
                    JsonLogicBoolean disabled3 = attributes13 != null ? attributes13.getDisabled() : null;
                    GovernmentIdNfcScan.Attributes attributes14 = governmentIdNfcScan.getAttributes();
                    InputDate.Attributes attributes15 = new InputDate.Attributes(prefillDateOfBirth, dateOfBirthLabel, null, null, null, generateTextMonths, attributes14 != null ? attributes14.getHidden() : null, disabled3, 28, null);
                    GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles3 = governmentIdNfcScan.getStyles();
                    InputDate inputDate = new InputDate("dob", styles3 != null ? styles3.getDateStyle() : null, attributes15);
                    ConstraintLayout makeView3 = InputDateComponentKt.makeView(new InputDateComponent(inputDate), markwonImpl3, governmentIdNfcScanComponent.dateOfBirthController, inputDate);
                    makeView3.setId(R.id.pi2_government_id_nfc_scan_date_of_birth);
                    linearLayout8.addView(makeView3);
                    GovernmentIdNfcScan.Attributes attributes16 = governmentIdNfcScan.getAttributes();
                    String expirationDateLabel = attributes16 != null ? attributes16.getExpirationDateLabel() : null;
                    GovernmentIdNfcScan.Attributes attributes17 = governmentIdNfcScan.getAttributes();
                    String prefillExpirationDate = attributes17 != null ? attributes17.getPrefillExpirationDate() : null;
                    List<String> generateTextMonths2 = companion.generateTextMonths();
                    GovernmentIdNfcScan.Attributes attributes18 = governmentIdNfcScan.getAttributes();
                    JsonLogicBoolean disabled4 = attributes18 != null ? attributes18.getDisabled() : null;
                    GovernmentIdNfcScan.Attributes attributes19 = governmentIdNfcScan.getAttributes();
                    InputDate.Attributes attributes20 = new InputDate.Attributes(prefillExpirationDate, expirationDateLabel, null, null, null, generateTextMonths2, attributes19 != null ? attributes19.getHidden() : null, disabled4, 28, null);
                    GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles4 = governmentIdNfcScan.getStyles();
                    InputDate inputDate2 = new InputDate(GovernmentIdNfcScan.expirationDateName, styles4 != null ? styles4.getDateStyle() : null, attributes20);
                    ConstraintLayout makeView4 = InputDateComponentKt.makeView(new InputDateComponent(inputDate2), markwonImpl3, governmentIdNfcScanComponent.expirationDateController, inputDate2);
                    makeView4.setId(R.id.pi2_government_id_nfc_scan_expiration_date);
                    linearLayout8.addView(makeView4);
                    GovernmentIdNfcScan.Attributes attributes21 = governmentIdNfcScan.getAttributes();
                    if (attributes21 == null || (str2 = attributes21.getLaunchButtonText()) == null) {
                        str2 = "";
                    }
                    BasicButtonAttributes basicButtonAttributes = new BasicButtonAttributes(str2, Button.ButtonType.PRIMARY, null, null, null, null, 60, null);
                    GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = governmentIdNfcScan.getStyles();
                    SubmitButton submitButton = new SubmitButton(GovernmentIdNfcScan.launchButtonName, basicButtonAttributes, styles5 != null ? styles5.getLaunchButtonStyle() : null);
                    String name = submitButton.getName();
                    BasicButtonAttributes attributes22 = submitButton.getAttributes();
                    if (attributes22 != null) {
                        attributes22.getHidden();
                    }
                    BasicButtonAttributes attributes23 = submitButton.getAttributes();
                    if (attributes23 != null) {
                        attributes23.getDisabled();
                    }
                    BasicButtonAttributes attributes24 = submitButton.getAttributes();
                    if (attributes24 != null) {
                        attributes24.getAutoSubmitCountdownText();
                    }
                    BasicButtonAttributes attributes25 = submitButton.getAttributes();
                    if (attributes25 != null) {
                        attributes25.getAutoSubmitIntervalSeconds();
                    }
                    name.getClass();
                    new ArrayList();
                    BaseButtonComponentStyle styles6 = submitButton.getStyles();
                    if (styles6 != null) {
                        buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(context, 0);
                        BaseButtonAttributes attributes26 = submitButton.getAttributes();
                        if (attributes26 != null) {
                            buttonWithLoadingIndicator.setText(attributes26.getText());
                        }
                        linkedList.add(new Regex$$ExternalSyntheticLambda1(17, buttonWithLoadingIndicator, styles6));
                    } else {
                        buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(context, UiComponentKt.getButtonStyle(submitButton));
                        BaseButtonAttributes attributes27 = submitButton.getAttributes();
                        if (attributes27 != null) {
                            buttonWithLoadingIndicator.setText(attributes27.getText());
                        }
                    }
                    buttonWithLoadingIndicator.setId(R.id.pi2_government_id_nfc_scan_launch_button);
                    linearLayout8.addView(buttonWithLoadingIndicator);
                    GovernmentIdNfcScan.Attributes attributes28 = governmentIdNfcScan.getAttributes();
                    String prefillCardAccessNumber2 = attributes28 != null ? attributes28.getPrefillCardAccessNumber() : null;
                    if (prefillCardAccessNumber2 == null || StringsKt.isBlank(prefillCardAccessNumber2)) {
                        makeView.setVisibility(8);
                    }
                    GovernmentIdNfcScan.Attributes attributes29 = governmentIdNfcScan.getAttributes();
                    if (attributes29 == null || (hidePrefilledInputs = attributes29.getHidePrefilledInputs()) == null || !hidePrefilledInputs.booleanValue()) {
                        textInputLayout = makeView;
                    } else {
                        textInputLayout = makeView;
                        linkedList.add(new UiWorkflow$$ExternalSyntheticLambda25(textInputLayout, makeView2, makeView3, makeView4, 26));
                    }
                    GovernmentIdNfcScan.Attributes attributes30 = governmentIdNfcScan.getAttributes();
                    if (attributes30 != null && (scanHints = attributes30.getScanHints()) != null && (!scanHints.isEmpty())) {
                        GovernmentIdNfcScan.Attributes attributes31 = governmentIdNfcScanComponent.config.getAttributes();
                        if (attributes31 == null || (tipsButtonLocation = attributes31.getTipsButtonLocation()) == null) {
                            tipsButtonLocation = GovernmentIdNfcScan.TipsButtonLocation.NavigationBar;
                        }
                        if (tipsButtonLocation == GovernmentIdNfcScan.TipsButtonLocation.OnScreen) {
                            GovernmentIdNfcScan.Attributes attributes32 = governmentIdNfcScan.getAttributes();
                            if (attributes32 == null || (str3 = attributes32.getErrorModalTroubleshootingTipsButtonText()) == null) {
                                str3 = "Troubleshooting tips";
                            }
                            BasicButtonAttributes basicButtonAttributes2 = new BasicButtonAttributes(str3, Button.ButtonType.SECONDARY, null, null, null, null, 60, null);
                            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles7 = governmentIdNfcScan.getStyles();
                            SubmitButton submitButton2 = new SubmitButton("nfc_tips_button", basicButtonAttributes2, (styles7 == null || (secondaryButtonStyle = styles7.getSecondaryButtonStyle()) == null) ? null : new ButtonSubmitComponentStyle(secondaryButtonStyle.getPadding(), null, secondaryButtonStyle.getJustify(), secondaryButtonStyle.getFontFamily(), secondaryButtonStyle.getFontSize(), secondaryButtonStyle.getFontWeight(), secondaryButtonStyle.getLetterSpacing(), secondaryButtonStyle.getLineHeight(), secondaryButtonStyle.getTextColor(), secondaryButtonStyle.getHeight(), secondaryButtonStyle.getWidth(), secondaryButtonStyle.getBackgroundColor(), secondaryButtonStyle.getBorderColor(), secondaryButtonStyle.getBorderRadius(), secondaryButtonStyle.getBorderWidth()));
                            String name2 = submitButton2.getName();
                            BasicButtonAttributes attributes33 = submitButton2.getAttributes();
                            if (attributes33 != null) {
                                attributes33.getHidden();
                            }
                            BasicButtonAttributes attributes34 = submitButton2.getAttributes();
                            if (attributes34 != null) {
                                attributes34.getDisabled();
                            }
                            BasicButtonAttributes attributes35 = submitButton2.getAttributes();
                            if (attributes35 != null) {
                                attributes35.getAutoSubmitCountdownText();
                            }
                            BasicButtonAttributes attributes36 = submitButton2.getAttributes();
                            if (attributes36 != null) {
                                attributes36.getAutoSubmitIntervalSeconds();
                            }
                            name2.getClass();
                            new ArrayList();
                            BaseButtonComponentStyle styles8 = submitButton2.getStyles();
                            if (styles8 != null) {
                                buttonWithLoadingIndicator3 = new ButtonWithLoadingIndicator(context, 0);
                                BaseButtonAttributes attributes37 = submitButton2.getAttributes();
                                if (attributes37 != null) {
                                    buttonWithLoadingIndicator3.setText(attributes37.getText());
                                }
                                linkedList.add(new Regex$$ExternalSyntheticLambda1(17, buttonWithLoadingIndicator3, styles8));
                            } else {
                                buttonWithLoadingIndicator3 = new ButtonWithLoadingIndicator(context, UiComponentKt.getButtonStyle(submitButton2));
                                BaseButtonAttributes attributes38 = submitButton2.getAttributes();
                                if (attributes38 != null) {
                                    buttonWithLoadingIndicator3.setText(attributes38.getText());
                                }
                            }
                            buttonWithLoadingIndicator3.setId(R.id.pi2_government_id_nfc_scan_tips_button);
                            linearLayout8.addView(buttonWithLoadingIndicator3);
                            ViewGroup.LayoutParams layoutParams = buttonWithLoadingIndicator3.getLayoutParams();
                            if (layoutParams == null) {
                                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                return null;
                            }
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = (int) ExtensionsKt.getDpToPx(8.0d);
                            buttonWithLoadingIndicator3.setLayoutParams(layoutParams2);
                            buttonWithLoadingIndicator2 = buttonWithLoadingIndicator3;
                            TextView textView4 = new TextView(linearLayout8.getContext());
                            textView4.setId(R.id.pi2_government_id_nfc_scan_error_label);
                            linkedList.add(new StateFlowsKt$$ExternalSyntheticLambda2(21, textView4, governmentIdNfcScan));
                            linearLayout8.addView(textView4);
                            Object tag = makeView3.getTag();
                            tag.getClass();
                            Pi2UiDateFieldBinding pi2UiDateFieldBinding = (Pi2UiDateFieldBinding) tag;
                            Object tag2 = makeView4.getTag();
                            tag2.getClass();
                            linearLayout8.setTag(new GovernmentIdNfcScanViewHolder(textInputLayout, makeView2, pi2UiDateFieldBinding, (Pi2UiDateFieldBinding) tag2, buttonWithLoadingIndicator, buttonWithLoadingIndicator2, textView4));
                            markwonImpl2 = markwonImpl3;
                            arrayList2 = arrayList4;
                            linearLayout4 = linearLayout8;
                        }
                    }
                    buttonWithLoadingIndicator2 = null;
                    TextView textView42 = new TextView(linearLayout8.getContext());
                    textView42.setId(R.id.pi2_government_id_nfc_scan_error_label);
                    linkedList.add(new StateFlowsKt$$ExternalSyntheticLambda2(21, textView42, governmentIdNfcScan));
                    linearLayout8.addView(textView42);
                    Object tag3 = makeView3.getTag();
                    tag3.getClass();
                    Pi2UiDateFieldBinding pi2UiDateFieldBinding2 = (Pi2UiDateFieldBinding) tag3;
                    Object tag22 = makeView4.getTag();
                    tag22.getClass();
                    linearLayout8.setTag(new GovernmentIdNfcScanViewHolder(textInputLayout, makeView2, pi2UiDateFieldBinding2, (Pi2UiDateFieldBinding) tag22, buttonWithLoadingIndicator, buttonWithLoadingIndicator2, textView42));
                    markwonImpl2 = markwonImpl3;
                    arrayList2 = arrayList4;
                    linearLayout4 = linearLayout8;
                } else {
                    it = it2;
                    if (uiComponent instanceof ImagePreviewComponent) {
                        Object obj9 = linkedHashMap3.get(((ImagePreviewComponent) uiComponent).name);
                        obj9.getClass();
                        o inflate$1 = o.inflate$1(layoutInflater);
                        linkedList.add(new StateFlowsKt$$ExternalSyntheticLambda2(23, inflate$1, (CombinedStepImagePreview) obj9));
                        markwonImpl2 = markwonImpl3;
                        arrayList2 = arrayList4;
                        linearLayout4 = (ImageView) inflate$1.a;
                    } else {
                        if (uiComponent instanceof InputAddressComponent) {
                            InputAddressComponent inputAddressComponent = (InputAddressComponent) uiComponent;
                            Object obj10 = linkedHashMap3.get(inputAddressComponent.name);
                            obj10.getClass();
                            InputAddress inputAddress = (InputAddress) obj10;
                            View inflate2 = layoutInflater.inflate(R.layout.pi2_ui_address_field, (ViewGroup) null, false);
                            int i3 = R.id.address_city;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(inflate2, R.id.address_city);
                            if (textInputLayout2 != null) {
                                i3 = R.id.address_expand_components_button;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(inflate2, R.id.address_expand_components_button);
                                if (textView5 != null) {
                                    i3 = R.id.address_field_collapsed;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(inflate2, R.id.address_field_collapsed);
                                    if (textInputLayout3 != null) {
                                        i3 = R.id.address_field_collapsed_text_view;
                                        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) ViewBindings.findChildViewById(inflate2, R.id.address_field_collapsed_text_view);
                                        if (materialAutoCompleteTextView != null) {
                                            i3 = R.id.address_field_expanded;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(inflate2, R.id.address_field_expanded);
                                            if (textInputLayout4 != null) {
                                                i3 = R.id.address_field_expanded_text_view;
                                                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) ViewBindings.findChildViewById(inflate2, R.id.address_field_expanded_text_view);
                                                if (materialAutoCompleteTextView2 != null) {
                                                    ?? r21 = (ConstraintLayout) inflate2;
                                                    i3 = R.id.address_fields_collapsed;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate2, R.id.address_fields_collapsed);
                                                    if (constraintLayout != null) {
                                                        i3 = R.id.address_fields_expanded;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(inflate2, R.id.address_fields_expanded);
                                                        if (constraintLayout2 != null) {
                                                            i3 = R.id.address_label;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(inflate2, R.id.address_label);
                                                            if (textView6 != null) {
                                                                i3 = R.id.address_postal_code;
                                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(inflate2, R.id.address_postal_code);
                                                                if (textInputLayout5 != null) {
                                                                    i3 = R.id.address_subdivision;
                                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(inflate2, R.id.address_subdivision);
                                                                    if (textInputLayout6 != null) {
                                                                        i3 = R.id.address_suite;
                                                                        TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(inflate2, R.id.address_suite);
                                                                        if (textInputLayout7 != null) {
                                                                            i3 = R.id.edit_text_city;
                                                                            if (((TextInputEditText) ViewBindings.findChildViewById(inflate2, R.id.edit_text_city)) != null) {
                                                                                i3 = R.id.edit_text_postal_code;
                                                                                if (((TextInputEditText) ViewBindings.findChildViewById(inflate2, R.id.edit_text_postal_code)) != null) {
                                                                                    i3 = R.id.edit_text_subdivision;
                                                                                    if (((TextInputEditText) ViewBindings.findChildViewById(inflate2, R.id.edit_text_subdivision)) != null) {
                                                                                        i3 = R.id.edit_text_suite;
                                                                                        if (((TextInputEditText) ViewBindings.findChildViewById(inflate2, R.id.edit_text_suite)) != null) {
                                                                                            i3 = R.id.progress_indicator;
                                                                                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate2, R.id.progress_indicator);
                                                                                            if (circularProgressIndicator != null) {
                                                                                                Pi2UiAddressFieldBinding pi2UiAddressFieldBinding = new Pi2UiAddressFieldBinding(r21, textInputLayout2, textView5, textInputLayout3, materialAutoCompleteTextView, textInputLayout4, materialAutoCompleteTextView2, constraintLayout, constraintLayout2, textView6, textInputLayout5, textInputLayout6, textInputLayout7, circularProgressIndicator);
                                                                                                Context context2 = context;
                                                                                                arrayList2 = arrayList4;
                                                                                                InputAddress.Attributes attributes39 = inputAddress.getAttributes();
                                                                                                LayoutInflater layoutInflater2 = layoutInflater;
                                                                                                if (attributes39 != null) {
                                                                                                    TextControllerImpl textControllerImpl = inputAddressComponent.textControllerForAddressStreet1;
                                                                                                    EditText editText3 = textInputLayout3.editText;
                                                                                                    editText3.getClass();
                                                                                                    zzna.control(textControllerImpl, editText3);
                                                                                                    TextControllerImpl textControllerImpl2 = inputAddressComponent.textControllerForAddressStreet1;
                                                                                                    EditText editText4 = textInputLayout4.editText;
                                                                                                    editText4.getClass();
                                                                                                    zzna.control(textControllerImpl2, editText4);
                                                                                                    TextControllerImpl textControllerImpl3 = inputAddressComponent.textControllerForAddressStreet2;
                                                                                                    EditText editText5 = textInputLayout7.editText;
                                                                                                    editText5.getClass();
                                                                                                    zzna.control(textControllerImpl3, editText5);
                                                                                                    TextControllerImpl textControllerImpl4 = inputAddressComponent.textControllerForAddressCity;
                                                                                                    EditText editText6 = textInputLayout2.editText;
                                                                                                    editText6.getClass();
                                                                                                    zzna.control(textControllerImpl4, editText6);
                                                                                                    TextControllerImpl textControllerImpl5 = inputAddressComponent.textControllerForAddressSubdivision;
                                                                                                    EditText editText7 = textInputLayout6.editText;
                                                                                                    editText7.getClass();
                                                                                                    zzna.control(textControllerImpl5, editText7);
                                                                                                    TextControllerImpl textControllerImpl6 = inputAddressComponent.textControllerForAddressPostalCode;
                                                                                                    EditText editText8 = textInputLayout5.editText;
                                                                                                    editText8.getClass();
                                                                                                    zzna.control(textControllerImpl6, editText8);
                                                                                                    String placeholderAutocomplete = attributes39.getPlaceholderAutocomplete();
                                                                                                    if (placeholderAutocomplete != null) {
                                                                                                        textInputLayout3.setHint(placeholderAutocomplete);
                                                                                                    }
                                                                                                    String placeholderAddressStreet1 = attributes39.getPlaceholderAddressStreet1();
                                                                                                    if (placeholderAddressStreet1 != null) {
                                                                                                        textInputLayout4.setHint(placeholderAddressStreet1);
                                                                                                    }
                                                                                                    String placeholderAddressStreet2 = attributes39.getPlaceholderAddressStreet2();
                                                                                                    if (placeholderAddressStreet2 != null) {
                                                                                                        textInputLayout7.setHint(placeholderAddressStreet2);
                                                                                                    }
                                                                                                    String placeholderAddressCity = attributes39.getPlaceholderAddressCity();
                                                                                                    if (placeholderAddressCity != null) {
                                                                                                        textInputLayout2.setHint(placeholderAddressCity);
                                                                                                    }
                                                                                                    boolean areEqual = Intrinsics.areEqual(attributes39.getSelectedCountryCode(), "US");
                                                                                                    textInputLayout6.setHint(areEqual ? attributes39.getPlaceholderAddressSubdivisionUs() : attributes39.getPlaceholderAddressSubdivision());
                                                                                                    textInputLayout5.setHint(areEqual ? attributes39.getPlaceholderAddressPostalCodeUs() : attributes39.getPlaceholderAddressPostalCode());
                                                                                                    String label2 = attributes39.getLabel();
                                                                                                    if (label2 != null) {
                                                                                                        textView6.setText(label2);
                                                                                                    }
                                                                                                    String editAddressManuallyPrompt = attributes39.getEditAddressManuallyPrompt();
                                                                                                    if (editAddressManuallyPrompt != null) {
                                                                                                        textView5.setText(editAddressManuallyPrompt);
                                                                                                    }
                                                                                                }
                                                                                                r21.setTag(pi2UiAddressFieldBinding);
                                                                                                linkedList.add(new StateFlowsKt$$ExternalSyntheticLambda2(24, inputAddress, pi2UiAddressFieldBinding));
                                                                                                textView5.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(inputAddressComponent, 27));
                                                                                                r21.setTag(pi2UiAddressFieldBinding);
                                                                                                linkedHashMap2 = linkedHashMap;
                                                                                                arrayList3 = arrayList;
                                                                                                markwonImpl2 = markwonImpl;
                                                                                                linearLayout = r21;
                                                                                                context = context2;
                                                                                                layoutInflater = layoutInflater2;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                            return null;
                        }
                        Context context3 = context;
                        LayoutInflater layoutInflater3 = layoutInflater;
                        arrayList2 = arrayList4;
                        if (uiComponent instanceof InputCheckboxComponent) {
                            InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) uiComponent;
                            linkedHashMap2 = linkedHashMap;
                            Object obj11 = linkedHashMap2.get(inputCheckboxComponent.name);
                            obj11.getClass();
                            layoutInflater = layoutInflater3;
                            markwonImpl2 = markwonImpl;
                            linearLayout3 = InputCheckboxComponentKt.makeView(inputCheckboxComponent, markwonImpl2, Pi2UiInputCheckboxBinding.inflate(layoutInflater, null), (InputCheckbox) obj11);
                        } else {
                            markwonImpl2 = markwonImpl;
                            layoutInflater = layoutInflater3;
                            if (uiComponent instanceof InputCheckboxGroupComponent) {
                                InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) uiComponent;
                                Object obj12 = linkedHashMap.get(inputCheckboxGroupComponent.name);
                                obj12.getClass();
                                InputCheckboxGroup inputCheckboxGroup = (InputCheckboxGroup) obj12;
                                View inflate3 = layoutInflater.inflate(R.layout.pi2_ui_input_checkbox_group, (ViewGroup) null, false);
                                int i4 = R.id.checkbox_group_container;
                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(inflate3, R.id.checkbox_group_container);
                                if (linearLayout9 != null) {
                                    i4 = R.id.checkbox_group_error;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(inflate3, R.id.checkbox_group_error);
                                    if (textView7 != null) {
                                        i4 = R.id.checkbox_group_label;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(inflate3, R.id.checkbox_group_label);
                                        if (textView8 != null) {
                                            LinearLayout linearLayout10 = (LinearLayout) inflate3;
                                            Pi2UiInputCheckboxGroupBinding pi2UiInputCheckboxGroupBinding = new Pi2UiInputCheckboxGroupBinding(linearLayout10, linearLayout9, textView7, textView8);
                                            InputCheckboxGroup.Attributes attributes40 = inputCheckboxGroup.getAttributes();
                                            ArrayList arrayList6 = new ArrayList();
                                            Set set = (attributes40 == null || (prefill = attributes40.getPrefill()) == null) ? null : CollectionsKt.toSet(prefill);
                                            if (attributes40 == null || (list3 = attributes40.getOptions()) == null) {
                                                list3 = EmptyList.INSTANCE;
                                            }
                                            Iterator<OptionWithDescription> it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                OptionWithDescription next = it3.next();
                                                InputCheckboxGroup.Attributes attributes41 = attributes40;
                                                Iterator<OptionWithDescription> it4 = it3;
                                                InputCheckbox inputCheckbox = new InputCheckbox(next.getValue(), new InputCheckbox.Attributes(Boolean.valueOf(set != null && set.contains(next.getValue())), next.getText(), next.getDescriptionText(), attributes41 != null ? attributes41.getHidden() : null, attributes41 != null ? attributes41.getDisabled() : null), inputCheckboxGroup.getStyles());
                                                InputCheckboxComponent inputCheckboxComponent2 = new InputCheckboxComponent(inputCheckbox, set != null && set.contains(next.getValue()));
                                                Pi2UiInputCheckboxBinding inflate4 = Pi2UiInputCheckboxBinding.inflate(layoutInflater, linearLayout9);
                                                MaterialCheckBox materialCheckBox = inflate4.checkbox;
                                                linearLayout9.addView(InputCheckboxComponentKt.makeView(inputCheckboxComponent2, markwonImpl2, inflate4, inputCheckbox));
                                                materialCheckBox.setTag(next.getValue());
                                                if (((Set) inputCheckboxGroupComponent.stringSetController._bitmapValue.getValue()).contains(next.getValue())) {
                                                    materialCheckBox.setChecked(true);
                                                }
                                                arrayList6.add(materialCheckBox);
                                                attributes40 = attributes41;
                                                it3 = it4;
                                            }
                                            InputCheckboxGroup.Attributes attributes42 = attributes40;
                                            Iterator it5 = arrayList6.iterator();
                                            while (it5.hasNext()) {
                                                ((MaterialCheckBox) it5.next()).onCheckedStateChangedListeners.add(new InputCheckboxGroupComponentKt$$ExternalSyntheticLambda0(inputCheckboxGroupComponent, arrayList6));
                                            }
                                            InputCheckbox.InputCheckboxComponentStyle styles9 = inputCheckboxGroup.getStyles();
                                            if (styles9 != null && (errorTextStyle = styles9.getErrorTextStyle()) != null) {
                                                TextStylingKt.style(pi2UiInputCheckboxGroupBinding.checkboxGroupError, errorTextStyle, EmptySet.INSTANCE);
                                            }
                                            String label3 = attributes42 != null ? attributes42.getLabel() : null;
                                            if (label3 == null || label3.length() == 0) {
                                                textView8.setVisibility(8);
                                            } else {
                                                textView8.setVisibility(0);
                                                textView8.setText(label3);
                                                linkedList.add(new StateFlowsKt$$ExternalSyntheticLambda2(26, inputCheckboxGroup, pi2UiInputCheckboxGroupBinding));
                                            }
                                            linearLayout10.setTag(pi2UiInputCheckboxGroupBinding);
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList3 = arrayList;
                                            linearLayout2 = linearLayout10;
                                            context = context3;
                                            linearLayout = linearLayout2;
                                        }
                                    }
                                }
                                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i4)));
                                return null;
                            }
                            if (uiComponent instanceof InputConfirmationCodeComponent) {
                                InputConfirmationCodeComponent inputConfirmationCodeComponent2 = (InputConfirmationCodeComponent) uiComponent;
                                linkedHashMap2 = linkedHashMap;
                                Object obj13 = linkedHashMap2.get(inputConfirmationCodeComponent2.name);
                                obj13.getClass();
                                InputConfirmationCode inputConfirmationCode = (InputConfirmationCode) obj13;
                                View inflate5 = layoutInflater.inflate(R.layout.pi2_ui_2fa_auth, (ViewGroup) null, false);
                                int i5 = R.id.first;
                                TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(inflate5, R.id.first);
                                if (textInputLayout8 != null) {
                                    i5 = R.id.first_edit_text;
                                    if (((TextInputEditText) ViewBindings.findChildViewById(inflate5, R.id.first_edit_text)) != null) {
                                        i5 = R.id.fourth;
                                        TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(inflate5, R.id.fourth);
                                        if (textInputLayout9 != null) {
                                            i5 = R.id.second;
                                            TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(inflate5, R.id.second);
                                            if (textInputLayout10 != null) {
                                                i5 = R.id.second_edit_text;
                                                if (((TextInputEditText) ViewBindings.findChildViewById(inflate5, R.id.second_edit_text)) != null) {
                                                    i5 = R.id.third;
                                                    TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(inflate5, R.id.third);
                                                    if (textInputLayout11 != null) {
                                                        o oVar = new o((ConstraintLayout) inflate5, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11);
                                                        String textValue = inputConfirmationCodeComponent2.textController.getTextValue();
                                                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EditText[]{textInputLayout8.editText, textInputLayout10.editText, textInputLayout11.editText, textInputLayout9.editText});
                                                        Iterator it6 = CollectionsKt.withIndex(listOf).iterator();
                                                        while (true) {
                                                            ArrayIterator arrayIterator = (ArrayIterator) it6;
                                                            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                                                                break;
                                                            }
                                                            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
                                                            int i6 = indexedValue.index;
                                                            EditText editText9 = (EditText) indexedValue.value;
                                                            EditText editText10 = (EditText) CollectionsKt.getOrNull(i6 - 1, listOf);
                                                            EditText editText11 = (EditText) CollectionsKt.getOrNull(i6 + 1, listOf);
                                                            Character orNull = StringsKt___StringsKt.getOrNull(i6, textValue);
                                                            if (orNull != null) {
                                                                char charValue = orNull.charValue();
                                                                if (editText9 != null) {
                                                                    editText9.setText(String.valueOf(charValue));
                                                                }
                                                            }
                                                            if (editText9 != null) {
                                                                inputConfirmationCodeComponent = inputConfirmationCodeComponent2;
                                                                list2 = listOf;
                                                                final SliderKt$$ExternalSyntheticLambda3 sliderKt$$ExternalSyntheticLambda3 = new SliderKt$$ExternalSyntheticLambda3(inputConfirmationCodeComponent, oVar, list2, editText9, editText10, editText11, 14);
                                                                editText2 = editText10;
                                                                Object tag4 = editText9.getTag(R.id.text_changed_listener);
                                                                if (tag4 != null) {
                                                                    editText9.removeTextChangedListener((TextWatcher) tag4);
                                                                }
                                                                TextWatcher textWatcher = new TextWatcher() { // from class: com.withpersona.sdk2.inquiry.shared.TextChangeListenerKt$setTextChangedListener$newListener$1
                                                                    public String oldText;

                                                                    @Override // android.text.TextWatcher
                                                                    public final void afterTextChanged(Editable editable) {
                                                                        String valueOf = String.valueOf(editable);
                                                                        String str4 = this.oldText;
                                                                        if (str4 == null) {
                                                                            Intrinsics.throwUninitializedPropertyAccessException("oldText");
                                                                            throw null;
                                                                        }
                                                                        if (valueOf.equals(str4)) {
                                                                            return;
                                                                        }
                                                                        SliderKt$$ExternalSyntheticLambda3.this.invoke(String.valueOf(editable));
                                                                    }

                                                                    @Override // android.text.TextWatcher
                                                                    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                                                                        this.oldText = String.valueOf(charSequence);
                                                                    }

                                                                    @Override // android.text.TextWatcher
                                                                    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                                                                    }
                                                                };
                                                                editText9.addTextChangedListener(textWatcher);
                                                                editText9.setTag(R.id.text_changed_listener, textWatcher);
                                                            } else {
                                                                inputConfirmationCodeComponent = inputConfirmationCodeComponent2;
                                                                list2 = listOf;
                                                                editText2 = editText10;
                                                            }
                                                            if (editText2 != null) {
                                                                Choreographers$$ExternalSyntheticLambda1 choreographers$$ExternalSyntheticLambda1 = new Choreographers$$ExternalSyntheticLambda1(editText2, 6);
                                                                if (editText9 != null) {
                                                                    editText9.setOnKeyListener(new CreditCardEditor$$ExternalSyntheticLambda1(2, editText9, choreographers$$ExternalSyntheticLambda1));
                                                                }
                                                            }
                                                            if (editText9 != null) {
                                                                editText9.setOnFocusChangeListener(new GiftCardEditor$$ExternalSyntheticLambda0(editText9, 5));
                                                            }
                                                            inputConfirmationCodeComponent2 = inputConfirmationCodeComponent;
                                                            listOf = list2;
                                                        }
                                                        linkedList.add(new StateFlowsKt$$ExternalSyntheticLambda2(27, oVar, inputConfirmationCode));
                                                        ?? r9 = (ConstraintLayout) oVar.a;
                                                        r9.getClass();
                                                        linearLayout3 = r9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i5)));
                                return null;
                            }
                            linkedHashMap2 = linkedHashMap;
                            if (uiComponent instanceof InputDateComponent) {
                                InputDateComponent inputDateComponent = (InputDateComponent) uiComponent;
                                Object obj14 = linkedHashMap2.get(inputDateComponent.name);
                                obj14.getClass();
                                linearLayout3 = InputDateComponentKt.makeView(inputDateComponent, markwonImpl2, inputDateComponent.dateController, (InputDate) obj14);
                            } else {
                                if (uiComponent instanceof InputFileUploadComponent) {
                                    InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) uiComponent;
                                    Object obj15 = linkedHashMap2.get(inputFileUploadComponent.name);
                                    obj15.getClass();
                                    InputFileUpload inputFileUpload = (InputFileUpload) obj15;
                                    View inflate6 = layoutInflater.inflate(R.layout.pi2_ui_input_file_upload, (ViewGroup) null, false);
                                    int i7 = R.id.choose_file_button;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate6, R.id.choose_file_button);
                                    if (personaMaterialButton != null) {
                                        i7 = R.id.chosen_files_list;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(inflate6, R.id.chosen_files_list);
                                        if (textView9 != null) {
                                            i7 = R.id.error_text;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(inflate6, R.id.error_text);
                                            if (textView10 != null) {
                                                i7 = R.id.label_text;
                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(inflate6, R.id.label_text);
                                                if (textView11 != null) {
                                                    LinearLayout linearLayout11 = (LinearLayout) inflate6;
                                                    Pi2UiInputFileUploadBinding pi2UiInputFileUploadBinding = new Pi2UiInputFileUploadBinding(linearLayout11, personaMaterialButton, textView9, textView10, textView11);
                                                    LinearLayout linearLayout12 = linearLayout11;
                                                    InputFileUpload.Attributes attributes43 = inputFileUpload.getAttributes();
                                                    if (attributes43 != null && (label = attributes43.getLabel()) != null) {
                                                        com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.setMarkdown(textView11, label);
                                                        textView11.setVisibility(0);
                                                    }
                                                    personaMaterialButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(inputFileUploadComponent, 29));
                                                    linkedList.add(new Regex$$ExternalSyntheticLambda1(1, inputFileUpload, pi2UiInputFileUploadBinding));
                                                    linearLayout12.setTag(pi2UiInputFileUploadBinding);
                                                    linearLayout3 = linearLayout12;
                                                }
                                            }
                                        }
                                    }
                                    a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i7)));
                                    return null;
                                }
                                if (uiComponent instanceof InputMaskedTextComponent) {
                                    InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) uiComponent;
                                    Object obj16 = linkedHashMap2.get(inputMaskedTextComponent.name);
                                    obj16.getClass();
                                    InputMaskedText inputMaskedText = (InputMaskedText) obj16;
                                    int i8 = 0;
                                    View inflate7 = layoutInflater.inflate(R.layout.pi2_ui_secure_text, (ViewGroup) null, false);
                                    if (inflate7 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("rootView");
                                        return null;
                                    }
                                    TextInputLayout textInputLayout12 = (TextInputLayout) inflate7;
                                    Pi2UiSecureTextBinding pi2UiSecureTextBinding = new Pi2UiSecureTextBinding(textInputLayout12, i8);
                                    InputMaskedText.Attributes attributes44 = inputMaskedText.getAttributes();
                                    String prefill2 = attributes44 != null ? attributes44.getPrefill() : null;
                                    InputMaskedText.Attributes attributes45 = inputMaskedText.getAttributes();
                                    String mask = attributes45 != null ? attributes45.getMask() : null;
                                    InputMaskedText.Attributes attributes46 = inputMaskedText.getAttributes();
                                    Boolean secure = attributes46 != null ? attributes46.getSecure() : null;
                                    InputMaskedText.Attributes attributes47 = inputMaskedText.getAttributes();
                                    String label4 = attributes47 != null ? attributes47.getLabel() : null;
                                    InputMaskedText.Attributes attributes48 = inputMaskedText.getAttributes();
                                    InputMaskedTextComponentKt.bindMaskTextInputState(textInputLayout12, new MaskTextInputState(secure, prefill2, mask, label4, attributes48 != null ? attributes48.getPlaceholder() : null));
                                    EditText editText12 = textInputLayout12.editText;
                                    if (editText12 != null) {
                                        zzna.control(inputMaskedTextComponent.textController, editText12);
                                    }
                                    linkedList.add(new Regex$$ExternalSyntheticLambda1(3, inputMaskedText, pi2UiSecureTextBinding));
                                    linearLayout3 = textInputLayout12;
                                } else if (uiComponent instanceof InputMultiSelectComponent) {
                                    Object obj17 = linkedHashMap2.get(((InputMultiSelectComponent) uiComponent).name);
                                    obj17.getClass();
                                    InputMultiSelect inputMultiSelect = (InputMultiSelect) obj17;
                                    o inflate$2 = o.inflate$2(layoutInflater);
                                    PersonaTextInputLayout personaTextInputLayout = (PersonaTextInputLayout) inflate$2.a;
                                    InputMultiSelect.Attributes attributes49 = inputMultiSelect.getAttributes();
                                    if (attributes49 != null) {
                                        String placeholder = attributes49.getPlaceholder();
                                        if (placeholder != null && !StringsKt.isBlank(placeholder)) {
                                            personaTextInputLayout.setPlaceholderText(attributes49.getPlaceholder());
                                            personaTextInputLayout.setExpandedHintEnabled(false);
                                            zzi.applyPlaceholderFix(personaTextInputLayout);
                                        }
                                        String label5 = attributes49.getLabel();
                                        if (label5 != null) {
                                            personaTextInputLayout.setHint(label5);
                                        }
                                    }
                                    linkedList.add(new Regex$$ExternalSyntheticLambda1(4, inputMultiSelect, inflate$2));
                                    personaTextInputLayout.getClass();
                                    linearLayout3 = personaTextInputLayout;
                                } else if (uiComponent instanceof InputNumberComponent) {
                                    InputNumberComponent inputNumberComponent = (InputNumberComponent) uiComponent;
                                    Object obj18 = linkedHashMap2.get(inputNumberComponent.name);
                                    obj18.getClass();
                                    linearLayout3 = InputNumberComponentKt.makeView(inputNumberComponent, markwonImpl2, (InputNumber) obj18);
                                } else if (uiComponent instanceof InputPhoneNumberComponent) {
                                    InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) uiComponent;
                                    Object obj19 = linkedHashMap2.get(inputPhoneNumberComponent.name);
                                    obj19.getClass();
                                    linearLayout3 = InputPhoneNumberComponentKt.makeView(inputPhoneNumberComponent, markwonImpl2, (InputPhoneNumber) obj19);
                                } else if (uiComponent instanceof InputRadioGroupComponent) {
                                    InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) uiComponent;
                                    Object obj20 = linkedHashMap2.get(inputRadioGroupComponent.name);
                                    obj20.getClass();
                                    linearLayout3 = InputRadioGroupComponentKt.makeView(inputRadioGroupComponent, markwonImpl2, (InputRadioGroup) obj20);
                                } else if (uiComponent instanceof InputSelectComponent) {
                                    Object obj21 = linkedHashMap2.get(((InputSelectComponent) uiComponent).name);
                                    obj21.getClass();
                                    InputSelect inputSelect = (InputSelect) obj21;
                                    o inflate$22 = o.inflate$2((LayoutInflater) markwonImpl2.visitorFactory);
                                    PersonaTextInputLayout personaTextInputLayout2 = (PersonaTextInputLayout) inflate$22.a;
                                    InputSelect.Attributes attributes50 = inputSelect.getAttributes();
                                    if (attributes50 != null) {
                                        String placeholder2 = attributes50.getPlaceholder();
                                        if (placeholder2 != null && !StringsKt.isBlank(placeholder2)) {
                                            personaTextInputLayout2.setPlaceholderText(attributes50.getPlaceholder());
                                            personaTextInputLayout2.setExpandedHintEnabled(false);
                                            zzi.applyPlaceholderFix(personaTextInputLayout2);
                                        }
                                        String prefill3 = attributes50.getPrefill();
                                        if (prefill3 != null && (editText = personaTextInputLayout2.editText) != null) {
                                            editText.setText(prefill3);
                                        }
                                        String label6 = attributes50.getLabel();
                                        if (label6 != null) {
                                            personaTextInputLayout2.setHint(label6);
                                        }
                                    }
                                    ((LinkedList) markwonImpl2.plugins).add(new Regex$$ExternalSyntheticLambda1(8, inputSelect, inflate$22));
                                    personaTextInputLayout2.getClass();
                                    linearLayout3 = personaTextInputLayout2;
                                } else if (uiComponent instanceof InputTextComponent) {
                                    InputTextComponent inputTextComponent = (InputTextComponent) uiComponent;
                                    Object obj22 = linkedHashMap2.get(inputTextComponent.name);
                                    obj22.getClass();
                                    linearLayout3 = InputTextComponentKt.makeView(inputTextComponent, markwonImpl2, (InputText) obj22, inputTextComponent.textController);
                                } else if (uiComponent instanceof LocalImageComponent) {
                                    LocalImageComponent localImageComponent = (LocalImageComponent) uiComponent;
                                    Object obj23 = linkedHashMap2.get(localImageComponent.name);
                                    obj23.getClass();
                                    linearLayout3 = LocalImageComponentKt.makeView(localImageComponent, markwonImpl2, (LocalImage) obj23);
                                } else if (uiComponent instanceof PrivacyPolicyComponent) {
                                    Object obj24 = linkedHashMap2.get(((PrivacyPolicyComponent) uiComponent).name);
                                    obj24.getClass();
                                    PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj24;
                                    View inflate8 = layoutInflater.inflate(R.layout.pi2_ui_privacy_policy, (ViewGroup) null, false);
                                    if (inflate8 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$2("rootView");
                                        return null;
                                    }
                                    ?? r92 = (PersonaTextView) inflate8;
                                    Pi2UiTextBinding pi2UiTextBinding = new Pi2UiTextBinding(r92, r92, 1);
                                    PrivacyPolicy.Attributes attributes51 = privacyPolicy.getAttributes();
                                    linearLayout3 = r92;
                                    if (attributes51 != null) {
                                        com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt.setMarkdown(r92, attributes51.getText());
                                        linkedList.add(new Regex$$ExternalSyntheticLambda1(12, privacyPolicy, pi2UiTextBinding));
                                        linearLayout3 = r92;
                                    }
                                } else if (uiComponent instanceof QRCodeComponent) {
                                    QRCodeComponent qRCodeComponent = (QRCodeComponent) uiComponent;
                                    Object obj25 = linkedHashMap2.get(qRCodeComponent.name);
                                    obj25.getClass();
                                    linearLayout3 = QRCodeComponentKt.makeView(qRCodeComponent, markwonImpl2, (QRCode) obj25);
                                } else if (uiComponent instanceof RemoteImageComponent) {
                                    RemoteImageComponent remoteImageComponent = (RemoteImageComponent) uiComponent;
                                    Object obj26 = linkedHashMap2.get(remoteImageComponent.name);
                                    obj26.getClass();
                                    linearLayout3 = RemoteImageComponentKt.makeView(remoteImageComponent, markwonImpl2, (RemoteImage) obj26);
                                } else {
                                    if (uiComponent instanceof SpacerComponent) {
                                        context = context3;
                                        ?? view = new View(context);
                                        linkedList.add(new Regex$$ExternalSyntheticLambda1(14, view, (SpacerComponent) uiComponent));
                                        buttonViewWithLoadingIndicator = view;
                                    } else {
                                        context = context3;
                                        if (uiComponent instanceof TextComponent) {
                                            TextComponent textComponent = (TextComponent) uiComponent;
                                            Object obj27 = linkedHashMap2.get(textComponent.name);
                                            obj27.getClass();
                                            buttonViewWithLoadingIndicator = TextComponentKt.makeView(textComponent, markwonImpl2, (Text) obj27);
                                        } else if (uiComponent instanceof TitleComponent) {
                                            TitleComponent titleComponent = (TitleComponent) uiComponent;
                                            Object obj28 = linkedHashMap2.get(titleComponent.name);
                                            obj28.getClass();
                                            buttonViewWithLoadingIndicator = TitleComponentKt.makeView(titleComponent, markwonImpl2, (Title) obj28);
                                        } else if (uiComponent instanceof InputTextAreaComponent) {
                                            InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) uiComponent;
                                            Object obj29 = linkedHashMap2.get(inputTextAreaComponent.getName());
                                            obj29.getClass();
                                            buttonViewWithLoadingIndicator = InputTextAreaComponentKt.makeView(inputTextAreaComponent, markwonImpl2, (InputTextArea) obj29);
                                        } else if (uiComponent instanceof BrandingComponent) {
                                            buttonViewWithLoadingIndicator = BrandingComponentKt.makeView((BrandingComponent) uiComponent, markwonImpl2);
                                        } else {
                                            if (uiComponent instanceof CreatePersonaSheetComponent) {
                                                arrayList3 = arrayList;
                                            } else if (uiComponent instanceof VerifyPersonaButtonComponent) {
                                                VerifyPersonaButtonComponent verifyPersonaButtonComponent = (VerifyPersonaButtonComponent) uiComponent;
                                                Object obj30 = linkedHashMap2.get(verifyPersonaButtonComponent.getName());
                                                obj30.getClass();
                                                buttonViewWithLoadingIndicator = verifyPersonaButtonComponent.url != null ? UiComponentKt.buttonViewWithLoadingIndicator(verifyPersonaButtonComponent, markwonImpl2, (VerifyPersonaButton) obj30) : null;
                                            } else if (uiComponent instanceof ClickableStackComponent) {
                                                ClickableStackComponent clickableStackComponent = (ClickableStackComponent) uiComponent;
                                                arrayList3 = arrayList;
                                                ArrayList parseTreeView = parseTreeView(clickableStackComponent.getChildren(), linkedHashMap2, arrayList3, markwonImpl2);
                                                Object obj31 = linkedHashMap2.get(clickableStackComponent.getName());
                                                obj31.getClass();
                                                linearLayout = ClickableStackComponentKt.makeView(clickableStackComponent, markwonImpl2, arrayList3, parseTreeView, (ClickableStack) obj31);
                                            } else {
                                                arrayList3 = arrayList;
                                                if (uiComponent instanceof HorizontalStackComponent) {
                                                    HorizontalStackComponent horizontalStackComponent = (HorizontalStackComponent) uiComponent;
                                                    ArrayList parseTreeView2 = parseTreeView(horizontalStackComponent.getChildren(), linkedHashMap2, arrayList3, markwonImpl2);
                                                    Object obj32 = linkedHashMap2.get(horizontalStackComponent.getName());
                                                    obj32.getClass();
                                                    linearLayout = HorizontalStackComponentKt.makeView(horizontalStackComponent, markwonImpl2, arrayList3, parseTreeView2, (HorizontalStack) obj32);
                                                } else if (uiComponent instanceof FooterComponent) {
                                                    FooterComponent footerComponent = (FooterComponent) uiComponent;
                                                    ArrayList parseTreeView3 = parseTreeView(footerComponent.getChildren(), linkedHashMap2, arrayList3, markwonImpl2);
                                                    Object obj33 = linkedHashMap2.get(footerComponent.getName());
                                                    obj33.getClass();
                                                    linearLayout = FooterComponentKt.makeView(footerComponent, markwonImpl2, arrayList3, parseTreeView3, (Footer) obj33);
                                                } else if (uiComponent instanceof InputCurrencyComponent) {
                                                    InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) uiComponent;
                                                    Object obj34 = linkedHashMap2.get(inputCurrencyComponent.getName());
                                                    obj34.getClass();
                                                    linearLayout = InputCurrencyComponentKt.makeView(inputCurrencyComponent, markwonImpl2, (InputCurrency) obj34);
                                                } else if (uiComponent instanceof InputInternationalDbComponent) {
                                                    InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                                                    Object obj35 = linkedHashMap2.get(inputInternationalDbComponent.getName());
                                                    obj35.getClass();
                                                    linearLayout = InputInternationalDbComponentKt.makeView(inputInternationalDbComponent, markwonImpl2, (InputInternationalDb) obj35);
                                                } else if (uiComponent instanceof MdocComponent) {
                                                    MdocComponent mdocComponent = (MdocComponent) uiComponent;
                                                    Object obj36 = linkedHashMap2.get(mdocComponent.getName());
                                                    obj36.getClass();
                                                    linearLayout = MdocComponentKt.makeView(mdocComponent, markwonImpl2, (Mdoc) obj36);
                                                } else if (!(uiComponent instanceof PhoneNumberSnaComponent) && !(uiComponent instanceof HelpBottomSheetComponent)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                            linearLayout = null;
                                        }
                                    }
                                    arrayList3 = arrayList;
                                    linearLayout = buttonViewWithLoadingIndicator;
                                }
                            }
                        }
                        arrayList3 = arrayList;
                        linearLayout2 = linearLayout3;
                        context = context3;
                        linearLayout = linearLayout2;
                        if (linearLayout != null) {
                        }
                        ArrayList arrayList52 = arrayList2;
                        if (linearLayout == null) {
                        }
                        arrayList4 = arrayList52;
                        linkedHashMap3 = linkedHashMap2;
                        markwonImpl3 = markwonImpl2;
                        it2 = it;
                    }
                }
                arrayList3 = arrayList;
                linearLayout6 = linearLayout4;
                linkedHashMap2 = linkedHashMap3;
                linearLayout = linearLayout6;
                if (linearLayout != null) {
                }
                ArrayList arrayList522 = arrayList2;
                if (linearLayout == null) {
                }
                arrayList4 = arrayList522;
                linkedHashMap3 = linkedHashMap2;
                markwonImpl3 = markwonImpl2;
                it2 = it;
            }
            it = it2;
            arrayList2 = arrayList4;
            linearLayout5 = linearLayout7;
            arrayList3 = arrayList;
            markwonImpl2 = markwonImpl3;
            linearLayout6 = linearLayout5;
            linkedHashMap2 = linkedHashMap3;
            linearLayout = linearLayout6;
            if (linearLayout != null) {
            }
            ArrayList arrayList5222 = arrayList2;
            if (linearLayout == null) {
            }
            arrayList4 = arrayList5222;
            linkedHashMap3 = linkedHashMap2;
            markwonImpl3 = markwonImpl2;
            it2 = it;
        }
        return arrayList4;
    }

    public final MarkwonImpl setupViewsForNestedUiStep(Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding, UiComponentScreen uiComponentScreen, Function2 function2) {
        AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        StyleElements.SimpleElementColor headerButton;
        StyleElements.SimpleElementColorValue base;
        pi2GenericUiStepScreenBinding.getClass();
        uiComponentScreen.getClass();
        ConstraintLayout constraintLayout = pi2GenericUiStepScreenBinding.rootView;
        Context context = constraintLayout.getContext();
        context.getClass();
        MarkwonImpl generateViewsFromUiScreen$default = generateViewsFromUiScreen$default(this, context, uiComponentScreen, true);
        View view = (View) generateViewsFromUiScreen$default.plugins;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) generateViewsFromUiScreen$default.visitorFactory;
        StepStyles.UiStepStyle uiStepStyle = uiComponentScreen.styles;
        Integer num = null;
        if ((uiStepStyle != null ? uiStepStyle.getPageLevelVerticalAlignment() : null) == StyleElements.PositionType.CENTER) {
            pi2GenericUiStepScreenBinding.contentScrollView.setFillViewport(true);
            constraintLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
            if (layoutParams == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 16;
            constraintLayout2.setLayoutParams(layoutParams2);
        }
        pi2GenericUiStepScreenBinding.contentContainer.addView(constraintLayout2);
        constraintLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout, 13);
        if (view != null) {
            pi2GenericUiStepScreenBinding.footerContainer.addView(view);
            InsetsUtilsKt.applyInsetsAsPadding$default(view, 2);
        }
        function2.invoke(pi2GenericUiStepScreenBinding, (LinkedHashMap) ((o0) generateViewsFromUiScreen$default.parser).a);
        if (uiStepStyle != null && (headerButtonColor = uiStepStyle.getHeaderButtonColor()) != null && (headerButton = headerButtonColor.getHeaderButton()) != null && (base = headerButton.getBase()) != null) {
            num = base.getValue();
        }
        if (num != null) {
            pi2GenericUiStepScreenBinding.navigationBar.setControlsColor(num.intValue());
        }
        return generateViewsFromUiScreen$default;
    }
}
