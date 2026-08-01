package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.trembin.nirefon.betfury.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wa extends z10 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public g20 C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;
    public final Context g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final Handler l;
    public View t;
    public View u;
    public int v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final p5 o = new p5(2, this);
    public final ta p = new ta(0, this);
    public final o0 q = new o0(13, this);
    public int r = 0;
    public int s = 0;
    public boolean A = false;

    public wa(Context context, View view, int i, int i2, boolean z) {
        this.g = context;
        this.t = view;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = new Handler();
    }

    @Override // defpackage.h20
    public final void a(r10 r10Var, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (r10Var == ((va) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((va) arrayList.get(i2)).b.c(false);
        }
        va vaVar = (va) arrayList.remove(i);
        r10 r10Var2 = vaVar.b;
        f20 f20Var = vaVar.a;
        h5 h5Var = f20Var.E;
        r10Var2.r(this);
        if (this.F) {
            c20.b(h5Var, null);
            h5Var.setAnimationStyle(0);
        }
        f20Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.v = ((va) arrayList.get(size2 - 1)).c;
        } else {
            this.v = this.t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((va) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        g20 g20Var = this.C;
        if (g20Var != null) {
            g20Var.a(r10Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.o);
            }
            this.D = null;
        }
        this.u.removeOnAttachStateChangeListener(this.p);
        this.E.onDismiss();
    }

    @Override // defpackage.vd0
    public final boolean b() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((va) arrayList.get(0)).a.E.isShowing();
    }

    @Override // defpackage.vd0
    public final void d() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((r10) obj);
        }
        arrayList.clear();
        View view = this.t;
        this.u = view;
        if (view != null) {
            boolean z = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.o);
            }
            this.u.addOnAttachStateChangeListener(this.p);
        }
    }

    @Override // defpackage.vd0
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            va[] vaVarArr = (va[]) arrayList.toArray(new va[size]);
            for (int i = size - 1; i >= 0; i--) {
                va vaVar = vaVarArr[i];
                if (vaVar.a.E.isShowing()) {
                    vaVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.h20
    public final void e(g20 g20Var) {
        this.C = g20Var;
    }

    @Override // defpackage.h20
    public final void g() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((va) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((o10) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.vd0
    public final xk i() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((va) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.h20
    public final boolean j(wf0 wf0Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            va vaVar = (va) obj;
            if (wf0Var == vaVar.b) {
                vaVar.a.h.requestFocus();
                return true;
            }
        }
        if (!wf0Var.hasVisibleItems()) {
            return false;
        }
        l(wf0Var);
        g20 g20Var = this.C;
        if (g20Var != null) {
            g20Var.t(wf0Var);
        }
        return true;
    }

    @Override // defpackage.h20
    public final boolean k() {
        return false;
    }

    @Override // defpackage.z10
    public final void l(r10 r10Var) {
        r10Var.b(this, this.g);
        if (b()) {
            u(r10Var);
        } else {
            this.m.add(r10Var);
        }
    }

    @Override // defpackage.z10
    public final void n(View view) {
        if (this.t != view) {
            this.t = view;
            this.s = Gravity.getAbsoluteGravity(this.r, view.getLayoutDirection());
        }
    }

    @Override // defpackage.z10
    public final void o(boolean z) {
        this.A = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        va vaVar;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vaVar = null;
                break;
            }
            vaVar = (va) arrayList.get(i);
            if (!vaVar.a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (vaVar != null) {
            vaVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.z10
    public final void p(int i) {
        if (this.r != i) {
            this.r = i;
            this.s = Gravity.getAbsoluteGravity(i, this.t.getLayoutDirection());
        }
    }

    @Override // defpackage.z10
    public final void q(int i) {
        this.w = true;
        this.y = i;
    }

    @Override // defpackage.z10
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // defpackage.z10
    public final void s(boolean z) {
        this.B = z;
    }

    @Override // defpackage.z10
    public final void t(int i) {
        this.x = true;
        this.z = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(r10 r10Var) {
        boolean z;
        boolean z2;
        View view;
        va vaVar;
        int i;
        int i2;
        MenuItem menuItem;
        o10 o10Var;
        int i3;
        int firstVisiblePosition;
        Context context = this.g;
        ?? from = LayoutInflater.from(context);
        o10 o10Var2 = new o10(r10Var, from, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            o10Var2.h = true;
        } else if (b()) {
            int size = r10Var.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = r10Var.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            o10Var2.h = z;
        }
        int m = z10.m(o10Var2, context, this.h);
        f20 f20Var = new f20(context, null, this.i, this.j);
        f20Var.H = this.q;
        f20Var.u = this;
        h5 h5Var = f20Var.E;
        h5Var.setOnDismissListener(this);
        f20Var.t = this.t;
        f20Var.q = this.s;
        f20Var.D = true;
        h5Var.setFocusable(true);
        h5Var.setInputMethodMode(2);
        f20Var.q(o10Var2);
        f20Var.r(m);
        f20Var.q = this.s;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            vaVar = (va) arrayList.get(arrayList.size() - 1);
            r10 r10Var2 = vaVar.b;
            int size2 = r10Var2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = r10Var2.getItem(i5);
                if (menuItem.hasSubMenu() && r10Var == menuItem.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                xk xkVar = vaVar.a.h;
                ListAdapter adapter = xkVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    o10Var = (o10) headerViewListAdapter.getWrappedAdapter();
                } else {
                    o10Var = (o10) adapter;
                    i3 = 0;
                }
                int count = o10Var.getCount();
                int i6 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (menuItem == o10Var.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                view = (i6 != -1 && (firstVisiblePosition = (i6 + i3) - xkVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < xkVar.getChildCount()) ? xkVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z2 = 0;
            view = null;
            vaVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f20.I;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(h5Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                d20.a(h5Var, z2);
            }
            c20.a(h5Var, null);
            xk xkVar2 = ((va) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            xkVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.u.getWindowVisibleDisplayFrame(rect);
            if (this.v == 1) {
                if (xkVar2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.v = i;
                    f20Var.t = view;
                    if ((this.s & 5) == 5) {
                        i2 = 0;
                        m = z3 ? view.getWidth() : 0 - m;
                    } else if (z3) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        m = 0 - view.getWidth();
                    }
                    f20Var.k = m;
                    f20Var.p = true;
                    f20Var.o = true;
                    f20Var.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                f20Var.t = view;
                if ((this.s & 5) == 5) {
                }
                f20Var.k = m;
                f20Var.p = true;
                f20Var.o = true;
                f20Var.k(i2);
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.v = i;
                    f20Var.t = view;
                    if ((this.s & 5) == 5) {
                    }
                    f20Var.k = m;
                    f20Var.p = true;
                    f20Var.o = true;
                    f20Var.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                f20Var.t = view;
                if ((this.s & 5) == 5) {
                }
                f20Var.k = m;
                f20Var.p = true;
                f20Var.o = true;
                f20Var.k(i2);
            }
        } else {
            if (this.w) {
                f20Var.k = this.y;
            }
            if (this.x) {
                f20Var.k(this.z);
            }
            Rect rect2 = this.f;
            f20Var.C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new va(f20Var, r10Var, this.v));
        f20Var.d();
        xk xkVar3 = f20Var.h;
        xkVar3.setOnKeyListener(this);
        if (vaVar == null && this.B && r10Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, xkVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(r10Var.m);
            xkVar3.addHeaderView(frameLayout, null, false);
            f20Var.d();
        }
    }
}
