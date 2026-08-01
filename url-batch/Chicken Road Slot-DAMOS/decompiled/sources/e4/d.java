package e4;

import android.text.InputFilter;
import android.text.Spanned;
import c4.k;
import m.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f3860a;

    /* renamed from: b, reason: collision with root package name */
    public c f3861b;

    public d(c0 c0Var) {
        this.f3860a = c0Var;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        c0 c0Var = this.f3860a;
        if (c0Var.isInEditMode()) {
            return charSequence;
        }
        int b10 = k.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == c0Var.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i10);
                }
                return k.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (b10 != 3) {
                return charSequence;
            }
        }
        k a9 = k.a();
        if (this.f3861b == null) {
            this.f3861b = new c(c0Var, this);
        }
        a9.g(this.f3861b);
        return charSequence;
    }
}
