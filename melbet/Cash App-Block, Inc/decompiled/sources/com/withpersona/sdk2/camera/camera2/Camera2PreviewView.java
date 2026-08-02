package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public final class Camera2PreviewView extends ViewGroup {
    public int previewH;
    public int previewW;
    public SurfaceView surfaceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context) {
        super(context);
        context.getClass();
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.previewW == 0 || this.previewH == 0) {
            this.surfaceView.layout(i, i2, i3, i4);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        double max = Double.max(measuredWidth / this.previewW, measuredHeight / this.previewH);
        int ceil = (int) Math.ceil(this.previewW * max);
        int ceil2 = (int) Math.ceil(max * this.previewH);
        int i5 = ceil - measuredWidth;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (i5 / 2) * (-1);
        int i7 = ceil2 - measuredHeight;
        int i8 = ((i7 >= 0 ? i7 : 0) / 2) * (-1);
        this.surfaceView.layout(i6, i8, ceil + i6, ceil2 + i8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(Integer.MAX_VALUE, i), View.resolveSize(Integer.MAX_VALUE, i2));
        this.surfaceView.measure(View.MeasureSpec.makeMeasureSpec(this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(this.previewH, 1073741824));
    }

    public final void setCameraPreviewSize(int i, int i2, int i3) {
        if (i3 == 90 || i3 == 270) {
            this.previewW = i2;
            this.previewH = i;
        } else {
            this.previewW = i;
            this.previewH = i2;
        }
        SurfaceHolder holder = this.surfaceView.getHolder();
        holder.getClass();
        holder.setFixedSize(i, i2);
        requestLayout();
    }

    public final void setSurfaceView(SurfaceView surfaceView) {
        surfaceView.getClass();
        this.surfaceView = surfaceView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.surfaceView = surfaceView;
        addView(surfaceView);
    }
}
