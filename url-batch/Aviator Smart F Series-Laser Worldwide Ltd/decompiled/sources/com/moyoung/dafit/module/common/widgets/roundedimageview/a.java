package com.moyoung.dafit.module.common.widgets.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class a extends Drawable {
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final String TAG = "RoundedDrawable";
    private final Bitmap mBitmap;
    private final int mBitmapHeight;
    private final Paint mBitmapPaint;
    private final RectF mBitmapRect;
    private final int mBitmapWidth;
    private ColorStateList mBorderColor;
    private float mBorderCornerRadius;
    private final Paint mBorderPaint;
    private final RectF mBorderRect;
    private float mBorderWidth;
    private float mCornerRadius;
    private final boolean[] mCornersRounded;
    private boolean mOval;
    private boolean mRebuildShader;
    private ImageView.ScaleType mScaleType;
    private ColorStateList mSecondBorderColor;
    private final Paint mSecondBorderPaint;
    private final RectF mSecondBorderRect;
    private float mSecondBorderWidth;
    private final Matrix mShaderMatrix;
    private final RectF mSquareCornersRect;
    private Shader.TileMode mTileModeX;
    private Shader.TileMode mTileModeY;
    private final RectF mBounds = new RectF();
    private final RectF mDrawableRect = new RectF();

    /* renamed from: com.moyoung.dafit.module.common.widgets.roundedimageview.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0302a {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public a(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.mBitmapRect = rectF;
        Paint paint = new Paint();
        this.mBitmapPaint = paint;
        this.mBorderRect = new RectF();
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        this.mSecondBorderRect = new RectF();
        Paint paint3 = new Paint();
        this.mSecondBorderPaint = paint3;
        this.mShaderMatrix = new Matrix();
        this.mSquareCornersRect = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mTileModeX = tileMode;
        this.mTileModeY = tileMode;
        this.mRebuildShader = true;
        this.mCornerRadius = 0.0f;
        this.mBorderCornerRadius = 0.0f;
        this.mCornersRounded = new boolean[]{true, true, true, true};
        this.mOval = false;
        this.mBorderWidth = 0.0f;
        this.mSecondBorderWidth = 0.0f;
        this.mBorderColor = ColorStateList.valueOf(-16777216);
        this.mSecondBorderColor = ColorStateList.valueOf(-16777216);
        this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        this.mBitmap = bitmap;
        int width = bitmap.getWidth();
        this.mBitmapWidth = width;
        int height = bitmap.getHeight();
        this.mBitmapHeight = height;
        rectF.set(0.0f, 0.0f, width, height);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.mBorderColor.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.mBorderWidth);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setColor(this.mSecondBorderColor.getColorForState(getState(), -16777216));
        paint3.setStrokeWidth(this.mSecondBorderWidth);
    }

    private static boolean all(boolean[] zArr) {
        for (boolean z7 : zArr) {
            if (z7) {
                return false;
            }
        }
        return true;
    }

    private static boolean any(boolean[] zArr) {
        for (boolean z7 : zArr) {
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.w(TAG, "Failed to create bitmap from drawable!");
            return null;
        }
    }

    public static a fromBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            return new a(bitmap);
        }
        return null;
    }

    public static Drawable fromDrawable(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        if (drawable instanceof a) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap drawableToBitmap = drawableToBitmap(drawable);
            return drawableToBitmap != null ? new a(drawableToBitmap) : drawable;
        }
        Drawable.ConstantState constantState = drawable.mutate().getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i8 = 0; i8 < numberOfLayers; i8++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i8), fromDrawable(layerDrawable.getDrawable(i8)));
        }
        return layerDrawable;
    }

    private static boolean only(int i8, boolean[] zArr) {
        int length = zArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                return true;
            }
            if (zArr[i9] != (i9 == i8)) {
                return false;
            }
            i9++;
        }
    }

    private void redrawBitmapForSquareCorners(Canvas canvas) {
        if (all(this.mCornersRounded) || this.mCornerRadius == 0.0f) {
            return;
        }
        RectF rectF = this.mDrawableRect;
        float f8 = rectF.left;
        float f9 = rectF.top;
        float width = rectF.width() + f8;
        float height = this.mDrawableRect.height() + f9;
        float f10 = this.mCornerRadius;
        if (!this.mCornersRounded[0]) {
            this.mSquareCornersRect.set(f8, f9, f8 + f10, f9 + f10);
            canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
        }
        if (!this.mCornersRounded[1]) {
            this.mSquareCornersRect.set(width - f10, f9, width, f10);
            canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
        }
        if (!this.mCornersRounded[2]) {
            this.mSquareCornersRect.set(width - f10, height - f10, width, height);
            canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
        }
        if (this.mCornersRounded[3]) {
            return;
        }
        this.mSquareCornersRect.set(f8, height - f10, f10 + f8, height);
        canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
    }

    private void redrawBorderForSquareCorners(Canvas canvas) {
        float f8;
        if (all(this.mCornersRounded) || this.mCornerRadius == 0.0f) {
            return;
        }
        RectF rectF = this.mDrawableRect;
        float f9 = rectF.left;
        float f10 = rectF.top;
        float width = rectF.width() + f9;
        float height = f10 + this.mDrawableRect.height();
        float f11 = this.mCornerRadius;
        float f12 = this.mBorderWidth / 2.0f;
        if (!this.mCornersRounded[0]) {
            canvas.drawLine(f9 - f12, f10, f9 + f11, f10, this.mBorderPaint);
            canvas.drawLine(f9, f10 - f12, f9, f10 + f11, this.mBorderPaint);
        }
        if (!this.mCornersRounded[1]) {
            canvas.drawLine((width - f11) - f12, f10, width, f10, this.mBorderPaint);
            canvas.drawLine(width, f10 - f12, width, f10 + f11, this.mBorderPaint);
        }
        if (this.mCornersRounded[2]) {
            f8 = f11;
        } else {
            f8 = f11;
            canvas.drawLine((width - f11) - f12, height, width + f12, height, this.mBorderPaint);
            canvas.drawLine(width, height - f8, width, height, this.mBorderPaint);
        }
        if (this.mCornersRounded[3]) {
            return;
        }
        canvas.drawLine(f9 - f12, height, f9 + f8, height, this.mBorderPaint);
        canvas.drawLine(f9, height - f8, f9, height, this.mBorderPaint);
    }

    private void updateShaderMatrix() {
        float width;
        float height;
        int i8 = C0302a.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
        if (i8 == 1) {
            this.mBorderRect.set(this.mBounds);
            RectF rectF = this.mBorderRect;
            float f8 = this.mBorderWidth;
            rectF.inset(f8 / 2.0f, f8 / 2.0f);
            this.mShaderMatrix.reset();
            this.mShaderMatrix.setTranslate((int) (((this.mBorderRect.width() - this.mBitmapWidth) * 0.5f) + 0.5f), (int) (((this.mBorderRect.height() - this.mBitmapHeight) * 0.5f) + 0.5f));
        } else if (i8 == 2) {
            this.mBorderRect.set(this.mBounds);
            RectF rectF2 = this.mBorderRect;
            float f9 = this.mBorderWidth;
            rectF2.inset(f9 / 2.0f, f9 / 2.0f);
            this.mShaderMatrix.reset();
            float f10 = 0.0f;
            if (this.mBitmapWidth * this.mBorderRect.height() > this.mBorderRect.width() * this.mBitmapHeight) {
                width = this.mBorderRect.height() / this.mBitmapHeight;
                f10 = (this.mBorderRect.width() - (this.mBitmapWidth * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = this.mBorderRect.width() / this.mBitmapWidth;
                height = (this.mBorderRect.height() - (this.mBitmapHeight * width)) * 0.5f;
            }
            this.mShaderMatrix.setScale(width, width);
            Matrix matrix = this.mShaderMatrix;
            float f11 = this.mBorderWidth;
            matrix.postTranslate(((int) (f10 + 0.5f)) + (f11 / 2.0f), ((int) (height + 0.5f)) + (f11 / 2.0f));
        } else if (i8 == 3) {
            this.mShaderMatrix.reset();
            float min = (((float) this.mBitmapWidth) > this.mBounds.width() || ((float) this.mBitmapHeight) > this.mBounds.height()) ? Math.min(this.mBounds.width() / this.mBitmapWidth, this.mBounds.height() / this.mBitmapHeight) : 1.0f;
            float width2 = (int) (((this.mBounds.width() - (this.mBitmapWidth * min)) * 0.5f) + 0.5f);
            float height2 = (int) (((this.mBounds.height() - (this.mBitmapHeight * min)) * 0.5f) + 0.5f);
            this.mShaderMatrix.setScale(min, min);
            this.mShaderMatrix.postTranslate(width2, height2);
            this.mBorderRect.set(this.mBitmapRect);
            this.mShaderMatrix.mapRect(this.mBorderRect);
            RectF rectF3 = this.mBorderRect;
            float f12 = this.mBorderWidth;
            rectF3.inset(f12 / 2.0f, f12 / 2.0f);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        } else if (i8 == 5) {
            this.mBorderRect.set(this.mBitmapRect);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBounds, Matrix.ScaleToFit.END);
            this.mShaderMatrix.mapRect(this.mBorderRect);
            RectF rectF4 = this.mBorderRect;
            float f13 = this.mBorderWidth;
            rectF4.inset(f13 / 2.0f, f13 / 2.0f);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        } else if (i8 == 6) {
            this.mBorderRect.set(this.mBitmapRect);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBounds, Matrix.ScaleToFit.START);
            this.mShaderMatrix.mapRect(this.mBorderRect);
            RectF rectF5 = this.mBorderRect;
            float f14 = this.mBorderWidth;
            rectF5.inset(f14 / 2.0f, f14 / 2.0f);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        } else if (i8 != 7) {
            this.mBorderRect.set(this.mBitmapRect);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBounds, Matrix.ScaleToFit.CENTER);
            this.mShaderMatrix.mapRect(this.mBorderRect);
            RectF rectF6 = this.mBorderRect;
            float f15 = this.mBorderWidth;
            rectF6.inset(f15 / 2.0f, f15 / 2.0f);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        } else {
            this.mBorderRect.set(this.mBounds);
            RectF rectF7 = this.mBorderRect;
            float f16 = this.mBorderWidth;
            rectF7.inset(f16 / 2.0f, f16 / 2.0f);
            this.mShaderMatrix.reset();
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        }
        this.mSecondBorderRect.set(this.mBorderRect);
        float f17 = (this.mSecondBorderWidth - this.mBorderWidth) / 2.0f;
        this.mSecondBorderRect.inset(f17, f17);
        this.mDrawableRect.set(this.mBorderRect);
        this.mRebuildShader = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.mRebuildShader) {
            BitmapShader bitmapShader = new BitmapShader(this.mBitmap, this.mTileModeX, this.mTileModeY);
            Shader.TileMode tileMode = this.mTileModeX;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.mTileModeY == tileMode2) {
                bitmapShader.setLocalMatrix(this.mShaderMatrix);
            }
            this.mBitmapPaint.setShader(bitmapShader);
            this.mRebuildShader = false;
        }
        if (this.mOval) {
            if (this.mBorderWidth <= 0.0f) {
                canvas.drawOval(this.mDrawableRect, this.mBitmapPaint);
                return;
            }
            canvas.drawOval(this.mDrawableRect, this.mBitmapPaint);
            canvas.drawOval(this.mBorderRect, this.mBorderPaint);
            if (this.mSecondBorderWidth > 0.0f) {
                canvas.drawOval(this.mSecondBorderRect, this.mSecondBorderPaint);
                return;
            }
            return;
        }
        if (any(this.mCornersRounded)) {
            float f8 = this.mCornerRadius;
            if (this.mBorderWidth <= 0.0f) {
                canvas.drawRoundRect(this.mDrawableRect, f8, f8, this.mBitmapPaint);
                redrawBitmapForSquareCorners(canvas);
                return;
            }
            canvas.drawRoundRect(this.mDrawableRect, f8, f8, this.mBitmapPaint);
            canvas.drawRoundRect(this.mBorderRect, f8, f8, this.mBorderPaint);
            redrawBitmapForSquareCorners(canvas);
            redrawBorderForSquareCorners(canvas);
            if (this.mSecondBorderWidth > 0.0f) {
                canvas.drawRoundRect(this.mSecondBorderRect, f8, f8, this.mSecondBorderPaint);
                return;
            }
            return;
        }
        canvas.drawRect(this.mDrawableRect, this.mBitmapPaint);
        if (this.mBorderWidth > 0.0f) {
            float f9 = this.mSecondBorderWidth / 2.0f;
            RectF rectF = new RectF(this.mBorderRect);
            if (f9 > 0.0f) {
                rectF.inset(f9, f9);
                this.mBorderPaint.setStrokeWidth(this.mBorderWidth - this.mSecondBorderWidth);
            }
            canvas.drawRect(rectF, this.mBorderPaint);
        }
        if (this.mSecondBorderWidth > 0.0f) {
            RectF rectF2 = this.mSecondBorderRect;
            float f10 = this.mBorderCornerRadius;
            canvas.drawRoundRect(rectF2, f10, f10, this.mSecondBorderPaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mBitmapPaint.getAlpha();
    }

    public int getBorderColor() {
        return this.mBorderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.mBorderColor;
    }

    public float getBorderWidth() {
        return this.mBorderWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mBitmapPaint.getColorFilter();
    }

    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mBitmapHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mBitmapWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public int getSecondBorderColor() {
        return this.mSecondBorderColor.getDefaultColor();
    }

    public ColorStateList getSecondBorderColors() {
        return this.mSecondBorderColor;
    }

    public float getSecondBorderWidth() {
        return this.mSecondBorderWidth;
    }

    public Bitmap getSourceBitmap() {
        return this.mBitmap;
    }

    public Shader.TileMode getTileModeX() {
        return this.mTileModeX;
    }

    public Shader.TileMode getTileModeY() {
        return this.mTileModeY;
    }

    public boolean isOval() {
        return this.mOval;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.mBorderColor.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.mBounds.set(rect);
        updateShaderMatrix();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.mBorderColor.getColorForState(iArr, 0);
        if (this.mBorderPaint.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.mBorderPaint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.mBitmapPaint.setAlpha(i8);
        invalidateSelf();
    }

    public a setBorderColor(@ColorInt int i8) {
        return setBorderColor(ColorStateList.valueOf(i8));
    }

    public a setBorderCornerRadius(float f8) {
        setBorderCornerRadius(f8, f8, f8, f8);
        return this;
    }

    public a setBorderWidth(float f8) {
        this.mBorderWidth = f8;
        this.mBorderPaint.setStrokeWidth(f8);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mBitmapPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public a setCornerRadius(float f8) {
        setCornerRadius(f8, f8, f8, f8);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z7) {
        this.mBitmapPaint.setDither(z7);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z7) {
        this.mBitmapPaint.setFilterBitmap(z7);
        invalidateSelf();
    }

    public a setOval(boolean z7) {
        this.mOval = z7;
        return this;
    }

    public a setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.mScaleType != scaleType) {
            this.mScaleType = scaleType;
            updateShaderMatrix();
        }
        return this;
    }

    public a setSecondBorderColor(@ColorInt int i8) {
        return setSecondBorderColor(ColorStateList.valueOf(i8));
    }

    public a setSecondBorderWidth(float f8) {
        this.mSecondBorderWidth = f8;
        this.mSecondBorderPaint.setStrokeWidth(f8);
        return this;
    }

    public a setTileModeX(Shader.TileMode tileMode) {
        if (this.mTileModeX != tileMode) {
            this.mTileModeX = tileMode;
            this.mRebuildShader = true;
            invalidateSelf();
        }
        return this;
    }

    public a setTileModeY(Shader.TileMode tileMode) {
        if (this.mTileModeY != tileMode) {
            this.mTileModeY = tileMode;
            this.mRebuildShader = true;
            invalidateSelf();
        }
        return this;
    }

    public Bitmap toBitmap() {
        return drawableToBitmap(this);
    }

    public float getCornerRadius(int i8) {
        if (this.mCornersRounded[i8]) {
            return this.mCornerRadius;
        }
        return 0.0f;
    }

    public a setBorderColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.mBorderColor = colorStateList;
        this.mBorderPaint.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public a setBorderCornerRadius(float f8, float f9, float f10, float f11) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f8));
        hashSet.add(Float.valueOf(f9));
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.mBorderCornerRadius = 0.0f;
        } else {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + floatValue);
            }
            this.mBorderCornerRadius = floatValue;
        }
        return this;
    }

    public a setCornerRadius(int i8, float f8) {
        if (f8 != 0.0f) {
            float f9 = this.mCornerRadius;
            if (f9 != 0.0f && f9 != f8) {
                throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
            }
        }
        if (f8 == 0.0f) {
            if (only(i8, this.mCornersRounded)) {
                this.mCornerRadius = 0.0f;
            }
            this.mCornersRounded[i8] = false;
        } else {
            if (this.mCornerRadius == 0.0f) {
                this.mCornerRadius = f8;
            }
            this.mCornersRounded[i8] = true;
        }
        return this;
    }

    public a setSecondBorderColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.mSecondBorderColor = colorStateList;
        this.mSecondBorderPaint.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public a setCornerRadius(float f8, float f9, float f10, float f11) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f8));
        hashSet.add(Float.valueOf(f9));
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (hashSet.isEmpty()) {
                this.mCornerRadius = 0.0f;
            } else {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                    throw new IllegalArgumentException("Invalid radius value: " + floatValue);
                }
                this.mCornerRadius = floatValue;
            }
            boolean[] zArr = this.mCornersRounded;
            zArr[0] = f8 > 0.0f;
            zArr[1] = f9 > 0.0f;
            zArr[2] = f10 > 0.0f;
            zArr[3] = f11 > 0.0f;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }
}
