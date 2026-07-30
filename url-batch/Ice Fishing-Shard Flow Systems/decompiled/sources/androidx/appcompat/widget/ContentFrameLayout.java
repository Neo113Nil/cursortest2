package androidx.appcompat.widget;

import I.Y;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import i.C0532s;
import i.LayoutInflaterFactory2C0500B;
import m.m;
import n.C0708f;
import n.C0716j;
import n.InterfaceC0721l0;
import n.InterfaceC0723m0;
import n.s1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f3211d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f3212e;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f3213i;

    /* renamed from: l, reason: collision with root package name */
    public TypedValue f3214l;

    /* renamed from: m, reason: collision with root package name */
    public TypedValue f3215m;

    /* renamed from: n, reason: collision with root package name */
    public TypedValue f3216n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3217o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0721l0 f3218p;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3217o = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3215m == null) {
            this.f3215m = new TypedValue();
        }
        return this.f3215m;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3216n == null) {
            this.f3216n = new TypedValue();
        }
        return this.f3216n;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3213i == null) {
            this.f3213i = new TypedValue();
        }
        return this.f3213i;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3214l == null) {
            this.f3214l = new TypedValue();
        }
        return this.f3214l;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3211d == null) {
            this.f3211d = new TypedValue();
        }
        return this.f3211d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3212e == null) {
            this.f3212e = new TypedValue();
        }
        return this.f3212e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0721l0 interfaceC0721l0 = this.f3218p;
        if (interfaceC0721l0 != null) {
            interfaceC0721l0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0716j c0716j;
        super.onDetachedFromWindow();
        InterfaceC0721l0 interfaceC0721l0 = this.f3218p;
        if (interfaceC0721l0 != null) {
            LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = ((C0532s) interfaceC0721l0).f5482d;
            InterfaceC0723m0 interfaceC0723m0 = layoutInflaterFactory2C0500B.f5353z;
            if (interfaceC0723m0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0723m0;
                actionBarOverlayLayout.e();
                ActionMenuView actionMenuView = ((s1) actionBarOverlayLayout.f3181m).f6886a.f3332d;
                if (actionMenuView != null && (c0716j = actionMenuView.f3196B) != null) {
                    c0716j.c();
                    C0708f c0708f = c0716j.f6794B;
                    if (c0708f != null && c0708f.b()) {
                        c0708f.f6484i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0500B.f5309E != null) {
                layoutInflaterFactory2C0500B.f5347t.getDecorView().removeCallbacks(layoutInflaterFactory2C0500B.f5310F);
                if (layoutInflaterFactory2C0500B.f5309E.isShowing()) {
                    try {
                        layoutInflaterFactory2C0500B.f5309E.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0500B.f5309E = null;
            }
            Y y7 = layoutInflaterFactory2C0500B.f5311G;
            if (y7 != null) {
                y7.b();
            }
            m mVar = layoutInflaterFactory2C0500B.A(0).f5294h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
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
    public final void onMeasure(int i2, int i5) {
        int i7;
        boolean z7;
        int i8;
        int measuredWidth;
        TypedValue typedValue;
        int i9;
        int i10;
        float fraction;
        int i11;
        int i12;
        float fraction2;
        int i13;
        int i14;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z8 = true;
        boolean z9 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i5);
        Rect rect = this.f3217o;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z9 ? this.f3214l : this.f3213i;
            if (typedValue2 != null && (i13 = typedValue2.type) != 0) {
                if (i13 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i13 == 6) {
                    int i15 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i15, i15);
                } else {
                    i14 = 0;
                    if (i14 > 0) {
                        i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z7 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z9 ? this.f3215m : this.f3216n;
                            if (typedValue3 != null && (i11 = typedValue3.type) != 0) {
                                if (i11 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i11 == 6) {
                                    int i16 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i16, i16);
                                } else {
                                    i12 = 0;
                                    if (i12 > 0) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                                        super.onMeasure(i7, i8);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z7 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z9 ? this.f3212e : this.f3211d;
                                            if (typedValue != null && (i9 = typedValue.type) != 0) {
                                                if (i9 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i9 == 6) {
                                                    int i17 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i17, i17);
                                                } else {
                                                    i10 = 0;
                                                    if (i10 > 0) {
                                                        i10 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i10) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                                                        if (z8) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i8);
                                                        return;
                                                    }
                                                }
                                                i10 = (int) fraction;
                                                if (i10 > 0) {
                                                }
                                                if (measuredWidth < i10) {
                                                }
                                            }
                                        }
                                        z8 = false;
                                        if (z8) {
                                        }
                                    }
                                }
                                i12 = (int) fraction2;
                                if (i12 > 0) {
                                }
                            }
                        }
                        i8 = i5;
                        super.onMeasure(i7, i8);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z7) {
                            if (!z9) {
                            }
                            if (typedValue != null) {
                                if (i9 != 5) {
                                }
                                i10 = (int) fraction;
                                if (i10 > 0) {
                                }
                                if (measuredWidth < i10) {
                                }
                            }
                        }
                        z8 = false;
                        if (z8) {
                        }
                    }
                }
                i14 = (int) fraction3;
                if (i14 > 0) {
                }
            }
        }
        i7 = i2;
        z7 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i8 = i5;
        super.onMeasure(i7, i8);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z7) {
        }
        z8 = false;
        if (z8) {
        }
    }

    public void setAttachListener(InterfaceC0721l0 interfaceC0721l0) {
        this.f3218p = interfaceC0721l0;
    }
}
