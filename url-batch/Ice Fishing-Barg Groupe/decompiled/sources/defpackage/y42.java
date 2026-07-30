package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y42 extends CharacterStyle {
    public final int PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final float lS5Rgt96tfkO;

    public y42(int i, float f, float f2, float f3) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = f;
        this.TSizfFm2Yiuu = f2;
        this.Y1f8riQaR6yg = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.Y1f8riQaR6yg, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.PxuCJdSBwIXG);
    }
}
