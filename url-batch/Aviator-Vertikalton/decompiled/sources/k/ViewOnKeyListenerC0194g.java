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
import com.fortuneink.neonpad.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0233D;
import l.C0289u0;
import l.J0;
import l.K0;
import l.M0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0194g extends AbstractC0208u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3019b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3020c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3022e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3023f;

    /* renamed from: n, reason: collision with root package name */
    public View f3029n;

    /* renamed from: o, reason: collision with root package name */
    public View f3030o;

    /* renamed from: p, reason: collision with root package name */
    public int f3031p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3032q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3033r;

    /* renamed from: s, reason: collision with root package name */
    public int f3034s;

    /* renamed from: t, reason: collision with root package name */
    public int f3035t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3037v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0211x f3038w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f3039x;

    /* renamed from: y, reason: collision with root package name */
    public C0209v f3040y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3041z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3024g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0191d i = new ViewTreeObserverOnGlobalLayoutListenerC0191d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final K0.o f3025j = new K0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final B0.d f3026k = new B0.d(27, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3027l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3028m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3036u = false;

    public ViewOnKeyListenerC0194g(Context context, View view, int i, boolean z2) {
        this.f3019b = context;
        this.f3029n = view;
        this.f3021d = i;
        this.f3022e = z2;
        this.f3031p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3020c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3023f = new Handler();
    }

    @Override // k.InterfaceC0185C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0193f) arrayList.get(0)).f3016a.f3252z.isShowing();
    }

    @Override // k.InterfaceC0212y
    public final void b(MenuC0200m menuC0200m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0200m == ((C0193f) arrayList.get(i)).f3017b) {
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
            ((C0193f) arrayList.get(i2)).f3017b.c(false);
        }
        C0193f c0193f = (C0193f) arrayList.remove(i);
        c0193f.f3017b.r(this);
        boolean z3 = this.f3041z;
        M0 m0 = c0193f.f3016a;
        if (z3) {
            J0.b(m0.f3252z, null);
            m0.f3252z.setAnimationStyle(0);
        }
        m0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3031p = ((C0193f) arrayList.get(size2 - 1)).f3018c;
        } else {
            this.f3031p = this.f3029n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0193f) arrayList.get(0)).f3017b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0211x interfaceC0211x = this.f3038w;
        if (interfaceC0211x != null) {
            interfaceC0211x.b(menuC0200m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3039x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3039x.removeGlobalOnLayoutListener(this.i);
            }
            this.f3039x = null;
        }
        this.f3030o.removeOnAttachStateChangeListener(this.f3025j);
        this.f3040y.onDismiss();
    }

    @Override // k.InterfaceC0212y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0193f) it.next()).f3016a.f3231c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0197j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0185C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0193f[] c0193fArr = (C0193f[]) arrayList.toArray(new C0193f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0193f c0193f = c0193fArr[i];
                if (c0193f.f3016a.f3252z.isShowing()) {
                    c0193f.f3016a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0212y
    public final boolean e(SubMenuC0187E subMenuC0187E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0193f c0193f = (C0193f) it.next();
            if (subMenuC0187E == c0193f.f3017b) {
                c0193f.f3016a.f3231c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0187E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0187E);
        InterfaceC0211x interfaceC0211x = this.f3038w;
        if (interfaceC0211x != null) {
            interfaceC0211x.f(subMenuC0187E);
        }
        return true;
    }

    @Override // k.InterfaceC0185C
    public final C0289u0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0193f) arrayList.get(arrayList.size() - 1)).f3016a.f3231c;
    }

    @Override // k.InterfaceC0212y
    public final void g(InterfaceC0211x interfaceC0211x) {
        this.f3038w = interfaceC0211x;
    }

    @Override // k.InterfaceC0185C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f3024g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0200m) it.next());
        }
        arrayList.clear();
        View view = this.f3029n;
        this.f3030o = view;
        if (view != null) {
            boolean z2 = this.f3039x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3039x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f3030o.addOnAttachStateChangeListener(this.f3025j);
        }
    }

    @Override // k.InterfaceC0212y
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0208u
    public final void l(MenuC0200m menuC0200m) {
        menuC0200m.b(this, this.f3019b);
        if (a()) {
            v(menuC0200m);
        } else {
            this.f3024g.add(menuC0200m);
        }
    }

    @Override // k.AbstractC0208u
    public final void n(View view) {
        if (this.f3029n != view) {
            this.f3029n = view;
            this.f3028m = Gravity.getAbsoluteGravity(this.f3027l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0208u
    public final void o(boolean z2) {
        this.f3036u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0193f c0193f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0193f = null;
                break;
            }
            c0193f = (C0193f) arrayList.get(i);
            if (!c0193f.f3016a.f3252z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0193f != null) {
            c0193f.f3017b.c(false);
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

    @Override // k.AbstractC0208u
    public final void p(int i) {
        if (this.f3027l != i) {
            this.f3027l = i;
            this.f3028m = Gravity.getAbsoluteGravity(i, this.f3029n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0208u
    public final void q(int i) {
        this.f3032q = true;
        this.f3034s = i;
    }

    @Override // k.AbstractC0208u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3040y = (C0209v) onDismissListener;
    }

    @Override // k.AbstractC0208u
    public final void s(boolean z2) {
        this.f3037v = z2;
    }

    @Override // k.AbstractC0208u
    public final void t(int i) {
        this.f3033r = true;
        this.f3035t = i;
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
    public final void v(MenuC0200m menuC0200m) {
        C0193f c0193f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0197j c0197j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f3019b;
        LayoutInflater from = LayoutInflater.from(context);
        C0197j c0197j2 = new C0197j(menuC0200m, from, this.f3022e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f3036u) {
            c0197j2.f3052c = true;
        } else if (a()) {
            c0197j2.f3052c = AbstractC0208u.u(menuC0200m);
        }
        int m2 = AbstractC0208u.m(c0197j2, context, this.f3020c);
        M0 m0 = new M0(context, null, this.f3021d);
        m0.f3269C = this.f3026k;
        m0.f3242p = this;
        m0.f3252z.setOnDismissListener(this);
        m0.f3241o = this.f3029n;
        m0.f3238l = this.f3028m;
        m0.f3251y = true;
        m0.f3252z.setFocusable(true);
        m0.f3252z.setInputMethodMode(2);
        m0.n(c0197j2);
        m0.r(m2);
        m0.f3238l = this.f3028m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0193f = (C0193f) arrayList.get(arrayList.size() - 1);
            MenuC0200m menuC0200m2 = c0193f.f3017b;
            int size = menuC0200m2.f3062f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0200m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0200m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0289u0 c0289u0 = c0193f.f3016a.f3231c;
                ListAdapter adapter = c0289u0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0197j = (C0197j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0197j = (C0197j) adapter;
                    i3 = 0;
                }
                int count = c0197j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0197j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0289u0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0289u0.getChildCount()) {
                    view = c0289u0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0233D c0233d = m0.f3252z;
                if (i6 <= 28) {
                    Method method = M0.f3268D;
                    if (method != null) {
                        try {
                            method.invoke(c0233d, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    K0.a(c0233d, false);
                }
                J0.a(m0.f3252z, null);
                C0289u0 c0289u02 = ((C0193f) arrayList.get(arrayList.size() - 1)).f3016a.f3231c;
                int[] iArr = new int[2];
                c0289u02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3030o.getWindowVisibleDisplayFrame(rect);
                if (this.f3031p == 1) {
                }
                boolean z2 = i2 == i;
                this.f3031p = i2;
                m0.f3241o = view;
                if ((this.f3028m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                m0.f3234f = m2;
                m0.f3237k = true;
                m0.f3236j = true;
                m0.l(0);
            } else {
                if (this.f3032q) {
                    m0.f3234f = this.f3034s;
                }
                if (this.f3033r) {
                    m0.l(this.f3035t);
                }
                Rect rect2 = this.f3119a;
                m0.f3250x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0193f(m0, menuC0200m, this.f3031p));
            m0.i();
            C0289u0 c0289u03 = m0.f3231c;
            c0289u03.setOnKeyListener(this);
            if (c0193f == null || !this.f3037v || menuC0200m.f3067m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0289u03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0200m.f3067m);
            c0289u03.addHeaderView(frameLayout, null, false);
            m0.i();
            return;
        }
        c0193f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0193f(m0, menuC0200m, this.f3031p));
        m0.i();
        C0289u0 c0289u032 = m0.f3231c;
        c0289u032.setOnKeyListener(this);
        if (c0193f == null) {
        }
    }
}
