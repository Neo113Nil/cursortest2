package com.facebook.ads.internal.view.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class b extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5563a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f5564b;

    public b(Context context, String str) {
        super(context);
        float f = context.getResources().getDisplayMetrics().density;
        TextView textView = new TextView(context);
        textView.setTextColor(-16777216);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        int i = (int) (f * 6.0f);
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.f5563a = new Paint();
        this.f5563a.setStyle(Paint.Style.FILL);
        this.f5563a.setColor(-1);
        this.f5564b = new RectF();
        setBackgroundColor(0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f5564b.set(0.0f, 0.0f, getWidth(), getHeight());
        float f2 = f * 10.0f;
        canvas.drawRoundRect(this.f5564b, f2, f2, this.f5563a);
        super.onDraw(canvas);
    }
}
