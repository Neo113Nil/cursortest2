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
import com.neonpulse.gridlogic.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0188B;
import l.C0242s0;
import l.H0;
import l.I0;
import l.K0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0154g extends AbstractC0168u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2627c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2628e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2629f;

    /* renamed from: n, reason: collision with root package name */
    public View f2635n;

    /* renamed from: o, reason: collision with root package name */
    public View f2636o;

    /* renamed from: p, reason: collision with root package name */
    public int f2637p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2638q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2639r;

    /* renamed from: s, reason: collision with root package name */
    public int f2640s;

    /* renamed from: t, reason: collision with root package name */
    public int f2641t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2643v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0171x f2644w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2645x;

    /* renamed from: y, reason: collision with root package name */
    public C0169v f2646y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2647z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2630g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0151d i = new ViewTreeObserverOnGlobalLayoutListenerC0151d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final L0.o f2631j = new L0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final C.g f2632k = new C.g(25, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2633l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2634m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2642u = false;

    public ViewOnKeyListenerC0154g(Context context, View view, int i, boolean z2) {
        this.f2626b = context;
        this.f2635n = view;
        this.d = i;
        this.f2628e = z2;
        this.f2637p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2627c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2629f = new Handler();
    }

    @Override // k.InterfaceC0145C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0153f) arrayList.get(0)).f2623a.f2866z.isShowing();
    }

    @Override // k.InterfaceC0172y
    public final void b(MenuC0160m menuC0160m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0160m == ((C0153f) arrayList.get(i)).f2624b) {
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
            ((C0153f) arrayList.get(i2)).f2624b.c(false);
        }
        C0153f c0153f = (C0153f) arrayList.remove(i);
        c0153f.f2624b.r(this);
        boolean z3 = this.f2647z;
        K0 k02 = c0153f.f2623a;
        if (z3) {
            H0.b(k02.f2866z, null);
            k02.f2866z.setAnimationStyle(0);
        }
        k02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2637p = ((C0153f) arrayList.get(size2 - 1)).f2625c;
        } else {
            this.f2637p = this.f2635n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0153f) arrayList.get(0)).f2624b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0171x interfaceC0171x = this.f2644w;
        if (interfaceC0171x != null) {
            interfaceC0171x.b(menuC0160m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2645x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2645x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2645x = null;
        }
        this.f2636o.removeOnAttachStateChangeListener(this.f2631j);
        this.f2646y.onDismiss();
    }

    @Override // k.InterfaceC0172y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0153f) it.next()).f2623a.f2846c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0157j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0145C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0153f[] c0153fArr = (C0153f[]) arrayList.toArray(new C0153f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0153f c0153f = c0153fArr[i];
                if (c0153f.f2623a.f2866z.isShowing()) {
                    c0153f.f2623a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0145C
    public final C0242s0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0153f) arrayList.get(arrayList.size() - 1)).f2623a.f2846c;
    }

    @Override // k.InterfaceC0172y
    public final boolean f(SubMenuC0147E subMenuC0147E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0153f c0153f = (C0153f) it.next();
            if (subMenuC0147E == c0153f.f2624b) {
                c0153f.f2623a.f2846c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0147E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0147E);
        InterfaceC0171x interfaceC0171x = this.f2644w;
        if (interfaceC0171x != null) {
            interfaceC0171x.h(subMenuC0147E);
        }
        return true;
    }

    @Override // k.InterfaceC0172y
    public final void g(InterfaceC0171x interfaceC0171x) {
        this.f2644w = interfaceC0171x;
    }

    @Override // k.InterfaceC0145C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2630g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0160m) it.next());
        }
        arrayList.clear();
        View view = this.f2635n;
        this.f2636o = view;
        if (view != null) {
            boolean z2 = this.f2645x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2645x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2636o.addOnAttachStateChangeListener(this.f2631j);
        }
    }

    @Override // k.InterfaceC0172y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0168u
    public final void l(MenuC0160m menuC0160m) {
        menuC0160m.b(this, this.f2626b);
        if (a()) {
            v(menuC0160m);
        } else {
            this.f2630g.add(menuC0160m);
        }
    }

    @Override // k.AbstractC0168u
    public final void n(View view) {
        if (this.f2635n != view) {
            this.f2635n = view;
            this.f2634m = Gravity.getAbsoluteGravity(this.f2633l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0168u
    public final void o(boolean z2) {
        this.f2642u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0153f c0153f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0153f = null;
                break;
            }
            c0153f = (C0153f) arrayList.get(i);
            if (!c0153f.f2623a.f2866z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0153f != null) {
            c0153f.f2624b.c(false);
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

    @Override // k.AbstractC0168u
    public final void p(int i) {
        if (this.f2633l != i) {
            this.f2633l = i;
            this.f2634m = Gravity.getAbsoluteGravity(i, this.f2635n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0168u
    public final void q(int i) {
        this.f2638q = true;
        this.f2640s = i;
    }

    @Override // k.AbstractC0168u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2646y = (C0169v) onDismissListener;
    }

    @Override // k.AbstractC0168u
    public final void s(boolean z2) {
        this.f2643v = z2;
    }

    @Override // k.AbstractC0168u
    public final void t(int i) {
        this.f2639r = true;
        this.f2641t = i;
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
    public final void v(MenuC0160m menuC0160m) {
        C0153f c0153f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0157j c0157j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2626b;
        LayoutInflater from = LayoutInflater.from(context);
        C0157j c0157j2 = new C0157j(menuC0160m, from, this.f2628e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2642u) {
            c0157j2.f2657c = true;
        } else if (a()) {
            c0157j2.f2657c = AbstractC0168u.u(menuC0160m);
        }
        int m2 = AbstractC0168u.m(c0157j2, context, this.f2627c);
        K0 k02 = new K0(context, null, this.d);
        k02.f2882C = this.f2632k;
        k02.f2856p = this;
        k02.f2866z.setOnDismissListener(this);
        k02.f2855o = this.f2635n;
        k02.f2852l = this.f2634m;
        k02.f2865y = true;
        k02.f2866z.setFocusable(true);
        k02.f2866z.setInputMethodMode(2);
        k02.n(c0157j2);
        k02.q(m2);
        k02.f2852l = this.f2634m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0153f = (C0153f) arrayList.get(arrayList.size() - 1);
            MenuC0160m menuC0160m2 = c0153f.f2624b;
            int size = menuC0160m2.f2665f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0160m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0160m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0242s0 c0242s0 = c0153f.f2623a.f2846c;
                ListAdapter adapter = c0242s0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0157j = (C0157j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0157j = (C0157j) adapter;
                    i3 = 0;
                }
                int count = c0157j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0157j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0242s0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0242s0.getChildCount()) {
                    view = c0242s0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0188B c0188b = k02.f2866z;
                if (i6 <= 28) {
                    Method method = K0.f2881D;
                    if (method != null) {
                        try {
                            method.invoke(c0188b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    I0.a(c0188b, false);
                }
                H0.a(k02.f2866z, null);
                C0242s0 c0242s02 = ((C0153f) arrayList.get(arrayList.size() - 1)).f2623a.f2846c;
                int[] iArr = new int[2];
                c0242s02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2636o.getWindowVisibleDisplayFrame(rect);
                if (this.f2637p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2637p = i2;
                k02.f2855o = view;
                if ((this.f2634m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                k02.f2848f = m2;
                k02.f2851k = true;
                k02.f2850j = true;
                k02.l(0);
            } else {
                if (this.f2638q) {
                    k02.f2848f = this.f2640s;
                }
                if (this.f2639r) {
                    k02.l(this.f2641t);
                }
                Rect rect2 = this.f2720a;
                k02.f2864x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0153f(k02, menuC0160m, this.f2637p));
            k02.i();
            C0242s0 c0242s03 = k02.f2846c;
            c0242s03.setOnKeyListener(this);
            if (c0153f == null || !this.f2643v || menuC0160m.f2670m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0242s03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0160m.f2670m);
            c0242s03.addHeaderView(frameLayout, null, false);
            k02.i();
            return;
        }
        c0153f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0153f(k02, menuC0160m, this.f2637p));
        k02.i();
        C0242s0 c0242s032 = k02.f2846c;
        c0242s032.setOnKeyListener(this);
        if (c0153f == null) {
        }
    }
}
