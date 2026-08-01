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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class lr implements b30 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final g5 E;
    public final Context f;
    public ListAdapter g;
    public dg h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public ir s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final hr w = new hr(this, 1);
    public final kr x = new kr(0, this);
    public final jr y = new jr(this);
    public final hr z = new hr(this, 0);
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

    public lr(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, my.o, i, i2);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        g5 g5Var = new g5(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, my.s, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            g5Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        g5Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : l70.p(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = g5Var;
        g5Var.setInputMethodMode(1);
    }

    public dg a(Context context, boolean z) {
        return new dg(context, z);
    }

    @Override // defpackage.b30
    public final boolean b() {
        return this.E.isShowing();
    }

    public final int c() {
        return this.k;
    }

    @Override // defpackage.b30
    public final void d() {
        int i;
        int paddingBottom;
        dg dgVar;
        dg dgVar2 = this.h;
        Context context = this.f;
        g5 g5Var = this.E;
        if (dgVar2 == null) {
            dg a = a(context, !this.D);
            this.h = a;
            a.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new er(this));
            this.h.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            g5Var.setContentView(this.h);
        }
        Drawable background = g5Var.getBackground();
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
        int a2 = fr.a(g5Var, this.t, this.l, g5Var.getInputMethodMode() == 2);
        int i3 = this.i;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.j;
            int a3 = this.h.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = g5Var.getInputMethodMode() == 2;
        g5Var.setWindowLayoutType(this.m);
        if (g5Var.isShowing()) {
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
                        g5Var.setWidth(i6 == -1 ? -1 : 0);
                        g5Var.setHeight(0);
                    } else {
                        g5Var.setWidth(i6 == -1 ? -1 : 0);
                        g5Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                g5Var.setOutsideTouchable(true);
                int i7 = i5;
                View view = this.t;
                int i8 = this.k;
                int i9 = this.l;
                int i10 = i7 < 0 ? -1 : i7;
                if (i3 < 0) {
                    i3 = -1;
                }
                g5Var.update(view, i8, i9, i10, i3);
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
        g5Var.setWidth(i11);
        g5Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(g5Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            gr.b(g5Var, true);
        }
        g5Var.setOutsideTouchable(true);
        g5Var.setTouchInterceptor(this.x);
        if (this.p) {
            g5Var.setOverlapAnchor(this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(g5Var, this.C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            gr.a(g5Var, this.C);
        }
        g5Var.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (dgVar = this.h) != null) {
            dgVar.setListSelectionHidden(true);
            dgVar.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }

    @Override // defpackage.b30
    public final void dismiss() {
        g5 g5Var = this.E;
        g5Var.dismiss();
        g5Var.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.w);
    }

    public final Drawable e() {
        return this.E.getBackground();
    }

    @Override // defpackage.b30
    public final dg h() {
        return this.h;
    }

    public final void i(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
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
        ir irVar = this.s;
        if (irVar == null) {
            this.s = new ir(this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(irVar);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        dg dgVar = this.h;
        if (dgVar != null) {
            dgVar.setAdapter(this.g);
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
