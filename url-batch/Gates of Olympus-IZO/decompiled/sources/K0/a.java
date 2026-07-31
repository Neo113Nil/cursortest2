package K0;

import Z1.i;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b0.AbstractC0259J;
import d0.AbstractC0322c;
import d0.C0325f;
import d0.C0326g;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0322c f2654a;

    public a(AbstractC0322c abstractC0322c) {
        this.f2654a = abstractC0322c;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C0325f c0325f = C0325f.f4448b;
            AbstractC0322c abstractC0322c = this.f2654a;
            if (i.a(abstractC0322c, c0325f)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC0322c instanceof C0326g) {
                textPaint.setStyle(Paint.Style.STROKE);
                C0326g c0326g = (C0326g) abstractC0322c;
                textPaint.setStrokeWidth(c0326g.f4449b);
                textPaint.setStrokeMiter(c0326g.f4450c);
                int i3 = c0326g.f4452e;
                textPaint.setStrokeJoin(AbstractC0259J.r(i3, 0) ? Paint.Join.MITER : AbstractC0259J.r(i3, 1) ? Paint.Join.ROUND : AbstractC0259J.r(i3, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i4 = c0326g.f4451d;
                textPaint.setStrokeCap(AbstractC0259J.q(i4, 0) ? Paint.Cap.BUTT : AbstractC0259J.q(i4, 1) ? Paint.Cap.ROUND : AbstractC0259J.q(i4, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                c0326g.getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
