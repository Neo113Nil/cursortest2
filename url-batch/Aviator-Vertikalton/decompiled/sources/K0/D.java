package K0;

import K.C0002b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.C0257e0;

/* loaded from: classes.dex */
public final class D extends C0002b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f527d;

    public D(TextInputLayout textInputLayout) {
        this.f527d = textInputLayout;
    }

    @Override // K.C0002b
    public final void d(View view, L.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f426a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f665a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f527d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f2039u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        z zVar = textInputLayout.f2004b;
        C0257e0 c0257e0 = zVar.f643b;
        if (c0257e0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0257e0);
            accessibilityNodeInfo.setTraversalAfter(c0257e0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(zVar.f645d);
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
        C0257e0 c0257e02 = textInputLayout.f2017j.f626y;
        if (c0257e02 != null) {
            accessibilityNodeInfo.setLabelFor(c0257e02);
        }
        textInputLayout.f2006c.b().n(jVar);
    }

    @Override // K.C0002b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f527d.f2006c.b().o(accessibilityEvent);
    }
}
