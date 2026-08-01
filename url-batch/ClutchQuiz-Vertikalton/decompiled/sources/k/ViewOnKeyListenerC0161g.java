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
import com.clutchquizarena.app.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0182A;
import l.C0236r0;
import l.G0;
import l.H0;
import l.J0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0161g extends AbstractC0175u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2712c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2713e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2714f;

    /* renamed from: n, reason: collision with root package name */
    public View f2720n;

    /* renamed from: o, reason: collision with root package name */
    public View f2721o;

    /* renamed from: p, reason: collision with root package name */
    public int f2722p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2723q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2724r;

    /* renamed from: s, reason: collision with root package name */
    public int f2725s;

    /* renamed from: t, reason: collision with root package name */
    public int f2726t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2728v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0178x f2729w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2730x;

    /* renamed from: y, reason: collision with root package name */
    public C0176v f2731y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2732z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2715g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0158d i = new ViewTreeObserverOnGlobalLayoutListenerC0158d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final R0.n f2716j = new R0.n(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final A0.h f2717k = new A0.h(24, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2718l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2719m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2727u = false;

    public ViewOnKeyListenerC0161g(Context context, View view, int i, boolean z2) {
        this.f2711b = context;
        this.f2720n = view;
        this.d = i;
        this.f2713e = z2;
        this.f2722p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2712c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2714f = new Handler();
    }

    @Override // k.InterfaceC0152C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0160f) arrayList.get(0)).f2708a.f2860z.isShowing();
    }

    @Override // k.InterfaceC0179y
    public final void b(MenuC0167m menuC0167m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0167m == ((C0160f) arrayList.get(i)).f2709b) {
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
            ((C0160f) arrayList.get(i2)).f2709b.c(false);
        }
        C0160f c0160f = (C0160f) arrayList.remove(i);
        c0160f.f2709b.r(this);
        boolean z3 = this.f2732z;
        J0 j02 = c0160f.f2708a;
        if (z3) {
            G0.b(j02.f2860z, null);
            j02.f2860z.setAnimationStyle(0);
        }
        j02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2722p = ((C0160f) arrayList.get(size2 - 1)).f2710c;
        } else {
            this.f2722p = this.f2720n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0160f) arrayList.get(0)).f2709b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0178x interfaceC0178x = this.f2729w;
        if (interfaceC0178x != null) {
            interfaceC0178x.b(menuC0167m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2730x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2730x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2730x = null;
        }
        this.f2721o.removeOnAttachStateChangeListener(this.f2716j);
        this.f2731y.onDismiss();
    }

    @Override // k.InterfaceC0179y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0160f) it.next()).f2708a.f2840c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0164j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0152C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0160f[] c0160fArr = (C0160f[]) arrayList.toArray(new C0160f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0160f c0160f = c0160fArr[i];
                if (c0160f.f2708a.f2860z.isShowing()) {
                    c0160f.f2708a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0152C
    public final C0236r0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0160f) arrayList.get(arrayList.size() - 1)).f2708a.f2840c;
    }

    @Override // k.InterfaceC0179y
    public final boolean f(SubMenuC0154E subMenuC0154E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0160f c0160f = (C0160f) it.next();
            if (subMenuC0154E == c0160f.f2709b) {
                c0160f.f2708a.f2840c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0154E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0154E);
        InterfaceC0178x interfaceC0178x = this.f2729w;
        if (interfaceC0178x != null) {
            interfaceC0178x.g(subMenuC0154E);
        }
        return true;
    }

    @Override // k.InterfaceC0179y
    public final void g(InterfaceC0178x interfaceC0178x) {
        this.f2729w = interfaceC0178x;
    }

    @Override // k.InterfaceC0152C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2715g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0167m) it.next());
        }
        arrayList.clear();
        View view = this.f2720n;
        this.f2721o = view;
        if (view != null) {
            boolean z2 = this.f2730x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2730x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2721o.addOnAttachStateChangeListener(this.f2716j);
        }
    }

    @Override // k.InterfaceC0179y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0175u
    public final void l(MenuC0167m menuC0167m) {
        menuC0167m.b(this, this.f2711b);
        if (a()) {
            v(menuC0167m);
        } else {
            this.f2715g.add(menuC0167m);
        }
    }

    @Override // k.AbstractC0175u
    public final void n(View view) {
        if (this.f2720n != view) {
            this.f2720n = view;
            this.f2719m = Gravity.getAbsoluteGravity(this.f2718l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0175u
    public final void o(boolean z2) {
        this.f2727u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0160f c0160f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0160f = null;
                break;
            }
            c0160f = (C0160f) arrayList.get(i);
            if (!c0160f.f2708a.f2860z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0160f != null) {
            c0160f.f2709b.c(false);
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

    @Override // k.AbstractC0175u
    public final void p(int i) {
        if (this.f2718l != i) {
            this.f2718l = i;
            this.f2719m = Gravity.getAbsoluteGravity(i, this.f2720n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0175u
    public final void q(int i) {
        this.f2723q = true;
        this.f2725s = i;
    }

    @Override // k.AbstractC0175u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2731y = (C0176v) onDismissListener;
    }

    @Override // k.AbstractC0175u
    public final void s(boolean z2) {
        this.f2728v = z2;
    }

    @Override // k.AbstractC0175u
    public final void t(int i) {
        this.f2724r = true;
        this.f2726t = i;
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
    public final void v(MenuC0167m menuC0167m) {
        C0160f c0160f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0164j c0164j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2711b;
        LayoutInflater from = LayoutInflater.from(context);
        C0164j c0164j2 = new C0164j(menuC0167m, from, this.f2713e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2727u) {
            c0164j2.f2742c = true;
        } else if (a()) {
            c0164j2.f2742c = AbstractC0175u.u(menuC0167m);
        }
        int m2 = AbstractC0175u.m(c0164j2, context, this.f2712c);
        J0 j02 = new J0(context, null, this.d);
        j02.f2876C = this.f2717k;
        j02.f2850p = this;
        j02.f2860z.setOnDismissListener(this);
        j02.f2849o = this.f2720n;
        j02.f2846l = this.f2719m;
        j02.f2859y = true;
        j02.f2860z.setFocusable(true);
        j02.f2860z.setInputMethodMode(2);
        j02.n(c0164j2);
        j02.q(m2);
        j02.f2846l = this.f2719m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0160f = (C0160f) arrayList.get(arrayList.size() - 1);
            MenuC0167m menuC0167m2 = c0160f.f2709b;
            int size = menuC0167m2.f2750f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0167m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0167m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0236r0 c0236r0 = c0160f.f2708a.f2840c;
                ListAdapter adapter = c0236r0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0164j = (C0164j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0164j = (C0164j) adapter;
                    i3 = 0;
                }
                int count = c0164j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0164j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0236r0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0236r0.getChildCount()) {
                    view = c0236r0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0182A c0182a = j02.f2860z;
                if (i6 <= 28) {
                    Method method = J0.f2875D;
                    if (method != null) {
                        try {
                            method.invoke(c0182a, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    H0.a(c0182a, false);
                }
                G0.a(j02.f2860z, null);
                C0236r0 c0236r02 = ((C0160f) arrayList.get(arrayList.size() - 1)).f2708a.f2840c;
                int[] iArr = new int[2];
                c0236r02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2721o.getWindowVisibleDisplayFrame(rect);
                if (this.f2722p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2722p = i2;
                j02.f2849o = view;
                if ((this.f2719m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                j02.f2842f = m2;
                j02.f2845k = true;
                j02.f2844j = true;
                j02.l(0);
            } else {
                if (this.f2723q) {
                    j02.f2842f = this.f2725s;
                }
                if (this.f2724r) {
                    j02.l(this.f2726t);
                }
                Rect rect2 = this.f2805a;
                j02.f2858x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0160f(j02, menuC0167m, this.f2722p));
            j02.i();
            C0236r0 c0236r03 = j02.f2840c;
            c0236r03.setOnKeyListener(this);
            if (c0160f == null || !this.f2728v || menuC0167m.f2755m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0236r03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0167m.f2755m);
            c0236r03.addHeaderView(frameLayout, null, false);
            j02.i();
            return;
        }
        c0160f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0160f(j02, menuC0167m, this.f2722p));
        j02.i();
        C0236r0 c0236r032 = j02.f2840c;
        c0236r032.setOnKeyListener(this);
        if (c0160f == null) {
        }
    }
}
