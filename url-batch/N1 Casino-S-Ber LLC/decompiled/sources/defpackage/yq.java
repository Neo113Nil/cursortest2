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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class yq implements q20 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final p4 E;
    public final Context f;
    public ListAdapter g;
    public lg h;
    public int k;
    public int l;
    public boolean n;
    public boolean o;
    public boolean p;
    public xd s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final int i = -2;
    public int j = -2;
    public final int m = 1002;
    public int q = 0;
    public final int r = Integer.MAX_VALUE;
    public final vq w = new vq(this, 1);
    public final xq x = new xq(0, this);
    public final wq y = new wq(this);
    public final vq z = new vq(this, 0);
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

    public yq(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wx.o, i, i2);
        this.k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.n = true;
        }
        obtainStyledAttributes.recycle();
        p4 p4Var = new p4(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, wx.s, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            p4Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        p4Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : zo.s(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = p4Var;
        p4Var.setInputMethodMode(1);
    }

    public lg a(Context context, boolean z) {
        return new lg(context, z);
    }

    @Override // defpackage.q20
    public final boolean b() {
        return this.E.isShowing();
    }

    public final int c() {
        return this.k;
    }

    @Override // defpackage.q20
    public final void d() {
        int i;
        int paddingBottom;
        lg lgVar;
        lg lgVar2 = this.h;
        Context context = this.f;
        p4 p4Var = this.E;
        if (lgVar2 == null) {
            lg a = a(context, !this.D);
            this.h = a;
            a.setAdapter(this.g);
            this.h.setOnItemClickListener(this.u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new sq(0, this));
            this.h.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            p4Var.setContentView(this.h);
        }
        Drawable background = p4Var.getBackground();
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
        int a2 = tq.a(p4Var, this.t, this.l, p4Var.getInputMethodMode() == 2);
        int i3 = this.i;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.j;
            int a3 = this.h.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z = p4Var.getInputMethodMode() == 2;
        p4Var.setWindowLayoutType(this.m);
        if (p4Var.isShowing()) {
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
                        p4Var.setWidth(i6 == -1 ? -1 : 0);
                        p4Var.setHeight(0);
                    } else {
                        p4Var.setWidth(i6 == -1 ? -1 : 0);
                        p4Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                p4Var.setOutsideTouchable(true);
                View view = this.t;
                int i7 = i5;
                int i8 = this.k;
                int i9 = this.l;
                int i10 = i7 < 0 ? -1 : i7;
                if (i3 < 0) {
                    i3 = -1;
                }
                p4Var.update(view, i8, i9, i10, i3);
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
        p4Var.setWidth(i11);
        p4Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(p4Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            uq.b(p4Var, true);
        }
        p4Var.setOutsideTouchable(true);
        p4Var.setTouchInterceptor(this.x);
        if (this.p) {
            p4Var.setOverlapAnchor(this.o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(p4Var, this.C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            uq.a(p4Var, this.C);
        }
        p4Var.showAsDropDown(this.t, this.k, this.l, this.q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (lgVar = this.h) != null) {
            lgVar.setListSelectionHidden(true);
            lgVar.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.z);
    }

    @Override // defpackage.q20
    public final void dismiss() {
        p4 p4Var = this.E;
        p4Var.dismiss();
        p4Var.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.w);
    }

    public final Drawable e() {
        return this.E.getBackground();
    }

    public final void g(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.q20
    public final lg h() {
        return this.h;
    }

    public final void i(int i) {
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
        xd xdVar = this.s;
        if (xdVar == null) {
            this.s = new xd(1, this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(xdVar);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        lg lgVar = this.h;
        if (lgVar != null) {
            lgVar.setAdapter(this.g);
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
