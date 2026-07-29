package com.facebook.ads.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class d extends View {

    /* renamed from: a, reason: collision with root package name */
    private Paint f5611a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f5612b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f5613c;

    /* renamed from: d, reason: collision with root package name */
    private int f5614d;
    private boolean e;

    public d(Context context) {
        this(context, 60, true);
    }

    public d(Context context, int i, boolean z) {
        super(context);
        this.f5614d = i;
        this.e = z;
        if (z) {
            this.f5611a = new Paint();
            this.f5611a.setColor(-3355444);
            this.f5611a.setStyle(Paint.Style.STROKE);
            this.f5611a.setStrokeWidth(3.0f);
            this.f5611a.setAntiAlias(true);
            this.f5612b = new Paint();
            this.f5612b.setColor(-1287371708);
            this.f5612b.setStyle(Paint.Style.FILL);
            this.f5612b.setAntiAlias(true);
            this.f5613c = new Paint();
            this.f5613c.setColor(-1);
            this.f5613c.setStyle(Paint.Style.STROKE);
            this.f5613c.setStrokeWidth(6.0f);
            this.f5613c.setAntiAlias(true);
        }
        a();
    }

    private void a() {
        float f = com.facebook.ads.internal.q.a.v.f5438b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (this.f5614d * f), (int) (this.f5614d * f));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.e) {
            if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
                setLayerType(1, null);
            }
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i2 = (i * 2) / 3;
            float f = i;
            canvas.drawCircle(f, f, i2, this.f5611a);
            canvas.drawCircle(f, f, i2 - 2, this.f5612b);
            int i3 = min / 3;
            float f2 = i3;
            float f3 = i3 * 2;
            canvas.drawLine(f2, f2, f3, f3, this.f5613c);
            canvas.drawLine(f3, f2, f2, f3, this.f5613c);
        }
        super.onDraw(canvas);
    }
}
