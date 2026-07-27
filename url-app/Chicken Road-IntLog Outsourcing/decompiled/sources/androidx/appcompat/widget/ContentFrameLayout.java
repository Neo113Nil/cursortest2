package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import l.InterfaceC1248u;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f4167a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f4168b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4169c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f4170d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f4171e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f4172f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4173g;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4173g = new Rect();
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4171e == null) {
            this.f4171e = new TypedValue();
        }
        return this.f4171e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4172f == null) {
            this.f4172f = new TypedValue();
        }
        return this.f4172f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4169c == null) {
            this.f4169c = new TypedValue();
        }
        return this.f4169c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4170d == null) {
            this.f4170d = new TypedValue();
        }
        return this.f4170d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4167a == null) {
            this.f4167a = new TypedValue();
        }
        return this.f4167a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4168b == null) {
            this.f4168b = new TypedValue();
        }
        return this.f4168b;
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
    public final void onMeasure(int i2, int i3) {
        int i6;
        boolean z;
        int i7;
        int measuredWidth;
        TypedValue typedValue;
        int i8;
        int i9;
        float fraction;
        int i10;
        int i11;
        float fraction2;
        int i12;
        int i13;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z5 = true;
        boolean z6 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        Rect rect = this.f4173g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z6 ? this.f4170d : this.f4169c;
            if (typedValue2 != null && (i12 = typedValue2.type) != 0) {
                if (i12 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i12 == 6) {
                    int i14 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i14, i14);
                } else {
                    i13 = 0;
                    if (i13 > 0) {
                        i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z6 ? this.f4171e : this.f4172f;
                            if (typedValue3 != null && (i10 = typedValue3.type) != 0) {
                                if (i10 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i10 == 6) {
                                    int i15 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i15, i15);
                                } else {
                                    i11 = 0;
                                    if (i11 > 0) {
                                        i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                                        super.onMeasure(i6, i7);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z && mode == Integer.MIN_VALUE) {
                                            typedValue = !z6 ? this.f4168b : this.f4167a;
                                            if (typedValue != null && (i8 = typedValue.type) != 0) {
                                                if (i8 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i8 == 6) {
                                                    int i16 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i16, i16);
                                                } else {
                                                    i9 = 0;
                                                    if (i9 > 0) {
                                                        i9 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i9) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                                                        if (z5) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i7);
                                                        return;
                                                    }
                                                }
                                                i9 = (int) fraction;
                                                if (i9 > 0) {
                                                }
                                                if (measuredWidth < i9) {
                                                }
                                            }
                                        }
                                        z5 = false;
                                        if (z5) {
                                        }
                                    }
                                }
                                i11 = (int) fraction2;
                                if (i11 > 0) {
                                }
                            }
                        }
                        i7 = i3;
                        super.onMeasure(i6, i7);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z) {
                            if (!z6) {
                            }
                            if (typedValue != null) {
                                if (i8 != 5) {
                                }
                                i9 = (int) fraction;
                                if (i9 > 0) {
                                }
                                if (measuredWidth < i9) {
                                }
                            }
                        }
                        z5 = false;
                        if (z5) {
                        }
                    }
                }
                i13 = (int) fraction3;
                if (i13 > 0) {
                }
            }
        }
        i6 = i2;
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i7 = i3;
        super.onMeasure(i6, i7);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
        }
        z5 = false;
        if (z5) {
        }
    }

    public void setAttachListener(InterfaceC1248u interfaceC1248u) {
    }
}
