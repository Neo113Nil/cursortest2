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
import com.moontiko.really.admiralcasino.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class da extends vw implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public cx C;
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
    public final h5 o = new h5(2, this);
    public final aa p = new aa(0, this);
    public final rc0 q = new rc0(14, this);
    public int r = 0;
    public int s = 0;
    public boolean A = false;

    public da(Context context, View view, int i, int i2, boolean z) {
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

    @Override // defpackage.dx
    public final void a(mw mwVar, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mwVar == ((ca) arrayList.get(i)).b) {
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
            ((ca) arrayList.get(i2)).b.c(false);
        }
        ca caVar = (ca) arrayList.remove(i);
        mw mwVar2 = caVar.b;
        bx bxVar = caVar.a;
        z4 z4Var = bxVar.E;
        mwVar2.r(this);
        if (this.F) {
            yw.b(z4Var, null);
            z4Var.setAnimationStyle(0);
        }
        bxVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.v = ((ca) arrayList.get(size2 - 1)).c;
        } else {
            this.v = this.t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((ca) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        cx cxVar = this.C;
        if (cxVar != null) {
            cxVar.a(mwVar, true);
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

    @Override // defpackage.s50
    public final boolean b() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((ca) arrayList.get(0)).a.E.isShowing();
    }

    @Override // defpackage.s50
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
            u((mw) obj);
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

    @Override // defpackage.s50
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            ca[] caVarArr = (ca[]) arrayList.toArray(new ca[size]);
            for (int i = size - 1; i >= 0; i--) {
                ca caVar = caVarArr[i];
                if (caVar.a.E.isShowing()) {
                    caVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.dx
    public final void e(cx cxVar) {
        this.C = cxVar;
    }

    @Override // defpackage.dx
    public final void g() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((ca) obj).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((jw) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.s50
    public final mi i() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ca) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.dx
    public final boolean j(p70 p70Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ca caVar = (ca) obj;
            if (p70Var == caVar.b) {
                caVar.a.h.requestFocus();
                return true;
            }
        }
        if (!p70Var.hasVisibleItems()) {
            return false;
        }
        l(p70Var);
        cx cxVar = this.C;
        if (cxVar != null) {
            cxVar.w(p70Var);
        }
        return true;
    }

    @Override // defpackage.dx
    public final boolean k() {
        return false;
    }

    @Override // defpackage.vw
    public final void l(mw mwVar) {
        mwVar.b(this, this.g);
        if (b()) {
            u(mwVar);
        } else {
            this.m.add(mwVar);
        }
    }

    @Override // defpackage.vw
    public final void n(View view) {
        if (this.t != view) {
            this.t = view;
            this.s = Gravity.getAbsoluteGravity(this.r, view.getLayoutDirection());
        }
    }

    @Override // defpackage.vw
    public final void o(boolean z) {
        this.A = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ca caVar;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                caVar = null;
                break;
            }
            caVar = (ca) arrayList.get(i);
            if (!caVar.a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (caVar != null) {
            caVar.b.c(false);
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

    @Override // defpackage.vw
    public final void p(int i) {
        if (this.r != i) {
            this.r = i;
            this.s = Gravity.getAbsoluteGravity(i, this.t.getLayoutDirection());
        }
    }

    @Override // defpackage.vw
    public final void q(int i) {
        this.w = true;
        this.y = i;
    }

    @Override // defpackage.vw
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // defpackage.vw
    public final void s(boolean z) {
        this.B = z;
    }

    @Override // defpackage.vw
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
    public final void u(mw mwVar) {
        boolean z;
        boolean z2;
        View view;
        ca caVar;
        int i;
        int i2;
        MenuItem menuItem;
        jw jwVar;
        int i3;
        int firstVisiblePosition;
        Context context = this.g;
        ?? from = LayoutInflater.from(context);
        jw jwVar2 = new jw(mwVar, from, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            jwVar2.c = true;
        } else if (b()) {
            int size = mwVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = mwVar.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            jwVar2.c = z;
        }
        int m = vw.m(jwVar2, context, this.h);
        bx bxVar = new bx(context, null, this.i, this.j);
        bxVar.H = this.q;
        bxVar.u = this;
        z4 z4Var = bxVar.E;
        z4Var.setOnDismissListener(this);
        bxVar.t = this.t;
        bxVar.q = this.s;
        bxVar.D = true;
        z4Var.setFocusable(true);
        z4Var.setInputMethodMode(2);
        bxVar.q(jwVar2);
        bxVar.r(m);
        bxVar.q = this.s;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            caVar = (ca) arrayList.get(arrayList.size() - 1);
            mw mwVar2 = caVar.b;
            int size2 = mwVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = mwVar2.getItem(i5);
                if (menuItem.hasSubMenu() && mwVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                mi miVar = caVar.a.h;
                ListAdapter adapter = miVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    jwVar = (jw) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jwVar = (jw) adapter;
                    i3 = 0;
                }
                int count = jwVar.getCount();
                int i6 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (menuItem == jwVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                view = (i6 != -1 && (firstVisiblePosition = (i6 + i3) - miVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < miVar.getChildCount()) ? miVar.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z2 = 0;
            view = null;
            caVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = bx.I;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(z4Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                zw.a(z4Var, z2);
            }
            yw.a(z4Var, null);
            mi miVar2 = ((ca) arrayList.get(arrayList.size() - 1)).a.h;
            int[] iArr = new int[2];
            miVar2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.u.getWindowVisibleDisplayFrame(rect);
            if (this.v == 1) {
                if (miVar2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.v = i;
                    bxVar.t = view;
                    if ((this.s & 5) == 5) {
                        i2 = 0;
                        m = z3 ? view.getWidth() : 0 - m;
                    } else if (z3) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        m = 0 - view.getWidth();
                    }
                    bxVar.k = m;
                    bxVar.p = true;
                    bxVar.o = true;
                    bxVar.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                bxVar.t = view;
                if ((this.s & 5) == 5) {
                }
                bxVar.k = m;
                bxVar.p = true;
                bxVar.o = true;
                bxVar.k(i2);
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.v = i;
                    bxVar.t = view;
                    if ((this.s & 5) == 5) {
                    }
                    bxVar.k = m;
                    bxVar.p = true;
                    bxVar.o = true;
                    bxVar.k(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.v = i;
                bxVar.t = view;
                if ((this.s & 5) == 5) {
                }
                bxVar.k = m;
                bxVar.p = true;
                bxVar.o = true;
                bxVar.k(i2);
            }
        } else {
            if (this.w) {
                bxVar.k = this.y;
            }
            if (this.x) {
                bxVar.k(this.z);
            }
            Rect rect2 = this.f;
            bxVar.C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new ca(bxVar, mwVar, this.v));
        bxVar.d();
        mi miVar3 = bxVar.h;
        miVar3.setOnKeyListener(this);
        if (caVar == null && this.B && mwVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, miVar3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mwVar.m);
            miVar3.addHeaderView(frameLayout, null, false);
            bxVar.d();
        }
    }
}
