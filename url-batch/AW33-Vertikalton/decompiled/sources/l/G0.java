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
import k.InterfaceC0142C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0142C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2854A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2855B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2856a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2857b;

    /* renamed from: c, reason: collision with root package name */
    public C0261t0 f2858c;

    /* renamed from: f, reason: collision with root package name */
    public int f2860f;

    /* renamed from: g, reason: collision with root package name */
    public int f2861g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2862j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2863k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2866n;

    /* renamed from: o, reason: collision with root package name */
    public View f2867o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2868p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2869q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2874v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2876x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2877y;

    /* renamed from: z, reason: collision with root package name */
    public final C0206C f2878z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2859e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2864l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2865m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f2870r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2871s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2872t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f2873u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2875w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2854A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2855B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2856a = context;
        this.f2874v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1932o, i, 0);
        this.f2860f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2861g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0206C c0206c = new C0206C(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1936s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0206c, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0206c.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : q1.l.v(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2878z = c0206c;
        c0206c.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return this.f2878z.isShowing();
    }

    public final void c(int i) {
        this.f2860f = i;
    }

    @Override // k.InterfaceC0142C
    public final void dismiss() {
        C0206C c0206c = this.f2878z;
        c0206c.dismiss();
        c0206c.setContentView(null);
        this.f2858c = null;
        this.f2874v.removeCallbacks(this.f2870r);
    }

    public final int e() {
        return this.f2860f;
    }

    @Override // k.InterfaceC0142C
    public final C0261t0 f() {
        return this.f2858c;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        int i;
        int paddingBottom;
        C0261t0 c0261t0;
        C0261t0 c0261t02 = this.f2858c;
        C0206C c0206c = this.f2878z;
        Context context = this.f2856a;
        if (c0261t02 == null) {
            C0261t0 q2 = q(context, !this.f2877y);
            this.f2858c = q2;
            q2.setAdapter(this.f2857b);
            this.f2858c.setOnItemClickListener(this.f2868p);
            this.f2858c.setFocusable(true);
            this.f2858c.setFocusableInTouchMode(true);
            this.f2858c.setOnItemSelectedListener(new C0273z0(this));
            this.f2858c.setOnScrollListener(this.f2872t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2869q;
            if (onItemSelectedListener != null) {
                this.f2858c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0206c.setContentView(this.f2858c);
        }
        Drawable background = c0206c.getBackground();
        Rect rect = this.f2875w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2861g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0206c, this.f2867o, this.f2861g, c0206c.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2859e;
            int a3 = this.f2858c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2858c.getPaddingBottom() + this.f2858c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2878z.getInputMethodMode() == 2;
        Q.m.d(c0206c, this.h);
        if (c0206c.isShowing()) {
            if (this.f2867o.isAttachedToWindow()) {
                int i5 = this.f2859e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2867o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0206c.setWidth(this.f2859e == -1 ? -1 : 0);
                        c0206c.setHeight(0);
                    } else {
                        c0206c.setWidth(this.f2859e == -1 ? -1 : 0);
                        c0206c.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0206c.setOutsideTouchable(true);
                View view = this.f2867o;
                int i6 = this.f2860f;
                int i7 = this.f2861g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0206c.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2859e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2867o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0206c.setWidth(i8);
        c0206c.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2854A;
            if (method != null) {
                try {
                    method.invoke(c0206c, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0206c, true);
        }
        c0206c.setOutsideTouchable(true);
        c0206c.setTouchInterceptor(this.f2871s);
        if (this.f2863k) {
            Q.m.c(c0206c, this.f2862j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2855B;
            if (method2 != null) {
                try {
                    method2.invoke(c0206c, this.f2876x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0206c, this.f2876x);
        }
        c0206c.showAsDropDown(this.f2867o, this.f2860f, this.f2861g, this.f2864l);
        this.f2858c.setSelection(-1);
        if ((!this.f2877y || this.f2858c.isInTouchMode()) && (c0261t0 = this.f2858c) != null) {
            c0261t0.setListSelectionHidden(true);
            c0261t0.requestLayout();
        }
        if (this.f2877y) {
            return;
        }
        this.f2874v.post(this.f2873u);
    }

    public final int j() {
        if (this.i) {
            return this.f2861g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2878z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2861g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2878z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f2866n;
        if (d02 == null) {
            this.f2866n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f2857b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f2857b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2866n);
        }
        C0261t0 c0261t0 = this.f2858c;
        if (c0261t0 != null) {
            c0261t0.setAdapter(this.f2857b);
        }
    }

    public C0261t0 q(Context context, boolean z2) {
        return new C0261t0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f2878z.getBackground();
        if (background == null) {
            this.f2859e = i;
            return;
        }
        Rect rect = this.f2875w;
        background.getPadding(rect);
        this.f2859e = rect.left + rect.right + i;
    }
}
