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
import com.majelw.libystne.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class at extends rk1 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean H;
    public yk1 I;
    public ViewTreeObserver J;
    public PopupWindow.OnDismissListener K;
    public boolean L;
    public final Context n;
    public final int o;
    public final int p;
    public final boolean q;
    public final Handler r;
    public final hg u;
    public final w7 v;
    public View z;
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ar0 w = new ar0(12, this);
    public int x = 0;
    public int y = 0;
    public boolean G = false;

    public at(Context context, View view, int i, boolean z) {
        int i2 = 2;
        this.u = new hg(i2, this);
        this.v = new w7(i2, this);
        this.n = context;
        this.z = view;
        this.p = i;
        this.q = z;
        this.B = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.r = new Handler();
    }

    @Override // defpackage.cl2
    public final boolean a() {
        ArrayList arrayList = this.t;
        return arrayList.size() > 0 && ((zs) arrayList.get(0)).a.K.isShowing();
    }

    @Override // defpackage.zk1
    public final void b(fk1 fk1Var, boolean z) {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fk1Var == ((zs) arrayList.get(i)).b) {
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
            ((zs) arrayList.get(i2)).b.c(false);
        }
        zs zsVar = (zs) arrayList.remove(i);
        fk1 fk1Var2 = zsVar.b;
        xk1 xk1Var = zsVar.a;
        ag agVar = xk1Var.K;
        fk1Var2.r(this);
        if (this.L) {
            uk1.b(agVar, null);
            agVar.setAnimationStyle(0);
        }
        xk1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.B = ((zs) arrayList.get(size2 - 1)).c;
        } else {
            this.B = this.z.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((zs) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        yk1 yk1Var = this.I;
        if (yk1Var != null) {
            yk1Var.b(fk1Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.J.removeGlobalOnLayoutListener(this.u);
            }
            this.J = null;
        }
        this.A.removeOnAttachStateChangeListener(this.v);
        this.K.onDismiss();
    }

    @Override // defpackage.cl2
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((fk1) obj);
        }
        arrayList.clear();
        View view = this.z;
        this.A = view;
        if (view != null) {
            boolean z = this.J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.J = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.u);
            }
            this.A.addOnAttachStateChangeListener(this.v);
        }
    }

    @Override // defpackage.cl2
    public final void dismiss() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        if (size > 0) {
            zs[] zsVarArr = (zs[]) arrayList.toArray(new zs[size]);
            for (int i = size - 1; i >= 0; i--) {
                zs zsVar = zsVarArr[i];
                if (zsVar.a.K.isShowing()) {
                    zsVar.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.zk1
    public final void e(yk1 yk1Var) {
        this.I = yk1Var;
    }

    @Override // defpackage.zk1
    public final void g() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((zs) obj).a.o.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ck1) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.cl2
    public final ne0 h() {
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((zs) arrayList.get(arrayList.size() - 1)).a.o;
    }

    @Override // defpackage.zk1
    public final boolean j(cq2 cq2Var) {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zs zsVar = (zs) obj;
            if (cq2Var == zsVar.b) {
                zsVar.a.o.requestFocus();
                return true;
            }
        }
        if (!cq2Var.hasVisibleItems()) {
            return false;
        }
        l(cq2Var);
        yk1 yk1Var = this.I;
        if (yk1Var != null) {
            yk1Var.o(cq2Var);
        }
        return true;
    }

    @Override // defpackage.zk1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.rk1
    public final void l(fk1 fk1Var) {
        fk1Var.b(this, this.n);
        if (a()) {
            u(fk1Var);
        } else {
            this.s.add(fk1Var);
        }
    }

    @Override // defpackage.rk1
    public final void n(View view) {
        if (this.z != view) {
            this.z = view;
            this.y = Gravity.getAbsoluteGravity(this.x, view.getLayoutDirection());
        }
    }

    @Override // defpackage.rk1
    public final void o(boolean z) {
        this.G = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        zs zsVar;
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zsVar = null;
                break;
            }
            zsVar = (zs) arrayList.get(i);
            if (!zsVar.a.K.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (zsVar != null) {
            zsVar.b.c(false);
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

    @Override // defpackage.rk1
    public final void p(int i) {
        if (this.x != i) {
            this.x = i;
            this.y = Gravity.getAbsoluteGravity(i, this.z.getLayoutDirection());
        }
    }

    @Override // defpackage.rk1
    public final void q(int i) {
        this.C = true;
        this.E = i;
    }

    @Override // defpackage.rk1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    @Override // defpackage.rk1
    public final void s(boolean z) {
        this.H = z;
    }

    @Override // defpackage.rk1
    public final void t(int i) {
        this.D = true;
        this.F = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(fk1 fk1Var) {
        boolean z;
        boolean z2;
        View view;
        zs zsVar;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        ck1 ck1Var;
        int i4;
        int firstVisiblePosition;
        Context context = this.n;
        ?? from = LayoutInflater.from(context);
        ck1 ck1Var2 = new ck1(fk1Var, from, this.q, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.G) {
            ck1Var2.c = true;
        } else if (a()) {
            int size = fk1Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = fk1Var.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            ck1Var2.c = z;
        }
        int m = rk1.m(ck1Var2, context, this.o);
        xk1 xk1Var = new xk1(context, null, this.p);
        xk1Var.N = this.w;
        xk1Var.B = this;
        ag agVar = xk1Var.K;
        agVar.setOnDismissListener(this);
        xk1Var.A = this.z;
        xk1Var.x = this.y;
        xk1Var.J = true;
        agVar.setFocusable(true);
        agVar.setInputMethodMode(2);
        xk1Var.p(ck1Var2);
        xk1Var.r(m);
        xk1Var.x = this.y;
        ArrayList arrayList = this.t;
        if (arrayList.size() > 0) {
            zsVar = (zs) arrayList.get(arrayList.size() - 1);
            fk1 fk1Var2 = zsVar.b;
            int size2 = fk1Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = fk1Var2.getItem(i6);
                if (menuItem.hasSubMenu() && fk1Var == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                ne0 ne0Var = zsVar.a.o;
                ListAdapter adapter = ne0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    ck1Var = (ck1) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ck1Var = (ck1) adapter;
                    i4 = 0;
                }
                int count = ck1Var.getCount();
                int i7 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == ck1Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                view = (i7 != -1 && (firstVisiblePosition = (i7 + i4) - ne0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < ne0Var.getChildCount()) ? ne0Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z2 = 0;
            view = null;
            zsVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = xk1.O;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(agVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                vk1.a(agVar, z2);
            }
            uk1.a(agVar, null);
            ne0 ne0Var2 = ((zs) arrayList.get(arrayList.size() - 1)).a.o;
            int[] iArr = new int[2];
            ne0Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.A.getWindowVisibleDisplayFrame(rect);
            if (this.B == 1) {
                if (ne0Var2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.B = i;
                    if (Build.VERSION.SDK_INT < 26) {
                        xk1Var.A = view;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.z.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.y & 7) == 5) {
                            iArr2[0] = this.z.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i8 = iArr3[0] - iArr2[0];
                        i2 = iArr3[1] - iArr2[1];
                        i3 = i8;
                    }
                    if ((this.y & 5) == 5) {
                        if (z3) {
                            width = i3 + view.getWidth();
                            xk1Var.r = width;
                            xk1Var.w = true;
                            xk1Var.v = true;
                            xk1Var.j(i2);
                        }
                        width = i3 - m;
                        xk1Var.r = width;
                        xk1Var.w = true;
                        xk1Var.v = true;
                        xk1Var.j(i2);
                    } else if (z3) {
                        width = i3 + m;
                        xk1Var.r = width;
                        xk1Var.w = true;
                        xk1Var.v = true;
                        xk1Var.j(i2);
                    } else {
                        m = view.getWidth();
                        width = i3 - m;
                        xk1Var.r = width;
                        xk1Var.w = true;
                        xk1Var.v = true;
                        xk1Var.j(i2);
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.B = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.B = i;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.y & 5) == 5) {
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.B = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            }
        } else {
            if (this.C) {
                xk1Var.r = this.E;
            }
            if (this.D) {
                xk1Var.j(this.F);
            }
            Rect rect2 = this.m;
            xk1Var.I = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new zs(xk1Var, fk1Var, this.B));
        xk1Var.c();
        ne0 ne0Var3 = xk1Var.o;
        ne0Var3.setOnKeyListener(this);
        if (zsVar == null && this.H && fk1Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, ne0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fk1Var.m);
            ne0Var3.addHeaderView(frameLayout, null, false);
            xk1Var.c();
        }
    }
}
