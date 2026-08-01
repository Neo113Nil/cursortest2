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
import com.playbag.tripgear.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0178A;
import l.C0233s0;
import l.H0;
import l.I0;
import l.K0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0158g extends AbstractC0172u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2651c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2652e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2653f;

    /* renamed from: n, reason: collision with root package name */
    public View f2659n;

    /* renamed from: o, reason: collision with root package name */
    public View f2660o;

    /* renamed from: p, reason: collision with root package name */
    public int f2661p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2662q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2663r;

    /* renamed from: s, reason: collision with root package name */
    public int f2664s;

    /* renamed from: t, reason: collision with root package name */
    public int f2665t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2667v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0175x f2668w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2669x;

    /* renamed from: y, reason: collision with root package name */
    public C0173v f2670y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2671z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2654g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0155d i = new ViewTreeObserverOnGlobalLayoutListenerC0155d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final M0.o f2655j = new M0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final C.g f2656k = new C.g(26, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2657l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2658m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2666u = false;

    public ViewOnKeyListenerC0158g(Context context, View view, int i, boolean z2) {
        this.f2650b = context;
        this.f2659n = view;
        this.d = i;
        this.f2652e = z2;
        this.f2661p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2651c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2653f = new Handler();
    }

    @Override // k.InterfaceC0149C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0157f) arrayList.get(0)).f2647a.f2804z.isShowing();
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0164m == ((C0157f) arrayList.get(i)).f2648b) {
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
            ((C0157f) arrayList.get(i2)).f2648b.c(false);
        }
        C0157f c0157f = (C0157f) arrayList.remove(i);
        c0157f.f2648b.r(this);
        boolean z3 = this.f2671z;
        K0 k0 = c0157f.f2647a;
        if (z3) {
            H0.b(k0.f2804z, null);
            k0.f2804z.setAnimationStyle(0);
        }
        k0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2661p = ((C0157f) arrayList.get(size2 - 1)).f2649c;
        } else {
            this.f2661p = this.f2659n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0157f) arrayList.get(0)).f2648b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0175x interfaceC0175x = this.f2668w;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2669x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2669x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2669x = null;
        }
        this.f2660o.removeOnAttachStateChangeListener(this.f2655j);
        this.f2670y.onDismiss();
    }

    @Override // k.InterfaceC0176y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0157f) it.next()).f2647a.f2784c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0161j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0149C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0157f[] c0157fArr = (C0157f[]) arrayList.toArray(new C0157f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0157f c0157f = c0157fArr[i];
                if (c0157f.f2647a.f2804z.isShowing()) {
                    c0157f.f2647a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean e(SubMenuC0151E subMenuC0151E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0157f c0157f = (C0157f) it.next();
            if (subMenuC0151E == c0157f.f2648b) {
                c0157f.f2647a.f2784c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0151E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0151E);
        InterfaceC0175x interfaceC0175x = this.f2668w;
        if (interfaceC0175x != null) {
            interfaceC0175x.f(subMenuC0151E);
        }
        return true;
    }

    @Override // k.InterfaceC0149C
    public final C0233s0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0157f) arrayList.get(arrayList.size() - 1)).f2647a.f2784c;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        this.f2668w = interfaceC0175x;
    }

    @Override // k.InterfaceC0149C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2654g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0164m) it.next());
        }
        arrayList.clear();
        View view = this.f2659n;
        this.f2660o = view;
        if (view != null) {
            boolean z2 = this.f2669x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2669x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2660o.addOnAttachStateChangeListener(this.f2655j);
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0172u
    public final void l(MenuC0164m menuC0164m) {
        menuC0164m.b(this, this.f2650b);
        if (a()) {
            v(menuC0164m);
        } else {
            this.f2654g.add(menuC0164m);
        }
    }

    @Override // k.AbstractC0172u
    public final void n(View view) {
        if (this.f2659n != view) {
            this.f2659n = view;
            this.f2658m = Gravity.getAbsoluteGravity(this.f2657l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0172u
    public final void o(boolean z2) {
        this.f2666u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0157f c0157f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0157f = null;
                break;
            }
            c0157f = (C0157f) arrayList.get(i);
            if (!c0157f.f2647a.f2804z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0157f != null) {
            c0157f.f2648b.c(false);
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

    @Override // k.AbstractC0172u
    public final void p(int i) {
        if (this.f2657l != i) {
            this.f2657l = i;
            this.f2658m = Gravity.getAbsoluteGravity(i, this.f2659n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0172u
    public final void q(int i) {
        this.f2662q = true;
        this.f2664s = i;
    }

    @Override // k.AbstractC0172u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2670y = (C0173v) onDismissListener;
    }

    @Override // k.AbstractC0172u
    public final void s(boolean z2) {
        this.f2667v = z2;
    }

    @Override // k.AbstractC0172u
    public final void t(int i) {
        this.f2663r = true;
        this.f2665t = i;
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
    public final void v(MenuC0164m menuC0164m) {
        C0157f c0157f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0161j c0161j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2650b;
        LayoutInflater from = LayoutInflater.from(context);
        C0161j c0161j2 = new C0161j(menuC0164m, from, this.f2652e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2666u) {
            c0161j2.f2681c = true;
        } else if (a()) {
            c0161j2.f2681c = AbstractC0172u.u(menuC0164m);
        }
        int m2 = AbstractC0172u.m(c0161j2, context, this.f2651c);
        K0 k0 = new K0(context, null, this.d);
        k0.f2821C = this.f2656k;
        k0.f2794p = this;
        k0.f2804z.setOnDismissListener(this);
        k0.f2793o = this.f2659n;
        k0.f2790l = this.f2658m;
        k0.f2803y = true;
        k0.f2804z.setFocusable(true);
        k0.f2804z.setInputMethodMode(2);
        k0.n(c0161j2);
        k0.q(m2);
        k0.f2790l = this.f2658m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0157f = (C0157f) arrayList.get(arrayList.size() - 1);
            MenuC0164m menuC0164m2 = c0157f.f2648b;
            int size = menuC0164m2.f2689f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0164m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0164m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0233s0 c0233s0 = c0157f.f2647a.f2784c;
                ListAdapter adapter = c0233s0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0161j = (C0161j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0161j = (C0161j) adapter;
                    i3 = 0;
                }
                int count = c0161j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0161j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0233s0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0233s0.getChildCount()) {
                    view = c0233s0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0178A c0178a = k0.f2804z;
                if (i6 <= 28) {
                    Method method = K0.f2820D;
                    if (method != null) {
                        try {
                            method.invoke(c0178a, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    I0.a(c0178a, false);
                }
                H0.a(k0.f2804z, null);
                C0233s0 c0233s02 = ((C0157f) arrayList.get(arrayList.size() - 1)).f2647a.f2784c;
                int[] iArr = new int[2];
                c0233s02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2660o.getWindowVisibleDisplayFrame(rect);
                if (this.f2661p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2661p = i2;
                k0.f2793o = view;
                if ((this.f2658m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                k0.f2786f = m2;
                k0.f2789k = true;
                k0.f2788j = true;
                k0.l(0);
            } else {
                if (this.f2662q) {
                    k0.f2786f = this.f2664s;
                }
                if (this.f2663r) {
                    k0.l(this.f2665t);
                }
                Rect rect2 = this.f2744a;
                k0.f2802x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0157f(k0, menuC0164m, this.f2661p));
            k0.i();
            C0233s0 c0233s03 = k0.f2784c;
            c0233s03.setOnKeyListener(this);
            if (c0157f == null || !this.f2667v || menuC0164m.f2694m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0233s03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0164m.f2694m);
            c0233s03.addHeaderView(frameLayout, null, false);
            k0.i();
            return;
        }
        c0157f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0157f(k0, menuC0164m, this.f2661p));
        k0.i();
        C0233s0 c0233s032 = k0.f2784c;
        c0233s032.setOnKeyListener(this);
        if (c0157f == null) {
        }
    }
}
