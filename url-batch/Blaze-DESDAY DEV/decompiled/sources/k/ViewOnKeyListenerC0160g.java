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
import com.winworm.neongrid.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0182B;
import l.C0236s0;
import l.H0;
import l.I0;
import l.K0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0160g extends AbstractC0174u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2678b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2679c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2680e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2681f;

    /* renamed from: n, reason: collision with root package name */
    public View f2687n;

    /* renamed from: o, reason: collision with root package name */
    public View f2688o;

    /* renamed from: p, reason: collision with root package name */
    public int f2689p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2690q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2691r;

    /* renamed from: s, reason: collision with root package name */
    public int f2692s;

    /* renamed from: t, reason: collision with root package name */
    public int f2693t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2695v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0177x f2696w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2697x;

    /* renamed from: y, reason: collision with root package name */
    public C0175v f2698y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2699z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2682g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0157d i = new ViewTreeObserverOnGlobalLayoutListenerC0157d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final M0.o f2683j = new M0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final C.g f2684k = new C.g(25, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2685l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2686m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2694u = false;

    public ViewOnKeyListenerC0160g(Context context, View view, int i, boolean z2) {
        this.f2678b = context;
        this.f2687n = view;
        this.d = i;
        this.f2680e = z2;
        this.f2689p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2679c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2681f = new Handler();
    }

    @Override // k.InterfaceC0151C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0159f) arrayList.get(0)).f2675a.f2830z.isShowing();
    }

    @Override // k.InterfaceC0178y
    public final void b(MenuC0166m menuC0166m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0166m == ((C0159f) arrayList.get(i)).f2676b) {
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
            ((C0159f) arrayList.get(i2)).f2676b.c(false);
        }
        C0159f c0159f = (C0159f) arrayList.remove(i);
        c0159f.f2676b.r(this);
        boolean z3 = this.f2699z;
        K0 k02 = c0159f.f2675a;
        if (z3) {
            H0.b(k02.f2830z, null);
            k02.f2830z.setAnimationStyle(0);
        }
        k02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2689p = ((C0159f) arrayList.get(size2 - 1)).f2677c;
        } else {
            this.f2689p = this.f2687n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0159f) arrayList.get(0)).f2676b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0177x interfaceC0177x = this.f2696w;
        if (interfaceC0177x != null) {
            interfaceC0177x.b(menuC0166m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2697x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2697x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2697x = null;
        }
        this.f2688o.removeOnAttachStateChangeListener(this.f2683j);
        this.f2698y.onDismiss();
    }

    @Override // k.InterfaceC0178y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0159f) it.next()).f2675a.f2810c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0163j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0151C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0159f[] c0159fArr = (C0159f[]) arrayList.toArray(new C0159f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0159f c0159f = c0159fArr[i];
                if (c0159f.f2675a.f2830z.isShowing()) {
                    c0159f.f2675a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0151C
    public final C0236s0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0159f) arrayList.get(arrayList.size() - 1)).f2675a.f2810c;
    }

    @Override // k.InterfaceC0178y
    public final boolean f(SubMenuC0153E subMenuC0153E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0159f c0159f = (C0159f) it.next();
            if (subMenuC0153E == c0159f.f2676b) {
                c0159f.f2675a.f2810c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0153E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0153E);
        InterfaceC0177x interfaceC0177x = this.f2696w;
        if (interfaceC0177x != null) {
            interfaceC0177x.g(subMenuC0153E);
        }
        return true;
    }

    @Override // k.InterfaceC0178y
    public final void g(InterfaceC0177x interfaceC0177x) {
        this.f2696w = interfaceC0177x;
    }

    @Override // k.InterfaceC0151C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2682g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0166m) it.next());
        }
        arrayList.clear();
        View view = this.f2687n;
        this.f2688o = view;
        if (view != null) {
            boolean z2 = this.f2697x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2697x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2688o.addOnAttachStateChangeListener(this.f2683j);
        }
    }

    @Override // k.InterfaceC0178y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0174u
    public final void l(MenuC0166m menuC0166m) {
        menuC0166m.b(this, this.f2678b);
        if (a()) {
            v(menuC0166m);
        } else {
            this.f2682g.add(menuC0166m);
        }
    }

    @Override // k.AbstractC0174u
    public final void n(View view) {
        if (this.f2687n != view) {
            this.f2687n = view;
            this.f2686m = Gravity.getAbsoluteGravity(this.f2685l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0174u
    public final void o(boolean z2) {
        this.f2694u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0159f c0159f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0159f = null;
                break;
            }
            c0159f = (C0159f) arrayList.get(i);
            if (!c0159f.f2675a.f2830z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0159f != null) {
            c0159f.f2676b.c(false);
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

    @Override // k.AbstractC0174u
    public final void p(int i) {
        if (this.f2685l != i) {
            this.f2685l = i;
            this.f2686m = Gravity.getAbsoluteGravity(i, this.f2687n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0174u
    public final void q(int i) {
        this.f2690q = true;
        this.f2692s = i;
    }

    @Override // k.AbstractC0174u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2698y = (C0175v) onDismissListener;
    }

    @Override // k.AbstractC0174u
    public final void s(boolean z2) {
        this.f2695v = z2;
    }

    @Override // k.AbstractC0174u
    public final void t(int i) {
        this.f2691r = true;
        this.f2693t = i;
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
    public final void v(MenuC0166m menuC0166m) {
        C0159f c0159f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0163j c0163j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2678b;
        LayoutInflater from = LayoutInflater.from(context);
        C0163j c0163j2 = new C0163j(menuC0166m, from, this.f2680e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2694u) {
            c0163j2.f2709c = true;
        } else if (a()) {
            c0163j2.f2709c = AbstractC0174u.u(menuC0166m);
        }
        int m2 = AbstractC0174u.m(c0163j2, context, this.f2679c);
        K0 k02 = new K0(context, null, this.d);
        k02.f2846C = this.f2684k;
        k02.f2820p = this;
        k02.f2830z.setOnDismissListener(this);
        k02.f2819o = this.f2687n;
        k02.f2816l = this.f2686m;
        k02.f2829y = true;
        k02.f2830z.setFocusable(true);
        k02.f2830z.setInputMethodMode(2);
        k02.n(c0163j2);
        k02.q(m2);
        k02.f2816l = this.f2686m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0159f = (C0159f) arrayList.get(arrayList.size() - 1);
            MenuC0166m menuC0166m2 = c0159f.f2676b;
            int size = menuC0166m2.f2717f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0166m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0166m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0236s0 c0236s0 = c0159f.f2675a.f2810c;
                ListAdapter adapter = c0236s0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0163j = (C0163j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0163j = (C0163j) adapter;
                    i3 = 0;
                }
                int count = c0163j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0163j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0236s0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0236s0.getChildCount()) {
                    view = c0236s0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0182B c0182b = k02.f2830z;
                if (i6 <= 28) {
                    Method method = K0.f2845D;
                    if (method != null) {
                        try {
                            method.invoke(c0182b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    I0.a(c0182b, false);
                }
                H0.a(k02.f2830z, null);
                C0236s0 c0236s02 = ((C0159f) arrayList.get(arrayList.size() - 1)).f2675a.f2810c;
                int[] iArr = new int[2];
                c0236s02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2688o.getWindowVisibleDisplayFrame(rect);
                if (this.f2689p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2689p = i2;
                k02.f2819o = view;
                if ((this.f2686m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                k02.f2812f = m2;
                k02.f2815k = true;
                k02.f2814j = true;
                k02.l(0);
            } else {
                if (this.f2690q) {
                    k02.f2812f = this.f2692s;
                }
                if (this.f2691r) {
                    k02.l(this.f2693t);
                }
                Rect rect2 = this.f2772a;
                k02.f2828x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0159f(k02, menuC0166m, this.f2689p));
            k02.i();
            C0236s0 c0236s03 = k02.f2810c;
            c0236s03.setOnKeyListener(this);
            if (c0159f == null || !this.f2695v || menuC0166m.f2722m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0236s03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0166m.f2722m);
            c0236s03.addHeaderView(frameLayout, null, false);
            k02.i();
            return;
        }
        c0159f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0159f(k02, menuC0166m, this.f2689p));
        k02.i();
        C0236s0 c0236s032 = k02.f2810c;
        c0236s032.setOnKeyListener(this);
        if (c0159f == null) {
        }
    }
}
