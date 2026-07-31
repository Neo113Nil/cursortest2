package k;

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
import g.AbstractC0389a;
import h.AbstractC0401a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class N implements j.r {

    /* renamed from: B, reason: collision with root package name */
    public static final Method f4933B;

    /* renamed from: C, reason: collision with root package name */
    public static final Method f4934C;

    /* renamed from: A, reason: collision with root package name */
    public final r f4935A;

    /* renamed from: f, reason: collision with root package name */
    public final Context f4936f;

    /* renamed from: g, reason: collision with root package name */
    public ListAdapter f4937g;

    /* renamed from: h, reason: collision with root package name */
    public P f4938h;

    /* renamed from: j, reason: collision with root package name */
    public int f4940j;

    /* renamed from: k, reason: collision with root package name */
    public int f4941k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4942l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4943m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4944n;

    /* renamed from: p, reason: collision with root package name */
    public J.a f4946p;

    /* renamed from: q, reason: collision with root package name */
    public View f4947q;

    /* renamed from: r, reason: collision with root package name */
    public j.l f4948r;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f4953w;
    public Rect y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4955z;

    /* renamed from: i, reason: collision with root package name */
    public int f4939i = -2;

    /* renamed from: o, reason: collision with root package name */
    public int f4945o = 0;

    /* renamed from: s, reason: collision with root package name */
    public final K f4949s = new K(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public final M f4950t = new M(this);

    /* renamed from: u, reason: collision with root package name */
    public final L f4951u = new L(this);

    /* renamed from: v, reason: collision with root package name */
    public final K f4952v = new K(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final Rect f4954x = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4933B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f4934C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public N(Context context, int i7) {
        int resourceId;
        this.f4936f = context;
        this.f4953w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0389a.f4264k, i7, 0);
        this.f4940j = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4941k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4942l = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i7, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0389a.f4268o, i7, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            I.l.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0401a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f4935A = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        J.a aVar = this.f4946p;
        if (aVar == null) {
            this.f4946p = new J.a(1, this);
        } else {
            ListAdapter listAdapter2 = this.f4937g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.f4937g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4946p);
        }
        P p4 = this.f4938h;
        if (p4 != null) {
            p4.setAdapter(this.f4937g);
        }
    }

    @Override // j.r
    public final void b() {
        int i7;
        P p4;
        P p6 = this.f4938h;
        Context context = this.f4936f;
        r rVar = this.f4935A;
        if (p6 == null) {
            P p7 = new P(context, !this.f4955z);
            p7.setHoverListener((Q) this);
            this.f4938h = p7;
            p7.setAdapter(this.f4937g);
            this.f4938h.setOnItemClickListener(this.f4948r);
            this.f4938h.setFocusable(true);
            this.f4938h.setFocusableInTouchMode(true);
            this.f4938h.setOnItemSelectedListener(new J(r4, this));
            this.f4938h.setOnScrollListener(this.f4951u);
            rVar.setContentView(this.f4938h);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f4954x;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i7 = rect.bottom + i8;
            if (!this.f4942l) {
                this.f4941k = -i8;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f4947q, this.f4941k, rVar.getInputMethodMode() == 2);
        int i9 = this.f4939i;
        int a7 = this.f4938h.a(i9 != -2 ? i9 != -1 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a7 + (a7 > 0 ? this.f4938h.getPaddingBottom() + this.f4938h.getPaddingTop() + i7 : 0);
        this.f4935A.getInputMethodMode();
        I.l.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f4947q;
            Field field = D.D.f240a;
            if (view.isAttachedToWindow()) {
                int i10 = this.f4939i;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.f4947q.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f4947q, this.f4940j, this.f4941k, i10 < 0 ? -1 : i10, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i11 = this.f4939i;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.f4947q.getWidth();
        }
        rVar.setWidth(i11);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f4933B;
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
        rVar.setTouchInterceptor(this.f4950t);
        if (this.f4944n) {
            I.l.c(rVar, this.f4943m);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f4934C;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.y);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.y);
        }
        rVar.showAsDropDown(this.f4947q, this.f4940j, this.f4941k, this.f4945o);
        this.f4938h.setSelection(-1);
        if ((!this.f4955z || this.f4938h.isInTouchMode()) && (p4 = this.f4938h) != null) {
            p4.setListSelectionHidden(true);
            p4.requestLayout();
        }
        if (this.f4955z) {
            return;
        }
        this.f4953w.post(this.f4952v);
    }

    @Override // j.r
    public final void dismiss() {
        r rVar = this.f4935A;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f4938h = null;
        this.f4953w.removeCallbacks(this.f4949s);
    }

    @Override // j.r
    public final ListView e() {
        return this.f4938h;
    }

    @Override // j.r
    public final boolean h() {
        return this.f4935A.isShowing();
    }
}
