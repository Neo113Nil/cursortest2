package h;

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
import c.AbstractC0098a;
import d.AbstractC0110a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class J implements g.r {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2102A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2103B;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2104e;

    /* renamed from: f, reason: collision with root package name */
    public ListAdapter f2105f;

    /* renamed from: g, reason: collision with root package name */
    public L f2106g;

    /* renamed from: i, reason: collision with root package name */
    public int f2108i;

    /* renamed from: j, reason: collision with root package name */
    public int f2109j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2110k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2111l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2112m;

    /* renamed from: o, reason: collision with root package name */
    public B.b f2114o;

    /* renamed from: p, reason: collision with root package name */
    public View f2115p;

    /* renamed from: q, reason: collision with root package name */
    public g.l f2116q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f2120v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f2122x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2123y;

    /* renamed from: z, reason: collision with root package name */
    public final r f2124z;

    /* renamed from: h, reason: collision with root package name */
    public int f2107h = -2;

    /* renamed from: n, reason: collision with root package name */
    public int f2113n = 0;
    public final RunnableC0147G r = new RunnableC0147G(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final I f2117s = new I(this);

    /* renamed from: t, reason: collision with root package name */
    public final H f2118t = new H(this);

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC0147G f2119u = new RunnableC0147G(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2121w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2102A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2103B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public J(Context context, int i2) {
        int resourceId;
        this.f2104e = context;
        this.f2120v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0098a.f1650k, i2, 0);
        this.f2108i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2109j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2110k = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0098a.f1654o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            A.n.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0110a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f2124z = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        B.b bVar = this.f2114o;
        if (bVar == null) {
            this.f2114o = new B.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f2105f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f2105f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2114o);
        }
        L l2 = this.f2106g;
        if (l2 != null) {
            l2.setAdapter(this.f2105f);
        }
    }

    @Override // g.r
    public final boolean c() {
        return this.f2124z.isShowing();
    }

    @Override // g.r
    public final void dismiss() {
        r rVar = this.f2124z;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f2106g = null;
        this.f2120v.removeCallbacks(this.r);
    }

    @Override // g.r
    public final ListView e() {
        return this.f2106g;
    }

    @Override // g.r
    public final void g() {
        int i2;
        L l2;
        L l3 = this.f2106g;
        r rVar = this.f2124z;
        Context context = this.f2104e;
        if (l3 == null) {
            L l4 = new L(context, !this.f2123y);
            l4.setHoverListener((M) this);
            this.f2106g = l4;
            l4.setAdapter(this.f2105f);
            this.f2106g.setOnItemClickListener(this.f2116q);
            this.f2106g.setFocusable(true);
            this.f2106g.setFocusableInTouchMode(true);
            this.f2106g.setOnItemSelectedListener(new C0146F(r0, this));
            this.f2106g.setOnScrollListener(this.f2118t);
            rVar.setContentView(this.f2106g);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f2121w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f2110k) {
                this.f2109j = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f2115p, this.f2109j, rVar.getInputMethodMode() == 2);
        int i4 = this.f2107h;
        int a2 = this.f2106g.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a2 + (a2 > 0 ? this.f2106g.getPaddingBottom() + this.f2106g.getPaddingTop() + i2 : 0);
        this.f2124z.getInputMethodMode();
        A.n.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f2115p;
            Field field = w.x.f3075a;
            if (view.isAttachedToWindow()) {
                int i5 = this.f2107h;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.f2115p.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f2115p, this.f2108i, this.f2109j, i5 < 0 ? -1 : i5, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i6 = this.f2107h;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = this.f2115p.getWidth();
        }
        rVar.setWidth(i6);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2102A;
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
        rVar.setTouchInterceptor(this.f2117s);
        if (this.f2112m) {
            A.n.c(rVar, this.f2111l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2103B;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f2122x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f2122x);
        }
        rVar.showAsDropDown(this.f2115p, this.f2108i, this.f2109j, this.f2113n);
        this.f2106g.setSelection(-1);
        if ((!this.f2123y || this.f2106g.isInTouchMode()) && (l2 = this.f2106g) != null) {
            l2.setListSelectionHidden(true);
            l2.requestLayout();
        }
        if (this.f2123y) {
            return;
        }
        this.f2120v.post(this.f2119u);
    }
}
