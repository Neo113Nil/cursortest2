package androidx.appcompat.widget;

import M.W;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import h.p;
import h.z;
import m.MenuC0229m;
import n.C0274g;
import n.C0282k;
import n.InterfaceC0281j0;
import n.InterfaceC0283k0;
import n.i1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f1768a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1769b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1770c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f1771d;
    public TypedValue e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1772f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1773g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0281j0 f1774h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1773g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1772f == null) {
            this.f1772f = new TypedValue();
        }
        return this.f1772f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1770c == null) {
            this.f1770c = new TypedValue();
        }
        return this.f1770c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1771d == null) {
            this.f1771d = new TypedValue();
        }
        return this.f1771d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1768a == null) {
            this.f1768a = new TypedValue();
        }
        return this.f1768a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1769b == null) {
            this.f1769b = new TypedValue();
        }
        return this.f1769b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0281j0 interfaceC0281j0 = this.f1774h;
        if (interfaceC0281j0 != null) {
            interfaceC0281j0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0282k c0282k;
        super.onDetachedFromWindow();
        InterfaceC0281j0 interfaceC0281j0 = this.f1774h;
        if (interfaceC0281j0 != null) {
            z zVar = ((p) interfaceC0281j0).f2818b;
            InterfaceC0283k0 interfaceC0283k0 = zVar.f2884r;
            if (interfaceC0283k0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0283k0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((i1) actionBarOverlayLayout.e).f3637a.f1793a;
                if (actionMenuView != null && (c0282k = actionMenuView.f1757t) != null) {
                    c0282k.e();
                    C0274g c0274g = c0282k.f3666t;
                    if (c0274g != null && c0274g.b()) {
                        c0274g.i.dismiss();
                    }
                }
            }
            if (zVar.f2889w != null) {
                zVar.f2878l.getDecorView().removeCallbacks(zVar.f2890x);
                if (zVar.f2889w.isShowing()) {
                    try {
                        zVar.f2889w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                zVar.f2889w = null;
            }
            W w2 = zVar.f2891y;
            if (w2 != null) {
                w2.b();
            }
            MenuC0229m menuC0229m = zVar.y(0).f2834h;
            if (menuC0229m != null) {
                menuC0229m.c(true);
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
        Rect rect = this.f1773g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z4 ? this.f1771d : this.f1770c;
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
                            TypedValue typedValue3 = z4 ? this.e : this.f1772f;
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
                                            typedValue = !z4 ? this.f1769b : this.f1768a;
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

    public void setAttachListener(InterfaceC0281j0 interfaceC0281j0) {
        this.f1774h = interfaceC0281j0;
    }
}
