package k;

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
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.quicktoss.winflip.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0206C;
import l.C0261t0;
import l.I0;
import l.J0;
import l.L0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0151g extends AbstractC0165u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2652c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2653e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2654f;

    /* renamed from: n, reason: collision with root package name */
    public View f2660n;

    /* renamed from: o, reason: collision with root package name */
    public View f2661o;

    /* renamed from: p, reason: collision with root package name */
    public int f2662p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2663q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2664r;

    /* renamed from: s, reason: collision with root package name */
    public int f2665s;

    /* renamed from: t, reason: collision with root package name */
    public int f2666t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2668v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0168x f2669w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2670x;

    /* renamed from: y, reason: collision with root package name */
    public C0166v f2671y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2672z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2655g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0148d i = new ViewTreeObserverOnGlobalLayoutListenerC0148d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2656j = new K0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final B0.d f2657k = new B0.d(28, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2658l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2659m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2667u = false;

    public ViewOnKeyListenerC0151g(Context context, View view, int i, boolean z2) {
        this.f2651b = context;
        this.f2660n = view;
        this.d = i;
        this.f2653e = z2;
        this.f2662p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2652c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2654f = new Handler();
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0150f) arrayList.get(0)).f2648a.f2883z.isShowing();
    }

    @Override // k.InterfaceC0169y
    public final void b(MenuC0157m menuC0157m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0157m == ((C0150f) arrayList.get(i)).f2649b) {
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
            ((C0150f) arrayList.get(i2)).f2649b.c(false);
        }
        C0150f c0150f = (C0150f) arrayList.remove(i);
        c0150f.f2649b.r(this);
        boolean z3 = this.f2672z;
        L0 l02 = c0150f.f2648a;
        if (z3) {
            I0.b(l02.f2883z, null);
            l02.f2883z.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2662p = ((C0150f) arrayList.get(size2 - 1)).f2650c;
        } else {
            this.f2662p = this.f2660n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0150f) arrayList.get(0)).f2649b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0168x interfaceC0168x = this.f2669w;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2670x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2670x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2670x = null;
        }
        this.f2661o.removeOnAttachStateChangeListener(this.f2656j);
        this.f2671y.onDismiss();
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0150f) it.next()).f2648a.f2863c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0154j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0142C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0150f[] c0150fArr = (C0150f[]) arrayList.toArray(new C0150f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0150f c0150f = c0150fArr[i];
                if (c0150f.f2648a.f2883z.isShowing()) {
                    c0150f.f2648a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean e(SubMenuC0144E subMenuC0144E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0150f c0150f = (C0150f) it.next();
            if (subMenuC0144E == c0150f.f2649b) {
                c0150f.f2648a.f2863c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0144E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0144E);
        InterfaceC0168x interfaceC0168x = this.f2669w;
        if (interfaceC0168x != null) {
            interfaceC0168x.c(subMenuC0144E);
        }
        return true;
    }

    @Override // k.InterfaceC0142C
    public final C0261t0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0150f) arrayList.get(arrayList.size() - 1)).f2648a.f2863c;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        this.f2669w = interfaceC0168x;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2655g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0157m) it.next());
        }
        arrayList.clear();
        View view = this.f2660n;
        this.f2661o = view;
        if (view != null) {
            boolean z2 = this.f2670x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2670x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2661o.addOnAttachStateChangeListener(this.f2656j);
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0165u
    public final void l(MenuC0157m menuC0157m) {
        menuC0157m.b(this, this.f2651b);
        if (a()) {
            v(menuC0157m);
        } else {
            this.f2655g.add(menuC0157m);
        }
    }

    @Override // k.AbstractC0165u
    public final void n(View view) {
        if (this.f2660n != view) {
            this.f2660n = view;
            this.f2659m = Gravity.getAbsoluteGravity(this.f2658l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0165u
    public final void o(boolean z2) {
        this.f2667u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0150f c0150f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0150f = null;
                break;
            }
            c0150f = (C0150f) arrayList.get(i);
            if (!c0150f.f2648a.f2883z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0150f != null) {
            c0150f.f2649b.c(false);
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

    @Override // k.AbstractC0165u
    public final void p(int i) {
        if (this.f2658l != i) {
            this.f2658l = i;
            this.f2659m = Gravity.getAbsoluteGravity(i, this.f2660n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0165u
    public final void q(int i) {
        this.f2663q = true;
        this.f2665s = i;
    }

    @Override // k.AbstractC0165u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2671y = (C0166v) onDismissListener;
    }

    @Override // k.AbstractC0165u
    public final void s(boolean z2) {
        this.f2668v = z2;
    }

    @Override // k.AbstractC0165u
    public final void t(int i) {
        this.f2664r = true;
        this.f2666t = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (((r8.getWidth() + r9[0]) + r5) > r11.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r9 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r8 = 1;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if ((r9[0] - r5) < 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MenuC0157m menuC0157m) {
        C0150f c0150f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0154j c0154j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2651b;
        LayoutInflater from = LayoutInflater.from(context);
        C0154j c0154j2 = new C0154j(menuC0157m, from, this.f2653e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2667u) {
            c0154j2.f2682c = true;
        } else if (a()) {
            c0154j2.f2682c = AbstractC0165u.u(menuC0157m);
        }
        int m2 = AbstractC0165u.m(c0154j2, context, this.f2652c);
        L0 l02 = new L0(context, null, this.d);
        l02.f2899C = this.f2657k;
        l02.f2873p = this;
        l02.f2883z.setOnDismissListener(this);
        l02.f2872o = this.f2660n;
        l02.f2869l = this.f2659m;
        l02.f2882y = true;
        l02.f2883z.setFocusable(true);
        l02.f2883z.setInputMethodMode(2);
        l02.n(c0154j2);
        l02.r(m2);
        l02.f2869l = this.f2659m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0150f = (C0150f) arrayList.get(arrayList.size() - 1);
            MenuC0157m menuC0157m2 = c0150f.f2649b;
            int size = menuC0157m2.f2690f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0157m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0157m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0261t0 c0261t0 = c0150f.f2648a.f2863c;
                ListAdapter adapter = c0261t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0154j = (C0154j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0154j = (C0154j) adapter;
                    i3 = 0;
                }
                int count = c0154j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0154j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0261t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0261t0.getChildCount()) {
                    view = c0261t0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0206C c0206c = l02.f2883z;
                if (i6 <= 28) {
                    Method method = L0.f2898D;
                    if (method != null) {
                        try {
                            method.invoke(c0206c, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    J0.a(c0206c, false);
                }
                I0.a(l02.f2883z, null);
                C0261t0 c0261t02 = ((C0150f) arrayList.get(arrayList.size() - 1)).f2648a.f2863c;
                int[] iArr = new int[2];
                c0261t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2661o.getWindowVisibleDisplayFrame(rect);
                if (this.f2662p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2662p = i2;
                l02.f2872o = view;
                if ((this.f2659m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                l02.f2865f = m2;
                l02.f2868k = true;
                l02.f2867j = true;
                l02.l(0);
            } else {
                if (this.f2663q) {
                    l02.f2865f = this.f2665s;
                }
                if (this.f2664r) {
                    l02.l(this.f2666t);
                }
                Rect rect2 = this.f2745a;
                l02.f2881x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0150f(l02, menuC0157m, this.f2662p));
            l02.i();
            C0261t0 c0261t03 = l02.f2863c;
            c0261t03.setOnKeyListener(this);
            if (c0150f == null || !this.f2668v || menuC0157m.f2695m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0261t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0157m.f2695m);
            c0261t03.addHeaderView(frameLayout, null, false);
            l02.i();
            return;
        }
        c0150f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0150f(l02, menuC0157m, this.f2662p));
        l02.i();
        C0261t0 c0261t032 = l02.f2863c;
        c0261t032.setOnKeyListener(this);
        if (c0150f == null) {
        }
    }
}
