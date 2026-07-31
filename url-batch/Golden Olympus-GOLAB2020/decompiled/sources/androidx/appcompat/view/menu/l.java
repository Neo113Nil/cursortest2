package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.M;
import e.AbstractC2408d;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    private static final int f10442v = e.g.f36334m;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10443b;

    /* renamed from: c, reason: collision with root package name */
    private final e f10444c;

    /* renamed from: d, reason: collision with root package name */
    private final d f10445d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10446e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10447f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10448g;

    /* renamed from: h, reason: collision with root package name */
    private final int f10449h;

    /* renamed from: i, reason: collision with root package name */
    final M f10450i;

    /* renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10453l;

    /* renamed from: m, reason: collision with root package name */
    private View f10454m;

    /* renamed from: n, reason: collision with root package name */
    View f10455n;

    /* renamed from: o, reason: collision with root package name */
    private j.a f10456o;

    /* renamed from: p, reason: collision with root package name */
    ViewTreeObserver f10457p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10458q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10459r;

    /* renamed from: s, reason: collision with root package name */
    private int f10460s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10462u;

    /* renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f10451j = new a();

    /* renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f10452k = new b();

    /* renamed from: t, reason: collision with root package name */
    private int f10461t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.isShowing() || l.this.f10450i.isModal()) {
                return;
            }
            View view = l.this.f10455n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f10450i.show();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f10457p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f10457p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f10457p.removeGlobalOnLayoutListener(lVar.f10451j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i4, int i5, boolean z4) {
        this.f10443b = context;
        this.f10444c = eVar;
        this.f10446e = z4;
        this.f10445d = new d(eVar, LayoutInflater.from(context), z4, f10442v);
        this.f10448g = i4;
        this.f10449h = i5;
        Resources resources = context.getResources();
        this.f10447f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC2408d.f36223b));
        this.f10454m = view;
        this.f10450i = new M(context, null, i4, i5);
        eVar.addMenuPresenter(this, context);
    }

    private boolean w() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f10458q || (view = this.f10454m) == null) {
            return false;
        }
        this.f10455n = view;
        this.f10450i.setOnDismissListener(this);
        this.f10450i.setOnItemClickListener(this);
        this.f10450i.setModal(true);
        View view2 = this.f10455n;
        boolean z4 = this.f10457p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f10457p = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f10451j);
        }
        view2.addOnAttachStateChangeListener(this.f10452k);
        this.f10450i.setAnchorView(view2);
        this.f10450i.setDropDownGravity(this.f10461t);
        if (!this.f10459r) {
            this.f10460s = h.l(this.f10445d, null, this.f10443b, this.f10447f);
            this.f10459r = true;
        }
        this.f10450i.setContentWidth(this.f10460s);
        this.f10450i.setInputMethodMode(2);
        this.f10450i.setEpicenterBounds(k());
        this.f10450i.show();
        ListView listView = this.f10450i.getListView();
        listView.setOnKeyListener(this);
        if (this.f10462u && this.f10444c.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f10443b).inflate(e.g.f36333l, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f10444c.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f10450i.setAdapter(this.f10445d);
        this.f10450i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z4) {
        if (eVar != this.f10444c) {
            return;
        }
        dismiss();
        j.a aVar = this.f10456o;
        if (aVar != null) {
            aVar.a(eVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(boolean z4) {
        this.f10459r = false;
        d dVar = this.f10445d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c() {
        return false;
    }

    @Override // j.e
    public void dismiss() {
        if (isShowing()) {
            this.f10450i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(j.a aVar) {
        this.f10456o = aVar;
    }

    @Override // j.e
    public ListView getListView() {
        return this.f10450i.getListView();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f10443b, mVar, this.f10455n, this.f10446e, this.f10448g, this.f10449h);
            iVar.j(this.f10456o);
            iVar.g(h.u(mVar));
            iVar.i(this.f10453l);
            this.f10453l = null;
            this.f10444c.close(false);
            int horizontalOffset = this.f10450i.getHorizontalOffset();
            int verticalOffset = this.f10450i.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f10461t, this.f10454m.getLayoutDirection()) & 7) == 5) {
                horizontalOffset += this.f10454m.getWidth();
            }
            if (iVar.n(horizontalOffset, verticalOffset)) {
                j.a aVar = this.f10456o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void i(e eVar) {
    }

    @Override // j.e
    public boolean isShowing() {
        return !this.f10458q && this.f10450i.isShowing();
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(View view) {
        this.f10454m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void o(boolean z4) {
        this.f10445d.d(z4);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f10458q = true;
        this.f10444c.close();
        ViewTreeObserver viewTreeObserver = this.f10457p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f10457p = this.f10455n.getViewTreeObserver();
            }
            this.f10457p.removeGlobalOnLayoutListener(this.f10451j);
            this.f10457p = null;
        }
        this.f10455n.removeOnAttachStateChangeListener(this.f10452k);
        PopupWindow.OnDismissListener onDismissListener = this.f10453l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f10461t = i4;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(int i4) {
        this.f10450i.setHorizontalOffset(i4);
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f10453l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(boolean z4) {
        this.f10462u = z4;
    }

    @Override // j.e
    public void show() {
        if (!w()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i4) {
        this.f10450i.setVerticalOffset(i4);
    }
}
