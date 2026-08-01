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
import f.AbstractC0084a;
import java.lang.reflect.Method;
import k.InterfaceC0160C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0160C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2860A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2861B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2862a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2863b;

    /* renamed from: c, reason: collision with root package name */
    public C0213t0 f2864c;

    /* renamed from: f, reason: collision with root package name */
    public int f2866f;

    /* renamed from: g, reason: collision with root package name */
    public int f2867g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2868j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2869k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2872n;

    /* renamed from: o, reason: collision with root package name */
    public View f2873o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2874p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2875q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2880v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2882x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2883y;

    /* renamed from: z, reason: collision with root package name */
    public final C0173B f2884z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2865e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2870l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2871m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f2876r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2877s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2878t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f2879u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2881w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2860A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2861B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2862a = context;
        this.f2880v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084a.f2138o, i, 0);
        this.f2866f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2867g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0173B c0173b = new C0173B(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0084a.f2142s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            S.m.c(c0173b, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0173b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : z1.l.F(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2884z = c0173b;
        c0173b.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0160C
    public final boolean a() {
        return this.f2884z.isShowing();
    }

    public final void c(int i) {
        this.f2866f = i;
    }

    public final int d() {
        return this.f2866f;
    }

    @Override // k.InterfaceC0160C
    public final void dismiss() {
        C0173B c0173b = this.f2884z;
        c0173b.dismiss();
        c0173b.setContentView(null);
        this.f2864c = null;
        this.f2880v.removeCallbacks(this.f2876r);
    }

    @Override // k.InterfaceC0160C
    public final C0213t0 f() {
        return this.f2864c;
    }

    @Override // k.InterfaceC0160C
    public final void i() {
        int i;
        int paddingBottom;
        C0213t0 c0213t0;
        C0213t0 c0213t02 = this.f2864c;
        C0173B c0173b = this.f2884z;
        Context context = this.f2862a;
        if (c0213t02 == null) {
            C0213t0 p2 = p(context, !this.f2883y);
            this.f2864c = p2;
            p2.setAdapter(this.f2863b);
            this.f2864c.setOnItemClickListener(this.f2874p);
            this.f2864c.setFocusable(true);
            this.f2864c.setFocusableInTouchMode(true);
            this.f2864c.setOnItemSelectedListener(new C0225z0(this));
            this.f2864c.setOnScrollListener(this.f2878t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2875q;
            if (onItemSelectedListener != null) {
                this.f2864c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0173b.setContentView(this.f2864c);
        }
        Drawable background = c0173b.getBackground();
        Rect rect = this.f2881w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2867g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0173b, this.f2873o, this.f2867g, c0173b.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2865e;
            int a3 = this.f2864c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2864c.getPaddingBottom() + this.f2864c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2884z.getInputMethodMode() == 2;
        S.m.d(c0173b, this.h);
        if (c0173b.isShowing()) {
            if (this.f2873o.isAttachedToWindow()) {
                int i5 = this.f2865e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2873o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0173b.setWidth(this.f2865e == -1 ? -1 : 0);
                        c0173b.setHeight(0);
                    } else {
                        c0173b.setWidth(this.f2865e == -1 ? -1 : 0);
                        c0173b.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0173b.setOutsideTouchable(true);
                View view = this.f2873o;
                int i6 = this.f2866f;
                int i7 = this.f2867g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0173b.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2865e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2873o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0173b.setWidth(i8);
        c0173b.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2860A;
            if (method != null) {
                try {
                    method.invoke(c0173b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0173b, true);
        }
        c0173b.setOutsideTouchable(true);
        c0173b.setTouchInterceptor(this.f2877s);
        if (this.f2869k) {
            S.m.c(c0173b, this.f2868j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2861B;
            if (method2 != null) {
                try {
                    method2.invoke(c0173b, this.f2882x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0173b, this.f2882x);
        }
        c0173b.showAsDropDown(this.f2873o, this.f2866f, this.f2867g, this.f2870l);
        this.f2864c.setSelection(-1);
        if ((!this.f2883y || this.f2864c.isInTouchMode()) && (c0213t0 = this.f2864c) != null) {
            c0213t0.setListSelectionHidden(true);
            c0213t0.requestLayout();
        }
        if (this.f2883y) {
            return;
        }
        this.f2880v.post(this.f2879u);
    }

    public final int j() {
        if (this.i) {
            return this.f2867g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2884z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2867g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2884z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f2872n;
        if (d02 == null) {
            this.f2872n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f2863b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f2863b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2872n);
        }
        C0213t0 c0213t0 = this.f2864c;
        if (c0213t0 != null) {
            c0213t0.setAdapter(this.f2863b);
        }
    }

    public C0213t0 p(Context context, boolean z2) {
        return new C0213t0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f2884z.getBackground();
        if (background == null) {
            this.f2865e = i;
            return;
        }
        Rect rect = this.f2881w;
        background.getPadding(rect);
        this.f2865e = rect.left + rect.right + i;
    }
}
