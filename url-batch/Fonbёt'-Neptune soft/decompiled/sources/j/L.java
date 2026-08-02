package j;

import a.AbstractC0132a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.AbstractC0165a;
import i.AbstractC0213k;
import i.InterfaceC0219q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class L implements InterfaceC0219q {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2873A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2874B;

    /* renamed from: C, reason: collision with root package name */
    public static final Method f2875C;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2876e;

    /* renamed from: f, reason: collision with root package name */
    public ListAdapter f2877f;

    /* renamed from: g, reason: collision with root package name */
    public N f2878g;

    /* renamed from: i, reason: collision with root package name */
    public int f2880i;

    /* renamed from: j, reason: collision with root package name */
    public int f2881j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2882k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2883l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2884m;

    /* renamed from: o, reason: collision with root package name */
    public G.b f2886o;

    /* renamed from: p, reason: collision with root package name */
    public View f2887p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC0213k f2888q;
    public final Handler v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2894x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2895y;

    /* renamed from: z, reason: collision with root package name */
    public final C0242s f2896z;

    /* renamed from: h, reason: collision with root package name */
    public int f2879h = -2;

    /* renamed from: n, reason: collision with root package name */
    public int f2885n = 0;

    /* renamed from: r, reason: collision with root package name */
    public final I f2889r = new I(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final K f2890s = new K(this);

    /* renamed from: t, reason: collision with root package name */
    public final J f2891t = new J(this);

    /* renamed from: u, reason: collision with root package name */
    public final I f2892u = new I(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2893w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2873A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2875C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2874B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public L(Context context, int i2) {
        int resourceId;
        this.f2876e = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0165a.f1973k, i2, 0);
        this.f2880i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2881j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2882k = true;
        }
        obtainStyledAttributes.recycle();
        C0242s c0242s = new C0242s(context, null, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0165a.f1977o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            AbstractC0132a.F(c0242s, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0242s.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : d.b.c(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2896z = c0242s;
        c0242s.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        G.b bVar = this.f2886o;
        if (bVar == null) {
            this.f2886o = new G.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2877f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f2877f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2886o);
        }
        N n2 = this.f2878g;
        if (n2 != null) {
            n2.setAdapter(this.f2877f);
        }
    }

    @Override // i.InterfaceC0219q
    public final void c() {
        int i2;
        int maxAvailableHeight;
        N n2;
        int i3 = 0;
        N n3 = this.f2878g;
        C0242s c0242s = this.f2896z;
        Context context = this.f2876e;
        if (n3 == null) {
            N n4 = new N(context, !this.f2895y);
            n4.setHoverListener((O) this);
            this.f2878g = n4;
            n4.setAdapter(this.f2877f);
            this.f2878g.setOnItemClickListener(this.f2888q);
            this.f2878g.setFocusable(true);
            this.f2878g.setFocusableInTouchMode(true);
            this.f2878g.setOnItemSelectedListener(new H(i3, this));
            this.f2878g.setOnScrollListener(this.f2891t);
            c0242s.setContentView(this.f2878g);
        }
        Drawable background = c0242s.getBackground();
        Rect rect = this.f2893w;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i2 = rect.bottom + i4;
            if (!this.f2882k) {
                this.f2881j = -i4;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        boolean z2 = c0242s.getInputMethodMode() == 2;
        View view = this.f2887p;
        int i5 = this.f2881j;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f2874B;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(c0242s, view, Integer.valueOf(i5), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = c0242s.getMaxAvailableHeight(view, i5);
        } else {
            maxAvailableHeight = c0242s.getMaxAvailableHeight(view, i5, z2);
        }
        int i6 = this.f2879h;
        int a2 = this.f2878g.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a2 + (a2 > 0 ? this.f2878g.getPaddingBottom() + this.f2878g.getPaddingTop() + i2 : 0);
        this.f2896z.getInputMethodMode();
        if (Build.VERSION.SDK_INT >= 23) {
            F.m.d(c0242s, 1002);
        } else {
            if (!AbstractC0132a.f1249g) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    AbstractC0132a.f1248f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused2) {
                }
                AbstractC0132a.f1249g = true;
            }
            Method method2 = AbstractC0132a.f1248f;
            if (method2 != null) {
                try {
                    method2.invoke(c0242s, 1002);
                } catch (Exception unused3) {
                }
            }
        }
        if (c0242s.isShowing()) {
            View view2 = this.f2887p;
            Field field = A.z.f58a;
            if (view2.isAttachedToWindow()) {
                int i7 = this.f2879h;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f2887p.getWidth();
                }
                c0242s.setOutsideTouchable(true);
                c0242s.update(this.f2887p, this.f2880i, this.f2881j, i7 < 0 ? -1 : i7, paddingBottom >= 0 ? paddingBottom : -1);
                return;
            }
            return;
        }
        int i8 = this.f2879h;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f2887p.getWidth();
        }
        c0242s.setWidth(i8);
        c0242s.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f2873A;
            if (method3 != null) {
                try {
                    method3.invoke(c0242s, Boolean.TRUE);
                } catch (Exception unused4) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            c0242s.setIsClippedToScreen(true);
        }
        c0242s.setOutsideTouchable(true);
        c0242s.setTouchInterceptor(this.f2890s);
        if (this.f2884m) {
            AbstractC0132a.F(c0242s, this.f2883l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method4 = f2875C;
            if (method4 != null) {
                try {
                    method4.invoke(c0242s, this.f2894x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            c0242s.setEpicenterBounds(this.f2894x);
        }
        c0242s.showAsDropDown(this.f2887p, this.f2880i, this.f2881j, this.f2885n);
        this.f2878g.setSelection(-1);
        if ((!this.f2895y || this.f2878g.isInTouchMode()) && (n2 = this.f2878g) != null) {
            n2.setListSelectionHidden(true);
            n2.requestLayout();
        }
        if (this.f2895y) {
            return;
        }
        this.v.post(this.f2892u);
    }

    @Override // i.InterfaceC0219q
    public final void dismiss() {
        C0242s c0242s = this.f2896z;
        c0242s.dismiss();
        c0242s.setContentView(null);
        this.f2878g = null;
        this.v.removeCallbacks(this.f2889r);
    }

    @Override // i.InterfaceC0219q
    public final boolean i() {
        return this.f2896z.isShowing();
    }

    @Override // i.InterfaceC0219q
    public final ListView j() {
        return this.f2878g;
    }
}
