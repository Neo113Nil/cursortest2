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
import k.InterfaceC0145C;

/* loaded from: classes.dex */
public class F0 implements InterfaceC0145C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2842A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2843B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2844a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2845b;

    /* renamed from: c, reason: collision with root package name */
    public C0242s0 f2846c;

    /* renamed from: f, reason: collision with root package name */
    public int f2848f;

    /* renamed from: g, reason: collision with root package name */
    public int f2849g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2850j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2851k;

    /* renamed from: n, reason: collision with root package name */
    public C0 f2854n;

    /* renamed from: o, reason: collision with root package name */
    public View f2855o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2856p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2857q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2862v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2864x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2865y;

    /* renamed from: z, reason: collision with root package name */
    public final C0188B f2866z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2847e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2852l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2853m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final B0 f2858r = new B0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final E0 f2859s = new E0(this);

    /* renamed from: t, reason: collision with root package name */
    public final D0 f2860t = new D0(this);

    /* renamed from: u, reason: collision with root package name */
    public final B0 f2861u = new B0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2863w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2842A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2843B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public F0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2844a = context;
        this.f2862v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2068o, i, 0);
        this.f2848f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2849g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0188B c0188b = new C0188B(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2072s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0188b, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0188b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : x1.l.z(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2866z = c0188b;
        c0188b.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0145C
    public final boolean a() {
        return this.f2866z.isShowing();
    }

    public final void c(int i) {
        this.f2848f = i;
    }

    public final int d() {
        return this.f2848f;
    }

    @Override // k.InterfaceC0145C
    public final void dismiss() {
        C0188B c0188b = this.f2866z;
        c0188b.dismiss();
        c0188b.setContentView(null);
        this.f2846c = null;
        this.f2862v.removeCallbacks(this.f2858r);
    }

    @Override // k.InterfaceC0145C
    public final C0242s0 e() {
        return this.f2846c;
    }

    @Override // k.InterfaceC0145C
    public final void i() {
        int i;
        int paddingBottom;
        C0242s0 c0242s0;
        C0242s0 c0242s02 = this.f2846c;
        C0188B c0188b = this.f2866z;
        Context context = this.f2844a;
        if (c0242s02 == null) {
            C0242s0 p2 = p(context, !this.f2865y);
            this.f2846c = p2;
            p2.setAdapter(this.f2845b);
            this.f2846c.setOnItemClickListener(this.f2856p);
            this.f2846c.setFocusable(true);
            this.f2846c.setFocusableInTouchMode(true);
            this.f2846c.setOnItemSelectedListener(new C0254y0(this));
            this.f2846c.setOnScrollListener(this.f2860t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2857q;
            if (onItemSelectedListener != null) {
                this.f2846c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0188b.setContentView(this.f2846c);
        }
        Drawable background = c0188b.getBackground();
        Rect rect = this.f2863w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2849g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0256z0.a(c0188b, this.f2855o, this.f2849g, c0188b.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2847e;
            int a3 = this.f2846c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2846c.getPaddingBottom() + this.f2846c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2866z.getInputMethodMode() == 2;
        Q.m.d(c0188b, this.h);
        if (c0188b.isShowing()) {
            if (this.f2855o.isAttachedToWindow()) {
                int i5 = this.f2847e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2855o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0188b.setWidth(this.f2847e == -1 ? -1 : 0);
                        c0188b.setHeight(0);
                    } else {
                        c0188b.setWidth(this.f2847e == -1 ? -1 : 0);
                        c0188b.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0188b.setOutsideTouchable(true);
                View view = this.f2855o;
                int i6 = this.f2848f;
                int i7 = this.f2849g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0188b.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2847e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2855o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0188b.setWidth(i8);
        c0188b.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2842A;
            if (method != null) {
                try {
                    method.invoke(c0188b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            A0.b(c0188b, true);
        }
        c0188b.setOutsideTouchable(true);
        c0188b.setTouchInterceptor(this.f2859s);
        if (this.f2851k) {
            Q.m.c(c0188b, this.f2850j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2843B;
            if (method2 != null) {
                try {
                    method2.invoke(c0188b, this.f2864x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            A0.a(c0188b, this.f2864x);
        }
        c0188b.showAsDropDown(this.f2855o, this.f2848f, this.f2849g, this.f2852l);
        this.f2846c.setSelection(-1);
        if ((!this.f2865y || this.f2846c.isInTouchMode()) && (c0242s0 = this.f2846c) != null) {
            c0242s0.setListSelectionHidden(true);
            c0242s0.requestLayout();
        }
        if (this.f2865y) {
            return;
        }
        this.f2862v.post(this.f2861u);
    }

    public final int j() {
        if (this.i) {
            return this.f2849g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2866z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2849g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2866z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        C0 c02 = this.f2854n;
        if (c02 == null) {
            this.f2854n = new C0(this);
        } else {
            ListAdapter listAdapter2 = this.f2845b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c02);
            }
        }
        this.f2845b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2854n);
        }
        C0242s0 c0242s0 = this.f2846c;
        if (c0242s0 != null) {
            c0242s0.setAdapter(this.f2845b);
        }
    }

    public C0242s0 p(Context context, boolean z2) {
        return new C0242s0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f2866z.getBackground();
        if (background == null) {
            this.f2847e = i;
            return;
        }
        Rect rect = this.f2863w;
        background.getPadding(rect);
        this.f2847e = rect.left + rect.right + i;
    }
}
