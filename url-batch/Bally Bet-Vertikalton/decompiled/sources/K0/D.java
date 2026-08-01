package K0;

import K.C0002b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.C0230d0;

/* loaded from: classes.dex */
public final class D extends C0002b {
    public final TextInputLayout d;

    public D(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // K.C0002b
    public final void d(View view, L.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f393a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f608a;
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
        boolean z2 = textInputLayout.f1820u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        z zVar = textInputLayout.f1785b;
        C0230d0 c0230d0 = zVar.f588b;
        if (c0230d0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0230d0);
            accessibilityNodeInfo.setTraversalAfter(c0230d0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(zVar.d);
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
        C0230d0 c0230d02 = textInputLayout.f1798j.f571y;
        if (c0230d02 != null) {
            accessibilityNodeInfo.setLabelFor(c0230d02);
        }
        textInputLayout.f1787c.b().n(jVar);
    }

    @Override // K.C0002b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.f1787c.b().o(accessibilityEvent);
    }
}
