package com.king.zxing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ViewfinderView extends View {
    private static final int CURRENT_POINT_OPACITY = 160;
    private static final int MAX_RESULT_POINTS = 20;
    private static final int POINT_SIZE = 20;
    private int cornerColor;
    private int cornerRectHeight;
    private int cornerRectWidth;
    private Rect frame;
    private int frameColor;
    private int frameHeight;
    private int frameLineWidth;
    private float frameRatio;
    private int frameWidth;
    private int gridColumn;
    private int gridHeight;
    private boolean isShowResultPoint;
    private String labelText;
    private int labelTextColor;
    private TextLocation labelTextLocation;
    private float labelTextPadding;
    private float labelTextSize;
    private int laserColor;
    private LaserStyle laserStyle;
    private List<ResultPoint> lastPossibleResultPoints;
    private int maskColor;
    private Paint paint;
    private List<ResultPoint> possibleResultPoints;
    private int resultPointColor;
    private int scannerAnimationDelay;
    public int scannerEnd;
    private int scannerLineHeight;
    private int scannerLineMoveDistance;
    public int scannerStart;
    private int screenHeight;
    private int screenWidth;
    private TextPaint textPaint;

    public enum LaserStyle {
        NONE(0),
        LINE(1),
        GRID(2);

        private int mValue;

        LaserStyle(int i8) {
            this.mValue = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static LaserStyle getFromInt(int i8) {
            for (LaserStyle laserStyle : values()) {
                if (laserStyle.mValue == i8) {
                    return laserStyle;
                }
            }
            return LINE;
        }
    }

    public enum TextLocation {
        TOP(0),
        BOTTOM(1);

        private int mValue;

        TextLocation(int i8) {
            this.mValue = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static TextLocation getFromInt(int i8) {
            for (TextLocation textLocation : values()) {
                if (textLocation.mValue == i8) {
                    return textLocation;
                }
            }
            return TOP;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$king$zxing$ViewfinderView$LaserStyle;

        static {
            int[] iArr = new int[LaserStyle.values().length];
            $SwitchMap$com$king$zxing$ViewfinderView$LaserStyle = iArr;
            try {
                iArr[LaserStyle.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$king$zxing$ViewfinderView$LaserStyle[LaserStyle.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }

    private void drawCorner(Canvas canvas, Rect rect) {
        this.paint.setColor(this.cornerColor);
        canvas.drawRect(rect.left, rect.top, r0 + this.cornerRectWidth, r1 + this.cornerRectHeight, this.paint);
        canvas.drawRect(rect.left, rect.top, r0 + this.cornerRectHeight, r1 + this.cornerRectWidth, this.paint);
        int i8 = rect.right;
        canvas.drawRect(i8 - this.cornerRectWidth, rect.top, i8, r1 + this.cornerRectHeight, this.paint);
        int i9 = rect.right;
        canvas.drawRect(i9 - this.cornerRectHeight, rect.top, i9, r1 + this.cornerRectWidth, this.paint);
        canvas.drawRect(rect.left, r1 - this.cornerRectWidth, r0 + this.cornerRectHeight, rect.bottom, this.paint);
        canvas.drawRect(rect.left, r1 - this.cornerRectHeight, r0 + this.cornerRectWidth, rect.bottom, this.paint);
        int i10 = rect.right;
        canvas.drawRect(i10 - this.cornerRectWidth, r1 - this.cornerRectHeight, i10, rect.bottom, this.paint);
        int i11 = rect.right;
        canvas.drawRect(i11 - this.cornerRectHeight, r10 - this.cornerRectWidth, i11, rect.bottom, this.paint);
    }

    private void drawExterior(Canvas canvas, Rect rect, int i8, int i9) {
        this.paint.setColor(this.maskColor);
        float f8 = i8;
        canvas.drawRect(0.0f, 0.0f, f8, rect.top, this.paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom, this.paint);
        canvas.drawRect(rect.right, rect.top, f8, rect.bottom, this.paint);
        canvas.drawRect(0.0f, rect.bottom, f8, i9, this.paint);
    }

    private void drawFrame(Canvas canvas, Rect rect) {
        this.paint.setColor(this.frameColor);
        canvas.drawRect(rect.left, rect.top, rect.right, r0 + this.frameLineWidth, this.paint);
        canvas.drawRect(rect.left, rect.top, r0 + this.frameLineWidth, rect.bottom, this.paint);
        canvas.drawRect(r0 - this.frameLineWidth, rect.top, rect.right, rect.bottom, this.paint);
        canvas.drawRect(rect.left, r0 - this.frameLineWidth, rect.right, rect.bottom, this.paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[LOOP:1: B:16:0x0088->B:18:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8 A[EDGE_INSN: B:19:0x00a8->B:20:0x00a8 BREAK  A[LOOP:1: B:16:0x0088->B:18:0x008f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e A[LOOP:0: B:7:0x005a->B:9:0x005e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawGridScanner(Canvas canvas, Rect rect) {
        int i8;
        float width;
        int i9;
        int i10;
        int i11;
        float f8;
        int i12;
        this.paint.setStrokeWidth(2);
        int i13 = this.gridHeight;
        if (i13 > 0) {
            int i14 = this.scannerStart;
            if (i14 - rect.top > i13) {
                i8 = i14 - i13;
                float f9 = i8;
                this.paint.setShader(new LinearGradient(rect.left + (rect.width() / 2), f9, rect.left + (rect.width() / 2), this.scannerStart, new int[]{shadeColor(this.laserColor), this.laserColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                width = (rect.width() * 1.0f) / this.gridColumn;
                for (i9 = 1; i9 < this.gridColumn; i9++) {
                    int i15 = rect.left;
                    float f10 = i9 * width;
                    canvas.drawLine(i15 + f10, f9, i15 + f10, this.scannerStart, this.paint);
                }
                i10 = this.gridHeight;
                if (i10 > 0 || this.scannerStart - rect.top <= i10) {
                    i10 = this.scannerStart - rect.top;
                }
                i11 = 0;
                while (true) {
                    f8 = i11;
                    if (f8 <= i10 / width) {
                        break;
                    }
                    float f11 = rect.left;
                    int i16 = this.scannerStart;
                    float f12 = f8 * width;
                    canvas.drawLine(f11, i16 - f12, rect.right, i16 - f12, this.paint);
                    i11++;
                }
                i12 = this.scannerStart;
                if (i12 >= this.scannerEnd) {
                    this.scannerStart = i12 + this.scannerLineMoveDistance;
                    return;
                } else {
                    this.scannerStart = rect.top;
                    return;
                }
            }
        }
        i8 = rect.top;
        float f92 = i8;
        this.paint.setShader(new LinearGradient(rect.left + (rect.width() / 2), f92, rect.left + (rect.width() / 2), this.scannerStart, new int[]{shadeColor(this.laserColor), this.laserColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        width = (rect.width() * 1.0f) / this.gridColumn;
        while (i9 < this.gridColumn) {
        }
        i10 = this.gridHeight;
        if (i10 > 0) {
        }
        i10 = this.scannerStart - rect.top;
        i11 = 0;
        while (true) {
            f8 = i11;
            if (f8 <= i10 / width) {
            }
            float f112 = rect.left;
            int i162 = this.scannerStart;
            float f122 = f8 * width;
            canvas.drawLine(f112, i162 - f122, rect.right, i162 - f122, this.paint);
            i11++;
        }
        i12 = this.scannerStart;
        if (i12 >= this.scannerEnd) {
        }
    }

    private void drawLaserScanner(Canvas canvas, Rect rect) {
        if (this.laserStyle != null) {
            this.paint.setColor(this.laserColor);
            int i8 = a.$SwitchMap$com$king$zxing$ViewfinderView$LaserStyle[this.laserStyle.ordinal()];
            if (i8 == 1) {
                drawLineScanner(canvas, rect);
            } else if (i8 == 2) {
                drawGridScanner(canvas, rect);
            }
            this.paint.setShader(null);
        }
    }

    private void drawLineScanner(Canvas canvas, Rect rect) {
        int i8 = rect.left;
        this.paint.setShader(new LinearGradient(i8, this.scannerStart, i8, r2 + this.scannerLineHeight, shadeColor(this.laserColor), this.laserColor, Shader.TileMode.MIRROR));
        if (this.scannerStart > this.scannerEnd) {
            this.scannerStart = rect.top;
            return;
        }
        int i9 = rect.left;
        int i10 = this.scannerLineHeight;
        canvas.drawOval(new RectF(i9 + (i10 * 2), this.scannerStart, rect.right - (i10 * 2), r3 + i10), this.paint);
        this.scannerStart += this.scannerLineMoveDistance;
    }

    private void drawResultPoint(Canvas canvas, Rect rect) {
        if (this.isShowResultPoint) {
            List<ResultPoint> list = this.possibleResultPoints;
            List<ResultPoint> list2 = this.lastPossibleResultPoints;
            if (list.isEmpty()) {
                this.lastPossibleResultPoints = null;
            } else {
                this.possibleResultPoints = new ArrayList(5);
                this.lastPossibleResultPoints = list;
                this.paint.setAlpha(160);
                this.paint.setColor(this.resultPointColor);
                synchronized (list) {
                    try {
                        for (ResultPoint resultPoint : list) {
                            canvas.drawCircle(resultPoint.getX(), resultPoint.getY(), 10.0f, this.paint);
                        }
                    } finally {
                    }
                }
            }
            if (list2 != null) {
                this.paint.setAlpha(80);
                this.paint.setColor(this.resultPointColor);
                synchronized (list2) {
                    try {
                        for (ResultPoint resultPoint2 : list2) {
                            canvas.drawCircle(resultPoint2.getX(), resultPoint2.getY(), 10.0f, this.paint);
                        }
                    } finally {
                    }
                }
            }
        }
    }

    private void drawTextInfo(Canvas canvas, Rect rect) {
        if (TextUtils.isEmpty(this.labelText)) {
            return;
        }
        this.textPaint.setColor(this.labelTextColor);
        this.textPaint.setTextSize(this.labelTextSize);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        StaticLayout staticLayout = new StaticLayout(this.labelText, this.textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (this.labelTextLocation == TextLocation.BOTTOM) {
            canvas.translate(rect.left + (rect.width() / 2), rect.bottom + this.labelTextPadding);
            staticLayout.draw(canvas);
        } else {
            canvas.translate(rect.left + (rect.width() / 2), (rect.top - this.labelTextPadding) - staticLayout.getHeight());
            staticLayout.draw(canvas);
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewfinderView);
        this.maskColor = obtainStyledAttributes.getColor(R$styleable.ViewfinderView_maskColor, ContextCompat.getColor(context, R$color.viewfinder_mask));
        this.frameColor = obtainStyledAttributes.getColor(R$styleable.ViewfinderView_frameColor, ContextCompat.getColor(context, R$color.viewfinder_frame));
        this.cornerColor = obtainStyledAttributes.getColor(R$styleable.ViewfinderView_cornerColor, ContextCompat.getColor(context, R$color.viewfinder_corner));
        this.laserColor = obtainStyledAttributes.getColor(R$styleable.ViewfinderView_laserColor, ContextCompat.getColor(context, R$color.viewfinder_laser));
        this.resultPointColor = obtainStyledAttributes.getColor(R$styleable.ViewfinderView_resultPointColor, ContextCompat.getColor(context, R$color.viewfinder_result_point_color));
        this.labelText = obtainStyledAttributes.getString(R$styleable.ViewfinderView_labelText);
        this.labelTextColor = obtainStyledAttributes.getColor(R$styleable.ViewfinderView_labelTextColor, ContextCompat.getColor(context, R$color.viewfinder_text_color));
        this.labelTextSize = obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_labelTextSize, TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.labelTextPadding = obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_labelTextPadding, TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.labelTextLocation = TextLocation.getFromInt(obtainStyledAttributes.getInt(R$styleable.ViewfinderView_labelTextLocation, 0));
        this.isShowResultPoint = obtainStyledAttributes.getBoolean(R$styleable.ViewfinderView_showResultPoint, false);
        this.frameWidth = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ViewfinderView_frameWidth, 0);
        this.frameHeight = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ViewfinderView_frameHeight, 0);
        this.laserStyle = LaserStyle.getFromInt(obtainStyledAttributes.getInt(R$styleable.ViewfinderView_laserStyle, LaserStyle.LINE.mValue));
        this.gridColumn = obtainStyledAttributes.getInt(R$styleable.ViewfinderView_gridColumn, 20);
        this.gridHeight = (int) obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_gridHeight, TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.cornerRectWidth = (int) obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_cornerRectWidth, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        this.cornerRectHeight = (int) obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_cornerRectHeight, TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.scannerLineMoveDistance = (int) obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_scannerLineMoveDistance, TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.scannerLineHeight = (int) obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_scannerLineHeight, TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()));
        this.frameLineWidth = (int) obtainStyledAttributes.getDimension(R$styleable.ViewfinderView_frameLineWidth, TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.scannerAnimationDelay = obtainStyledAttributes.getInteger(R$styleable.ViewfinderView_scannerAnimationDelay, 15);
        this.frameRatio = obtainStyledAttributes.getFloat(R$styleable.ViewfinderView_frameRatio, 0.625f);
        obtainStyledAttributes.recycle();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.possibleResultPoints = new ArrayList(5);
        this.lastPossibleResultPoints = null;
        this.screenWidth = getDisplayMetrics().widthPixels;
        this.screenHeight = getDisplayMetrics().heightPixels;
        int min = (int) (Math.min(this.screenWidth, r4) * this.frameRatio);
        int i8 = this.frameWidth;
        if (i8 <= 0 || i8 > this.screenWidth) {
            this.frameWidth = min;
        }
        int i9 = this.frameHeight;
        if (i9 <= 0 || i9 > this.screenHeight) {
            this.frameHeight = min;
        }
    }

    public void addPossibleResultPoint(ResultPoint resultPoint) {
        if (this.isShowResultPoint) {
            List<ResultPoint> list = this.possibleResultPoints;
            synchronized (list) {
                try {
                    list.add(resultPoint);
                    int size = list.size();
                    if (size > 20) {
                        list.subList(0, size - 10).clear();
                    }
                } finally {
                }
            }
        }
    }

    public void drawViewfinder() {
        invalidate();
    }

    public boolean isShowResultPoint() {
        return this.isShowResultPoint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect = this.frame;
        if (rect == null) {
            return;
        }
        if (this.scannerStart == 0 || this.scannerEnd == 0) {
            this.scannerStart = rect.top;
            this.scannerEnd = rect.bottom - this.scannerLineHeight;
        }
        drawExterior(canvas, this.frame, canvas.getWidth(), canvas.getHeight());
        drawLaserScanner(canvas, this.frame);
        drawFrame(canvas, this.frame);
        drawCorner(canvas, this.frame);
        drawTextInfo(canvas, this.frame);
        drawResultPoint(canvas, this.frame);
        long j8 = this.scannerAnimationDelay;
        Rect rect2 = this.frame;
        postInvalidateDelayed(j8, rect2.left - 20, rect2.top - 20, rect2.right + 20, rect2.bottom + 20);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int paddingLeft = (((this.screenWidth - this.frameWidth) / 2) + getPaddingLeft()) - getPaddingRight();
        int paddingTop = (((this.screenHeight - this.frameHeight) / 2) + getPaddingTop()) - getPaddingBottom();
        this.frame = new Rect(paddingLeft, paddingTop, this.frameWidth + paddingLeft, this.frameHeight + paddingTop);
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelTextColor(@ColorInt int i8) {
        this.labelTextColor = i8;
    }

    public void setLabelTextColorResource(@ColorRes int i8) {
        this.labelTextColor = ContextCompat.getColor(getContext(), i8);
    }

    public void setLabelTextSize(float f8) {
        this.labelTextSize = f8;
    }

    public void setLaserStyle(LaserStyle laserStyle) {
        this.laserStyle = laserStyle;
    }

    public void setShowResultPoint(boolean z7) {
        this.isShowResultPoint = z7;
    }

    public int shadeColor(int i8) {
        return Integer.valueOf("01" + Integer.toHexString(i8).substring(2), 16).intValue();
    }

    public ViewfinderView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.scannerStart = 0;
        this.scannerEnd = 0;
        init(context, attributeSet);
    }
}
