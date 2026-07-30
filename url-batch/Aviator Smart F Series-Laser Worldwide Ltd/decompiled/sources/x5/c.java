package x5;

import android.text.Spanned;

/* loaded from: classes4.dex */
public abstract class c {
    private c() {
    }

    public static boolean selfEnd(int i8, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i8;
    }

    public static boolean selfStart(int i8, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i8;
    }
}
