package com.winpower.neonfit.ui;

import V0.a;
import V0.b;
import a.AbstractC0058a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import j1.h;
import java.util.ArrayList;
import l1.AbstractC0211d;
import l1.C0210c;

/* loaded from: classes.dex */
public final class StarrySkyView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2629a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2630b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2631c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2632d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public final a f2633f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarrySkyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        this.f2629a = new ArrayList(80);
        this.f2630b = new Paint(1);
        this.f2633f = new a(this, 1);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2632d = true;
        Choreographer.getInstance().postFrameCallback(this.f2633f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f2632d = false;
        Choreographer.getInstance().removeFrameCallback(this.f2633f);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        canvas.drawColor(-16448248);
        for (b bVar : this.f2629a) {
            float sin = (((float) Math.sin((this.e * 2.0f) + bVar.f1327f)) * 0.35f) + 0.65f;
            Paint paint = this.f2630b;
            paint.setColor((AbstractC0058a.m((int) (bVar.e * sin), 40, 255) << 24) | 16777215);
            canvas.drawCircle(bVar.f1323a, bVar.f1324b, bVar.f1325c, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f2631c || i <= 0 || i2 <= 0) {
            return;
        }
        ArrayList arrayList = this.f2629a;
        arrayList.clear();
        for (int i5 = 0; i5 < 80; i5++) {
            C0210c c0210c = AbstractC0211d.f3269a;
            arrayList.add(new b(c0210c.c() * i, c0210c.c() * i2, (c0210c.c() * 2.0f) + 0.5f, (c0210c.c() * 0.3f) + 0.05f, AbstractC0211d.f3270b.b(), 6.28f * c0210c.c()));
        }
        this.f2631c = true;
    }
}
