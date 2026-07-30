package W;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2772a;

    /* renamed from: b, reason: collision with root package name */
    public c f2773b;

    public d(TextView textView) {
        this.f2772a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i5, Spanned spanned, int i7, int i8) {
        TextView textView = this.f2772a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b7 = U.j.a().b();
        if (b7 != 0) {
            if (b7 == 1) {
                if ((i8 == 0 && i7 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i5 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i5);
                }
                return U.j.a().e(charSequence, 0, charSequence.length());
            }
            if (b7 != 3) {
                return charSequence;
            }
        }
        U.j a7 = U.j.a();
        if (this.f2773b == null) {
            this.f2773b = new c(textView, this);
        }
        a7.f(this.f2773b);
        return charSequence;
    }
}
