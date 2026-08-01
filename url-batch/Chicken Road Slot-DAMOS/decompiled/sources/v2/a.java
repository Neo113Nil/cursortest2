package v2;

import a2.r;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;
import m1.c;
import m1.f;
import m1.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public final c f9947d;

    public a(c cVar) {
        this.f9947d = cVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            f fVar = f.f6411b;
            c cVar = this.f9947d;
            if (Intrinsics.a(cVar, fVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(cVar instanceof g)) {
                r.p();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            g gVar = (g) cVar;
            textPaint.setStrokeWidth(gVar.f6412b);
            textPaint.setStrokeMiter(gVar.f6413c);
            int i3 = gVar.f6415e;
            textPaint.setStrokeJoin(i3 == 0 ? Paint.Join.MITER : i3 == 1 ? Paint.Join.ROUND : i3 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i10 = gVar.f6414d;
            textPaint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
