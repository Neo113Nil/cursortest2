package l;

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
import com.winfour.winrandom.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0184B;
import m.C0246w0;
import m.L0;
import m.M0;
import m.O0;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0163g extends AbstractC0177u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2779b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2780c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2781e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2782f;

    /* renamed from: n, reason: collision with root package name */
    public View f2789n;

    /* renamed from: o, reason: collision with root package name */
    public View f2790o;

    /* renamed from: p, reason: collision with root package name */
    public int f2791p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2792q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2793r;

    /* renamed from: s, reason: collision with root package name */
    public int f2794s;

    /* renamed from: t, reason: collision with root package name */
    public int f2795t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2797v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0180x f2798w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2799x;

    /* renamed from: y, reason: collision with root package name */
    public C0178v f2800y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2801z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2783g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2784h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0160d i = new ViewTreeObserverOnGlobalLayoutListenerC0160d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final N0.o f2785j = new N0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final D.g f2786k = new D.g(26, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2787l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2788m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2796u = false;

    public ViewOnKeyListenerC0163g(Context context, View view, int i, boolean z2) {
        this.f2779b = context;
        this.f2789n = view;
        this.d = i;
        this.f2781e = z2;
        this.f2791p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2780c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2782f = new Handler();
    }

    @Override // l.InterfaceC0154C
    public final boolean a() {
        ArrayList arrayList = this.f2784h;
        return arrayList.size() > 0 && ((C0162f) arrayList.get(0)).f2776a.f2955z.isShowing();
    }

    @Override // l.InterfaceC0181y
    public final void b(MenuC0169m menuC0169m, boolean z2) {
        ArrayList arrayList = this.f2784h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0169m == ((C0162f) arrayList.get(i)).f2777b) {
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
            ((C0162f) arrayList.get(i2)).f2777b.c(false);
        }
        C0162f c0162f = (C0162f) arrayList.remove(i);
        c0162f.f2777b.r(this);
        boolean z3 = this.f2801z;
        O0 o02 = c0162f.f2776a;
        if (z3) {
            L0.b(o02.f2955z, null);
            o02.f2955z.setAnimationStyle(0);
        }
        o02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2791p = ((C0162f) arrayList.get(size2 - 1)).f2778c;
        } else {
            this.f2791p = this.f2789n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0162f) arrayList.get(0)).f2777b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0180x interfaceC0180x = this.f2798w;
        if (interfaceC0180x != null) {
            interfaceC0180x.b(menuC0169m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2799x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2799x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2799x = null;
        }
        this.f2790o.removeOnAttachStateChangeListener(this.f2785j);
        this.f2800y.onDismiss();
    }

    @Override // l.InterfaceC0181y
    public final void c() {
        Iterator it = this.f2784h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0162f) it.next()).f2776a.f2934c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0166j) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC0154C
    public final void dismiss() {
        ArrayList arrayList = this.f2784h;
        int size = arrayList.size();
        if (size > 0) {
            C0162f[] c0162fArr = (C0162f[]) arrayList.toArray(new C0162f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0162f c0162f = c0162fArr[i];
                if (c0162f.f2776a.f2955z.isShowing()) {
                    c0162f.f2776a.dismiss();
                }
            }
        }
    }

    @Override // l.InterfaceC0181y
    public final boolean e(SubMenuC0156E subMenuC0156E) {
        Iterator it = this.f2784h.iterator();
        while (it.hasNext()) {
            C0162f c0162f = (C0162f) it.next();
            if (subMenuC0156E == c0162f.f2777b) {
                c0162f.f2776a.f2934c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0156E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0156E);
        InterfaceC0180x interfaceC0180x = this.f2798w;
        if (interfaceC0180x != null) {
            interfaceC0180x.j(subMenuC0156E);
        }
        return true;
    }

    @Override // l.InterfaceC0154C
    public final C0246w0 f() {
        ArrayList arrayList = this.f2784h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0162f) arrayList.get(arrayList.size() - 1)).f2776a.f2934c;
    }

    @Override // l.InterfaceC0181y
    public final void g(InterfaceC0180x interfaceC0180x) {
        this.f2798w = interfaceC0180x;
    }

    @Override // l.InterfaceC0181y
    public final boolean i() {
        return false;
    }

    @Override // l.InterfaceC0154C
    public final void j() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2783g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0169m) it.next());
        }
        arrayList.clear();
        View view = this.f2789n;
        this.f2790o = view;
        if (view != null) {
            boolean z2 = this.f2799x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2799x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2790o.addOnAttachStateChangeListener(this.f2785j);
        }
    }

    @Override // l.AbstractC0177u
    public final void l(MenuC0169m menuC0169m) {
        menuC0169m.b(this, this.f2779b);
        if (a()) {
            v(menuC0169m);
        } else {
            this.f2783g.add(menuC0169m);
        }
    }

    @Override // l.AbstractC0177u
    public final void n(View view) {
        if (this.f2789n != view) {
            this.f2789n = view;
            this.f2788m = Gravity.getAbsoluteGravity(this.f2787l, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC0177u
    public final void o(boolean z2) {
        this.f2796u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0162f c0162f;
        ArrayList arrayList = this.f2784h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0162f = null;
                break;
            }
            c0162f = (C0162f) arrayList.get(i);
            if (!c0162f.f2776a.f2955z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0162f != null) {
            c0162f.f2777b.c(false);
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

    @Override // l.AbstractC0177u
    public final void p(int i) {
        if (this.f2787l != i) {
            this.f2787l = i;
            this.f2788m = Gravity.getAbsoluteGravity(i, this.f2789n.getLayoutDirection());
        }
    }

    @Override // l.AbstractC0177u
    public final void q(int i) {
        this.f2792q = true;
        this.f2794s = i;
    }

    @Override // l.AbstractC0177u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2800y = (C0178v) onDismissListener;
    }

    @Override // l.AbstractC0177u
    public final void s(boolean z2) {
        this.f2797v = z2;
    }

    @Override // l.AbstractC0177u
    public final void t(int i) {
        this.f2793r = true;
        this.f2795t = i;
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
    public final void v(MenuC0169m menuC0169m) {
        C0162f c0162f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0166j c0166j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2779b;
        LayoutInflater from = LayoutInflater.from(context);
        C0166j c0166j2 = new C0166j(menuC0169m, from, this.f2781e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2796u) {
            c0166j2.f2811c = true;
        } else if (a()) {
            c0166j2.f2811c = AbstractC0177u.u(menuC0169m);
        }
        int m2 = AbstractC0177u.m(c0166j2, context, this.f2780c);
        O0 o02 = new O0(context, null, this.d);
        o02.f2973C = this.f2786k;
        o02.f2945p = this;
        o02.f2955z.setOnDismissListener(this);
        o02.f2944o = this.f2789n;
        o02.f2941l = this.f2788m;
        o02.f2954y = true;
        o02.f2955z.setFocusable(true);
        o02.f2955z.setInputMethodMode(2);
        o02.o(c0166j2);
        o02.r(m2);
        o02.f2941l = this.f2788m;
        ArrayList arrayList = this.f2784h;
        if (arrayList.size() > 0) {
            c0162f = (C0162f) arrayList.get(arrayList.size() - 1);
            MenuC0169m menuC0169m2 = c0162f.f2777b;
            int size = menuC0169m2.f2819f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0169m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0169m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0246w0 c0246w0 = c0162f.f2776a.f2934c;
                ListAdapter adapter = c0246w0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0166j = (C0166j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0166j = (C0166j) adapter;
                    i3 = 0;
                }
                int count = c0166j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0166j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0246w0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0246w0.getChildCount()) {
                    view = c0246w0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0184B c0184b = o02.f2955z;
                if (i6 <= 28) {
                    Method method = O0.f2972D;
                    if (method != null) {
                        try {
                            method.invoke(c0184b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    M0.a(c0184b, false);
                }
                L0.a(o02.f2955z, null);
                C0246w0 c0246w02 = ((C0162f) arrayList.get(arrayList.size() - 1)).f2776a.f2934c;
                int[] iArr = new int[2];
                c0246w02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2790o.getWindowVisibleDisplayFrame(rect);
                if (this.f2791p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2791p = i2;
                o02.f2944o = view;
                if ((this.f2788m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                o02.f2936f = m2;
                o02.f2940k = true;
                o02.f2939j = true;
                o02.m(0);
            } else {
                if (this.f2792q) {
                    o02.f2936f = this.f2794s;
                }
                if (this.f2793r) {
                    o02.m(this.f2795t);
                }
                Rect rect2 = this.f2876a;
                o02.f2953x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0162f(o02, menuC0169m, this.f2791p));
            o02.j();
            C0246w0 c0246w03 = o02.f2934c;
            c0246w03.setOnKeyListener(this);
            if (c0162f == null || !this.f2797v || menuC0169m.f2825m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0246w03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0169m.f2825m);
            c0246w03.addHeaderView(frameLayout, null, false);
            o02.j();
            return;
        }
        c0162f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0162f(o02, menuC0169m, this.f2791p));
        o02.j();
        C0246w0 c0246w032 = o02.f2934c;
        c0246w032.setOnKeyListener(this);
        if (c0162f == null) {
        }
    }
}
