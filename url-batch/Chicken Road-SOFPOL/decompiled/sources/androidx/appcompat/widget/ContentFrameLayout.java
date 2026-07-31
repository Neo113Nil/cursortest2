package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import l.p0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f411d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f412e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f413f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f414g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f415h;
    public TypedValue i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f416j;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f416j = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f415h == null) {
            this.f415h = new TypedValue();
        }
        return this.f415h;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f413f == null) {
            this.f413f = new TypedValue();
        }
        return this.f413f;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f414g == null) {
            this.f414g = new TypedValue();
        }
        return this.f414g;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f411d == null) {
            this.f411d = new TypedValue();
        }
        return this.f411d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f412e == null) {
            this.f412e = new TypedValue();
        }
        return this.f412e;
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
    public final void onMeasure(int i, int i8) {
        int i9;
        boolean z3;
        int i10;
        int measuredWidth;
        TypedValue typedValue;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z7 = true;
        boolean z8 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        Rect rect = this.f416j;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z8 ? this.f414g : this.f413f;
            if (typedValue2 != null && (i15 = typedValue2.type) != 0) {
                if (i15 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i15 == 6) {
                    int i17 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i17, i17);
                } else {
                    i16 = 0;
                    if (i16 > 0) {
                        i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z3 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z8 ? this.f415h : this.i;
                            if (typedValue3 != null && (i13 = typedValue3.type) != 0) {
                                if (i13 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i13 == 6) {
                                    int i18 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i18, i18);
                                } else {
                                    i14 = 0;
                                    if (i14 > 0) {
                                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                                        super.onMeasure(i9, i10);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z3 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z8 ? this.f412e : this.f411d;
                                            if (typedValue != null && (i11 = typedValue.type) != 0) {
                                                if (i11 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i11 == 6) {
                                                    int i19 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i19, i19);
                                                } else {
                                                    i12 = 0;
                                                    if (i12 > 0) {
                                                        i12 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i12) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                                                        if (z7) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i10);
                                                        return;
                                                    }
                                                }
                                                i12 = (int) fraction;
                                                if (i12 > 0) {
                                                }
                                                if (measuredWidth < i12) {
                                                }
                                            }
                                        }
                                        z7 = false;
                                        if (z7) {
                                        }
                                    }
                                }
                                i14 = (int) fraction2;
                                if (i14 > 0) {
                                }
                            }
                        }
                        i10 = i8;
                        super.onMeasure(i9, i10);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z3) {
                            if (!z8) {
                            }
                            if (typedValue != null) {
                                if (i11 != 5) {
                                }
                                i12 = (int) fraction;
                                if (i12 > 0) {
                                }
                                if (measuredWidth < i12) {
                                }
                            }
                        }
                        z7 = false;
                        if (z7) {
                        }
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                }
            }
        }
        i9 = i;
        z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i10 = i8;
        super.onMeasure(i9, i10);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z3) {
        }
        z7 = false;
        if (z7) {
        }
    }

    public void setAttachListener(p0 p0Var) {
    }
}
