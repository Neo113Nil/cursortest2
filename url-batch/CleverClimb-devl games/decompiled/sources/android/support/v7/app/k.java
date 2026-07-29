package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.a;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.l;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
class k extends android.support.v7.app.a {

    /* renamed from: a, reason: collision with root package name */
    DecorToolbar f1654a;

    /* renamed from: b, reason: collision with root package name */
    boolean f1655b;

    /* renamed from: c, reason: collision with root package name */
    Window.Callback f1656c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1657d;
    private boolean e;
    private ArrayList<a.b> f = new ArrayList<>();
    private final Runnable g = new Runnable() { // from class: android.support.v7.app.k.1
        @Override // java.lang.Runnable
        public void run() {
            k.this.i();
        }
    };
    private final Toolbar.OnMenuItemClickListener h = new Toolbar.OnMenuItemClickListener() { // from class: android.support.v7.app.k.2
        @Override // android.support.v7.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.f1656c.onMenuItemSelected(0, menuItem);
        }
    };

    @Override // android.support.v7.app.a
    public void a(boolean z) {
    }

    @Override // android.support.v7.app.a
    public void c(boolean z) {
    }

    @Override // android.support.v7.app.a
    public void d(boolean z) {
    }

    k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f1654a = new ToolbarWidgetWrapper(toolbar, false);
        this.f1656c = new c(callback);
        this.f1654a.setWindowCallback(this.f1656c);
        toolbar.setOnMenuItemClickListener(this.h);
        this.f1654a.setWindowTitle(charSequence);
    }

    public Window.Callback h() {
        return this.f1656c;
    }

    @Override // android.support.v7.app.a
    public void a(float f) {
        ViewCompat.setElevation(this.f1654a.getViewGroup(), f);
    }

    @Override // android.support.v7.app.a
    public Context b() {
        return this.f1654a.getContext();
    }

    @Override // android.support.v7.app.a
    public void a(int i) {
        this.f1654a.setNavigationContentDescription(i);
    }

    @Override // android.support.v7.app.a
    public void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // android.support.v7.app.a
    public void a(CharSequence charSequence) {
        this.f1654a.setWindowTitle(charSequence);
    }

    @Override // android.support.v7.app.a
    public int a() {
        return this.f1654a.getDisplayOptions();
    }

    @Override // android.support.v7.app.a
    public boolean c() {
        return this.f1654a.showOverflowMenu();
    }

    @Override // android.support.v7.app.a
    public boolean d() {
        return this.f1654a.hideOverflowMenu();
    }

    @Override // android.support.v7.app.a
    public boolean e() {
        this.f1654a.getViewGroup().removeCallbacks(this.g);
        ViewCompat.postOnAnimation(this.f1654a.getViewGroup(), this.g);
        return true;
    }

    @Override // android.support.v7.app.a
    public boolean f() {
        if (!this.f1654a.hasExpandedActionView()) {
            return false;
        }
        this.f1654a.collapseActionView();
        return true;
    }

    void i() {
        Menu j = j();
        MenuBuilder menuBuilder = j instanceof MenuBuilder ? (MenuBuilder) j : null;
        if (menuBuilder != null) {
            menuBuilder.g();
        }
        try {
            j.clear();
            if (!this.f1656c.onCreatePanelMenu(0, j) || !this.f1656c.onPreparePanel(0, null, j)) {
                j.clear();
            }
        } finally {
            if (menuBuilder != null) {
                menuBuilder.h();
            }
        }
    }

    @Override // android.support.v7.app.a
    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            c();
        }
        return true;
    }

    @Override // android.support.v7.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu j = j();
        if (j == null) {
            return false;
        }
        j.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return j.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.app.a
    void g() {
        this.f1654a.getViewGroup().removeCallbacks(this.g);
    }

    @Override // android.support.v7.app.a
    public void e(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i).a(z);
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private class c extends android.support.v7.view.i {
        public c(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !k.this.f1655b) {
                k.this.f1654a.setMenuPrepared();
                k.this.f1655b = true;
            }
            return onPreparePanel;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(k.this.f1654a.getContext());
            }
            return super.onCreatePanelView(i);
        }
    }

    private Menu j() {
        if (!this.f1657d) {
            this.f1654a.setMenuCallbacks(new a(), new b());
            this.f1657d = true;
        }
        return this.f1654a.getMenu();
    }

    /* compiled from: ToolbarActionBar.java */
    private final class a implements l.a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f1661b;

        a() {
        }

        @Override // android.support.v7.view.menu.l.a
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (k.this.f1656c == null) {
                return false;
            }
            k.this.f1656c.onMenuOpened(108, menuBuilder);
            return true;
        }

        @Override // android.support.v7.view.menu.l.a
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (this.f1661b) {
                return;
            }
            this.f1661b = true;
            k.this.f1654a.dismissPopupMenus();
            if (k.this.f1656c != null) {
                k.this.f1656c.onPanelClosed(108, menuBuilder);
            }
            this.f1661b = false;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    private final class b implements MenuBuilder.a {
        @Override // android.support.v7.view.menu.MenuBuilder.a
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        b() {
        }

        @Override // android.support.v7.view.menu.MenuBuilder.a
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (k.this.f1656c != null) {
                if (k.this.f1654a.isOverflowMenuShowing()) {
                    k.this.f1656c.onPanelClosed(108, menuBuilder);
                } else if (k.this.f1656c.onPreparePanel(0, null, menuBuilder)) {
                    k.this.f1656c.onMenuOpened(108, menuBuilder);
                }
            }
        }
    }
}
