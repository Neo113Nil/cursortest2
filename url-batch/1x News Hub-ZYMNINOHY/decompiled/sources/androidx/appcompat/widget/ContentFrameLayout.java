package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import l.InterfaceC1100w;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f2044a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f2045b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2046c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f2047d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f2048e;
    public TypedValue f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f2049g;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2049g = new Rect();
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2048e == null) {
            this.f2048e = new TypedValue();
        }
        return this.f2048e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2046c == null) {
            this.f2046c = new TypedValue();
        }
        return this.f2046c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2047d == null) {
            this.f2047d = new TypedValue();
        }
        return this.f2047d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2044a == null) {
            this.f2044a = new TypedValue();
        }
        return this.f2044a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2045b == null) {
            this.f2045b = new TypedValue();
        }
        return this.f2045b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        int measuredWidth;
        TypedValue typedValue;
        int i7;
        int i8;
        float fraction;
        int i9;
        int i10;
        float fraction2;
        int i11;
        int i12;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f2049g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f2047d : this.f2046c;
            if (typedValue2 != null && (i11 = typedValue2.type) != 0) {
                if (i11 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i11 == 6) {
                    int i13 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i13, i13);
                } else {
                    i12 = 0;
                    if (i12 > 0) {
                        i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z3 ? this.f2048e : this.f;
                            if (typedValue3 != null && (i9 = typedValue3.type) != 0) {
                                if (i9 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i9 == 6) {
                                    int i14 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i14, i14);
                                } else {
                                    i10 = 0;
                                    if (i10 > 0) {
                                        i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                                        super.onMeasure(i5, i6);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z && mode == Integer.MIN_VALUE) {
                                            typedValue = !z3 ? this.f2045b : this.f2044a;
                                            if (typedValue != null && (i7 = typedValue.type) != 0) {
                                                if (i7 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i7 == 6) {
                                                    int i15 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i15, i15);
                                                } else {
                                                    i8 = 0;
                                                    if (i8 > 0) {
                                                        i8 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i8) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                                                        if (z2) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i6);
                                                        return;
                                                    }
                                                }
                                                i8 = (int) fraction;
                                                if (i8 > 0) {
                                                }
                                                if (measuredWidth < i8) {
                                                }
                                            }
                                        }
                                        z2 = false;
                                        if (z2) {
                                        }
                                    }
                                }
                                i10 = (int) fraction2;
                                if (i10 > 0) {
                                }
                            }
                        }
                        i6 = i4;
                        super.onMeasure(i5, i6);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z) {
                            if (!z3) {
                            }
                            if (typedValue != null) {
                                if (i7 != 5) {
                                }
                                i8 = (int) fraction;
                                if (i8 > 0) {
                                }
                                if (measuredWidth < i8) {
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                i12 = (int) fraction3;
                if (i12 > 0) {
                }
            }
        }
        i5 = i3;
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i6 = i4;
        super.onMeasure(i5, i6);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
        }
        z2 = false;
        if (z2) {
        }
    }

    public void setAttachListener(InterfaceC1100w interfaceC1100w) {
    }
}
