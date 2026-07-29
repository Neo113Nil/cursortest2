package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.widget.Button;

/* loaded from: classes.dex */
public class m extends Button {

    /* renamed from: a, reason: collision with root package name */
    private final Path f5784a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f5785b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f5786c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f5787d;
    private boolean e;

    public m(Context context) {
        this(context, false);
    }

    public m(Context context, final boolean z) {
        super(context);
        this.e = false;
        this.f5784a = new Path();
        this.f5785b = new Path();
        this.f5787d = new Path();
        this.f5786c = new Paint() { // from class: com.facebook.ads.internal.view.e.c.m.1
            {
                setStyle(Paint.Style.FILL_AND_STROKE);
                setStrokeCap(Paint.Cap.ROUND);
                setStrokeWidth(3.0f);
                setAntiAlias(true);
                setColor(z ? -1 : -10066330);
            }
        };
        setClickable(true);
        setBackgroundColor(0);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Path path;
        if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
            setLayerType(1, null);
        }
        float max = Math.max(canvas.getWidth(), canvas.getHeight()) / 100.0f;
        if (this.e) {
            this.f5787d.rewind();
            float f = 26.5f * max;
            float f2 = 15.5f * max;
            this.f5787d.moveTo(f, f2);
            this.f5787d.lineTo(f, 84.5f * max);
            this.f5787d.lineTo(90.0f * max, max * 50.0f);
            this.f5787d.lineTo(f, f2);
            this.f5787d.close();
            path = this.f5787d;
        } else {
            this.f5784a.rewind();
            float f3 = 29.0f * max;
            float f4 = 21.0f * max;
            this.f5784a.moveTo(f3, f4);
            float f5 = 79.0f * max;
            this.f5784a.lineTo(f3, f5);
            float f6 = 45.0f * max;
            this.f5784a.lineTo(f6, f5);
            this.f5784a.lineTo(f6, f4);
            this.f5784a.lineTo(f3, f4);
            this.f5784a.close();
            this.f5785b.rewind();
            float f7 = 55.0f * max;
            this.f5785b.moveTo(f7, f4);
            this.f5785b.lineTo(f7, f5);
            float f8 = max * 71.0f;
            this.f5785b.lineTo(f8, f5);
            this.f5785b.lineTo(f8, f4);
            this.f5785b.lineTo(f7, f4);
            this.f5785b.close();
            canvas.drawPath(this.f5784a, this.f5786c);
            path = this.f5785b;
        }
        canvas.drawPath(path, this.f5786c);
        super.onDraw(canvas);
    }

    public void setChecked(boolean z) {
        this.e = z;
        refreshDrawableState();
        invalidate();
    }
}
