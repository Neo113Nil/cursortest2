package W;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1253a;

    /* renamed from: b, reason: collision with root package name */
    public c f1254b;

    public d(TextView textView) {
        this.f1253a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f1253a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = U.j.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return U.j.a().e(charSequence, 0, charSequence.length());
            }
            if (b2 != 3) {
                return charSequence;
            }
        }
        U.j a2 = U.j.a();
        if (this.f1254b == null) {
            this.f1254b = new c(textView, this);
        }
        a2.f(this.f1254b);
        return charSequence;
    }
}
