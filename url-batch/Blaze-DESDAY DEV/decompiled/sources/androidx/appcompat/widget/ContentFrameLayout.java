package androidx.appcompat.widget;

import K.C0005c0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import g.LayoutInflaterFactory2C0092A;
import g.q;
import k.MenuC0166m;
import l.C0211g;
import l.C0219k;
import l.InterfaceC0218j0;
import l.InterfaceC0220k0;
import l.d1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f1349a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f1350b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1351c;
    public TypedValue d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f1352e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f1353f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f1354g;
    public InterfaceC0218j0 h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1354g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1352e == null) {
            this.f1352e = new TypedValue();
        }
        return this.f1352e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1353f == null) {
            this.f1353f = new TypedValue();
        }
        return this.f1353f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1351c == null) {
            this.f1351c = new TypedValue();
        }
        return this.f1351c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1349a == null) {
            this.f1349a = new TypedValue();
        }
        return this.f1349a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1350b == null) {
            this.f1350b = new TypedValue();
        }
        return this.f1350b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0218j0 interfaceC0218j0 = this.h;
        if (interfaceC0218j0 != null) {
            interfaceC0218j0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0219k c0219k;
        super.onDetachedFromWindow();
        InterfaceC0218j0 interfaceC0218j0 = this.h;
        if (interfaceC0218j0 != null) {
            LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = ((q) interfaceC0218j0).f2273b;
            InterfaceC0220k0 interfaceC0220k0 = layoutInflaterFactory2C0092A.f2166r;
            if (interfaceC0220k0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0220k0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((d1) actionBarOverlayLayout.f1314e).f2923a.f1374a;
                if (actionMenuView != null && (c0219k = actionMenuView.f1338t) != null) {
                    c0219k.e();
                    C0211g c0211g = c0219k.f2973t;
                    if (c0211g != null && c0211g.b()) {
                        c0211g.i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0092A.f2171w != null) {
                layoutInflaterFactory2C0092A.f2160l.getDecorView().removeCallbacks(layoutInflaterFactory2C0092A.f2172x);
                if (layoutInflaterFactory2C0092A.f2171w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0092A.f2171w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0092A.f2171w = null;
            }
            C0005c0 c0005c0 = layoutInflaterFactory2C0092A.f2173y;
            if (c0005c0 != null) {
                c0005c0.b();
            }
            MenuC0166m menuC0166m = layoutInflaterFactory2C0092A.y(0).h;
            if (menuC0166m != null) {
                menuC0166m.c(true);
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
        Rect rect = this.f1354g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z4 ? this.d : this.f1351c;
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
                            TypedValue typedValue3 = z4 ? this.f1352e : this.f1353f;
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
                                            typedValue = !z4 ? this.f1350b : this.f1349a;
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

    public void setAttachListener(InterfaceC0218j0 interfaceC0218j0) {
        this.h = interfaceC0218j0;
    }
}
