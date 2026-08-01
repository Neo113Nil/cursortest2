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
import k.InterfaceC0152C;

/* loaded from: classes.dex */
public class E0 implements InterfaceC0152C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2836A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2837B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2838a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2839b;

    /* renamed from: c, reason: collision with root package name */
    public C0236r0 f2840c;

    /* renamed from: f, reason: collision with root package name */
    public int f2842f;

    /* renamed from: g, reason: collision with root package name */
    public int f2843g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2844j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2845k;

    /* renamed from: n, reason: collision with root package name */
    public B0 f2848n;

    /* renamed from: o, reason: collision with root package name */
    public View f2849o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2850p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2851q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2856v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2858x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2859y;

    /* renamed from: z, reason: collision with root package name */
    public final C0182A f2860z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2841e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2846l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2847m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final A0 f2852r = new A0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final D0 f2853s = new D0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C0 f2854t = new C0(this);

    /* renamed from: u, reason: collision with root package name */
    public final A0 f2855u = new A0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2857w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2836A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2837B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public E0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2838a = context;
        this.f2856v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2120o, i, 0);
        this.f2842f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2843g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0182A c0182a = new C0182A(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2124s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0182a, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0182a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : T.d.t(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2860z = c0182a;
        c0182a.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0152C
    public final boolean a() {
        return this.f2860z.isShowing();
    }

    public final void c(int i) {
        this.f2842f = i;
    }

    public final int d() {
        return this.f2842f;
    }

    @Override // k.InterfaceC0152C
    public final void dismiss() {
        C0182A c0182a = this.f2860z;
        c0182a.dismiss();
        c0182a.setContentView(null);
        this.f2840c = null;
        this.f2856v.removeCallbacks(this.f2852r);
    }

    @Override // k.InterfaceC0152C
    public final C0236r0 e() {
        return this.f2840c;
    }

    @Override // k.InterfaceC0152C
    public final void i() {
        int i;
        int paddingBottom;
        C0236r0 c0236r0;
        C0236r0 c0236r02 = this.f2840c;
        C0182A c0182a = this.f2860z;
        Context context = this.f2838a;
        if (c0236r02 == null) {
            C0236r0 p2 = p(context, !this.f2859y);
            this.f2840c = p2;
            p2.setAdapter(this.f2839b);
            this.f2840c.setOnItemClickListener(this.f2850p);
            this.f2840c.setFocusable(true);
            this.f2840c.setFocusableInTouchMode(true);
            this.f2840c.setOnItemSelectedListener(new C0248x0(this));
            this.f2840c.setOnScrollListener(this.f2854t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2851q;
            if (onItemSelectedListener != null) {
                this.f2840c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0182a.setContentView(this.f2840c);
        }
        Drawable background = c0182a.getBackground();
        Rect rect = this.f2857w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2843g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0250y0.a(c0182a, this.f2849o, this.f2843g, c0182a.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2841e;
            int a3 = this.f2840c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2840c.getPaddingBottom() + this.f2840c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2860z.getInputMethodMode() == 2;
        Q.m.d(c0182a, this.h);
        if (c0182a.isShowing()) {
            if (this.f2849o.isAttachedToWindow()) {
                int i5 = this.f2841e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2849o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0182a.setWidth(this.f2841e == -1 ? -1 : 0);
                        c0182a.setHeight(0);
                    } else {
                        c0182a.setWidth(this.f2841e == -1 ? -1 : 0);
                        c0182a.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0182a.setOutsideTouchable(true);
                View view = this.f2849o;
                int i6 = this.f2842f;
                int i7 = this.f2843g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0182a.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2841e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2849o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0182a.setWidth(i8);
        c0182a.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2836A;
            if (method != null) {
                try {
                    method.invoke(c0182a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0252z0.b(c0182a, true);
        }
        c0182a.setOutsideTouchable(true);
        c0182a.setTouchInterceptor(this.f2853s);
        if (this.f2845k) {
            Q.m.c(c0182a, this.f2844j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2837B;
            if (method2 != null) {
                try {
                    method2.invoke(c0182a, this.f2858x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC0252z0.a(c0182a, this.f2858x);
        }
        c0182a.showAsDropDown(this.f2849o, this.f2842f, this.f2843g, this.f2846l);
        this.f2840c.setSelection(-1);
        if ((!this.f2859y || this.f2840c.isInTouchMode()) && (c0236r0 = this.f2840c) != null) {
            c0236r0.setListSelectionHidden(true);
            c0236r0.requestLayout();
        }
        if (this.f2859y) {
            return;
        }
        this.f2856v.post(this.f2855u);
    }

    public final int j() {
        if (this.i) {
            return this.f2843g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2860z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2843g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2860z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        B0 b02 = this.f2848n;
        if (b02 == null) {
            this.f2848n = new B0(this);
        } else {
            ListAdapter listAdapter2 = this.f2839b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(b02);
            }
        }
        this.f2839b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2848n);
        }
        C0236r0 c0236r0 = this.f2840c;
        if (c0236r0 != null) {
            c0236r0.setAdapter(this.f2839b);
        }
    }

    public C0236r0 p(Context context, boolean z2) {
        return new C0236r0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f2860z.getBackground();
        if (background == null) {
            this.f2841e = i;
            return;
        }
        Rect rect = this.f2857w;
        background.getPadding(rect);
        this.f2841e = rect.left + rect.right + i;
    }
}
