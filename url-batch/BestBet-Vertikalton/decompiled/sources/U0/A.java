package U0;

import K.C0006b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.C0223a0;

/* loaded from: classes.dex */
public final class A extends C0006b {
    public final TextInputLayout d;

    public A(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // K.C0006b
    public final void d(View view, L.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f594a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f696a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f2422u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        y yVar = textInputLayout.f2388b;
        C0223a0 c0223a0 = yVar.f1237b;
        if (c0223a0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0223a0);
            accessibilityNodeInfo.setTraversalAfter(c0223a0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(yVar.d);
        }
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (!z2 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0223a0 c0223a02 = textInputLayout.f2401j.f1220y;
        if (c0223a02 != null) {
            accessibilityNodeInfo.setLabelFor(c0223a02);
        }
        textInputLayout.f2390c.b().n(jVar);
    }

    @Override // K.C0006b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.f2390c.b().o(accessibilityEvent);
    }
}
