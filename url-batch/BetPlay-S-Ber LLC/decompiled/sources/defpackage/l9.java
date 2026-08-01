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
import com.awerser.monnit.betplay.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class l9 extends ju implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public qu C;
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
    public final o5 o = new o5(2, this);
    public final i9 p = new i9(0, this);
    public final j1 q = new j1(5, this);
    public int r = 0;
    public int s = 0;
    public boolean A = false;

    public l9(Context context, View view, int i, int i2, boolean z) {
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

    @Override // defpackage.ru
    public final void a(au auVar, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (auVar == ((k9) arrayList.get(i)).b) {
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
            ((k9) arrayList.get(i2)).b.c(false);
        }
        k9 k9Var = (k9) arrayList.remove(i);
        au auVar2 = k9Var.b;
        pu puVar = k9Var.a;
        g5 g5Var = puVar.E;
        auVar2.r(this);
        if (this.F) {
            mu.b(g5Var, null);
            g5Var.setAnimationStyle(0);
        }
        puVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.v = ((k9) arrayList.get(size2 - 1)).c;
        } else {
            this.v = this.t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((k9) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        qu quVar = this.C;
        if (quVar != null) {
            quVar.a(auVar, true);
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

    @Override // defpackage.b30
    public final boolean b() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((k9) arrayList.get(0)).a.E.isShowing();
    }

    @Override // defpackage.b30
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
            u((au) obj);
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

    @Override // defpackage.b30
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            k9[] k9VarArr = (k9[]) arrayList.toArray(new k9[size]);
            for (int i = size - 1; i >= 0; i--) {
                k9 k9Var = k9VarArr[i];
                if (k9Var.a.E.isShowing()) {
                    k9Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.ru
    public final void e(qu quVar) {
        this.C = quVar;
    }

    @Override // defpackage.ru
    public final void g() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((k9) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((xt) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.b30
    public final dg h() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((k9) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.ru
    public final boolean j(v40 v40Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k9 k9Var = (k9) obj;
            if (v40Var == k9Var.b) {
                k9Var.a.h.requestFocus();
                return true;
            }
        }
        if (!v40Var.hasVisibleItems()) {
            return false;
        }
        l(v40Var);
        qu quVar = this.C;
        if (quVar != null) {
            quVar.s(v40Var);
        }
        return true;
    }

    @Override // defpackage.ru
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ju
    public final void l(au auVar) {
        auVar.b(this, this.g);
        if (b()) {
            u(auVar);
        } else {
            this.m.add(auVar);
        }
    }

    @Override // defpackage.ju
    public final void n(View view) {
        if (this.t != view) {
            this.t = view;
            this.s = Gravity.getAbsoluteGravity(this.r, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ju
    public final void o(boolean z) {
        this.A = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        k9 k9Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                k9Var = null;
                break;
            }
            k9Var = (k9) arrayList.get(i);
            if (!k9Var.a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (k9Var != null) {
            k9Var.b.c(false);
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

    @Override // defpackage.ju
    public final void p(int i) {
        if (this.r != i) {
            this.r = i;
            this.s = Gravity.getAbsoluteGravity(i, this.t.getLayoutDirection());
        }
    }

    @Override // defpackage.ju
    public final void q(int i) {
        this.w = true;
        this.y = i;
    }

    @Override // defpackage.ju
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // defpackage.ju
    public final void s(boolean z) {
        this.B = z;
    }

    @Override // defpackage.ju
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
    public final void u(au auVar) {
        boolean z;
        boolean z2;
        View view;
        k9 k9Var;
        int i;
        int i2;
        MenuItem menuItem;
        xt xtVar;
        int i3;
        int firstVisiblePosition;
        Context context = this.g;
        ?? from = LayoutInflater.from(context);
        xt xtVar2 = new xt(auVar, from, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            xtVar2.c = true;
        } else if (b()) {
            int size = auVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = auVar.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            xtVar2.c = z;
        }
        int m = ju.m(xtVar2, context, this.h);
        pu puVar = new pu(context, null, this.i, this.j);
        puVar.H = this.q;
        puVar.u = this;
        g5 g5Var = puVar.E;
        g5Var.setOnDismissListener(this);
        puVar.t = this.t;
        puVar.q = this.s;
        puVar.D = true;
        g5Var.setFocusable(true);
        g5Var.setInputMethodMode(2);
        puVar.q(xtVar2);
        puVar.r(m);
        puVar.q = this.s;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            k9Var = (k9) arrayList.get(arrayList.size() - 1);
            au auVar2 = k9Var.b;
            int size2 = auVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = auVar2.getItem(i5);
                if (menuItem.hasSubMenu() && auVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                dg dgVar = k9Var.a.h;
                ListAdapter adapter = dgVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    xtVar = (xt) headerViewListAdapter.getWrappedAdapter();
                } else {
                    xtVar = (xt) adapter;
                    i3 = 0;
                }
                int count = xtVar.getCount();
                int i6 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (menuItem == xtVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                view = (i6 != -1 && (firstVisiblePosition = (i6 + i3) - dgVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dgVar.getChildCount()) ? dgVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z2 = 0;
            view = null;
            k9Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = pu.I;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(g5Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                nu.a(g5Var, z2);
            }
            mu.a(g5Var, null);
            dg dgVar2 = ((k9) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            dgVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.u.getWindowVisibleDisplayFrame(rect);
            if (this.v == 1) {
                if (dgVar2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.v = i;
                    puVar.t = view;
                    if ((this.s & 5) == 5) {
                        i2 = 0;
                        m = z3 ? view.getWidth() : 0 - m;
                    } else if (z3) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        m = 0 - view.getWidth();
                    }
                    puVar.k = m;
                    puVar.p = true;
                    puVar.o = true;
                    puVar.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                puVar.t = view;
                if ((this.s & 5) == 5) {
                }
                puVar.k = m;
                puVar.p = true;
                puVar.o = true;
                puVar.k(i2);
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.v = i;
                    puVar.t = view;
                    if ((this.s & 5) == 5) {
                    }
                    puVar.k = m;
                    puVar.p = true;
                    puVar.o = true;
                    puVar.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                puVar.t = view;
                if ((this.s & 5) == 5) {
                }
                puVar.k = m;
                puVar.p = true;
                puVar.o = true;
                puVar.k(i2);
            }
        } else {
            if (this.w) {
                puVar.k = this.y;
            }
            if (this.x) {
                puVar.k(this.z);
            }
            Rect rect2 = this.f;
            puVar.C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new k9(puVar, auVar, this.v));
        puVar.d();
        dg dgVar3 = puVar.h;
        dgVar3.setOnKeyListener(this);
        if (k9Var == null && this.B && auVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, dgVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(auVar.m);
            dgVar3.addHeaderView(frameLayout, null, false);
            puVar.d();
        }
    }
}
