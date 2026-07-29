package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class aa extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f3685a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3686b;

    /* renamed from: c, reason: collision with root package name */
    private int f3687c;

    public aa(Context context) {
        super(context);
        this.f3686b = 1.0f;
        this.f3687c = 0;
        int round = Math.round(context.getResources().getDisplayMetrics().density * 5.0f);
        setPadding(round, round, round, round);
        setBaselineAligned(false);
        this.f3685a = new Paint();
        this.f3685a.setStyle(Paint.Style.FILL);
    }

    public void a(int i) {
        this.f3685a.setColor(i);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = getContext().getResources().getDisplayMetrics().density;
        if ((this.f3687c & 1) > 0) {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), f * 1.0f, this.f3685a);
        }
        if ((this.f3687c & 2) > 0) {
            canvas.drawRect(canvas.getWidth() - (f * 1.0f), 0.0f, canvas.getWidth(), canvas.getHeight(), this.f3685a);
        }
        if ((this.f3687c & 4) > 0) {
            canvas.drawRect(0.0f, canvas.getHeight() - (f * 1.0f), canvas.getWidth(), canvas.getHeight(), this.f3685a);
        }
        if ((this.f3687c & 8) > 0) {
            canvas.drawRect(0.0f, 0.0f, f * 1.0f, canvas.getHeight(), this.f3685a);
        }
    }

    public void b(int i) {
        this.f3687c = i;
    }
}
