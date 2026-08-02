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
import g.AbstractC0328a;
import h.AbstractC0337a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k.AbstractC1067l;
import k.InterfaceC1073r;

/* loaded from: classes.dex */
public abstract class K implements InterfaceC1073r {

    /* renamed from: w, reason: collision with root package name */
    public static final Method f9731w;

    /* renamed from: x, reason: collision with root package name */
    public static final Method f9732x;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9733a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f9734b;

    /* renamed from: c, reason: collision with root package name */
    public M f9735c;

    /* renamed from: e, reason: collision with root package name */
    public int f9737e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9738g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9739h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9740i;

    /* renamed from: k, reason: collision with root package name */
    public I.a f9742k;

    /* renamed from: l, reason: collision with root package name */
    public View f9743l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC1067l f9744m;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f9748r;

    /* renamed from: t, reason: collision with root package name */
    public Rect f9750t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9751u;
    public final r v;

    /* renamed from: d, reason: collision with root package name */
    public int f9736d = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f9741j = 0;

    /* renamed from: n, reason: collision with root package name */
    public final H f9745n = new H(this, 1);
    public final J o = new J(this);

    /* renamed from: p, reason: collision with root package name */
    public final I f9746p = new I(this);

    /* renamed from: q, reason: collision with root package name */
    public final H f9747q = new H(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final Rect f9749s = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f9731w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f9732x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public K(Context context, int i3) {
        int resourceId;
        this.f9733a = context;
        this.f9748r = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0328a.f4998k, i3, 0);
        this.f9737e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9738g = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0328a.o, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            rVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0337a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.v = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void c(ListAdapter listAdapter) {
        I.a aVar = this.f9742k;
        if (aVar == null) {
            this.f9742k = new I.a(1, this);
        } else {
            ListAdapter listAdapter2 = this.f9734b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f9734b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9742k);
        }
        M m3 = this.f9735c;
        if (m3 != null) {
            m3.setAdapter(this.f9734b);
        }
    }

    @Override // k.InterfaceC1073r
    public final void d() {
        int i3;
        M m3;
        M m4 = this.f9735c;
        r rVar = this.v;
        Context context = this.f9733a;
        if (m4 == null) {
            M m5 = new M(context, !this.f9751u);
            m5.setHoverListener((N) this);
            this.f9735c = m5;
            m5.setAdapter(this.f9734b);
            this.f9735c.setOnItemClickListener(this.f9744m);
            this.f9735c.setFocusable(true);
            this.f9735c.setFocusableInTouchMode(true);
            this.f9735c.setOnItemSelectedListener(new G(r0, this));
            this.f9735c.setOnScrollListener(this.f9746p);
            rVar.setContentView(this.f9735c);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f9749s;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i3 = rect.bottom + i4;
            if (!this.f9738g) {
                this.f = -i4;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f9743l, this.f, rVar.getInputMethodMode() == 2);
        int i5 = this.f9736d;
        int a3 = this.f9735c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a3 + (a3 > 0 ? this.f9735c.getPaddingBottom() + this.f9735c.getPaddingTop() + i3 : 0);
        this.v.getInputMethodMode();
        rVar.setWindowLayoutType(1002);
        if (rVar.isShowing()) {
            View view = this.f9743l;
            Field field = E.A.f243a;
            if (view.isAttachedToWindow()) {
                int i6 = this.f9736d;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.f9743l.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f9743l, this.f9737e, this.f, i6 < 0 ? -1 : i6, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i7 = this.f9736d;
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = this.f9743l.getWidth();
        }
        rVar.setWidth(i7);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f9731w;
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
        rVar.setTouchInterceptor(this.o);
        if (this.f9740i) {
            rVar.setOverlapAnchor(this.f9739h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f9732x;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f9750t);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f9750t);
        }
        rVar.showAsDropDown(this.f9743l, this.f9737e, this.f, this.f9741j);
        this.f9735c.setSelection(-1);
        if ((!this.f9751u || this.f9735c.isInTouchMode()) && (m3 = this.f9735c) != null) {
            m3.setListSelectionHidden(true);
            m3.requestLayout();
        }
        if (this.f9751u) {
            return;
        }
        this.f9748r.post(this.f9747q);
    }

    @Override // k.InterfaceC1073r
    public final void dismiss() {
        r rVar = this.v;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f9735c = null;
        this.f9748r.removeCallbacks(this.f9745n);
    }

    @Override // k.InterfaceC1073r
    public final ListView g() {
        return this.f9735c;
    }

    @Override // k.InterfaceC1073r
    public final boolean k() {
        return this.v.isShowing();
    }
}
