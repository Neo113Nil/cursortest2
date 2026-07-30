package com.crrepa.band.my.device.watchfacenew.photo.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.baidu.ar.util.SystemInfoUtil;

/* loaded from: classes2.dex */
public class DraggableLinearLayout extends LinearLayout {
    public static final int DEFAULT_LAYOUT_MARGIN = 28;
    private boolean dragEnabled;
    private a dragListener;
    private float dx;
    private float dy;

    public interface a {
        void onActionUp(int i8, int i9);
    }

    public DraggableLinearLayout(Context context) {
        super(context);
        this.dragEnabled = false;
    }

    private PointF adjustToCircle(int i8, int i9, int i10, int i11, int i12) {
        float f8 = i8 - i10;
        float f9 = i9 - i11;
        float sqrt = (float) Math.sqrt((f8 * f8) + (f9 * f9));
        float f10 = i12;
        return new PointF(i10 + ((f8 * f10) / sqrt), i11 + ((f9 * f10) / sqrt));
    }

    private PointF adjustToEllipseIfNecessary(float f8, float f9, int i8, int i9, int i10, int i11, int i12) {
        float f10 = i8 / 2.0f;
        float f11 = i9 / 2.0f;
        float f12 = i12;
        float f13 = i10 / 2.0f;
        float f14 = (f10 - f12) - f13;
        float f15 = i11 / 2.0f;
        float f16 = (f11 - f12) - f15;
        if (f14 <= 0.0f || f16 <= 0.0f) {
            return null;
        }
        float f17 = f8 - f10;
        float f18 = f9 - f11;
        if (Math.pow(f17 / f14, 2.0d) + Math.pow(f18 / f16, 2.0d) <= 1.0d) {
            return null;
        }
        double atan2 = (float) Math.atan2(f18, f17);
        return new PointF(((float) (f10 + (f14 * Math.cos(atan2)))) - f13, ((float) (f11 + (f16 * Math.sin(atan2)))) - f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCenterInHorizontal$1(boolean z7) {
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i8 = width - measuredWidth;
        int i9 = i8 / 2;
        int i10 = z7 ? 28 : (height - measuredHeight) - 28;
        int max = Math.max(0, Math.min(i9, i8));
        int max2 = Math.max(0, Math.min(i10, height - measuredHeight));
        setX(max);
        setY(max2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPositionInParent$0(int[] iArr, int[] iArr2, int i8, int i9) {
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        PointF adjustToEllipseIfNecessary = adjustToEllipseIfNecessary(iArr[0] + (width2 / 2), iArr2[0] + (height2 / 2), width, height, width2, height2, 28);
        if (adjustToEllipseIfNecessary != null) {
            iArr[0] = (int) adjustToEllipseIfNecessary.x;
            iArr2[0] = (int) adjustToEllipseIfNecessary.y;
        }
        int max = Math.max(28, Math.min(iArr[0], (width - width2) - 28));
        int max2 = Math.max(28, Math.min(iArr2[0], (height - height2) - 28));
        setX(max);
        setY(max2);
        Log.d("setPositionInParent", "x = " + i8 + " y = " + i9 + " newX = " + max + " newY = " + max2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.dragEnabled) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float cos;
        float sin;
        if (!this.dragEnabled) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.dx = getX() - rawX;
            this.dy = getY() - rawY;
            return true;
        }
        if (action == 1) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            ((View) getParent()).getLocationOnScreen(iArr2);
            int i8 = iArr[0] - iArr2[0];
            int i9 = iArr[1] - iArr2[1];
            a aVar = this.dragListener;
            if (aVar != null) {
                aVar.onActionUp(i8, i9);
            }
            Log.d("onActionUp", i8 + SystemInfoUtil.COMMA + i9);
            return true;
        }
        if (action != 2) {
            return super.onTouchEvent(motionEvent);
        }
        float f8 = rawX + this.dx;
        float f9 = rawY + this.dy;
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int width2 = getWidth();
        float f10 = width / 2.0f;
        float f11 = height / 2.0f;
        float f12 = 28;
        float f13 = width2 / 2.0f;
        float f14 = (f10 - f12) - f13;
        float height2 = getHeight() / 2.0f;
        float f15 = (f11 - f12) - height2;
        float f16 = (f8 + f13) - f10;
        float f17 = (f9 + height2) - f11;
        if (Math.pow(f16 / f14, 2.0d) + Math.pow(f17 / f15, 2.0d) <= 1.0d) {
            cos = f8;
            sin = f9;
        } else {
            double atan2 = (float) Math.atan2(f17, f16);
            cos = (float) ((f10 + (f14 * Math.cos(atan2))) - f13);
            sin = (float) ((f11 + (f15 * Math.sin(atan2))) - height2);
        }
        float max = Math.max(f12, Math.min(cos, (width - width2) - 28));
        float max2 = Math.max(f12, Math.min(sin, (height - r7) - 28));
        setX(max);
        setY(max2);
        return true;
    }

    public void setCenterInHorizontal(final boolean z7) {
        post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.photo.widgets.b
            @Override // java.lang.Runnable
            public final void run() {
                DraggableLinearLayout.this.lambda$setCenterInHorizontal$1(z7);
            }
        });
    }

    public void setDragEnabled(boolean z7) {
        this.dragEnabled = z7;
    }

    public void setDragListener(a aVar) {
        this.dragListener = aVar;
    }

    public void setPositionInParent(final int i8, final int i9) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.removeRule(14);
        setLayoutParams(layoutParams);
        if (i8 == 0 && i9 == 0) {
            Log.d("setPositionInParent", "x == 0 && y == 0");
            return;
        }
        final int[] iArr = {i8};
        final int[] iArr2 = {i9};
        post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.photo.widgets.a
            @Override // java.lang.Runnable
            public final void run() {
                DraggableLinearLayout.this.lambda$setPositionInParent$0(iArr, iArr2, i8, i9);
            }
        });
    }

    public DraggableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dragEnabled = false;
    }

    public DraggableLinearLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.dragEnabled = false;
    }
}
