package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1353a;

    /* renamed from: b, reason: collision with root package name */
    public c f1354b;

    public d(TextView textView) {
        this.f1353a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f1353a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = V.j.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return V.j.a().e(charSequence, 0, charSequence.length());
            }
            if (b2 != 3) {
                return charSequence;
            }
        }
        V.j a2 = V.j.a();
        if (this.f1354b == null) {
            this.f1354b = new c(textView, this);
        }
        a2.f(this.f1354b);
        return charSequence;
    }
}
