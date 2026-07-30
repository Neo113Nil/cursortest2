package com.moyoung.dafit.module.common.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import com.moyoung.dafit.module.common.R$color;
import com.moyoung.dafit.module.common.R$styleable;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public class ShadowLayout extends FrameLayout {
    private boolean bottomShow;
    private final HashMap<a, Bitmap> cache;
    private float cornerRadius;
    private boolean leftShow;
    private float mDx;
    private float mDy;
    private boolean mForceInvalidateShadow;
    private boolean mInvalidateShadowOnSizeChanged;
    private boolean rightShow;
    private int shadowColor;
    private float shadowLimit;
    private boolean topShow;

    public static class a {
        private final int height;
        private final String name;
        private final int width;

        public a(String str, int i8, int i9) {
            this.name = str;
            this.width = i8;
            this.height = i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.width == aVar.width && this.height == aVar.height) {
                return Objects.equals(this.name, aVar.name);
            }
            return false;
        }

        public int getHeight() {
            return this.height;
        }

        public String getName() {
            return this.name;
        }

        public int getWidth() {
            return this.width;
        }

        public int hashCode() {
            String str = this.name;
            return ((((str != null ? str.hashCode() : 0) * 31) + this.width) * 31) + this.height;
        }
    }

    public ShadowLayout(Context context) {
        super(context);
        this.mInvalidateShadowOnSizeChanged = true;
        this.mForceInvalidateShadow = false;
        this.cache = new HashMap<>();
        initView(context, null);
    }

    private Bitmap createShadowBitmap(int i8, int i9, float f8, float f9, float f10, float f11, int i10, int i11) {
        a aVar = new a("bitmap", i8, i9);
        Bitmap bitmap = this.cache.get(aVar);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_4444);
            this.cache.put(aVar, bitmap);
        }
        Canvas canvas = new Canvas(bitmap);
        RectF rectF = new RectF(f9, f9, i8 - f9, i9 - f9);
        if (f11 > 0.0f) {
            rectF.top += f11;
            rectF.bottom -= f11;
        } else if (f11 < 0.0f) {
            rectF.top += Math.abs(f11);
            rectF.bottom -= Math.abs(f11);
        }
        if (f10 > 0.0f) {
            rectF.left += f10;
            rectF.right -= f10;
        } else if (f10 < 0.0f) {
            rectF.left += Math.abs(f10);
            rectF.right -= Math.abs(f10);
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStyle(Paint.Style.FILL);
        if (!isInEditMode()) {
            paint.setShadowLayer(f9, f10, f11, i10);
        }
        canvas.drawRoundRect(rectF, f8, f8, paint);
        return bitmap;
    }

    private TypedArray getTypedArray(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private void initAttributes(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = getTypedArray(context, attributeSet, R$styleable.ShadowLayout);
        if (typedArray == null) {
            return;
        }
        try {
            this.topShow = typedArray.getBoolean(R$styleable.ShadowLayout_showTopShadow, false);
            this.bottomShow = typedArray.getBoolean(R$styleable.ShadowLayout_showBottomShadow, true);
            this.leftShow = typedArray.getBoolean(R$styleable.ShadowLayout_showLeftShadow, false);
            this.rightShow = typedArray.getBoolean(R$styleable.ShadowLayout_showRightShadow, false);
            this.cornerRadius = typedArray.getDimension(R$styleable.ShadowLayout_cornerRadius, 0.0f);
            this.shadowLimit = typedArray.getDimension(R$styleable.ShadowLayout_shadowRadius, 0.0f);
            this.mDx = typedArray.getDimension(R$styleable.ShadowLayout_shadowDx, 0.0f);
            this.mDy = typedArray.getDimension(R$styleable.ShadowLayout_shadowDy, 0.0f);
            this.shadowColor = typedArray.getColor(R$styleable.ShadowLayout_shadowColor, getResources().getColor(R$color.shadow_default_color));
        } finally {
            typedArray.recycle();
        }
    }

    private void initView(Context context, AttributeSet attributeSet) {
        initAttributes(context, attributeSet);
        int abs = (int) (this.shadowLimit + Math.abs(this.mDx));
        int abs2 = (int) (this.shadowLimit + Math.abs(this.mDy));
        int i8 = this.leftShow ? abs : 0;
        int i9 = this.topShow ? abs2 : 0;
        if (!this.rightShow) {
            abs = 0;
        }
        if (!this.bottomShow) {
            abs2 = 0;
        }
        setPadding(i8, i9, abs, abs2);
    }

    private void setBackgroundCompat(int i8, int i9) {
        setBackground(new BitmapDrawable(getResources(), createShadowBitmap(i8, i9, this.cornerRadius, this.shadowLimit, this.mDx, this.mDy, this.shadowColor, 0)));
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return 0;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return 0;
    }

    public void invalidateShadow() {
        this.mForceInvalidateShadow = true;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (this.mForceInvalidateShadow) {
            this.mForceInvalidateShadow = false;
            setBackgroundCompat(i10 - i8, i11 - i9);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 <= 0 || i9 <= 0) {
            return;
        }
        if (getBackground() == null || this.mInvalidateShadowOnSizeChanged || this.mForceInvalidateShadow) {
            this.mForceInvalidateShadow = false;
            setBackgroundCompat(i8, i9);
        }
    }

    public void setInvalidateShadowOnSizeChanged(boolean z7) {
        this.mInvalidateShadowOnSizeChanged = z7;
    }

    public void setShadowColor(@ColorRes int i8) {
        this.shadowColor = getResources().getColor(i8);
        invalidateShadow();
    }

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInvalidateShadowOnSizeChanged = true;
        this.mForceInvalidateShadow = false;
        this.cache = new HashMap<>();
        initView(context, attributeSet);
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mInvalidateShadowOnSizeChanged = true;
        this.mForceInvalidateShadow = false;
        this.cache = new HashMap<>();
        initView(context, attributeSet);
    }
}
