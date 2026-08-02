package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class InputPhoneNumberComponentKt {
    public static final TextInputLayout makeView(InputPhoneNumberComponent inputPhoneNumberComponent, MarkwonImpl markwonImpl, InputPhoneNumber inputPhoneNumber) {
        EditText editText;
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_input_phone_number, (ViewGroup) null, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) inflate;
        Pi2UiInputPhoneNumberBinding pi2UiInputPhoneNumberBinding = new Pi2UiInputPhoneNumberBinding(textInputLayout, textInputLayout);
        InputPhoneNumber.Attributes attributes = inputPhoneNumber.getAttributes();
        if (attributes != null) {
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = textInputLayout.editText) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                textInputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                textInputLayout.setPlaceholderText(placeholder);
                zzi.applyPlaceholderFix(textInputLayout);
            }
            EditText editText2 = textInputLayout.editText;
            if (editText2 != null) {
                zzna.control(inputPhoneNumberComponent.textController, editText2);
                PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.selectedCountryCode);
                Object tag = editText2.getTag(R.id.text_changed_listener);
                if (tag != null) {
                    editText2.removeTextChangedListener((TextWatcher) tag);
                }
                editText2.addTextChangedListener(phoneNumberFormattingTextWatcher);
                editText2.setTag(R.id.text_changed_listener, phoneNumberFormattingTextWatcher);
            }
        }
        ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(6, inputPhoneNumber, pi2UiInputPhoneNumberBinding));
        textInputLayout.setTag(pi2UiInputPhoneNumberBinding);
        return textInputLayout;
    }
}
