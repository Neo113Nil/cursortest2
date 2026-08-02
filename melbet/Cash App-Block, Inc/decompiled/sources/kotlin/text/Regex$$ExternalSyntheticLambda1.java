package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputLayout;
import com.miteksystems.misnap.workflow.a.o;
import com.squareup.cash.R;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PrivacyPolicy;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationBarBinding;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextInputLayout;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponentKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputFileUploadBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputNumberBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputTextBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSecureTextBinding;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiTextBinding;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextInputLayoutStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.steps.ui.view.ViewUtilsKt;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.internal.WriteModeKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes9.dex */
public final /* synthetic */ class Regex$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Regex$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ButtonCancelComponentStyle chooseFileButtonStyle;
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle errorTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        TextBasedComponentStyle placeholderTextBasedStyle;
        InputTextBasedComponentStyle inputTextStyle3;
        TextBasedComponentStyle labelTextBasedStyle;
        AttributeStyles.InputMarginStyle margin;
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        AttributeStyles.TextBasedTextColorStyle textColorHighlight;
        StyleElements.SimpleElementColor base3;
        StyleElements.SimpleElementColorValue base4;
        Integer value;
        int colorFromAttr$default;
        TextBasedComponentStyle textBasedStyle;
        AttributeStyles.TextBasedTextColorStyle textColor;
        StyleElements.SimpleElementColor base5;
        StyleElements.SimpleElementColorValue base6;
        Integer value2;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle2;
        TextBasedComponentStyle errorLabelStyle;
        float f;
        String[] names;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Regex.Companion companion = Regex.INSTANCE;
                return ((Regex) obj2).find((CharSequence) obj);
            case 1:
                InputFileUpload inputFileUpload = (InputFileUpload) obj2;
                Pi2UiInputFileUploadBinding pi2UiInputFileUploadBinding = (Pi2UiInputFileUploadBinding) obj;
                InputFileUpload.InputFileUploadComponentStyle styles = inputFileUpload.getStyles();
                if (styles != null && (margin = styles.getMargin()) != null && (base = margin.getBase()) != null && (base2 = base.getBase()) != null) {
                    LinearLayout linearLayout = pi2UiInputFileUploadBinding.rootView;
                    linearLayout.getClass();
                    ViewUtilsKt.setMargins(linearLayout, base2);
                }
                InputFileUpload.InputFileUploadComponentStyle styles2 = inputFileUpload.getStyles();
                if (styles2 != null && (inputTextStyle3 = styles2.getInputTextStyle()) != null && (labelTextBasedStyle = inputTextStyle3.getLabelTextBasedStyle()) != null) {
                    TextStylingKt.style(pi2UiInputFileUploadBinding.labelText, labelTextBasedStyle, EmptySet.INSTANCE);
                }
                InputFileUpload.InputFileUploadComponentStyle styles3 = inputFileUpload.getStyles();
                if (styles3 != null && (inputTextStyle2 = styles3.getInputTextStyle()) != null && (placeholderTextBasedStyle = inputTextStyle2.getPlaceholderTextBasedStyle()) != null) {
                    TextStylingKt.style(pi2UiInputFileUploadBinding.chosenFilesList, placeholderTextBasedStyle, EmptySet.INSTANCE);
                }
                InputFileUpload.InputFileUploadComponentStyle styles4 = inputFileUpload.getStyles();
                if (styles4 != null && (inputTextStyle = styles4.getInputTextStyle()) != null && (errorTextStyle = inputTextStyle.getErrorTextStyle()) != null) {
                    TextStylingKt.style(pi2UiInputFileUploadBinding.errorText, errorTextStyle, EmptySet.INSTANCE);
                }
                InputFileUpload.InputFileUploadComponentStyle styles5 = inputFileUpload.getStyles();
                if (styles5 != null && (chooseFileButtonStyle = styles5.getChooseFileButtonStyle()) != null) {
                    ButtonStylingKt.style$default(pi2UiInputFileUploadBinding.chooseFileButton, chooseFileButtonStyle, false, false, 14);
                }
                return Unit.INSTANCE;
            case 2:
                Pi2UiInternationalDbFieldBinding pi2UiInternationalDbFieldBinding = (Pi2UiInternationalDbFieldBinding) obj;
                InputInternationalDb.InputInternationalDbComponentStyle styles6 = ((InputInternationalDb) obj2).getStyles();
                if (styles6 != null) {
                    InputSelectComponentStyle inputSelectStyle = styles6.getInputSelectStyle();
                    if (inputSelectStyle != null) {
                        InputSelectStylingKt.style(pi2UiInternationalDbFieldBinding.idbCountryInput, inputSelectStyle);
                        InputSelectStylingKt.style(pi2UiInternationalDbFieldBinding.idbIdTypeInput, inputSelectStyle);
                    }
                    InputTextBasedComponentStyle inputTextStyle4 = styles6.getInputTextStyle();
                    if (inputTextStyle4 != null) {
                        TextInputLayoutStylingKt.style(pi2UiInternationalDbFieldBinding.idbValueInput, inputTextStyle4);
                    }
                    TextBasedComponentStyle textStyle = styles6.getTextStyle();
                    if (textStyle != null) {
                        TextStylingKt.style(pi2UiInternationalDbFieldBinding.idbDescription, textStyle, EmptySet.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                Pi2UiSecureTextBinding pi2UiSecureTextBinding = (Pi2UiSecureTextBinding) obj;
                InputTextBasedComponentStyle styles7 = ((InputMaskedText) obj2).getStyles();
                if (styles7 != null) {
                    TextInputLayoutStylingKt.style((TextInputLayout) pi2UiSecureTextBinding.rootView, styles7);
                }
                return Unit.INSTANCE;
            case 4:
                o oVar = (o) obj;
                InputSelectComponentStyle styles8 = ((InputMultiSelect) obj2).getStyles();
                if (styles8 != null) {
                    PersonaTextInputLayout personaTextInputLayout = (PersonaTextInputLayout) oVar.c;
                    personaTextInputLayout.getClass();
                    InputSelectStylingKt.style(personaTextInputLayout, styles8);
                }
                return Unit.INSTANCE;
            case 5:
                Pi2UiInputNumberBinding pi2UiInputNumberBinding = (Pi2UiInputNumberBinding) obj;
                InputTextBasedComponentStyle styles9 = ((InputNumber) obj2).getStyles();
                if (styles9 != null) {
                    TextInputLayout textInputLayout = (TextInputLayout) pi2UiInputNumberBinding.inputLayout;
                    textInputLayout.getClass();
                    TextInputLayoutStylingKt.style(textInputLayout, styles9);
                }
                return Unit.INSTANCE;
            case 6:
                TextInputLayout textInputLayout2 = ((Pi2UiInputPhoneNumberBinding) obj).inputLayout;
                InputTextBasedComponentStyle styles10 = ((InputPhoneNumber) obj2).getStyles();
                if (styles10 != null) {
                    AppCompatTextView appCompatTextView = textInputLayout2.startLayout.prefixTextView;
                    appCompatTextView.getClass();
                    TextStylingKt.style(appCompatTextView, styles10.getTextBasedStyle(), EmptySet.INSTANCE);
                    TextInputLayoutStylingKt.style(textInputLayout2, styles10);
                }
                return Unit.INSTANCE;
            case 7:
                InputRadioGroup inputRadioGroup = (InputRadioGroup) obj2;
                Pi2NavigationBarBinding pi2NavigationBarBinding = (Pi2NavigationBarBinding) obj;
                MaterialRadioButton materialRadioButton = (MaterialRadioButton) pi2NavigationBarBinding.navBarBackButton;
                TextView textView = (TextView) pi2NavigationBarBinding.navBarHelpButton;
                InputRadioGroup.InputRadioGroupComponentStyle styles11 = inputRadioGroup.getStyles();
                if (styles11 != null && (textBasedStyle2 = styles11.getTextBasedStyle()) != null) {
                    TextStylingKt.style(textView, textBasedStyle2, EmptySet.INSTANCE);
                }
                InputRadioGroup.InputRadioGroupComponentStyle styles12 = inputRadioGroup.getStyles();
                if (styles12 != null && (descriptionTextStyle = styles12.getDescriptionTextStyle()) != null) {
                    TextStylingKt.style((TextView) pi2NavigationBarBinding.navBarCancelButton, descriptionTextStyle, EmptySet.INSTANCE);
                }
                InputRadioGroup.InputRadioGroupComponentStyle styles13 = inputRadioGroup.getStyles();
                if (styles13 == null || (textColorHighlight = styles13.getTextColorHighlight()) == null || (base3 = textColorHighlight.getBase()) == null || (base4 = base3.getBase()) == null || (value = base4.getValue()) == null) {
                    materialRadioButton.setButtonTintList(ColorStateList.valueOf(ColorUtils.setAlphaComponent(textView.getCurrentTextColor(), 150)));
                } else {
                    int intValue = value.intValue();
                    InputRadioGroup.InputRadioGroupComponentStyle styles14 = inputRadioGroup.getStyles();
                    if (styles14 == null || (textBasedStyle = styles14.getTextBasedStyle()) == null || (textColor = textBasedStyle.getTextColor()) == null || (base5 = textColor.getBase()) == null || (base6 = base5.getBase()) == null || (value2 = base6.getValue()) == null) {
                        Context context = textView.getContext();
                        context.getClass();
                        colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context, R.attr.colorOnSurface);
                    } else {
                        colorFromAttr$default = value2.intValue();
                    }
                    materialRadioButton.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{ColorUtils.setAlphaComponent(colorFromAttr$default, (int) (ResourcesCompat.getFloat(textView.getContext().getResources(), R.dimen.material_emphasis_disabled) * 255.0f)), colorFromAttr$default, intValue}));
                }
                return Unit.INSTANCE;
            case 8:
                o oVar2 = (o) obj;
                InputSelectComponentStyle styles15 = ((InputSelect) obj2).getStyles();
                if (styles15 != null) {
                    PersonaTextInputLayout personaTextInputLayout2 = (PersonaTextInputLayout) oVar2.c;
                    personaTextInputLayout2.getClass();
                    InputSelectStylingKt.style(personaTextInputLayout2, styles15);
                }
                return Unit.INSTANCE;
            case 9:
                Pi2UiInputTextBinding pi2UiInputTextBinding = (Pi2UiInputTextBinding) obj;
                InputTextBasedComponentStyle styles16 = ((InputTextArea) obj2).getStyles();
                if (styles16 != null) {
                    TextInputLayout textInputLayout3 = pi2UiInputTextBinding.inputLayout;
                    textInputLayout3.getClass();
                    TextInputLayoutStylingKt.style(textInputLayout3, styles16);
                }
                return Unit.INSTANCE;
            case 10:
                Pi2UiInputTextBinding pi2UiInputTextBinding2 = (Pi2UiInputTextBinding) obj;
                InputTextBasedComponentStyle styles17 = ((InputText) obj2).getStyles();
                if (styles17 != null) {
                    TextInputLayout textInputLayout4 = pi2UiInputTextBinding2.inputLayout;
                    textInputLayout4.getClass();
                    TextInputLayoutStylingKt.style(textInputLayout4, styles17);
                }
                return Unit.INSTANCE;
            case 11:
                TextView textView2 = (TextView) obj2;
                textView2.setVisibility(8);
                Mdoc.MdocComponentStyle styles18 = ((Mdoc) obj).getStyles();
                if (styles18 != null && (errorLabelStyle = styles18.getErrorLabelStyle()) != null) {
                    TextStylingKt.style(textView2, errorLabelStyle, EmptySet.INSTANCE);
                }
                return Unit.INSTANCE;
            case 12:
                Pi2UiTextBinding pi2UiTextBinding = (Pi2UiTextBinding) obj;
                TextBasedComponentStyle styles19 = ((PrivacyPolicy) obj2).getStyles();
                if (styles19 != null) {
                    TextStylingKt.style(pi2UiTextBinding.textView, styles19, EmptySet.INSTANCE);
                }
                return Unit.INSTANCE;
            case 13:
                QRCode qRCode = (QRCode) obj2;
                ImageView imageView = (ImageView) obj;
                StyleElements.SizeSet margin2 = qRCode.getMargin();
                if (margin2 != null) {
                    ViewUtilsKt.setMargins(imageView, margin2);
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                StyleElements.PositionType justification = qRCode.getJustification();
                if (justification != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
                    int i2 = QRCodeComponentKt.WhenMappings.$EnumSwitchMapping$0[justification.ordinal()];
                    if (i2 == 1) {
                        f = RecyclerView.DECELERATION_RATE;
                    } else if (i2 == 2) {
                        f = 0.5f;
                    } else {
                        if (i2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        f = 1.0f;
                    }
                    layoutParams2.horizontalBias = f;
                }
                imageView.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            case 14:
                View view = (View) obj2;
                SpacerComponent spacerComponent = (SpacerComponent) obj;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                int i3 = spacerComponent.height;
                if (i3 < 1) {
                    i3 = 1;
                }
                layoutParams3.height = i3;
                int i4 = spacerComponent.width;
                layoutParams3.width = i4 >= 1 ? i4 : 1;
                view.setLayoutParams(layoutParams3);
                return Unit.INSTANCE;
            case 15:
                Pi2UiTextBinding pi2UiTextBinding2 = (Pi2UiTextBinding) obj;
                TextBasedComponentStyle styles20 = ((Text) obj2).getStyles();
                if (styles20 != null) {
                    TextStylingKt.style(pi2UiTextBinding2.textView, styles20, EmptySet.INSTANCE);
                }
                return Unit.INSTANCE;
            case 16:
                Pi2UiTextBinding pi2UiTextBinding3 = (Pi2UiTextBinding) obj;
                TextBasedComponentStyle styles21 = ((Title) obj2).getStyles();
                if (styles21 != null) {
                    TextStylingKt.style(pi2UiTextBinding3.textView, styles21, EmptySet.INSTANCE);
                }
                return Unit.INSTANCE;
            case 17:
                ButtonStylingKt.style$default((ButtonWithLoadingIndicator) obj2, (BaseButtonComponentStyle) obj);
                return Unit.INSTANCE;
            case 18:
                ButtonStylingKt.style$default((PersonaMaterialButton) obj2, (BaseButtonComponentStyle) obj, false, false, 14);
                return Unit.INSTANCE;
            case 19:
                ((HelpBottomSheetController) obj2).setShowing(false);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 20:
                OkHttpClient okHttpClient = ((RealFontDownloader) obj2).okHttpClient;
                okHttpClient.getClass();
                return new RealCall(okHttpClient, (Request) obj, false).execute();
            case 21:
                ((StatefulWorkflow.RenderContext) obj2).$$delegate_0.getActionSink().send(Workflows.action$default((UiWorkflow) obj, new InstantKt$$ExternalSyntheticLambda0(13)));
                return Unit.INSTANCE;
            default:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                Json json = (Json) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JsonConfiguration jsonConfiguration = json.configuration;
                WriteModeKt.namingStrategy(serialDescriptor, json);
                int elementsCount = serialDescriptor.getElementsCount();
                for (int i5 = 0; i5 < elementsCount; i5++) {
                    List elementAnnotations = serialDescriptor.getElementAnnotations(i5);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : elementAnnotations) {
                        if (obj3 instanceof JsonNames) {
                            arrayList.add(obj3);
                        }
                    }
                    JsonNames jsonNames = (JsonNames) CollectionsKt.singleOrNull((List) arrayList);
                    if (jsonNames != null && (names = jsonNames.names()) != null) {
                        for (String str : names) {
                            String str2 = Intrinsics.areEqual(serialDescriptor.getKind(), SerialKind$ENUM.INSTANCE) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new JsonDecodingException(WriteModeKt.formatDecodingException("The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.getElementName(i5) + " is already one of the names for " + str2 + ' ' + serialDescriptor.getElementName(((Number) MapsKt__MapsKt.getValue(linkedHashMap, str)).intValue()) + " in " + serialDescriptor, -1, null, null, null));
                            }
                            linkedHashMap.put(str, Integer.valueOf(i5));
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                return emptyMap;
        }
    }
}
