package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g.a0;
import g.q;
import k.m;
import l.a3;
import l.f;
import l.g1;
import l.h1;
import l.j;
import n0.t0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f336f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f337g;
    public TypedValue h;
    public TypedValue i;

    /* renamed from: j, reason: collision with root package name */
    public TypedValue f338j;

    /* renamed from: k, reason: collision with root package name */
    public TypedValue f339k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f340l;

    /* renamed from: m, reason: collision with root package name */
    public g1 f341m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f340l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f338j == null) {
            this.f338j = new TypedValue();
        }
        return this.f338j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f339k == null) {
            this.f339k = new TypedValue();
        }
        return this.f339k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f336f == null) {
            this.f336f = new TypedValue();
        }
        return this.f336f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f337g == null) {
            this.f337g = new TypedValue();
        }
        return this.f337g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g1 g1Var = this.f341m;
        if (g1Var != null) {
            g1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        g1 g1Var = this.f341m;
        if (g1Var != null) {
            a0 a0Var = ((q) g1Var).f1567g;
            h1 h1Var = a0Var.f1466w;
            if (h1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) h1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((a3) actionBarOverlayLayout.f310j).f2391a.f345f;
                if (actionMenuView != null && (jVar = actionMenuView.f331y) != null) {
                    jVar.e();
                    f fVar = jVar.f2479y;
                    if (fVar != null && fVar.b()) {
                        fVar.f2273j.dismiss();
                    }
                }
            }
            if (a0Var.B != null) {
                a0Var.f1460q.getDecorView().removeCallbacks(a0Var.C);
                if (a0Var.B.isShowing()) {
                    try {
                        a0Var.B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                a0Var.B = null;
            }
            t0 t0Var = a0Var.D;
            if (t0Var != null) {
                t0Var.b();
            }
            m mVar = a0Var.x(0).h;
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
    public final void onMeasure(int i, int i4) {
        int i5;
        boolean z4;
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
        boolean z5 = true;
        boolean z6 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f340l;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z6 ? this.i : this.h;
            if (typedValue2 != null && (i11 = typedValue2.type) != 0) {
                if (i11 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i11 == 6) {
                    int i13 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i13, i13);
                } else {
                    i12 = 0;
                    if (i12 > 0) {
                        i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z4 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z6 ? this.f338j : this.f339k;
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
                                        if (!z4 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z6 ? this.f337g : this.f336f;
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
                                                        if (z5) {
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
                                        z5 = false;
                                        if (z5) {
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
                        if (!z4) {
                            if (!z6) {
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
                        z5 = false;
                        if (z5) {
                        }
                    }
                }
                i12 = (int) fraction3;
                if (i12 > 0) {
                }
            }
        }
        i5 = i;
        z4 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i6 = i4;
        super.onMeasure(i5, i6);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z4) {
        }
        z5 = false;
        if (z5) {
        }
    }

    public void setAttachListener(g1 g1Var) {
        this.f341m = g1Var;
    }
}
