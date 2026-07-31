package M0;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b0.M;
import d0.AbstractC0404e;
import d0.C0406g;
import d0.C0407h;
import f2.j;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0404e f3451a;

    public a(AbstractC0404e abstractC0404e) {
        this.f3451a = abstractC0404e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C0406g c0406g = C0406g.f5653a;
            AbstractC0404e abstractC0404e = this.f3451a;
            if (j.a(abstractC0404e, c0406g)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC0404e instanceof C0407h) {
                textPaint.setStyle(Paint.Style.STROKE);
                C0407h c0407h = (C0407h) abstractC0404e;
                textPaint.setStrokeWidth(c0407h.f5654a);
                textPaint.setStrokeMiter(c0407h.f5655b);
                int i3 = c0407h.f5657d;
                textPaint.setStrokeJoin(M.t(i3, 0) ? Paint.Join.MITER : M.t(i3, 1) ? Paint.Join.ROUND : M.t(i3, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i4 = c0407h.f5656c;
                textPaint.setStrokeCap(M.s(i4, 0) ? Paint.Cap.BUTT : M.s(i4, 1) ? Paint.Cap.ROUND : M.s(i4, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                c0407h.getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
