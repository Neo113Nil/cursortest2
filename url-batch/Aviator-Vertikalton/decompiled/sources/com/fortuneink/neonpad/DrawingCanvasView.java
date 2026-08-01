package com.fortuneink.neonpad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class DrawingCanvasView extends View {
    private final Paint bgPaint;
    private int currentColor;
    private Path currentPath;
    private float currentWidth;
    private float lastX;
    private float lastY;
    private final Paint strokePaint;
    private final List<Stroke> strokes;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DrawingCanvasView(Context context) {
        this(context, null, 0, 6, null);
        X0.f.e(context, "context");
    }

    private final void drawStrokes(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
        for (Stroke stroke : this.strokes) {
            this.strokePaint.setColor(stroke.getColor());
            this.strokePaint.setStrokeWidth(stroke.getWidth());
            canvas.drawPath(stroke.getPath(), this.strokePaint);
        }
        Path path = this.currentPath;
        if (path != null) {
            this.strokePaint.setColor(this.currentColor);
            this.strokePaint.setStrokeWidth(this.currentWidth);
            canvas.drawPath(path, this.strokePaint);
        }
    }

    public final void clearCanvas() {
        this.strokes.clear();
        this.currentPath = null;
        invalidate();
    }

    public final boolean hasContent() {
        return !this.strokes.isEmpty();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        X0.f.e(canvas, "canvas");
        drawStrokes(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        X0.f.e(motionEvent, "event");
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            Path path = new Path();
            path.moveTo(x2, y2);
            this.currentPath = path;
            this.lastX = x2;
            this.lastY = y2;
            return true;
        }
        if (action == 1) {
            Path path2 = this.currentPath;
            if (path2 != null) {
                path2.lineTo(x2, y2);
                this.strokes.add(new Stroke(this.currentColor, this.currentWidth, path2));
            }
            this.currentPath = null;
            invalidate();
            return true;
        }
        if (action != 2) {
            return super.onTouchEvent(motionEvent);
        }
        Path path3 = this.currentPath;
        if (path3 != null) {
            float f2 = this.lastX;
            float f3 = this.lastY;
            path3.quadTo(f2, f3, (x2 + f2) / 2.0f, (y2 + f3) / 2.0f);
        }
        this.lastX = x2;
        this.lastY = y2;
        invalidate();
        return true;
    }

    public final Bitmap renderToBitmap() {
        int width = getWidth();
        if (width < 1) {
            width = 1;
        }
        int height = getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height >= 1 ? height : 1, Bitmap.Config.ARGB_8888);
        X0.f.d(createBitmap, "createBitmap(...)");
        drawStrokes(new Canvas(createBitmap));
        return createBitmap;
    }

    public final void setStrokeColor(int i) {
        this.currentColor = i;
    }

    public final void setStrokeWidth(float f2) {
        this.currentWidth = f2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DrawingCanvasView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        X0.f.e(context, "context");
    }

    public /* synthetic */ DrawingCanvasView(Context context, AttributeSet attributeSet, int i, int i2, X0.c cVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawingCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        X0.f.e(context, "context");
        this.strokes = new ArrayList();
        this.currentColor = A.b.a(context, R.color.neon_cyan);
        this.currentWidth = 8.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.strokePaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(A.b.a(context, R.color.surface_dark));
        paint2.setStyle(Paint.Style.FILL);
        this.bgPaint = paint2;
    }
}
