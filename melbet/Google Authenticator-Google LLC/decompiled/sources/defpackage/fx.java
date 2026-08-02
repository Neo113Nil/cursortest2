package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fx extends gl implements View.OnKeyListener, PopupWindow.OnDismissListener, gp {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private go y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new gu(this, 1);
    private final View.OnAttachStateChangeListener m = new fu(this, 0);
    private final kj n = new fw(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = B();

    public fx(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int B() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void C(gd gdVar) {
        evt evtVar;
        View view;
        MenuItem menuItem;
        ga gaVar;
        int i;
        int firstVisiblePosition;
        Context context = this.h;
        LayoutInflater from = LayoutInflater.from(context);
        ga gaVar2 = new ga(gdVar, from, this.k, R.layout.abc_cascading_menu_item_layout);
        if (!x() && this.w) {
            gaVar2.b = true;
        } else if (x()) {
            gaVar2.b = gl.z(gdVar);
        }
        int A = A(gaVar2, context, this.i);
        kl klVar = new kl(context, this.j);
        klVar.b = this.n;
        klVar.l = this;
        klVar.t(this);
        klVar.k = this.q;
        klVar.j = this.p;
        klVar.y();
        klVar.w();
        klVar.e(gaVar2);
        klVar.r(A);
        klVar.j = this.p;
        List list = this.b;
        if (list.size() > 0) {
            evtVar = (evt) list.get(list.size() - 1);
            gd gdVar2 = (gd) evtVar.c;
            int size = gdVar2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = gdVar2.getItem(i2);
                if (menuItem.hasSubMenu() && gdVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (menuItem != null) {
                ListView b = evtVar.b();
                ListAdapter adapter = b.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    gaVar = (ga) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gaVar = (ga) adapter;
                    i = 0;
                }
                int count = gaVar.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        i3 = -1;
                        break;
                    } else if (menuItem == gaVar.getItem(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1 && (firstVisiblePosition = (i3 + i) - b.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < b.getChildCount()) {
                    view = b.getChildAt(firstVisiblePosition);
                    if (view == null) {
                        if (Build.VERSION.SDK_INT <= 28) {
                            Method method = kl.a;
                            if (method != null) {
                                try {
                                    method.invoke(klVar.p, false);
                                } catch (Exception unused) {
                                }
                            }
                        } else {
                            klVar.p.setTouchModal(false);
                        }
                        klVar.p.setEnterTransition(null);
                        ListView b2 = ((evt) this.b.get(r9.size() - 1)).b();
                        int[] iArr = new int[2];
                        b2.getLocationOnScreen(iArr);
                        Rect rect = new Rect();
                        this.d.getWindowVisibleDisplayFrame(rect);
                        int i4 = (this.r != 1 ? iArr[0] - A >= 0 : (iArr[0] + b2.getWidth()) + A > rect.right) ? 0 : 1;
                        this.r = i4;
                        klVar.k = view;
                        if ((this.p & 5) == 5) {
                            if (i4 == 0) {
                                A = view.getWidth();
                                A = -A;
                            }
                            klVar.g = A;
                            klVar.i = true;
                            klVar.h = true;
                            klVar.j(0);
                        } else {
                            if (i4 != 0) {
                                A = view.getWidth();
                                klVar.g = A;
                                klVar.i = true;
                                klVar.h = true;
                                klVar.j(0);
                            }
                            A = -A;
                            klVar.g = A;
                            klVar.i = true;
                            klVar.h = true;
                            klVar.j(0);
                        }
                    } else {
                        if (this.s) {
                            klVar.g = this.u;
                        }
                        if (this.t) {
                            klVar.j(this.v);
                        }
                        klVar.s(this.g);
                    }
                    this.b.add(new evt(klVar, gdVar, this.r));
                    klVar.v();
                    jp jpVar = klVar.e;
                    jpVar.setOnKeyListener(this);
                    if (evtVar == null || !this.x || gdVar.e == null) {
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) jpVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    frameLayout.setEnabled(false);
                    textView.setText(gdVar.e);
                    jpVar.addHeaderView(frameLayout, null, false);
                    klVar.v();
                    return;
                }
            }
        } else {
            evtVar = null;
        }
        view = null;
        if (view == null) {
        }
        this.b.add(new evt(klVar, gdVar, this.r));
        klVar.v();
        jp jpVar2 = klVar.e;
        jpVar2.setOnKeyListener(this);
        if (evtVar == null) {
        }
    }

    @Override // defpackage.gp
    public final Parcelable bh() {
        return null;
    }

    @Override // defpackage.gt
    public final ListView bi() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((evt) list.get(list.size() - 1)).b();
    }

    @Override // defpackage.gp
    public final void d(gd gdVar, boolean z) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gdVar == ((evt) list.get(i)).c) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < list.size()) {
            ((gd) ((evt) list.get(i2)).c).i(false);
        }
        evt evtVar = (evt) list.remove(i);
        ((gd) evtVar.c).m(this);
        if (this.f) {
            Object obj = evtVar.b;
            ((kl) obj).p.setExitTransition(null);
            ((ki) obj).p.setAnimationStyle(0);
        }
        ((ki) evtVar.b).m();
        int size2 = list.size();
        if (size2 > 0) {
            this.r = ((evt) list.get(size2 - 1)).a;
        } else {
            this.r = B();
        }
        if (size2 != 0) {
            if (z) {
                ((gd) ((evt) list.get(0)).c).i(false);
                return;
            }
            return;
        }
        m();
        go goVar = this.y;
        if (goVar != null) {
            goVar.a(gdVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.gp
    public final void e(go goVar) {
        this.y = goVar;
    }

    @Override // defpackage.gp
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gp
    public final boolean g(gw gwVar) {
        for (evt evtVar : this.b) {
            if (gwVar == evtVar.c) {
                evtVar.b().requestFocus();
                return true;
            }
        }
        if (!gwVar.hasVisibleItems()) {
            return false;
        }
        l(gwVar);
        go goVar = this.y;
        if (goVar != null) {
            goVar.b(gwVar);
        }
        return true;
    }

    @Override // defpackage.gp
    public final void j() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            y(((evt) it.next()).b().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gl
    public final void l(gd gdVar) {
        gdVar.h(this, this.h);
        if (x()) {
            C(gdVar);
        } else {
            this.l.add(gdVar);
        }
    }

    @Override // defpackage.gt
    public final void m() {
        List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        evt[] evtVarArr = (evt[]) list.toArray(new evt[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ki kiVar = (ki) evtVarArr[size].b;
            if (kiVar.x()) {
                kiVar.m();
            }
        }
    }

    @Override // defpackage.gl
    public final void o(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        evt evtVar;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                evtVar = null;
                break;
            }
            evtVar = (evt) list.get(i);
            if (!((ki) evtVar.b).x()) {
                break;
            } else {
                i++;
            }
        }
        if (evtVar != null) {
            ((gd) evtVar.c).i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m();
        return true;
    }

    @Override // defpackage.gl
    public final void p(boolean z) {
        this.w = z;
    }

    @Override // defpackage.gl
    public final void q(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.gl
    public final void r(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.gl
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.gl
    public final void t(boolean z) {
        this.x = z;
    }

    @Override // defpackage.gl
    public final void u(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.gt
    public final void v() {
        if (x()) {
            return;
        }
        List list = this.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C((gd) it.next());
        }
        list.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.gl
    protected final boolean w() {
        return false;
    }

    @Override // defpackage.gt
    public final boolean x() {
        List list = this.b;
        return list.size() > 0 && ((ki) ((evt) list.get(0)).b).x();
    }

    @Override // defpackage.gp
    public final void n(Parcelable parcelable) {
    }
}
