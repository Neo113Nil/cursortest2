package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dy;
import defpackage.gd;
import defpackage.jb;
import defpackage.kee;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public kee i;

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kee keeVar = this.i;
        if (keeVar != null) {
            Object obj = keeVar.a;
            dy dyVar = (dy) obj;
            jb jbVar = dyVar.q;
            if (jbVar != null) {
                jbVar.a();
            }
            if (dyVar.t != null) {
                dyVar.l.getDecorView().removeCallbacks(dyVar.u);
                if (dyVar.t.isShowing()) {
                    try {
                        ((dy) obj).t.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                dyVar.t = null;
            }
            dyVar.C();
            gd gdVar = dyVar.O(0).h;
            if (gdVar != null) {
                gdVar.i(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int measuredWidth;
        TypedValue typedValue;
        int i3;
        float fraction;
        int i4;
        float fraction2;
        int i5;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        boolean z3 = i6 < i7;
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.e : this.d;
            if (typedValue2 != null && typedValue2.type != 0) {
                if (typedValue2.type == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (typedValue2.type == 6) {
                    fraction3 = typedValue2.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                } else {
                    i5 = 0;
                    if (i5 > 0) {
                        Rect rect = this.h;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i5 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z3 ? this.f : this.g;
                            if (typedValue3 != null && typedValue3.type != 0) {
                                if (typedValue3.type == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (typedValue3.type == 6) {
                                    fraction2 = typedValue3.getFraction(displayMetrics.heightPixels, displayMetrics.heightPixels);
                                } else {
                                    i4 = 0;
                                    if (i4 > 0) {
                                        Rect rect2 = this.h;
                                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                    }
                                }
                                i4 = (int) fraction2;
                                if (i4 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i, i2);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z && mode == Integer.MIN_VALUE) {
                            typedValue = !z3 ? this.c : this.b;
                            if (typedValue != null && typedValue.type != 0) {
                                if (typedValue.type != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (typedValue.type == 6) {
                                    fraction = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
                                } else {
                                    i3 = 0;
                                    if (i3 > 0) {
                                        Rect rect3 = this.h;
                                        i3 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i3) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                        if (z2) {
                                            super.onMeasure(makeMeasureSpec, i2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i3 = (int) fraction;
                                if (i3 > 0) {
                                }
                                if (measuredWidth < i3) {
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                i5 = (int) fraction3;
                if (i5 > 0) {
                }
            }
        }
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i, i2);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
            if (!z3) {
            }
            if (typedValue != null) {
                if (typedValue.type != 5) {
                }
                i3 = (int) fraction;
                if (i3 > 0) {
                }
                if (measuredWidth < i3) {
                }
            }
        }
        z2 = false;
        if (z2) {
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
