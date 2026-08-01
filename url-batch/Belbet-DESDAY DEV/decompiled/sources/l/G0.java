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
    public static final Method f2859A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2860B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2861a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2862b;

    /* renamed from: c, reason: collision with root package name */
    public C0261t0 f2863c;

    /* renamed from: f, reason: collision with root package name */
    public int f2865f;

    /* renamed from: g, reason: collision with root package name */
    public int f2866g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2867j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2868k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2871n;

    /* renamed from: o, reason: collision with root package name */
    public View f2872o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2873p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2874q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2879v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2881x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2882y;

    /* renamed from: z, reason: collision with root package name */
    public final C0206C f2883z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2864e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2869l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2870m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f2875r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2876s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2877t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f2878u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2880w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2859A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2860B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2861a = context;
        this.f2879v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1935o, i, 0);
        this.f2865f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2866g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0206C c0206c = new C0206C(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1939s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0206c, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0206c.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : q1.l.v(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2883z = c0206c;
        c0206c.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return this.f2883z.isShowing();
    }

    public final void c(int i) {
        this.f2865f = i;
    }

    @Override // k.InterfaceC0142C
    public final void dismiss() {
        C0206C c0206c = this.f2883z;
        c0206c.dismiss();
        c0206c.setContentView(null);
        this.f2863c = null;
        this.f2879v.removeCallbacks(this.f2875r);
    }

    public final int e() {
        return this.f2865f;
    }

    @Override // k.InterfaceC0142C
    public final C0261t0 f() {
        return this.f2863c;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        int i;
        int paddingBottom;
        C0261t0 c0261t0;
        C0261t0 c0261t02 = this.f2863c;
        C0206C c0206c = this.f2883z;
        Context context = this.f2861a;
        if (c0261t02 == null) {
            C0261t0 q2 = q(context, !this.f2882y);
            this.f2863c = q2;
            q2.setAdapter(this.f2862b);
            this.f2863c.setOnItemClickListener(this.f2873p);
            this.f2863c.setFocusable(true);
            this.f2863c.setFocusableInTouchMode(true);
            this.f2863c.setOnItemSelectedListener(new C0273z0(this));
            this.f2863c.setOnScrollListener(this.f2877t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2874q;
            if (onItemSelectedListener != null) {
                this.f2863c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0206c.setContentView(this.f2863c);
        }
        Drawable background = c0206c.getBackground();
        Rect rect = this.f2880w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2866g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0206c, this.f2872o, this.f2866g, c0206c.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2864e;
            int a3 = this.f2863c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2863c.getPaddingBottom() + this.f2863c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2883z.getInputMethodMode() == 2;
        Q.m.d(c0206c, this.h);
        if (c0206c.isShowing()) {
            if (this.f2872o.isAttachedToWindow()) {
                int i5 = this.f2864e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2872o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0206c.setWidth(this.f2864e == -1 ? -1 : 0);
                        c0206c.setHeight(0);
                    } else {
                        c0206c.setWidth(this.f2864e == -1 ? -1 : 0);
                        c0206c.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0206c.setOutsideTouchable(true);
                View view = this.f2872o;
                int i6 = this.f2865f;
                int i7 = this.f2866g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0206c.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2864e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2872o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0206c.setWidth(i8);
        c0206c.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2859A;
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
        c0206c.setTouchInterceptor(this.f2876s);
        if (this.f2868k) {
            Q.m.c(c0206c, this.f2867j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2860B;
            if (method2 != null) {
                try {
                    method2.invoke(c0206c, this.f2881x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0206c, this.f2881x);
        }
        c0206c.showAsDropDown(this.f2872o, this.f2865f, this.f2866g, this.f2869l);
        this.f2863c.setSelection(-1);
        if ((!this.f2882y || this.f2863c.isInTouchMode()) && (c0261t0 = this.f2863c) != null) {
            c0261t0.setListSelectionHidden(true);
            c0261t0.requestLayout();
        }
        if (this.f2882y) {
            return;
        }
        this.f2879v.post(this.f2878u);
    }

    public final int j() {
        if (this.i) {
            return this.f2866g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2883z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2866g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2883z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f2871n;
        if (d02 == null) {
            this.f2871n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f2862b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f2862b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2871n);
        }
        C0261t0 c0261t0 = this.f2863c;
        if (c0261t0 != null) {
            c0261t0.setAdapter(this.f2862b);
        }
    }

    public C0261t0 q(Context context, boolean z2) {
        return new C0261t0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f2883z.getBackground();
        if (background == null) {
            this.f2864e = i;
            return;
        }
        Rect rect = this.f2880w;
        background.getPadding(rect);
        this.f2864e = rect.left + rect.right + i;
    }
}
