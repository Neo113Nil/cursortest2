package net.gree.unitywebview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public class RoundedWebView extends WebView {
    private Context context;
    private int dpRadius;
    private int height;
    private int radius;
    private int width;

    public RoundedWebView(Context context, int i4) {
        super(context);
        this.dpRadius = i4;
        initialize(context);
    }

    private Paint createPorterDuffClearPaint() {
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        return paint;
    }

    private float dpToPx(Context context, int i4) {
        return TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
    }

    private void initialize(Context context) {
        this.context = context;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        RectF rectF = new RectF(0.0f, getScrollY(), this.width, getScrollY() + this.height);
        int i4 = this.radius;
        path.addRoundRect(rectF, i4, i4, Path.Direction.CW);
        canvas.drawPath(path, createPorterDuffClearPaint());
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.width = i4;
        this.height = i5;
        this.radius = (int) dpToPx(this.context, this.dpRadius);
    }

    public RoundedWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        this.dpRadius = i4;
        initialize(context);
    }

    public RoundedWebView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4);
        this.dpRadius = i5;
        initialize(context);
    }
}
