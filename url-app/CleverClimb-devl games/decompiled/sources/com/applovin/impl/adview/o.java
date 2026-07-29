package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.g;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class o extends g {

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f2618d = new Paint(1);
    private static final Paint e = new Paint(1);

    /* renamed from: c, reason: collision with root package name */
    private float f2619c;

    public o(com.applovin.impl.sdk.j jVar, Context context) {
        super(jVar, context);
        this.f2619c = 1.0f;
        f2618d.setARGB(80, 0, 0, 0);
        e.setColor(-1);
        e.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.g
    public void a(int i) {
        setViewScale(i / 30.0f);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f2619c * 8.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f2619c * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getSize() {
        return this.f2619c * 30.0f;
    }

    protected float getStrokeWidth() {
        return this.f2619c * 2.0f;
    }

    @Override // com.applovin.impl.adview.g
    public g.a getStyle() {
        return g.a.WhiteXOnTransparentGrey;
    }

    @Override // com.applovin.impl.adview.g
    public float getViewScale() {
        return this.f2619c;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f2618d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        e.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, e);
        canvas.drawLine(crossOffset, size, size, crossOffset, e);
    }

    @Override // com.applovin.impl.adview.g
    public void setViewScale(float f) {
        this.f2619c = f;
    }
}
