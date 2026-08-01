package androidx.appcompat.widget;

import K.C0009e0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g.LayoutInflaterFactory2C0141C;
import g.s;
import k.MenuC0200m;
import l.C0260g;
import l.C0268k;
import l.InterfaceC0271l0;
import l.InterfaceC0273m0;
import l.e1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f1051a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1052b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1053c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f1054d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f1055e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1056f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1057g;
    public InterfaceC0271l0 h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1057g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1055e == null) {
            this.f1055e = new TypedValue();
        }
        return this.f1055e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1056f == null) {
            this.f1056f = new TypedValue();
        }
        return this.f1056f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1053c == null) {
            this.f1053c = new TypedValue();
        }
        return this.f1053c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1054d == null) {
            this.f1054d = new TypedValue();
        }
        return this.f1054d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1051a == null) {
            this.f1051a = new TypedValue();
        }
        return this.f1051a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1052b == null) {
            this.f1052b = new TypedValue();
        }
        return this.f1052b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0271l0 interfaceC0271l0 = this.h;
        if (interfaceC0271l0 != null) {
            interfaceC0271l0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0268k c0268k;
        super.onDetachedFromWindow();
        InterfaceC0271l0 interfaceC0271l0 = this.h;
        if (interfaceC0271l0 != null) {
            LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = ((s) interfaceC0271l0).f2593b;
            InterfaceC0273m0 interfaceC0273m0 = layoutInflaterFactory2C0141C.f2474r;
            if (interfaceC0273m0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0273m0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((e1) actionBarOverlayLayout.f1015e).f3352a.f1080a;
                if (actionMenuView != null && (c0268k = actionMenuView.f1040t) != null) {
                    c0268k.f();
                    C0260g c0260g = c0268k.f3403t;
                    if (c0260g != null && c0260g.b()) {
                        c0260g.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0141C.f2479w != null) {
                layoutInflaterFactory2C0141C.f2468l.getDecorView().removeCallbacks(layoutInflaterFactory2C0141C.f2480x);
                if (layoutInflaterFactory2C0141C.f2479w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0141C.f2479w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0141C.f2479w = null;
            }
            C0009e0 c0009e0 = layoutInflaterFactory2C0141C.f2481y;
            if (c0009e0 != null) {
                c0009e0.b();
            }
            MenuC0200m menuC0200m = layoutInflaterFactory2C0141C.A(0).h;
            if (menuC0200m != null) {
                menuC0200m.c(true);
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
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int measuredWidth;
        TypedValue typedValue;
        int i5;
        int i6;
        float fraction;
        int i7;
        int i8;
        float fraction2;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f1057g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z4 ? this.f1054d : this.f1053c;
            if (typedValue2 != null && (i9 = typedValue2.type) != 0) {
                if (i9 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i9 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i11, i11);
                } else {
                    i10 = 0;
                    if (i10 > 0) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z2 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z4 ? this.f1055e : this.f1056f;
                            if (typedValue3 != null && (i7 = typedValue3.type) != 0) {
                                if (i7 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i7 == 6) {
                                    int i12 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i12, i12);
                                } else {
                                    i8 = 0;
                                    if (i8 > 0) {
                                        i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                        super.onMeasure(i3, i4);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z2 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z4 ? this.f1052b : this.f1051a;
                                            if (typedValue != null && (i5 = typedValue.type) != 0) {
                                                if (i5 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i5 == 6) {
                                                    int i13 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i13, i13);
                                                } else {
                                                    i6 = 0;
                                                    if (i6 > 0) {
                                                        i6 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i6) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                                                        if (z3) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i4);
                                                        return;
                                                    }
                                                }
                                                i6 = (int) fraction;
                                                if (i6 > 0) {
                                                }
                                                if (measuredWidth < i6) {
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (z3) {
                                        }
                                    }
                                }
                                i8 = (int) fraction2;
                                if (i8 > 0) {
                                }
                            }
                        }
                        i4 = i2;
                        super.onMeasure(i3, i4);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z2) {
                            if (!z4) {
                            }
                            if (typedValue != null) {
                                if (i5 != 5) {
                                }
                                i6 = (int) fraction;
                                if (i6 > 0) {
                                }
                                if (measuredWidth < i6) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                }
            }
        }
        i3 = i;
        z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z2) {
        }
        z3 = false;
        if (z3) {
        }
    }

    public void setAttachListener(InterfaceC0271l0 interfaceC0271l0) {
        this.h = interfaceC0271l0;
    }
}
