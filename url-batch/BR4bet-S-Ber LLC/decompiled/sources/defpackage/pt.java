package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class pt implements s50 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final z4 E;
    public final Context f;
    public ListAdapter g;
    public mi h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public mt s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final lt w = new lt(this, 1);
    public final ot x = new ot(0, this);
    public final nt y = new nt(this);
    public final lt z = new lt(this, 0);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public pt(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z00.o, i, i2);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        z4 z4Var = new z4(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z00.s, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            z4Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        z4Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : mz.m(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = z4Var;
        z4Var.setInputMethodMode(1);
    }

    public mi a(Context context, boolean z) {
        return new mi(context, z);
    }

    @Override // defpackage.s50
    public final boolean b() {
        return this.E.isShowing();
    }

    public final int c() {
        return this.k;
    }

    @Override // defpackage.s50
    public final void d() {
        int i;
        int paddingBottom;
        mi miVar;
        mi miVar2 = this.h;
        Context context = this.f;
        z4 z4Var = this.E;
        if (miVar2 == null) {
            mi a = a(context, !this.D);
            this.h = a;
            a.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new ht(this));
            this.h.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            z4Var.setContentView(this.h);
        }
        Drawable background = z4Var.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.n) {
                this.l = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = jt.a(z4Var, this.t, this.l, z4Var.getInputMethodMode() == 2);
        int i3 = this.i;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.j;
            int a3 = this.h.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = z4Var.getInputMethodMode() == 2;
        z4Var.setWindowLayoutType(this.m);
        if (z4Var.isShowing()) {
            if (this.t.isAttachedToWindow()) {
                int i5 = this.j;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.t.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i6 = this.j;
                    if (z) {
                        z4Var.setWidth(i6 == -1 ? -1 : 0);
                        z4Var.setHeight(0);
                    } else {
                        z4Var.setWidth(i6 == -1 ? -1 : 0);
                        z4Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                z4Var.setOutsideTouchable(true);
                int i7 = i5;
                View view = this.t;
                int i8 = this.k;
                int i9 = this.l;
                int i10 = i7 < 0 ? -1 : i7;
                if (i3 < 0) {
                    i3 = -1;
                }
                z4Var.update(view, i8, i9, i10, i3);
                return;
            }
            return;
        }
        int i11 = this.j;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.t.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        z4Var.setWidth(i11);
        z4Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(z4Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            kt.b(z4Var, true);
        }
        z4Var.setOutsideTouchable(true);
        z4Var.setTouchInterceptor(this.x);
        if (this.p) {
            z4Var.setOverlapAnchor(this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(z4Var, this.C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            kt.a(z4Var, this.C);
        }
        z4Var.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (miVar = this.h) != null) {
            miVar.setListSelectionHidden(true);
            miVar.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }

    @Override // defpackage.s50
    public final void dismiss() {
        z4 z4Var = this.E;
        z4Var.dismiss();
        z4Var.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.w);
    }

    public final Drawable e() {
        return this.E.getBackground();
    }

    public final void g(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.s50
    public final mi i() {
        return this.h;
    }

    public final void k(int i) {
        this.l = i;
        this.n = true;
    }

    public final void m(int i) {
        this.k = i;
    }

    public final int o() {
        if (this.n) {
            return this.l;
        }
        return 0;
    }

    public void q(ListAdapter listAdapter) {
        mt mtVar = this.s;
        if (mtVar == null) {
            this.s = new mt(this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(mtVar);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        mi miVar = this.h;
        if (miVar != null) {
            miVar.setAdapter(this.g);
        }
    }

    public final void r(int i) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.j = i;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.j = rect.left + rect.right + i;
    }
}
