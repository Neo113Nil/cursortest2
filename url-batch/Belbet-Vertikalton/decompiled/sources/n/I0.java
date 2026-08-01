package n;

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
import g.AbstractC0122a;
import java.lang.reflect.Method;
import m.InterfaceC0214C;

/* loaded from: classes.dex */
public class I0 implements InterfaceC0214C {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f3458A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f3459B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3460a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f3461b;

    /* renamed from: c, reason: collision with root package name */
    public C0305v0 f3462c;

    /* renamed from: f, reason: collision with root package name */
    public int f3464f;

    /* renamed from: g, reason: collision with root package name */
    public int f3465g;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3467k;

    /* renamed from: n, reason: collision with root package name */
    public F0 f3470n;

    /* renamed from: o, reason: collision with root package name */
    public View f3471o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f3472p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f3473q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f3478v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f3480x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3481y;

    /* renamed from: z, reason: collision with root package name */
    public final C0246B f3482z;

    /* renamed from: d, reason: collision with root package name */
    public final int f3463d = -2;
    public int e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f3466h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f3468l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f3469m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final E0 f3474r = new E0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final H0 f3475s = new H0(this);

    /* renamed from: t, reason: collision with root package name */
    public final G0 f3476t = new G0(this);

    /* renamed from: u, reason: collision with root package name */
    public final E0 f3477u = new E0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3479w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3458A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3459B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public I0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f3460a = context;
        this.f3478v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2706o, i, 0);
        this.f3464f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3465g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0246B c0246b = new C0246B(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0122a.f2710s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            S.l.c(c0246b, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0246b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : H1.d.F(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3482z = c0246b;
        c0246b.setInputMethodMode(1);
    }

    @Override // m.InterfaceC0214C
    public final boolean a() {
        return this.f3482z.isShowing();
    }

    public final void c(int i) {
        this.f3464f = i;
    }

    public final int d() {
        return this.f3464f;
    }

    @Override // m.InterfaceC0214C
    public final void dismiss() {
        C0246B c0246b = this.f3482z;
        c0246b.dismiss();
        c0246b.setContentView(null);
        this.f3462c = null;
        this.f3478v.removeCallbacks(this.f3474r);
    }

    @Override // m.InterfaceC0214C
    public final C0305v0 e() {
        return this.f3462c;
    }

    @Override // m.InterfaceC0214C
    public final void h() {
        int i;
        int paddingBottom;
        C0305v0 c0305v0;
        C0305v0 c0305v02 = this.f3462c;
        C0246B c0246b = this.f3482z;
        Context context = this.f3460a;
        if (c0305v02 == null) {
            C0305v0 q2 = q(context, !this.f3481y);
            this.f3462c = q2;
            q2.setAdapter(this.f3461b);
            this.f3462c.setOnItemClickListener(this.f3472p);
            this.f3462c.setFocusable(true);
            this.f3462c.setFocusableInTouchMode(true);
            this.f3462c.setOnItemSelectedListener(new B0(this));
            this.f3462c.setOnScrollListener(this.f3476t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3473q;
            if (onItemSelectedListener != null) {
                this.f3462c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0246b.setContentView(this.f3462c);
        }
        Drawable background = c0246b.getBackground();
        Rect rect = this.f3479w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f3465g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = C0.a(c0246b, this.f3471o, this.f3465g, c0246b.getInputMethodMode() == 2);
        int i3 = this.f3463d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.e;
            int a3 = this.f3462c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f3462c.getPaddingBottom() + this.f3462c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f3482z.getInputMethodMode() == 2;
        S.l.d(c0246b, this.f3466h);
        if (c0246b.isShowing()) {
            if (this.f3471o.isAttachedToWindow()) {
                int i5 = this.e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f3471o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0246b.setWidth(this.e == -1 ? -1 : 0);
                        c0246b.setHeight(0);
                    } else {
                        c0246b.setWidth(this.e == -1 ? -1 : 0);
                        c0246b.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0246b.setOutsideTouchable(true);
                View view = this.f3471o;
                int i6 = this.f3464f;
                int i7 = this.f3465g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0246b.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f3471o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0246b.setWidth(i8);
        c0246b.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3458A;
            if (method != null) {
                try {
                    method.invoke(c0246b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            D0.b(c0246b, true);
        }
        c0246b.setOutsideTouchable(true);
        c0246b.setTouchInterceptor(this.f3475s);
        if (this.f3467k) {
            S.l.c(c0246b, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3459B;
            if (method2 != null) {
                try {
                    method2.invoke(c0246b, this.f3480x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            D0.a(c0246b, this.f3480x);
        }
        c0246b.showAsDropDown(this.f3471o, this.f3464f, this.f3465g, this.f3468l);
        this.f3462c.setSelection(-1);
        if ((!this.f3481y || this.f3462c.isInTouchMode()) && (c0305v0 = this.f3462c) != null) {
            c0305v0.setListSelectionHidden(true);
            c0305v0.requestLayout();
        }
        if (this.f3481y) {
            return;
        }
        this.f3478v.post(this.f3477u);
    }

    public final int i() {
        if (this.i) {
            return this.f3465g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f3482z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f3465g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f3482z.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        F0 f02 = this.f3470n;
        if (f02 == null) {
            this.f3470n = new F0(this);
        } else {
            ListAdapter listAdapter2 = this.f3461b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(f02);
            }
        }
        this.f3461b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3470n);
        }
        C0305v0 c0305v0 = this.f3462c;
        if (c0305v0 != null) {
            c0305v0.setAdapter(this.f3461b);
        }
    }

    public C0305v0 q(Context context, boolean z2) {
        return new C0305v0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f3482z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.f3479w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
