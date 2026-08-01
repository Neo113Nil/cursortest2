package j2;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k.z0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c0 extends k0.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f2300d;

    public c0(TextInputLayout textInputLayout) {
        this.f2300d = textInputLayout;
    }

    @Override // k0.b
    public final void d(View view, l0.e eVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2855a;
        this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f2300d;
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
        boolean z3 = textInputLayout.A0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z4 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence3 = !isEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            u uVar = textInputLayout.f1414p;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (uVar.f2373o == 2 && uVar.f2383y != null && !TextUtils.isEmpty(uVar.f2381w)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = helperText.toString();
                } else {
                    charSequence3 = charSequence3 + ", " + ((Object) helperText);
                }
            }
        }
        a0 a0Var = textInputLayout.g;
        z0 z0Var = a0Var.g;
        if (z0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z0Var);
            accessibilityNodeInfo.setTraversalAfter(z0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(a0Var.f2288i);
        }
        if (!isEmpty) {
            eVar.h(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            eVar.h(charSequence3);
            if (!z3 && placeholderText != null) {
                eVar.h(charSequence3 + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            eVar.h(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            accessibilityNodeInfo.setHintText(charSequence3);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z4) {
            accessibilityNodeInfo.setError(!isEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.h.b().m(eVar);
    }

    @Override // k0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f2300d.h.b().n(accessibilityEvent);
    }
}
