package m;

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
import com.facebook.ads.AdError;
import g.AbstractC4518a;
import java.lang.reflect.Method;
import l.InterfaceC4670B;

/* loaded from: classes.dex */
public class B0 implements InterfaceC4670B {

    /* renamed from: T, reason: collision with root package name */
    public static final Method f39233T;

    /* renamed from: U, reason: collision with root package name */
    public static final Method f39234U;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39236B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39237C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39238D;

    /* renamed from: G, reason: collision with root package name */
    public G0.h f39241G;

    /* renamed from: H, reason: collision with root package name */
    public View f39242H;

    /* renamed from: I, reason: collision with root package name */
    public AdapterView.OnItemClickListener f39243I;
    public AdapterView.OnItemSelectedListener J;

    /* renamed from: O, reason: collision with root package name */
    public final Handler f39248O;

    /* renamed from: Q, reason: collision with root package name */
    public Rect f39250Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f39251R;

    /* renamed from: S, reason: collision with root package name */
    public final C4772z f39252S;

    /* renamed from: n, reason: collision with root package name */
    public final Context f39253n;

    /* renamed from: u, reason: collision with root package name */
    public ListAdapter f39254u;

    /* renamed from: v, reason: collision with root package name */
    public C4754p0 f39255v;

    /* renamed from: y, reason: collision with root package name */
    public int f39258y;

    /* renamed from: z, reason: collision with root package name */
    public int f39259z;

    /* renamed from: w, reason: collision with root package name */
    public final int f39256w = -2;

    /* renamed from: x, reason: collision with root package name */
    public int f39257x = -2;

    /* renamed from: A, reason: collision with root package name */
    public final int f39235A = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;

    /* renamed from: E, reason: collision with root package name */
    public int f39239E = 0;

    /* renamed from: F, reason: collision with root package name */
    public final int f39240F = Integer.MAX_VALUE;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC4771y0 f39244K = new RunnableC4771y0(this, 1);

    /* renamed from: L, reason: collision with root package name */
    public final A0 f39245L = new A0(this);

    /* renamed from: M, reason: collision with root package name */
    public final C4773z0 f39246M = new C4773z0(this);

    /* renamed from: N, reason: collision with root package name */
    public final RunnableC4771y0 f39247N = new RunnableC4771y0(this, 0);

    /* renamed from: P, reason: collision with root package name */
    public final Rect f39249P = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f39233T = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f39234U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public B0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f39253n = context;
        this.f39248O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37832p, i, 0);
        this.f39258y = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f39259z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f39236B = true;
        }
        obtainStyledAttributes.recycle();
        C4772z c4772z = new C4772z(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37836t, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            U.l.c(c4772z, obtainStyledAttributes2.getBoolean(2, false));
        }
        c4772z.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : com.bumptech.glide.f.h(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f39252S = c4772z;
        c4772z.setInputMethodMode(1);
    }

    @Override // l.InterfaceC4670B
    public final boolean a() {
        return this.f39252S.isShowing();
    }

    public final int b() {
        return this.f39258y;
    }

    public final void c(int i) {
        this.f39258y = i;
    }

    @Override // l.InterfaceC4670B
    public final void dismiss() {
        C4772z c4772z = this.f39252S;
        c4772z.dismiss();
        c4772z.setContentView(null);
        this.f39255v = null;
        this.f39248O.removeCallbacks(this.f39244K);
    }

    @Override // l.InterfaceC4670B
    public final C4754p0 f() {
        return this.f39255v;
    }

    public final void g(int i) {
        this.f39259z = i;
        this.f39236B = true;
    }

    public final Drawable getBackground() {
        return this.f39252S.getBackground();
    }

    public final int k() {
        if (this.f39236B) {
            return this.f39259z;
        }
        return 0;
    }

    public void l(ListAdapter listAdapter) {
        G0.h hVar = this.f39241G;
        if (hVar == null) {
            this.f39241G = new G0.h(1, this);
        } else {
            ListAdapter listAdapter2 = this.f39254u;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(hVar);
            }
        }
        this.f39254u = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f39241G);
        }
        C4754p0 c4754p0 = this.f39255v;
        if (c4754p0 != null) {
            c4754p0.setAdapter(this.f39254u);
        }
    }

    public C4754p0 m(Context context, boolean z8) {
        return new C4754p0(context, z8);
    }

    public final void n(int i) {
        Drawable background = this.f39252S.getBackground();
        if (background == null) {
            this.f39257x = i;
            return;
        }
        Rect rect = this.f39249P;
        background.getPadding(rect);
        this.f39257x = rect.left + rect.right + i;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f39252S.setBackgroundDrawable(drawable);
    }

    @Override // l.InterfaceC4670B
    public final void show() {
        int i;
        int paddingBottom;
        C4754p0 c4754p0;
        C4754p0 c4754p02 = this.f39255v;
        C4772z c4772z = this.f39252S;
        Context context = this.f39253n;
        if (c4754p02 == null) {
            C4754p0 m8 = m(context, !this.f39251R);
            this.f39255v = m8;
            m8.setAdapter(this.f39254u);
            this.f39255v.setOnItemClickListener(this.f39243I);
            this.f39255v.setFocusable(true);
            this.f39255v.setFocusableInTouchMode(true);
            this.f39255v.setOnItemSelectedListener(new C4765v0(this));
            this.f39255v.setOnScrollListener(this.f39246M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.J;
            if (onItemSelectedListener != null) {
                this.f39255v.setOnItemSelectedListener(onItemSelectedListener);
            }
            c4772z.setContentView(this.f39255v);
        }
        Drawable background = c4772z.getBackground();
        Rect rect = this.f39249P;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.f39236B) {
                this.f39259z = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a9 = AbstractC4767w0.a(c4772z, this.f39242H, this.f39259z, c4772z.getInputMethodMode() == 2);
        int i9 = this.f39256w;
        if (i9 == -1) {
            paddingBottom = a9 + i;
        } else {
            int i10 = this.f39257x;
            int a10 = this.f39255v.a(i10 != -2 ? i10 != -1 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a9);
            paddingBottom = a10 + (a10 > 0 ? this.f39255v.getPaddingBottom() + this.f39255v.getPaddingTop() + i : 0);
        }
        boolean z8 = this.f39252S.getInputMethodMode() == 2;
        U.l.d(c4772z, this.f39235A);
        if (c4772z.isShowing()) {
            if (this.f39242H.isAttachedToWindow()) {
                int i11 = this.f39257x;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.f39242H.getWidth();
                }
                if (i9 == -1) {
                    i9 = z8 ? paddingBottom : -1;
                    if (z8) {
                        c4772z.setWidth(this.f39257x == -1 ? -1 : 0);
                        c4772z.setHeight(0);
                    } else {
                        c4772z.setWidth(this.f39257x == -1 ? -1 : 0);
                        c4772z.setHeight(-1);
                    }
                } else if (i9 == -2) {
                    i9 = paddingBottom;
                }
                c4772z.setOutsideTouchable(true);
                View view = this.f39242H;
                int i12 = this.f39258y;
                int i13 = this.f39259z;
                if (i11 < 0) {
                    i11 = -1;
                }
                c4772z.update(view, i12, i13, i11, i9 < 0 ? -1 : i9);
                return;
            }
            return;
        }
        int i14 = this.f39257x;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f39242H.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = paddingBottom;
        }
        c4772z.setWidth(i14);
        c4772z.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f39233T;
            if (method != null) {
                try {
                    method.invoke(c4772z, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC4769x0.b(c4772z, true);
        }
        c4772z.setOutsideTouchable(true);
        c4772z.setTouchInterceptor(this.f39245L);
        if (this.f39238D) {
            U.l.c(c4772z, this.f39237C);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f39234U;
            if (method2 != null) {
                try {
                    method2.invoke(c4772z, this.f39250Q);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            AbstractC4769x0.a(c4772z, this.f39250Q);
        }
        c4772z.showAsDropDown(this.f39242H, this.f39258y, this.f39259z, this.f39239E);
        this.f39255v.setSelection(-1);
        if ((!this.f39251R || this.f39255v.isInTouchMode()) && (c4754p0 = this.f39255v) != null) {
            c4754p0.setListSelectionHidden(true);
            c4754p0.requestLayout();
        }
        if (this.f39251R) {
            return;
        }
        this.f39248O.post(this.f39247N);
    }
}
