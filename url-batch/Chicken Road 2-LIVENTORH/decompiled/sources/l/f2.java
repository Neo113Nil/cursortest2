package l;

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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class f2 implements k.c0 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final b0 E;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2284f;

    /* renamed from: g, reason: collision with root package name */
    public ListAdapter f2285g;

    /* renamed from: h, reason: collision with root package name */
    public s1 f2286h;

    /* renamed from: k, reason: collision with root package name */
    public int f2288k;

    /* renamed from: l, reason: collision with root package name */
    public int f2289l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2291n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2292o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2293p;

    /* renamed from: s, reason: collision with root package name */
    public c2 f2296s;

    /* renamed from: t, reason: collision with root package name */
    public View f2297t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2298u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2299v;
    public final int i = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f2287j = -2;

    /* renamed from: m, reason: collision with root package name */
    public final int f2290m = 1002;

    /* renamed from: q, reason: collision with root package name */
    public int f2294q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int f2295r = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public final b2 f2300w = new b2(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final e2 f2301x = new e2(this);

    /* renamed from: y, reason: collision with root package name */
    public final d2 f2302y = new d2(this);

    /* renamed from: z, reason: collision with root package name */
    public final b2 f2303z = new b2(this, 0);
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

    public f2(Context context, AttributeSet attributeSet, int i, int i4) {
        int resourceId;
        this.f2284f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1252o, i, 0);
        this.f2288k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2289l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2291n = true;
        }
        obtainStyledAttributes.recycle();
        b0 b0Var = new b0(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1256s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            b0Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        b0Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : h.a.x(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = b0Var;
        b0Var.setInputMethodMode(1);
    }

    public final void a(int i) {
        this.f2288k = i;
    }

    @Override // k.c0
    public final boolean b() {
        return this.E.isShowing();
    }

    public final int d() {
        return this.f2288k;
    }

    @Override // k.c0
    public final void dismiss() {
        b0 b0Var = this.E;
        b0Var.dismiss();
        b0Var.setContentView(null);
        this.f2286h = null;
        this.A.removeCallbacks(this.f2300w);
    }

    @Override // k.c0
    public final void f() {
        int i;
        int paddingBottom;
        s1 s1Var;
        s1 s1Var2 = this.f2286h;
        Context context = this.f2284f;
        b0 b0Var = this.E;
        if (s1Var2 == null) {
            s1 q3 = q(context, !this.D);
            this.f2286h = q3;
            q3.setAdapter(this.f2285g);
            this.f2286h.setOnItemClickListener(this.f2298u);
            this.f2286h.setFocusable(true);
            this.f2286h.setFocusableInTouchMode(true);
            this.f2286h.setOnItemSelectedListener(new y1(this));
            this.f2286h.setOnScrollListener(this.f2302y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2299v;
            if (onItemSelectedListener != null) {
                this.f2286h.setOnItemSelectedListener(onItemSelectedListener);
            }
            b0Var.setContentView(this.f2286h);
        }
        Drawable background = b0Var.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.f2291n) {
                this.f2289l = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = z1.a(b0Var, this.f2297t, this.f2289l, b0Var.getInputMethodMode() == 2);
        int i5 = this.i;
        if (i5 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i6 = this.f2287j;
            int a4 = this.f2286h.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a4 + (a4 > 0 ? this.f2286h.getPaddingBottom() + this.f2286h.getPaddingTop() + i : 0);
        }
        boolean z3 = b0Var.getInputMethodMode() == 2;
        b0Var.setWindowLayoutType(this.f2290m);
        if (b0Var.isShowing()) {
            if (this.f2297t.isAttachedToWindow()) {
                int i7 = this.f2287j;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f2297t.getWidth();
                }
                if (i5 == -1) {
                    i5 = z3 ? paddingBottom : -1;
                    if (z3) {
                        b0Var.setWidth(this.f2287j == -1 ? -1 : 0);
                        b0Var.setHeight(0);
                    } else {
                        b0Var.setWidth(this.f2287j == -1 ? -1 : 0);
                        b0Var.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                b0Var.setOutsideTouchable(true);
                int i8 = i7;
                View view = this.f2297t;
                int i9 = this.f2288k;
                int i10 = this.f2289l;
                int i11 = i8 < 0 ? -1 : i8;
                if (i5 < 0) {
                    i5 = -1;
                }
                b0Var.update(view, i9, i10, i11, i5);
                return;
            }
            return;
        }
        int i12 = this.f2287j;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.f2297t.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        b0Var.setWidth(i12);
        b0Var.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(b0Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a2.b(b0Var, true);
        }
        b0Var.setOutsideTouchable(true);
        b0Var.setTouchInterceptor(this.f2301x);
        if (this.f2293p) {
            b0Var.setOverlapAnchor(this.f2292o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(b0Var, this.C);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            a2.a(b0Var, this.C);
        }
        b0Var.showAsDropDown(this.f2297t, this.f2288k, this.f2289l, this.f2294q);
        this.f2286h.setSelection(-1);
        if ((!this.D || this.f2286h.isInTouchMode()) && (s1Var = this.f2286h) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.f2303z);
    }

    public final int g() {
        if (this.f2291n) {
            return this.f2289l;
        }
        return 0;
    }

    public final Drawable h() {
        return this.E.getBackground();
    }

    @Override // k.c0
    public final s1 k() {
        return this.f2286h;
    }

    public final void m(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void n(int i) {
        this.f2289l = i;
        this.f2291n = true;
    }

    public void o(ListAdapter listAdapter) {
        c2 c2Var = this.f2296s;
        if (c2Var == null) {
            this.f2296s = new c2(this);
        } else {
            ListAdapter listAdapter2 = this.f2285g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2Var);
            }
        }
        this.f2285g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2296s);
        }
        s1 s1Var = this.f2286h;
        if (s1Var != null) {
            s1Var.setAdapter(this.f2285g);
        }
    }

    public s1 q(Context context, boolean z3) {
        return new s1(context, z3);
    }

    public final void r(int i) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.f2287j = i;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.f2287j = rect.left + rect.right + i;
    }
}
