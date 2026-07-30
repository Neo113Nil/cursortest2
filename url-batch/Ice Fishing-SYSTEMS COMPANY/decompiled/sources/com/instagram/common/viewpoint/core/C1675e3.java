package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.e3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1675e3 extends RelativeLayout {
    public final Paint A00;
    public final RectF A01;

    public C1675e3(C1839gi c1839gi, String str) {
        super(c1839gi);
        float f6 = c1839gi.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(c1839gi);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f6;
        int i = (int) density;
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setColor(-1);
        this.A01 = new RectF();
        YB.A0N(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f6 = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f6 * 10.0f, 10.0f * f6, this.A00);
        super.onDraw(canvas);
    }
}
