package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputText;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputTextBinding;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class InputTextComponentKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InputText.InputType.values().length];
            try {
                iArr[InputText.InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputText.InputType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputText.InputType.NUMBER_PAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputText.AutofillHint.values().length];
            try {
                iArr2[InputText.AutofillHint.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InputText.AutofillHint.NAME_LAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InputText.AutofillHint.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_1.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InputText.AutofillHint.ADDRESS_LINE_2.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InputText.AutofillHint.CITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InputText.AutofillHint.COUNTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InputText.AutofillHint.POSTAL_CODE.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TextInputLayout makeView(InputTextComponent inputTextComponent, MarkwonImpl markwonImpl, InputText inputText, TextControllerImpl textControllerImpl) {
        String str;
        textControllerImpl.getClass();
        String str2 = null;
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_input_text, (ViewGroup) null, false);
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(inflate, R.id.edit_text);
        if (textInputEditText == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.edit_text)));
            return null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) inflate;
        Pi2UiInputTextBinding pi2UiInputTextBinding = new Pi2UiInputTextBinding(textInputLayout, textInputEditText, textInputLayout, 0);
        zzna.control(textControllerImpl, textInputEditText);
        InputText.Attributes attributes = inputText.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                textInputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                textInputLayout.setPlaceholderText(placeholder);
                zzi.applyPlaceholderFix(textInputLayout);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[attributes.getInputType().ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i == 2) {
                    i2 = 32;
                } else if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            textInputEditText.setInputType(i2);
            InputText.AutofillHint autofillHint = attributes.getAutofillHint();
            if (autofillHint != null) {
                switch (WhenMappings.$EnumSwitchMapping$1[autofillHint.ordinal()]) {
                    case 1:
                        str = "personName";
                        break;
                    case 2:
                        str = "personGivenName";
                        break;
                    case 3:
                        str = "personMiddleName";
                        break;
                    case 4:
                        str = "personFamilyName";
                        break;
                    case 5:
                        str = "emailAddress";
                        break;
                    case 6:
                        str = "streetAddress";
                        break;
                    case 7:
                        str = "extendedAddress";
                        break;
                    case 8:
                        str = "addressLocality";
                        break;
                    case 9:
                        str = "addressCountry";
                        break;
                    case 10:
                        str = "postalCode";
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                str2 = str;
            }
            textInputLayout.setAutofillHints(str2);
        }
        ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(10, inputText, pi2UiInputTextBinding));
        textInputLayout.getClass();
        return textInputLayout;
    }
}
