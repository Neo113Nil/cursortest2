package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import f.b0;
import f.r;
import j.m;
import k.g;
import k.g1;
import k.h1;
import k.k;
import k.z2;
import k0.l0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f227f;
    public TypedValue g;
    public TypedValue h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f228i;

    /* renamed from: j, reason: collision with root package name */
    public TypedValue f229j;

    /* renamed from: k, reason: collision with root package name */
    public TypedValue f230k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f231l;

    /* renamed from: m, reason: collision with root package name */
    public g1 f232m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f231l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f229j == null) {
            this.f229j = new TypedValue();
        }
        return this.f229j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f230k == null) {
            this.f230k = new TypedValue();
        }
        return this.f230k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f228i == null) {
            this.f228i = new TypedValue();
        }
        return this.f228i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f227f == null) {
            this.f227f = new TypedValue();
        }
        return this.f227f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g1 g1Var = this.f232m;
        if (g1Var != null) {
            g1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k kVar;
        super.onDetachedFromWindow();
        g1 g1Var = this.f232m;
        if (g1Var != null) {
            b0 b0Var = ((r) g1Var).g;
            h1 h1Var = b0Var.f1563w;
            if (h1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((z2) actionBarOverlayLayout.f202j).f2699a.f236f;
                if (actionMenuView != null && (kVar = actionMenuView.f223y) != null) {
                    kVar.c();
                    g gVar = kVar.f2584y;
                    if (gVar != null && gVar.b()) {
                        gVar.f2250j.dismiss();
                    }
                }
            }
            if (b0Var.B != null) {
                b0Var.f1557q.getDecorView().removeCallbacks(b0Var.C);
                if (b0Var.B.isShowing()) {
                    try {
                        b0Var.B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                b0Var.B = null;
            }
            l0 l0Var = b0Var.D;
            if (l0Var != null) {
                l0Var.b();
            }
            m mVar = b0Var.y(0).h;
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
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z3;
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
        boolean z4 = true;
        boolean z5 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        Rect rect = this.f231l;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z5 ? this.f228i : this.h;
            if (typedValue2 != null && (i12 = typedValue2.type) != 0) {
                if (i12 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i12 == 6) {
                    int i14 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i14, i14);
                } else {
                    i13 = 0;
                    if (i13 > 0) {
                        i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                        z3 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z5 ? this.f229j : this.f230k;
                            if (typedValue3 != null && (i10 = typedValue3.type) != 0) {
                                if (i10 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i10 == 6) {
                                    int i15 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i15, i15);
                                } else {
                                    i11 = 0;
                                    if (i11 > 0) {
                                        i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                                        super.onMeasure(i6, i7);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z3 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z5 ? this.g : this.f227f;
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
                                                        if (z4) {
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
                                        z4 = false;
                                        if (z4) {
                                        }
                                    }
                                }
                                i11 = (int) fraction2;
                                if (i11 > 0) {
                                }
                            }
                        }
                        i7 = i5;
                        super.onMeasure(i6, i7);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z3) {
                            if (!z5) {
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
                        z4 = false;
                        if (z4) {
                        }
                    }
                }
                i13 = (int) fraction3;
                if (i13 > 0) {
                }
            }
        }
        i6 = i4;
        z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i7 = i5;
        super.onMeasure(i6, i7);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z3) {
        }
        z4 = false;
        if (z4) {
        }
    }

    public void setAttachListener(g1 g1Var) {
        this.f232m = g1Var;
    }
}
