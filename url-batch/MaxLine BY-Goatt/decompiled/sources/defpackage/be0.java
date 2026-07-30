package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class be0 extends CharacterStyle implements UpdateAppearance {
    public final ae0 m;

    public be0(ae0 ae0Var) {
        this.m = ae0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            vl0 vl0Var = vl0.a;
            ae0 ae0Var = this.m;
            if (Intrinsics.b(ae0Var, vl0Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(ae0Var instanceof xp2)) {
                a.b();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            xp2 xp2Var = (xp2) ae0Var;
            textPaint.setStrokeWidth(xp2Var.a);
            textPaint.setStrokeMiter(xp2Var.b);
            int i = xp2Var.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = xp2Var.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
