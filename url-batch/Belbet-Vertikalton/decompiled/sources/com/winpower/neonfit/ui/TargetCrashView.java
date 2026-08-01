package com.winpower.neonfit.ui;

import V0.a;
import V0.c;
import V0.d;
import X0.l;
import a.AbstractC0058a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import j1.h;
import java.util.ArrayList;
import java.util.Iterator;
import l1.AbstractC0211d;
import l1.C0210c;

/* loaded from: classes.dex */
public final class TargetCrashView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2634a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2635b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2636c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2637d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f2638f;

    /* renamed from: g, reason: collision with root package name */
    public float f2639g;

    /* renamed from: h, reason: collision with root package name */
    public final a f2640h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetCrashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        this.f2634a = new ArrayList(120);
        ArrayList arrayList = new ArrayList();
        this.f2635b = arrayList;
        this.f2636c = new Paint(1);
        this.f2640h = new a(this, 2);
        a();
        arrayList.addAll(l.k0(new c("x2", -1507542, getWidth() * 0.2f, getHeight() * 0.3f, 2.5f), new c("CRASHED", -53867, getWidth() * 0.7f, getHeight() * 0.25f, 1.8f), new c("x3", -1507542, getWidth() * 0.5f, getHeight() * 0.6f, 2.2f), new c("WIN", -53867, getWidth() * 0.3f, getHeight() * 0.7f, 1.5f)));
    }

    public final void a() {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        for (int i = 0; i < 120; i++) {
            C0210c c0210c = AbstractC0211d.f3269a;
            float c2 = c0210c.c() * 6.28f;
            float c3 = (c0210c.c() * 12.0f) + 4.0f;
            double d2 = c2;
            this.f2634a.add(new d(width, height, ((float) Math.cos(d2)) * c3, ((float) Math.sin(d2)) * c3, AbstractC0211d.f3270b.c().nextBoolean() ? -1507542 : -53867));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2637d = true;
        Choreographer.getInstance().postFrameCallback(this.f2640h);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f2637d = false;
        Choreographer.getInstance().removeFrameCallback(this.f2640h);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        h.e(canvas, "canvas");
        canvas.save();
        canvas.translate(this.f2638f, this.f2639g);
        Iterator it = this.f2634a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            paint = this.f2636c;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            paint.setColor(dVar.e);
            paint.setAlpha(AbstractC0058a.m((int) (dVar.f1337f * 255), 0, 255));
            canvas.drawCircle(dVar.f1333a, dVar.f1334b, (dVar.f1337f * 4.0f) + 4.0f, paint);
        }
        Iterator it2 = this.f2635b.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            paint.setColor(cVar.f1331d);
            paint.setAlpha(cVar.e);
            String str = cVar.f1330c;
            paint.setTextSize(str.length() > 3 ? 42.0f : 56.0f);
            paint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, cVar.f1328a, cVar.f1329b, paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ArrayList arrayList = this.f2635b;
        if (!arrayList.isEmpty() || i <= 0 || i2 <= 0) {
            return;
        }
        float f2 = i;
        float f3 = i2;
        arrayList.addAll(l.k0(new c("x2", -1507542, f2 * 0.2f, f3 * 0.3f, 2.5f), new c("CRASHED", -53867, f2 * 0.7f, f3 * 0.25f, 1.8f), new c("x3", -1507542, f2 * 0.5f, f3 * 0.6f, 2.2f), new c("WIN", -53867, f2 * 0.3f, f3 * 0.7f, 1.5f)));
    }
}
