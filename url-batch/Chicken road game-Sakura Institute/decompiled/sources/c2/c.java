package c2;

import android.text.TextPaint;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends a8.d {

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f1631j;

    /* renamed from: k, reason: collision with root package name */
    public final TextPaint f1632k;

    public c(CharSequence charSequence, TextPaint textPaint) {
        this.f1631j = charSequence;
        this.f1632k = textPaint;
    }

    @Override // a8.d
    public final int N(int i7) {
        int textRunCursor;
        CharSequence charSequence = this.f1631j;
        textRunCursor = this.f1632k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 0);
        return textRunCursor;
    }

    @Override // a8.d
    public final int Q(int i7) {
        int textRunCursor;
        CharSequence charSequence = this.f1631j;
        textRunCursor = this.f1632k.getTextRunCursor(charSequence, 0, charSequence.length(), false, i7, 2);
        return textRunCursor;
    }
}
