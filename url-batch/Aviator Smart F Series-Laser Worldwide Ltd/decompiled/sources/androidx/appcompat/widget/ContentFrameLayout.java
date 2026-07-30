package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    private OnAttachListener mAttachListener;
    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void dispatchFitSystemWindows(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new TypedValue();
        }
        return this.mFixedHeightMajor;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new TypedValue();
        }
        return this.mFixedHeightMinor;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new TypedValue();
        }
        return this.mFixedWidthMajor;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new TypedValue();
        }
        return this.mFixedWidthMinor;
    }

    public TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new TypedValue();
        }
        return this.mMinWidthMajor;
    }

    public TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new TypedValue();
        }
        return this.mMinWidthMinor;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onAttachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i8, int i9) {
        boolean z7;
        int measuredWidth;
        TypedValue typedValue;
        int i10;
        int i11;
        float fraction;
        int i12;
        int i13;
        float fraction2;
        int i14;
        int i15;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z8 = true;
        boolean z9 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z9 ? this.mFixedWidthMinor : this.mFixedWidthMajor;
            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                if (i14 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i14 == 6) {
                    int i16 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i16, i16);
                } else {
                    i15 = 0;
                    if (i15 > 0) {
                        Rect rect = this.mDecorPadding;
                        i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.left + rect.right), View.MeasureSpec.getSize(i8)), 1073741824);
                        z7 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z9 ? this.mFixedHeightMajor : this.mFixedHeightMinor;
                            if (typedValue3 != null && (i12 = typedValue3.type) != 0) {
                                if (i12 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i12 == 6) {
                                    int i17 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i17, i17);
                                } else {
                                    i13 = 0;
                                    if (i13 > 0) {
                                        Rect rect2 = this.mDecorPadding;
                                        i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i9)), 1073741824);
                                    }
                                }
                                i13 = (int) fraction2;
                                if (i13 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i8, i9);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z7 && mode == Integer.MIN_VALUE) {
                            typedValue = !z9 ? this.mMinWidthMinor : this.mMinWidthMajor;
                            if (typedValue != null && (i10 = typedValue.type) != 0) {
                                if (i10 != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (i10 == 6) {
                                    int i18 = displayMetrics.widthPixels;
                                    fraction = typedValue.getFraction(i18, i18);
                                } else {
                                    i11 = 0;
                                    if (i11 > 0) {
                                        Rect rect3 = this.mDecorPadding;
                                        i11 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i11) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                                        if (z8) {
                                            super.onMeasure(makeMeasureSpec, i9);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i11 = (int) fraction;
                                if (i11 > 0) {
                                }
                                if (measuredWidth < i11) {
                                }
                            }
                        }
                        z8 = false;
                        if (z8) {
                        }
                    }
                }
                i15 = (int) fraction3;
                if (i15 > 0) {
                }
            }
        }
        z7 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i8, i9);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z7) {
            if (!z9) {
            }
            if (typedValue != null) {
                if (i10 != 5) {
                }
                i11 = (int) fraction;
                if (i11 > 0) {
                }
                if (measuredWidth < i11) {
                }
            }
        }
        z8 = false;
        if (z8) {
        }
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.mAttachListener = onAttachListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDecorPadding(int i8, int i9, int i10, int i11) {
        this.mDecorPadding.set(i8, i9, i10, i11);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mDecorPadding = new Rect();
    }
}
