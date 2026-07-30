package com.moyoung.dafit.module.common.widgets.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.moyoung.dafit.module.common.R$styleable;

/* loaded from: classes4.dex */
public class RoundedImageView extends AppCompatImageView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    public static final float DEFAULT_RADIUS = 0.0f;
    public static final Shader.TileMode DEFAULT_TILE_MODE = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] SCALE_TYPES = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public static final String TAG = "RoundedImageView";
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;
    private static final int TILE_MODE_UNDEFINED = -2;
    private Drawable mBackgroundDrawable;
    private int mBackgroundResource;
    private ColorStateList mBorderColor;
    private final float[] mBorderCornerRadii;
    private float mBorderWidth;
    private ColorFilter mColorFilter;
    private boolean mColorMod;
    private final float[] mCornerRadii;
    private Drawable mDrawable;
    private boolean mHasColorFilter;
    private boolean mIsOval;
    private boolean mMutateBackground;
    private int mResource;
    private ImageView.ScaleType mScaleType;
    private ColorStateList mSecondBorderColor;
    private float mSecondBorderWidth;
    private Shader.TileMode mTileModeX;
    private Shader.TileMode mTileModeY;

    static /* synthetic */ class a {
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
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.mCornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.mBorderCornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.mBorderColor = ColorStateList.valueOf(-16777216);
        this.mBorderWidth = 0.0f;
        this.mSecondBorderColor = ColorStateList.valueOf(-16777216);
        this.mSecondBorderWidth = 0.0f;
        this.mColorFilter = null;
        this.mColorMod = false;
        this.mHasColorFilter = false;
        this.mIsOval = false;
        this.mMutateBackground = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.mTileModeX = tileMode;
        this.mTileModeY = tileMode;
    }

    private void applyColorMod() {
        Drawable drawable = this.mDrawable;
        if (drawable == null || !this.mColorMod) {
            return;
        }
        Drawable mutate = drawable.mutate();
        this.mDrawable = mutate;
        if (this.mHasColorFilter) {
            mutate.setColorFilter(this.mColorFilter);
        }
    }

    private static Shader.TileMode parseTileMode(int i8) {
        if (i8 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i8 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i8 != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    private Drawable resolveBackgroundResource() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i8 = this.mBackgroundResource;
        if (i8 != 0) {
            try {
                drawable = resources.getDrawable(i8);
            } catch (Exception e8) {
                Log.w(TAG, "Unable to find resource: " + this.mBackgroundResource, e8);
                this.mBackgroundResource = 0;
            }
        }
        return com.moyoung.dafit.module.common.widgets.roundedimageview.a.fromDrawable(drawable);
    }

    private Drawable resolveResource() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i8 = this.mResource;
        if (i8 != 0) {
            try {
                drawable = resources.getDrawable(i8);
            } catch (Exception e8) {
                Log.w(TAG, "Unable to find resource: " + this.mResource, e8);
                this.mResource = 0;
            }
        }
        return com.moyoung.dafit.module.common.widgets.roundedimageview.a.fromDrawable(drawable);
    }

    private void updateAttrs(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof com.moyoung.dafit.module.common.widgets.roundedimageview.a) {
            com.moyoung.dafit.module.common.widgets.roundedimageview.a aVar = (com.moyoung.dafit.module.common.widgets.roundedimageview.a) drawable;
            aVar.setScaleType(scaleType).setBorderWidth(this.mBorderWidth).setBorderColor(this.mBorderColor).setSecondBorderColor(this.mSecondBorderColor).setSecondBorderWidth(this.mSecondBorderWidth).setBorderCornerRadius(this.mBorderCornerRadii[0]).setOval(this.mIsOval).setTileModeX(this.mTileModeX).setTileModeY(this.mTileModeY);
            float[] fArr = this.mCornerRadii;
            if (fArr != null) {
                aVar.setCornerRadius(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            applyColorMod();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i8 = 0; i8 < numberOfLayers; i8++) {
                updateAttrs(layerDrawable.getDrawable(i8), scaleType);
            }
        }
    }

    private void updateBackgroundDrawableAttrs(boolean z7) {
        if (this.mMutateBackground) {
            if (z7) {
                this.mBackgroundDrawable = com.moyoung.dafit.module.common.widgets.roundedimageview.a.fromDrawable(this.mBackgroundDrawable);
            }
            updateAttrs(this.mBackgroundDrawable, ImageView.ScaleType.FIT_XY);
        }
    }

    private void updateDrawableAttrs() {
        updateAttrs(this.mDrawable, this.mScaleType);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @ColorInt
    public int getBorderColor() {
        return this.mBorderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.mBorderColor;
    }

    public float getBorderWidth() {
        return this.mBorderWidth;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f8 = 0.0f;
        for (float f9 : this.mCornerRadii) {
            f8 = Math.max(f9, f8);
        }
        return f8;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    @ColorInt
    public int getSecondBorderColor() {
        return this.mSecondBorderColor.getDefaultColor();
    }

    public float getSecondBorderWidth() {
        return this.mSecondBorderWidth;
    }

    public Shader.TileMode getTileModeX() {
        return this.mTileModeX;
    }

    public Shader.TileMode getTileModeY() {
        return this.mTileModeY;
    }

    public boolean isOval() {
        return this.mIsOval;
    }

    public void mutateBackground(boolean z7) {
        if (this.mMutateBackground == z7) {
            return;
        }
        this.mMutateBackground = z7;
        updateBackgroundDrawableAttrs(true);
        invalidate();
    }

    public boolean mutatesBackground() {
        return this.mMutateBackground;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        ColorDrawable colorDrawable = new ColorDrawable(i8);
        this.mBackgroundDrawable = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.mBackgroundDrawable = drawable;
        updateBackgroundDrawableAttrs(true);
        super.setBackgroundDrawable(this.mBackgroundDrawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(@DrawableRes int i8) {
        if (this.mBackgroundResource != i8) {
            this.mBackgroundResource = i8;
            Drawable resolveBackgroundResource = resolveBackgroundResource();
            this.mBackgroundDrawable = resolveBackgroundResource;
            setBackgroundDrawable(resolveBackgroundResource);
        }
    }

    public void setBorderColor(@ColorInt int i8) {
        setBorderColor(ColorStateList.valueOf(i8));
    }

    public void setBorderCornerRadius(float f8) {
        setBorderCornerRadius(f8, f8, f8, f8);
    }

    public void setBorderWidth(@DimenRes int i8) {
        setBorderWidth(getResources().getDimension(i8));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mColorFilter != colorFilter) {
            this.mColorFilter = colorFilter;
            this.mHasColorFilter = true;
            this.mColorMod = true;
            applyColorMod();
            invalidate();
        }
    }

    public void setCornerRadius(float f8) {
        setCornerRadius(f8, f8, f8, f8);
    }

    public void setCornerRadiusDimen(@DimenRes int i8) {
        float dimension = getResources().getDimension(i8);
        setCornerRadius(dimension, dimension, dimension, dimension);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.mResource = 0;
        this.mDrawable = com.moyoung.dafit.module.common.widgets.roundedimageview.a.fromBitmap(bitmap);
        updateDrawableAttrs();
        super.setImageDrawable(this.mDrawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.mResource = 0;
        this.mDrawable = com.moyoung.dafit.module.common.widgets.roundedimageview.a.fromDrawable(drawable);
        updateDrawableAttrs();
        super.setImageDrawable(this.mDrawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i8) {
        if (this.mResource != i8) {
            this.mResource = i8;
            this.mDrawable = resolveResource();
            updateDrawableAttrs();
            super.setImageDrawable(this.mDrawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z7) {
        this.mIsOval = z7;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.mScaleType != scaleType) {
            this.mScaleType = scaleType;
            switch (a.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs(false);
            invalidate();
        }
    }

    public void setSecondBorderColor(@ColorInt int i8) {
        setSecondBorderColor(ColorStateList.valueOf(i8));
    }

    public void setSecondBorderWidth(@DimenRes int i8) {
        setSecondBorderWidth(getResources().getDimension(i8));
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.mTileModeX == tileMode) {
            return;
        }
        this.mTileModeX = tileMode;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.mTileModeY == tileMode) {
            return;
        }
        this.mTileModeY = tileMode;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public float getCornerRadius(int i8) {
        return this.mCornerRadii[i8];
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.mBorderColor.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.mBorderColor = colorStateList;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        if (this.mBorderWidth > 0.0f) {
            invalidate();
        }
    }

    public void setBorderCornerRadius(float f8, float f9, float f10, float f11) {
        float[] fArr = this.mBorderCornerRadii;
        if (fArr[0] == f8 && fArr[1] == f9 && fArr[2] == f11 && fArr[3] == f10) {
            return;
        }
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[3] = f10;
        fArr[2] = f11;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setBorderWidth(float f8) {
        if (this.mBorderWidth == f8) {
            return;
        }
        this.mBorderWidth = f8;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setCornerRadius(int i8, float f8) {
        float[] fArr = this.mCornerRadii;
        if (fArr[i8] == f8) {
            return;
        }
        fArr[i8] = f8;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setSecondBorderColor(ColorStateList colorStateList) {
        if (this.mSecondBorderColor.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.mSecondBorderColor = colorStateList;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        if (this.mSecondBorderWidth > 0.0f) {
            invalidate();
        }
    }

    public void setSecondBorderWidth(float f8) {
        if (this.mSecondBorderWidth == f8) {
            return;
        }
        this.mSecondBorderWidth = f8;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setCornerRadiusDimen(int i8, @DimenRes int i9) {
        setCornerRadius(i8, getResources().getDimensionPixelSize(i9));
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.mCornerRadii = fArr;
        this.mBorderCornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.mBorderColor = ColorStateList.valueOf(-16777216);
        this.mBorderWidth = 0.0f;
        this.mSecondBorderColor = ColorStateList.valueOf(-16777216);
        this.mSecondBorderWidth = 0.0f;
        this.mColorFilter = null;
        this.mColorMod = false;
        this.mHasColorFilter = false;
        this.mIsOval = false;
        this.mMutateBackground = false;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.mTileModeX = tileMode;
        this.mTileModeY = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RoundedImageView, i8, 0);
        int i9 = obtainStyledAttributes.getInt(R$styleable.RoundedImageView_android_scaleType, -1);
        if (i9 >= 0) {
            setScaleType(SCALE_TYPES[i9]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius, -1);
        fArr[0] = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[1] = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[2] = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[3] = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = fArr.length;
        boolean z7 = false;
        for (int i10 = 0; i10 < length; i10++) {
            float[] fArr2 = this.mCornerRadii;
            if (fArr2[i10] < 0.0f) {
                fArr2[i10] = 0.0f;
            } else {
                z7 = true;
            }
        }
        if (!z7) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.mCornerRadii.length;
            for (int i11 = 0; i11 < length2; i11++) {
                this.mCornerRadii[i11] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RoundedImageView_riv_border_width, -1);
        this.mBorderWidth = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.mBorderWidth = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R$styleable.RoundedImageView_riv_border_color);
        this.mBorderColor = colorStateList;
        if (colorStateList == null) {
            this.mBorderColor = ColorStateList.valueOf(-16777216);
        }
        this.mMutateBackground = obtainStyledAttributes.getBoolean(R$styleable.RoundedImageView_riv_mutate_background, false);
        this.mIsOval = obtainStyledAttributes.getBoolean(R$styleable.RoundedImageView_riv_oval, false);
        int i12 = obtainStyledAttributes.getInt(R$styleable.RoundedImageView_riv_tile_mode, -2);
        if (i12 != -2) {
            setTileModeX(parseTileMode(i12));
            setTileModeY(parseTileMode(i12));
        }
        int i13 = obtainStyledAttributes.getInt(R$styleable.RoundedImageView_riv_tile_mode_x, -2);
        if (i13 != -2) {
            setTileModeX(parseTileMode(i13));
        }
        int i14 = obtainStyledAttributes.getInt(R$styleable.RoundedImageView_riv_tile_mode_y, -2);
        if (i14 != -2) {
            setTileModeY(parseTileMode(i14));
        }
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(true);
        if (this.mMutateBackground) {
            super.setBackgroundDrawable(this.mBackgroundDrawable);
        }
        setLayerType(1, null);
        obtainStyledAttributes.recycle();
    }

    public void setCornerRadius(float f8, float f9, float f10, float f11) {
        float[] fArr = this.mCornerRadii;
        if (fArr[0] == f8 && fArr[1] == f9 && fArr[2] == f11 && fArr[3] == f10) {
            return;
        }
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[3] = f10;
        fArr[2] = f11;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }
}
