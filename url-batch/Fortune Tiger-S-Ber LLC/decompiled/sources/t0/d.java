package t0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3367a;

    /* renamed from: b, reason: collision with root package name */
    public c f3368b;

    public d(TextView textView) {
        this.f3367a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        TextView textView = this.f3367a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = l.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i4 != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i4, i5);
                }
                return l.a().e(charSequence, 0, charSequence.length());
            }
            if (b2 != 3) {
                return charSequence;
            }
        }
        l a4 = l.a();
        if (this.f3368b == null) {
            this.f3368b = new c(textView, this);
        }
        a4.f(this.f3368b);
        return charSequence;
    }
}
