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
import com.playgen.securelock.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0189B;
import l.C0245t0;
import l.I0;
import l.J0;
import l.L0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0155g extends AbstractC0169u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2577b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2578c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2579e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2580f;

    /* renamed from: n, reason: collision with root package name */
    public View f2586n;

    /* renamed from: o, reason: collision with root package name */
    public View f2587o;

    /* renamed from: p, reason: collision with root package name */
    public int f2588p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2589q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2590r;

    /* renamed from: s, reason: collision with root package name */
    public int f2591s;

    /* renamed from: t, reason: collision with root package name */
    public int f2592t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2594v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0172x f2595w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2596x;

    /* renamed from: y, reason: collision with root package name */
    public C0170v f2597y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2598z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2581g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0152d i = new ViewTreeObserverOnGlobalLayoutListenerC0152d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final L0.o f2582j = new L0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final C.g f2583k = new C.g(26, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2584l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2585m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2593u = false;

    public ViewOnKeyListenerC0155g(Context context, View view, int i, boolean z2) {
        this.f2577b = context;
        this.f2586n = view;
        this.d = i;
        this.f2579e = z2;
        this.f2588p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2578c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2580f = new Handler();
    }

    @Override // k.InterfaceC0146C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0154f) arrayList.get(0)).f2574a.f2812z.isShowing();
    }

    @Override // k.InterfaceC0173y
    public final void b(MenuC0161m menuC0161m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0161m == ((C0154f) arrayList.get(i)).f2575b) {
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
            ((C0154f) arrayList.get(i2)).f2575b.c(false);
        }
        C0154f c0154f = (C0154f) arrayList.remove(i);
        c0154f.f2575b.r(this);
        boolean z3 = this.f2598z;
        L0 l02 = c0154f.f2574a;
        if (z3) {
            I0.b(l02.f2812z, null);
            l02.f2812z.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2588p = ((C0154f) arrayList.get(size2 - 1)).f2576c;
        } else {
            this.f2588p = this.f2586n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0154f) arrayList.get(0)).f2575b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0172x interfaceC0172x = this.f2595w;
        if (interfaceC0172x != null) {
            interfaceC0172x.b(menuC0161m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2596x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2596x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2596x = null;
        }
        this.f2587o.removeOnAttachStateChangeListener(this.f2582j);
        this.f2597y.onDismiss();
    }

    @Override // k.InterfaceC0173y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0154f) it.next()).f2574a.f2792c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0158j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0146C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0154f[] c0154fArr = (C0154f[]) arrayList.toArray(new C0154f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0154f c0154f = c0154fArr[i];
                if (c0154f.f2574a.f2812z.isShowing()) {
                    c0154f.f2574a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0173y
    public final boolean e(SubMenuC0148E subMenuC0148E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0154f c0154f = (C0154f) it.next();
            if (subMenuC0148E == c0154f.f2575b) {
                c0154f.f2574a.f2792c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0148E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0148E);
        InterfaceC0172x interfaceC0172x = this.f2595w;
        if (interfaceC0172x != null) {
            interfaceC0172x.f(subMenuC0148E);
        }
        return true;
    }

    @Override // k.InterfaceC0146C
    public final C0245t0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0154f) arrayList.get(arrayList.size() - 1)).f2574a.f2792c;
    }

    @Override // k.InterfaceC0173y
    public final void g(InterfaceC0172x interfaceC0172x) {
        this.f2595w = interfaceC0172x;
    }

    @Override // k.InterfaceC0146C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2581g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0161m) it.next());
        }
        arrayList.clear();
        View view = this.f2586n;
        this.f2587o = view;
        if (view != null) {
            boolean z2 = this.f2596x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2596x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2587o.addOnAttachStateChangeListener(this.f2582j);
        }
    }

    @Override // k.InterfaceC0173y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0169u
    public final void l(MenuC0161m menuC0161m) {
        menuC0161m.b(this, this.f2577b);
        if (a()) {
            v(menuC0161m);
        } else {
            this.f2581g.add(menuC0161m);
        }
    }

    @Override // k.AbstractC0169u
    public final void n(View view) {
        if (this.f2586n != view) {
            this.f2586n = view;
            this.f2585m = Gravity.getAbsoluteGravity(this.f2584l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0169u
    public final void o(boolean z2) {
        this.f2593u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0154f c0154f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0154f = null;
                break;
            }
            c0154f = (C0154f) arrayList.get(i);
            if (!c0154f.f2574a.f2812z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0154f != null) {
            c0154f.f2575b.c(false);
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

    @Override // k.AbstractC0169u
    public final void p(int i) {
        if (this.f2584l != i) {
            this.f2584l = i;
            this.f2585m = Gravity.getAbsoluteGravity(i, this.f2586n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0169u
    public final void q(int i) {
        this.f2589q = true;
        this.f2591s = i;
    }

    @Override // k.AbstractC0169u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2597y = (C0170v) onDismissListener;
    }

    @Override // k.AbstractC0169u
    public final void s(boolean z2) {
        this.f2594v = z2;
    }

    @Override // k.AbstractC0169u
    public final void t(int i) {
        this.f2590r = true;
        this.f2592t = i;
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
    public final void v(MenuC0161m menuC0161m) {
        C0154f c0154f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0158j c0158j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2577b;
        LayoutInflater from = LayoutInflater.from(context);
        C0158j c0158j2 = new C0158j(menuC0161m, from, this.f2579e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2593u) {
            c0158j2.f2608c = true;
        } else if (a()) {
            c0158j2.f2608c = AbstractC0169u.u(menuC0161m);
        }
        int m2 = AbstractC0169u.m(c0158j2, context, this.f2578c);
        L0 l02 = new L0(context, null, this.d);
        l02.f2829C = this.f2583k;
        l02.f2802p = this;
        l02.f2812z.setOnDismissListener(this);
        l02.f2801o = this.f2586n;
        l02.f2798l = this.f2585m;
        l02.f2811y = true;
        l02.f2812z.setFocusable(true);
        l02.f2812z.setInputMethodMode(2);
        l02.n(c0158j2);
        l02.q(m2);
        l02.f2798l = this.f2585m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0154f = (C0154f) arrayList.get(arrayList.size() - 1);
            MenuC0161m menuC0161m2 = c0154f.f2575b;
            int size = menuC0161m2.f2616f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0161m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0161m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0245t0 c0245t0 = c0154f.f2574a.f2792c;
                ListAdapter adapter = c0245t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0158j = (C0158j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0158j = (C0158j) adapter;
                    i3 = 0;
                }
                int count = c0158j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0158j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0245t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0245t0.getChildCount()) {
                    view = c0245t0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0189B c0189b = l02.f2812z;
                if (i6 <= 28) {
                    Method method = L0.f2828D;
                    if (method != null) {
                        try {
                            method.invoke(c0189b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    J0.a(c0189b, false);
                }
                I0.a(l02.f2812z, null);
                C0245t0 c0245t02 = ((C0154f) arrayList.get(arrayList.size() - 1)).f2574a.f2792c;
                int[] iArr = new int[2];
                c0245t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2587o.getWindowVisibleDisplayFrame(rect);
                if (this.f2588p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2588p = i2;
                l02.f2801o = view;
                if ((this.f2585m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                l02.f2794f = m2;
                l02.f2797k = true;
                l02.f2796j = true;
                l02.l(0);
            } else {
                if (this.f2589q) {
                    l02.f2794f = this.f2591s;
                }
                if (this.f2590r) {
                    l02.l(this.f2592t);
                }
                Rect rect2 = this.f2671a;
                l02.f2810x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0154f(l02, menuC0161m, this.f2588p));
            l02.i();
            C0245t0 c0245t03 = l02.f2792c;
            c0245t03.setOnKeyListener(this);
            if (c0154f == null || !this.f2594v || menuC0161m.f2621m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0245t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0161m.f2621m);
            c0245t03.addHeaderView(frameLayout, null, false);
            l02.i();
            return;
        }
        c0154f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0154f(l02, menuC0161m, this.f2588p));
        l02.i();
        C0245t0 c0245t032 = l02.f2792c;
        c0245t032.setOnKeyListener(this);
        if (c0154f == null) {
        }
    }
}
