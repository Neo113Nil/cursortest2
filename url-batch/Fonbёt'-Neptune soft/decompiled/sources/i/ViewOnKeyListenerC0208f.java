package i;

import A.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.neptunesoft.languesbacdz.R;
import j.C0242s;
import j.N;
import j.O;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0208f extends AbstractC0213k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC0216n f2377A;

    /* renamed from: B, reason: collision with root package name */
    public ViewTreeObserver f2378B;

    /* renamed from: C, reason: collision with root package name */
    public C0214l f2379C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2380D;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2381f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2382g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2383h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2384i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f2385j;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0205c f2388m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0206d f2389n;

    /* renamed from: r, reason: collision with root package name */
    public View f2393r;

    /* renamed from: s, reason: collision with root package name */
    public View f2394s;

    /* renamed from: t, reason: collision with root package name */
    public int f2395t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2396u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public int f2397w;

    /* renamed from: x, reason: collision with root package name */
    public int f2398x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2400z;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2386k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2387l = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final B.m f2390o = new B.m(21, this);

    /* renamed from: p, reason: collision with root package name */
    public int f2391p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2392q = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2399y = false;

    public ViewOnKeyListenerC0208f(Context context, View view, int i2, boolean z2) {
        this.f2388m = new ViewTreeObserverOnGlobalLayoutListenerC0205c(this, r0);
        this.f2389n = new ViewOnAttachStateChangeListenerC0206d(this, r0);
        this.f2381f = context;
        this.f2393r = view;
        this.f2383h = i2;
        this.f2384i = z2;
        Field field = z.f58a;
        this.f2395t = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2382g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2385j = new Handler();
    }

    @Override // i.InterfaceC0217o
    public final void a(MenuC0211i menuC0211i, boolean z2) {
        ArrayList arrayList = this.f2387l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0211i == ((C0207e) arrayList.get(i2)).f2375b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0207e) arrayList.get(i3)).f2375b.c(false);
        }
        C0207e c0207e = (C0207e) arrayList.remove(i2);
        CopyOnWriteArrayList copyOnWriteArrayList = c0207e.f2375b.f2425r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0217o interfaceC0217o = (InterfaceC0217o) weakReference.get();
            if (interfaceC0217o == null || interfaceC0217o == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f2380D;
        O o2 = c0207e.f2374a;
        if (z3) {
            if (Build.VERSION.SDK_INT >= 23) {
                o2.f2896z.setExitTransition(null);
            }
            o2.f2896z.setAnimationStyle(0);
        }
        o2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2395t = ((C0207e) arrayList.get(size2 - 1)).f2376c;
        } else {
            View view = this.f2393r;
            Field field = z.f58a;
            this.f2395t = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0207e) arrayList.get(0)).f2375b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0216n interfaceC0216n = this.f2377A;
        if (interfaceC0216n != null) {
            interfaceC0216n.a(menuC0211i, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2378B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2378B.removeGlobalOnLayoutListener(this.f2388m);
            }
            this.f2378B = null;
        }
        this.f2394s.removeOnAttachStateChangeListener(this.f2389n);
        this.f2379C.onDismiss();
    }

    @Override // i.InterfaceC0219q
    public final void c() {
        if (i()) {
            return;
        }
        ArrayList arrayList = this.f2386k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0211i) it.next());
        }
        arrayList.clear();
        View view = this.f2393r;
        this.f2394s = view;
        if (view != null) {
            boolean z2 = this.f2378B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2378B = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2388m);
            }
            this.f2394s.addOnAttachStateChangeListener(this.f2389n);
        }
    }

    @Override // i.InterfaceC0217o
    public final boolean d() {
        return false;
    }

    @Override // i.InterfaceC0219q
    public final void dismiss() {
        ArrayList arrayList = this.f2387l;
        int size = arrayList.size();
        if (size > 0) {
            C0207e[] c0207eArr = (C0207e[]) arrayList.toArray(new C0207e[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0207e c0207e = c0207eArr[i2];
                if (c0207e.f2374a.f2896z.isShowing()) {
                    c0207e.f2374a.dismiss();
                }
            }
        }
    }

    @Override // i.InterfaceC0217o
    public final void f(InterfaceC0216n interfaceC0216n) {
        this.f2377A = interfaceC0216n;
    }

    @Override // i.InterfaceC0217o
    public final void h() {
        Iterator it = this.f2387l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0207e) it.next()).f2374a.f2878g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0209g) adapter).notifyDataSetChanged();
        }
    }

    @Override // i.InterfaceC0219q
    public final boolean i() {
        ArrayList arrayList = this.f2387l;
        return arrayList.size() > 0 && ((C0207e) arrayList.get(0)).f2374a.f2896z.isShowing();
    }

    @Override // i.InterfaceC0219q
    public final ListView j() {
        ArrayList arrayList = this.f2387l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0207e) arrayList.get(arrayList.size() - 1)).f2374a.f2878g;
    }

    @Override // i.InterfaceC0217o
    public final boolean k(SubMenuC0221s subMenuC0221s) {
        Iterator it = this.f2387l.iterator();
        while (it.hasNext()) {
            C0207e c0207e = (C0207e) it.next();
            if (subMenuC0221s == c0207e.f2375b) {
                c0207e.f2374a.f2878g.requestFocus();
                return true;
            }
        }
        if (!subMenuC0221s.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0221s);
        InterfaceC0216n interfaceC0216n = this.f2377A;
        if (interfaceC0216n != null) {
            interfaceC0216n.b(subMenuC0221s);
        }
        return true;
    }

    @Override // i.AbstractC0213k
    public final void l(MenuC0211i menuC0211i) {
        menuC0211i.b(this, this.f2381f);
        if (i()) {
            v(menuC0211i);
        } else {
            this.f2386k.add(menuC0211i);
        }
    }

    @Override // i.AbstractC0213k
    public final void n(View view) {
        if (this.f2393r != view) {
            this.f2393r = view;
            int i2 = this.f2391p;
            Field field = z.f58a;
            this.f2392q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // i.AbstractC0213k
    public final void o(boolean z2) {
        this.f2399y = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0207e c0207e;
        ArrayList arrayList = this.f2387l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0207e = null;
                break;
            }
            c0207e = (C0207e) arrayList.get(i2);
            if (!c0207e.f2374a.f2896z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0207e != null) {
            c0207e.f2375b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // i.AbstractC0213k
    public final void p(int i2) {
        if (this.f2391p != i2) {
            this.f2391p = i2;
            View view = this.f2393r;
            Field field = z.f58a;
            this.f2392q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // i.AbstractC0213k
    public final void q(int i2) {
        this.f2396u = true;
        this.f2397w = i2;
    }

    @Override // i.AbstractC0213k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2379C = (C0214l) onDismissListener;
    }

    @Override // i.AbstractC0213k
    public final void s(boolean z2) {
        this.f2400z = z2;
    }

    @Override // i.AbstractC0213k
    public final void t(int i2) {
        this.v = true;
        this.f2398x = i2;
    }

    public final void v(MenuC0211i menuC0211i) {
        View view;
        C0207e c0207e;
        char c2;
        int i2;
        int i3;
        MenuItem menuItem;
        C0209g c0209g;
        int i4;
        int i5;
        int firstVisiblePosition;
        Context context = this.f2381f;
        LayoutInflater from = LayoutInflater.from(context);
        C0209g c0209g2 = new C0209g(menuC0211i, from, this.f2384i, R.layout.abc_cascading_menu_item_layout);
        if (!i() && this.f2399y) {
            c0209g2.f2403g = true;
        } else if (i()) {
            c0209g2.f2403g = AbstractC0213k.u(menuC0211i);
        }
        int m2 = AbstractC0213k.m(c0209g2, context, this.f2382g);
        O o2 = new O(context, this.f2383h);
        C0242s c0242s = o2.f2896z;
        o2.f2902D = this.f2390o;
        o2.f2888q = this;
        c0242s.setOnDismissListener(this);
        o2.f2887p = this.f2393r;
        o2.f2885n = this.f2392q;
        o2.f2895y = true;
        c0242s.setFocusable(true);
        c0242s.setInputMethodMode(2);
        o2.a(c0209g2);
        Drawable background = c0242s.getBackground();
        if (background != null) {
            Rect rect = o2.f2893w;
            background.getPadding(rect);
            o2.f2879h = rect.left + rect.right + m2;
        } else {
            o2.f2879h = m2;
        }
        o2.f2885n = this.f2392q;
        ArrayList arrayList = this.f2387l;
        if (arrayList.size() > 0) {
            c0207e = (C0207e) arrayList.get(arrayList.size() - 1);
            MenuC0211i menuC0211i2 = c0207e.f2375b;
            int size = menuC0211i2.f2413f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0211i2.getItem(i6);
                if (menuItem.hasSubMenu() && menuC0211i == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem != null) {
                N n2 = c0207e.f2374a.f2878g;
                ListAdapter adapter = n2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    c0209g = (C0209g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0209g = (C0209g) adapter;
                    i4 = 0;
                }
                int count = c0209g.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i5 = -1;
                        i7 = -1;
                        break;
                    } else {
                        if (menuItem == c0209g.getItem(i7)) {
                            i5 = -1;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != i5 && (firstVisiblePosition = (i7 + i4) - n2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < n2.getChildCount()) {
                    view = n2.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            c0207e = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = O.f2901E;
                if (method != null) {
                    try {
                        method.invoke(c0242s, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                c0242s.setTouchModal(false);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 23) {
                c0242s.setEnterTransition(null);
            }
            N n3 = ((C0207e) arrayList.get(arrayList.size() - 1)).f2374a.f2878g;
            int[] iArr = new int[2];
            n3.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f2394s.getWindowVisibleDisplayFrame(rect2);
            int i9 = (this.f2395t != 1 ? iArr[0] - m2 >= 0 : (n3.getWidth() + iArr[0]) + m2 > rect2.right) ? 0 : 1;
            boolean z2 = i9 == 1;
            this.f2395t = i9;
            if (i8 >= 26) {
                o2.f2887p = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f2393r.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f2392q & 7) == 5) {
                    c2 = 0;
                    iArr2[0] = this.f2393r.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c2 = 0;
                }
                i2 = iArr3[c2] - iArr2[c2];
                i3 = iArr3[1] - iArr2[1];
            }
            o2.f2880i = (this.f2392q & 5) == 5 ? z2 ? i2 + m2 : i2 - view.getWidth() : z2 ? i2 + view.getWidth() : i2 - m2;
            o2.f2884m = true;
            o2.f2883l = true;
            o2.f2881j = i3;
            o2.f2882k = true;
        } else {
            if (this.f2396u) {
                o2.f2880i = this.f2397w;
            }
            if (this.v) {
                o2.f2881j = this.f2398x;
                o2.f2882k = true;
            }
            Rect rect3 = this.f2455e;
            o2.f2894x = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C0207e(o2, menuC0211i, this.f2395t));
        o2.c();
        N n4 = o2.f2878g;
        n4.setOnKeyListener(this);
        if (c0207e == null && this.f2400z && menuC0211i.f2419l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n4, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0211i.f2419l);
            n4.addHeaderView(frameLayout, null, false);
            o2.c();
        }
    }
}
