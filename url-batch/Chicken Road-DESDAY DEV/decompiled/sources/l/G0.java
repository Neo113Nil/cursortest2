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
import k.InterfaceC0146C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0146C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2788A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2789B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2790a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2791b;

    /* renamed from: c, reason: collision with root package name */
    public C0245t0 f2792c;

    /* renamed from: f, reason: collision with root package name */
    public int f2794f;

    /* renamed from: g, reason: collision with root package name */
    public int f2795g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2796j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2797k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2800n;

    /* renamed from: o, reason: collision with root package name */
    public View f2801o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2802p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2803q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2808v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2810x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2811y;

    /* renamed from: z, reason: collision with root package name */
    public final C0189B f2812z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2793e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2798l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2799m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f2804r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2805s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2806t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f2807u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2809w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2788A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2789B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2790a = context;
        this.f2808v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2001o, i, 0);
        this.f2794f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2795g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0189B c0189b = new C0189B(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2005s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0189b, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0189b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : u1.d.G(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2812z = c0189b;
        c0189b.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0146C
    public final boolean a() {
        return this.f2812z.isShowing();
    }

    public final void c(int i) {
        this.f2794f = i;
    }

    public final int d() {
        return this.f2794f;
    }

    @Override // k.InterfaceC0146C
    public final void dismiss() {
        C0189B c0189b = this.f2812z;
        c0189b.dismiss();
        c0189b.setContentView(null);
        this.f2792c = null;
        this.f2808v.removeCallbacks(this.f2804r);
    }

    @Override // k.InterfaceC0146C
    public final C0245t0 f() {
        return this.f2792c;
    }

    @Override // k.InterfaceC0146C
    public final void i() {
        int i;
        int paddingBottom;
        C0245t0 c0245t0;
        C0245t0 c0245t02 = this.f2792c;
        C0189B c0189b = this.f2812z;
        Context context = this.f2790a;
        if (c0245t02 == null) {
            C0245t0 p2 = p(context, !this.f2811y);
            this.f2792c = p2;
            p2.setAdapter(this.f2791b);
            this.f2792c.setOnItemClickListener(this.f2802p);
            this.f2792c.setFocusable(true);
            this.f2792c.setFocusableInTouchMode(true);
            this.f2792c.setOnItemSelectedListener(new C0257z0(this));
            this.f2792c.setOnScrollListener(this.f2806t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2803q;
            if (onItemSelectedListener != null) {
                this.f2792c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0189b.setContentView(this.f2792c);
        }
        Drawable background = c0189b.getBackground();
        Rect rect = this.f2809w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2795g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0189b, this.f2801o, this.f2795g, c0189b.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2793e;
            int a3 = this.f2792c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2792c.getPaddingBottom() + this.f2792c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2812z.getInputMethodMode() == 2;
        Q.m.d(c0189b, this.h);
        if (c0189b.isShowing()) {
            if (this.f2801o.isAttachedToWindow()) {
                int i5 = this.f2793e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2801o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0189b.setWidth(this.f2793e == -1 ? -1 : 0);
                        c0189b.setHeight(0);
                    } else {
                        c0189b.setWidth(this.f2793e == -1 ? -1 : 0);
                        c0189b.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0189b.setOutsideTouchable(true);
                View view = this.f2801o;
                int i6 = this.f2794f;
                int i7 = this.f2795g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0189b.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2793e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2801o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0189b.setWidth(i8);
        c0189b.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2788A;
            if (method != null) {
                try {
                    method.invoke(c0189b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0189b, true);
        }
        c0189b.setOutsideTouchable(true);
        c0189b.setTouchInterceptor(this.f2805s);
        if (this.f2797k) {
            Q.m.c(c0189b, this.f2796j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2789B;
            if (method2 != null) {
                try {
                    method2.invoke(c0189b, this.f2810x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0189b, this.f2810x);
        }
        c0189b.showAsDropDown(this.f2801o, this.f2794f, this.f2795g, this.f2798l);
        this.f2792c.setSelection(-1);
        if ((!this.f2811y || this.f2792c.isInTouchMode()) && (c0245t0 = this.f2792c) != null) {
            c0245t0.setListSelectionHidden(true);
            c0245t0.requestLayout();
        }
        if (this.f2811y) {
            return;
        }
        this.f2808v.post(this.f2807u);
    }

    public final int j() {
        if (this.i) {
            return this.f2795g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2812z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2795g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2812z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f2800n;
        if (d02 == null) {
            this.f2800n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f2791b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f2791b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2800n);
        }
        C0245t0 c0245t0 = this.f2792c;
        if (c0245t0 != null) {
            c0245t0.setAdapter(this.f2791b);
        }
    }

    public C0245t0 p(Context context, boolean z2) {
        return new C0245t0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f2812z.getBackground();
        if (background == null) {
            this.f2793e = i;
            return;
        }
        Rect rect = this.f2809w;
        background.getPadding(rect);
        this.f2793e = rect.left + rect.right + i;
    }
}
