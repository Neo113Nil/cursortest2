package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class uj implements InputFilter {
    public final TextView a;
    public tj b;

    public uj(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (!textView.isInEditMode()) {
            int b = lj.a().b();
            if (b != 0) {
                if (b == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return lj.a().e(charSequence, 0, charSequence.length());
                    }
                }
            }
            lj a = lj.a();
            if (this.b == null) {
                this.b = new tj(textView, this);
            }
            a.f(this.b);
            return charSequence;
        }
        return charSequence;
    }
}
