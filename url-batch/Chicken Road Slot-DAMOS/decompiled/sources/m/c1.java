package m;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c1 implements l.q {
    public static final Method K;
    public static final Method L;
    public l.k A;
    public final Handler F;
    public Rect H;
    public boolean I;
    public final s J;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6039d;

    /* renamed from: e, reason: collision with root package name */
    public ListAdapter f6040e;

    /* renamed from: i, reason: collision with root package name */
    public g1 f6041i;

    /* renamed from: s, reason: collision with root package name */
    public int f6043s;

    /* renamed from: t, reason: collision with root package name */
    public int f6044t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6045u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6046v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6047w;

    /* renamed from: y, reason: collision with root package name */
    public z0 f6049y;

    /* renamed from: z, reason: collision with root package name */
    public View f6050z;

    /* renamed from: r, reason: collision with root package name */
    public int f6042r = -2;

    /* renamed from: x, reason: collision with root package name */
    public int f6048x = 0;
    public final y0 B = new y0(this, 1);
    public final b1 C = new b1(this);
    public final a1 D = new a1(this);
    public final y0 E = new y0(this, 0);
    public final Rect G = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public c1(Context context, int i3) {
        int resourceId;
        this.f6039d = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, i.a.f4548k, i3, 0);
        this.f6043s = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6044t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6045u = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, null, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, i.a.f4552o, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            sVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        sVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : z4.w.v(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.J = sVar;
        sVar.setInputMethodMode(1);
    }

    @Override // l.q
    public final void a() {
        int i3;
        g1 g1Var;
        g1 g1Var2 = this.f6041i;
        Context context = this.f6039d;
        s sVar = this.J;
        if (g1Var2 == null) {
            g1 g1Var3 = new g1(context, !this.I);
            g1Var3.setHoverListener((h1) this);
            this.f6041i = g1Var3;
            g1Var3.setAdapter(this.f6040e);
            this.f6041i.setOnItemClickListener(this.A);
            this.f6041i.setFocusable(true);
            this.f6041i.setFocusableInTouchMode(true);
            this.f6041i.setOnItemSelectedListener(new v0(this));
            this.f6041i.setOnScrollListener(this.D);
            sVar.setContentView(this.f6041i);
        }
        Drawable background = sVar.getBackground();
        Rect rect = this.G;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i3 = rect.bottom + i10;
            if (!this.f6045u) {
                this.f6044t = -i10;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int a9 = w0.a(sVar, this.f6050z, this.f6044t, sVar.getInputMethodMode() == 2);
        int i11 = this.f6042r;
        int a10 = this.f6041i.a(i11 != -2 ? i11 != -1 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a9);
        int paddingBottom = a10 + (a10 > 0 ? this.f6041i.getPaddingBottom() + this.f6041i.getPaddingTop() + i3 : 0);
        sVar.getInputMethodMode();
        sVar.setWindowLayoutType(1002);
        if (sVar.isShowing()) {
            if (this.f6050z.isAttachedToWindow()) {
                int i12 = this.f6042r;
                if (i12 == -1) {
                    i12 = -1;
                } else if (i12 == -2) {
                    i12 = this.f6050z.getWidth();
                }
                sVar.setOutsideTouchable(true);
                sVar.update(this.f6050z, this.f6043s, this.f6044t, i12 < 0 ? -1 : i12, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i13 = this.f6042r;
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = this.f6050z.getWidth();
        }
        sVar.setWidth(i13);
        sVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K;
            if (method != null) {
                try {
                    method.invoke(sVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            x0.b(sVar, true);
        }
        sVar.setOutsideTouchable(true);
        sVar.setTouchInterceptor(this.C);
        if (this.f6047w) {
            sVar.setOverlapAnchor(this.f6046v);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = L;
            if (method2 != null) {
                try {
                    method2.invoke(sVar, this.H);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            x0.a(sVar, this.H);
        }
        sVar.showAsDropDown(this.f6050z, this.f6043s, this.f6044t, this.f6048x);
        this.f6041i.setSelection(-1);
        if ((!this.I || this.f6041i.isInTouchMode()) && (g1Var = this.f6041i) != null) {
            g1Var.setListSelectionHidden(true);
            g1Var.requestLayout();
        }
        if (this.I) {
            return;
        }
        this.F.post(this.E);
    }

    public final void b(ListAdapter listAdapter) {
        z0 z0Var = this.f6049y;
        if (z0Var == null) {
            this.f6049y = new z0(this);
        } else {
            ListAdapter listAdapter2 = this.f6040e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(z0Var);
            }
        }
        this.f6040e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6049y);
        }
        g1 g1Var = this.f6041i;
        if (g1Var != null) {
            g1Var.setAdapter(this.f6040e);
        }
    }

    @Override // l.q
    public final ListView d() {
        return this.f6041i;
    }

    @Override // l.q
    public final void dismiss() {
        s sVar = this.J;
        sVar.dismiss();
        sVar.setContentView(null);
        this.f6041i = null;
        this.F.removeCallbacks(this.B);
    }

    @Override // l.q
    public final boolean j() {
        return this.J.isShowing();
    }
}
