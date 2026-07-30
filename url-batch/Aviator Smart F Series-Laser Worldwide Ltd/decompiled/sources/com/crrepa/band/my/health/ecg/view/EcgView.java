package com.crrepa.band.my.health.ecg.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.crrepa.band.my.R$styleable;
import com.moyoung.dafit.module.common.utils.o;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class EcgView extends View {
    private boolean drawAllData;
    private boolean drawGird;
    private int[] ecgData;
    private int ecgLineColor;
    private int ecgViewBackgrpund;
    private float gapXOffset;
    private float gapYOffset;
    private com.crrepa.band.my.health.ecg.view.a girdBackGroundHelper;
    private float offsetXMax;
    private Paint paint;
    private Path path;
    private int perGridCount;
    private int perGridUvValue;
    private a slideChangeListener;
    private float startX;
    private boolean supportTooch;
    private float xChanged;
    private int xStart;
    private float yCenter;

    public interface a {
        void onSlideChange(int i8);
    }

    public EcgView(Context context) {
        this(context, null);
    }

    private void drawEcgWave(Canvas canvas) {
        this.girdBackGroundHelper.drawDirdBackGround(canvas, getWidth(), getHeight(), this.drawGird, this.ecgViewBackgrpund);
        if (this.ecgData == null) {
            return;
        }
        this.path.reset();
        float f8 = this.xChanged;
        int i8 = this.xStart;
        if (f8 > i8) {
            this.xChanged = i8;
        } else {
            float f9 = this.offsetXMax;
            if (f8 < f9) {
                this.xChanged = f9;
            }
        }
        int i9 = 1;
        int i10 = 1;
        while (true) {
            int[] iArr = this.ecgData;
            if (i10 >= iArr.length) {
                break;
            }
            float f10 = this.xStart + (this.gapXOffset * i10) + this.xChanged;
            if (f10 >= 0.0f) {
                this.path.moveTo(f10, getYCoordinate(iArr[i10]));
                i9 = i10;
                break;
            }
            i10++;
        }
        while (i9 < this.ecgData.length) {
            float f11 = i9;
            float f12 = this.xStart + (this.gapXOffset * f11) + this.xChanged;
            if (0.0f <= f12) {
                float width = getWidth();
                float f13 = this.gapXOffset;
                if (f12 < width + f13) {
                    this.path.lineTo(this.xStart + (f13 * f11) + this.xChanged, getYCoordinate(this.ecgData[i9]));
                }
            }
            if (getWidth() + this.gapXOffset < f12) {
                break;
            } else {
                i9++;
            }
        }
        canvas.drawPath(this.path, this.paint);
    }

    private float getYCoordinate(int i8) {
        return this.yCenter - (i8 * this.gapYOffset);
    }

    private void initAttributes(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R$styleable.ecgView, 0, 0);
        this.ecgViewBackgrpund = obtainStyledAttributes.getColor(0, -1);
        this.ecgLineColor = obtainStyledAttributes.getColor(1, -16777216);
    }

    private void initPathPaint() {
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(this.ecgLineColor);
        this.paint.setAntiAlias(true);
        this.paint.setStrokeWidth(o.dp2px(getContext(), 1.5f));
    }

    private void layout() {
        this.xStart = 0;
        this.yCenter = getHeight() / 2;
        if (this.drawAllData) {
            f.d("width: " + getWidth());
            this.gapXOffset = ((float) getWidth()) / ((float) this.ecgData.length);
        } else {
            this.gapXOffset = b.getTimeOffset(getHeight(), this.perGridCount);
        }
        f.d("gridHeightValue1: " + this.perGridUvValue);
        this.gapYOffset = b.getVoltageOffset(getHeight(), this.perGridUvValue);
        this.xChanged = 0.0f;
        if (this.ecgData != null) {
            this.offsetXMax = getWidth() - (this.gapXOffset * this.ecgData.length);
        }
    }

    private void onSlideChange(float f8) {
        a aVar = this.slideChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.onSlideChange((int) (f8 / this.gapXOffset));
    }

    public int getLeftEcgCount(int i8) {
        return (int) (i8 / this.gapXOffset);
    }

    public int getLeftSlidePx(int i8) {
        return (int) (this.gapXOffset * i8);
    }

    public int getPerGridCount() {
        return this.perGridCount;
    }

    public int getPerGridUvValue() {
        return this.perGridUvValue;
    }

    public int getScreenDisplayCount() {
        return (int) (getWidth() / this.gapXOffset);
    }

    public boolean isDrawAllData() {
        return this.drawAllData;
    }

    public boolean isDrawGird() {
        return this.drawGird;
    }

    public boolean isSupportTooch() {
        return this.supportTooch;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawEcgWave(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        layout();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.supportTooch) {
            return super.onTouchEvent(motionEvent);
        }
        float x7 = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startX = x7;
            return true;
        }
        if (action != 2) {
            return true;
        }
        this.xChanged += x7 - this.startX;
        this.startX = x7;
        invalidate();
        onSlideChange(this.xChanged);
        return true;
    }

    public void setData(int[] iArr) {
        this.ecgData = iArr;
        layout();
        invalidate();
    }

    public void setDrawAllData(boolean z7) {
        this.drawAllData = z7;
    }

    public void setDrawGird(boolean z7) {
        this.drawGird = z7;
    }

    public void setLeftEcgCount(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.xChanged = (-i8) * this.gapXOffset;
        invalidate();
    }

    public void setPerGridCount(int i8) {
        this.perGridCount = i8;
    }

    public void setPerGridUvValue(int i8) {
        this.perGridUvValue = i8;
    }

    public void setSlideChangeListener(a aVar) {
        this.slideChangeListener = aVar;
    }

    public void setSupportTooch(boolean z7) {
        this.supportTooch = z7;
    }

    public EcgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EcgView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.perGridUvValue = b.getDefaultPerGridUvValue();
        this.paint = new Paint();
        this.path = new Path();
        this.supportTooch = false;
        this.drawGird = true;
        this.drawAllData = false;
        this.perGridCount = 5;
        this.girdBackGroundHelper = new com.crrepa.band.my.health.ecg.view.a(context);
        initAttributes(attributeSet);
        initPathPaint();
    }
}
