package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jf2 extends CharacterStyle {
    public final boolean PxuCJdSBwIXG;
    public final boolean lS5Rgt96tfkO;

    public jf2(boolean z, boolean z2) {
        this.PxuCJdSBwIXG = z;
        this.lS5Rgt96tfkO = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.PxuCJdSBwIXG);
        textPaint.setStrikeThruText(this.lS5Rgt96tfkO);
    }
}
