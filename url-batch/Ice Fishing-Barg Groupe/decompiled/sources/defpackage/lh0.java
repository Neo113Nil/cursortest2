package defpackage;

import android.text.TextPaint;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lh0 extends jh0 {
    public final CharSequence OPXfSBeufaJ8;
    public final TextPaint wdg6QnbFHrFF;

    public lh0(CharSequence charSequence, TextPaint textPaint) {
        this.OPXfSBeufaJ8 = charSequence;
        this.wdg6QnbFHrFF = textPaint;
    }

    @Override // defpackage.jh0
    public final int aF05bpZJlKEP(int i) {
        int textRunCursor;
        CharSequence charSequence = this.OPXfSBeufaJ8;
        textRunCursor = this.wdg6QnbFHrFF.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }

    @Override // defpackage.jh0
    public final int e6tOsSdd2EFb(int i) {
        int textRunCursor;
        CharSequence charSequence = this.OPXfSBeufaJ8;
        textRunCursor = this.wdg6QnbFHrFF.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }
}
