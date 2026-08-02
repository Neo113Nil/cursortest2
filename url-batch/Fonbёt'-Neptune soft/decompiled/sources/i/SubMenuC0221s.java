package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: i.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0221s extends MenuC0211i implements SubMenu {
    public final MenuC0211i v;

    /* renamed from: w, reason: collision with root package name */
    public final MenuItemC0212j f2486w;

    public SubMenuC0221s(Context context, MenuC0211i menuC0211i, MenuItemC0212j menuItemC0212j) {
        super(context);
        this.v = menuC0211i;
        this.f2486w = menuItemC0212j;
    }

    @Override // i.MenuC0211i
    public final boolean d(MenuItemC0212j menuItemC0212j) {
        return this.v.d(menuItemC0212j);
    }

    @Override // i.MenuC0211i
    public final boolean e(MenuC0211i menuC0211i, MenuItem menuItem) {
        super.e(menuC0211i, menuItem);
        return this.v.e(menuC0211i, menuItem);
    }

    @Override // i.MenuC0211i
    public final boolean f(MenuItemC0212j menuItemC0212j) {
        return this.v.f(menuItemC0212j);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2486w;
    }

    @Override // i.MenuC0211i
    public final MenuC0211i j() {
        return this.v.j();
    }

    @Override // i.MenuC0211i
    public final boolean l() {
        return this.v.l();
    }

    @Override // i.MenuC0211i
    public final boolean m() {
        return this.v.m();
    }

    @Override // i.MenuC0211i
    public final boolean n() {
        return this.v.n();
    }

    @Override // i.MenuC0211i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.v.setGroupDividerEnabled(z2);
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
        this.f2486w.setIcon(drawable);
        return this;
    }

    @Override // i.MenuC0211i, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.v.setQwertyMode(z2);
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
        this.f2486w.setIcon(i2);
        return this;
    }
}
