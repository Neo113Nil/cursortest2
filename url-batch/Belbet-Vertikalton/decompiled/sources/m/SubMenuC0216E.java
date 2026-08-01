package m;

import G1.AbstractC0001b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0216E extends MenuC0229m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0231o f3288A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0229m f3289z;

    public SubMenuC0216E(Context context, MenuC0229m menuC0229m, C0231o c0231o) {
        super(context);
        this.f3289z = menuC0229m;
        this.f3288A = c0231o;
    }

    @Override // m.MenuC0229m
    public final boolean d(C0231o c0231o) {
        return this.f3289z.d(c0231o);
    }

    @Override // m.MenuC0229m
    public final boolean e(MenuC0229m menuC0229m, MenuItem menuItem) {
        return super.e(menuC0229m, menuItem) || this.f3289z.e(menuC0229m, menuItem);
    }

    @Override // m.MenuC0229m
    public final boolean f(C0231o c0231o) {
        return this.f3289z.f(c0231o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3288A;
    }

    @Override // m.MenuC0229m
    public final String j() {
        C0231o c0231o = this.f3288A;
        int i = c0231o != null ? c0231o.f3375a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC0001b.e("android:menu:actionviewstates:", i);
    }

    @Override // m.MenuC0229m
    public final MenuC0229m k() {
        return this.f3289z.k();
    }

    @Override // m.MenuC0229m
    public final boolean m() {
        return this.f3289z.m();
    }

    @Override // m.MenuC0229m
    public final boolean n() {
        return this.f3289z.n();
    }

    @Override // m.MenuC0229m
    public final boolean o() {
        return this.f3289z.o();
    }

    @Override // m.MenuC0229m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3289z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3288A.setIcon(drawable);
        return this;
    }

    @Override // m.MenuC0229m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3289z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f3288A.setIcon(i);
        return this;
    }
}
