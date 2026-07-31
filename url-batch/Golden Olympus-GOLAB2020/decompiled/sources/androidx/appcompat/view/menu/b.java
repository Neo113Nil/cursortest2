package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
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
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.M;
import androidx.core.view.AbstractC1317t;
import e.AbstractC2408d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    private static final int f10338B = e.g.f36326e;

    /* renamed from: A, reason: collision with root package name */
    boolean f10339A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10340b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10341c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10342d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10343e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10344f;

    /* renamed from: g, reason: collision with root package name */
    final Handler f10345g;

    /* renamed from: o, reason: collision with root package name */
    private View f10353o;

    /* renamed from: p, reason: collision with root package name */
    View f10354p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10356r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10357s;

    /* renamed from: t, reason: collision with root package name */
    private int f10358t;

    /* renamed from: u, reason: collision with root package name */
    private int f10359u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10361w;

    /* renamed from: x, reason: collision with root package name */
    private j.a f10362x;

    /* renamed from: y, reason: collision with root package name */
    ViewTreeObserver f10363y;

    /* renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10364z;

    /* renamed from: h, reason: collision with root package name */
    private final List f10346h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    final List f10347i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f10348j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f10349k = new ViewOnAttachStateChangeListenerC0078b();

    /* renamed from: l, reason: collision with root package name */
    private final L f10350l = new c();

    /* renamed from: m, reason: collision with root package name */
    private int f10351m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f10352n = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10360v = false;

    /* renamed from: q, reason: collision with root package name */
    private int f10355q = A();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.isShowing() || b.this.f10347i.size() <= 0 || ((d) b.this.f10347i.get(0)).f10372a.isModal()) {
                return;
            }
            View view = b.this.f10354p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f10347i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f10372a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0078b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0078b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f10363y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f10363y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f10363y.removeGlobalOnLayoutListener(bVar.f10348j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements L {

        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f10368b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f10369c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f10370d;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f10368b = dVar;
                this.f10369c = menuItem;
                this.f10370d = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f10368b;
                if (dVar != null) {
                    b.this.f10339A = true;
                    dVar.f10373b.close(false);
                    b.this.f10339A = false;
                }
                if (this.f10369c.isEnabled() && this.f10369c.hasSubMenu()) {
                    this.f10370d.performItemAction(this.f10369c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.L
        public void a(e eVar, MenuItem menuItem) {
            b.this.f10345g.removeCallbacksAndMessages(null);
            int size = b.this.f10347i.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                } else if (eVar == ((d) b.this.f10347i.get(i4)).f10373b) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 == -1) {
                return;
            }
            int i5 = i4 + 1;
            b.this.f10345g.postAtTime(new a(i5 < b.this.f10347i.size() ? (d) b.this.f10347i.get(i5) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.L
        public void c(e eVar, MenuItem menuItem) {
            b.this.f10345g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final M f10372a;

        /* renamed from: b, reason: collision with root package name */
        public final e f10373b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10374c;

        public d(M m4, e eVar, int i4) {
            this.f10372a = m4;
            this.f10373b = eVar;
            this.f10374c = i4;
        }

        public ListView a() {
            return this.f10372a.getListView();
        }
    }

    public b(Context context, View view, int i4, int i5, boolean z4) {
        this.f10340b = context;
        this.f10353o = view;
        this.f10342d = i4;
        this.f10343e = i5;
        this.f10344f = z4;
        Resources resources = context.getResources();
        this.f10341c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC2408d.f36223b));
        this.f10345g = new Handler();
    }

    private int A() {
        return this.f10353o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int B(int i4) {
        List list = this.f10347i;
        ListView a4 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a4.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f10354p.getWindowVisibleDisplayFrame(rect);
        return this.f10355q == 1 ? (iArr[0] + a4.getWidth()) + i4 > rect.right ? 0 : 1 : iArr[0] - i4 < 0 ? 1 : 0;
    }

    private void C(e eVar) {
        d dVar;
        View view;
        int i4;
        int i5;
        int i6;
        LayoutInflater from = LayoutInflater.from(this.f10340b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f10344f, f10338B);
        if (!isShowing() && this.f10360v) {
            dVar2.d(true);
        } else if (isShowing()) {
            dVar2.d(h.u(eVar));
        }
        int l4 = h.l(dVar2, null, this.f10340b, this.f10341c);
        M w4 = w();
        w4.setAdapter(dVar2);
        w4.setContentWidth(l4);
        w4.setDropDownGravity(this.f10352n);
        if (this.f10347i.size() > 0) {
            List list = this.f10347i;
            dVar = (d) list.get(list.size() - 1);
            view = z(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            w4.n(false);
            w4.k(null);
            int B4 = B(l4);
            boolean z4 = B4 == 1;
            this.f10355q = B4;
            if (Build.VERSION.SDK_INT >= 26) {
                w4.setAnchorView(view);
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr = new int[2];
                this.f10353o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f10352n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f10353o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i4 = iArr2[0] - iArr[0];
                i5 = iArr2[1] - iArr[1];
            }
            if ((this.f10352n & 5) == 5) {
                if (!z4) {
                    l4 = view.getWidth();
                    i6 = i4 - l4;
                }
                i6 = i4 + l4;
            } else {
                if (z4) {
                    l4 = view.getWidth();
                    i6 = i4 + l4;
                }
                i6 = i4 - l4;
            }
            w4.setHorizontalOffset(i6);
            w4.setOverlapAnchor(true);
            w4.setVerticalOffset(i5);
        } else {
            if (this.f10356r) {
                w4.setHorizontalOffset(this.f10358t);
            }
            if (this.f10357s) {
                w4.setVerticalOffset(this.f10359u);
            }
            w4.setEpicenterBounds(k());
        }
        this.f10347i.add(new d(w4, eVar, this.f10355q));
        w4.show();
        ListView listView = w4.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.f10361w && eVar.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(e.g.f36333l, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.getHeaderTitle());
            listView.addHeaderView(frameLayout, null, false);
            w4.show();
        }
    }

    private M w() {
        M m4 = new M(this.f10340b, null, this.f10342d, this.f10343e);
        m4.m(this.f10350l);
        m4.setOnItemClickListener(this);
        m4.setOnDismissListener(this);
        m4.setAnchorView(this.f10353o);
        m4.setDropDownGravity(this.f10352n);
        m4.setModal(true);
        m4.setInputMethodMode(2);
        return m4;
    }

    private int x(e eVar) {
        int size = this.f10347i.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (eVar == ((d) this.f10347i.get(i4)).f10373b) {
                return i4;
            }
        }
        return -1;
    }

    private MenuItem y(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = eVar.getItem(i4);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View z(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i4;
        int firstVisiblePosition;
        MenuItem y4 = y(dVar.f10373b, eVar);
        if (y4 == null) {
            return null;
        }
        ListView a4 = dVar.a();
        ListAdapter adapter = a4.getAdapter();
        int i5 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i4 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i4 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i5 >= count) {
                i5 = -1;
                break;
            }
            if (y4 == dVar2.getItem(i5)) {
                break;
            }
            i5++;
        }
        if (i5 != -1 && (firstVisiblePosition = (i5 + i4) - a4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a4.getChildCount()) {
            return a4.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z4) {
        int x4 = x(eVar);
        if (x4 < 0) {
            return;
        }
        int i4 = x4 + 1;
        if (i4 < this.f10347i.size()) {
            ((d) this.f10347i.get(i4)).f10373b.close(false);
        }
        d dVar = (d) this.f10347i.remove(x4);
        dVar.f10373b.removeMenuPresenter(this);
        if (this.f10339A) {
            dVar.f10372a.l(null);
            dVar.f10372a.setAnimationStyle(0);
        }
        dVar.f10372a.dismiss();
        int size = this.f10347i.size();
        if (size > 0) {
            this.f10355q = ((d) this.f10347i.get(size - 1)).f10374c;
        } else {
            this.f10355q = A();
        }
        if (size != 0) {
            if (z4) {
                ((d) this.f10347i.get(0)).f10373b.close(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f10362x;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f10363y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f10363y.removeGlobalOnLayoutListener(this.f10348j);
            }
            this.f10363y = null;
        }
        this.f10354p.removeOnAttachStateChangeListener(this.f10349k);
        this.f10364z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z4) {
        Iterator it = this.f10347i.iterator();
        while (it.hasNext()) {
            h.v(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        return false;
    }

    @Override // j.e
    public void dismiss() {
        int size = this.f10347i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f10347i.toArray(new d[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                d dVar = dVarArr[i4];
                if (dVar.f10372a.isShowing()) {
                    dVar.f10372a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(j.a aVar) {
        this.f10362x = aVar;
    }

    @Override // j.e
    public ListView getListView() {
        if (this.f10347i.isEmpty()) {
            return null;
        }
        return ((d) this.f10347i.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(m mVar) {
        for (d dVar : this.f10347i) {
            if (mVar == dVar.f10373b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        i(mVar);
        j.a aVar = this.f10362x;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void i(e eVar) {
        eVar.addMenuPresenter(this, this.f10340b);
        if (isShowing()) {
            C(eVar);
        } else {
            this.f10346h.add(eVar);
        }
    }

    @Override // j.e
    public boolean isShowing() {
        return this.f10347i.size() > 0 && ((d) this.f10347i.get(0)).f10372a.isShowing();
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(View view) {
        if (this.f10353o != view) {
            this.f10353o = view;
            this.f10352n = AbstractC1317t.b(this.f10351m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(boolean z4) {
        this.f10360v = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f10347i.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f10347i.get(i4);
            if (!dVar.f10372a.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (dVar != null) {
            dVar.f10373b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(int i4) {
        if (this.f10351m != i4) {
            this.f10351m = i4;
            this.f10352n = AbstractC1317t.b(i4, this.f10353o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(int i4) {
        this.f10356r = true;
        this.f10358t = i4;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f10364z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(boolean z4) {
        this.f10361w = z4;
    }

    @Override // j.e
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator it = this.f10346h.iterator();
        while (it.hasNext()) {
            C((e) it.next());
        }
        this.f10346h.clear();
        View view = this.f10353o;
        this.f10354p = view;
        if (view != null) {
            boolean z4 = this.f10363y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f10363y = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f10348j);
            }
            this.f10354p.addOnAttachStateChangeListener(this.f10349k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i4) {
        this.f10357s = true;
        this.f10359u = i4;
    }
}
