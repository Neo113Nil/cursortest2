package Q0;

import M.C0006b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import n.C0267c0;

/* loaded from: classes.dex */
public final class C extends C0006b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1001d;

    public C(TextInputLayout textInputLayout) {
        this.f1001d = textInputLayout;
    }

    @Override // M.C0006b
    public final void d(View view, N.i iVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f728a;
        AccessibilityNodeInfo accessibilityNodeInfo = iVar.f878a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1001d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f2544u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        z zVar = textInputLayout.f2510b;
        C0267c0 c0267c0 = zVar.f1109b;
        if (c0267c0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0267c0);
            accessibilityNodeInfo.setTraversalAfter(c0267c0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(zVar.f1111d);
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
        C0267c0 c0267c02 = textInputLayout.j.f1094y;
        if (c0267c02 != null) {
            accessibilityNodeInfo.setLabelFor(c0267c02);
        }
        textInputLayout.f2512c.b().n(iVar);
    }

    @Override // M.C0006b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1001d.f2512c.b().o(accessibilityEvent);
    }
}
