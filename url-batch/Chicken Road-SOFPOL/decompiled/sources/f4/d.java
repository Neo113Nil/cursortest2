package f4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import d4.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2724a;

    /* renamed from: b, reason: collision with root package name */
    public c f2725b;

    public d(TextView textView) {
        this.f2724a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f2724a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b8 = l.a().b();
        if (b8 != 0) {
            if (b8 == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i8);
                }
                return l.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (b8 != 3) {
                return charSequence;
            }
        }
        l a8 = l.a();
        if (this.f2725b == null) {
            this.f2725b = new c(textView, this);
        }
        a8.g(this.f2725b);
        return charSequence;
    }
}
