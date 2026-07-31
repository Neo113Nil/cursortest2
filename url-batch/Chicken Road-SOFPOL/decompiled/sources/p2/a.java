package p2;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import h1.c;
import h1.f;
import h1.g;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public final c f5731d;

    public a(c cVar) {
        this.f5731d = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            f fVar = f.f3080b;
            c cVar = this.f5731d;
            if (i.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(cVar instanceof g)) {
                throw new a5.c();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            g gVar = (g) cVar;
            textPaint.setStrokeWidth(gVar.f3081b);
            textPaint.setStrokeMiter(gVar.f3082c);
            int i = gVar.f3084e;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i8 = gVar.f3083d;
            textPaint.setStrokeCap(i8 == 0 ? Paint.Cap.BUTT : i8 == 1 ? Paint.Cap.ROUND : i8 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
