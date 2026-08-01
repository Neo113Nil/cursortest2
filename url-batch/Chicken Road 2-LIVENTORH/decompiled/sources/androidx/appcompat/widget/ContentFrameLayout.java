package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g.c0;
import g.r;
import k.m;
import l.d3;
import l.g;
import l.j1;
import l.k1;
import l.l;
import n0.p0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f208f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f209g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f210h;
    public TypedValue i;

    /* renamed from: j, reason: collision with root package name */
    public TypedValue f211j;

    /* renamed from: k, reason: collision with root package name */
    public TypedValue f212k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f213l;

    /* renamed from: m, reason: collision with root package name */
    public j1 f214m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f213l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f211j == null) {
            this.f211j = new TypedValue();
        }
        return this.f211j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f212k == null) {
            this.f212k = new TypedValue();
        }
        return this.f212k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f210h == null) {
            this.f210h = new TypedValue();
        }
        return this.f210h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.i == null) {
            this.i = new TypedValue();
        }
        return this.i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f208f == null) {
            this.f208f = new TypedValue();
        }
        return this.f208f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f209g == null) {
            this.f209g = new TypedValue();
        }
        return this.f209g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j1 j1Var = this.f214m;
        if (j1Var != null) {
            j1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        l lVar;
        super.onDetachedFromWindow();
        j1 j1Var = this.f214m;
        if (j1Var != null) {
            c0 c0Var = ((r) j1Var).f1687g;
            k1 k1Var = c0Var.f1602w;
            if (k1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((d3) actionBarOverlayLayout.f181j).f2269a.f218f;
                if (actionMenuView != null && (lVar = actionMenuView.f202y) != null) {
                    lVar.f();
                    g gVar = lVar.f2378z;
                    if (gVar != null && gVar.b()) {
                        gVar.i.dismiss();
                    }
                }
            }
            if (c0Var.B != null) {
                c0Var.f1596q.getDecorView().removeCallbacks(c0Var.C);
                if (c0Var.B.isShowing()) {
                    try {
                        c0Var.B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                c0Var.B = null;
            }
            p0 p0Var = c0Var.D;
            if (p0Var != null) {
                p0Var.b();
            }
            m mVar = c0Var.y(0).f1572h;
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
        boolean z3;
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
        boolean z4 = true;
        boolean z5 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f213l;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z5 ? this.i : this.f210h;
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
                        z3 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z5 ? this.f211j : this.f212k;
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
                                        if (!z3 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z5 ? this.f209g : this.f208f;
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
                                                        if (z4) {
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
                                        z4 = false;
                                        if (z4) {
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
                        if (!z3) {
                            if (!z5) {
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
                        z4 = false;
                        if (z4) {
                        }
                    }
                }
                i12 = (int) fraction3;
                if (i12 > 0) {
                }
            }
        }
        i5 = i;
        z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i6 = i4;
        super.onMeasure(i5, i6);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z3) {
        }
        z4 = false;
        if (z4) {
        }
    }

    public void setAttachListener(j1 j1Var) {
        this.f214m = j1Var;
    }
}
