package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.b3;
import defpackage.e3;
import defpackage.f20;
import defpackage.ff;
import defpackage.fk1;
import defpackage.ky2;
import defpackage.qf;
import defpackage.w53;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue m;
    public TypedValue n;
    public TypedValue o;
    public TypedValue p;
    public TypedValue q;
    public TypedValue r;
    public final Rect s;
    public f20 t;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.q == null) {
            this.q = new TypedValue();
        }
        return this.q;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.r == null) {
            this.r = new TypedValue();
        }
        return this.r;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        return this.o;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.p == null) {
            this.p = new TypedValue();
        }
        return this.p;
    }

    public TypedValue getMinWidthMajor() {
        if (this.m == null) {
            this.m = new TypedValue();
        }
        return this.m;
    }

    public TypedValue getMinWidthMinor() {
        if (this.n == null) {
            this.n = new TypedValue();
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f20 f20Var = this.t;
        if (f20Var != null) {
            f20Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e3 e3Var;
        super.onDetachedFromWindow();
        f20 f20Var = this.t;
        if (f20Var != null) {
            qf qfVar = ((ff) f20Var).n;
            ActionBarOverlayLayout actionBarOverlayLayout = qfVar.C;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((ky2) actionBarOverlayLayout.q).a.m;
                if (actionMenuView != null && (e3Var = actionMenuView.F) != null) {
                    e3Var.c();
                    b3 b3Var = e3Var.F;
                    if (b3Var != null && b3Var.b()) {
                        b3Var.i.dismiss();
                    }
                }
            }
            if (qfVar.H != null) {
                qfVar.x.getDecorView().removeCallbacks(qfVar.I);
                if (qfVar.H.isShowing()) {
                    try {
                        qfVar.H.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                qfVar.H = null;
            }
            w53 w53Var = qfVar.J;
            if (w53Var != null) {
                w53Var.b();
            }
            fk1 fk1Var = qfVar.C(0).h;
            if (fk1Var != null) {
                fk1Var.c(true);
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
        boolean z;
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
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.s;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.p : this.o;
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
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z3 ? this.q : this.r;
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
                                        if (!z && mode == Integer.MIN_VALUE) {
                                            typedValue = !z3 ? this.n : this.m;
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
                                                        if (z2) {
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
                                        z2 = false;
                                        if (z2) {
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
                        if (!z) {
                            if (!z3) {
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
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                }
            }
        }
        i3 = i;
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
        }
        z2 = false;
        if (z2) {
        }
    }

    public void setAttachListener(f20 f20Var) {
        this.t = f20Var;
    }
}
