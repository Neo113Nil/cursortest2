package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iu extends CharacterStyle implements UpdateAppearance {
    public final p4 d;

    public iu(p4 p4Var) {
        this.d = p4Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            uy uyVar = uy.q;
            p4 p4Var = this.d;
            if (Intrinsics.a(p4Var, uyVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(p4Var instanceof ze1)) {
                l.a();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ze1 ze1Var = (ze1) p4Var;
            textPaint.setStrokeWidth(ze1Var.q);
            textPaint.setStrokeMiter(ze1Var.r);
            int i = ze1Var.t;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = ze1Var.s;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
