package x0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3844a;

    /* renamed from: b, reason: collision with root package name */
    public c f3845b;

    public d(TextView textView) {
        this.f3844a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i4, Spanned spanned, int i5, int i6) {
        TextView textView = this.f3844a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = l.a().b();
        if (b2 != 0) {
            if (b2 == 1) {
                if ((i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i4);
                }
                return l.a().e(charSequence, 0, charSequence.length());
            }
            if (b2 != 3) {
                return charSequence;
            }
        }
        l a5 = l.a();
        if (this.f3845b == null) {
            this.f3845b = new c(textView, this);
        }
        a5.f(this.f3845b);
        return charSequence;
    }
}
