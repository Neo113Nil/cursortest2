package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private Path f10394a;

    /* renamed from: b, reason: collision with root package name */
    private Paint f10395b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f10396c;

    /* renamed from: d, reason: collision with root package name */
    private float[] f10397d;

    public RoundCornerRelativeLayout(Context context) {
        super(context);
        this.f10397d = new float[8];
        a();
    }

    private void a() {
        float a9 = q.a(getContext(), 12.0f);
        setRadius(a9, a9, a9, a9);
        this.f10394a = new Path();
        this.f10395b = new Paint(1);
        this.f10396c = new RectF();
        this.f10395b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Path b() {
        this.f10394a.reset();
        this.f10394a.addRoundRect(this.f10396c, this.f10397d, Path.Direction.CW);
        return this.f10394a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        this.f10394a.reset();
        this.f10394a.addRoundRect(this.f10396c, this.f10397d, Path.Direction.CW);
        canvas.clipPath(this.f10394a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        this.f10396c.set(0.0f, 0.0f, i, i4);
    }

    public void setRadius(int i) {
        float a9 = q.a(getContext(), i);
        setRadius(a9, a9, a9, a9);
    }

    public void setRadius(float f6, float f9, float f10, float f11) {
        float[] fArr = this.f10397d;
        fArr[1] = f6;
        fArr[0] = f6;
        fArr[3] = f9;
        fArr[2] = f9;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f11;
        fArr[6] = f11;
        invalidate();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10397d = new float[8];
        a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10397d = new float[8];
        a();
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        this.f10397d = new float[8];
        a();
    }
}
