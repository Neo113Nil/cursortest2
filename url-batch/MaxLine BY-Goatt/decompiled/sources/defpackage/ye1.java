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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ye1 implements cl2 {
    public static final Method L;
    public static final Method M;
    public View A;
    public AdapterView.OnItemClickListener B;
    public final Handler G;
    public Rect I;
    public boolean J;
    public final ag K;
    public final Context m;
    public ListAdapter n;
    public ne0 o;
    public int r;
    public int s;
    public boolean u;
    public boolean v;
    public boolean w;
    public ve1 z;
    public final int p = -2;
    public int q = -2;
    public final int t = 1002;
    public int x = 0;
    public final int y = Integer.MAX_VALUE;
    public final ue1 C = new ue1(this, 1);
    public final xe1 D = new xe1(this);
    public final we1 E = new we1(this);
    public final ue1 F = new ue1(this, 0);
    public final Rect H = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                L = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ye1(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.m = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b62.o, i, 0);
        this.r = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.u = true;
        }
        obtainStyledAttributes.recycle();
        ag agVar = new ag(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b62.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            agVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        agVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : j8.F(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.K = agVar;
        agVar.setInputMethodMode(1);
    }

    @Override // defpackage.cl2
    public final boolean a() {
        return this.K.isShowing();
    }

    public final int b() {
        return this.r;
    }

    @Override // defpackage.cl2
    public final void c() {
        int i;
        int paddingBottom;
        ne0 ne0Var;
        ne0 ne0Var2 = this.o;
        Context context = this.m;
        ag agVar = this.K;
        if (ne0Var2 == null) {
            ne0 q = q(context, !this.J);
            this.o = q;
            q.setAdapter(this.n);
            this.o.setOnItemClickListener(this.B);
            this.o.setFocusable(true);
            this.o.setFocusableInTouchMode(true);
            this.o.setOnItemSelectedListener(new re1(this));
            this.o.setOnScrollListener(this.E);
            agVar.setContentView(this.o);
        }
        Drawable background = agVar.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.u) {
                this.s = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a = se1.a(agVar, this.A, this.s, agVar.getInputMethodMode() == 2);
        int i3 = this.p;
        if (i3 == -1) {
            paddingBottom = a + i;
        } else {
            int i4 = this.q;
            int a2 = this.o.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a);
            paddingBottom = a2 + (a2 > 0 ? this.o.getPaddingBottom() + this.o.getPaddingTop() + i : 0);
        }
        boolean z = agVar.getInputMethodMode() == 2;
        agVar.setWindowLayoutType(this.t);
        if (agVar.isShowing()) {
            if (this.A.isAttachedToWindow()) {
                int i5 = this.q;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.A.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i6 = this.q;
                    if (z) {
                        agVar.setWidth(i6 == -1 ? -1 : 0);
                        agVar.setHeight(0);
                    } else {
                        agVar.setWidth(i6 == -1 ? -1 : 0);
                        agVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                agVar.setOutsideTouchable(true);
                int i7 = i5;
                View view = this.A;
                int i8 = this.r;
                int i9 = this.s;
                int i10 = i7 < 0 ? -1 : i7;
                if (i3 < 0) {
                    i3 = -1;
                }
                agVar.update(view, i8, i9, i10, i3);
                return;
            }
            return;
        }
        int i11 = this.q;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.A.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        agVar.setWidth(i11);
        agVar.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = L;
            if (method != null) {
                try {
                    method.invoke(agVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            te1.b(agVar, true);
        }
        agVar.setOutsideTouchable(true);
        agVar.setTouchInterceptor(this.D);
        if (this.w) {
            agVar.setOverlapAnchor(this.v);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = M;
            if (method2 != null) {
                try {
                    method2.invoke(agVar, this.I);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            te1.a(agVar, this.I);
        }
        agVar.showAsDropDown(this.A, this.r, this.s, this.x);
        this.o.setSelection(-1);
        if ((!this.J || this.o.isInTouchMode()) && (ne0Var = this.o) != null) {
            ne0Var.setListSelectionHidden(true);
            ne0Var.requestLayout();
        }
        if (this.J) {
            return;
        }
        this.G.post(this.F);
    }

    public final Drawable d() {
        return this.K.getBackground();
    }

    @Override // defpackage.cl2
    public final void dismiss() {
        ag agVar = this.K;
        agVar.dismiss();
        agVar.setContentView(null);
        this.o = null;
        this.G.removeCallbacks(this.C);
    }

    public final void g(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.cl2
    public final ne0 h() {
        return this.o;
    }

    public final void j(int i) {
        this.s = i;
        this.u = true;
    }

    public final void l(int i) {
        this.r = i;
    }

    public final int n() {
        if (this.u) {
            return this.s;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        ve1 ve1Var = this.z;
        if (ve1Var == null) {
            this.z = new ve1(this);
        } else {
            ListAdapter listAdapter2 = this.n;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(ve1Var);
            }
        }
        this.n = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.z);
        }
        ne0 ne0Var = this.o;
        if (ne0Var != null) {
            ne0Var.setAdapter(this.n);
        }
    }

    public ne0 q(Context context, boolean z) {
        return new ne0(context, z);
    }

    public final void r(int i) {
        Drawable background = this.K.getBackground();
        if (background == null) {
            this.q = i;
            return;
        }
        Rect rect = this.H;
        background.getPadding(rect);
        this.q = rect.left + rect.right + i;
    }
}
