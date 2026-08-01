package m;

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
import f.AbstractC0097a;
import h.AbstractC0112a;
import java.lang.reflect.Method;
import l.InterfaceC0154C;

/* loaded from: classes.dex */
public class J0 implements InterfaceC0154C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2930A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2931B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2932a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2933b;

    /* renamed from: c, reason: collision with root package name */
    public C0246w0 f2934c;

    /* renamed from: f, reason: collision with root package name */
    public int f2936f;

    /* renamed from: g, reason: collision with root package name */
    public int f2937g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2939j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2940k;

    /* renamed from: n, reason: collision with root package name */
    public G0 f2943n;

    /* renamed from: o, reason: collision with root package name */
    public View f2944o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2945p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2946q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2951v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2953x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2954y;

    /* renamed from: z, reason: collision with root package name */
    public final C0184B f2955z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2935e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f2938h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2941l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2942m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final F0 f2947r = new F0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final I0 f2948s = new I0(this);

    /* renamed from: t, reason: collision with root package name */
    public final H0 f2949t = new H0(this);

    /* renamed from: u, reason: collision with root package name */
    public final F0 f2950u = new F0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2952w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2930A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2931B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public J0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2932a = context;
        this.f2951v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f2148o, i, 0);
        this.f2936f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2937g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0184B c0184b = new C0184B(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f2152s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            R.m.c(c0184b, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0184b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0112a.l(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2955z = c0184b;
        c0184b.setInputMethodMode(1);
    }

    @Override // l.InterfaceC0154C
    public final boolean a() {
        return this.f2955z.isShowing();
    }

    public final void c(int i) {
        this.f2936f = i;
    }

    @Override // l.InterfaceC0154C
    public final void dismiss() {
        C0184B c0184b = this.f2955z;
        c0184b.dismiss();
        c0184b.setContentView(null);
        this.f2934c = null;
        this.f2951v.removeCallbacks(this.f2947r);
    }

    public final int e() {
        return this.f2936f;
    }

    @Override // l.InterfaceC0154C
    public final C0246w0 f() {
        return this.f2934c;
    }

    @Override // l.InterfaceC0154C
    public final void j() {
        int i;
        int paddingBottom;
        C0246w0 c0246w0;
        C0246w0 c0246w02 = this.f2934c;
        C0184B c0184b = this.f2955z;
        Context context = this.f2932a;
        if (c0246w02 == null) {
            C0246w0 q2 = q(context, !this.f2954y);
            this.f2934c = q2;
            q2.setAdapter(this.f2933b);
            this.f2934c.setOnItemClickListener(this.f2945p);
            this.f2934c.setFocusable(true);
            this.f2934c.setFocusableInTouchMode(true);
            this.f2934c.setOnItemSelectedListener(new C0(this));
            this.f2934c.setOnScrollListener(this.f2949t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2946q;
            if (onItemSelectedListener != null) {
                this.f2934c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0184b.setContentView(this.f2934c);
        }
        Drawable background = c0184b.getBackground();
        Rect rect = this.f2952w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2937g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = D0.a(c0184b, this.f2944o, this.f2937g, c0184b.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2935e;
            int a3 = this.f2934c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2934c.getPaddingBottom() + this.f2934c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2955z.getInputMethodMode() == 2;
        R.m.d(c0184b, this.f2938h);
        if (c0184b.isShowing()) {
            if (this.f2944o.isAttachedToWindow()) {
                int i5 = this.f2935e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2944o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0184b.setWidth(this.f2935e == -1 ? -1 : 0);
                        c0184b.setHeight(0);
                    } else {
                        c0184b.setWidth(this.f2935e == -1 ? -1 : 0);
                        c0184b.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0184b.setOutsideTouchable(true);
                View view = this.f2944o;
                int i6 = this.f2936f;
                int i7 = this.f2937g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0184b.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2935e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2944o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0184b.setWidth(i8);
        c0184b.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2930A;
            if (method != null) {
                try {
                    method.invoke(c0184b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            E0.b(c0184b, true);
        }
        c0184b.setOutsideTouchable(true);
        c0184b.setTouchInterceptor(this.f2948s);
        if (this.f2940k) {
            R.m.c(c0184b, this.f2939j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2931B;
            if (method2 != null) {
                try {
                    method2.invoke(c0184b, this.f2953x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            E0.a(c0184b, this.f2953x);
        }
        c0184b.showAsDropDown(this.f2944o, this.f2936f, this.f2937g, this.f2941l);
        this.f2934c.setSelection(-1);
        if ((!this.f2954y || this.f2934c.isInTouchMode()) && (c0246w0 = this.f2934c) != null) {
            c0246w0.setListSelectionHidden(true);
            c0246w0.requestLayout();
        }
        if (this.f2954y) {
            return;
        }
        this.f2951v.post(this.f2950u);
    }

    public final int k() {
        if (this.i) {
            return this.f2937g;
        }
        return 0;
    }

    public final void l(Drawable drawable) {
        this.f2955z.setBackgroundDrawable(drawable);
    }

    public final void m(int i) {
        this.f2937g = i;
        this.i = true;
    }

    public final Drawable n() {
        return this.f2955z.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        G0 g02 = this.f2943n;
        if (g02 == null) {
            this.f2943n = new G0(this);
        } else {
            ListAdapter listAdapter2 = this.f2933b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(g02);
            }
        }
        this.f2933b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2943n);
        }
        C0246w0 c0246w0 = this.f2934c;
        if (c0246w0 != null) {
            c0246w0.setAdapter(this.f2933b);
        }
    }

    public C0246w0 q(Context context, boolean z2) {
        return new C0246w0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f2955z.getBackground();
        if (background == null) {
            this.f2935e = i;
            return;
        }
        Rect rect = this.f2952w;
        background.getPadding(rect);
        this.f2935e = rect.left + rect.right + i;
    }
}
