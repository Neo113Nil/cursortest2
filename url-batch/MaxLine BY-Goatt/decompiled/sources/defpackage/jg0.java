package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jg0 implements InputFilter {
    public final TextView a;
    public ig0 b;

    public jg0(TextView textView) {
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
            int c = ag0.a().c();
            if (c != 0) {
                if (c == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return ag0.a().g(0, charSequence.length(), 0, charSequence);
                    }
                }
            }
            ag0 a = ag0.a();
            if (this.b == null) {
                this.b = new ig0(textView, this);
            }
            a.h(this.b);
            return charSequence;
        }
        return charSequence;
    }
}
