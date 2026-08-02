package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.content.Context;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.BaseButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CancelButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CompleteButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Spacer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.SubmitButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UnknownComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.VerifyPersonaButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.AddressAutocompleteMethod;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeUtils;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.PhoneNumberInfo;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$GoogleWalletRequestMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$IdType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public abstract class UiComponentKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Button.ButtonType.values().length];
            try {
                iArr[Button.ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Button.ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PersonaMaterialButton buttonView(ButtonComponent buttonComponent, MarkwonImpl markwonImpl, Button button) {
        Context context = (Context) markwonImpl.parser;
        BaseButtonComponentStyle styles = button.getStyles();
        if (styles == null) {
            PersonaMaterialButton personaMaterialButton = new PersonaMaterialButton(context, null, getButtonStyle(button));
            BaseButtonAttributes attributes = button.getAttributes();
            if (attributes != null) {
                personaMaterialButton.setText(attributes.getText());
            }
            return personaMaterialButton;
        }
        PersonaMaterialButton personaMaterialButton2 = new PersonaMaterialButton(context);
        BaseButtonAttributes attributes2 = button.getAttributes();
        if (attributes2 != null) {
            personaMaterialButton2.setText(attributes2.getText());
        }
        ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(18, personaMaterialButton2, styles));
        return personaMaterialButton2;
    }

    public static final ButtonWithLoadingIndicator buttonViewWithLoadingIndicator(ButtonComponent buttonComponent, MarkwonImpl markwonImpl, Button button) {
        Context context = (Context) markwonImpl.parser;
        BaseButtonComponentStyle styles = button.getStyles();
        if (styles == null) {
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = new ButtonWithLoadingIndicator(context, getButtonStyle(button));
            BaseButtonAttributes attributes = button.getAttributes();
            if (attributes != null) {
                buttonWithLoadingIndicator.setText(attributes.getText());
            }
            return buttonWithLoadingIndicator;
        }
        ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = new ButtonWithLoadingIndicator(context, 0);
        BaseButtonAttributes attributes2 = button.getAttributes();
        if (attributes2 != null) {
            buttonWithLoadingIndicator2.setText(attributes2.getText());
        }
        ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(17, buttonWithLoadingIndicator2, styles));
        return buttonWithLoadingIndicator2;
    }

    public static final UiComponent findComponent(String str, List list) {
        UiComponent findComponent;
        list.getClass();
        str.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponent = (UiComponent) it.next();
            if (Intrinsics.areEqual(uiComponent.getName(), str)) {
                return uiComponent;
            }
            if ((uiComponent instanceof UiComponentGroup) && (findComponent = findComponent(str, ((UiComponentGroup) uiComponent).getChildren())) != null) {
                return findComponent;
            }
        }
        return null;
    }

    public static final int getButtonStyle(Button button) {
        BaseButtonAttributes attributes = button.getAttributes();
        Button.ButtonType buttonType = attributes != null ? attributes.getButtonType() : null;
        int i = buttonType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()];
        if (i == -1 || i == 1) {
            return R.attr.materialButtonStyle;
        }
        if (i == 2) {
            return R.attr.materialButtonStyleSecondary;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public static final ArrayList to(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UiComponent uiComponent = toUiComponent((UiComponentConfig) it.next());
            if (uiComponent != null) {
                arrayList.add(uiComponent);
            }
        }
        return arrayList;
    }

    public static final LinkedHashMap toMap(List list) {
        UiComponentConfig uiComponentConfig;
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        while (!linkedList.isEmpty() && (uiComponentConfig = (UiComponentConfig) linkedList.poll()) != null) {
            if (uiComponentConfig instanceof UiComponentContainerConfig) {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
                List children = ((UiComponentContainerConfig) uiComponentConfig).getChildren();
                linkedList.addAll(children != null ? children : EmptyList.INSTANCE);
            } else {
                linkedHashMap.put(uiComponentConfig.getName(), uiComponentConfig);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x0475, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r5) == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0479, code lost:
    
        if (r6 == com.withpersona.sdk2.inquiry.steps.ui.components.utils.AddressAutocompleteMethod.None) goto L338;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:872:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:889:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v132, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v133 */
    /* JADX WARN: Type inference failed for: r1v138, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v140, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v146, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v82, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v88, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v51, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v39, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v42, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final UiComponent toUiComponent(UiComponentConfig uiComponentConfig) {
        Mdoc.Provider provider;
        MdocRequestMetadata$GoogleWalletRequestMetadata mdocRequestMetadata$GoogleWalletRequestMetadata;
        String noMdocAvailableText;
        String errorRetrievingMdocText;
        Mdoc.ClientMetadata clientMetadata;
        String requestJsonString;
        String nonce;
        MdocRequestMetadata$IdType mdocRequestMetadata$IdType;
        CreatePersonaSheet.Pages pages;
        CreatePersonaSheet.CardCtaPage ctaCard;
        CreatePersonaSheet.Attributes attributes;
        String url;
        Boolean autoCompleteOnDismiss;
        String height;
        Integer intOrNull;
        AttributeStyles.SpacerWidthStyle width;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        Double dp;
        AttributeStyles.SpacerHeightStyle height2;
        StyleElements.Measurement base3;
        StyleElements.Size base4;
        Double dp2;
        AttributeStyles.QRCodeWidthStyle width2;
        StyleElements.Measurement base5;
        String prefill;
        ?? r1;
        List list;
        List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options;
        String prefill2;
        String str;
        Object obj;
        String prefill3;
        String obj2;
        Set set;
        ?? r12;
        List list2;
        List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options2;
        List<String> prefill4;
        String prefill5;
        String prefill6;
        Set set2;
        List<String> prefill7;
        Boolean prefill8;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String addressAutocompleteMethod;
        String prefillCardAccessNumber;
        String prefillDocumentNumber;
        ?? r4;
        ?? r42;
        ?? r2;
        String link;
        uiComponentConfig.getClass();
        int i = 1;
        boolean z = true;
        i = 1;
        i = 1;
        boolean z2 = false;
        r3 = false;
        boolean z3 = false;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        int i2 = 0;
        z2 = false;
        if (uiComponentConfig instanceof Branding) {
            Branding branding = (Branding) uiComponentConfig;
            return new BrandingComponent(branding.getName(), !(branding.getAttributes() != null ? Intrinsics.areEqual(r0.getHideLogo(), Boolean.TRUE) : false));
        }
        String str8 = "";
        if (uiComponentConfig instanceof Button) {
            Button button = (Button) uiComponentConfig;
            if (button instanceof ActionButton) {
                ActionButton actionButton = (ActionButton) uiComponentConfig;
                String name = actionButton.getName();
                BasicButtonAttributes attributes2 = actionButton.getAttributes();
                JsonLogicBoolean hidden = attributes2 != null ? attributes2.getHidden() : null;
                BasicButtonAttributes attributes3 = actionButton.getAttributes();
                JsonLogicBoolean disabled = attributes3 != null ? attributes3.getDisabled() : null;
                BasicButtonAttributes attributes4 = actionButton.getAttributes();
                String autoSubmitCountdownText = attributes4 != null ? attributes4.getAutoSubmitCountdownText() : null;
                BasicButtonAttributes attributes5 = actionButton.getAttributes();
                return new ActionButtonComponent(name, hidden, disabled, autoSubmitCountdownText, attributes5 != null ? attributes5.getAutoSubmitIntervalSeconds() : null);
            }
            if (button instanceof CancelButton) {
                CancelButton cancelButton = (CancelButton) uiComponentConfig;
                String name2 = cancelButton.getName();
                BasicButtonAttributes attributes6 = cancelButton.getAttributes();
                JsonLogicBoolean hidden2 = attributes6 != null ? attributes6.getHidden() : null;
                BasicButtonAttributes attributes7 = cancelButton.getAttributes();
                JsonLogicBoolean disabled2 = attributes7 != null ? attributes7.getDisabled() : null;
                BasicButtonAttributes attributes8 = cancelButton.getAttributes();
                String autoSubmitCountdownText2 = attributes8 != null ? attributes8.getAutoSubmitCountdownText() : null;
                BasicButtonAttributes attributes9 = cancelButton.getAttributes();
                return new CancelButtonComponent(name2, hidden2, disabled2, autoSubmitCountdownText2, attributes9 != null ? attributes9.getAutoSubmitIntervalSeconds() : null);
            }
            if (button instanceof CombinedStepButton) {
                CombinedStepButton combinedStepButton = (CombinedStepButton) uiComponentConfig;
                String name3 = combinedStepButton.getName();
                BasicButtonAttributes attributes10 = combinedStepButton.getAttributes();
                JsonLogicBoolean hidden3 = attributes10 != null ? attributes10.getHidden() : null;
                BasicButtonAttributes attributes11 = combinedStepButton.getAttributes();
                JsonLogicBoolean disabled3 = attributes11 != null ? attributes11.getDisabled() : null;
                BasicButtonAttributes attributes12 = combinedStepButton.getAttributes();
                String autoSubmitCountdownText3 = attributes12 != null ? attributes12.getAutoSubmitCountdownText() : null;
                BasicButtonAttributes attributes13 = combinedStepButton.getAttributes();
                return new CombinedStepButtonComponent(name3, hidden3, disabled3, autoSubmitCountdownText3, attributes13 != null ? attributes13.getAutoSubmitIntervalSeconds() : null);
            }
            if (button instanceof CompleteButton) {
                CompleteButton completeButton = (CompleteButton) uiComponentConfig;
                String name4 = completeButton.getName();
                BasicButtonAttributes attributes14 = completeButton.getAttributes();
                JsonLogicBoolean hidden4 = attributes14 != null ? attributes14.getHidden() : null;
                BasicButtonAttributes attributes15 = completeButton.getAttributes();
                JsonLogicBoolean disabled4 = attributes15 != null ? attributes15.getDisabled() : null;
                BasicButtonAttributes attributes16 = completeButton.getAttributes();
                String autoSubmitCountdownText4 = attributes16 != null ? attributes16.getAutoSubmitCountdownText() : null;
                BasicButtonAttributes attributes17 = completeButton.getAttributes();
                return new CompleteButtonComponent(name4, hidden4, disabled4, autoSubmitCountdownText4, attributes17 != null ? attributes17.getAutoSubmitIntervalSeconds() : null);
            }
            if (button instanceof LinkButton) {
                LinkButton linkButton = (LinkButton) uiComponentConfig;
                String name5 = linkButton.getName();
                LinkButton.Attributes attributes18 = linkButton.getAttributes();
                JsonLogicBoolean hidden5 = attributes18 != null ? attributes18.getHidden() : null;
                LinkButton.Attributes attributes19 = linkButton.getAttributes();
                JsonLogicBoolean disabled5 = attributes19 != null ? attributes19.getDisabled() : null;
                LinkButton.Attributes attributes20 = linkButton.getAttributes();
                String autoSubmitCountdownText5 = attributes20 != null ? attributes20.getAutoSubmitCountdownText() : null;
                LinkButton.Attributes attributes21 = linkButton.getAttributes();
                Integer autoSubmitIntervalSeconds = attributes21 != null ? attributes21.getAutoSubmitIntervalSeconds() : null;
                LinkButton.Attributes attributes22 = linkButton.getAttributes();
                return new LinkButtonComponent(name5, autoSubmitCountdownText5, (attributes22 == null || (link = attributes22.getLink()) == null) ? "" : link, autoSubmitIntervalSeconds, hidden5, disabled5);
            }
            if (button instanceof SubmitButton) {
                SubmitButton submitButton = (SubmitButton) uiComponentConfig;
                String name6 = submitButton.getName();
                BasicButtonAttributes attributes23 = submitButton.getAttributes();
                JsonLogicBoolean hidden6 = attributes23 != null ? attributes23.getHidden() : null;
                BasicButtonAttributes attributes24 = submitButton.getAttributes();
                JsonLogicBoolean disabled6 = attributes24 != null ? attributes24.getDisabled() : null;
                BasicButtonAttributes attributes25 = submitButton.getAttributes();
                String autoSubmitCountdownText6 = attributes25 != null ? attributes25.getAutoSubmitCountdownText() : null;
                BasicButtonAttributes attributes26 = submitButton.getAttributes();
                return new SubmitButtonComponent(name6, hidden6, disabled6, autoSubmitCountdownText6, attributes26 != null ? attributes26.getAutoSubmitIntervalSeconds() : null);
            }
            if (!(button instanceof VerifyPersonaButton)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            VerifyPersonaButton verifyPersonaButton = (VerifyPersonaButton) uiComponentConfig;
            String name7 = verifyPersonaButton.getName();
            VerifyPersonaButton.Attributes attributes27 = verifyPersonaButton.getAttributes();
            JsonLogicBoolean hidden7 = attributes27 != null ? attributes27.getHidden() : null;
            VerifyPersonaButton.Attributes attributes28 = verifyPersonaButton.getAttributes();
            JsonLogicBoolean disabled7 = attributes28 != null ? attributes28.getDisabled() : null;
            VerifyPersonaButton.Attributes attributes29 = verifyPersonaButton.getAttributes();
            String autoSubmitCountdownText7 = attributes29 != null ? attributes29.getAutoSubmitCountdownText() : null;
            VerifyPersonaButton.Attributes attributes30 = verifyPersonaButton.getAttributes();
            Integer autoSubmitIntervalSeconds2 = attributes30 != null ? attributes30.getAutoSubmitIntervalSeconds() : null;
            VerifyPersonaButton.Attributes attributes31 = verifyPersonaButton.getAttributes();
            return new VerifyPersonaButtonComponent(name7, autoSubmitCountdownText7, attributes31 != null ? attributes31.getUrl() : null, autoSubmitIntervalSeconds2, hidden7, disabled7);
        }
        if (uiComponentConfig instanceof UiComponentContainerConfig) {
            UiComponentContainerConfig uiComponentContainerConfig = (UiComponentContainerConfig) uiComponentConfig;
            if (uiComponentContainerConfig instanceof ClickableStack) {
                ClickableStack clickableStack = (ClickableStack) uiComponentConfig;
                String name8 = clickableStack.getName();
                List<UiComponentConfig> children = clickableStack.getChildren();
                if (children != null) {
                    r2 = new ArrayList();
                    Iterator it = children.iterator();
                    while (it.hasNext()) {
                        UiComponent uiComponent = toUiComponent((UiComponentConfig) it.next());
                        if (uiComponent != null) {
                            r2.add(uiComponent);
                        }
                    }
                } else {
                    r2 = EmptyList.INSTANCE;
                }
                List list3 = r2;
                ClickableStack.Attributes attributes32 = clickableStack.getAttributes();
                JsonLogicBoolean hidden8 = attributes32 != null ? attributes32.getHidden() : null;
                ClickableStack.Attributes attributes33 = clickableStack.getAttributes();
                return new ClickableStackComponent(name8, list3, hidden8, attributes33 != null ? attributes33.getDisabled() : null, clickableStack.getStyles(), false, 32, null);
            }
            if (uiComponentContainerConfig instanceof Footer) {
                Footer footer = (Footer) uiComponentConfig;
                String name9 = footer.getName();
                List<UiComponentConfig> children2 = footer.getChildren();
                if (children2 != null) {
                    r42 = new ArrayList();
                    Iterator it2 = children2.iterator();
                    while (it2.hasNext()) {
                        UiComponent uiComponent2 = toUiComponent((UiComponentConfig) it2.next());
                        if (uiComponent2 != null) {
                            r42.add(uiComponent2);
                        }
                    }
                } else {
                    r42 = EmptyList.INSTANCE;
                }
                Footer.Attributes attributes34 = footer.getAttributes();
                return new FooterComponent(name9, r42, attributes34 != null ? attributes34.getFirstBelowTheFoldChildIndex() : null);
            }
            if (!(uiComponentContainerConfig instanceof HorizontalStack)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            HorizontalStack horizontalStack = (HorizontalStack) uiComponentConfig;
            String name10 = horizontalStack.getName();
            List<UiComponentConfig> children3 = horizontalStack.getChildren();
            if (children3 != null) {
                r4 = new ArrayList();
                Iterator it3 = children3.iterator();
                while (it3.hasNext()) {
                    UiComponent uiComponent3 = toUiComponent((UiComponentConfig) it3.next());
                    if (uiComponent3 != null) {
                        r4.add(uiComponent3);
                    }
                }
            } else {
                r4 = EmptyList.INSTANCE;
            }
            HorizontalStack.Attributes attributes35 = horizontalStack.getAttributes();
            return new HorizontalStackComponent(name10, r4, attributes35 != null ? attributes35.getHidden() : null);
        }
        if (uiComponentConfig instanceof CombinedStepImagePreview) {
            return new ImagePreviewComponent(((CombinedStepImagePreview) uiComponentConfig).getName());
        }
        if (uiComponentConfig instanceof ESignature) {
            ESignature eSignature = (ESignature) uiComponentConfig;
            String name11 = eSignature.getName();
            ESignature.Attributes attributes36 = eSignature.getAttributes();
            JsonLogicBoolean hidden9 = attributes36 != null ? attributes36.getHidden() : null;
            ESignature.Attributes attributes37 = eSignature.getAttributes();
            return new ESignatureComponent(name11, hidden9, attributes37 != null ? attributes37.getDisabled() : null);
        }
        if (uiComponentConfig instanceof GovernmentIdNfcScan) {
            GovernmentIdNfcScan governmentIdNfcScan = (GovernmentIdNfcScan) uiComponentConfig;
            String name12 = governmentIdNfcScan.getName();
            GovernmentIdNfcScan.Attributes attributes38 = governmentIdNfcScan.getAttributes();
            String str9 = (attributes38 == null || (prefillDocumentNumber = attributes38.getPrefillDocumentNumber()) == null) ? "" : prefillDocumentNumber;
            GovernmentIdNfcScan.Attributes attributes39 = governmentIdNfcScan.getAttributes();
            String prefillDateOfBirth = attributes39 != null ? attributes39.getPrefillDateOfBirth() : null;
            GovernmentIdNfcScan.Attributes attributes40 = governmentIdNfcScan.getAttributes();
            String prefillExpirationDate = attributes40 != null ? attributes40.getPrefillExpirationDate() : null;
            GovernmentIdNfcScan.Attributes attributes41 = governmentIdNfcScan.getAttributes();
            String str10 = (attributes41 == null || (prefillCardAccessNumber = attributes41.getPrefillCardAccessNumber()) == null) ? "" : prefillCardAccessNumber;
            GovernmentIdNfcScan.Attributes attributes42 = governmentIdNfcScan.getAttributes();
            JsonLogicBoolean hidden10 = attributes42 != null ? attributes42.getHidden() : null;
            GovernmentIdNfcScan.Attributes attributes43 = governmentIdNfcScan.getAttributes();
            return new GovernmentIdNfcScanComponent(name12, governmentIdNfcScan, str9, prefillDateOfBirth, prefillExpirationDate, str10, hidden10, attributes43 != null ? attributes43.getDisabled() : null, null);
        }
        if (uiComponentConfig instanceof InputAddress) {
            InputAddress inputAddress = (InputAddress) uiComponentConfig;
            InputAddress.Attributes attributes44 = inputAddress.getAttributes();
            if (attributes44 == null || (addressAutocompleteMethod = attributes44.getAddressAutocompleteMethod()) == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                str2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, addressAutocompleteMethod, locale);
            }
            AddressAutocompleteMethod addressAutocompleteMethod2 = Intrinsics.areEqual(str2, "google_maps") ? AddressAutocompleteMethod.Server : AddressAutocompleteMethod.None;
            String name13 = inputAddress.getName();
            if (attributes44 == null || (str3 = attributes44.getPrefillAddressStreet1()) == null) {
                str3 = "";
            }
            if (attributes44 == null || (str4 = attributes44.getPrefillAddressStreet2()) == null) {
                str4 = "";
            }
            if (attributes44 == null || (str5 = attributes44.getPrefillAddressCity()) == null) {
                str5 = "";
            }
            if (attributes44 == null || (str6 = attributes44.getPrefillAddressSubdivision()) == null) {
                str6 = "";
            }
            if (attributes44 == null || (str7 = attributes44.getPrefillAddressPostalCode()) == null) {
                str7 = "";
            }
            JsonLogicBoolean hidden11 = attributes44 != null ? attributes44.getHidden() : null;
            JsonLogicBoolean disabled8 = attributes44 != null ? attributes44.getDisabled() : null;
            InputAddress.Attributes attributes45 = inputAddress.getAttributes();
            String prefillAddressStreet1 = attributes45 != null ? attributes45.getPrefillAddressStreet1() : null;
            if (prefillAddressStreet1 == null || StringsKt.isBlank(prefillAddressStreet1)) {
                InputAddress.Attributes attributes46 = inputAddress.getAttributes();
                String prefillAddressStreet2 = attributes46 != null ? attributes46.getPrefillAddressStreet2() : null;
                if (prefillAddressStreet2 == null || StringsKt.isBlank(prefillAddressStreet2)) {
                    InputAddress.Attributes attributes47 = inputAddress.getAttributes();
                    String prefillAddressCity = attributes47 != null ? attributes47.getPrefillAddressCity() : null;
                    if (prefillAddressCity == null || StringsKt.isBlank(prefillAddressCity)) {
                        InputAddress.Attributes attributes48 = inputAddress.getAttributes();
                        String prefillAddressPostalCode = attributes48 != null ? attributes48.getPrefillAddressPostalCode() : null;
                        if (prefillAddressPostalCode == null || StringsKt.isBlank(prefillAddressPostalCode)) {
                            InputAddress.Attributes attributes49 = inputAddress.getAttributes();
                            String prefillAddressSubdivision = attributes49 != null ? attributes49.getPrefillAddressSubdivision() : null;
                            if (prefillAddressSubdivision != null) {
                            }
                        }
                    }
                }
            }
            z = false;
            return new InputAddressComponent(name13, str3, str4, str5, str6, str7, hidden11, disabled8, addressAutocompleteMethod2, null, null, null, null, Boolean.valueOf(z));
        }
        if (uiComponentConfig instanceof InputCheckbox) {
            InputCheckbox inputCheckbox = (InputCheckbox) uiComponentConfig;
            InputCheckbox.Attributes attributes50 = inputCheckbox.getAttributes();
            if (attributes50 != null && (prefill8 = attributes50.getPrefill()) != null) {
                z3 = prefill8.booleanValue();
            }
            return new InputCheckboxComponent(inputCheckbox, z3);
        }
        if (uiComponentConfig instanceof InputCheckboxGroup) {
            InputCheckboxGroup inputCheckboxGroup = (InputCheckboxGroup) uiComponentConfig;
            String name14 = inputCheckboxGroup.getName();
            InputCheckboxGroup.Attributes attributes51 = inputCheckboxGroup.getAttributes();
            if (attributes51 == null || (prefill7 = attributes51.getPrefill()) == null || (set2 = CollectionsKt.toSet(prefill7)) == null) {
                set2 = EmptySet.INSTANCE;
            }
            InputCheckboxGroup.Attributes attributes52 = inputCheckboxGroup.getAttributes();
            JsonLogicBoolean hidden12 = attributes52 != null ? attributes52.getHidden() : null;
            InputCheckboxGroup.Attributes attributes53 = inputCheckboxGroup.getAttributes();
            return new InputCheckboxGroupComponent(name14, set2, hidden12, attributes53 != null ? attributes53.getDisabled() : null);
        }
        if (uiComponentConfig instanceof InputConfirmationCode) {
            InputConfirmationCode inputConfirmationCode = (InputConfirmationCode) uiComponentConfig;
            String name15 = inputConfirmationCode.getName();
            InputConfirmationCode.Attributes attributes54 = inputConfirmationCode.getAttributes();
            if (attributes54 != null && (prefill6 = attributes54.getPrefill()) != null) {
                str8 = prefill6;
            }
            InputConfirmationCode.Attributes attributes55 = inputConfirmationCode.getAttributes();
            JsonLogicBoolean hidden13 = attributes55 != null ? attributes55.getHidden() : null;
            InputConfirmationCode.Attributes attributes56 = inputConfirmationCode.getAttributes();
            return new InputConfirmationCodeComponent(name15, str8, hidden13, attributes56 != null ? attributes56.getDisabled() : null);
        }
        if (uiComponentConfig instanceof InputDate) {
            return new InputDateComponent((InputDate) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputFileUpload) {
            InputFileUpload inputFileUpload = (InputFileUpload) uiComponentConfig;
            String name16 = inputFileUpload.getName();
            EmptyList emptyList = EmptyList.INSTANCE;
            InputFileUpload.Attributes attributes57 = inputFileUpload.getAttributes();
            List<InputFileUpload.PrefillItem> prefill9 = attributes57 != null ? attributes57.getPrefill() : null;
            boolean z4 = !(prefill9 == null || prefill9.isEmpty());
            InputFileUpload.Attributes attributes58 = inputFileUpload.getAttributes();
            JsonLogicBoolean hidden14 = attributes58 != null ? attributes58.getHidden() : null;
            InputFileUpload.Attributes attributes59 = inputFileUpload.getAttributes();
            return new InputFileUploadComponent(name16, emptyList, z4, hidden14, attributes59 != null ? attributes59.getDisabled() : null);
        }
        if (uiComponentConfig instanceof InputMaskedText) {
            InputMaskedText inputMaskedText = (InputMaskedText) uiComponentConfig;
            String name17 = inputMaskedText.getName();
            InputMaskedText.Attributes attributes60 = inputMaskedText.getAttributes();
            String str11 = (attributes60 == null || (prefill5 = attributes60.getPrefill()) == null) ? "" : prefill5;
            InputMaskedText.Attributes attributes61 = inputMaskedText.getAttributes();
            JsonLogicBoolean hidden15 = attributes61 != null ? attributes61.getHidden() : null;
            InputMaskedText.Attributes attributes62 = inputMaskedText.getAttributes();
            return new InputMaskedTextComponent(name17, str11, hidden15, attributes62 != null ? attributes62.getDisabled() : null, inputMaskedText.getStyles());
        }
        if (uiComponentConfig instanceof InputMultiSelect) {
            InputMultiSelect inputMultiSelect = (InputMultiSelect) uiComponentConfig;
            InputMultiSelect.Attributes attributes63 = inputMultiSelect.getAttributes();
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options3 = attributes63 != null ? attributes63.getOptions() : null;
            InputMultiSelect.Attributes attributes64 = inputMultiSelect.getAttributes();
            if (attributes64 == null || (prefill4 = attributes64.getPrefill()) == null || (set = CollectionsKt.toSet(prefill4)) == null) {
                set = EmptySet.INSTANCE;
            }
            if (options3 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : options3) {
                    if (set.contains(((com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) obj3).getValue())) {
                        arrayList.add(obj3);
                    }
                }
                r12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option = (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) it4.next();
                    r12.add(new Option(option.getText(), option.getValue()));
                }
            } else {
                r12 = EmptyList.INSTANCE;
            }
            List list4 = r12;
            String name18 = inputMultiSelect.getName();
            InputSelectComponentStyle styles = inputMultiSelect.getStyles();
            InputMultiSelect.Attributes attributes65 = inputMultiSelect.getAttributes();
            JsonLogicBoolean hidden16 = attributes65 != null ? attributes65.getHidden() : null;
            InputMultiSelect.Attributes attributes66 = inputMultiSelect.getAttributes();
            JsonLogicBoolean disabled9 = attributes66 != null ? attributes66.getDisabled() : null;
            InputMultiSelect.Attributes attributes67 = inputMultiSelect.getAttributes();
            String label = attributes67 != null ? attributes67.getLabel() : null;
            InputMultiSelect.Attributes attributes68 = inputMultiSelect.getAttributes();
            String placeholder = attributes68 != null ? attributes68.getPlaceholder() : null;
            InputMultiSelect.Attributes attributes69 = inputMultiSelect.getAttributes();
            if (attributes69 == null || (options2 = attributes69.getOptions()) == null) {
                list2 = EmptyList.INSTANCE;
            } else {
                List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> list5 = options2;
                list2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option2 : list5) {
                    list2.add(new Option(option2.getText(), option2.getValue()));
                }
            }
            return new InputMultiSelectComponent(name18, styles, list4, hidden16, disabled9, label, placeholder, list2);
        }
        if (uiComponentConfig instanceof InputNumber) {
            InputNumber inputNumber = (InputNumber) uiComponentConfig;
            String name19 = inputNumber.getName();
            InputNumber.Attributes attributes70 = inputNumber.getAttributes();
            Number prefill10 = attributes70 != null ? attributes70.getPrefill() : null;
            InputNumber.Attributes attributes71 = inputNumber.getAttributes();
            JsonLogicBoolean hidden17 = attributes71 != null ? attributes71.getHidden() : null;
            InputNumber.Attributes attributes72 = inputNumber.getAttributes();
            return new InputNumberComponent(name19, prefill10, hidden17, attributes72 != null ? attributes72.getDisabled() : null);
        }
        if (uiComponentConfig instanceof InputPhoneNumber) {
            InputPhoneNumber inputPhoneNumber = (InputPhoneNumber) uiComponentConfig;
            InputPhoneNumber.Attributes attributes73 = inputPhoneNumber.getAttributes();
            if (attributes73 != null && (prefill3 = attributes73.getPrefill()) != null && (obj2 = StringsKt.trim(prefill3).toString()) != null) {
                str8 = obj2;
            }
            if (StringsKt__StringsJVMKt.startsWith(str8, Marker.ANY_NON_NULL_MARKER, false)) {
                ?? r6 = CountryCodeUtils.countryCodeToCountryMetadata;
                String obj4 = StringsKt.trim(str8).toString();
                if (!StringsKt__StringsJVMKt.startsWith(obj4, Marker.ANY_NON_NULL_MARKER, false)) {
                    obj4 = Marker.ANY_NON_NULL_MARKER.concat(obj4);
                }
                String str12 = CountryCodeUtils.usCountryCodeMetadata.countryCode;
                int i3 = 4;
                while (true) {
                    if (1 >= i3) {
                        break;
                    }
                    if (obj4.length() >= i3) {
                        String substring = obj4.substring(0, i3);
                        Collection values = r6.values();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : values) {
                            if (((CountryCodeMetadata) obj5).prefix.equals(substring)) {
                                arrayList2.add(obj5);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            if (arrayList2.size() == 1) {
                                str12 = ((CountryCodeMetadata) arrayList2.get(0)).countryCode;
                            } else {
                                Iterator it5 = arrayList2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it5.next();
                                    String str13 = ((CountryCodeMetadata) obj).countryCode;
                                    String country = Locale.getDefault().getCountry();
                                    country.getClass();
                                    if (str13.contentEquals(country)) {
                                        break;
                                    }
                                }
                                CountryCodeMetadata countryCodeMetadata = (CountryCodeMetadata) obj;
                                str12 = countryCodeMetadata != null ? countryCodeMetadata.countryCode : ((CountryCodeMetadata) CollectionsKt.first((List) arrayList2)).countryCode;
                            }
                        }
                    }
                    i3--;
                }
                CountryCodeMetadata countryCodeMetadata2 = (CountryCodeMetadata) r6.get(str12);
                String str14 = countryCodeMetadata2 != null ? countryCodeMetadata2.prefix : null;
                PhoneNumberInfo phoneNumberInfo = (str14 == null || str14.length() == 0) ? new PhoneNumberInfo(str12, StringsKt.trim(StringsKt___StringsKt.drop(1, obj4)).toString()) : new PhoneNumberInfo(str12, StringsKt.trim(StringsKt___StringsKt.drop(str14.length(), obj4)).toString());
                str8 = phoneNumberInfo.localPhoneNumber;
                str = phoneNumberInfo.countryCode;
            } else {
                InputPhoneNumber.Attributes attributes74 = inputPhoneNumber.getAttributes();
                if (attributes74 == null || (str = attributes74.getCountryCode()) == null) {
                    str = CountryCodeUtils.usCountryCodeMetadata.countryCode;
                }
            }
            String str15 = str;
            String str16 = str8;
            String name20 = inputPhoneNumber.getName();
            InputPhoneNumber.Attributes attributes75 = inputPhoneNumber.getAttributes();
            JsonLogicBoolean hidden18 = attributes75 != null ? attributes75.getHidden() : null;
            InputPhoneNumber.Attributes attributes76 = inputPhoneNumber.getAttributes();
            JsonLogicBoolean disabled10 = attributes76 != null ? attributes76.getDisabled() : null;
            InputTextBasedComponentStyle styles2 = inputPhoneNumber.getStyles();
            TextBasedComponentStyle errorTextStyle = styles2 != null ? styles2.getErrorTextStyle() : null;
            InputTextBasedComponentStyle styles3 = inputPhoneNumber.getStyles();
            return new InputPhoneNumberComponent(name20, str16, hidden18, disabled10, errorTextStyle, styles3 != null ? styles3.getActiveOptionBackgroundColorValue() : null, str15);
        }
        if (uiComponentConfig instanceof InputRadioGroup) {
            InputRadioGroup inputRadioGroup = (InputRadioGroup) uiComponentConfig;
            String name21 = inputRadioGroup.getName();
            InputRadioGroup.Attributes attributes77 = inputRadioGroup.getAttributes();
            if (attributes77 != null && (prefill2 = attributes77.getPrefill()) != null) {
                str8 = prefill2;
            }
            InputRadioGroup.Attributes attributes78 = inputRadioGroup.getAttributes();
            JsonLogicBoolean hidden19 = attributes78 != null ? attributes78.getHidden() : null;
            InputRadioGroup.Attributes attributes79 = inputRadioGroup.getAttributes();
            return new InputRadioGroupComponent(name21, str8, hidden19, attributes79 != null ? attributes79.getDisabled() : null);
        }
        if (uiComponentConfig instanceof InputSelect) {
            InputSelect inputSelect = (InputSelect) uiComponentConfig;
            InputSelect.Attributes attributes80 = inputSelect.getAttributes();
            List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> options4 = attributes80 != null ? attributes80.getOptions() : null;
            if (options4 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : options4) {
                    String value = ((com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) obj6).getValue();
                    InputSelect.Attributes attributes81 = inputSelect.getAttributes();
                    if (Intrinsics.areEqual(value, attributes81 != null ? attributes81.getPrefill() : null)) {
                        arrayList3.add(obj6);
                    }
                }
                r1 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option3 = (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option) it6.next();
                    r1.add(new Option(option3.getText(), option3.getValue()));
                }
            } else {
                r1 = EmptyList.INSTANCE;
            }
            List list6 = r1;
            String name22 = inputSelect.getName();
            InputSelectComponentStyle styles4 = inputSelect.getStyles();
            InputSelect.Attributes attributes82 = inputSelect.getAttributes();
            JsonLogicBoolean hidden20 = attributes82 != null ? attributes82.getHidden() : null;
            InputSelect.Attributes attributes83 = inputSelect.getAttributes();
            JsonLogicBoolean disabled11 = attributes83 != null ? attributes83.getDisabled() : null;
            InputSelect.Attributes attributes84 = inputSelect.getAttributes();
            String label2 = attributes84 != null ? attributes84.getLabel() : null;
            InputSelect.Attributes attributes85 = inputSelect.getAttributes();
            String placeholder2 = attributes85 != null ? attributes85.getPlaceholder() : null;
            InputSelect.Attributes attributes86 = inputSelect.getAttributes();
            if (attributes86 == null || (options = attributes86.getOptions()) == null) {
                list = EmptyList.INSTANCE;
            } else {
                List<com.withpersona.sdk2.inquiry.network.dto.ui.components.Option> list7 = options;
                list = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                for (com.withpersona.sdk2.inquiry.network.dto.ui.components.Option option4 : list7) {
                    list.add(new Option(option4.getText(), option4.getValue()));
                }
            }
            return new InputSelectComponent(name22, styles4, list6, hidden20, disabled11, label2, placeholder2, list);
        }
        if (uiComponentConfig instanceof InputText) {
            return new InputTextComponent((InputText) uiComponentConfig);
        }
        if (uiComponentConfig instanceof InputTextArea) {
            InputTextArea inputTextArea = (InputTextArea) uiComponentConfig;
            String name23 = inputTextArea.getName();
            InputTextArea.Attributes attributes87 = inputTextArea.getAttributes();
            String str17 = (attributes87 == null || (prefill = attributes87.getPrefill()) == null) ? "" : prefill;
            InputTextArea.Attributes attributes88 = inputTextArea.getAttributes();
            JsonLogicBoolean hidden21 = attributes88 != null ? attributes88.getHidden() : null;
            InputTextArea.Attributes attributes89 = inputTextArea.getAttributes();
            JsonLogicBoolean disabled12 = attributes89 != null ? attributes89.getDisabled() : null;
            InputTextBasedComponentStyle styles5 = inputTextArea.getStyles();
            return new InputTextAreaComponent(name23, str17, hidden21, disabled12, styles5 != null ? styles5.getErrorTextStyle() : null);
        }
        if (uiComponentConfig instanceof LocalImage) {
            LocalImage localImage = (LocalImage) uiComponentConfig;
            String name24 = localImage.getName();
            LocalImage.Attributes attributes90 = localImage.getAttributes();
            return new LocalImageComponent(name24, attributes90 != null ? attributes90.getHidden() : null);
        }
        if (uiComponentConfig instanceof PrivacyPolicy) {
            return new PrivacyPolicyComponent(((PrivacyPolicy) uiComponentConfig).getName());
        }
        if (uiComponentConfig instanceof QRCode) {
            QRCode qRCode = (QRCode) uiComponentConfig;
            String name25 = qRCode.getName();
            QRCode.Attributes attributes91 = qRCode.getAttributes();
            JsonLogicBoolean hidden22 = attributes91 != null ? attributes91.getHidden() : null;
            QRCode.QRCodeComponentStyle styles6 = qRCode.getStyles();
            StyleElements.Size base6 = (styles6 == null || (width2 = styles6.getWidth()) == null || (base5 = width2.getBase()) == null) ? null : base5.getBase();
            StyleElements.DPSize dPSize = base6 instanceof StyleElements.DPSize ? (StyleElements.DPSize) base6 : null;
            return new QRCodeComponent(name25, hidden22, (int) (dPSize != null ? ExtensionsKt.getDpToPx(dPSize.getDp().doubleValue()) : ExtensionsKt.getDpToPx(128.0d)));
        }
        if (uiComponentConfig instanceof RemoteImage) {
            return new RemoteImageComponent((RemoteImage) uiComponentConfig);
        }
        if (uiComponentConfig instanceof Spacer) {
            Spacer spacer = (Spacer) uiComponentConfig;
            String name26 = spacer.getName();
            Spacer.Attributes attributes92 = spacer.getAttributes();
            JsonLogicBoolean hidden23 = attributes92 != null ? attributes92.getHidden() : null;
            Spacer.SpacerComponentStyle styles7 = spacer.getStyles();
            if (styles7 == null || (height2 = styles7.getHeight()) == null || (base3 = height2.getBase()) == null || (base4 = base3.getBase()) == null || (dp2 = base4.getDp()) == null) {
                Spacer.Attributes attributes93 = spacer.getAttributes();
                if (attributes93 != null && (height = attributes93.getHeight()) != null && (intOrNull = StringsKt.toIntOrNull(StringsKt.removeSuffix(height, "px"))) != null) {
                    i = intOrNull.intValue();
                }
            } else {
                i = (int) ExtensionsKt.getDpToPx(dp2.doubleValue());
            }
            Spacer.SpacerComponentStyle styles8 = spacer.getStyles();
            if (styles8 != null && (width = styles8.getWidth()) != null && (base = width.getBase()) != null && (base2 = base.getBase()) != null && (dp = base2.getDp()) != null) {
                i2 = (int) ExtensionsKt.getDpToPx(dp.doubleValue());
            }
            return new SpacerComponent(name26, hidden23, i, i2);
        }
        if (uiComponentConfig instanceof Text) {
            Text text = (Text) uiComponentConfig;
            String name27 = text.getName();
            Text.Attributes attributes94 = text.getAttributes();
            JsonLogicBoolean hidden24 = attributes94 != null ? attributes94.getHidden() : null;
            Text.Attributes attributes95 = text.getAttributes();
            return new TextComponent(name27, hidden24, attributes95 != null ? attributes95.getDisabled() : null);
        }
        if (uiComponentConfig instanceof Title) {
            Title title = (Title) uiComponentConfig;
            String name28 = title.getName();
            Title.Attributes attributes96 = title.getAttributes();
            JsonLogicBoolean hidden25 = attributes96 != null ? attributes96.getHidden() : null;
            Title.Attributes attributes97 = title.getAttributes();
            return new TitleComponent(name28, hidden25, attributes97 != null ? attributes97.getDisabled() : null);
        }
        if (uiComponentConfig instanceof CreatePersonaSheet) {
            CreatePersonaSheet createPersonaSheet = (CreatePersonaSheet) uiComponentConfig;
            CreatePersonaSheet.Attributes attributes98 = createPersonaSheet.getAttributes();
            if (attributes98 == null || (pages = attributes98.getPages()) == null || (ctaCard = pages.getCtaCard()) == null || (attributes = createPersonaSheet.getAttributes()) == null || (url = attributes.getUrl()) == null) {
                return null;
            }
            CreatePersonaSheet.Attributes attributes99 = createPersonaSheet.getAttributes();
            if (attributes99 != null && (autoCompleteOnDismiss = attributes99.getAutoCompleteOnDismiss()) != null) {
                z2 = autoCompleteOnDismiss.booleanValue();
            }
            boolean z5 = z2;
            String name29 = createPersonaSheet.getName();
            List<UiComponentConfig> components = ctaCard.getUiStep().getConfig().getComponents();
            ArrayList arrayList4 = components != null ? to(components) : null;
            List<UiComponentConfig> components2 = ctaCard.getUiStep().getConfig().getComponents();
            if (components2 == null) {
                components2 = EmptyList.INSTANCE;
            }
            StepStyles.UiStepStyle styles9 = ctaCard.getUiStep().getStyles();
            components2.getClass();
            return new CreatePersonaSheetComponent(name29, ctaCard, url, z5, false, false, false, new UiComponentScreen(arrayList4, components2, styles9));
        }
        if (uiComponentConfig instanceof InputCurrency) {
            InputCurrency inputCurrency = (InputCurrency) uiComponentConfig;
            String name30 = inputCurrency.getName();
            InputCurrency.Attributes attributes100 = inputCurrency.getAttributes();
            Number prefill11 = attributes100 != null ? attributes100.getPrefill() : null;
            InputCurrency.Attributes attributes101 = inputCurrency.getAttributes();
            JsonLogicBoolean hidden26 = attributes101 != null ? attributes101.getHidden() : null;
            InputCurrency.Attributes attributes102 = inputCurrency.getAttributes();
            JsonLogicBoolean disabled13 = attributes102 != null ? attributes102.getDisabled() : null;
            InputTextBasedComponentStyle styles10 = inputCurrency.getStyles();
            return new InputCurrencyComponent(name30, prefill11, hidden26, disabled13, styles10 != null ? styles10.getErrorTextStyle() : null);
        }
        if (uiComponentConfig instanceof InputInternationalDb) {
            return InputInternationalDbComponent.Companion.fromConfig((InputInternationalDb) uiComponentConfig);
        }
        if (!(uiComponentConfig instanceof Mdoc)) {
            if (uiComponentConfig instanceof PhoneNumberSna) {
                PhoneNumberSna phoneNumberSna = (PhoneNumberSna) uiComponentConfig;
                return new PhoneNumberSnaComponent(phoneNumberSna.getName(), phoneNumberSna, null, null, null, null, null);
            }
            if (uiComponentConfig.equals(UnknownComponentConfig.INSTANCE)) {
                return null;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Mdoc mdoc = (Mdoc) uiComponentConfig;
        String name31 = mdoc.getName();
        Mdoc.Attributes attributes103 = mdoc.getAttributes();
        JsonLogicBoolean hidden27 = attributes103 != null ? attributes103.getHidden() : null;
        Mdoc.Attributes attributes104 = mdoc.getAttributes();
        JsonLogicBoolean disabled14 = attributes104 != null ? attributes104.getDisabled() : null;
        Mdoc.Attributes attributes105 = mdoc.getAttributes();
        String autoSubmitCountdownText8 = attributes105 != null ? attributes105.getAutoSubmitCountdownText() : null;
        Mdoc.Attributes attributes106 = mdoc.getAttributes();
        Integer autoSubmitIntervalSeconds3 = attributes106 != null ? attributes106.getAutoSubmitIntervalSeconds() : null;
        Mdoc.Attributes attributes107 = mdoc.getAttributes();
        if (attributes107 == null || (provider = attributes107.getProvider()) == null) {
            return null;
        }
        if (Intrinsics.areEqual(provider.getProviderType(), "google_wallet") && (clientMetadata = provider.getClientMetadata()) != null && (requestJsonString = clientMetadata.getRequestJsonString()) != null) {
            try {
                new JSONObject(requestJsonString);
                nonce = provider.getNonce();
            } catch (Exception unused) {
            }
            if (nonce != null) {
                String idType = provider.getIdType();
                if (Intrinsics.areEqual(idType, "dl")) {
                    mdocRequestMetadata$IdType = MdocRequestMetadata$IdType.DL;
                } else if (Intrinsics.areEqual(idType, "pp")) {
                    mdocRequestMetadata$IdType = MdocRequestMetadata$IdType.PP;
                }
                mdocRequestMetadata$GoogleWalletRequestMetadata = new MdocRequestMetadata$GoogleWalletRequestMetadata(nonce, mdocRequestMetadata$IdType, requestJsonString);
                if (mdocRequestMetadata$GoogleWalletRequestMetadata != null) {
                    return null;
                }
                Mdoc.Attributes attributes108 = mdoc.getAttributes();
                String str18 = (attributes108 == null || (errorRetrievingMdocText = attributes108.getErrorRetrievingMdocText()) == null) ? "" : errorRetrievingMdocText;
                Mdoc.Attributes attributes109 = mdoc.getAttributes();
                String str19 = (attributes109 == null || (noMdocAvailableText = attributes109.getNoMdocAvailableText()) == null) ? "" : noMdocAvailableText;
                Mdoc.Attributes attributes110 = mdoc.getAttributes();
                return new MdocComponent(name31, hidden27, disabled14, autoSubmitCountdownText8, autoSubmitIntervalSeconds3, mdocRequestMetadata$GoogleWalletRequestMetadata, str18, str19, attributes110 != null ? attributes110.getSuccessfulMdocRetrievalTransitionComponentName() : null, "", "");
            }
        }
        mdocRequestMetadata$GoogleWalletRequestMetadata = null;
        if (mdocRequestMetadata$GoogleWalletRequestMetadata != null) {
        }
    }

    public static final ArrayList updateComponent(List list, UiComponent uiComponent, UiComponent uiComponent2) {
        list.getClass();
        uiComponent.getClass();
        uiComponent2.getClass();
        List<UiComponent> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (UiComponent uiComponent3 : list2) {
            if (uiComponent3 instanceof UiComponentGroup) {
                if (!uiComponent3.equals(uiComponent)) {
                    UiComponentGroup uiComponentGroup = (UiComponentGroup) uiComponent3;
                    uiComponent3 = uiComponentGroup.updateChildren(updateComponent(uiComponentGroup.getChildren(), uiComponent, uiComponent2));
                    arrayList.add(uiComponent3);
                }
                uiComponent3 = uiComponent2;
                arrayList.add(uiComponent3);
            } else {
                if (!Intrinsics.areEqual(uiComponent3, uiComponent)) {
                    arrayList.add(uiComponent3);
                }
                uiComponent3 = uiComponent2;
                arrayList.add(uiComponent3);
            }
        }
        return arrayList;
    }
}
