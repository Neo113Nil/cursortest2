package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Region;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ScrollView;

/* loaded from: classes2.dex */
public class ai extends aj {

    /* renamed from: a, reason: collision with root package name */
    private int f7822a;

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f7823b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f7824c;

    public ai(Context context) {
        super(context);
        this.f7822a = 0;
        this.f7823b = new Matrix();
        this.f7824c = new float[2];
    }

    public int getRotationCount() {
        return this.f7822a;
    }

    public void setRotationCount(int i) {
        this.f7822a = i & 3;
    }

    @Override // com.tapjoy.internal.aj, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f7822a % 2 == 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i2, i);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if ((r3 instanceof android.widget.HorizontalScrollView) != false) goto L12;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void dispatchDraw(Canvas canvas) {
        if (this.f7822a == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight(), Region.Op.REPLACE);
        try {
            ViewGroup viewGroup = (ViewGroup) getParent();
            try {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                if (!(viewGroup2 instanceof ScrollView)) {
                }
                viewGroup = viewGroup2;
            } catch (Exception unused) {
            }
            int left = getLeft() - viewGroup.getScrollX();
            int top = getTop() - viewGroup.getScrollY();
            canvas.clipRect(0 - left, 0 - top, viewGroup.getWidth() - left, viewGroup.getHeight() - top, Region.Op.INTERSECT);
        } catch (Exception unused2) {
        }
        canvas.rotate(this.f7822a * 90);
        switch (this.f7822a) {
            case 1:
                canvas.translate(0.0f, -r0);
                break;
            case 2:
                canvas.translate(-r0, -r1);
                break;
            case 3:
                canvas.translate(-r1, 0.0f);
                break;
            default:
                throw new IllegalStateException();
        }
        this.f7823b.setRotate(this.f7822a * (-90));
        switch (this.f7822a) {
            case 1:
                this.f7823b.postTranslate(0.0f, r0 - 1);
                break;
            case 2:
                this.f7823b.postTranslate(r0 - 1, r1 - 1);
                break;
            case 3:
                this.f7823b.postTranslate(r1 - 1, 0.0f);
                break;
            default:
                throw new IllegalStateException();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7822a == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float[] fArr = this.f7824c;
        fArr[0] = motionEvent.getX();
        fArr[1] = motionEvent.getY();
        this.f7823b.mapPoints(fArr);
        motionEvent.setLocation(fArr[0], fArr[1]);
        return super.dispatchTouchEvent(motionEvent);
    }
}
