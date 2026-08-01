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
import k.InterfaceC0143C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0143C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2937A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2938B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2939a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2940b;

    /* renamed from: c, reason: collision with root package name */
    public C0242t0 f2941c;

    /* renamed from: f, reason: collision with root package name */
    public int f2943f;

    /* renamed from: g, reason: collision with root package name */
    public int f2944g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2945j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2946k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f2949n;

    /* renamed from: o, reason: collision with root package name */
    public View f2950o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2951p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2952q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2957v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2959x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2960y;

    /* renamed from: z, reason: collision with root package name */
    public final C0187C f2961z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2942e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2947l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2948m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f2953r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2954s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2955t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f2956u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2958w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2937A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2938B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f2939a = context;
        this.f2957v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2000o, i, 0);
        this.f2943f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2944g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0187C c0187c = new C0187C(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2004s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0187c, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0187c.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : s1.l.z(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2961z = c0187c;
        c0187c.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0143C
    public final boolean a() {
        return this.f2961z.isShowing();
    }

    public final void c(int i) {
        this.f2943f = i;
    }

    public final int d() {
        return this.f2943f;
    }

    @Override // k.InterfaceC0143C
    public final void dismiss() {
        C0187C c0187c = this.f2961z;
        c0187c.dismiss();
        c0187c.setContentView(null);
        this.f2941c = null;
        this.f2957v.removeCallbacks(this.f2953r);
    }

    @Override // k.InterfaceC0143C
    public final C0242t0 f() {
        return this.f2941c;
    }

    @Override // k.InterfaceC0143C
    public final void i() {
        int i;
        int paddingBottom;
        C0242t0 c0242t0;
        C0242t0 c0242t02 = this.f2941c;
        C0187C c0187c = this.f2961z;
        Context context = this.f2939a;
        if (c0242t02 == null) {
            C0242t0 p2 = p(context, !this.f2960y);
            this.f2941c = p2;
            p2.setAdapter(this.f2940b);
            this.f2941c.setOnItemClickListener(this.f2951p);
            this.f2941c.setFocusable(true);
            this.f2941c.setFocusableInTouchMode(true);
            this.f2941c.setOnItemSelectedListener(new C0254z0(this));
            this.f2941c.setOnScrollListener(this.f2955t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2952q;
            if (onItemSelectedListener != null) {
                this.f2941c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0187c.setContentView(this.f2941c);
        }
        Drawable background = c0187c.getBackground();
        Rect rect = this.f2958w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f2944g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0187c, this.f2950o, this.f2944g, c0187c.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f2942e;
            int a3 = this.f2941c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f2941c.getPaddingBottom() + this.f2941c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f2961z.getInputMethodMode() == 2;
        Q.m.d(c0187c, this.h);
        if (c0187c.isShowing()) {
            if (this.f2950o.isAttachedToWindow()) {
                int i5 = this.f2942e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2950o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0187c.setWidth(this.f2942e == -1 ? -1 : 0);
                        c0187c.setHeight(0);
                    } else {
                        c0187c.setWidth(this.f2942e == -1 ? -1 : 0);
                        c0187c.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0187c.setOutsideTouchable(true);
                View view = this.f2950o;
                int i6 = this.f2943f;
                int i7 = this.f2944g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0187c.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f2942e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2950o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0187c.setWidth(i8);
        c0187c.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2937A;
            if (method != null) {
                try {
                    method.invoke(c0187c, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0187c, true);
        }
        c0187c.setOutsideTouchable(true);
        c0187c.setTouchInterceptor(this.f2954s);
        if (this.f2946k) {
            Q.m.c(c0187c, this.f2945j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2938B;
            if (method2 != null) {
                try {
                    method2.invoke(c0187c, this.f2959x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0187c, this.f2959x);
        }
        c0187c.showAsDropDown(this.f2950o, this.f2943f, this.f2944g, this.f2947l);
        this.f2941c.setSelection(-1);
        if ((!this.f2960y || this.f2941c.isInTouchMode()) && (c0242t0 = this.f2941c) != null) {
            c0242t0.setListSelectionHidden(true);
            c0242t0.requestLayout();
        }
        if (this.f2960y) {
            return;
        }
        this.f2957v.post(this.f2956u);
    }

    public final int j() {
        if (this.i) {
            return this.f2944g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f2961z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f2944g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f2961z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f2949n;
        if (d02 == null) {
            this.f2949n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f2940b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f2940b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2949n);
        }
        C0242t0 c0242t0 = this.f2941c;
        if (c0242t0 != null) {
            c0242t0.setAdapter(this.f2940b);
        }
    }

    public C0242t0 p(Context context, boolean z2) {
        return new C0242t0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f2961z.getBackground();
        if (background == null) {
            this.f2942e = i;
            return;
        }
        Rect rect = this.f2958w;
        background.getPadding(rect);
        this.f2942e = rect.left + rect.right + i;
    }
}
