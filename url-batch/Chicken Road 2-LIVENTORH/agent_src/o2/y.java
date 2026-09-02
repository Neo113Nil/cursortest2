package o2;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.c1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y extends n0.b {
    public final TextInputLayout d;

    public y(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // n0.b
    public final void d(View view, o0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f2861a;
        this.f2714a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.A0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z4 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        w wVar = textInputLayout.f1016g;
        c1 c1Var = wVar.f2978g;
        if (c1Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1Var);
            accessibilityNodeInfo.setTraversalAfter(c1Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(wVar.i);
        }
        if (!isEmpty) {
            eVar.j(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            eVar.j(charSequence);
            if (!z3 && placeholderText != null) {
                eVar.j(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            eVar.j(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                eVar.j(charSequence);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                eVar.h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z4) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        c1 c1Var2 = textInputLayout.f1032p.f2961y;
        if (c1Var2 != null) {
            accessibilityNodeInfo.setLabelFor(c1Var2);
        }
        textInputLayout.f1018h.b().m(eVar);
    }

    @Override // n0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.f1018h.b().n(accessibilityEvent);
    }
}
