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
import com.glasspulse.glasspulse.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0181A;
import l.C0234r0;
import l.G0;
import l.H0;
import l.J0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0151g extends AbstractC0165u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2613b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2614c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2615e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2616f;

    /* renamed from: n, reason: collision with root package name */
    public View f2622n;

    /* renamed from: o, reason: collision with root package name */
    public View f2623o;

    /* renamed from: p, reason: collision with root package name */
    public int f2624p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2625q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2626r;

    /* renamed from: s, reason: collision with root package name */
    public int f2627s;

    /* renamed from: t, reason: collision with root package name */
    public int f2628t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2630v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0168x f2631w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2632x;

    /* renamed from: y, reason: collision with root package name */
    public C0166v f2633y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2634z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2617g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0148d i = new ViewTreeObserverOnGlobalLayoutListenerC0148d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final P0.n f2618j = new P0.n(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final C.h f2619k = new C.h(25, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2620l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2621m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2629u = false;

    public ViewOnKeyListenerC0151g(Context context, View view, int i, boolean z2) {
        this.f2613b = context;
        this.f2622n = view;
        this.d = i;
        this.f2615e = z2;
        this.f2624p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2614c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2616f = new Handler();
    }

    @Override // k.InterfaceC0142C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0150f) arrayList.get(0)).f2610a.f2845z.isShowing();
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
            } else if (menuC0157m == ((C0150f) arrayList.get(i)).f2611b) {
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
            ((C0150f) arrayList.get(i2)).f2611b.c(false);
        }
        C0150f c0150f = (C0150f) arrayList.remove(i);
        c0150f.f2611b.r(this);
        boolean z3 = this.f2634z;
        J0 j0 = c0150f.f2610a;
        if (z3) {
            G0.b(j0.f2845z, null);
            j0.f2845z.setAnimationStyle(0);
        }
        j0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2624p = ((C0150f) arrayList.get(size2 - 1)).f2612c;
        } else {
            this.f2624p = this.f2622n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0150f) arrayList.get(0)).f2611b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0168x interfaceC0168x = this.f2631w;
        if (interfaceC0168x != null) {
            interfaceC0168x.b(menuC0157m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2632x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2632x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2632x = null;
        }
        this.f2623o.removeOnAttachStateChangeListener(this.f2618j);
        this.f2633y.onDismiss();
    }

    @Override // k.InterfaceC0169y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0150f) it.next()).f2610a.f2825c.getAdapter();
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
                if (c0150f.f2610a.f2845z.isShowing()) {
                    c0150f.f2610a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0142C
    public final C0234r0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0150f) arrayList.get(arrayList.size() - 1)).f2610a.f2825c;
    }

    @Override // k.InterfaceC0169y
    public final boolean f(SubMenuC0144E subMenuC0144E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0150f c0150f = (C0150f) it.next();
            if (subMenuC0144E == c0150f.f2611b) {
                c0150f.f2610a.f2825c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0144E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0144E);
        InterfaceC0168x interfaceC0168x = this.f2631w;
        if (interfaceC0168x != null) {
            interfaceC0168x.g(subMenuC0144E);
        }
        return true;
    }

    @Override // k.InterfaceC0169y
    public final void g(InterfaceC0168x interfaceC0168x) {
        this.f2631w = interfaceC0168x;
    }

    @Override // k.InterfaceC0142C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2617g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0157m) it.next());
        }
        arrayList.clear();
        View view = this.f2622n;
        this.f2623o = view;
        if (view != null) {
            boolean z2 = this.f2632x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2632x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2623o.addOnAttachStateChangeListener(this.f2618j);
        }
    }

    @Override // k.InterfaceC0169y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0165u
    public final void l(MenuC0157m menuC0157m) {
        menuC0157m.b(this, this.f2613b);
        if (a()) {
            v(menuC0157m);
        } else {
            this.f2617g.add(menuC0157m);
        }
    }

    @Override // k.AbstractC0165u
    public final void n(View view) {
        if (this.f2622n != view) {
            this.f2622n = view;
            this.f2621m = Gravity.getAbsoluteGravity(this.f2620l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0165u
    public final void o(boolean z2) {
        this.f2629u = z2;
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
            if (!c0150f.f2610a.f2845z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0150f != null) {
            c0150f.f2611b.c(false);
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
        if (this.f2620l != i) {
            this.f2620l = i;
            this.f2621m = Gravity.getAbsoluteGravity(i, this.f2622n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0165u
    public final void q(int i) {
        this.f2625q = true;
        this.f2627s = i;
    }

    @Override // k.AbstractC0165u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2633y = (C0166v) onDismissListener;
    }

    @Override // k.AbstractC0165u
    public final void s(boolean z2) {
        this.f2630v = z2;
    }

    @Override // k.AbstractC0165u
    public final void t(int i) {
        this.f2626r = true;
        this.f2628t = i;
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
        Context context = this.f2613b;
        LayoutInflater from = LayoutInflater.from(context);
        C0154j c0154j2 = new C0154j(menuC0157m, from, this.f2615e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2629u) {
            c0154j2.f2644c = true;
        } else if (a()) {
            c0154j2.f2644c = AbstractC0165u.u(menuC0157m);
        }
        int m2 = AbstractC0165u.m(c0154j2, context, this.f2614c);
        J0 j0 = new J0(context, null, this.d);
        j0.f2861C = this.f2619k;
        j0.f2835p = this;
        j0.f2845z.setOnDismissListener(this);
        j0.f2834o = this.f2622n;
        j0.f2831l = this.f2621m;
        j0.f2844y = true;
        j0.f2845z.setFocusable(true);
        j0.f2845z.setInputMethodMode(2);
        j0.n(c0154j2);
        j0.q(m2);
        j0.f2831l = this.f2621m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0150f = (C0150f) arrayList.get(arrayList.size() - 1);
            MenuC0157m menuC0157m2 = c0150f.f2611b;
            int size = menuC0157m2.f2652f.size();
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
                C0234r0 c0234r0 = c0150f.f2610a.f2825c;
                ListAdapter adapter = c0234r0.getAdapter();
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
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0234r0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0234r0.getChildCount()) {
                    view = c0234r0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0181A c0181a = j0.f2845z;
                if (i6 <= 28) {
                    Method method = J0.f2860D;
                    if (method != null) {
                        try {
                            method.invoke(c0181a, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    H0.a(c0181a, false);
                }
                G0.a(j0.f2845z, null);
                C0234r0 c0234r02 = ((C0150f) arrayList.get(arrayList.size() - 1)).f2610a.f2825c;
                int[] iArr = new int[2];
                c0234r02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2623o.getWindowVisibleDisplayFrame(rect);
                if (this.f2624p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2624p = i2;
                j0.f2834o = view;
                if ((this.f2621m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                j0.f2827f = m2;
                j0.f2830k = true;
                j0.f2829j = true;
                j0.l(0);
            } else {
                if (this.f2625q) {
                    j0.f2827f = this.f2627s;
                }
                if (this.f2626r) {
                    j0.l(this.f2628t);
                }
                Rect rect2 = this.f2707a;
                j0.f2843x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0150f(j0, menuC0157m, this.f2624p));
            j0.i();
            C0234r0 c0234r03 = j0.f2825c;
            c0234r03.setOnKeyListener(this);
            if (c0150f == null || !this.f2630v || menuC0157m.f2657m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0234r03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0157m.f2657m);
            c0234r03.addHeaderView(frameLayout, null, false);
            j0.i();
            return;
        }
        c0150f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0150f(j0, menuC0157m, this.f2624p));
        j0.i();
        C0234r0 c0234r032 = j0.f2825c;
        c0234r032.setOnKeyListener(this);
        if (c0150f == null) {
        }
    }
}
