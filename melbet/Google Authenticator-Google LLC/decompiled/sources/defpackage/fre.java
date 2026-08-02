package defpackage;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fre extends wv {
    private final TextInputLayout a;

    public fre(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        CharSequence charSequence;
        CharSequence concat;
        CharSequence charSequence2;
        TextView textView;
        super.c(view, aahVar);
        TextInputLayout textInputLayout = this.a;
        EditText editText = textInputLayout.c;
        Editable text = editText != null ? editText.getText() : null;
        CharSequence f = textInputLayout.f();
        fqv fqvVar = textInputLayout.d;
        CharSequence charSequence3 = fqvVar.n ? fqvVar.m : null;
        CharSequence e = textInputLayout.e();
        CharSequence charSequence4 = textInputLayout.j ? textInputLayout.i : null;
        int i = textInputLayout.f;
        CharSequence contentDescription = (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) ? textView.getContentDescription() : null;
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean z = !isEmpty;
        boolean isEmpty2 = TextUtils.isEmpty(f);
        boolean z2 = textInputLayout.p;
        boolean isEmpty3 = TextUtils.isEmpty(e);
        boolean z3 = !isEmpty3;
        boolean z4 = (isEmpty3 && TextUtils.isEmpty(contentDescription)) ? false : true;
        CharSequence charSequence5 = true == isEmpty2 ? null : f;
        CharSequence charSequence6 = charSequence3;
        if (TextUtils.isEmpty(charSequence3)) {
            charSequence = e;
        } else {
            charSequence = e;
            if (fqvVar.e == 2 && fqvVar.o != null && !TextUtils.isEmpty(fqvVar.m)) {
                if (!TextUtils.isEmpty(charSequence5)) {
                    charSequence6 = TextUtils.concat(charSequence5, ", ", charSequence6);
                }
                charSequence5 = charSequence6;
            }
        }
        frb frbVar = textInputLayout.a;
        TextView textView2 = frbVar.a;
        if (textView2.getVisibility() == 0) {
            aahVar.a.setLabelFor(textView2);
            aahVar.B(textView2);
        } else {
            aahVar.B(frbVar.c);
        }
        if (isEmpty) {
            if (!TextUtils.isEmpty(charSequence5)) {
                aahVar.A(charSequence5);
                if (!z2 && charSequence4 != null) {
                    aahVar.A(TextUtils.concat(charSequence5, ", ", charSequence4));
                }
            } else if (charSequence4 != null) {
                aahVar.A(charSequence4);
            }
        } else if (TextUtils.isEmpty(charSequence5)) {
            aahVar.A(text);
        } else if (text == null) {
            if (charSequence5 == null) {
                charSequence5 = "";
                charSequence2 = null;
                aahVar.A(charSequence5);
                charSequence5 = charSequence2;
            } else {
                charSequence2 = charSequence5;
                aahVar.A(charSequence5);
                charSequence5 = charSequence2;
            }
        } else if (charSequence5 == null) {
            charSequence5 = text;
            charSequence2 = null;
            aahVar.A(charSequence5);
            charSequence5 = charSequence2;
        } else {
            SpanWatcher[] spanWatcherArr = (SpanWatcher[]) text.getSpans(0, text.length(), SpanWatcher.class);
            if (spanWatcherArr == null || (spanWatcherArr.length) == 0) {
                concat = TextUtils.concat(text, ", ", charSequence5);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                for (SpanWatcher spanWatcher : spanWatcherArr) {
                    spannableStringBuilder.removeSpan(spanWatcher);
                }
                concat = spannableStringBuilder.append((CharSequence) ", ").append(charSequence5);
            }
            CharSequence charSequence7 = charSequence5;
            charSequence5 = concat;
            charSequence2 = charSequence7;
            aahVar.A(charSequence5);
            charSequence5 = charSequence2;
        }
        if (!TextUtils.isEmpty(charSequence5)) {
            if (true == z) {
                charSequence5 = null;
            }
            aahVar.x(charSequence5);
            aahVar.a.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = aahVar.a;
        accessibilityNodeInfo.setMaxTextLength(i);
        if (z4) {
            accessibilityNodeInfo.setError(true == z3 ? charSequence : contentDescription);
        }
        textInputLayout.b.c().v(aahVar);
    }

    @Override // defpackage.wv
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        int i = TextInputLayout.s;
        this.a.b.c().w(accessibilityEvent);
    }
}
