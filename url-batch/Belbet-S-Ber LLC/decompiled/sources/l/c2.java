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
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class c2 implements k.c0 {
    public static final Method F;
    public static final Method G;
    public final Handler A;
    public Rect C;
    public boolean D;
    public final y E;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2407f;

    /* renamed from: g, reason: collision with root package name */
    public ListAdapter f2408g;
    public p1 h;

    /* renamed from: k, reason: collision with root package name */
    public int f2410k;

    /* renamed from: l, reason: collision with root package name */
    public int f2411l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2413n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2414o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2415p;

    /* renamed from: s, reason: collision with root package name */
    public z1 f2418s;

    /* renamed from: t, reason: collision with root package name */
    public View f2419t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2420u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f2421v;
    public final int i = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f2409j = -2;

    /* renamed from: m, reason: collision with root package name */
    public final int f2412m = 1002;

    /* renamed from: q, reason: collision with root package name */
    public int f2416q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final int f2417r = Integer.MAX_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public final y1 f2422w = new y1(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final b2 f2423x = new b2(this);

    /* renamed from: y, reason: collision with root package name */
    public final a2 f2424y = new a2(this);

    /* renamed from: z, reason: collision with root package name */
    public final y1 f2425z = new y1(this, 0);
    public final Rect B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public c2(Context context, AttributeSet attributeSet, int i, int i4) {
        int resourceId;
        this.f2407f = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f1401o, i, i4);
        this.f2410k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2411l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2413n = true;
        }
        obtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i, i4);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.f1405s, i, i4);
        if (obtainStyledAttributes2.hasValue(2)) {
            yVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : b4.d.y(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.E = yVar;
        yVar.setInputMethodMode(1);
    }

    public final int a() {
        return this.f2410k;
    }

    @Override // k.c0
    public final boolean b() {
        return this.E.isShowing();
    }

    public final Drawable d() {
        return this.E.getBackground();
    }

    @Override // k.c0
    public final void dismiss() {
        y yVar = this.E;
        yVar.dismiss();
        yVar.setContentView(null);
        this.h = null;
        this.A.removeCallbacks(this.f2422w);
    }

    @Override // k.c0
    public final void e() {
        int i;
        int paddingBottom;
        p1 p1Var;
        p1 p1Var2 = this.h;
        Context context = this.f2407f;
        y yVar = this.E;
        if (p1Var2 == null) {
            p1 q4 = q(context, !this.D);
            this.h = q4;
            q4.setAdapter(this.f2408g);
            this.h.setOnItemClickListener(this.f2420u);
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            this.h.setOnItemSelectedListener(new v1(this));
            this.h.setOnScrollListener(this.f2424y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2421v;
            if (onItemSelectedListener != null) {
                this.h.setOnItemSelectedListener(onItemSelectedListener);
            }
            yVar.setContentView(this.h);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.B;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.f2413n) {
                this.f2411l = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a5 = w1.a(yVar, this.f2419t, this.f2411l, yVar.getInputMethodMode() == 2);
        int i5 = this.i;
        if (i5 == -1) {
            paddingBottom = a5 + i;
        } else {
            int i6 = this.f2409j;
            int a6 = this.h.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a5);
            paddingBottom = a6 + (a6 > 0 ? this.h.getPaddingBottom() + this.h.getPaddingTop() + i : 0);
        }
        boolean z4 = yVar.getInputMethodMode() == 2;
        yVar.setWindowLayoutType(this.f2412m);
        if (yVar.isShowing()) {
            if (this.f2419t.isAttachedToWindow()) {
                int i7 = this.f2409j;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f2419t.getWidth();
                }
                if (i5 == -1) {
                    i5 = z4 ? paddingBottom : -1;
                    if (z4) {
                        yVar.setWidth(this.f2409j == -1 ? -1 : 0);
                        yVar.setHeight(0);
                    } else {
                        yVar.setWidth(this.f2409j == -1 ? -1 : 0);
                        yVar.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                yVar.setOutsideTouchable(true);
                int i8 = i7;
                View view = this.f2419t;
                int i9 = this.f2410k;
                int i10 = this.f2411l;
                int i11 = i8 < 0 ? -1 : i8;
                if (i5 < 0) {
                    i5 = -1;
                }
                yVar.update(view, i9, i10, i11, i5);
                return;
            }
            return;
        }
        int i12 = this.f2409j;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.f2419t.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        yVar.setWidth(i12);
        yVar.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            x1.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.f2423x);
        if (this.f2415p) {
            yVar.setOverlapAnchor(this.f2414o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = G;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, this.C);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            x1.a(yVar, this.C);
        }
        yVar.showAsDropDown(this.f2419t, this.f2410k, this.f2411l, this.f2416q);
        this.h.setSelection(-1);
        if ((!this.D || this.h.isInTouchMode()) && (p1Var = this.h) != null) {
            p1Var.setListSelectionHidden(true);
            p1Var.requestLayout();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.f2425z);
    }

    @Override // k.c0
    public final p1 h() {
        return this.h;
    }

    public final void i(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.f2411l = i;
        this.f2413n = true;
    }

    public final void l(int i) {
        this.f2410k = i;
    }

    public final int n() {
        if (this.f2413n) {
            return this.f2411l;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        z1 z1Var = this.f2418s;
        if (z1Var == null) {
            this.f2418s = new z1(this);
        } else {
            ListAdapter listAdapter2 = this.f2408g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(z1Var);
            }
        }
        this.f2408g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2418s);
        }
        p1 p1Var = this.h;
        if (p1Var != null) {
            p1Var.setAdapter(this.f2408g);
        }
    }

    public p1 q(Context context, boolean z4) {
        return new p1(context, z4);
    }

    public final void r(int i) {
        Drawable background = this.E.getBackground();
        if (background == null) {
            this.f2409j = i;
            return;
        }
        Rect rect = this.B;
        background.getPadding(rect);
        this.f2409j = rect.left + rect.right + i;
    }
}
