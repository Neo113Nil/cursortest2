package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t80 extends y {
    public final TextInputLayout d;

    public t80(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.y
    public final void d(View view, k0 k0Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
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
            zq zqVar = textInputLayout.p;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (zqVar.o == 2 && zqVar.y != null && !TextUtils.isEmpty(zqVar.w)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = helperText.toString();
                } else {
                    charSequence3 = charSequence3 + ", " + ((Object) helperText);
                }
            }
        }
        x60 x60Var = textInputLayout.g;
        b6 b6Var = x60Var.g;
        if (b6Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(b6Var);
            accessibilityNodeInfo.setTraversalAfter(b6Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(x60Var.i);
        }
        if (!isEmpty) {
            k0Var.i(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            k0Var.i(charSequence3);
            if (!z && placeholderText != null) {
                k0Var.i(charSequence3 + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            k0Var.i(placeholderText);
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
        textInputLayout.h.b().m(k0Var);
    }

    @Override // defpackage.y
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.h.b().n(accessibilityEvent);
    }
}
