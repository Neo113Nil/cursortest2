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
import com.derinko.gbini.n1casino.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class q9 extends ut implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public bu C;
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
    public final x4 o = new x4(2, this);
    public final n9 p = new n9(0, this);
    public final k0 q = new k0(11, this);
    public int r = 0;
    public int s = 0;
    public boolean A = false;

    public q9(Context context, View view, int i, int i2, boolean z) {
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

    @Override // defpackage.cu
    public final void a(mt mtVar, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mtVar == ((p9) arrayList.get(i)).b) {
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
            ((p9) arrayList.get(i2)).b.c(false);
        }
        p9 p9Var = (p9) arrayList.remove(i);
        mt mtVar2 = p9Var.b;
        au auVar = p9Var.a;
        p4 p4Var = auVar.E;
        mtVar2.r(this);
        if (this.F) {
            xt.b(p4Var, null);
            p4Var.setAnimationStyle(0);
        }
        auVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.v = ((p9) arrayList.get(size2 - 1)).c;
        } else {
            this.v = this.t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((p9) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        bu buVar = this.C;
        if (buVar != null) {
            buVar.a(mtVar, true);
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

    @Override // defpackage.q20
    public final boolean b() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((p9) arrayList.get(0)).a.E.isShowing();
    }

    @Override // defpackage.q20
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
            u((mt) obj);
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

    @Override // defpackage.q20
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            p9[] p9VarArr = (p9[]) arrayList.toArray(new p9[size]);
            for (int i = size - 1; i >= 0; i--) {
                p9 p9Var = p9VarArr[i];
                if (p9Var.a.E.isShowing()) {
                    p9Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.cu
    public final void e(bu buVar) {
        this.C = buVar;
    }

    @Override // defpackage.cu
    public final void g() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((p9) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((jt) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.q20
    public final lg h() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((p9) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.cu
    public final boolean j(m40 m40Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p9 p9Var = (p9) obj;
            if (m40Var == p9Var.b) {
                p9Var.a.h.requestFocus();
                return true;
            }
        }
        if (!m40Var.hasVisibleItems()) {
            return false;
        }
        l(m40Var);
        bu buVar = this.C;
        if (buVar != null) {
            buVar.x(m40Var);
        }
        return true;
    }

    @Override // defpackage.cu
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ut
    public final void l(mt mtVar) {
        mtVar.b(this, this.g);
        if (b()) {
            u(mtVar);
        } else {
            this.m.add(mtVar);
        }
    }

    @Override // defpackage.ut
    public final void n(View view) {
        if (this.t != view) {
            this.t = view;
            this.s = Gravity.getAbsoluteGravity(this.r, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ut
    public final void o(boolean z) {
        this.A = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        p9 p9Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                p9Var = null;
                break;
            }
            p9Var = (p9) arrayList.get(i);
            if (!p9Var.a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (p9Var != null) {
            p9Var.b.c(false);
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

    @Override // defpackage.ut
    public final void p(int i) {
        if (this.r != i) {
            this.r = i;
            this.s = Gravity.getAbsoluteGravity(i, this.t.getLayoutDirection());
        }
    }

    @Override // defpackage.ut
    public final void q(int i) {
        this.w = true;
        this.y = i;
    }

    @Override // defpackage.ut
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // defpackage.ut
    public final void s(boolean z) {
        this.B = z;
    }

    @Override // defpackage.ut
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
    public final void u(mt mtVar) {
        boolean z;
        boolean z2;
        View view;
        p9 p9Var;
        int i;
        int i2;
        MenuItem menuItem;
        jt jtVar;
        int i3;
        int firstVisiblePosition;
        Context context = this.g;
        ?? from = LayoutInflater.from(context);
        jt jtVar2 = new jt(mtVar, from, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            jtVar2.h = true;
        } else if (b()) {
            int size = mtVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = mtVar.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            jtVar2.h = z;
        }
        int m = ut.m(jtVar2, context, this.h);
        au auVar = new au(context, null, this.i, this.j);
        auVar.H = this.q;
        auVar.u = this;
        p4 p4Var = auVar.E;
        p4Var.setOnDismissListener(this);
        auVar.t = this.t;
        auVar.q = this.s;
        auVar.D = true;
        p4Var.setFocusable(true);
        p4Var.setInputMethodMode(2);
        auVar.q(jtVar2);
        auVar.r(m);
        auVar.q = this.s;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            p9Var = (p9) arrayList.get(arrayList.size() - 1);
            mt mtVar2 = p9Var.b;
            int size2 = mtVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = mtVar2.getItem(i5);
                if (menuItem.hasSubMenu() && mtVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                lg lgVar = p9Var.a.h;
                ListAdapter adapter = lgVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    jtVar = (jt) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jtVar = (jt) adapter;
                    i3 = 0;
                }
                int count = jtVar.getCount();
                int i6 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (menuItem == jtVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                view = (i6 != -1 && (firstVisiblePosition = (i6 + i3) - lgVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < lgVar.getChildCount()) ? lgVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z2 = 0;
            view = null;
            p9Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = au.I;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(p4Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                yt.a(p4Var, z2);
            }
            xt.a(p4Var, null);
            lg lgVar2 = ((p9) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            lgVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.u.getWindowVisibleDisplayFrame(rect);
            if (this.v == 1) {
                if (lgVar2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.v = i;
                    auVar.t = view;
                    if ((this.s & 5) == 5) {
                        i2 = 0;
                        m = z3 ? view.getWidth() : 0 - m;
                    } else if (z3) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        m = 0 - view.getWidth();
                    }
                    auVar.k = m;
                    auVar.p = true;
                    auVar.o = true;
                    auVar.i(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                auVar.t = view;
                if ((this.s & 5) == 5) {
                }
                auVar.k = m;
                auVar.p = true;
                auVar.o = true;
                auVar.i(i2);
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.v = i;
                    auVar.t = view;
                    if ((this.s & 5) == 5) {
                    }
                    auVar.k = m;
                    auVar.p = true;
                    auVar.o = true;
                    auVar.i(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                auVar.t = view;
                if ((this.s & 5) == 5) {
                }
                auVar.k = m;
                auVar.p = true;
                auVar.o = true;
                auVar.i(i2);
            }
        } else {
            if (this.w) {
                auVar.k = this.y;
            }
            if (this.x) {
                auVar.i(this.z);
            }
            Rect rect2 = this.f;
            auVar.C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new p9(auVar, mtVar, this.v));
        auVar.d();
        lg lgVar3 = auVar.h;
        lgVar3.setOnKeyListener(this);
        if (p9Var == null && this.B && mtVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, lgVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mtVar.m);
            lgVar3.addHeaderView(frameLayout, null, false);
            auVar.d();
        }
    }
}
