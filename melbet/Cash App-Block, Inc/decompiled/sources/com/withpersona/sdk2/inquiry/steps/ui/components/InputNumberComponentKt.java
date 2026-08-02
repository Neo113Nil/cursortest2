package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.view.LayoutInflater;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputNumberBinding;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedList;
import kotlin.text.Regex$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class InputNumberComponentKt {
    public static final TextInputLayout makeView(InputNumberComponent inputNumberComponent, MarkwonImpl markwonImpl, InputNumber inputNumber) {
        Pi2UiInputNumberBinding inflate = Pi2UiInputNumberBinding.inflate((LayoutInflater) markwonImpl.visitorFactory);
        TextInputEditText textInputEditText = (TextInputEditText) inflate.editText;
        TextInputLayout textInputLayout = (TextInputLayout) inflate.inputLayout;
        InputNumber.Attributes attributes = inputNumber.getAttributes();
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
            Integer precision = attributes.getPrecision();
            if (precision != null) {
                int intValue = precision.intValue();
                EditText editText = textInputLayout.editText;
                if (editText != null) {
                    editText.setFilters(new DecimalPrecisionFilter[]{new DecimalPrecisionFilter(intValue)});
                }
            }
        }
        textInputEditText.setText(String.valueOf((Number) inputNumberComponent.numberController._bitmapValue.getValue()));
        textInputEditText.addTextChangedListener(new SearchView.AnonymousClass10(inputNumberComponent, 12));
        ((LinkedList) markwonImpl.plugins).add(new Regex$$ExternalSyntheticLambda1(5, inputNumber, inflate));
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.rootView;
        textInputLayout2.getClass();
        return textInputLayout2;
    }
}
