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
import h.AbstractC0454a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.InterfaceC0675D;

/* loaded from: classes.dex */
public abstract class I0 implements InterfaceC0675D {

    /* renamed from: H, reason: collision with root package name */
    public static final Method f6641H;

    /* renamed from: I, reason: collision with root package name */
    public static final Method f6642I;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f6645C;

    /* renamed from: E, reason: collision with root package name */
    public Rect f6647E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6648F;

    /* renamed from: G, reason: collision with root package name */
    public final C0747z f6649G;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6650d;

    /* renamed from: e, reason: collision with root package name */
    public ListAdapter f6651e;

    /* renamed from: i, reason: collision with root package name */
    public C0742w0 f6652i;

    /* renamed from: n, reason: collision with root package name */
    public int f6655n;

    /* renamed from: o, reason: collision with root package name */
    public int f6656o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6658q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6659r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6660s;

    /* renamed from: v, reason: collision with root package name */
    public M.b f6663v;

    /* renamed from: w, reason: collision with root package name */
    public View f6664w;

    /* renamed from: x, reason: collision with root package name */
    public AdapterView.OnItemClickListener f6665x;

    /* renamed from: l, reason: collision with root package name */
    public final int f6653l = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f6654m = -2;

    /* renamed from: p, reason: collision with root package name */
    public final int f6657p = 1002;

    /* renamed from: t, reason: collision with root package name */
    public int f6661t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final int f6662u = Integer.MAX_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public final F0 f6666y = new F0(this, 1);

    /* renamed from: z, reason: collision with root package name */
    public final H0 f6667z = new H0(this);

    /* renamed from: A, reason: collision with root package name */
    public final G0 f6643A = new G0(this);

    /* renamed from: B, reason: collision with root package name */
    public final F0 f6644B = new F0(this, 0);

    /* renamed from: D, reason: collision with root package name */
    public final Rect f6646D = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f6641H = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f6642I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public I0(Context context, AttributeSet attributeSet, int i2) {
        int resourceId;
        this.f6650d = context;
        this.f6645C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0454a.f5050o, i2, 0);
        this.f6655n = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6656o = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6658q = true;
        }
        obtainStyledAttributes.recycle();
        C0747z c0747z = new C0747z(context, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0454a.f5054s, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            c0747z.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        c0747z.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : O6.g.M(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f6649G = c0747z;
        c0747z.setInputMethodMode(1);
    }

    public final int a() {
        return this.f6655n;
    }

    @Override // m.InterfaceC0675D
    public final boolean b() {
        return this.f6649G.isShowing();
    }

    @Override // m.InterfaceC0675D
    public final void c() {
        int i2;
        int paddingBottom;
        C0742w0 c0742w0;
        C0742w0 c0742w02 = this.f6652i;
        Context context = this.f6650d;
        C0747z c0747z = this.f6649G;
        if (c0742w02 == null) {
            C0742w0 q4 = q(context, !this.f6648F);
            this.f6652i = q4;
            q4.setAdapter(this.f6651e);
            this.f6652i.setOnItemClickListener(this.f6665x);
            this.f6652i.setFocusable(true);
            this.f6652i.setFocusableInTouchMode(true);
            this.f6652i.setOnItemSelectedListener(new C0(0, this));
            this.f6652i.setOnScrollListener(this.f6643A);
            c0747z.setContentView(this.f6652i);
        }
        Drawable background = c0747z.getBackground();
        Rect rect = this.f6646D;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i2 = rect.bottom + i5;
            if (!this.f6658q) {
                this.f6656o = -i5;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int a7 = D0.a(c0747z, this.f6664w, this.f6656o, c0747z.getInputMethodMode() == 2);
        int i7 = this.f6653l;
        if (i7 == -1) {
            paddingBottom = a7 + i2;
        } else {
            int i8 = this.f6654m;
            int a8 = this.f6652i.a(i8 != -2 ? i8 != -1 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a7);
            paddingBottom = a8 + (a8 > 0 ? this.f6652i.getPaddingBottom() + this.f6652i.getPaddingTop() + i2 : 0);
        }
        boolean z7 = this.f6649G.getInputMethodMode() == 2;
        c0747z.setWindowLayoutType(this.f6657p);
        if (c0747z.isShowing()) {
            View view = this.f6664w;
            WeakHashMap weakHashMap = I.T.f1153a;
            if (view.isAttachedToWindow()) {
                int i9 = this.f6654m;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.f6664w.getWidth();
                }
                if (i7 == -1) {
                    i7 = z7 ? paddingBottom : -1;
                    if (z7) {
                        c0747z.setWidth(this.f6654m == -1 ? -1 : 0);
                        c0747z.setHeight(0);
                    } else {
                        c0747z.setWidth(this.f6654m == -1 ? -1 : 0);
                        c0747z.setHeight(-1);
                    }
                } else if (i7 == -2) {
                    i7 = paddingBottom;
                }
                c0747z.setOutsideTouchable(true);
                View view2 = this.f6664w;
                int i10 = i9;
                int i11 = this.f6655n;
                int i12 = this.f6656o;
                int i13 = i10 < 0 ? -1 : i10;
                if (i7 < 0) {
                    i7 = -1;
                }
                c0747z.update(view2, i11, i12, i13, i7);
                return;
            }
            return;
        }
        int i14 = this.f6654m;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f6664w.getWidth();
        }
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = paddingBottom;
        }
        c0747z.setWidth(i14);
        c0747z.setHeight(i7);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f6641H;
            if (method != null) {
                try {
                    method.invoke(c0747z, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            E0.b(c0747z, true);
        }
        c0747z.setOutsideTouchable(true);
        c0747z.setTouchInterceptor(this.f6667z);
        if (this.f6660s) {
            c0747z.setOverlapAnchor(this.f6659r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f6642I;
            if (method2 != null) {
                try {
                    method2.invoke(c0747z, this.f6647E);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            E0.a(c0747z, this.f6647E);
        }
        c0747z.showAsDropDown(this.f6664w, this.f6655n, this.f6656o, this.f6661t);
        this.f6652i.setSelection(-1);
        if ((!this.f6648F || this.f6652i.isInTouchMode()) && (c0742w0 = this.f6652i) != null) {
            c0742w0.setListSelectionHidden(true);
            c0742w0.requestLayout();
        }
        if (this.f6648F) {
            return;
        }
        this.f6645C.post(this.f6644B);
    }

    public final Drawable d() {
        return this.f6649G.getBackground();
    }

    @Override // m.InterfaceC0675D
    public final void dismiss() {
        C0747z c0747z = this.f6649G;
        c0747z.dismiss();
        c0747z.setContentView(null);
        this.f6652i = null;
        this.f6645C.removeCallbacks(this.f6666y);
    }

    @Override // m.InterfaceC0675D
    public final C0742w0 e() {
        return this.f6652i;
    }

    public final void h(Drawable drawable) {
        this.f6649G.setBackgroundDrawable(drawable);
    }

    public final void i(int i2) {
        this.f6656o = i2;
        this.f6658q = true;
    }

    public final void k(int i2) {
        this.f6655n = i2;
    }

    public final int m() {
        if (this.f6658q) {
            return this.f6656o;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        M.b bVar = this.f6663v;
        if (bVar == null) {
            this.f6663v = new M.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f6651e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f6651e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6663v);
        }
        C0742w0 c0742w0 = this.f6652i;
        if (c0742w0 != null) {
            c0742w0.setAdapter(this.f6651e);
        }
    }

    public C0742w0 q(Context context, boolean z7) {
        return new C0742w0(context, z7);
    }

    public final void r(int i2) {
        Drawable background = this.f6649G.getBackground();
        if (background == null) {
            this.f6654m = i2;
            return;
        }
        Rect rect = this.f6646D;
        background.getPadding(rect);
        this.f6654m = rect.left + rect.right + i2;
    }
}
