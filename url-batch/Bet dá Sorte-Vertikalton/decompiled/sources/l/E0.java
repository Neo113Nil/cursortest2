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
public class E0 implements InterfaceC0142C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2821A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2822B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2823a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2824b;

    /* renamed from: c, reason: collision with root package name */
    public C0234r0 f2825c;

    /* renamed from: f, reason: collision with root package name */
    public int f2827f;

    /* renamed from: g, reason: collision with root package name */
    public int f2828g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2829j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2830k;

    /* renamed from: n, reason: collision with root package name */
    public B0 f2833n;

    /* renamed from: o, reason: collision with root package name */
    public View f2834o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2835p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2836q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2841v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2843x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2844y;

    /* renamed from: z, reason: collision with root package name */
    public final C0181A f2845z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2826e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2831l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2832m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final A0 f2837r = new A0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final D0 f2838s = new D0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C0 f2839t = new C0(this);

    /* renamed from: u, reason: collision with root package name */
    public final A0 f2840u = new A0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2842w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2821A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2822B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public E0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2823a = context;
        this.f2841v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2043o, i, 0);
        this.f2827f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2828g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0181A c0181a = new C0181A(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2047s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.l.c(c0181a, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0181a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : u1.d.D(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2845z = c0181a;
        c0181a.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        return this.f2845z.isShowing();
    }

    public final void c(int i) {
        this.f2827f = i;
    }

    public final int d() {
        return this.f2827f;
    }

    @Override // k.InterfaceC0142C
    public final void dismiss() {
        C0181A c0181a = this.f2845z;
        c0181a.dismiss();
        c0181a.setContentView(null);
        this.f2825c = null;
        this.f2841v.removeCallbacks(this.f2837r);
    }

    @Override // k.InterfaceC0142C
    public final C0234r0 e() {
        return this.f2825c;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        int i;
        int paddingBottom;
        C0234r0 c0234r0;
        C0234r0 c0234r02 = this.f2825c;
        C0181A c0181a = this.f2845z;
        Context context = this.f2823a;
        if (c0234r02 == null) {
            C0234r0 p2 = p(context, !this.f2844y);
            this.f2825c = p2;
            p2.setAdapter(this.f2824b);
            this.f2825c.setOnItemClickListener(this.f2835p);
            this.f2825c.setFocusable(true);
            this.f2825c.setFocusableInTouchMode(true);
            this.f2825c.setOnItemSelectedListener(new C0246x0(this));
            this.f2825c.setOnScrollListener(this.f2839t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2836q;
            if (onItemSelectedListener != null) {
                this.f2825c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0181a.setContentView(this.f2825c);
        }
        Drawable background = c0181a.getBackground();
        Rect rect = this.f2842w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2828g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0248y0.a(c0181a, this.f2834o, this.f2828g, c0181a.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2826e;
            int a3 = this.f2825c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2825c.getPaddingBottom() + this.f2825c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2845z.getInputMethodMode() == 2;
        Q.l.d(c0181a, this.h);
        if (c0181a.isShowing()) {
            if (this.f2834o.isAttachedToWindow()) {
                int i5 = this.f2826e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2834o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0181a.setWidth(this.f2826e == -1 ? -1 : 0);
                        c0181a.setHeight(0);
                    } else {
                        c0181a.setWidth(this.f2826e == -1 ? -1 : 0);
                        c0181a.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0181a.setOutsideTouchable(true);
                View view = this.f2834o;
                int i6 = this.f2827f;
                int i7 = this.f2828g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0181a.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2826e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2834o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0181a.setWidth(i8);
        c0181a.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2821A;
            if (method != null) {
                try {
                    method.invoke(c0181a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0250z0.b(c0181a, true);
        }
        c0181a.setOutsideTouchable(true);
        c0181a.setTouchInterceptor(this.f2838s);
        if (this.f2830k) {
            Q.l.c(c0181a, this.f2829j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2822B;
            if (method2 != null) {
                try {
                    method2.invoke(c0181a, this.f2843x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC0250z0.a(c0181a, this.f2843x);
        }
        c0181a.showAsDropDown(this.f2834o, this.f2827f, this.f2828g, this.f2831l);
        this.f2825c.setSelection(-1);
        if ((!this.f2844y || this.f2825c.isInTouchMode()) && (c0234r0 = this.f2825c) != null) {
            c0234r0.setListSelectionHidden(true);
            c0234r0.requestLayout();
        }
        if (this.f2844y) {
            return;
        }
        this.f2841v.post(this.f2840u);
    }

    public final int j() {
        if (this.i) {
            return this.f2828g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2845z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2828g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2845z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        B0 b02 = this.f2833n;
        if (b02 == null) {
            this.f2833n = new B0(this);
        } else {
            ListAdapter listAdapter2 = this.f2824b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(b02);
            }
        }
        this.f2824b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2833n);
        }
        C0234r0 c0234r0 = this.f2825c;
        if (c0234r0 != null) {
            c0234r0.setAdapter(this.f2824b);
        }
    }

    public C0234r0 p(Context context, boolean z2) {
        return new C0234r0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f2845z.getBackground();
        if (background == null) {
            this.f2826e = i;
            return;
        }
        Rect rect = this.f2842w;
        background.getPadding(rect);
        this.f2826e = rect.left + rect.right + i;
    }
}
