package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u50 extends w {
    public final TextInputLayout a;

    public u50(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.w
    public final void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onInitializeAccessibilityNodeInfo(view, i0Var);
        AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
        TextInputLayout textInputLayout = this.a;
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
            dp dpVar = textInputLayout.p;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (dpVar.o == 2 && dpVar.y != null && !TextUtils.isEmpty(dpVar.w)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = helperText.toString();
                } else {
                    charSequence3 = charSequence3 + ", " + ((Object) helperText);
                }
            }
        }
        d40 d40Var = textInputLayout.g;
        i6 i6Var = d40Var.g;
        if (i6Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(i6Var);
            accessibilityNodeInfo.setTraversalAfter(i6Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(d40Var.i);
        }
        if (!isEmpty) {
            i0Var.h(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            i0Var.h(charSequence3);
            if (!z && placeholderText != null) {
                i0Var.h(charSequence3 + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            i0Var.h(placeholderText);
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
        textInputLayout.h.b().m(i0Var);
    }

    @Override // defpackage.w
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.a.h.b().n(accessibilityEvent);
    }
}
