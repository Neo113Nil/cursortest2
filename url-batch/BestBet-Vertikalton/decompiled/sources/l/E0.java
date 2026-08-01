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
import c1.AbstractC0091d;
import java.lang.reflect.Method;
import k.InterfaceC0174D;

/* loaded from: classes.dex */
public class E0 implements InterfaceC0174D {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f3259A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f3260B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3261a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f3262b;

    /* renamed from: c, reason: collision with root package name */
    public C0257r0 f3263c;

    /* renamed from: f, reason: collision with root package name */
    public int f3265f;

    /* renamed from: g, reason: collision with root package name */
    public int f3266g;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3267j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3268k;

    /* renamed from: n, reason: collision with root package name */
    public B0 f3271n;

    /* renamed from: o, reason: collision with root package name */
    public View f3272o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f3273p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f3274q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f3279v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f3281x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3282y;

    /* renamed from: z, reason: collision with root package name */
    public final C0204A f3283z;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f3264e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f3269l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f3270m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final A0 f3275r = new A0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final D0 f3276s = new D0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C0 f3277t = new C0(this);

    /* renamed from: u, reason: collision with root package name */
    public final A0 f3278u = new A0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3280w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3259A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3260B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public E0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f3261a = context;
        this.f3279v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f2525o, i, 0);
        this.f3265f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3266g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C0204A c0204a = new C0204A(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f2529s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            Q.l.c(c0204a, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0204a.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0091d.j(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3283z = c0204a;
        c0204a.setInputMethodMode(1);
    }

    @Override // k.InterfaceC0174D
    public final boolean a() {
        return this.f3283z.isShowing();
    }

    public final void c(int i) {
        this.f3265f = i;
    }

    @Override // k.InterfaceC0174D
    public final void dismiss() {
        C0204A c0204a = this.f3283z;
        c0204a.dismiss();
        c0204a.setContentView(null);
        this.f3263c = null;
        this.f3279v.removeCallbacks(this.f3275r);
    }

    public final int e() {
        return this.f3265f;
    }

    @Override // k.InterfaceC0174D
    public final C0257r0 f() {
        return this.f3263c;
    }

    @Override // k.InterfaceC0174D
    public final void i() {
        int i;
        int paddingBottom;
        C0257r0 c0257r0;
        C0257r0 c0257r02 = this.f3263c;
        C0204A c0204a = this.f3283z;
        Context context = this.f3261a;
        if (c0257r02 == null) {
            C0257r0 q2 = q(context, !this.f3282y);
            this.f3263c = q2;
            q2.setAdapter(this.f3262b);
            this.f3263c.setOnItemClickListener(this.f3273p);
            this.f3263c.setFocusable(true);
            this.f3263c.setFocusableInTouchMode(true);
            this.f3263c.setOnItemSelectedListener(new C0269x0(this));
            this.f3263c.setOnScrollListener(this.f3277t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3274q;
            if (onItemSelectedListener != null) {
                this.f3263c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0204a.setContentView(this.f3263c);
        }
        Drawable background = c0204a.getBackground();
        Rect rect = this.f3280w;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.f3266g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a2 = AbstractC0271y0.a(c0204a, this.f3272o, this.f3266g, c0204a.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = a2 + i;
        } else {
            int i4 = this.f3264e;
            int a3 = this.f3263c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a2);
            paddingBottom = a3 + (a3 > 0 ? this.f3263c.getPaddingBottom() + this.f3263c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f3283z.getInputMethodMode() == 2;
        Q.l.d(c0204a, this.h);
        if (c0204a.isShowing()) {
            if (this.f3272o.isAttachedToWindow()) {
                int i5 = this.f3264e;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f3272o.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0204a.setWidth(this.f3264e == -1 ? -1 : 0);
                        c0204a.setHeight(0);
                    } else {
                        c0204a.setWidth(this.f3264e == -1 ? -1 : 0);
                        c0204a.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0204a.setOutsideTouchable(true);
                View view = this.f3272o;
                int i6 = this.f3265f;
                int i7 = this.f3266g;
                if (i5 < 0) {
                    i5 = -1;
                }
                c0204a.update(view, i6, i7, i5, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i8 = this.f3264e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f3272o.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0204a.setWidth(i8);
        c0204a.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3259A;
            if (method != null) {
                try {
                    method.invoke(c0204a, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0273z0.b(c0204a, true);
        }
        c0204a.setOutsideTouchable(true);
        c0204a.setTouchInterceptor(this.f3276s);
        if (this.f3268k) {
            Q.l.c(c0204a, this.f3267j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3260B;
            if (method2 != null) {
                try {
                    method2.invoke(c0204a, this.f3281x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC0273z0.a(c0204a, this.f3281x);
        }
        c0204a.showAsDropDown(this.f3272o, this.f3265f, this.f3266g, this.f3269l);
        this.f3263c.setSelection(-1);
        if ((!this.f3282y || this.f3263c.isInTouchMode()) && (c0257r0 = this.f3263c) != null) {
            c0257r0.setListSelectionHidden(true);
            c0257r0.requestLayout();
        }
        if (this.f3282y) {
            return;
        }
        this.f3279v.post(this.f3278u);
    }

    public final int j() {
        if (this.i) {
            return this.f3266g;
        }
        return 0;
    }

    public final void k(Drawable drawable) {
        this.f3283z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.f3266g = i;
        this.i = true;
    }

    public final Drawable m() {
        return this.f3283z.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        B0 b02 = this.f3271n;
        if (b02 == null) {
            this.f3271n = new B0(this);
        } else {
            ListAdapter listAdapter2 = this.f3262b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(b02);
            }
        }
        this.f3262b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3271n);
        }
        C0257r0 c0257r0 = this.f3263c;
        if (c0257r0 != null) {
            c0257r0.setAdapter(this.f3262b);
        }
    }

    public C0257r0 q(Context context, boolean z2) {
        return new C0257r0(context, z2);
    }

    public final void r(int i) {
        Drawable background = this.f3283z.getBackground();
        if (background == null) {
            this.f3264e = i;
            return;
        }
        Rect rect = this.f3280w;
        background.getPadding(rect);
        this.f3264e = rect.left + rect.right + i;
    }
}
