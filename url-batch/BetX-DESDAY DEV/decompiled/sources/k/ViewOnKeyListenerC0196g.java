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
import com.luckyarcade.spinthrow.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0234C;
import l.C0289t0;
import l.I0;
import l.J0;
import l.L0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0196g extends AbstractC0210u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3023b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3024c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3025d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3026e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3027f;

    /* renamed from: n, reason: collision with root package name */
    public View f3033n;

    /* renamed from: o, reason: collision with root package name */
    public View f3034o;

    /* renamed from: p, reason: collision with root package name */
    public int f3035p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3036q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3037r;

    /* renamed from: s, reason: collision with root package name */
    public int f3038s;

    /* renamed from: t, reason: collision with root package name */
    public int f3039t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3041v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0213x f3042w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f3043x;

    /* renamed from: y, reason: collision with root package name */
    public C0211v f3044y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3045z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3028g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0193d i = new ViewTreeObserverOnGlobalLayoutListenerC0193d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f3029j = new K0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final B0.d f3030k = new B0.d(25, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3031l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3032m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3040u = false;

    public ViewOnKeyListenerC0196g(Context context, View view, int i, boolean z2) {
        this.f3023b = context;
        this.f3033n = view;
        this.f3025d = i;
        this.f3026e = z2;
        this.f3035p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3024c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3027f = new Handler();
    }

    @Override // k.InterfaceC0187C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0195f) arrayList.get(0)).f3020a.f3252z.isShowing();
    }

    @Override // k.InterfaceC0214y
    public final void b(MenuC0202m menuC0202m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0202m == ((C0195f) arrayList.get(i)).f3021b) {
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
            ((C0195f) arrayList.get(i2)).f3021b.c(false);
        }
        C0195f c0195f = (C0195f) arrayList.remove(i);
        c0195f.f3021b.r(this);
        boolean z3 = this.f3045z;
        L0 l02 = c0195f.f3020a;
        if (z3) {
            I0.b(l02.f3252z, null);
            l02.f3252z.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3035p = ((C0195f) arrayList.get(size2 - 1)).f3022c;
        } else {
            this.f3035p = this.f3033n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0195f) arrayList.get(0)).f3021b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0213x interfaceC0213x = this.f3042w;
        if (interfaceC0213x != null) {
            interfaceC0213x.b(menuC0202m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3043x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3043x.removeGlobalOnLayoutListener(this.i);
            }
            this.f3043x = null;
        }
        this.f3034o.removeOnAttachStateChangeListener(this.f3029j);
        this.f3044y.onDismiss();
    }

    @Override // k.InterfaceC0214y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0195f) it.next()).f3020a.f3231c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0199j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0187C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0195f[] c0195fArr = (C0195f[]) arrayList.toArray(new C0195f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0195f c0195f = c0195fArr[i];
                if (c0195f.f3020a.f3252z.isShowing()) {
                    c0195f.f3020a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0187C
    public final C0289t0 e() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0195f) arrayList.get(arrayList.size() - 1)).f3020a.f3231c;
    }

    @Override // k.InterfaceC0214y
    public final boolean f(SubMenuC0189E subMenuC0189E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0195f c0195f = (C0195f) it.next();
            if (subMenuC0189E == c0195f.f3021b) {
                c0195f.f3020a.f3231c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0189E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0189E);
        InterfaceC0213x interfaceC0213x = this.f3042w;
        if (interfaceC0213x != null) {
            interfaceC0213x.g(subMenuC0189E);
        }
        return true;
    }

    @Override // k.InterfaceC0214y
    public final void g(InterfaceC0213x interfaceC0213x) {
        this.f3042w = interfaceC0213x;
    }

    @Override // k.InterfaceC0187C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f3028g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0202m) it.next());
        }
        arrayList.clear();
        View view = this.f3033n;
        this.f3034o = view;
        if (view != null) {
            boolean z2 = this.f3043x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3043x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f3034o.addOnAttachStateChangeListener(this.f3029j);
        }
    }

    @Override // k.InterfaceC0214y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0210u
    public final void l(MenuC0202m menuC0202m) {
        menuC0202m.b(this, this.f3023b);
        if (a()) {
            v(menuC0202m);
        } else {
            this.f3028g.add(menuC0202m);
        }
    }

    @Override // k.AbstractC0210u
    public final void n(View view) {
        if (this.f3033n != view) {
            this.f3033n = view;
            this.f3032m = Gravity.getAbsoluteGravity(this.f3031l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0210u
    public final void o(boolean z2) {
        this.f3040u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0195f c0195f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0195f = null;
                break;
            }
            c0195f = (C0195f) arrayList.get(i);
            if (!c0195f.f3020a.f3252z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0195f != null) {
            c0195f.f3021b.c(false);
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

    @Override // k.AbstractC0210u
    public final void p(int i) {
        if (this.f3031l != i) {
            this.f3031l = i;
            this.f3032m = Gravity.getAbsoluteGravity(i, this.f3033n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0210u
    public final void q(int i) {
        this.f3036q = true;
        this.f3038s = i;
    }

    @Override // k.AbstractC0210u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3044y = (C0211v) onDismissListener;
    }

    @Override // k.AbstractC0210u
    public final void s(boolean z2) {
        this.f3041v = z2;
    }

    @Override // k.AbstractC0210u
    public final void t(int i) {
        this.f3037r = true;
        this.f3039t = i;
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
    public final void v(MenuC0202m menuC0202m) {
        C0195f c0195f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0199j c0199j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f3023b;
        LayoutInflater from = LayoutInflater.from(context);
        C0199j c0199j2 = new C0199j(menuC0202m, from, this.f3026e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f3040u) {
            c0199j2.f3056c = true;
        } else if (a()) {
            c0199j2.f3056c = AbstractC0210u.u(menuC0202m);
        }
        int m2 = AbstractC0210u.m(c0199j2, context, this.f3024c);
        L0 l02 = new L0(context, null, this.f3025d);
        l02.f3269C = this.f3030k;
        l02.f3242p = this;
        l02.f3252z.setOnDismissListener(this);
        l02.f3241o = this.f3033n;
        l02.f3238l = this.f3032m;
        l02.f3251y = true;
        l02.f3252z.setFocusable(true);
        l02.f3252z.setInputMethodMode(2);
        l02.n(c0199j2);
        l02.q(m2);
        l02.f3238l = this.f3032m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0195f = (C0195f) arrayList.get(arrayList.size() - 1);
            MenuC0202m menuC0202m2 = c0195f.f3021b;
            int size = menuC0202m2.f3066f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0202m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0202m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0289t0 c0289t0 = c0195f.f3020a.f3231c;
                ListAdapter adapter = c0289t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0199j = (C0199j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0199j = (C0199j) adapter;
                    i3 = 0;
                }
                int count = c0199j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0199j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0289t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0289t0.getChildCount()) {
                    view = c0289t0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0234C c0234c = l02.f3252z;
                if (i6 <= 28) {
                    Method method = L0.f3268D;
                    if (method != null) {
                        try {
                            method.invoke(c0234c, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    J0.a(c0234c, false);
                }
                I0.a(l02.f3252z, null);
                C0289t0 c0289t02 = ((C0195f) arrayList.get(arrayList.size() - 1)).f3020a.f3231c;
                int[] iArr = new int[2];
                c0289t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3034o.getWindowVisibleDisplayFrame(rect);
                if (this.f3035p == 1) {
                }
                boolean z2 = i2 == i;
                this.f3035p = i2;
                l02.f3241o = view;
                if ((this.f3032m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                l02.f3234f = m2;
                l02.f3237k = true;
                l02.f3236j = true;
                l02.l(0);
            } else {
                if (this.f3036q) {
                    l02.f3234f = this.f3038s;
                }
                if (this.f3037r) {
                    l02.l(this.f3039t);
                }
                Rect rect2 = this.f3123a;
                l02.f3250x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0195f(l02, menuC0202m, this.f3035p));
            l02.i();
            C0289t0 c0289t03 = l02.f3231c;
            c0289t03.setOnKeyListener(this);
            if (c0195f == null || !this.f3041v || menuC0202m.f3071m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0289t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0202m.f3071m);
            c0289t03.addHeaderView(frameLayout, null, false);
            l02.i();
            return;
        }
        c0195f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0195f(l02, menuC0202m, this.f3035p));
        l02.i();
        C0289t0 c0289t032 = l02.f3231c;
        c0289t032.setOnKeyListener(this);
        if (c0195f == null) {
        }
    }
}
