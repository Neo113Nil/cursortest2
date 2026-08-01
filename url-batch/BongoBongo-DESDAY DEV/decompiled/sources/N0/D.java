package N0;

import L.C0002b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.C0208d0;

/* loaded from: classes.dex */
public final class D extends C0002b {
    public final TextInputLayout d;

    public D(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // L.C0002b
    public final void d(View view, M.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f506a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f615a;
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
        boolean z2 = textInputLayout.f2049u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        z zVar = textInputLayout.f2014b;
        C0208d0 c0208d0 = zVar.f748b;
        if (c0208d0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0208d0);
            accessibilityNodeInfo.setTraversalAfter(c0208d0);
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
        C0208d0 c0208d02 = textInputLayout.f2028j.f730y;
        if (c0208d02 != null) {
            accessibilityNodeInfo.setLabelFor(c0208d02);
        }
        textInputLayout.f2016c.b().n(jVar);
    }

    @Override // L.C0002b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.f2016c.b().o(accessibilityEvent);
    }
}
