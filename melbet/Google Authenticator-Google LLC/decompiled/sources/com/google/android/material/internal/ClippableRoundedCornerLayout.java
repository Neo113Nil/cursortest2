package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    public Path a;
    public float[] b;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
        this.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final void a(float f, float f2, float f3, float f4, float[] fArr) {
        RectF rectF = new RectF(f, f2, f3, f4);
        Path path = this.a;
        if (path == null) {
            path = new Path();
            this.a = path;
        }
        this.b = fArr;
        path.reset();
        this.a.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.a.close();
        invalidate();
    }

    public final void b(float[] fArr) {
        a(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        if (this.a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
