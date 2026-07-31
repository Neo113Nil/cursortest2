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
import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j1 implements k.q {
    public static final Method A;

    /* renamed from: z, reason: collision with root package name */
    public static final Method f4296z;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4297d;

    /* renamed from: e, reason: collision with root package name */
    public ListAdapter f4298e;

    /* renamed from: f, reason: collision with root package name */
    public n1 f4299f;

    /* renamed from: h, reason: collision with root package name */
    public int f4301h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4302j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4303k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4304l;

    /* renamed from: n, reason: collision with root package name */
    public g1 f4306n;

    /* renamed from: o, reason: collision with root package name */
    public View f4307o;

    /* renamed from: p, reason: collision with root package name */
    public k.k f4308p;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f4313u;

    /* renamed from: w, reason: collision with root package name */
    public Rect f4315w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4316x;

    /* renamed from: y, reason: collision with root package name */
    public final y f4317y;

    /* renamed from: g, reason: collision with root package name */
    public int f4300g = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f4305m = 0;

    /* renamed from: q, reason: collision with root package name */
    public final f1 f4309q = new f1(this, 1);

    /* renamed from: r, reason: collision with root package name */
    public final i1 f4310r = new i1(this);

    /* renamed from: s, reason: collision with root package name */
    public final h1 f4311s = new h1(this);

    /* renamed from: t, reason: collision with root package name */
    public final f1 f4312t = new f1(this, 0);

    /* renamed from: v, reason: collision with root package name */
    public final Rect f4314v = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4296z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public j1(Context context, int i) {
        int resourceId;
        this.f4297d = context;
        this.f4313u = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, h.a.f3059l, i, 0);
        this.f4301h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4302j = true;
        }
        obtainStyledAttributes.recycle();
        y yVar = new y(context, null, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, h.a.f3063p, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            yVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : h0.a.D(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f4317y = yVar;
        yVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        g1 g1Var = this.f4306n;
        if (g1Var == null) {
            this.f4306n = new g1(this);
        } else {
            ListAdapter listAdapter2 = this.f4298e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(g1Var);
            }
        }
        this.f4298e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4306n);
        }
        n1 n1Var = this.f4299f;
        if (n1Var != null) {
            n1Var.setAdapter(this.f4298e);
        }
    }

    @Override // k.q
    public final void d() {
        int i;
        n1 n1Var;
        n1 n1Var2 = this.f4299f;
        Context context = this.f4297d;
        y yVar = this.f4317y;
        if (n1Var2 == null) {
            n1 n1Var3 = new n1(context, !this.f4316x);
            n1Var3.setHoverListener((o1) this);
            this.f4299f = n1Var3;
            n1Var3.setAdapter(this.f4298e);
            this.f4299f.setOnItemClickListener(this.f4308p);
            this.f4299f.setFocusable(true);
            this.f4299f.setFocusableInTouchMode(true);
            this.f4299f.setOnItemSelectedListener(new c1(this));
            this.f4299f.setOnScrollListener(this.f4311s);
            yVar.setContentView(this.f4299f);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.f4314v;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i = rect.bottom + i8;
            if (!this.f4302j) {
                this.i = -i8;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a8 = d1.a(yVar, this.f4307o, this.i, yVar.getInputMethodMode() == 2);
        int i9 = this.f4300g;
        int a9 = this.f4299f.a(i9 != -2 ? i9 != -1 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a8);
        int paddingBottom = a9 + (a9 > 0 ? this.f4299f.getPaddingBottom() + this.f4299f.getPaddingTop() + i : 0);
        yVar.getInputMethodMode();
        yVar.setWindowLayoutType(1002);
        if (yVar.isShowing()) {
            if (this.f4307o.isAttachedToWindow()) {
                int i10 = this.f4300g;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.f4307o.getWidth();
                }
                yVar.setOutsideTouchable(true);
                yVar.update(this.f4307o, this.f4301h, this.i, i10 < 0 ? -1 : i10, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i11 = this.f4300g;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.f4307o.getWidth();
        }
        yVar.setWidth(i11);
        yVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f4296z;
            if (method != null) {
                try {
                    method.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            e1.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.f4310r);
        if (this.f4304l) {
            yVar.setOverlapAnchor(this.f4303k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, this.f4315w);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            e1.a(yVar, this.f4315w);
        }
        yVar.showAsDropDown(this.f4307o, this.f4301h, this.i, this.f4305m);
        this.f4299f.setSelection(-1);
        if ((!this.f4316x || this.f4299f.isInTouchMode()) && (n1Var = this.f4299f) != null) {
            n1Var.setListSelectionHidden(true);
            n1Var.requestLayout();
        }
        if (this.f4316x) {
            return;
        }
        this.f4313u.post(this.f4312t);
    }

    @Override // k.q
    public final void dismiss() {
        y yVar = this.f4317y;
        yVar.dismiss();
        yVar.setContentView(null);
        this.f4299f = null;
        this.f4313u.removeCallbacks(this.f4309q);
    }

    @Override // k.q
    public final ListView g() {
        return this.f4299f;
    }

    @Override // k.q
    public final boolean k() {
        return this.f4317y.isShowing();
    }
}
