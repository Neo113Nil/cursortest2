package K0;

import Z.K;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b0.AbstractC0497e;
import b0.C0499g;
import b0.C0500h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0497e f3447a;

    public a(AbstractC0497e abstractC0497e) {
        this.f3447a = abstractC0497e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C0499g c0499g = C0499g.f5607a;
            AbstractC0497e abstractC0497e = this.f3447a;
            if (Intrinsics.a(abstractC0497e, c0499g)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC0497e instanceof C0500h) {
                textPaint.setStyle(Paint.Style.STROKE);
                C0500h c0500h = (C0500h) abstractC0497e;
                textPaint.setStrokeWidth(c0500h.f5608a);
                textPaint.setStrokeMiter(c0500h.f5609b);
                int i2 = c0500h.f5611d;
                textPaint.setStrokeJoin(K.s(i2, 0) ? Paint.Join.MITER : K.s(i2, 1) ? Paint.Join.ROUND : K.s(i2, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i4 = c0500h.f5610c;
                textPaint.setStrokeCap(K.r(i4, 0) ? Paint.Cap.BUTT : K.r(i4, 1) ? Paint.Cap.ROUND : K.r(i4, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                c0500h.getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
