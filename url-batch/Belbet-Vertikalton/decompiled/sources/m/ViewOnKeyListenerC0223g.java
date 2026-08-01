package m;

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
import com.winpower.neonfit.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import n.C0246B;
import n.C0305v0;
import n.K0;
import n.L0;
import n.N0;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0223g extends AbstractC0237u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3313b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3315d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3316f;

    /* renamed from: n, reason: collision with root package name */
    public View f3322n;

    /* renamed from: o, reason: collision with root package name */
    public View f3323o;

    /* renamed from: p, reason: collision with root package name */
    public int f3324p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3325q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3326r;

    /* renamed from: s, reason: collision with root package name */
    public int f3327s;

    /* renamed from: t, reason: collision with root package name */
    public int f3328t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3330v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0240x f3331w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f3332x;

    /* renamed from: y, reason: collision with root package name */
    public C0238v f3333y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3334z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3317g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3318h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0220d i = new ViewTreeObserverOnGlobalLayoutListenerC0220d(0, this);
    public final Q0.o j = new Q0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final C1.d f3319k = new C1.d(27, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3320l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3321m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3329u = false;

    public ViewOnKeyListenerC0223g(Context context, View view, int i, boolean z2) {
        this.f3313b = context;
        this.f3322n = view;
        this.f3315d = i;
        this.e = z2;
        this.f3324p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3314c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3316f = new Handler();
    }

    @Override // m.InterfaceC0214C
    public final boolean a() {
        ArrayList arrayList = this.f3318h;
        return arrayList.size() > 0 && ((C0222f) arrayList.get(0)).f3310a.f3482z.isShowing();
    }

    @Override // m.InterfaceC0241y
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        ArrayList arrayList = this.f3318h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0229m == ((C0222f) arrayList.get(i)).f3311b) {
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
            ((C0222f) arrayList.get(i2)).f3311b.c(false);
        }
        C0222f c0222f = (C0222f) arrayList.remove(i);
        c0222f.f3311b.r(this);
        boolean z3 = this.f3334z;
        N0 n02 = c0222f.f3310a;
        if (z3) {
            K0.b(n02.f3482z, null);
            n02.f3482z.setAnimationStyle(0);
        }
        n02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3324p = ((C0222f) arrayList.get(size2 - 1)).f3312c;
        } else {
            this.f3324p = this.f3322n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0222f) arrayList.get(0)).f3311b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0240x interfaceC0240x = this.f3331w;
        if (interfaceC0240x != null) {
            interfaceC0240x.b(menuC0229m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3332x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3332x.removeGlobalOnLayoutListener(this.i);
            }
            this.f3332x = null;
        }
        this.f3323o.removeOnAttachStateChangeListener(this.j);
        this.f3333y.onDismiss();
    }

    @Override // m.InterfaceC0241y
    public final void d() {
        Iterator it = this.f3318h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0222f) it.next()).f3310a.f3462c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0226j) adapter).notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC0214C
    public final void dismiss() {
        ArrayList arrayList = this.f3318h;
        int size = arrayList.size();
        if (size > 0) {
            C0222f[] c0222fArr = (C0222f[]) arrayList.toArray(new C0222f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0222f c0222f = c0222fArr[i];
                if (c0222f.f3310a.f3482z.isShowing()) {
                    c0222f.f3310a.dismiss();
                }
            }
        }
    }

    @Override // m.InterfaceC0214C
    public final C0305v0 e() {
        ArrayList arrayList = this.f3318h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0222f) arrayList.get(arrayList.size() - 1)).f3310a.f3462c;
    }

    @Override // m.InterfaceC0241y
    public final boolean g() {
        return false;
    }

    @Override // m.InterfaceC0214C
    public final void h() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f3317g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0229m) it.next());
        }
        arrayList.clear();
        View view = this.f3322n;
        this.f3323o = view;
        if (view != null) {
            boolean z2 = this.f3332x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3332x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f3323o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // m.InterfaceC0241y
    public final void i(InterfaceC0240x interfaceC0240x) {
        this.f3331w = interfaceC0240x;
    }

    @Override // m.InterfaceC0241y
    public final boolean k(SubMenuC0216E subMenuC0216E) {
        Iterator it = this.f3318h.iterator();
        while (it.hasNext()) {
            C0222f c0222f = (C0222f) it.next();
            if (subMenuC0216E == c0222f.f3311b) {
                c0222f.f3310a.f3462c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0216E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0216E);
        InterfaceC0240x interfaceC0240x = this.f3331w;
        if (interfaceC0240x != null) {
            interfaceC0240x.g(subMenuC0216E);
        }
        return true;
    }

    @Override // m.AbstractC0237u
    public final void l(MenuC0229m menuC0229m) {
        menuC0229m.b(this, this.f3313b);
        if (a()) {
            v(menuC0229m);
        } else {
            this.f3317g.add(menuC0229m);
        }
    }

    @Override // m.AbstractC0237u
    public final void n(View view) {
        if (this.f3322n != view) {
            this.f3322n = view;
            this.f3321m = Gravity.getAbsoluteGravity(this.f3320l, view.getLayoutDirection());
        }
    }

    @Override // m.AbstractC0237u
    public final void o(boolean z2) {
        this.f3329u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0222f c0222f;
        ArrayList arrayList = this.f3318h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0222f = null;
                break;
            }
            c0222f = (C0222f) arrayList.get(i);
            if (!c0222f.f3310a.f3482z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0222f != null) {
            c0222f.f3311b.c(false);
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

    @Override // m.AbstractC0237u
    public final void p(int i) {
        if (this.f3320l != i) {
            this.f3320l = i;
            this.f3321m = Gravity.getAbsoluteGravity(i, this.f3322n.getLayoutDirection());
        }
    }

    @Override // m.AbstractC0237u
    public final void q(int i) {
        this.f3325q = true;
        this.f3327s = i;
    }

    @Override // m.AbstractC0237u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3333y = (C0238v) onDismissListener;
    }

    @Override // m.AbstractC0237u
    public final void s(boolean z2) {
        this.f3330v = z2;
    }

    @Override // m.AbstractC0237u
    public final void t(int i) {
        this.f3326r = true;
        this.f3328t = i;
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
    public final void v(MenuC0229m menuC0229m) {
        C0222f c0222f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0226j c0226j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f3313b;
        LayoutInflater from = LayoutInflater.from(context);
        C0226j c0226j2 = new C0226j(menuC0229m, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f3329u) {
            c0226j2.f3344c = true;
        } else if (a()) {
            c0226j2.f3344c = AbstractC0237u.u(menuC0229m);
        }
        int m2 = AbstractC0237u.m(c0226j2, context, this.f3314c);
        N0 n02 = new N0(context, null, this.f3315d);
        n02.f3501C = this.f3319k;
        n02.f3472p = this;
        n02.f3482z.setOnDismissListener(this);
        n02.f3471o = this.f3322n;
        n02.f3468l = this.f3321m;
        n02.f3481y = true;
        n02.f3482z.setFocusable(true);
        n02.f3482z.setInputMethodMode(2);
        n02.o(c0226j2);
        n02.r(m2);
        n02.f3468l = this.f3321m;
        ArrayList arrayList = this.f3318h;
        if (arrayList.size() > 0) {
            c0222f = (C0222f) arrayList.get(arrayList.size() - 1);
            MenuC0229m menuC0229m2 = c0222f.f3311b;
            int size = menuC0229m2.f3352f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0229m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0229m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0305v0 c0305v0 = c0222f.f3310a.f3462c;
                ListAdapter adapter = c0305v0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0226j = (C0226j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0226j = (C0226j) adapter;
                    i3 = 0;
                }
                int count = c0226j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0226j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0305v0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0305v0.getChildCount()) {
                    view = c0305v0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0246B c0246b = n02.f3482z;
                if (i6 <= 28) {
                    Method method = N0.f3500D;
                    if (method != null) {
                        try {
                            method.invoke(c0246b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    L0.a(c0246b, false);
                }
                K0.a(n02.f3482z, null);
                C0305v0 c0305v02 = ((C0222f) arrayList.get(arrayList.size() - 1)).f3310a.f3462c;
                int[] iArr = new int[2];
                c0305v02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3323o.getWindowVisibleDisplayFrame(rect);
                if (this.f3324p == 1) {
                }
                boolean z2 = i2 == i;
                this.f3324p = i2;
                n02.f3471o = view;
                if ((this.f3321m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                n02.f3464f = m2;
                n02.f3467k = true;
                n02.j = true;
                n02.l(0);
            } else {
                if (this.f3325q) {
                    n02.f3464f = this.f3327s;
                }
                if (this.f3326r) {
                    n02.l(this.f3328t);
                }
                Rect rect2 = this.f3408a;
                n02.f3480x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0222f(n02, menuC0229m, this.f3324p));
            n02.h();
            C0305v0 c0305v03 = n02.f3462c;
            c0305v03.setOnKeyListener(this);
            if (c0222f == null || !this.f3330v || menuC0229m.f3357m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0305v03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0229m.f3357m);
            c0305v03.addHeaderView(frameLayout, null, false);
            n02.h();
            return;
        }
        c0222f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0222f(n02, menuC0229m, this.f3324p));
        n02.h();
        C0305v0 c0305v032 = n02.f3462c;
        c0305v032.setOnKeyListener(this);
        if (c0222f == null) {
        }
    }
}
