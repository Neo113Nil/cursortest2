package defpackage;

import android.text.TextPaint;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aw0 extends yk3 {
    public final CharSequence v;
    public final TextPaint w;

    public aw0(CharSequence charSequence, TextPaint textPaint) {
        this.v = charSequence;
        this.w = textPaint;
    }

    @Override // defpackage.yk3
    public final int M(int i) {
        CharSequence charSequence = this.v;
        return this.w.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.yk3
    public final int N(int i) {
        CharSequence charSequence = this.v;
        return this.w.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
