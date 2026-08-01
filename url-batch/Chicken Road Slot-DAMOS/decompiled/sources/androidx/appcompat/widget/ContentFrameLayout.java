package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import m.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f431d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f432e;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f433i;

    /* renamed from: r, reason: collision with root package name */
    public TypedValue f434r;

    /* renamed from: s, reason: collision with root package name */
    public TypedValue f435s;

    /* renamed from: t, reason: collision with root package name */
    public TypedValue f436t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f437u;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f437u = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f435s == null) {
            this.f435s = new TypedValue();
        }
        return this.f435s;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f436t == null) {
            this.f436t = new TypedValue();
        }
        return this.f436t;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f433i == null) {
            this.f433i = new TypedValue();
        }
        return this.f433i;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f434r == null) {
            this.f434r = new TypedValue();
        }
        return this.f434r;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f431d == null) {
            this.f431d = new TypedValue();
        }
        return this.f431d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f432e == null) {
            this.f432e = new TypedValue();
        }
        return this.f432e;
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        boolean z10;
        int i12;
        int measuredWidth;
        TypedValue typedValue;
        int i13;
        int i14;
        float fraction;
        int i15;
        int i16;
        float fraction2;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f437u;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f434r : this.f433i;
            if (typedValue2 != null && (i17 = typedValue2.type) != 0) {
                if (i17 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i17 == 6) {
                    int i19 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i19, i19);
                } else {
                    i18 = 0;
                    if (i18 > 0) {
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                        z10 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z12 ? this.f435s : this.f436t;
                            if (typedValue3 != null && (i15 = typedValue3.type) != 0) {
                                if (i15 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i15 == 6) {
                                    int i20 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i20, i20);
                                } else {
                                    i16 = 0;
                                    if (i16 > 0) {
                                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                                        super.onMeasure(i11, i12);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z10 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z12 ? this.f432e : this.f431d;
                                            if (typedValue != null && (i13 = typedValue.type) != 0) {
                                                if (i13 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i13 == 6) {
                                                    int i21 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i21, i21);
                                                } else {
                                                    i14 = 0;
                                                    if (i14 > 0) {
                                                        i14 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i14) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                                        if (z11) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i12);
                                                        return;
                                                    }
                                                }
                                                i14 = (int) fraction;
                                                if (i14 > 0) {
                                                }
                                                if (measuredWidth < i14) {
                                                }
                                            }
                                        }
                                        z11 = false;
                                        if (z11) {
                                        }
                                    }
                                }
                                i16 = (int) fraction2;
                                if (i16 > 0) {
                                }
                            }
                        }
                        i12 = i10;
                        super.onMeasure(i11, i12);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z10) {
                            if (!z12) {
                            }
                            if (typedValue != null) {
                                if (i13 != 5) {
                                }
                                i14 = (int) fraction;
                                if (i14 > 0) {
                                }
                                if (measuredWidth < i14) {
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                }
            }
        }
        i11 = i3;
        z10 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i12 = i10;
        super.onMeasure(i11, i12);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z10) {
        }
        z11 = false;
        if (z11) {
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void setAttachListener(i0 i0Var) {
    }
}
