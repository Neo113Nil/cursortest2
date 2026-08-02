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
import f.AbstractC0410a;
import g.AbstractC0432a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: k.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1185I implements j.r {

    /* renamed from: w, reason: collision with root package name */
    public static final Method f13921w;

    /* renamed from: x, reason: collision with root package name */
    public static final Method f13922x;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13923a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f13924b;

    /* renamed from: c, reason: collision with root package name */
    public C1187K f13925c;

    /* renamed from: e, reason: collision with root package name */
    public int f13927e;

    /* renamed from: f, reason: collision with root package name */
    public int f13928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13929g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13930h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13931i;

    /* renamed from: k, reason: collision with root package name */
    public I.b f13933k;

    /* renamed from: l, reason: collision with root package name */
    public View f13934l;

    /* renamed from: m, reason: collision with root package name */
    public j.l f13935m;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f13938r;

    /* renamed from: t, reason: collision with root package name */
    public Rect f13940t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13941u;
    public final C1230q v;

    /* renamed from: d, reason: collision with root package name */
    public int f13926d = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f13932j = 0;
    public final RunnableC1182F n = new RunnableC1182F(this, 1);
    public final ViewOnTouchListenerC1184H o = new ViewOnTouchListenerC1184H(this);

    /* renamed from: p, reason: collision with root package name */
    public final C1183G f13936p = new C1183G(this);

    /* renamed from: q, reason: collision with root package name */
    public final RunnableC1182F f13937q = new RunnableC1182F(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final Rect f13939s = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f13921w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f13922x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC1185I(Context context, int i4) {
        int resourceId;
        this.f13923a = context;
        this.f13938r = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0410a.f8480k, i4, 0);
        this.f13927e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f13928f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f13929g = true;
        }
        obtainStyledAttributes.recycle();
        C1230q c1230q = new C1230q(context, null, i4, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0410a.o, i4, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            c1230q.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        c1230q.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0432a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.v = c1230q;
        c1230q.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        I.b bVar = this.f13933k;
        if (bVar == null) {
            this.f13933k = new I.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f13924b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f13924b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13933k);
        }
        C1187K c1187k = this.f13925c;
        if (c1187k != null) {
            c1187k.setAdapter(this.f13924b);
        }
    }

    @Override // j.r
    public final boolean c() {
        return this.v.isShowing();
    }

    @Override // j.r
    public final void dismiss() {
        C1230q c1230q = this.v;
        c1230q.dismiss();
        c1230q.setContentView(null);
        this.f13925c = null;
        this.f13938r.removeCallbacks(this.n);
    }

    @Override // j.r
    public final ListView h() {
        return this.f13925c;
    }

    @Override // j.r
    public final void show() {
        int i4;
        C1187K c1187k;
        C1187K c1187k2 = this.f13925c;
        Context context = this.f13923a;
        C1230q c1230q = this.v;
        if (c1187k2 == null) {
            C1187K c1187k3 = new C1187K(context, !this.f13941u);
            c1187k3.setHoverListener((C1188L) this);
            this.f13925c = c1187k3;
            c1187k3.setAdapter(this.f13924b);
            this.f13925c.setOnItemClickListener(this.f13935m);
            this.f13925c.setFocusable(true);
            this.f13925c.setFocusableInTouchMode(true);
            this.f13925c.setOnItemSelectedListener(new C1181E(r4, this));
            this.f13925c.setOnScrollListener(this.f13936p);
            c1230q.setContentView(this.f13925c);
        }
        Drawable background = c1230q.getBackground();
        Rect rect = this.f13939s;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i4 = rect.bottom + i5;
            if (!this.f13929g) {
                this.f13928f = -i5;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        int maxAvailableHeight = c1230q.getMaxAvailableHeight(this.f13934l, this.f13928f, c1230q.getInputMethodMode() == 2);
        int i6 = this.f13926d;
        int a3 = this.f13925c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a3 + (a3 > 0 ? this.f13925c.getPaddingBottom() + this.f13925c.getPaddingTop() + i4 : 0);
        this.v.getInputMethodMode();
        c1230q.setWindowLayoutType(1002);
        if (c1230q.isShowing()) {
            View view = this.f13934l;
            Field field = E.H.f375a;
            if (view.isAttachedToWindow()) {
                int i7 = this.f13926d;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = this.f13934l.getWidth();
                }
                c1230q.setOutsideTouchable(true);
                c1230q.update(this.f13934l, this.f13927e, this.f13928f, i7 < 0 ? -1 : i7, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i8 = this.f13926d;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f13934l.getWidth();
        }
        c1230q.setWidth(i8);
        c1230q.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f13921w;
            if (method != null) {
                try {
                    method.invoke(c1230q, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            c1230q.setIsClippedToScreen(true);
        }
        c1230q.setOutsideTouchable(true);
        c1230q.setTouchInterceptor(this.o);
        if (this.f13931i) {
            c1230q.setOverlapAnchor(this.f13930h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f13922x;
            if (method2 != null) {
                try {
                    method2.invoke(c1230q, this.f13940t);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            c1230q.setEpicenterBounds(this.f13940t);
        }
        c1230q.showAsDropDown(this.f13934l, this.f13927e, this.f13928f, this.f13932j);
        this.f13925c.setSelection(-1);
        if ((!this.f13941u || this.f13925c.isInTouchMode()) && (c1187k = this.f13925c) != null) {
            c1187k.setListSelectionHidden(true);
            c1187k.requestLayout();
        }
        if (this.f13941u) {
            return;
        }
        this.f13938r.post(this.f13937q);
    }
}
