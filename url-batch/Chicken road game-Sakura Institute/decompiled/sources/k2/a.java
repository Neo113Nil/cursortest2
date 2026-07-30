package k2;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import b1.f;
import b1.h;
import b1.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: f, reason: collision with root package name */
    public final f f5341f;

    public a(f fVar) {
        this.f5341f = fVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            h hVar = h.f1238a;
            f fVar = this.f5341f;
            if (k.a(fVar, hVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (fVar instanceof i) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((i) fVar).f1239a);
                textPaint.setStrokeMiter(((i) fVar).f1240b);
                int i7 = ((i) fVar).f1242d;
                textPaint.setStrokeJoin(i7 == 0 ? Paint.Join.MITER : i7 == 1 ? Paint.Join.ROUND : i7 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i8 = ((i) fVar).f1241c;
                textPaint.setStrokeCap(i8 == 0 ? Paint.Cap.BUTT : i8 == 1 ? Paint.Cap.ROUND : i8 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                ((i) fVar).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
