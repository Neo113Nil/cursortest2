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
import k.InterfaceC0187C;

/* loaded from: classes.dex */
public class G0 implements InterfaceC0187C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f3227A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f3228B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3229a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f3230b;

    /* renamed from: c, reason: collision with root package name */
    public C0289t0 f3231c;

    /* renamed from: f, reason: collision with root package name */
    public int f3234f;

    /* renamed from: g, reason: collision with root package name */
    public int f3235g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3236j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3237k;

    /* renamed from: n, reason: collision with root package name */
    public D0 f3240n;

    /* renamed from: o, reason: collision with root package name */
    public View f3241o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f3242p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f3243q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f3248v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f3250x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3251y;

    /* renamed from: z, reason: collision with root package name */
    public final C0234C f3252z;

    /* renamed from: d, reason: collision with root package name */
    public final int f3232d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f3233e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f3238l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f3239m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f3244r = new C0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final F0 f3245s = new F0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f3246t = new E0(this);

    /* renamed from: u, reason: collision with root package name */
    public final C0 f3247u = new C0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3249w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3227A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3228B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public G0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f3229a = context;
        this.f3248v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2403o, i, 0);
        this.f3234f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3235g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0234C c0234c = new C0234C(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2407s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.m.c(c0234c, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0234c.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : q1.d.z(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3252z = c0234c;
        c0234c.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0187C
    public final boolean a() {
        return this.f3252z.isShowing();
    }

    public final void c(int i) {
        this.f3234f = i;
    }

    public final int d() {
        return this.f3234f;
    }

    @Override // k.InterfaceC0187C
    public final void dismiss() {
        C0234C c0234c = this.f3252z;
        c0234c.dismiss();
        c0234c.setContentView(null);
        this.f3231c = null;
        this.f3248v.removeCallbacks(this.f3244r);
    }

    @Override // k.InterfaceC0187C
    public final C0289t0 e() {
        return this.f3231c;
    }

    @Override // k.InterfaceC0187C
    public final void i() {
        int i;
        int paddingBottom;
        C0289t0 c0289t0;
        C0289t0 c0289t02 = this.f3231c;
        C0234C c0234c = this.f3252z;
        Context context = this.f3229a;
        if (c0289t02 == null) {
            C0289t0 p2 = p(context, !this.f3251y);
            this.f3231c = p2;
            p2.setAdapter(this.f3230b);
            this.f3231c.setOnItemClickListener(this.f3242p);
            this.f3231c.setFocusable(true);
            this.f3231c.setFocusableInTouchMode(true);
            this.f3231c.setOnItemSelectedListener(new C0301z0(this));
            this.f3231c.setOnScrollListener(this.f3246t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3243q;
            if (onItemSelectedListener != null) {
                this.f3231c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0234c.setContentView(this.f3231c);
        }
        Drawable background = c0234c.getBackground();
        Rect rect = this.f3249w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f3235g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = A0.a(c0234c, this.f3241o, this.f3235g, c0234c.getInputMethodMode() == 2);
        int i3 = this.f3232d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f3233e;
            int a3 = this.f3231c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f3231c.getPaddingBottom() + this.f3231c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f3252z.getInputMethodMode() == 2;
        Q.m.d(c0234c, this.h);
        if (c0234c.isShowing()) {
            if (this.f3241o.isAttachedToWindow()) {
                int i5 = this.f3233e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f3241o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0234c.setWidth(this.f3233e == -1 ? -1 : 0);
                        c0234c.setHeight(0);
                    } else {
                        c0234c.setWidth(this.f3233e == -1 ? -1 : 0);
                        c0234c.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0234c.setOutsideTouchable(true);
                View view = this.f3241o;
                int i6 = this.f3234f;
                int i7 = this.f3235g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0234c.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f3233e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f3241o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0234c.setWidth(i8);
        c0234c.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3227A;
            if (method != null) {
                try {
                    method.invoke(c0234c, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            B0.b(c0234c, true);
        }
        c0234c.setOutsideTouchable(true);
        c0234c.setTouchInterceptor(this.f3245s);
        if (this.f3237k) {
            Q.m.c(c0234c, this.f3236j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3228B;
            if (method2 != null) {
                try {
                    method2.invoke(c0234c, this.f3250x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            B0.a(c0234c, this.f3250x);
        }
        c0234c.showAsDropDown(this.f3241o, this.f3234f, this.f3235g, this.f3238l);
        this.f3231c.setSelection(-1);
        if ((!this.f3251y || this.f3231c.isInTouchMode()) && (c0289t0 = this.f3231c) != null) {
            c0289t0.setListSelectionHidden(true);
            c0289t0.requestLayout();
        }
        if (this.f3251y) {
            return;
        }
        this.f3248v.post(this.f3247u);
    }

    public final int j() {
        if (this.i) {
            return this.f3235g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f3252z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f3235g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f3252z.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        D0 d02 = this.f3240n;
        if (d02 == null) {
            this.f3240n = new D0(this);
        } else {
            ListAdapter listAdapter2 = this.f3230b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d02);
            }
        }
        this.f3230b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3240n);
        }
        C0289t0 c0289t0 = this.f3231c;
        if (c0289t0 != null) {
            c0289t0.setAdapter(this.f3230b);
        }
    }

    public C0289t0 p(Context context, boolean z2) {
        return new C0289t0(context, z2);
    }

    public final void q(int i) {
        Drawable background = this.f3252z.getBackground();
        if (background == null) {
            this.f3233e = i;
            return;
        }
        Rect rect = this.f3249w;
        background.getPadding(rect);
        this.f3233e = rect.left + rect.right + i;
    }
}
