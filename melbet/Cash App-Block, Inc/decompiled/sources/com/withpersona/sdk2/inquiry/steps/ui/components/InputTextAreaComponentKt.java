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
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputTextArea;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputTextBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class InputTextAreaComponentKt {
    public static final TextInputLayout makeView(InputTextAreaComponent inputTextAreaComponent, MarkwonImpl markwonImpl, InputTextArea inputTextArea) {
        View inflate = ((LayoutInflater) markwonImpl.visitorFactory).inflate(R.layout.pi2_ui_input_text_area, (ViewGroup) null, false);
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(inflate, R.id.edit_text);
        if (textInputEditText == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.edit_text)));
            return null;
        }
        TextInputLayout textInputLayout = (TextInputLayout) inflate;
        Pi2UiInputTextBinding pi2UiInputTextBinding = new Pi2UiInputTextBinding(textInputLayout, textInputEditText, textInputLayout, 1);
        InputTextArea.Attributes attributes = inputTextArea.getAttributes();
        if (attributes != null) {
            zzna.control(inputTextAreaComponent.textController, textInputEditText);
            String label = attributes.getLabel();
            if (label != null) {
                textInputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                textInputLayout.setPlaceholderText(placeholder);
                zzi.applyPlaceholderFix(textInputLayout);
            }
            Integer rows = attributes.getRows();
            if (rows != null) {
                int intValue = rows.intValue();
                textInputEditText.setMaxLines(intValue);
                textInputEditText.setMinLines(intValue);
                textInputEditText.setVerticalScrollBarEnabled(true);
            }
        }
        ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(9, inputTextArea, pi2UiInputTextBinding));
        textInputLayout.getClass();
        return textInputLayout;
    }
}
