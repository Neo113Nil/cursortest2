package k;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class c2 implements j.c0 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final z E;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2508f;
    public ListAdapter g;
    public p1 h;

    /* renamed from: k, reason: collision with root package name */
    public int f2511k;

    /* renamed from: l, reason: collision with root package name */
    public int f2512l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2514n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2515o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2516p;

    /* renamed from: s, reason: collision with root package name */
    public z1 f2519s;

    /* renamed from: t, reason: collision with root package name */
    public View f2520t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2521u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2522v;

    /* renamed from: i, reason: collision with root package name */
    public final int f2509i = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f2510j = -2;

    /* renamed from: m, reason: collision with root package name */
    public final int f2513m = 1002;

    /* renamed from: q, reason: collision with root package name */
    public int f2517q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int f2518r = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public final y1 f2523w = new y1(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final b2 f2524x = new b2(this);

    /* renamed from: y, reason: collision with root package name */
    public final a2 f2525y = new a2(this);

    /* renamed from: z, reason: collision with root package name */
    public final y1 f2526z = new y1(this, 0);
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

    public c2(Context context, AttributeSet attributeSet, int i4, int i5) {
        int resourceId;
        this.f2508f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f1506o, i4, i5);
        this.f2511k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2512l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2514n = true;
        }
        obtainStyledAttributes.recycle();
        z zVar = new z(context, attributeSet, i4, i5);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e.a.f1510s, i4, i5);
        if (obtainStyledAttributes2.hasValue(2)) {
            zVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        zVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : k3.m.w(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = zVar;
        zVar.setInputMethodMode(1);
    }

    public final int a() {
        return this.f2511k;
    }

    @Override // j.c0
    public final boolean b() {
        return this.E.isShowing();
    }

    @Override // j.c0
    public final void c() {
        int i4;
        int paddingBottom;
        p1 p1Var;
        p1 p1Var2 = this.h;
        Context context = this.f2508f;
        z zVar = this.E;
        if (p1Var2 == null) {
            p1 q4 = q(context, !this.D);
            this.h = q4;
            q4.setAdapter(this.g);
            this.h.setOnItemClickListener(this.f2521u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new v1(this));
            this.h.setOnScrollListener(this.f2525y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2522v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            zVar.setContentView(this.h);
        }
        Drawable background = zVar.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i4 = rect.bottom + i5;
            if (!this.f2514n) {
                this.f2512l = -i5;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        int a4 = w1.a(zVar, this.f2520t, this.f2512l, zVar.getInputMethodMode() == 2);
        int i6 = this.f2509i;
        if (i6 == -1) {
            paddingBottom = a4 + i4;
        } else {
            int i7 = this.f2510j;
            int a5 = this.h.a(i7 != -2 ? i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a4);
            paddingBottom = a5 + (a5 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i4 : 0);
        }
        boolean z3 = zVar.getInputMethodMode() == 2;
        zVar.setWindowLayoutType(this.f2513m);
        if (zVar.isShowing()) {
            if (this.f2520t.isAttachedToWindow()) {
                int i8 = this.f2510j;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.f2520t.getWidth();
                }
                if (i6 == -1) {
                    i6 = z3 ? paddingBottom : -1;
                    if (z3) {
                        zVar.setWidth(this.f2510j == -1 ? -1 : 0);
                        zVar.setHeight(0);
                    } else {
                        zVar.setWidth(this.f2510j == -1 ? -1 : 0);
                        zVar.setHeight(-1);
                    }
                } else if (i6 == -2) {
                    i6 = paddingBottom;
                }
                zVar.setOutsideTouchable(true);
                int i9 = i8;
                View view = this.f2520t;
                int i10 = this.f2511k;
                int i11 = this.f2512l;
                int i12 = i9 < 0 ? -1 : i9;
                if (i6 < 0) {
                    i6 = -1;
                }
                zVar.update(view, i10, i11, i12, i6);
                return;
            }
            return;
        }
        int i13 = this.f2510j;
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = this.f2520t.getWidth();
        }
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = paddingBottom;
        }
        zVar.setWidth(i13);
        zVar.setHeight(i6);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(zVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            x1.b(zVar, true);
        }
        zVar.setOutsideTouchable(true);
        zVar.setTouchInterceptor(this.f2524x);
        if (this.f2516p) {
            zVar.setOverlapAnchor(this.f2515o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(zVar, this.C);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            x1.a(zVar, this.C);
        }
        zVar.showAsDropDown(this.f2520t, this.f2511k, this.f2512l, this.f2517q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (p1Var = this.h) != null) {
            p1Var.setListSelectionHidden(true);
            p1Var.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.f2526z);
    }

    public final Drawable d() {
        return this.E.getBackground();
    }

    @Override // j.c0
    public final void dismiss() {
        z zVar = this.E;
        zVar.dismiss();
        zVar.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.f2523w);
    }

    @Override // j.c0
    public final p1 f() {
        return this.h;
    }

    public final void h(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void i(int i4) {
        this.f2512l = i4;
        this.f2514n = true;
    }

    public final void l(int i4) {
        this.f2511k = i4;
    }

    public final int n() {
        if (this.f2514n) {
            return this.f2512l;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        z1 z1Var = this.f2519s;
        if (z1Var == null) {
            this.f2519s = new z1(this);
        } else {
            ListAdapter listAdapter2 = this.g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(z1Var);
            }
        }
        this.g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2519s);
        }
        p1 p1Var = this.h;
        if (p1Var != null) {
            p1Var.setAdapter(this.g);
        }
    }

    public p1 q(Context context, boolean z3) {
        return new p1(context, z3);
    }

    public final void r(int i4) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.f2510j = i4;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.f2510j = rect.left + rect.right + i4;
    }
}
