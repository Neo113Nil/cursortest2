package com.withpersona.sdk2.inquiry.steps.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;

/* loaded from: classes4.dex */
public final class SignatureView extends MaterialCardView {
    public final Paint bitmapPaint;
    public final Path drawPath;
    public final Paint paint;
    public float penX;
    public float penY;
    public Bitmap signatureBitmap;
    public Canvas signatureCanvas;
    public RectF signatureRectF;

    public SignatureView(Context context) {
        super(context);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        init$2();
    }

    public final void clearCanvas() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        this.drawPath.reset();
        this.signatureRectF = new RectF();
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }

    public final void init$2() {
        Paint paint = this.paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.drawColor(0);
        Bitmap bitmap = this.signatureBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, this.bitmapPaint);
        }
        canvas.save();
        Paint paint = new Paint();
        paint.setColor(-3355444);
        paint.setStrokeWidth(4.0f);
        float dpToPx = (float) ExtensionsKt.getDpToPx(24.0d);
        float dpToPx2 = (float) ExtensionsKt.getDpToPx(20.0d);
        canvas.drawLine(dpToPx2, canvas.getHeight() - dpToPx, canvas.getWidth() - dpToPx2, canvas.getHeight() - dpToPx, paint);
        canvas.restore();
        canvas.drawPath(this.drawPath, this.paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.signatureBitmap = createBitmap;
        createBitmap.getClass();
        this.signatureCanvas = new Canvas(createBitmap);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        super.onTouchEvent(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        Path path = this.drawPath;
        if (action == 0) {
            path.reset();
            path.moveTo(x, y);
            this.penX = x;
            this.penY = y;
            invalidate();
        } else if (action == 1) {
            Canvas canvas = this.signatureCanvas;
            if (canvas != null) {
                boolean isEmpty = path.isEmpty();
                float f = this.penX;
                Paint paint = this.paint;
                if (isEmpty) {
                    path.moveTo(f - 0.5f, this.penY - 0.5f);
                    path.lineTo(this.penX, this.penY);
                    canvas.drawPoint(this.penX, this.penY, paint);
                } else {
                    path.lineTo(f, this.penY);
                    canvas.drawPath(path, paint);
                }
                updateSignatureRectF();
                path.reset();
            }
            invalidate();
        } else if (action == 2) {
            path.lineTo(x, y);
            this.penX = x;
            this.penY = y;
            invalidate();
        }
        return true;
    }

    public final void updateSignatureRectF() {
        RectF rectF = new RectF();
        Path path = this.drawPath;
        path.computeBounds(rectF, true);
        if (!path.isEmpty()) {
            Paint paint = this.paint;
            rectF.inset((-paint.getStrokeWidth()) / 2.0f, (-paint.getStrokeWidth()) / 2.0f);
        }
        rectF.sort();
        this.signatureRectF.union(rectF);
        this.signatureRectF.sort();
    }

    public SignatureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        init$2();
    }

    public SignatureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        init$2();
    }
}
