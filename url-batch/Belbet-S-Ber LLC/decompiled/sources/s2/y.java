package s2;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.z0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y extends n0.b {
    public final TextInputLayout d;

    public y(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // n0.b
    public final void d(View view, o0.g gVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2882a;
        this.f2757a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
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
        boolean z4 = textInputLayout.A0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z5 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence3 = !isEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            s sVar = textInputLayout.f1221p;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (sVar.f3310o == 2 && sVar.f3320y != null && !TextUtils.isEmpty(sVar.f3318w)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = helperText.toString();
                } else {
                    charSequence3 = charSequence3 + ", " + ((Object) helperText);
                }
            }
        }
        w wVar = textInputLayout.f1206g;
        z0 z0Var = wVar.f3338g;
        if (z0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z0Var);
            accessibilityNodeInfo.setTraversalAfter(z0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(wVar.i);
        }
        if (!isEmpty) {
            gVar.j(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            gVar.j(charSequence3);
            if (!z4 && placeholderText != null) {
                gVar.j(charSequence3 + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            gVar.j(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            accessibilityNodeInfo.setHintText(charSequence3);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z5) {
            accessibilityNodeInfo.setError(!isEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.h.b().m(gVar);
    }

    @Override // n0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.h.b().n(accessibilityEvent);
    }
}
