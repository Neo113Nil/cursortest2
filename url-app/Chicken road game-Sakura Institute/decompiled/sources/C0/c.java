package C0;

import android.text.TextPaint;
import u3.l;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f1152j;

    /* renamed from: k, reason: collision with root package name */
    public final TextPaint f1153k;

    public c(CharSequence charSequence, TextPaint textPaint) {
        this.f1152j = charSequence;
        this.f1153k = textPaint;
    }

    @Override // u3.l
    public final int n0(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f1152j;
        textRunCursor = this.f1153k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 0);
        return textRunCursor;
    }

    @Override // u3.l
    public final int r0(int i2) {
        int textRunCursor;
        CharSequence charSequence = this.f1152j;
        textRunCursor = this.f1153k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i2, 2);
        return textRunCursor;
    }
}
