package com.fortunequest.neontrack.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.fortunequest.neontrack.R;
import m1.AbstractC0290d;
import m1.C0289c;
import w0.e;
import w0.f;

/* loaded from: classes.dex */
public final class StarrySkyView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2120b;

    /* renamed from: c, reason: collision with root package name */
    public float f2121c;
    public final e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarrySkyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k1.e.e(context, "context");
        f[] fVarArr = new f[120];
        for (int i = 0; i < 120; i++) {
            C0289c c0289c = AbstractC0290d.f3539a;
            fVarArr[i] = new f(c0289c.a(), c0289c.a(), (c0289c.a() * 2.5f) + 0.5f, c0289c.a() * 6.28f, 0.005f + (c0289c.a() * 0.015f), AbstractC0290d.f3540b.a().nextBoolean() ? context.getColor(R.color.neon_cyan) : -1);
        }
        this.f2119a = fVarArr;
        this.f2120b = new Paint(1);
        this.d = new e(this, 1);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Choreographer.getInstance().postFrameCallback(this.d);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Choreographer.getInstance().removeFrameCallback(this.d);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        k1.e.e(canvas, "canvas");
        canvas.drawColor(getContext().getColor(R.color.coal_black));
        float width = getWidth();
        float height = getHeight();
        for (f fVar : this.f2119a) {
            int sin = (int) ((((((float) Math.sin(((this.f2121c * fVar.f4486e) * 60.0f) + fVar.d)) + 1.0f) / 2.0f) * 180.0f) + 40.0f);
            Paint paint = this.f2120b;
            paint.setColor(fVar.f4487f);
            paint.setAlpha(sin);
            canvas.drawCircle(fVar.f4483a * width, fVar.f4484b * height, fVar.f4485c, paint);
        }
    }
}
