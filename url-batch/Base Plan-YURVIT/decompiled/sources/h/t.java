package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends MenuC0143j implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final MenuC0143j f2086v;

    /* renamed from: w, reason: collision with root package name */
    public final MenuItemC0144k f2087w;

    public t(Context context, MenuC0143j menuC0143j, MenuItemC0144k menuItemC0144k) {
        super(context);
        this.f2086v = menuC0143j;
        this.f2087w = menuItemC0144k;
    }

    @Override // h.MenuC0143j
    public final boolean d(MenuItemC0144k menuItemC0144k) {
        return this.f2086v.d(menuItemC0144k);
    }

    @Override // h.MenuC0143j
    public final boolean e(MenuC0143j menuC0143j, MenuItem menuItem) {
        super.e(menuC0143j, menuItem);
        return this.f2086v.e(menuC0143j, menuItem);
    }

    @Override // h.MenuC0143j
    public final boolean f(MenuItemC0144k menuItemC0144k) {
        return this.f2086v.f(menuItemC0144k);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2087w;
    }

    @Override // h.MenuC0143j
    public final MenuC0143j j() {
        return this.f2086v.j();
    }

    @Override // h.MenuC0143j
    public final boolean l() {
        return this.f2086v.l();
    }

    @Override // h.MenuC0143j
    public final boolean m() {
        return this.f2086v.m();
    }

    @Override // h.MenuC0143j
    public final boolean n() {
        return this.f2086v.n();
    }

    @Override // h.MenuC0143j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2086v.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2087w.setIcon(drawable);
        return this;
    }

    @Override // h.MenuC0143j, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2086v.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f2087w.setIcon(i2);
        return this;
    }
}
