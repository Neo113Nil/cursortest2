package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.l;
import android.support.v7.widget.MenuPopupWindow;
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

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
final class q extends j implements l, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final MenuPopupWindow f1795a;

    /* renamed from: b, reason: collision with root package name */
    View f1796b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1797c;

    /* renamed from: d, reason: collision with root package name */
    private final MenuBuilder f1798d;
    private final f e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    private PopupWindow.OnDismissListener l;
    private View m;
    private l.a n;
    private ViewTreeObserver o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    private final ViewTreeObserver.OnGlobalLayoutListener j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.q.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.isShowing() || q.this.f1795a.isModal()) {
                return;
            }
            View view = q.this.f1796b;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f1795a.show();
            }
        }
    };
    private final View.OnAttachStateChangeListener k = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.q.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (q.this.o != null) {
                if (!q.this.o.isAlive()) {
                    q.this.o = view.getViewTreeObserver();
                }
                q.this.o.removeGlobalOnLayoutListener(q.this.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int s = 0;

    @Override // android.support.v7.view.menu.j
    public void a(MenuBuilder menuBuilder) {
    }

    @Override // android.support.v7.view.menu.l
    public boolean flagActionItems() {
        return false;
    }

    public q(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f1797c = context;
        this.f1798d = menuBuilder;
        this.f = z;
        this.e = new f(menuBuilder, LayoutInflater.from(context), this.f);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = view;
        this.f1795a = new MenuPopupWindow(this.f1797c, null, this.h, this.i);
        menuBuilder.a(this, context);
    }

    @Override // android.support.v7.view.menu.j
    public void a(boolean z) {
        this.e.a(z);
    }

    @Override // android.support.v7.view.menu.j
    public void a(int i) {
        this.s = i;
    }

    private boolean c() {
        if (isShowing()) {
            return true;
        }
        if (this.p || this.m == null) {
            return false;
        }
        this.f1796b = this.m;
        this.f1795a.setOnDismissListener(this);
        this.f1795a.setOnItemClickListener(this);
        this.f1795a.setModal(true);
        View view = this.f1796b;
        boolean z = this.o == null;
        this.o = view.getViewTreeObserver();
        if (z) {
            this.o.addOnGlobalLayoutListener(this.j);
        }
        view.addOnAttachStateChangeListener(this.k);
        this.f1795a.setAnchorView(view);
        this.f1795a.setDropDownGravity(this.s);
        if (!this.q) {
            this.r = a(this.e, null, this.f1797c, this.g);
            this.q = true;
        }
        this.f1795a.setContentWidth(this.r);
        this.f1795a.setInputMethodMode(2);
        this.f1795a.setEpicenterBounds(b());
        this.f1795a.show();
        ListView listView = this.f1795a.getListView();
        listView.setOnKeyListener(this);
        if (this.t && this.f1798d.m() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1797c).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f1798d.m());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f1795a.setAdapter(this.e);
        this.f1795a.show();
        return true;
    }

    @Override // android.support.v7.view.menu.p
    public void show() {
        if (!c()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.p
    public void dismiss() {
        if (isShowing()) {
            this.f1795a.dismiss();
        }
    }

    @Override // android.support.v7.view.menu.p
    public boolean isShowing() {
        return !this.p && this.f1795a.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.p = true;
        this.f1798d.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.f1796b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.j);
            this.o = null;
        }
        this.f1796b.removeOnAttachStateChangeListener(this.k);
        if (this.l != null) {
            this.l.onDismiss();
        }
    }

    @Override // android.support.v7.view.menu.l
    public void updateMenuView(boolean z) {
        this.q = false;
        if (this.e != null) {
            this.e.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.l
    public void setCallback(l.a aVar) {
        this.n = aVar;
    }

    @Override // android.support.v7.view.menu.l
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            k kVar = new k(this.f1797c, subMenuBuilder, this.f1796b, this.f, this.h, this.i);
            kVar.setPresenterCallback(this.n);
            kVar.setForceShowIcon(j.b(subMenuBuilder));
            kVar.setGravity(this.s);
            kVar.setOnDismissListener(this.l);
            this.l = null;
            this.f1798d.a(false);
            if (kVar.tryShow(this.f1795a.getHorizontalOffset(), this.f1795a.getVerticalOffset())) {
                if (this.n == null) {
                    return true;
                }
                this.n.onOpenSubMenu(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.f1798d) {
            return;
        }
        dismiss();
        if (this.n != null) {
            this.n.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.support.v7.view.menu.j
    public void a(View view) {
        this.m = view;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.support.v7.view.menu.j
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // android.support.v7.view.menu.p
    public ListView getListView() {
        return this.f1795a.getListView();
    }

    @Override // android.support.v7.view.menu.j
    public void b(int i) {
        this.f1795a.setHorizontalOffset(i);
    }

    @Override // android.support.v7.view.menu.j
    public void c(int i) {
        this.f1795a.setVerticalOffset(i);
    }

    @Override // android.support.v7.view.menu.j
    public void b(boolean z) {
        this.t = z;
    }
}
