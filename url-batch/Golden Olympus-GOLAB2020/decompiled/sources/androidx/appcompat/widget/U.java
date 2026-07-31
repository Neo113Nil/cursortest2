package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC1281a0;
import androidx.emoji2.text.f;
import com.ironsource.InterfaceC1490j3;
import e.AbstractC2405a;
import f.AbstractC2415a;
import i.C2468a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class U extends CompoundButton {
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private b mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final AppCompatTextHelper mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;
    private static final Property<U, Float> THUMB_POS = new a(Float.class, "thumbPos");
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(U u4) {
            return Float.valueOf(u4.mThumbPosition);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(U u4, Float f4) {
            u4.setThumbPosition(f4.floatValue());
        }
    }

    static class b extends f.AbstractC0105f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f10834a;

        b(U u4) {
            this.f10834a = new WeakReference(u4);
        }

        @Override // androidx.emoji2.text.f.AbstractC0105f
        public void a(Throwable th) {
            U u4 = (U) this.f10834a.get();
            if (u4 != null) {
                u4.onEmojiCompatInitializedForSwitchText();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0105f
        public void b() {
            U u4 = (U) this.f10834a.get();
            if (u4 != null) {
                u4.onEmojiCompatInitializedForSwitchText();
            }
        }
    }

    public U(Context context) {
        this(context, null);
    }

    private void a(boolean z4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, THUMB_POS, z4 ? 1.0f : 0.0f);
        this.mPositionAnimator = ofFloat;
        ofFloat.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    private void b() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
                this.mThumbDrawable = mutate;
                if (this.mHasThumbTint) {
                    androidx.core.graphics.drawable.a.i(mutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    androidx.core.graphics.drawable.a.j(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
                this.mTrackDrawable = mutate;
                if (this.mHasTrackTint) {
                    androidx.core.graphics.drawable.a.i(mutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    androidx.core.graphics.drawable.a.j(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f4 = getEmojiTextViewHelper().f(this.mSwitchTransformationMethod);
        return f4 != null ? f4.getTransformation(charSequence, this) : charSequence;
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((k0.b(this) ? 1.0f - this.mThumbPosition : this.mThumbPosition) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        Rect d4 = drawable2 != null ? F.d(drawable2) : F.f10653c;
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - d4.left) - d4.right;
    }

    private boolean h(float f4, float f5) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i4 = this.mSwitchTop;
        int i5 = this.mTouchSlop;
        int i6 = i4 - i5;
        int i7 = (this.mSwitchLeft + thumbOffset) - i5;
        int i8 = this.mThumbWidth + i7;
        Rect rect = this.mTempRect;
        return f4 > ((float) i7) && f4 < ((float) (((i8 + rect.left) + rect.right) + i5)) && f5 > ((float) i6) && f5 < ((float) (this.mSwitchBottom + i5));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOff;
            if (charSequence == null) {
                charSequence = getResources().getString(e.h.f36343b);
            }
            AbstractC1281a0.J0(this, charSequence);
        }
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOn;
            if (charSequence == null) {
                charSequence = getResources().getString(e.h.f36344c);
            }
            AbstractC1281a0.J0(this, charSequence);
        }
    }

    private void l(int i4, int i5) {
        setSwitchTypeface(i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i5);
    }

    private void m() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.b() && androidx.emoji2.text.f.i()) {
            androidx.emoji2.text.f c4 = androidx.emoji2.text.f.c();
            int e4 = c4.e();
            if (e4 == 3 || e4 == 0) {
                b bVar = new b(this);
                this.mEmojiCompatInitCallback = bVar;
                c4.t(bVar);
            }
        }
    }

    private void n(MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean z4 = true;
        boolean z5 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z5) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) <= this.mMinFlingVelocity) {
                z4 = getTargetCheckedState();
            } else if (!k0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z4 = false;
            }
        } else {
            z4 = isChecked;
        }
        if (z4 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z4);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = g(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            m();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = g(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            m();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        int i5;
        Rect rect = this.mTempRect;
        int i6 = this.mSwitchLeft;
        int i7 = this.mSwitchTop;
        int i8 = this.mSwitchRight;
        int i9 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.mThumbDrawable;
        Rect d4 = drawable != null ? F.d(drawable) : F.f10653c;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (d4 != null) {
                int i11 = d4.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = d4.top;
                int i13 = rect.top;
                i4 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = d4.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = d4.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                    this.mTrackDrawable.setBounds(i6, i4, i8, i5);
                }
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.mTrackDrawable.setBounds(i6, i4, i8, i5);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.f(background, i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.e(drawable, f4, f5);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.e(drawable2, f4, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!k0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (k0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.r(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    protected final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchBottom;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d4 = F.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d4.left;
                rect.right -= d4.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i6 + i7) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        int i12;
        super.onLayout(z4, i4, i5, i6, i7);
        int i13 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d4 = F.d(this.mThumbDrawable);
            i8 = Math.max(0, d4.left - rect.left);
            i13 = Math.max(0, d4.right - rect.right);
        } else {
            i8 = 0;
        }
        if (k0.b(this)) {
            i9 = getPaddingLeft() + i8;
            width = ((this.mSwitchWidth + i9) - i8) - i13;
        } else {
            width = (getWidth() - getPaddingRight()) - i13;
            i9 = (width - this.mSwitchWidth) + i8 + i13;
        }
        int gravity = getGravity() & InterfaceC1490j3.d.b.f16818j;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i10 = this.mSwitchHeight;
            i11 = paddingTop - (i10 / 2);
        } else {
            if (gravity == 80) {
                i12 = getHeight() - getPaddingBottom();
                i11 = i12 - this.mSwitchHeight;
                this.mSwitchLeft = i9;
                this.mSwitchTop = i11;
                this.mSwitchBottom = i12;
                this.mSwitchRight = width;
            }
            i11 = getPaddingTop();
            i10 = this.mSwitchHeight;
        }
        i12 = i10 + i11;
        this.mSwitchLeft = i9;
        this.mSwitchTop = i11;
        this.mSwitchBottom = i12;
        this.mSwitchRight = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = i(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = i(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int i8 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i6 = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            i7 = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            i6 = 0;
            i7 = 0;
        }
        this.mThumbWidth = Math.max(this.mShowText ? Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2) : 0, i6);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect d4 = F.d(drawable3);
            i9 = Math.max(i9, d4.left);
            i10 = Math.max(i10, d4.right);
        }
        int max = this.mEnforceSwitchWidth ? Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + i9 + i10) : this.mSwitchMinWidth;
        int max2 = Math.max(i8, i7);
        this.mSwitchWidth = max;
        this.mSwitchHeight = max2;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i4 = this.mTouchMode;
                    if (i4 == 1) {
                        float x4 = motionEvent.getX();
                        float y4 = motionEvent.getY();
                        if (Math.abs(x4 - this.mTouchX) > this.mTouchSlop || Math.abs(y4 - this.mTouchY) > this.mTouchSlop) {
                            this.mTouchMode = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.mTouchX = x4;
                            this.mTouchY = y4;
                            return true;
                        }
                    } else if (i4 == 2) {
                        float x5 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f4 = x5 - this.mTouchX;
                        float f5 = thumbScrollRange != 0 ? f4 / thumbScrollRange : f4 > 0.0f ? 1.0f : -1.0f;
                        if (k0.b(this)) {
                            f5 = -f5;
                        }
                        float f6 = f(this.mThumbPosition + f5, 0.0f, 1.0f);
                        if (f6 != this.mThumbPosition) {
                            this.mTouchX = x5;
                            setThumbPosition(f6);
                        }
                        return true;
                    }
                }
            }
            if (this.mTouchMode == 2) {
                n(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.mTouchMode = 0;
            this.mVelocityTracker.clear();
        } else {
            float x6 = motionEvent.getX();
            float y5 = motionEvent.getY();
            if (isEnabled() && h(x6, y5)) {
                this.mTouchMode = 1;
                this.mTouchX = x6;
                this.mTouchY = y5;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().d(z4);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean isChecked = isChecked();
        if (isChecked) {
            k();
        } else {
            j();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().e(z4);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z4) {
        this.mEnforceSwitchWidth = z4;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z4) {
        if (this.mShowText != z4) {
            this.mShowText = z4;
            requestLayout();
            if (z4) {
                m();
            }
        }
    }

    public void setSplitTrack(boolean z4) {
        this.mSplitTrack = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.mSwitchMinWidth = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.mSwitchPadding = i4;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i4) {
        Z t4 = Z.t(context, i4, e.j.f36441S2);
        ColorStateList c4 = t4.c(e.j.f36457W2);
        if (c4 != null) {
            this.mTextColors = c4;
        } else {
            this.mTextColors = getTextColors();
        }
        int f4 = t4.f(e.j.f36445T2, 0);
        if (f4 != 0) {
            float f5 = f4;
            if (f5 != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f5);
                requestLayout();
            }
        }
        l(t4.k(e.j.f36449U2, -1), t4.k(e.j.f36453V2, -1));
        if (t4.a(e.j.f36479b3, false)) {
            this.mSwitchTransformationMethod = new C2468a(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        t4.x();
    }

    public void setSwitchTypeface(Typeface typeface, int i4) {
        if (i4 <= 0) {
            this.mTextPaint.setFakeBoldText(false);
            this.mTextPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
            setSwitchTypeface(defaultFromStyle);
            int i5 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i4;
            this.mTextPaint.setFakeBoldText((i5 & 1) != 0);
            this.mTextPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        j();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            k();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f4) {
        this.mThumbPosition = f4;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(AbstractC2415a.b(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.mThumbTextPadding = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(AbstractC2415a.b(getContext(), i4));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public U(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36183J);
    }

    public U(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        V.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        Z v4 = Z.v(context, attributeSet, e.j.f36378D2, i4, 0);
        AbstractC1281a0.m0(this, context, e.j.f36378D2, attributeSet, v4.r(), i4, 0);
        Drawable g4 = v4.g(e.j.f36393G2);
        this.mThumbDrawable = g4;
        if (g4 != null) {
            g4.setCallback(this);
        }
        Drawable g5 = v4.g(e.j.f36429P2);
        this.mTrackDrawable = g5;
        if (g5 != null) {
            g5.setCallback(this);
        }
        setTextOnInternal(v4.p(e.j.f36383E2));
        setTextOffInternal(v4.p(e.j.f36388F2));
        this.mShowText = v4.a(e.j.f36397H2, true);
        this.mThumbTextPadding = v4.f(e.j.f36417M2, 0);
        this.mSwitchMinWidth = v4.f(e.j.f36405J2, 0);
        this.mSwitchPadding = v4.f(e.j.f36409K2, 0);
        this.mSplitTrack = v4.a(e.j.f36401I2, false);
        ColorStateList c4 = v4.c(e.j.f36421N2);
        if (c4 != null) {
            this.mThumbTintList = c4;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode e4 = F.e(v4.k(e.j.f36425O2, -1), null);
        if (this.mThumbTintMode != e4) {
            this.mThumbTintMode = e4;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            b();
        }
        ColorStateList c5 = v4.c(e.j.f36433Q2);
        if (c5 != null) {
            this.mTrackTintList = c5;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode e5 = F.e(v4.k(e.j.f36437R2, -1), null);
        if (this.mTrackTintMode != e5) {
            this.mTrackTintMode = e5;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            c();
        }
        int n4 = v4.n(e.j.f36413L2, 0);
        if (n4 != 0) {
            setSwitchTextAppearance(context, n4);
        }
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.m(attributeSet, i4);
        v4.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i4);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
