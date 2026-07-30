package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m30 extends CharacterStyle implements UpdateAppearance {
    public final l30 rtx2ld2ELZv4;

    public m30(l30 l30Var) {
        this.rtx2ld2ELZv4 = l30Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            u70 u70Var = u70.PxuCJdSBwIXG;
            l30 l30Var = this.rtx2ld2ELZv4;
            if (cs0.wdg6QnbFHrFF(l30Var, u70Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(l30Var instanceof ra2)) {
                u9.gPXPFXrUH4XX();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ra2 ra2Var = (ra2) l30Var;
            textPaint.setStrokeWidth(ra2Var.PxuCJdSBwIXG);
            textPaint.setStrokeMiter(ra2Var.lS5Rgt96tfkO);
            int i = ra2Var.Y1f8riQaR6yg;
            va2.Companion.getClass();
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = ra2Var.TSizfFm2Yiuu;
            ta2.Companion.getClass();
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
