package com.crrepa.band.my.device.muslim.view;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import com.crrepa.band.my.R$styleable;

/* loaded from: classes2.dex */
public class SwitchButton extends CompoundButton {
    public static final int DEFAULT_ANIMATION_DURATION = 250;
    public static final int DEFAULT_THUMB_MARGIN_DP = 2;
    public static final float DEFAULT_THUMB_RANGE_RATIO = 1.8f;
    public static final int DEFAULT_THUMB_SIZE_DP = 20;
    public static final int DEFAULT_TINT_COLOR = 3309506;
    private long mAnimationDuration;
    private ColorStateList mBackColor;
    private Drawable mBackDrawable;
    private int mBackHeight;
    private float mBackRadius;
    private RectF mBackRectF;
    private int mBackWidth;
    private boolean mCatch;
    private CompoundButton.OnCheckedChangeListener mChildOnCheckedChangeListener;
    private int mClickTimeout;
    private int mCurrBackColor;
    private int mCurrThumbColor;
    private Drawable mCurrentBackDrawable;
    private boolean mDrawDebugRect;
    private boolean mFadeBack;
    private int mInitThumbWidth;
    private boolean mIsBackUseDrawable;
    private boolean mIsThumbUseDrawable;
    private float mLastX;
    private int mNextBackColor;
    private Drawable mNextBackDrawable;
    private Layout mOffLayout;
    private int mOffTextColor;
    private Layout mOnLayout;
    private int mOnTextColor;
    private Paint mPaint;
    private RectF mPresentThumbRectF;
    private float mProgress;
    private ValueAnimator mProgressAnimator;
    private boolean mReady;
    private Paint mRectPaint;
    private boolean mRestoring;
    private RectF mSafeRectF;
    private float mStartX;
    private float mStartY;
    private int mTextAdjust;
    private int mTextExtra;
    private float mTextHeight;
    private CharSequence mTextOff;
    private RectF mTextOffRectF;
    private CharSequence mTextOn;
    private RectF mTextOnRectF;
    private TextPaint mTextPaint;
    private int mTextThumbInset;
    private float mTextWidth;
    private ColorStateList mThumbColor;
    private Drawable mThumbDrawable;
    private int mThumbHeight;
    private RectF mThumbMargin;
    private float mThumbRadius;
    private float mThumbRangeRatio;
    private RectF mThumbRectF;
    private int mThumbWidth;
    private int mTintColor;
    private int mTouchSlop;
    private c mUnsetPressedState;
    private static final int[] CHECKED_PRESSED_STATE = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};
    private static final int[] UNCHECKED_PRESSED_STATE = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        CharSequence offText;
        CharSequence onText;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            TextUtils.writeToParcel(this.onText, parcel, i8);
            TextUtils.writeToParcel(this.offText, parcel, i8);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.onText = (CharSequence) creator.createFromParcel(parcel);
            this.offText = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SwitchButton.this.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class b {
        private static final int CHECKED_ATTR = 16842912;
        private static final int ENABLE_ATTR = 16842910;
        private static final int PRESSED_ATTR = 16842919;

        static ColorStateList generateBackColorWithTintColor(int i8) {
            int i9 = i8 - (-805306368);
            return new ColorStateList(new int[][]{new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842912, 16842919}, new int[]{-16842912, 16842919}, new int[]{16842912}, new int[]{-16842912}}, new int[]{i8 - (-520093696), 268435456, i9, 536870912, i9, 536870912});
        }

        static ColorStateList generateThumbColorWithTintColor(int i8) {
            int i9 = i8 - (-1728053248);
            return new ColorStateList(new int[][]{new int[]{-16842910, 16842912}, new int[]{-16842910}, new int[]{16842919, -16842912}, new int[]{16842919, 16842912}, new int[]{16842912}, new int[]{-16842912}}, new int[]{i8 - (-1442840576), -4539718, i9, i9, i8 | (-16777216), -1118482});
        }
    }

    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SwitchButton.this.setPressed(false);
        }

        /* synthetic */ c(SwitchButton switchButton, a aVar) {
            this();
        }
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mDrawDebugRect = false;
        this.mRestoring = false;
        this.mReady = false;
        this.mCatch = false;
        init(attributeSet);
    }

    private void catchView() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.mCatch = true;
    }

    private int ceil(double d8) {
        return (int) Math.ceil(d8);
    }

    private ColorStateList getColorStateListCompat(Context context, int i8) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT < 23) {
            return context.getResources().getColorStateList(i8);
        }
        colorStateList = context.getColorStateList(i8);
        return colorStateList;
    }

    private Drawable getDrawableCompat(Context context, int i8) {
        return context.getDrawable(i8);
    }

    private float getProgress() {
        return this.mProgress;
    }

    private boolean getStatusBasedOnPos() {
        return getProgress() > 0.5f;
    }

    private static int getThemeAccentColorOrDefault(Context context, int i8) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true) ? typedValue.data : i8;
    }

    private void init(AttributeSet attributeSet) {
        String str;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        Drawable drawable;
        float f8;
        float f9;
        float f10;
        Drawable drawable2;
        float f11;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z7;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        float f16;
        float f17;
        ColorStateList colorStateList3;
        TypedArray obtainStyledAttributes;
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mClickTimeout = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.mPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.mRectPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mRectPaint.setStrokeWidth(getResources().getDisplayMetrics().density);
        this.mTextPaint = getPaint();
        this.mThumbRectF = new RectF();
        this.mBackRectF = new RectF();
        this.mSafeRectF = new RectF();
        this.mThumbMargin = new RectF();
        this.mTextOnRectF = new RectF();
        this.mTextOffRectF = new RectF();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 0.0f).setDuration(250L);
        this.mProgressAnimator = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mProgressAnimator.addUpdateListener(new a());
        this.mPresentThumbRectF = new RectF();
        float f18 = getResources().getDisplayMetrics().density * 2.0f;
        TypedArray obtainStyledAttributes2 = attributeSet == null ? null : getContext().obtainStyledAttributes(attributeSet, R$styleable.SwitchButton);
        if (obtainStyledAttributes2 != null) {
            drawable2 = obtainStyledAttributes2.getDrawable(11);
            ColorStateList colorStateList4 = obtainStyledAttributes2.getColorStateList(10);
            float dimension = obtainStyledAttributes2.getDimension(13, f18);
            float dimension2 = obtainStyledAttributes2.getDimension(15, dimension);
            float dimension3 = obtainStyledAttributes2.getDimension(16, dimension);
            float dimension4 = obtainStyledAttributes2.getDimension(17, dimension);
            float dimension5 = obtainStyledAttributes2.getDimension(14, dimension);
            float dimension6 = obtainStyledAttributes2.getDimension(20, 0.0f);
            float dimension7 = obtainStyledAttributes2.getDimension(12, 0.0f);
            float dimension8 = obtainStyledAttributes2.getDimension(18, -1.0f);
            float dimension9 = obtainStyledAttributes2.getDimension(3, -1.0f);
            Drawable drawable3 = obtainStyledAttributes2.getDrawable(2);
            ColorStateList colorStateList5 = obtainStyledAttributes2.getColorStateList(1);
            float f19 = obtainStyledAttributes2.getFloat(19, 1.8f);
            int integer = obtainStyledAttributes2.getInteger(0, 250);
            boolean z8 = obtainStyledAttributes2.getBoolean(4, true);
            int color = obtainStyledAttributes2.getColor(21, 0);
            String string = obtainStyledAttributes2.getString(8);
            String string2 = obtainStyledAttributes2.getString(7);
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(9, 0);
            int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
            obtainStyledAttributes2.recycle();
            i10 = dimensionPixelSize3;
            f15 = dimension2;
            f16 = dimension3;
            i12 = integer;
            str = string;
            str2 = string2;
            f12 = dimension9;
            colorStateList = colorStateList5;
            f8 = dimension6;
            colorStateList2 = colorStateList4;
            drawable = drawable3;
            f9 = dimension5;
            f13 = dimension8;
            f11 = dimension7;
            i11 = color;
            i8 = dimensionPixelSize;
            f10 = dimension4;
            i9 = dimensionPixelSize2;
            f14 = f19;
            z7 = z8;
        } else {
            str = null;
            str2 = null;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            drawable = null;
            f8 = 0.0f;
            f9 = 0.0f;
            f10 = 0.0f;
            drawable2 = null;
            f11 = 0.0f;
            colorStateList = null;
            colorStateList2 = null;
            z7 = true;
            f12 = -1.0f;
            f13 = -1.0f;
            f14 = 1.8f;
            i12 = 250;
            f15 = 0.0f;
            f16 = 0.0f;
        }
        float f20 = f9;
        if (attributeSet == null) {
            f17 = f10;
            colorStateList3 = colorStateList;
            obtainStyledAttributes = null;
        } else {
            f17 = f10;
            colorStateList3 = colorStateList;
            obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.focusable, R.attr.clickable});
        }
        if (obtainStyledAttributes != null) {
            boolean z9 = obtainStyledAttributes.getBoolean(0, true);
            boolean z10 = obtainStyledAttributes.getBoolean(1, z9);
            setFocusable(z9);
            setClickable(z10);
            obtainStyledAttributes.recycle();
        } else {
            setFocusable(true);
            setClickable(true);
        }
        this.mTextOn = str;
        this.mTextOff = str2;
        this.mTextThumbInset = i8;
        this.mTextExtra = i9;
        this.mTextAdjust = i10;
        this.mThumbDrawable = drawable2;
        this.mThumbColor = colorStateList2;
        this.mIsThumbUseDrawable = drawable2 != null;
        this.mTintColor = i11;
        if (i11 == 0) {
            this.mTintColor = getThemeAccentColorOrDefault(getContext(), 3309506);
        }
        if (!this.mIsThumbUseDrawable && this.mThumbColor == null) {
            ColorStateList generateThumbColorWithTintColor = b.generateThumbColorWithTintColor(this.mTintColor);
            this.mThumbColor = generateThumbColorWithTintColor;
            this.mCurrThumbColor = generateThumbColorWithTintColor.getDefaultColor();
        }
        double d8 = f8;
        this.mThumbWidth = ceil(d8);
        this.mThumbHeight = ceil(f11);
        this.mInitThumbWidth = ceil(d8);
        this.mBackDrawable = drawable;
        ColorStateList colorStateList6 = colorStateList3;
        this.mBackColor = colorStateList6;
        boolean z11 = drawable != null;
        this.mIsBackUseDrawable = z11;
        if (!z11 && colorStateList6 == null) {
            ColorStateList generateBackColorWithTintColor = b.generateBackColorWithTintColor(this.mTintColor);
            this.mBackColor = generateBackColorWithTintColor;
            int defaultColor = generateBackColorWithTintColor.getDefaultColor();
            this.mCurrBackColor = defaultColor;
            this.mNextBackColor = this.mBackColor.getColorForState(CHECKED_PRESSED_STATE, defaultColor);
        }
        this.mThumbMargin.set(f15, f17, f16, f20);
        this.mThumbRangeRatio = this.mThumbMargin.width() >= 0.0f ? Math.max(f14, 1.0f) : f14;
        this.mThumbRadius = f13;
        this.mBackRadius = f12;
        long j8 = i12;
        this.mAnimationDuration = j8;
        this.mFadeBack = z7;
        this.mProgressAnimator.setDuration(j8);
        if (isChecked()) {
            setProgress(1.0f);
        }
    }

    private Layout makeLayout(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    private int measureHeight(int i8) {
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (this.mThumbHeight == 0 && this.mIsThumbUseDrawable) {
            this.mThumbHeight = this.mThumbDrawable.getIntrinsicHeight();
        }
        if (mode != 1073741824) {
            if (this.mThumbHeight == 0) {
                this.mThumbHeight = ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            float f8 = this.mThumbHeight;
            RectF rectF = this.mThumbMargin;
            int ceil = ceil(f8 + rectF.top + rectF.bottom);
            this.mBackHeight = ceil;
            if (ceil < 0) {
                this.mBackHeight = 0;
                this.mThumbHeight = 0;
                return size;
            }
            int ceil2 = ceil(this.mTextHeight - ceil);
            if (ceil2 > 0) {
                this.mBackHeight += ceil2;
                this.mThumbHeight += ceil2;
            }
            int max = Math.max(this.mThumbHeight, this.mBackHeight);
            return Math.max(Math.max(max, getPaddingTop() + max + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (this.mThumbHeight != 0) {
            RectF rectF2 = this.mThumbMargin;
            this.mBackHeight = ceil(r6 + rectF2.top + rectF2.bottom);
            this.mBackHeight = ceil(Math.max(r6, this.mTextHeight));
            if ((((r6 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.mThumbMargin.top)) - Math.min(0.0f, this.mThumbMargin.bottom) > size) {
                this.mThumbHeight = 0;
            }
        }
        if (this.mThumbHeight == 0) {
            int ceil3 = ceil(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.mThumbMargin.top) + Math.min(0.0f, this.mThumbMargin.bottom));
            this.mBackHeight = ceil3;
            if (ceil3 < 0) {
                this.mBackHeight = 0;
                this.mThumbHeight = 0;
                return size;
            }
            RectF rectF3 = this.mThumbMargin;
            this.mThumbHeight = ceil((ceil3 - rectF3.top) - rectF3.bottom);
        }
        if (this.mThumbHeight >= 0) {
            return size;
        }
        this.mBackHeight = 0;
        this.mThumbHeight = 0;
        return size;
    }

    private int measureWidth(int i8) {
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (this.mThumbWidth == 0 && this.mIsThumbUseDrawable) {
            this.mThumbWidth = this.mThumbDrawable.getIntrinsicWidth();
        }
        int ceil = ceil(this.mTextWidth);
        if (this.mThumbRangeRatio == 0.0f) {
            this.mThumbRangeRatio = 1.8f;
        }
        if (mode != 1073741824) {
            if (this.mThumbWidth == 0) {
                this.mThumbWidth = ceil(getResources().getDisplayMetrics().density * 20.0f);
            }
            if (this.mThumbRangeRatio == 0.0f) {
                this.mThumbRangeRatio = 1.8f;
            }
            int ceil2 = ceil(this.mThumbWidth * this.mThumbRangeRatio);
            float f8 = ceil + this.mTextExtra;
            float f9 = ceil2 - this.mThumbWidth;
            RectF rectF = this.mThumbMargin;
            int ceil3 = ceil(f8 - ((f9 + Math.max(rectF.left, rectF.right)) + this.mTextThumbInset));
            float f10 = ceil2;
            RectF rectF2 = this.mThumbMargin;
            int ceil4 = ceil(rectF2.left + f10 + rectF2.right + Math.max(0, ceil3));
            this.mBackWidth = ceil4;
            if (ceil4 >= 0) {
                int ceil5 = ceil(f10 + Math.max(0.0f, this.mThumbMargin.left) + Math.max(0.0f, this.mThumbMargin.right) + Math.max(0, ceil3));
                return Math.max(ceil5, getPaddingLeft() + ceil5 + getPaddingRight());
            }
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.mThumbWidth != 0) {
            int ceil6 = ceil(r2 * this.mThumbRangeRatio);
            int i9 = this.mTextExtra + ceil;
            int i10 = ceil6 - this.mThumbWidth;
            RectF rectF3 = this.mThumbMargin;
            int ceil7 = i9 - (i10 + ceil(Math.max(rectF3.left, rectF3.right)));
            float f11 = ceil6;
            RectF rectF4 = this.mThumbMargin;
            int ceil8 = ceil(rectF4.left + f11 + rectF4.right + Math.max(ceil7, 0));
            this.mBackWidth = ceil8;
            if (ceil8 < 0) {
                this.mThumbWidth = 0;
            }
            if (f11 + Math.max(this.mThumbMargin.left, 0.0f) + Math.max(this.mThumbMargin.right, 0.0f) + Math.max(ceil7, 0) > paddingLeft) {
                this.mThumbWidth = 0;
            }
        }
        if (this.mThumbWidth != 0) {
            return size;
        }
        int ceil9 = ceil((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.mThumbMargin.left, 0.0f)) - Math.max(this.mThumbMargin.right, 0.0f));
        if (ceil9 < 0) {
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        this.mThumbWidth = this.mInitThumbWidth;
        RectF rectF5 = this.mThumbMargin;
        int ceil10 = ceil(ceil9 + rectF5.left + rectF5.right);
        this.mBackWidth = ceil10;
        if (ceil10 < 0) {
            this.mThumbWidth = 0;
            this.mBackWidth = 0;
            return size;
        }
        int i11 = ceil + this.mTextExtra;
        int i12 = ceil9 - this.mThumbWidth;
        RectF rectF6 = this.mThumbMargin;
        int ceil11 = i11 - (i12 + ceil(Math.max(rectF6.left, rectF6.right)));
        if (ceil11 > 0) {
            this.mThumbWidth -= ceil11;
        }
        if (this.mThumbWidth >= 0) {
            return size;
        }
        this.mThumbWidth = 0;
        this.mBackWidth = 0;
        return size;
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(float f8) {
        if (f8 > 1.0f) {
            f8 = 1.0f;
        } else if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        this.mProgress = f8;
        invalidate();
    }

    private void setup() {
        int i8;
        if (this.mThumbWidth == 0 || (i8 = this.mThumbHeight) == 0 || this.mBackWidth == 0 || this.mBackHeight == 0) {
            return;
        }
        if (this.mThumbRadius == -1.0f) {
            this.mThumbRadius = Math.min(r0, i8) / 2.0f;
        }
        if (this.mBackRadius == -1.0f) {
            this.mBackRadius = Math.min(this.mBackWidth, this.mBackHeight) / 2.0f;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int ceil = ceil((this.mBackWidth - Math.min(0.0f, this.mThumbMargin.left)) - Math.min(0.0f, this.mThumbMargin.right));
        float paddingTop = measuredHeight <= ceil((this.mBackHeight - Math.min(0.0f, this.mThumbMargin.top)) - Math.min(0.0f, this.mThumbMargin.bottom)) ? getPaddingTop() + Math.max(0.0f, this.mThumbMargin.top) : (((measuredHeight - r3) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.mThumbMargin.top);
        float paddingLeft = measuredWidth <= this.mBackWidth ? getPaddingLeft() + Math.max(0.0f, this.mThumbMargin.left) : (((measuredWidth - ceil) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.mThumbMargin.left);
        this.mThumbRectF.set(paddingLeft, paddingTop, this.mThumbWidth + paddingLeft, this.mThumbHeight + paddingTop);
        RectF rectF = this.mThumbRectF;
        float f8 = rectF.left;
        RectF rectF2 = this.mThumbMargin;
        float f9 = f8 - rectF2.left;
        RectF rectF3 = this.mBackRectF;
        float f10 = rectF.top;
        float f11 = rectF2.top;
        rectF3.set(f9, f10 - f11, this.mBackWidth + f9, (f10 - f11) + this.mBackHeight);
        RectF rectF4 = this.mSafeRectF;
        RectF rectF5 = this.mThumbRectF;
        rectF4.set(rectF5.left, 0.0f, (this.mBackRectF.right - this.mThumbMargin.right) - rectF5.width(), 0.0f);
        this.mBackRadius = Math.min(Math.min(this.mBackRectF.width(), this.mBackRectF.height()) / 2.0f, this.mBackRadius);
        Drawable drawable = this.mBackDrawable;
        if (drawable != null) {
            RectF rectF6 = this.mBackRectF;
            drawable.setBounds((int) rectF6.left, (int) rectF6.top, ceil(rectF6.right), ceil(this.mBackRectF.bottom));
        }
        if (this.mOnLayout != null) {
            RectF rectF7 = this.mBackRectF;
            float width = (rectF7.left + (((((rectF7.width() + this.mTextThumbInset) - this.mThumbWidth) - this.mThumbMargin.right) - this.mOnLayout.getWidth()) / 2.0f)) - this.mTextAdjust;
            RectF rectF8 = this.mBackRectF;
            float height = rectF8.top + ((rectF8.height() - this.mOnLayout.getHeight()) / 2.0f);
            this.mTextOnRectF.set(width, height, this.mOnLayout.getWidth() + width, this.mOnLayout.getHeight() + height);
        }
        if (this.mOffLayout != null) {
            RectF rectF9 = this.mBackRectF;
            float width2 = ((rectF9.right - (((((rectF9.width() + this.mTextThumbInset) - this.mThumbWidth) - this.mThumbMargin.left) - this.mOffLayout.getWidth()) / 2.0f)) - this.mOffLayout.getWidth()) + this.mTextAdjust;
            RectF rectF10 = this.mBackRectF;
            float height2 = rectF10.top + ((rectF10.height() - this.mOffLayout.getHeight()) / 2.0f);
            this.mTextOffRectF.set(width2, height2, this.mOffLayout.getWidth() + width2, this.mOffLayout.getHeight() + height2);
        }
        this.mReady = true;
    }

    protected void animateToState(boolean z7) {
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.mProgressAnimator.cancel();
        }
        this.mProgressAnimator.setDuration(this.mAnimationDuration);
        if (z7) {
            this.mProgressAnimator.setFloatValues(this.mProgress, 1.0f);
        } else {
            this.mProgressAnimator.setFloatValues(this.mProgress, 0.0f);
        }
        this.mProgressAnimator.start();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        if (this.mIsThumbUseDrawable || (colorStateList2 = this.mThumbColor) == null) {
            setDrawableState(this.mThumbDrawable);
        } else {
            this.mCurrThumbColor = colorStateList2.getColorForState(getDrawableState(), this.mCurrThumbColor);
        }
        int[] iArr = isChecked() ? UNCHECKED_PRESSED_STATE : CHECKED_PRESSED_STATE;
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.mOnTextColor = textColors.getColorForState(CHECKED_PRESSED_STATE, defaultColor);
            this.mOffTextColor = textColors.getColorForState(UNCHECKED_PRESSED_STATE, defaultColor);
        }
        if (!this.mIsBackUseDrawable && (colorStateList = this.mBackColor) != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), this.mCurrBackColor);
            this.mCurrBackColor = colorForState;
            this.mNextBackColor = this.mBackColor.getColorForState(iArr, colorForState);
            return;
        }
        Drawable drawable = this.mBackDrawable;
        if ((drawable instanceof StateListDrawable) && this.mFadeBack) {
            drawable.setState(iArr);
            this.mNextBackDrawable = this.mBackDrawable.getCurrent().mutate();
        } else {
            this.mNextBackDrawable = null;
        }
        setDrawableState(this.mBackDrawable);
        Drawable drawable2 = this.mBackDrawable;
        if (drawable2 != null) {
            this.mCurrentBackDrawable = drawable2.getCurrent().mutate();
        }
    }

    public long getAnimationDuration() {
        return this.mAnimationDuration;
    }

    public ColorStateList getBackColor() {
        return this.mBackColor;
    }

    public Drawable getBackDrawable() {
        return this.mBackDrawable;
    }

    public float getBackRadius() {
        return this.mBackRadius;
    }

    public PointF getBackSizeF() {
        return new PointF(this.mBackRectF.width(), this.mBackRectF.height());
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public ColorStateList getThumbColor() {
        return this.mThumbColor;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public float getThumbHeight() {
        return this.mThumbHeight;
    }

    public RectF getThumbMargin() {
        return this.mThumbMargin;
    }

    public float getThumbRadius() {
        return this.mThumbRadius;
    }

    public float getThumbRangeRatio() {
        return this.mThumbRangeRatio;
    }

    public float getThumbWidth() {
        return this.mThumbWidth;
    }

    public int getTintColor() {
        return this.mTintColor;
    }

    public boolean isDrawDebugRect() {
        return this.mDrawDebugRect;
    }

    public boolean isFadeBack() {
        return this.mFadeBack;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mReady) {
            setup();
        }
        if (this.mReady) {
            if (this.mIsBackUseDrawable) {
                if (!this.mFadeBack || this.mCurrentBackDrawable == null || this.mNextBackDrawable == null) {
                    this.mBackDrawable.setAlpha(255);
                    this.mBackDrawable.draw(canvas);
                } else {
                    Drawable drawable = isChecked() ? this.mCurrentBackDrawable : this.mNextBackDrawable;
                    Drawable drawable2 = isChecked() ? this.mNextBackDrawable : this.mCurrentBackDrawable;
                    int progress = (int) (getProgress() * 255.0f);
                    drawable.setAlpha(progress);
                    drawable.draw(canvas);
                    drawable2.setAlpha(255 - progress);
                    drawable2.draw(canvas);
                }
            } else if (this.mFadeBack) {
                int i8 = isChecked() ? this.mCurrBackColor : this.mNextBackColor;
                int i9 = isChecked() ? this.mNextBackColor : this.mCurrBackColor;
                int progress2 = (int) (getProgress() * 255.0f);
                this.mPaint.setARGB((Color.alpha(i8) * progress2) / 255, Color.red(i8), Color.green(i8), Color.blue(i8));
                RectF rectF = this.mBackRectF;
                float f8 = this.mBackRadius;
                canvas.drawRoundRect(rectF, f8, f8, this.mPaint);
                this.mPaint.setARGB((Color.alpha(i9) * (255 - progress2)) / 255, Color.red(i9), Color.green(i9), Color.blue(i9));
                RectF rectF2 = this.mBackRectF;
                float f9 = this.mBackRadius;
                canvas.drawRoundRect(rectF2, f9, f9, this.mPaint);
                this.mPaint.setAlpha(255);
            } else {
                this.mPaint.setColor(this.mCurrBackColor);
                RectF rectF3 = this.mBackRectF;
                float f10 = this.mBackRadius;
                canvas.drawRoundRect(rectF3, f10, f10, this.mPaint);
            }
            Layout layout = ((double) getProgress()) > 0.5d ? this.mOnLayout : this.mOffLayout;
            RectF rectF4 = ((double) getProgress()) > 0.5d ? this.mTextOnRectF : this.mTextOffRectF;
            if (layout != null && rectF4 != null) {
                double progress3 = getProgress();
                float progress4 = getProgress();
                int progress5 = (int) ((progress3 >= 0.75d ? (progress4 * 4.0f) - 3.0f : ((double) progress4) < 0.25d ? 1.0f - (getProgress() * 4.0f) : 0.0f) * 255.0f);
                int i10 = ((double) getProgress()) > 0.5d ? this.mOnTextColor : this.mOffTextColor;
                layout.getPaint().setARGB((Color.alpha(i10) * progress5) / 255, Color.red(i10), Color.green(i10), Color.blue(i10));
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                layout.draw(canvas);
                canvas.restore();
            }
            this.mPresentThumbRectF.set(this.mThumbRectF);
            this.mPresentThumbRectF.offset(this.mProgress * this.mSafeRectF.width(), 0.0f);
            if (this.mIsThumbUseDrawable) {
                Drawable drawable3 = this.mThumbDrawable;
                RectF rectF5 = this.mPresentThumbRectF;
                drawable3.setBounds((int) rectF5.left, (int) rectF5.top, ceil(rectF5.right), ceil(this.mPresentThumbRectF.bottom));
                this.mThumbDrawable.draw(canvas);
            } else {
                this.mPaint.setColor(this.mCurrThumbColor);
                RectF rectF6 = this.mPresentThumbRectF;
                float f11 = this.mThumbRadius;
                canvas.drawRoundRect(rectF6, f11, f11, this.mPaint);
            }
            if (this.mDrawDebugRect) {
                this.mRectPaint.setColor(Color.parseColor("#AA0000"));
                canvas.drawRect(this.mBackRectF, this.mRectPaint);
                this.mRectPaint.setColor(Color.parseColor("#0000FF"));
                canvas.drawRect(this.mPresentThumbRectF, this.mRectPaint);
                this.mRectPaint.setColor(Color.parseColor("#000000"));
                RectF rectF7 = this.mSafeRectF;
                float f12 = rectF7.left;
                float f13 = this.mThumbRectF.top;
                canvas.drawLine(f12, f13, rectF7.right, f13, this.mRectPaint);
                this.mRectPaint.setColor(Color.parseColor("#00CC00"));
                canvas.drawRect(((double) getProgress()) > 0.5d ? this.mTextOnRectF : this.mTextOffRectF, this.mRectPaint);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.mOnLayout == null && !TextUtils.isEmpty(this.mTextOn)) {
            this.mOnLayout = makeLayout(this.mTextOn);
        }
        if (this.mOffLayout == null && !TextUtils.isEmpty(this.mTextOff)) {
            this.mOffLayout = makeLayout(this.mTextOff);
        }
        float width = this.mOnLayout != null ? r0.getWidth() : 0.0f;
        float width2 = this.mOffLayout != null ? r2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.mTextWidth = 0.0f;
        } else {
            this.mTextWidth = Math.max(width, width2);
        }
        float height = this.mOnLayout != null ? r0.getHeight() : 0.0f;
        float height2 = this.mOffLayout != null ? r2.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.mTextHeight = 0.0f;
        } else {
            this.mTextHeight = Math.max(height, height2);
        }
        setMeasuredDimension(measureWidth(i8), measureHeight(i9));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        setText(savedState.onText, savedState.offText);
        this.mRestoring = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mRestoring = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.onText = this.mTextOn;
        savedState.offText = this.mTextOff;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 == i10 && i9 == i11) {
            return;
        }
        setup();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r0 != 3) goto L54;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !isClickable() || !isFocusable() || !this.mReady) {
            return false;
        }
        int action = motionEvent.getAction();
        float x7 = motionEvent.getX() - this.mStartX;
        float y7 = motionEvent.getY() - this.mStartY;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x8 = motionEvent.getX();
                    setProgress(getProgress() + ((x8 - this.mLastX) / this.mSafeRectF.width()));
                    this.mLastX = x8;
                    if (!this.mCatch && (Math.abs(x7) > this.mTouchSlop / 2.0f || Math.abs(y7) > this.mTouchSlop / 2.0f)) {
                        if (y7 == 0.0f || Math.abs(x7) > Math.abs(y7)) {
                            catchView();
                        } else if (Math.abs(y7) > Math.abs(x7)) {
                            return false;
                        }
                    }
                }
            }
            this.mCatch = false;
            float eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (Math.abs(x7) >= this.mTouchSlop || Math.abs(y7) >= this.mTouchSlop || eventTime >= this.mClickTimeout) {
                boolean statusBasedOnPos = getStatusBasedOnPos();
                if (statusBasedOnPos != isChecked()) {
                    playSoundEffect(0);
                    setChecked(statusBasedOnPos);
                } else {
                    animateToState(statusBasedOnPos);
                }
            } else {
                performClick();
            }
            if (isPressed()) {
                if (this.mUnsetPressedState == null) {
                    this.mUnsetPressedState = new c(this, null);
                }
                if (!post(this.mUnsetPressedState)) {
                    this.mUnsetPressedState.run();
                }
            }
        } else {
            this.mStartX = motionEvent.getX();
            this.mStartY = motionEvent.getY();
            this.mLastX = this.mStartX;
            setPressed(true);
        }
        return true;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setAnimationDuration(long j8) {
        this.mAnimationDuration = j8;
    }

    public void setBackColor(ColorStateList colorStateList) {
        this.mBackColor = colorStateList;
        if (colorStateList != null) {
            setBackDrawable(null);
        }
        invalidate();
    }

    public void setBackColorRes(int i8) {
        setBackColor(getColorStateListCompat(getContext(), i8));
    }

    public void setBackDrawable(Drawable drawable) {
        this.mBackDrawable = drawable;
        this.mIsBackUseDrawable = drawable != null;
        refreshDrawableState();
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setBackDrawableRes(int i8) {
        setBackDrawable(getDrawableCompat(getContext(), i8));
    }

    public void setBackRadius(float f8) {
        this.mBackRadius = f8;
        if (this.mIsBackUseDrawable) {
            return;
        }
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        if (isChecked() != z7) {
            animateToState(z7);
        }
        if (this.mRestoring) {
            setCheckedImmediatelyNoEvent(z7);
        } else {
            super.setChecked(z7);
        }
    }

    public void setCheckedImmediately(boolean z7) {
        super.setChecked(z7);
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mProgressAnimator.cancel();
        }
        setProgress(z7 ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z7) {
        if (this.mChildOnCheckedChangeListener == null) {
            setCheckedImmediately(z7);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z7);
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void setCheckedNoEvent(boolean z7) {
        if (this.mChildOnCheckedChangeListener == null) {
            setChecked(z7);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z7);
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void setDrawDebugRect(boolean z7) {
        this.mDrawDebugRect = z7;
        invalidate();
    }

    public void setFadeBack(boolean z7) {
        this.mFadeBack = z7;
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.mChildOnCheckedChangeListener = onCheckedChangeListener;
    }

    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        this.mTextOn = charSequence;
        this.mTextOff = charSequence2;
        this.mOnLayout = null;
        this.mOffLayout = null;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextAdjust(int i8) {
        this.mTextAdjust = i8;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i8) {
        this.mTextExtra = i8;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i8) {
        this.mTextThumbInset = i8;
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setThumbColor(ColorStateList colorStateList) {
        this.mThumbColor = colorStateList;
        if (colorStateList != null) {
            setThumbDrawable(null);
        }
        invalidate();
    }

    public void setThumbColorRes(int i8) {
        setThumbColor(getColorStateListCompat(getContext(), i8));
    }

    public void setThumbDrawable(Drawable drawable) {
        this.mThumbDrawable = drawable;
        this.mIsThumbUseDrawable = drawable != null;
        refreshDrawableState();
        this.mReady = false;
        requestLayout();
        invalidate();
    }

    public void setThumbDrawableRes(int i8) {
        setThumbDrawable(getDrawableCompat(getContext(), i8));
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            setThumbMargin(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            setThumbMargin(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbRadius(float f8) {
        this.mThumbRadius = f8;
        if (this.mIsThumbUseDrawable) {
            return;
        }
        invalidate();
    }

    public void setThumbRangeRatio(float f8) {
        this.mThumbRangeRatio = f8;
        this.mReady = false;
        requestLayout();
    }

    public void setThumbSize(int i8, int i9) {
        this.mThumbWidth = i8;
        this.mThumbHeight = i9;
        this.mReady = false;
        requestLayout();
    }

    public void setTintColor(int i8) {
        this.mTintColor = i8;
        this.mThumbColor = b.generateThumbColorWithTintColor(i8);
        this.mBackColor = b.generateBackColorWithTintColor(this.mTintColor);
        this.mIsBackUseDrawable = false;
        this.mIsThumbUseDrawable = false;
        refreshDrawableState();
        invalidate();
    }

    public void toggleImmediately() {
        setCheckedImmediately(!isChecked());
    }

    public void toggleImmediatelyNoEvent() {
        if (this.mChildOnCheckedChangeListener == null) {
            toggleImmediately();
            return;
        }
        super.setOnCheckedChangeListener(null);
        toggleImmediately();
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public void toggleNoEvent() {
        if (this.mChildOnCheckedChangeListener == null) {
            toggle();
            return;
        }
        super.setOnCheckedChangeListener(null);
        toggle();
        super.setOnCheckedChangeListener(this.mChildOnCheckedChangeListener);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDrawDebugRect = false;
        this.mRestoring = false;
        this.mReady = false;
        this.mCatch = false;
        init(attributeSet);
    }

    public void setThumbMargin(float f8, float f9, float f10, float f11) {
        this.mThumbMargin.set(f8, f9, f10, f11);
        this.mReady = false;
        requestLayout();
    }

    public SwitchButton(Context context) {
        super(context);
        this.mDrawDebugRect = false;
        this.mRestoring = false;
        this.mReady = false;
        this.mCatch = false;
        init(null);
    }
}
