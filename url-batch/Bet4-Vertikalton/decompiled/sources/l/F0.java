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
import k.InterfaceC0149C;

/* loaded from: classes.dex */
public class F0 implements InterfaceC0149C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2780A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2781B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2782a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2783b;

    /* renamed from: c, reason: collision with root package name */
    public C0233s0 f2784c;

    /* renamed from: f, reason: collision with root package name */
    public int f2786f;

    /* renamed from: g, reason: collision with root package name */
    public int f2787g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2788j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2789k;

    /* renamed from: n, reason: collision with root package name */
    public C0 f2792n;

    /* renamed from: o, reason: collision with root package name */
    public View f2793o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2794p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2795q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2800v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2802x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2803y;

    /* renamed from: z, reason: collision with root package name */
    public final C0178A f2804z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2785e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2790l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2791m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final B0 f2796r = new B0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final E0 f2797s = new E0(this);

    /* renamed from: t, reason: collision with root package name */
    public final D0 f2798t = new D0(this);

    /* renamed from: u, reason: collision with root package name */
    public final B0 f2799u = new B0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2801w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2780A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2781B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public F0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2782a = context;
        this.f2800v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2066o, i, 0);
        this.f2786f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2787g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0178A c0178a = new C0178A(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2070s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0178a, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0178a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : w1.l.z(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2804z = c0178a;
        c0178a.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0149C
    public final boolean a() {
        return this.f2804z.isShowing();
    }

    public final void c(int i) {
        this.f2786f = i;
    }

    public final int d() {
        return this.f2786f;
    }

    @Override // k.InterfaceC0149C
    public final void dismiss() {
        C0178A c0178a = this.f2804z;
        c0178a.dismiss();
        c0178a.setContentView(null);
        this.f2784c = null;
        this.f2800v.removeCallbacks(this.f2796r);
    }

    @Override // k.InterfaceC0149C
    public final C0233s0 f() {
        return this.f2784c;
    }

    @Override // k.InterfaceC0149C
    public final void i() {
        int i;
        int paddingBottom;
        C0233s0 c0233s0;
        C0233s0 c0233s02 = this.f2784c;
        C0178A c0178a = this.f2804z;
        Context context = this.f2782a;
        if (c0233s02 == null) {
            C0233s0 p2 = p(context, !this.f2803y);
            this.f2784c = p2;
            p2.setAdapter(this.f2783b);
            this.f2784c.setOnItemClickListener(this.f2794p);
            this.f2784c.setFocusable(true);
            this.f2784c.setFocusableInTouchMode(true);
            this.f2784c.setOnItemSelectedListener(new C0245y0(this));
            this.f2784c.setOnScrollListener(this.f2798t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2795q;
            if (onItemSelectedListener != null) {
                this.f2784c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0178a.setContentView(this.f2784c);
        }
        Drawable background = c0178a.getBackground();
        Rect rect = this.f2801w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2787g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0247z0.a(c0178a, this.f2793o, this.f2787g, c0178a.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2785e;
            int a3 = this.f2784c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2784c.getPaddingBottom() + this.f2784c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2804z.getInputMethodMode() == 2;
        Q.m.d(c0178a, this.h);
        if (c0178a.isShowing()) {
            if (this.f2793o.isAttachedToWindow()) {
                int i5 = this.f2785e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2793o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0178a.setWidth(this.f2785e == -1 ? -1 : 0);
                        c0178a.setHeight(0);
                    } else {
                        c0178a.setWidth(this.f2785e == -1 ? -1 : 0);
                        c0178a.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0178a.setOutsideTouchable(true);
                View view = this.f2793o;
                int i6 = this.f2786f;
                int i7 = this.f2787g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0178a.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2785e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2793o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0178a.setWidth(i8);
        c0178a.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2780A;
            if (method != null) {
                try {
                    method.invoke(c0178a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            A0.b(c0178a, true);
        }
        c0178a.setOutsideTouchable(true);
        c0178a.setTouchInterceptor(this.f2797s);
        if (this.f2789k) {
            Q.m.c(c0178a, this.f2788j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2781B;
            if (method2 != null) {
                try {
                    method2.invoke(c0178a, this.f2802x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            A0.a(c0178a, this.f2802x);
        }
        c0178a.showAsDropDown(this.f2793o, this.f2786f, this.f2787g, this.f2790l);
        this.f2784c.setSelection(-1);
        if ((!this.f2803y || this.f2784c.isInTouchMode()) && (c0233s0 = this.f2784c) != null) {
            c0233s0.setListSelectionHidden(true);
            c0233s0.requestLayout();
        }
        if (this.f2803y) {
            return;
        }
        this.f2800v.post(this.f2799u);
    }

    public final int j() {
        if (this.i) {
            return this.f2787g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2804z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2787g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2804z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        C0 c02 = this.f2792n;
        if (c02 == null) {
            this.f2792n = new C0(this);
        } else {
            ListAdapter listAdapter2 = this.f2783b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c02);
            }
        }
        this.f2783b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2792n);
        }
        C0233s0 c0233s0 = this.f2784c;
        if (c0233s0 != null) {
            c0233s0.setAdapter(this.f2783b);
        }
    }

    public C0233s0 p(Context context, boolean z2) {
        return new C0233s0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f2804z.getBackground();
        if (background == null) {
            this.f2785e = i;
            return;
        }
        Rect rect = this.f2801w;
        background.getPadding(rect);
        this.f2785e = rect.left + rect.right + i;
    }
}
