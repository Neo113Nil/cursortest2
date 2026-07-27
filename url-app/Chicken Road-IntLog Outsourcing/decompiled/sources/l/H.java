package l;

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
import g.AbstractC0444a;
import h.AbstractC0477a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class H implements k.q {

    /* renamed from: w, reason: collision with root package name */
    public static final Method f10768w;

    /* renamed from: x, reason: collision with root package name */
    public static final Method f10769x;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10770a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f10771b;

    /* renamed from: c, reason: collision with root package name */
    public J f10772c;

    /* renamed from: e, reason: collision with root package name */
    public int f10774e;

    /* renamed from: f, reason: collision with root package name */
    public int f10775f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10776g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10777h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10778i;

    /* renamed from: k, reason: collision with root package name */
    public J.b f10780k;

    /* renamed from: l, reason: collision with root package name */
    public View f10781l;

    /* renamed from: m, reason: collision with root package name */
    public k.k f10782m;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f10787r;

    /* renamed from: t, reason: collision with root package name */
    public Rect f10789t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10790u;

    /* renamed from: v, reason: collision with root package name */
    public final C1245q f10791v;

    /* renamed from: d, reason: collision with root package name */
    public int f10773d = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f10779j = 0;

    /* renamed from: n, reason: collision with root package name */
    public final E f10783n = new E(this, 1);

    /* renamed from: o, reason: collision with root package name */
    public final G f10784o = new G(this);

    /* renamed from: p, reason: collision with root package name */
    public final F f10785p = new F(this);

    /* renamed from: q, reason: collision with root package name */
    public final E f10786q = new E(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final Rect f10788s = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f10768w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f10769x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public H(Context context, int i2) {
        int resourceId;
        this.f10770a = context;
        this.f10787r = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0444a.f5703k, i2, 0);
        this.f10774e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f10775f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f10776g = true;
        }
        obtainStyledAttributes.recycle();
        C1245q c1245q = new C1245q(context, null, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0444a.f5707o, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            I.k.c(c1245q, obtainStyledAttributes2.getBoolean(2, false));
        }
        c1245q.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0477a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f10791v = c1245q;
        c1245q.setInputMethodMode(1);
    }

    public final void b(ListAdapter listAdapter) {
        J.b bVar = this.f10780k;
        if (bVar == null) {
            this.f10780k = new J.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f10771b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f10771b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f10780k);
        }
        J j2 = this.f10772c;
        if (j2 != null) {
            j2.setAdapter(this.f10771b);
        }
    }

    @Override // k.q
    public final void d() {
        int i2;
        J j2;
        J j6 = this.f10772c;
        C1245q c1245q = this.f10791v;
        Context context = this.f10770a;
        if (j6 == null) {
            J j7 = new J(context, !this.f10790u);
            j7.setHoverListener((K) this);
            this.f10772c = j7;
            j7.setAdapter(this.f10771b);
            this.f10772c.setOnItemClickListener(this.f10782m);
            this.f10772c.setFocusable(true);
            this.f10772c.setFocusableInTouchMode(true);
            this.f10772c.setOnItemSelectedListener(new D(r0, this));
            this.f10772c.setOnScrollListener(this.f10785p);
            c1245q.setContentView(this.f10772c);
        }
        Drawable background = c1245q.getBackground();
        Rect rect = this.f10788s;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f10776g) {
                this.f10775f = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = c1245q.getMaxAvailableHeight(this.f10781l, this.f10775f, c1245q.getInputMethodMode() == 2);
        int i6 = this.f10773d;
        int a6 = this.f10772c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a6 + (a6 > 0 ? this.f10772c.getPaddingBottom() + this.f10772c.getPaddingTop() + i2 : 0);
        this.f10791v.getInputMethodMode();
        I.k.d(c1245q, 1002);
        if (c1245q.isShowing()) {
            View view = this.f10781l;
            Field field = E.G.f566a;
            if (view.isAttachedToWindow()) {
                int i7 = this.f10773d;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f10781l.getWidth();
                }
                c1245q.setOutsideTouchable(true);
                c1245q.update(this.f10781l, this.f10774e, this.f10775f, i7 < 0 ? -1 : i7, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i8 = this.f10773d;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f10781l.getWidth();
        }
        c1245q.setWidth(i8);
        c1245q.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f10768w;
            if (method != null) {
                try {
                    method.invoke(c1245q, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            c1245q.setIsClippedToScreen(true);
        }
        c1245q.setOutsideTouchable(true);
        c1245q.setTouchInterceptor(this.f10784o);
        if (this.f10778i) {
            I.k.c(c1245q, this.f10777h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f10769x;
            if (method2 != null) {
                try {
                    method2.invoke(c1245q, this.f10789t);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            c1245q.setEpicenterBounds(this.f10789t);
        }
        c1245q.showAsDropDown(this.f10781l, this.f10774e, this.f10775f, this.f10779j);
        this.f10772c.setSelection(-1);
        if ((!this.f10790u || this.f10772c.isInTouchMode()) && (j2 = this.f10772c) != null) {
            j2.setListSelectionHidden(true);
            j2.requestLayout();
        }
        if (this.f10790u) {
            return;
        }
        this.f10787r.post(this.f10786q);
    }

    @Override // k.q
    public final void dismiss() {
        C1245q c1245q = this.f10791v;
        c1245q.dismiss();
        c1245q.setContentView(null);
        this.f10772c = null;
        this.f10787r.removeCallbacks(this.f10783n);
    }

    @Override // k.q
    public final ListView g() {
        return this.f10772c;
    }

    @Override // k.q
    public final boolean k() {
        return this.f10791v.isShowing();
    }
}
