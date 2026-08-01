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
import com.fortunequest.neontrack.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0204A;
import l.C0257r0;
import l.G0;
import l.H0;
import l.J0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0183g extends AbstractC0198v implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3129c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3130e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3131f;

    /* renamed from: n, reason: collision with root package name */
    public View f3137n;

    /* renamed from: o, reason: collision with root package name */
    public View f3138o;

    /* renamed from: p, reason: collision with root package name */
    public int f3139p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3140q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3141r;

    /* renamed from: s, reason: collision with root package name */
    public int f3142s;

    /* renamed from: t, reason: collision with root package name */
    public int f3143t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3145v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0201y f3146w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f3147x;

    /* renamed from: y, reason: collision with root package name */
    public C0199w f3148y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3149z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3132g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0180d i = new ViewTreeObserverOnGlobalLayoutListenerC0180d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final U0.n f3133j = new U0.n(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final A0.c f3134k = new A0.c(29, this);

    /* renamed from: l, reason: collision with root package name */
    public int f3135l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3136m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3144u = false;

    public ViewOnKeyListenerC0183g(Context context, View view, int i, boolean z2) {
        this.f3128b = context;
        this.f3137n = view;
        this.d = i;
        this.f3130e = z2;
        this.f3139p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3129c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3131f = new Handler();
    }

    @Override // k.InterfaceC0174D
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0182f) arrayList.get(0)).f3125a.f3283z.isShowing();
    }

    @Override // k.InterfaceC0202z
    public final void b(MenuC0189m menuC0189m, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0189m == ((C0182f) arrayList.get(i)).f3126b) {
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
            ((C0182f) arrayList.get(i2)).f3126b.c(false);
        }
        C0182f c0182f = (C0182f) arrayList.remove(i);
        c0182f.f3126b.r(this);
        boolean z3 = this.f3149z;
        J0 j02 = c0182f.f3125a;
        if (z3) {
            G0.b(j02.f3283z, null);
            j02.f3283z.setAnimationStyle(0);
        }
        j02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3139p = ((C0182f) arrayList.get(size2 - 1)).f3127c;
        } else {
            this.f3139p = this.f3137n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0182f) arrayList.get(0)).f3126b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0201y interfaceC0201y = this.f3146w;
        if (interfaceC0201y != null) {
            interfaceC0201y.b(menuC0189m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3147x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3147x.removeGlobalOnLayoutListener(this.i);
            }
            this.f3147x = null;
        }
        this.f3138o.removeOnAttachStateChangeListener(this.f3133j);
        this.f3148y.onDismiss();
    }

    @Override // k.InterfaceC0202z
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0182f) it.next()).f3125a.f3263c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0186j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0174D
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0182f[] c0182fArr = (C0182f[]) arrayList.toArray(new C0182f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0182f c0182f = c0182fArr[i];
                if (c0182f.f3125a.f3283z.isShowing()) {
                    c0182f.f3125a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0202z
    public final boolean e(SubMenuC0176F subMenuC0176F) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0182f c0182f = (C0182f) it.next();
            if (subMenuC0176F == c0182f.f3126b) {
                c0182f.f3125a.f3263c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0176F.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0176F);
        InterfaceC0201y interfaceC0201y = this.f3146w;
        if (interfaceC0201y != null) {
            interfaceC0201y.c(subMenuC0176F);
        }
        return true;
    }

    @Override // k.InterfaceC0174D
    public final C0257r0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0182f) arrayList.get(arrayList.size() - 1)).f3125a.f3263c;
    }

    @Override // k.InterfaceC0202z
    public final void g(InterfaceC0201y interfaceC0201y) {
        this.f3146w = interfaceC0201y;
    }

    @Override // k.InterfaceC0174D
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f3132g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0189m) it.next());
        }
        arrayList.clear();
        View view = this.f3137n;
        this.f3138o = view;
        if (view != null) {
            boolean z2 = this.f3147x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3147x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f3138o.addOnAttachStateChangeListener(this.f3133j);
        }
    }

    @Override // k.InterfaceC0202z
    public final boolean k() {
        return false;
    }

    @Override // k.AbstractC0198v
    public final void l(MenuC0189m menuC0189m) {
        menuC0189m.b(this, this.f3128b);
        if (a()) {
            v(menuC0189m);
        } else {
            this.f3132g.add(menuC0189m);
        }
    }

    @Override // k.AbstractC0198v
    public final void n(View view) {
        if (this.f3137n != view) {
            this.f3137n = view;
            this.f3136m = Gravity.getAbsoluteGravity(this.f3135l, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0198v
    public final void o(boolean z2) {
        this.f3144u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0182f c0182f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0182f = null;
                break;
            }
            c0182f = (C0182f) arrayList.get(i);
            if (!c0182f.f3125a.f3283z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0182f != null) {
            c0182f.f3126b.c(false);
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

    @Override // k.AbstractC0198v
    public final void p(int i) {
        if (this.f3135l != i) {
            this.f3135l = i;
            this.f3136m = Gravity.getAbsoluteGravity(i, this.f3137n.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0198v
    public final void q(int i) {
        this.f3140q = true;
        this.f3142s = i;
    }

    @Override // k.AbstractC0198v
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3148y = (C0199w) onDismissListener;
    }

    @Override // k.AbstractC0198v
    public final void s(boolean z2) {
        this.f3145v = z2;
    }

    @Override // k.AbstractC0198v
    public final void t(int i) {
        this.f3141r = true;
        this.f3143t = i;
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
    public final void v(MenuC0189m menuC0189m) {
        C0182f c0182f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C0186j c0186j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f3128b;
        LayoutInflater from = LayoutInflater.from(context);
        C0186j c0186j2 = new C0186j(menuC0189m, from, this.f3130e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f3144u) {
            c0186j2.f3159c = true;
        } else if (a()) {
            c0186j2.f3159c = AbstractC0198v.u(menuC0189m);
        }
        int m2 = AbstractC0198v.m(c0186j2, context, this.f3129c);
        J0 j02 = new J0(context, null, this.d);
        j02.f3299C = this.f3134k;
        j02.f3273p = this;
        j02.f3283z.setOnDismissListener(this);
        j02.f3272o = this.f3137n;
        j02.f3269l = this.f3136m;
        j02.f3282y = true;
        j02.f3283z.setFocusable(true);
        j02.f3283z.setInputMethodMode(2);
        j02.o(c0186j2);
        j02.r(m2);
        j02.f3269l = this.f3136m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0182f = (C0182f) arrayList.get(arrayList.size() - 1);
            MenuC0189m menuC0189m2 = c0182f.f3126b;
            int size = menuC0189m2.f3167f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0189m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC0189m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0257r0 c0257r0 = c0182f.f3125a.f3263c;
                ListAdapter adapter = c0257r0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c0186j = (C0186j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0186j = (C0186j) adapter;
                    i3 = 0;
                }
                int count = c0186j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c0186j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0257r0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0257r0.getChildCount()) {
                    view = c0257r0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0204A c0204a = j02.f3283z;
                if (i6 <= 28) {
                    Method method = J0.f3298D;
                    if (method != null) {
                        try {
                            method.invoke(c0204a, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    H0.a(c0204a, false);
                }
                G0.a(j02.f3283z, null);
                C0257r0 c0257r02 = ((C0182f) arrayList.get(arrayList.size() - 1)).f3125a.f3263c;
                int[] iArr = new int[2];
                c0257r02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3138o.getWindowVisibleDisplayFrame(rect);
                if (this.f3139p == 1) {
                }
                boolean z2 = i2 == i;
                this.f3139p = i2;
                j02.f3272o = view;
                if ((this.f3136m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                j02.f3265f = m2;
                j02.f3268k = true;
                j02.f3267j = true;
                j02.l(0);
            } else {
                if (this.f3140q) {
                    j02.f3265f = this.f3142s;
                }
                if (this.f3141r) {
                    j02.l(this.f3143t);
                }
                Rect rect2 = this.f3223a;
                j02.f3281x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0182f(j02, menuC0189m, this.f3139p));
            j02.i();
            C0257r0 c0257r03 = j02.f3263c;
            c0257r03.setOnKeyListener(this);
            if (c0182f == null || !this.f3145v || menuC0189m.f3172m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0257r03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC0189m.f3172m);
            c0257r03.addHeaderView(frameLayout, null, false);
            j02.i();
            return;
        }
        c0182f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0182f(j02, menuC0189m, this.f3139p));
        j02.i();
        C0257r0 c0257r032 = j02.f3263c;
        c0257r032.setOnKeyListener(this);
        if (c0182f == null) {
        }
    }
}
