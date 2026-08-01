package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.b4;
import defpackage.e1;
import defpackage.ee;
import defpackage.i1;
import defpackage.mw;
import defpackage.n4;
import defpackage.s90;
import defpackage.wc0;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue f;
    public TypedValue g;
    public TypedValue h;
    public TypedValue i;
    public TypedValue j;
    public TypedValue k;
    public final Rect l;
    public ee m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.j == null) {
            this.j = new TypedValue();
        }
        return this.j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.k == null) {
            this.k = new TypedValue();
        }
        return this.k;
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
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
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
        ee eeVar = this.m;
        if (eeVar != null) {
            eeVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i1 i1Var;
        super.onDetachedFromWindow();
        ee eeVar = this.m;
        if (eeVar != null) {
            n4 n4Var = ((b4) eeVar).g;
            ActionBarOverlayLayout actionBarOverlayLayout = n4Var.v;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((s90) actionBarOverlayLayout.j).a.f;
                if (actionMenuView != null && (i1Var = actionMenuView.y) != null) {
                    i1Var.d();
                    e1 e1Var = i1Var.y;
                    if (e1Var != null && e1Var.b()) {
                        e1Var.j.dismiss();
                    }
                }
            }
            if (n4Var.A != null) {
                n4Var.q.getDecorView().removeCallbacks(n4Var.B);
                if (n4Var.A.isShowing()) {
                    try {
                        n4Var.A.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                n4Var.A = null;
            }
            wc0 wc0Var = n4Var.C;
            if (wc0Var != null) {
                wc0Var.b();
            }
            mw mwVar = n4Var.y(0).h;
            if (mwVar != null) {
                mwVar.c(true);
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
        Rect rect = this.l;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.i : this.h;
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
                            TypedValue typedValue3 = z3 ? this.j : this.k;
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
                                            typedValue = !z3 ? this.g : this.f;
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

    public void setAttachListener(ee eeVar) {
        this.m = eeVar;
    }
}
