package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.l;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.MenuPopupWindow;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
final class d extends j implements l, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final Handler f1757a;

    /* renamed from: c, reason: collision with root package name */
    View f1759c;

    /* renamed from: d, reason: collision with root package name */
    boolean f1760d;
    private final Context e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private View p;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean w;
    private l.a x;
    private ViewTreeObserver y;
    private PopupWindow.OnDismissListener z;
    private final List<MenuBuilder> j = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    final List<a> f1758b = new ArrayList();
    private final ViewTreeObserver.OnGlobalLayoutListener k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.view.menu.d.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.isShowing() || d.this.f1758b.size() <= 0 || d.this.f1758b.get(0).f1768a.isModal()) {
                return;
            }
            View view = d.this.f1759c;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<a> it = d.this.f1758b.iterator();
            while (it.hasNext()) {
                it.next().f1768a.show();
            }
        }
    };
    private final View.OnAttachStateChangeListener l = new View.OnAttachStateChangeListener() { // from class: android.support.v7.view.menu.d.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d.this.y != null) {
                if (!d.this.y.isAlive()) {
                    d.this.y = view.getViewTreeObserver();
                }
                d.this.y.removeGlobalOnLayoutListener(d.this.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final MenuItemHoverListener m = new MenuItemHoverListener() { // from class: android.support.v7.view.menu.d.3
        @Override // android.support.v7.widget.MenuItemHoverListener
        public void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem) {
            d.this.f1757a.removeCallbacksAndMessages(menuBuilder);
        }

        @Override // android.support.v7.widget.MenuItemHoverListener
        public void onItemHoverEnter(final MenuBuilder menuBuilder, final MenuItem menuItem) {
            d.this.f1757a.removeCallbacksAndMessages(null);
            int size = d.this.f1758b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == d.this.f1758b.get(i).f1769b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final a aVar = i2 < d.this.f1758b.size() ? d.this.f1758b.get(i2) : null;
            d.this.f1757a.postAtTime(new Runnable() { // from class: android.support.v7.view.menu.d.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aVar != null) {
                        d.this.f1760d = true;
                        aVar.f1769b.a(false);
                        d.this.f1760d = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.a(menuItem, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }
    };
    private int n = 0;
    private int o = 0;
    private boolean v = false;
    private int q = d();

    @Override // android.support.v7.view.menu.j
    protected boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean flagActionItems() {
        return false;
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.e = context;
        this.p = view;
        this.g = i;
        this.h = i2;
        this.i = z;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1757a = new Handler();
    }

    @Override // android.support.v7.view.menu.j
    public void a(boolean z) {
        this.v = z;
    }

    private MenuPopupWindow c() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.e, null, this.g, this.h);
        menuPopupWindow.setHoverListener(this.m);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.p);
        menuPopupWindow.setDropDownGravity(this.o);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    @Override // android.support.v7.view.menu.p
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator<MenuBuilder> it = this.j.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        this.j.clear();
        this.f1759c = this.p;
        if (this.f1759c != null) {
            boolean z = this.y == null;
            this.y = this.f1759c.getViewTreeObserver();
            if (z) {
                this.y.addOnGlobalLayoutListener(this.k);
            }
            this.f1759c.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // android.support.v7.view.menu.p
    public void dismiss() {
        int size = this.f1758b.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.f1758b.toArray(new a[size]);
            for (int i = size - 1; i >= 0; i--) {
                a aVar = aVarArr[i];
                if (aVar.f1768a.isShowing()) {
                    aVar.f1768a.dismiss();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    private int d() {
        return ViewCompat.getLayoutDirection(this.p) == 1 ? 0 : 1;
    }

    private int d(int i) {
        ListView a2 = this.f1758b.get(this.f1758b.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1759c.getWindowVisibleDisplayFrame(rect);
        return this.q == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // android.support.v7.view.menu.j
    public void a(MenuBuilder menuBuilder) {
        menuBuilder.a(this, this.e);
        if (isShowing()) {
            c(menuBuilder);
        } else {
            this.j.add(menuBuilder);
        }
    }

    private void c(MenuBuilder menuBuilder) {
        a aVar;
        View view;
        int i;
        int i2;
        int width;
        LayoutInflater from = LayoutInflater.from(this.e);
        f fVar = new f(menuBuilder, from, this.i);
        if (!isShowing() && this.v) {
            fVar.a(true);
        } else if (isShowing()) {
            fVar.a(j.b(menuBuilder));
        }
        int a2 = a(fVar, null, this.e, this.f);
        MenuPopupWindow c2 = c();
        c2.setAdapter(fVar);
        c2.setContentWidth(a2);
        c2.setDropDownGravity(this.o);
        if (this.f1758b.size() > 0) {
            aVar = this.f1758b.get(this.f1758b.size() - 1);
            view = a(aVar, menuBuilder);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            c2.setTouchModal(false);
            c2.setEnterTransition(null);
            int d2 = d(a2);
            boolean z = d2 == 1;
            this.q = d2;
            if (Build.VERSION.SDK_INT >= 26) {
                c2.setAnchorView(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) == 5) {
                width = z ? i + a2 : i - view.getWidth();
            } else {
                width = z ? i + view.getWidth() : i - a2;
            }
            c2.setHorizontalOffset(width);
            c2.setOverlapAnchor(true);
            c2.setVerticalOffset(i2);
        } else {
            if (this.r) {
                c2.setHorizontalOffset(this.t);
            }
            if (this.s) {
                c2.setVerticalOffset(this.u);
            }
            c2.setEpicenterBounds(b());
        }
        this.f1758b.add(new a(c2, menuBuilder, this.q));
        c2.show();
        ListView listView = c2.getListView();
        listView.setOnKeyListener(this);
        if (aVar == null && this.w && menuBuilder.m() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.m());
            listView.addHeaderView(frameLayout, null, false);
            c2.show();
        }
    }

    private MenuItem a(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(a aVar, MenuBuilder menuBuilder) {
        f fVar;
        int i;
        int firstVisiblePosition;
        MenuItem a2 = a(aVar.f1769b, menuBuilder);
        if (a2 == null) {
            return null;
        }
        ListView a3 = aVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (a2 == fVar.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
            return a3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // android.support.v7.view.menu.p
    public boolean isShowing() {
        return this.f1758b.size() > 0 && this.f1758b.get(0).f1768a.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        a aVar;
        int size = this.f1758b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f1758b.get(i);
            if (!aVar.f1768a.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (aVar != null) {
            aVar.f1769b.a(false);
        }
    }

    @Override // android.support.v7.view.menu.l
    public void updateMenuView(boolean z) {
        Iterator<a> it = this.f1758b.iterator();
        while (it.hasNext()) {
            a(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.l
    public void setCallback(l.a aVar) {
        this.x = aVar;
    }

    @Override // android.support.v7.view.menu.l
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        for (a aVar : this.f1758b) {
            if (subMenuBuilder == aVar.f1769b) {
                aVar.a().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        a(subMenuBuilder);
        if (this.x != null) {
            this.x.onOpenSubMenu(subMenuBuilder);
        }
        return true;
    }

    private int d(MenuBuilder menuBuilder) {
        int size = this.f1758b.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == this.f1758b.get(i).f1769b) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.support.v7.view.menu.l
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int d2 = d(menuBuilder);
        if (d2 < 0) {
            return;
        }
        int i = d2 + 1;
        if (i < this.f1758b.size()) {
            this.f1758b.get(i).f1769b.a(false);
        }
        a remove = this.f1758b.remove(d2);
        remove.f1769b.b(this);
        if (this.f1760d) {
            remove.f1768a.setExitTransition(null);
            remove.f1768a.setAnimationStyle(0);
        }
        remove.f1768a.dismiss();
        int size = this.f1758b.size();
        if (size > 0) {
            this.q = this.f1758b.get(size - 1).f1770c;
        } else {
            this.q = d();
        }
        if (size != 0) {
            if (z) {
                this.f1758b.get(0).f1769b.a(false);
                return;
            }
            return;
        }
        dismiss();
        if (this.x != null) {
            this.x.onCloseMenu(menuBuilder, true);
        }
        if (this.y != null) {
            if (this.y.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.k);
            }
            this.y = null;
        }
        this.f1759c.removeOnAttachStateChangeListener(this.l);
        this.z.onDismiss();
    }

    @Override // android.support.v7.view.menu.j
    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this.p));
        }
    }

    @Override // android.support.v7.view.menu.j
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = GravityCompat.getAbsoluteGravity(this.n, ViewCompat.getLayoutDirection(this.p));
        }
    }

    @Override // android.support.v7.view.menu.j
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // android.support.v7.view.menu.p
    public ListView getListView() {
        if (this.f1758b.isEmpty()) {
            return null;
        }
        return this.f1758b.get(this.f1758b.size() - 1).a();
    }

    @Override // android.support.v7.view.menu.j
    public void b(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // android.support.v7.view.menu.j
    public void c(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.support.v7.view.menu.j
    public void b(boolean z) {
        this.w = z;
    }

    /* compiled from: CascadingMenuPopup.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f1768a;

        /* renamed from: b, reason: collision with root package name */
        public final MenuBuilder f1769b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1770c;

        public a(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f1768a = menuPopupWindow;
            this.f1769b = menuBuilder;
            this.f1770c = i;
        }

        public ListView a() {
            return this.f1768a.getListView();
        }
    }
}
