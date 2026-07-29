package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* renamed from: d, reason: collision with root package name */
    private MenuBuilder f1752d;
    private MenuItemImpl e;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.f1752d = menuBuilder;
        this.e = menuItemImpl;
    }

    @Override // android.support.v7.view.menu.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1752d.setQwertyMode(z);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public boolean b() {
        return this.f1752d.b();
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public boolean c() {
        return this.f1752d.c();
    }

    public Menu s() {
        return this.f1752d;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.e;
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public void a(MenuBuilder.a aVar) {
        this.f1752d.a(aVar);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public MenuBuilder p() {
        return this.f1752d.p();
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.a(menuBuilder, menuItem) || this.f1752d.a(menuBuilder, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.e(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.d(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a(view);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public boolean c(MenuItemImpl menuItemImpl) {
        return this.f1752d.c(menuItemImpl);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public boolean d(MenuItemImpl menuItemImpl) {
        return this.f1752d.d(menuItemImpl);
    }

    @Override // android.support.v7.view.menu.MenuBuilder
    public String a() {
        int itemId = this.e != null ? this.e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }
}
