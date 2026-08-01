package P0;

import K.C0001b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.C0202b0;

/* loaded from: classes.dex */
public final class C extends C0001b {
    public final TextInputLayout d;

    public C(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // K.C0001b
    public final void d(View view, L.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f363a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f464a;
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
        boolean z2 = textInputLayout.f1945u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        y yVar = textInputLayout.f1911b;
        C0202b0 c0202b0 = yVar.f695b;
        if (c0202b0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0202b0);
            accessibilityNodeInfo.setTraversalAfter(c0202b0);
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
        C0202b0 c0202b02 = textInputLayout.f1924j.f678y;
        if (c0202b02 != null) {
            accessibilityNodeInfo.setLabelFor(c0202b02);
        }
        textInputLayout.f1913c.b().n(jVar);
    }

    @Override // K.C0001b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.f1913c.b().o(accessibilityEvent);
    }
}
