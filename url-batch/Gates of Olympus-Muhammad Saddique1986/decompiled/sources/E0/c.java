package E0;

import O2.l;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1024g;

    /* renamed from: h, reason: collision with root package name */
    public final TextPaint f1025h;

    public c(CharSequence charSequence, TextPaint textPaint) {
        this.f1024g = charSequence;
        this.f1025h = textPaint;
    }

    @Override // O2.l
    public final int n0(int i3) {
        int textRunCursor;
        CharSequence charSequence = this.f1024g;
        textRunCursor = this.f1025h.getTextRunCursor(charSequence, 0, charSequence.length(), false, i3, 0);
        return textRunCursor;
    }

    @Override // O2.l
    public final int s0(int i3) {
        int textRunCursor;
        CharSequence charSequence = this.f1024g;
        textRunCursor = this.f1025h.getTextRunCursor(charSequence, 0, charSequence.length(), false, i3, 2);
        return textRunCursor;
    }
}
