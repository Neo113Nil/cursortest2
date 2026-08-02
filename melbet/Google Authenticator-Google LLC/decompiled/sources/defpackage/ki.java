package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ki implements gt {
    private static Method a;
    private static Method b;
    private final Context c;
    private ListAdapter d;
    public jp e;
    public int g;
    public boolean h;
    public boolean i;
    public View k;
    public AdapterView.OnItemClickListener l;
    public AdapterView.OnItemSelectedListener m;
    public final Handler n;
    public boolean o;
    public final PopupWindow p;
    private int r;
    private boolean s;
    private DataSetObserver t;
    private Rect w;
    public int f = -2;
    public int j = 0;
    public final bo q = new bo(this, 14, null);
    private final drk x = new drk(this, 1);
    private final kh u = new kh(this);
    private final bo y = new bo(this, 13, null);
    private final Rect v = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                b = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ki(Context context, AttributeSet attributeSet, int i) {
        this.c = context;
        this.n = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, em.p, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.s = true;
        }
        obtainStyledAttributes.recycle();
        ib ibVar = new ib(context, attributeSet, i);
        this.p = ibVar;
        ibVar.setInputMethodMode(1);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (this.s) {
            return this.r;
        }
        return 0;
    }

    @Override // defpackage.gt
    public final ListView bi() {
        return this.e;
    }

    public final Drawable c() {
        return this.p.getBackground();
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.t;
        if (dataSetObserver == null) {
            this.t = new kg(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        jp jpVar = this.e;
        if (jpVar != null) {
            jpVar.setAdapter(this.d);
        }
    }

    public final void f(Drawable drawable) {
        this.p.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.r = i;
        this.s = true;
    }

    @Override // defpackage.gt
    public final void m() {
        PopupWindow popupWindow = this.p;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.q);
    }

    public final int o() {
        if (x()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public jp p(Context context, boolean z) {
        return new jp(context, z);
    }

    public final void q() {
        jp jpVar = this.e;
        if (jpVar != null) {
            jpVar.a = true;
            jpVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.p.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        Rect rect = this.v;
        background.getPadding(rect);
        this.f = rect.left + rect.right + i;
    }

    public final void s(Rect rect) {
        this.w = rect != null ? new Rect(rect) : null;
    }

    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.p.setOnDismissListener(onDismissListener);
    }

    public final boolean u() {
        return this.p.getInputMethodMode() == 2;
    }

    @Override // defpackage.gt
    public final void v() {
        int i;
        int maxAvailableHeight;
        int makeMeasureSpec;
        if (this.e == null) {
            jp p = p(this.c, !this.o);
            this.e = p;
            p.setAdapter(this.d);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new aho(this, 1));
            this.e.setOnScrollListener(this.u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.m;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.p.setContentView(this.e);
        }
        PopupWindow popupWindow = this.p;
        Drawable background = popupWindow.getBackground();
        Rect rect = this.v;
        if (background != null) {
            background.getPadding(rect);
            i = rect.top + rect.bottom;
            if (!this.s) {
                this.r = -rect.top;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        maxAvailableHeight = popupWindow.getMaxAvailableHeight(this.k, this.r, popupWindow.getInputMethodMode() == 2);
        int i2 = this.f;
        if (i2 == -2) {
            int i3 = this.c.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.v;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i2 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            int i4 = this.c.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.v;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
        }
        int b2 = this.e.b(makeMeasureSpec, maxAvailableHeight);
        int paddingTop = b2 > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        u();
        popupWindow.setWindowLayoutType(1002);
        int i5 = b2 + paddingTop;
        if (popupWindow.isShowing()) {
            if (this.k.isAttachedToWindow()) {
                int i6 = this.f;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.k.getWidth();
                }
                popupWindow.setOutsideTouchable(true);
                popupWindow.update(this.k, this.g, this.r, i6 < 0 ? -1 : i6, i5 >= 0 ? i5 : -1);
                return;
            }
            return;
        }
        int i7 = this.f;
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = this.k.getWidth();
        }
        popupWindow.setWidth(i7);
        popupWindow.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(popupWindow, true);
                } catch (Exception unused) {
                }
            }
        } else {
            this.p.setIsClippedToScreen(true);
        }
        PopupWindow popupWindow2 = this.p;
        popupWindow2.setOutsideTouchable(true);
        popupWindow2.setTouchInterceptor(this.x);
        if (this.i) {
            popupWindow2.setOverlapAnchor(this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = b;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow2, this.w);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.p.setEpicenterBounds(this.w);
        }
        this.p.showAsDropDown(this.k, this.g, this.r, this.j);
        this.e.setSelection(-1);
        if (!this.o || this.e.isInTouchMode()) {
            q();
        }
        if (this.o) {
            return;
        }
        this.n.post(this.y);
    }

    public final void w() {
        this.p.setInputMethodMode(2);
    }

    @Override // defpackage.gt
    public final boolean x() {
        return this.p.isShowing();
    }

    public final void y() {
        this.o = true;
        this.p.setFocusable(true);
    }
}
