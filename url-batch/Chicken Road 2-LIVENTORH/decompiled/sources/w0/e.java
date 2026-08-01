package w0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3564a;

    /* renamed from: b, reason: collision with root package name */
    public d f3565b;

    public e(TextView textView) {
        this.f3564a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i4, Spanned spanned, int i5, int i6) {
        TextView textView = this.f3564a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b4 = l.a().b();
        if (b4 != 0) {
            if (b4 == 1) {
                if ((i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i4);
                }
                return l.a().e(charSequence, 0, charSequence.length());
            }
            if (b4 != 3) {
                return charSequence;
            }
        }
        l a2 = l.a();
        if (this.f3565b == null) {
            this.f3565b = new d(textView, this);
        }
        a2.f(this.f3565b);
        return charSequence;
    }
}
