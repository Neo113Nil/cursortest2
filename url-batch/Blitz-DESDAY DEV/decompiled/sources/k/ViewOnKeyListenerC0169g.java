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
import com.winfour.neondrop.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l.C0173B;
import l.C0213t0;
import l.I0;
import l.J0;
import l.L0;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0169g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2730b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2731c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2732e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2733f;

    /* renamed from: n, reason: collision with root package name */
    public View f2739n;

    /* renamed from: o, reason: collision with root package name */
    public View f2740o;

    /* renamed from: p, reason: collision with root package name */
    public int f2741p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2742q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2743r;

    /* renamed from: s, reason: collision with root package name */
    public int f2744s;

    /* renamed from: t, reason: collision with root package name */
    public int f2745t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2747v;

    /* renamed from: w, reason: collision with root package name */
    public x f2748w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f2749x;

    /* renamed from: y, reason: collision with root package name */
    public v f2750y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2751z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2734g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC0166d i = new ViewTreeObserverOnGlobalLayoutListenerC0166d(0, this);

    /* renamed from: j, reason: collision with root package name */
    public final O0.o f2735j = new O0.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final E.g f2736k = new E.g(26, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2737l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2738m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2746u = false;

    public ViewOnKeyListenerC0169g(Context context, View view, int i, boolean z2) {
        this.f2730b = context;
        this.f2739n = view;
        this.d = i;
        this.f2732e = z2;
        this.f2741p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2731c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2733f = new Handler();
    }

    @Override // k.InterfaceC0160C
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((C0168f) arrayList.get(0)).f2727a.f2884z.isShowing();
    }

    @Override // k.y
    public final void b(m mVar, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C0168f) arrayList.get(i)).f2728b) {
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
            ((C0168f) arrayList.get(i2)).f2728b.c(false);
        }
        C0168f c0168f = (C0168f) arrayList.remove(i);
        c0168f.f2728b.r(this);
        boolean z3 = this.f2751z;
        L0 l02 = c0168f.f2727a;
        if (z3) {
            I0.b(l02.f2884z, null);
            l02.f2884z.setAnimationStyle(0);
        }
        l02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2741p = ((C0168f) arrayList.get(size2 - 1)).f2729c;
        } else {
            this.f2741p = this.f2739n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0168f) arrayList.get(0)).f2728b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f2748w;
        if (xVar != null) {
            xVar.b(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2749x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2749x.removeGlobalOnLayoutListener(this.i);
            }
            this.f2749x = null;
        }
        this.f2740o.removeOnAttachStateChangeListener(this.f2735j);
        this.f2750y.onDismiss();
    }

    @Override // k.y
    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0168f) it.next()).f2727a.f2864c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0160C
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            C0168f[] c0168fArr = (C0168f[]) arrayList.toArray(new C0168f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0168f c0168f = c0168fArr[i];
                if (c0168f.f2727a.f2884z.isShowing()) {
                    c0168f.f2727a.dismiss();
                }
            }
        }
    }

    @Override // k.y
    public final boolean e(SubMenuC0162E subMenuC0162E) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            C0168f c0168f = (C0168f) it.next();
            if (subMenuC0162E == c0168f.f2728b) {
                c0168f.f2727a.f2864c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0162E.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0162E);
        x xVar = this.f2748w;
        if (xVar != null) {
            xVar.f(subMenuC0162E);
        }
        return true;
    }

    @Override // k.InterfaceC0160C
    public final C0213t0 f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0168f) arrayList.get(arrayList.size() - 1)).f2727a.f2864c;
    }

    @Override // k.y
    public final void g(x xVar) {
        this.f2748w = xVar;
    }

    @Override // k.InterfaceC0160C
    public final void i() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2734g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((m) it.next());
        }
        arrayList.clear();
        View view = this.f2739n;
        this.f2740o = view;
        if (view != null) {
            boolean z2 = this.f2749x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2749x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.f2740o.addOnAttachStateChangeListener(this.f2735j);
        }
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }

    @Override // k.u
    public final void l(m mVar) {
        mVar.b(this, this.f2730b);
        if (a()) {
            v(mVar);
        } else {
            this.f2734g.add(mVar);
        }
    }

    @Override // k.u
    public final void n(View view) {
        if (this.f2739n != view) {
            this.f2739n = view;
            this.f2738m = Gravity.getAbsoluteGravity(this.f2737l, view.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void o(boolean z2) {
        this.f2746u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0168f c0168f;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0168f = null;
                break;
            }
            c0168f = (C0168f) arrayList.get(i);
            if (!c0168f.f2727a.f2884z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0168f != null) {
            c0168f.f2728b.c(false);
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

    @Override // k.u
    public final void p(int i) {
        if (this.f2737l != i) {
            this.f2737l = i;
            this.f2738m = Gravity.getAbsoluteGravity(i, this.f2739n.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void q(int i) {
        this.f2742q = true;
        this.f2744s = i;
    }

    @Override // k.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2750y = (v) onDismissListener;
    }

    @Override // k.u
    public final void s(boolean z2) {
        this.f2747v = z2;
    }

    @Override // k.u
    public final void t(int i) {
        this.f2743r = true;
        this.f2745t = i;
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
    public final void v(m mVar) {
        C0168f c0168f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        j jVar;
        int i3;
        int firstVisiblePosition;
        Context context = this.f2730b;
        LayoutInflater from = LayoutInflater.from(context);
        j jVar2 = new j(mVar, from, this.f2732e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f2746u) {
            jVar2.f2761c = true;
        } else if (a()) {
            jVar2.f2761c = u.u(mVar);
        }
        int m2 = u.m(jVar2, context, this.f2731c);
        L0 l02 = new L0(context, null, this.d);
        l02.f2901C = this.f2736k;
        l02.f2874p = this;
        l02.f2884z.setOnDismissListener(this);
        l02.f2873o = this.f2739n;
        l02.f2870l = this.f2738m;
        l02.f2883y = true;
        l02.f2884z.setFocusable(true);
        l02.f2884z.setInputMethodMode(2);
        l02.n(jVar2);
        l02.q(m2);
        l02.f2870l = this.f2738m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            c0168f = (C0168f) arrayList.get(arrayList.size() - 1);
            m mVar2 = c0168f.f2728b;
            int size = mVar2.f2769f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = mVar2.getItem(i4);
                if (menuItem.hasSubMenu() && mVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0213t0 c0213t0 = c0168f.f2727a.f2864c;
                ListAdapter adapter = c0213t0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    i3 = 0;
                }
                int count = jVar.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == jVar.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c0213t0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0213t0.getChildCount()) {
                    view = c0213t0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C0173B c0173b = l02.f2884z;
                if (i6 <= 28) {
                    Method method = L0.f2900D;
                    if (method != null) {
                        try {
                            method.invoke(c0173b, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    J0.a(c0173b, false);
                }
                I0.a(l02.f2884z, null);
                C0213t0 c0213t02 = ((C0168f) arrayList.get(arrayList.size() - 1)).f2727a.f2864c;
                int[] iArr = new int[2];
                c0213t02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2740o.getWindowVisibleDisplayFrame(rect);
                if (this.f2741p == 1) {
                }
                boolean z2 = i2 == i;
                this.f2741p = i2;
                l02.f2873o = view;
                if ((this.f2738m & 5) != 5) {
                    m2 = z2 ? view.getWidth() : 0 - m2;
                } else if (!z2) {
                    m2 = 0 - view.getWidth();
                }
                l02.f2866f = m2;
                l02.f2869k = true;
                l02.f2868j = true;
                l02.l(0);
            } else {
                if (this.f2742q) {
                    l02.f2866f = this.f2744s;
                }
                if (this.f2743r) {
                    l02.l(this.f2745t);
                }
                Rect rect2 = this.f2824a;
                l02.f2882x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0168f(l02, mVar, this.f2741p));
            l02.i();
            C0213t0 c0213t03 = l02.f2864c;
            c0213t03.setOnKeyListener(this);
            if (c0168f == null || !this.f2747v || mVar.f2774m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0213t03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f2774m);
            c0213t03.addHeaderView(frameLayout, null, false);
            l02.i();
            return;
        }
        c0168f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0168f(l02, mVar, this.f2741p));
        l02.i();
        C0213t0 c0213t032 = l02.f2864c;
        c0213t032.setOnKeyListener(this);
        if (c0168f == null) {
        }
    }
}
