package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class sh0 extends a0 {
    public final TextInputLayout d;

    public sh0(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.a0
    public final void d(View view, m0 m0Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = m0Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.A0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence3 = !isEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            zu zuVar = textInputLayout.p;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (zuVar.o == 2 && zuVar.y != null && !TextUtils.isEmpty(zuVar.w)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = helperText.toString();
                } else {
                    charSequence3 = charSequence3 + ", " + ((Object) helperText);
                }
            }
        }
        df0 df0Var = textInputLayout.g;
        j6 j6Var = df0Var.g;
        if (j6Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(j6Var);
            accessibilityNodeInfo.setTraversalAfter(j6Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(df0Var.i);
        }
        if (!isEmpty) {
            m0Var.i(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            m0Var.i(charSequence3);
            if (!z && placeholderText != null) {
                m0Var.i(charSequence3 + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            m0Var.i(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            accessibilityNodeInfo.setHintText(charSequence3);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            accessibilityNodeInfo.setError(!isEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.h.b().m(m0Var);
    }

    @Override // defpackage.a0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.h.b().n(accessibilityEvent);
    }
}
