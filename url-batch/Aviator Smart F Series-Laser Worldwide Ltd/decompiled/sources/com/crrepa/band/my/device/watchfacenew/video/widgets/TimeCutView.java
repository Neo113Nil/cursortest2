package com.crrepa.band.my.device.watchfacenew.video.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.my.R$drawable;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.utils.o;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public class TimeCutView extends View {
    public static final int ACTION_POINTER_INDEX_MASK = 65280;
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;
    public static final int INVALID_POINTER_ID = 255;
    private static final String TAG = "TimeCutView";
    private double absoluteMaxValuePrim;
    private double absoluteMinValuePrim;
    private a barChangeListener;
    private float downMotionX;
    private boolean isDragging;
    private boolean isShowThumbHandle;
    private boolean isTouchDown;
    private int mActivePointerId;
    private long minShootDuration;
    private double normalizedMaxValue;
    private double normalizedMaxValueTime;
    private double normalizedMinValue;
    private double normalizedMinValueTime;
    private boolean notifyWhileDragging;
    private Paint paint;
    private Thumb pressedThumb;
    private Paint rectPaint;
    private int scaledTouchSlop;
    private Bitmap thumbImageLeft;
    private Bitmap thumbImageRight;

    public enum Thumb {
        MIN,
        MAX
    }

    public interface a {
        void onChange(boolean z7, int i8, int i9, int i10);

        void onLeftBarChange(int i8, int i9);

        void onRightBarChange(int i8, int i9);
    }

    public TimeCutView(Context context) {
        super(context);
        this.mActivePointerId = 255;
        this.minShootDuration = 1000L;
        this.normalizedMinValue = i.DOUBLE_EPSILON;
        this.normalizedMaxValue = 1.0d;
        this.normalizedMinValueTime = i.DOUBLE_EPSILON;
        this.normalizedMaxValueTime = 1.0d;
        this.notifyWhileDragging = false;
        this.isShowThumbHandle = true;
        init();
    }

    private void attemptClaimDrag() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private void drawThumbLeft(float f8, Canvas canvas) {
        canvas.drawBitmap(this.thumbImageLeft, f8, 0.0f, this.paint);
    }

    private void drawThumbRight(float f8, Canvas canvas) {
        canvas.drawBitmap(this.thumbImageRight, f8 - getThumbHandleWidth(), 0.0f, this.paint);
    }

    private Thumb evalPressedThumb(float f8) {
        boolean isInThumbRange = isInThumbRange(f8, this.normalizedMinValue, 2.0d);
        boolean isInThumbRange2 = isInThumbRange(f8, this.normalizedMaxValue, 2.0d);
        if (isInThumbRange && isInThumbRange2) {
            return f8 / ((float) getWidth()) > 0.5f ? Thumb.MIN : Thumb.MAX;
        }
        if (isInThumbRange) {
            return Thumb.MIN;
        }
        if (isInThumbRange2) {
            return Thumb.MAX;
        }
        return null;
    }

    private int getValueLength() {
        return getWidth() - (getThumbHandleWidth() * 2);
    }

    private void init() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.isShowThumbHandle) {
            this.thumbImageLeft = BitmapFactory.decodeResource(getResources(), R$drawable.ic_watchface_video_thumb_handle_left);
            this.thumbImageRight = BitmapFactory.decodeResource(getResources(), R$drawable.ic_watchface_video_thumb_handle_right);
            this.thumbImageLeft = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.thumbImageLeft, o.dp2px(getContext(), 18.0f), o.dp2px(getContext(), 54.0f));
            this.thumbImageRight = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.thumbImageRight, o.dp2px(getContext(), 18.0f), o.dp2px(getContext(), 54.0f));
        }
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        this.rectPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.rectPaint.setColor(-1);
    }

    private boolean isInThumbRange(float f8, double d8, double d9) {
        return ((double) Math.abs(f8 - normalizedToScreen(d8))) <= ((double) (((float) getThumbHandleWidth()) / 2.0f)) * d9;
    }

    private boolean isInThumbRangeLeft(float f8, double d8, double d9) {
        return ((double) Math.abs((f8 - normalizedToScreen(d8)) - ((float) getThumbHandleWidth()))) <= ((double) (((float) getThumbHandleWidth()) / 2.0f)) * d9;
    }

    private float normalizedToScreen(double d8) {
        return (float) (getPaddingLeft() + (d8 * ((getWidth() - getPaddingLeft()) - getPaddingRight())));
    }

    private int normalizedToValue(double d8) {
        double d9 = this.absoluteMinValuePrim;
        return (int) (d9 + (d8 * (this.absoluteMaxValuePrim - d9)));
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.mActivePointerId) {
            int i8 = action == 0 ? 1 : 0;
            this.downMotionX = motionEvent.getX(i8);
            this.mActivePointerId = motionEvent.getPointerId(i8);
        }
    }

    private double screenToNormalized(float f8, int i8) {
        int width = getWidth();
        if (width <= 0) {
            return i.DOUBLE_EPSILON;
        }
        double d8 = f8;
        float normalizedToScreen = normalizedToScreen(this.normalizedMinValue);
        float normalizedToScreen2 = normalizedToScreen(this.normalizedMaxValue);
        double parseDouble = this.absoluteMaxValuePrim > 300000.0d ? Double.parseDouble(new DecimalFormat("0.0000").format((this.minShootDuration / (this.absoluteMaxValuePrim - this.absoluteMinValuePrim)) * (width - (getThumbHandleWidth() * 2)))) : Math.round(r2 + 0.5d);
        if (i8 == 0) {
            if (isInThumbRangeLeft(f8, this.normalizedMinValue, 0.5d)) {
                return this.normalizedMinValue;
            }
            double valueLength = getValueLength() - ((((float) getWidth()) - normalizedToScreen2 >= 0.0f ? getWidth() - normalizedToScreen2 : 0.0f) + parseDouble);
            double d9 = normalizedToScreen;
            if (d8 > d9) {
                d8 = (d8 - d9) + d9;
            } else if (d8 <= d9) {
                d8 = d9 - (d9 - d8);
            }
            if (d8 <= valueLength) {
                valueLength = d8;
            }
            if (valueLength < (getThumbHandleWidth() * 2) / 3.0f) {
                valueLength = 0.0d;
            }
            this.normalizedMinValueTime = Math.min(1.0d, Math.max(i.DOUBLE_EPSILON, valueLength / (width - (getThumbHandleWidth() * 2))));
            return Math.min(1.0d, Math.max(i.DOUBLE_EPSILON, valueLength / width));
        }
        if (isInThumbRange(f8, this.normalizedMaxValue, 0.5d)) {
            return this.normalizedMaxValue;
        }
        double valueLength2 = getValueLength() - (normalizedToScreen + parseDouble);
        double d10 = normalizedToScreen2;
        if (d8 > d10) {
            d8 = (d8 - d10) + d10;
        } else if (d8 <= d10) {
            d8 = d10 - (d10 - d8);
        }
        double width2 = getWidth() - d8;
        if (width2 > valueLength2) {
            d8 = getWidth() - valueLength2;
        } else {
            valueLength2 = width2;
        }
        if (valueLength2 < (getThumbHandleWidth() * 2) / 3.0f) {
            d8 = getWidth();
            valueLength2 = i.DOUBLE_EPSILON;
        }
        this.normalizedMaxValueTime = Math.min(1.0d, Math.max(i.DOUBLE_EPSILON, 1.0d - (valueLength2 / (width - (getThumbHandleWidth() * 2)))));
        return Math.min(1.0d, Math.max(i.DOUBLE_EPSILON, d8 / width));
    }

    private void trackTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return;
        }
        Log.e(TAG, "trackTouchEvent: " + motionEvent.getAction() + " x: " + motionEvent.getX());
        try {
            float x7 = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
            if (Thumb.MIN.equals(this.pressedThumb)) {
                setNormalizedMinValue(screenToNormalized(x7, 0));
            } else if (Thumb.MAX.equals(this.pressedThumb)) {
                setNormalizedMaxValue(screenToNormalized(x7, 1));
            }
        } catch (Exception unused) {
        }
    }

    private double valueToNormalized(long j8) {
        double d8 = this.absoluteMaxValuePrim;
        double d9 = this.absoluteMinValuePrim;
        return i.DOUBLE_EPSILON == d8 - d9 ? i.DOUBLE_EPSILON : (j8 - d9) / (d8 - d9);
    }

    public int getSelectedMaxValue() {
        return normalizedToValue(this.normalizedMaxValueTime);
    }

    public int getSelectedMinValue() {
        return normalizedToValue(this.normalizedMinValueTime);
    }

    public int getThumbHandleWidth() {
        if (this.isShowThumbHandle) {
            return this.thumbImageLeft.getWidth();
        }
        return 0;
    }

    public void hideThumbHandle() {
        this.isShowThumbHandle = false;
    }

    public void initWidget(long j8, long j9) {
        this.absoluteMinValuePrim = j8;
        this.absoluteMaxValuePrim = j9;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public boolean isNotifyWhileDragging() {
        return this.notifyWhileDragging;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        float normalizedToScreen = normalizedToScreen(this.normalizedMinValue);
        float thumbHandleWidth = normalizedToScreen + getThumbHandleWidth();
        float normalizedToScreen2 = normalizedToScreen(this.normalizedMaxValue) - getThumbHandleWidth();
        canvas.drawRect(thumbHandleWidth, 0.0f, normalizedToScreen2, 4, this.rectPaint);
        canvas.drawRect(thumbHandleWidth, getMeasuredHeight() - 4, normalizedToScreen2, getMeasuredHeight(), this.rectPaint);
        if (this.isShowThumbHandle) {
            drawThumbLeft(normalizedToScreen(this.normalizedMinValue), canvas);
            drawThumbRight(normalizedToScreen(this.normalizedMaxValue), canvas);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER"));
        this.normalizedMinValue = bundle.getDouble("MIN");
        this.normalizedMaxValue = bundle.getDouble("MAX");
        this.normalizedMinValueTime = bundle.getDouble("MIN_TIME");
        this.normalizedMaxValueTime = bundle.getDouble("MAX_TIME");
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", this.normalizedMinValue);
        bundle.putDouble("MAX", this.normalizedMaxValue);
        bundle.putDouble("MIN_TIME", this.normalizedMinValueTime);
        bundle.putDouble("MAX_TIME", this.normalizedMaxValueTime);
        return bundle;
    }

    void onStartTrackingTouch() {
        this.isDragging = true;
    }

    void onStopTrackingTouch() {
        this.isDragging = false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.isTouchDown) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() > 1) {
            return super.onTouchEvent(motionEvent);
        }
        if (!isEnabled()) {
            return false;
        }
        if (this.absoluteMaxValuePrim <= this.minShootDuration) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        int i8 = action & 255;
        if (i8 == 0) {
            int pointerId = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
            this.mActivePointerId = pointerId;
            float x7 = motionEvent.getX(motionEvent.findPointerIndex(pointerId));
            this.downMotionX = x7;
            Thumb evalPressedThumb = evalPressedThumb(x7);
            this.pressedThumb = evalPressedThumb;
            if (evalPressedThumb == null) {
                return super.onTouchEvent(motionEvent);
            }
            setPressed(true);
            onStartTrackingTouch();
            trackTouchEvent(motionEvent);
            attemptClaimDrag();
            a aVar2 = this.barChangeListener;
            if (aVar2 != null) {
                aVar2.onChange(this.pressedThumb == Thumb.MIN, getSelectedMinValue(), getSelectedMaxValue(), action);
            }
        } else if (i8 == 1) {
            if (this.isDragging) {
                trackTouchEvent(motionEvent);
                onStopTrackingTouch();
                setPressed(false);
            } else {
                onStartTrackingTouch();
                trackTouchEvent(motionEvent);
                onStopTrackingTouch();
            }
            invalidate();
            a aVar3 = this.barChangeListener;
            if (aVar3 != null) {
                aVar3.onChange(this.pressedThumb == Thumb.MIN, getSelectedMinValue(), getSelectedMaxValue(), action);
            }
            this.pressedThumb = null;
        } else if (i8 != 2) {
            if (i8 == 3) {
                if (this.isDragging) {
                    onStopTrackingTouch();
                    setPressed(false);
                }
                invalidate();
            } else if (i8 == 5) {
                int pointerCount = motionEvent.getPointerCount() - 1;
                this.downMotionX = motionEvent.getX(pointerCount);
                this.mActivePointerId = motionEvent.getPointerId(pointerCount);
                invalidate();
            } else if (i8 == 6) {
                onSecondaryPointerUp(motionEvent);
                invalidate();
            }
        } else if (this.pressedThumb != null) {
            if (this.isDragging) {
                trackTouchEvent(motionEvent);
            } else if (Math.abs(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.downMotionX) > this.scaledTouchSlop) {
                setPressed(true);
                Log.e(TAG, "没有拖住最大最小值");
                invalidate();
                onStartTrackingTouch();
                trackTouchEvent(motionEvent);
                attemptClaimDrag();
            }
            if (this.notifyWhileDragging && (aVar = this.barChangeListener) != null) {
                aVar.onChange(this.pressedThumb == Thumb.MIN, getSelectedMinValue(), getSelectedMaxValue(), action);
            }
        }
        return true;
    }

    public void setMinShootTime(long j8) {
        this.minShootDuration = j8;
    }

    public void setNormalizedMaxValue(double d8) {
        this.normalizedMaxValue = Math.max(i.DOUBLE_EPSILON, Math.min(1.0d, Math.max(d8, this.normalizedMinValue)));
        invalidate();
    }

    public void setNormalizedMinValue(double d8) {
        this.normalizedMinValue = Math.max(i.DOUBLE_EPSILON, Math.min(1.0d, Math.min(d8, this.normalizedMaxValue)));
        invalidate();
    }

    public void setNotifyWhileDragging(boolean z7) {
        this.notifyWhileDragging = z7;
    }

    public void setOnBarChangeListener(a aVar) {
        this.barChangeListener = aVar;
    }

    public void setSelectedMaxValue(long j8) {
        if (i.DOUBLE_EPSILON == this.absoluteMaxValuePrim - this.absoluteMinValuePrim) {
            setNormalizedMaxValue(1.0d);
        } else {
            setNormalizedMaxValue(valueToNormalized(j8));
        }
    }

    public void setSelectedMinValue(long j8) {
        if (i.DOUBLE_EPSILON == this.absoluteMaxValuePrim - this.absoluteMinValuePrim) {
            setNormalizedMinValue(i.DOUBLE_EPSILON);
        } else {
            setNormalizedMinValue(valueToNormalized(j8));
        }
    }

    public void setTouchDown(boolean z7) {
        this.isTouchDown = z7;
    }

    public TimeCutView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mActivePointerId = 255;
        this.minShootDuration = 1000L;
        this.normalizedMinValue = i.DOUBLE_EPSILON;
        this.normalizedMaxValue = 1.0d;
        this.normalizedMinValueTime = i.DOUBLE_EPSILON;
        this.normalizedMaxValueTime = 1.0d;
        this.notifyWhileDragging = false;
        this.isShowThumbHandle = true;
        init();
    }

    public TimeCutView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mActivePointerId = 255;
        this.minShootDuration = 1000L;
        this.normalizedMinValue = i.DOUBLE_EPSILON;
        this.normalizedMaxValue = 1.0d;
        this.normalizedMinValueTime = i.DOUBLE_EPSILON;
        this.normalizedMaxValueTime = 1.0d;
        this.notifyWhileDragging = false;
        this.isShowThumbHandle = true;
        init();
    }
}
