package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.squareup.cash.R;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public abstract class InputMaskedTextComponentKt {
    public static final void bindMaskTextInputState(TextInputLayout textInputLayout, MaskTextInputState maskTextInputState) {
        EditText editText;
        EditText editText2;
        Object tag = textInputLayout.getTag(R.id.pi2_current_state);
        if (Intrinsics.areEqual(tag instanceof MaskTextInputState ? (MaskTextInputState) tag : null, maskTextInputState)) {
            return;
        }
        textInputLayout.setTag(R.id.pi2_current_state, maskTextInputState);
        String str = maskTextInputState.prefill;
        String str2 = maskTextInputState.mask;
        if (str != null && (editText2 = textInputLayout.editText) != null) {
            editText2.setText(str);
        }
        CharSequence charSequence = maskTextInputState.label;
        if (charSequence != null) {
            textInputLayout.setHint(charSequence);
        }
        CharSequence charSequence2 = maskTextInputState.placeholder;
        if (charSequence2 != null) {
            textInputLayout.setPlaceholderText(charSequence2);
            zzi.applyPlaceholderFix(textInputLayout);
        }
        if (Intrinsics.areEqual(maskTextInputState.secure, Boolean.TRUE) && str2 != null) {
            textInputLayout.setEndIconMode(-1);
            textInputLayout.setEndIconDrawable(textInputLayout.getContext().getDrawable(R.drawable.pi2_material_ic_visibility_on));
            textInputLayout.setEndIconContentDescription(textInputLayout.getContext().getString(R.string.pi2_toggle_secure_button));
            EditText editText3 = textInputLayout.editText;
            if (editText3 != null) {
                editText3.setTransformationMethod(new SecureTransformationMethod(str2));
            }
            textInputLayout.setEndIconOnClickListener(new ScannerView$$ExternalSyntheticLambda11(9, textInputLayout, str2));
        }
        Object tag2 = textInputLayout.getTag(R.id.pi2_mask_text_watcher);
        MaskTextWatcher maskTextWatcher = tag2 instanceof MaskTextWatcher ? (MaskTextWatcher) tag2 : null;
        if (maskTextWatcher != null && (editText = textInputLayout.editText) != null) {
            editText.removeTextChangedListener(maskTextWatcher);
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            return;
        }
        MaskTextWatcher maskTextWatcher2 = new MaskTextWatcher(str2);
        EditText editText4 = textInputLayout.editText;
        if (editText4 != null) {
            editText4.addTextChangedListener(maskTextWatcher2);
        }
        textInputLayout.setTag(R.id.pi2_mask_text_watcher, maskTextWatcher2);
    }
}
