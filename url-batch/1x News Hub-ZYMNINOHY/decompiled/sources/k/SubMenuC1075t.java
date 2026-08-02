package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC1075t extends MenuC1065j implements SubMenu {

    /* renamed from: w, reason: collision with root package name */
    public final MenuC1065j f9669w;

    /* renamed from: x, reason: collision with root package name */
    public final MenuItemC1066k f9670x;

    public SubMenuC1075t(Context context, MenuC1065j menuC1065j, MenuItemC1066k menuItemC1066k) {
        super(context);
        this.f9669w = menuC1065j;
        this.f9670x = menuItemC1066k;
    }

    @Override // k.MenuC1065j
    public final boolean d(MenuItemC1066k menuItemC1066k) {
        return this.f9669w.d(menuItemC1066k);
    }

    @Override // k.MenuC1065j
    public final boolean e(MenuC1065j menuC1065j, MenuItem menuItem) {
        super.e(menuC1065j, menuItem);
        return this.f9669w.e(menuC1065j, menuItem);
    }

    @Override // k.MenuC1065j
    public final boolean f(MenuItemC1066k menuItemC1066k) {
        return this.f9669w.f(menuItemC1066k);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f9670x;
    }

    @Override // k.MenuC1065j
    public final MenuC1065j j() {
        return this.f9669w.j();
    }

    @Override // k.MenuC1065j
    public final boolean l() {
        return this.f9669w.l();
    }

    @Override // k.MenuC1065j
    public final boolean m() {
        return this.f9669w.m();
    }

    @Override // k.MenuC1065j
    public final boolean n() {
        return this.f9669w.n();
    }

    @Override // k.MenuC1065j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f9669w.setGroupDividerEnabled(z);
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
        this.f9670x.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC1065j, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f9669w.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        q(0, null, i3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        q(i3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f9670x.setIcon(i3);
        return this;
    }
}
