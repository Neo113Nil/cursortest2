package z5;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import l.j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v extends q3.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f9283d;

    public v(TextInputLayout textInputLayout) {
        this.f9283d = textInputLayout;
    }

    @Override // q3.b
    public final void d(View view, r3.f fVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f6557a;
        this.f6076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f9283d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.f2008y0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z7 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        t tVar = textInputLayout.f1968e;
        j0 j0Var = tVar.f9272e;
        if (j0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(j0Var);
            accessibilityNodeInfo.setTraversalAfter(j0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(tVar.f9274g);
        }
        if (!isEmpty) {
            fVar.k(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            fVar.k(charSequence);
            if (!z3 && placeholderText != null) {
                fVar.k(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            fVar.k(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                fVar.k(charSequence);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                fVar.h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z7) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        j0 j0Var2 = textInputLayout.f1985n.f9266y;
        if (j0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(j0Var2);
        }
        textInputLayout.f1970f.b().m(fVar);
    }

    @Override // q3.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f9283d.f1970f.b().n(accessibilityEvent);
    }
}
