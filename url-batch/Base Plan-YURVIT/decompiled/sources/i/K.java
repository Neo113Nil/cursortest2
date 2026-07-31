package i;

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
import d.AbstractC0119a;
import e.AbstractC0121a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class K implements h.r {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2133A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2134B;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2135e;

    /* renamed from: f, reason: collision with root package name */
    public ListAdapter f2136f;

    /* renamed from: g, reason: collision with root package name */
    public M f2137g;

    /* renamed from: i, reason: collision with root package name */
    public int f2139i;

    /* renamed from: j, reason: collision with root package name */
    public int f2140j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2141k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2142l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2143m;

    /* renamed from: o, reason: collision with root package name */
    public D.b f2145o;

    /* renamed from: p, reason: collision with root package name */
    public View f2146p;

    /* renamed from: q, reason: collision with root package name */
    public h.l f2147q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2151v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2153x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2154y;

    /* renamed from: z, reason: collision with root package name */
    public final r f2155z;

    /* renamed from: h, reason: collision with root package name */
    public int f2138h = -2;

    /* renamed from: n, reason: collision with root package name */
    public int f2144n = 0;

    /* renamed from: r, reason: collision with root package name */
    public final RunnableC0153H f2148r = new RunnableC0153H(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final J f2149s = new J(this);
    public final I t = new I(this);

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC0153H f2150u = new RunnableC0153H(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2152w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2133A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2134B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public K(Context context, int i2) {
        int resourceId;
        this.f2135e = context;
        this.f2151v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0119a.f1797k, i2, 0);
        this.f2139i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2140j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2141k = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0119a.f1801o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            C.m.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0121a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2155z = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        D.b bVar = this.f2145o;
        if (bVar == null) {
            this.f2145o = new D.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2136f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f2136f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2145o);
        }
        M m2 = this.f2137g;
        if (m2 != null) {
            m2.setAdapter(this.f2136f);
        }
    }

    @Override // h.r
    public final void c() {
        int i2;
        M m2;
        M m3 = this.f2137g;
        Context context = this.f2135e;
        r rVar = this.f2155z;
        if (m3 == null) {
            M m4 = new M(context, !this.f2154y);
            m4.setHoverListener((N) this);
            this.f2137g = m4;
            m4.setAdapter(this.f2136f);
            this.f2137g.setOnItemClickListener(this.f2147q);
            this.f2137g.setFocusable(true);
            this.f2137g.setFocusableInTouchMode(true);
            this.f2137g.setOnItemSelectedListener(new C0152G(r4, this));
            this.f2137g.setOnScrollListener(this.t);
            rVar.setContentView(this.f2137g);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f2152w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f2141k) {
                this.f2140j = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f2146p, this.f2140j, rVar.getInputMethodMode() == 2);
        int i4 = this.f2138h;
        int a2 = this.f2137g.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a2 + (a2 > 0 ? this.f2137g.getPaddingBottom() + this.f2137g.getPaddingTop() + i2 : 0);
        this.f2155z.getInputMethodMode();
        C.m.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f2146p;
            Field field = y.x.f3160a;
            if (view.isAttachedToWindow()) {
                int i5 = this.f2138h;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2146p.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f2146p, this.f2139i, this.f2140j, i5 < 0 ? -1 : i5, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i6 = this.f2138h;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = this.f2146p.getWidth();
        }
        rVar.setWidth(i6);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2133A;
            if (method != null) {
                try {
                    method.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f2149s);
        if (this.f2143m) {
            C.m.c(rVar, this.f2142l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2134B;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f2153x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f2153x);
        }
        rVar.showAsDropDown(this.f2146p, this.f2139i, this.f2140j, this.f2144n);
        this.f2137g.setSelection(-1);
        if ((!this.f2154y || this.f2137g.isInTouchMode()) && (m2 = this.f2137g) != null) {
            m2.setListSelectionHidden(true);
            m2.requestLayout();
        }
        if (this.f2154y) {
            return;
        }
        this.f2151v.post(this.f2150u);
    }

    @Override // h.r
    public final void dismiss() {
        r rVar = this.f2155z;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f2137g = null;
        this.f2151v.removeCallbacks(this.f2148r);
    }

    @Override // h.r
    public final ListView e() {
        return this.f2137g;
    }

    @Override // h.r
    public final boolean j() {
        return this.f2155z.isShowing();
    }
}
