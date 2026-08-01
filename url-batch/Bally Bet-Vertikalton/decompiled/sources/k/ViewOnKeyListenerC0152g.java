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
import com.skydrop.fallring.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0207C;
import l.C0262t0;
import l.I0;
import l.J0;
import l.L0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0152g extends AbstractC0166u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2635c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2636e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2637f;

    /* renamed from: n, reason: collision with root package name */
    public View f2643n;

    /* renamed from: o, reason: collision with root package name */
    public View f2644o;

    /* renamed from: p, reason: collision with root package name */
    public int f2645p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2646q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2647r;

    /* renamed from: s, reason: collision with root package name */
    public int f2648s;

    /* renamed from: t, reason: collision with root package name */
    public int f2649t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2651v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0169x f2652w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2653x;

    /* renamed from: y, reason: collision with root package name */
    public C0167v f2654y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2655z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2638g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0149d i = new ViewTreeObserverOnGlobalLayoutListenerC0149d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f2639j = new K0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final B0.d f2640k = new B0.d(27, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2641l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2642m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2650u = false;

    public ViewOnKeyListenerC0152g(Context context, View view, int i, boolean z2) {
        this.f2634b = context;
        this.f2643n = view;
        this.d = i;
        this.f2636e = z2;
        this.f2645p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2635c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2637f = new Handler();
    }

    @Override // k.InterfaceC0143C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0151f) arrayList.get(0)).f2631a.f2866z.isShowing();
    }

    @Override // k.InterfaceC0170y
    public final void b(MenuC0158m menuC0158m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0158m == ((C0151f) arrayList.get(i)).f2632b) {
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
            ((C0151f) arrayList.get(i2)).f2632b.c(false);
        }
        C0151f c0151f = (C0151f) arrayList.remove(i);
        c0151f.f2632b.r(this);
        boolean z3 = this.f2655z;
        L0 l02 = c0151f.f2631a;
        if (z3) {
            I0.b(l02.f2866z, null);
            l02.f2866z.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2645p = ((C0151f) arrayList.get(size2 - 1)).f2633c;
        } else {
            this.f2645p = this.f2643n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0151f) arrayList.get(0)).f2632b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0169x interfaceC0169x = this.f2652w;
        if (interfaceC0169x != null) {
            interfaceC0169x.b(menuC0158m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2653x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2653x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2653x = null;
        }
        this.f2644o.removeOnAttachStateChangeListener(this.f2639j);
        this.f2654y.onDismiss();
    }

    @Override // k.InterfaceC0170y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0151f) it.next()).f2631a.f2846c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0155j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0143C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0151f[] c0151fArr = (C0151f[]) arrayList.toArray(new C0151f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0151f c0151f = c0151fArr[i];
                if (c0151f.f2631a.f2866z.isShowing()) {
                    c0151f.f2631a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0170y
    public final boolean e(SubMenuC0145E subMenuC0145E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0151f c0151f = (C0151f) it.next();
            if (subMenuC0145E == c0151f.f2632b) {
                c0151f.f2631a.f2846c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0145E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0145E);
        InterfaceC0169x interfaceC0169x = this.f2652w;
        if (interfaceC0169x != null) {
            interfaceC0169x.f(subMenuC0145E);
        }
        return true;
    }

    @Override // k.InterfaceC0143C
    public final C0262t0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0151f) arrayList.get(arrayList.size() - 1)).f2631a.f2846c;
    }

    @Override // k.InterfaceC0170y
    public final void g(InterfaceC0169x interfaceC0169x) {
        this.f2652w = interfaceC0169x;
    }

    @Override // k.InterfaceC0143C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2638g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0158m) it.next());
        }
        arrayList.clear();
        View view = this.f2643n;
        this.f2644o = view;
        if (view != null) {
            boolean z2 = this.f2653x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2653x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2644o.addOnAttachStateChangeListener(this.f2639j);
        }
    }

    @Override // k.InterfaceC0170y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0166u
    public final void l(MenuC0158m menuC0158m) {
        menuC0158m.b(this, this.f2634b);
        if (a()) {
            v(menuC0158m);
        } else {
            this.f2638g.add(menuC0158m);
        }
    }

    @Override // k.AbstractC0166u
    public final void n(View view) {
        if (this.f2643n != view) {
            this.f2643n = view;
            this.f2642m = Gravity.getAbsoluteGravity(this.f2641l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0166u
    public final void o(boolean z2) {
        this.f2650u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0151f c0151f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0151f = null;
                break;
            }
            c0151f = (C0151f) arrayList.get(i);
            if (!c0151f.f2631a.f2866z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0151f != null) {
            c0151f.f2632b.c(false);
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

    @Override // k.AbstractC0166u
    public final void p(int i) {
        if (this.f2641l != i) {
            this.f2641l = i;
            this.f2642m = Gravity.getAbsoluteGravity(i, this.f2643n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0166u
    public final void q(int i) {
        this.f2646q = true;
        this.f2648s = i;
    }

    @Override // k.AbstractC0166u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2654y = (C0167v) onDismissListener;
    }

    @Override // k.AbstractC0166u
    public final void s(boolean z2) {
        this.f2651v = z2;
    }

    @Override // k.AbstractC0166u
    public final void t(int i) {
        this.f2647r = true;
        this.f2649t = i;
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
    public final void v(MenuC0158m menuC0158m) {
        C0151f c0151f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0155j c0155j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2634b;
        LayoutInflater from = LayoutInflater.from(context);
        C0155j c0155j2 = new C0155j(menuC0158m, from, this.f2636e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2650u) {
            c0155j2.f2665c = true;
        } else if (a()) {
            c0155j2.f2665c = AbstractC0166u.u(menuC0158m);
        }
        int m2 = AbstractC0166u.m(c0155j2, context, this.f2635c);
        L0 l02 = new L0(context, null, this.d);
        l02.f2882C = this.f2640k;
        l02.f2856p = this;
        l02.f2866z.setOnDismissListener(this);
        l02.f2855o = this.f2643n;
        l02.f2852l = this.f2642m;
        l02.f2865y = true;
        l02.f2866z.setFocusable(true);
        l02.f2866z.setInputMethodMode(2);
        l02.n(c0155j2);
        l02.r(m2);
        l02.f2852l = this.f2642m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0151f = (C0151f) arrayList.get(arrayList.size() - 1);
            MenuC0158m menuC0158m2 = c0151f.f2632b;
            int size = menuC0158m2.f2673f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0158m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0158m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0262t0 c0262t0 = c0151f.f2631a.f2846c;
                ListAdapter adapter = c0262t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0155j = (C0155j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0155j = (C0155j) adapter;
                    i3 = 0;
                }
                int count = c0155j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0155j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0262t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0262t0.getChildCount()) {
                    view = c0262t0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0207C c0207c = l02.f2866z;
                if (i6 <= 28) {
                    Method method = L0.f2881D;
                    if (method != null) {
                        try {
                            method.invoke(c0207c, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    J0.a(c0207c, false);
                }
                I0.a(l02.f2866z, null);
                C0262t0 c0262t02 = ((C0151f) arrayList.get(arrayList.size() - 1)).f2631a.f2846c;
                int[] iArr = new int[2];
                c0262t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2644o.getWindowVisibleDisplayFrame(rect);
                if (this.f2645p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2645p = i2;
                l02.f2855o = view;
                if ((this.f2642m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                l02.f2848f = m2;
                l02.f2851k = true;
                l02.f2850j = true;
                l02.l(0);
            } else {
                if (this.f2646q) {
                    l02.f2848f = this.f2648s;
                }
                if (this.f2647r) {
                    l02.l(this.f2649t);
                }
                Rect rect2 = this.f2728a;
                l02.f2864x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0151f(l02, menuC0158m, this.f2645p));
            l02.i();
            C0262t0 c0262t03 = l02.f2846c;
            c0262t03.setOnKeyListener(this);
            if (c0151f == null || !this.f2651v || menuC0158m.f2678m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0262t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0158m.f2678m);
            c0262t03.addHeaderView(frameLayout, null, false);
            l02.i();
            return;
        }
        c0151f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0151f(l02, menuC0158m, this.f2645p));
        l02.i();
        C0262t0 c0262t032 = l02.f2846c;
        c0262t032.setOnKeyListener(this);
        if (c0151f == null) {
        }
    }
}
