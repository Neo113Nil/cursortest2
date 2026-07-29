package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.g;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class v extends g {

    /* renamed from: d, reason: collision with root package name */
    private static final Paint f2630d = new Paint(1);
    private static final Paint e = new Paint(1);
    private static final Paint f = new Paint(1);

    /* renamed from: c, reason: collision with root package name */
    private float f2631c;

    public v(com.applovin.impl.sdk.j jVar, Context context) {
        super(jVar, context);
        this.f2631c = 1.0f;
        f2630d.setColor(-1);
        e.setColor(-16777216);
        f.setColor(-1);
        f.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.g
    public void a(int i) {
        setViewScale(i / 30.0f);
    }

    protected float getCenter() {
        return getSize() / 2.0f;
    }

    protected float getCrossOffset() {
        return this.f2631c * 10.0f;
    }

    protected float getInnerCircleOffset() {
        return this.f2631c * 2.0f;
    }

    protected float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    protected float getSize() {
        return this.f2631c * 30.0f;
    }

    protected float getStrokeWidth() {
        return this.f2631c * 3.0f;
    }

    @Override // com.applovin.impl.adview.g
    public g.a getStyle() {
        return g.a.WhiteXOnOpaqueBlack;
    }

    @Override // com.applovin.impl.adview.g
    public float getViewScale() {
        return this.f2631c;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f2630d);
        canvas.drawCircle(center, center, getInnerCircleRadius(), e);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f.setStrokeWidth(getStrokeWidth());
        canvas.drawLine(crossOffset, crossOffset, size, size, f);
        canvas.drawLine(crossOffset, size, size, crossOffset, f);
    }

    @Override // com.applovin.impl.adview.g
    public void setViewScale(float f2) {
        this.f2631c = f2;
    }
}
