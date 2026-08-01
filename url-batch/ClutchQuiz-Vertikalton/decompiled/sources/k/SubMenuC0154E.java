package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0154E extends MenuC0167m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0169o f2686A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0167m f2687z;

    public SubMenuC0154E(Context context, MenuC0167m menuC0167m, C0169o c0169o) {
        super(context);
        this.f2687z = menuC0167m;
        this.f2686A = c0169o;
    }

    @Override // k.MenuC0167m
    public final boolean d(C0169o c0169o) {
        return this.f2687z.d(c0169o);
    }

    @Override // k.MenuC0167m
    public final boolean e(MenuC0167m menuC0167m, MenuItem menuItem) {
        return super.e(menuC0167m, menuItem) || this.f2687z.e(menuC0167m, menuItem);
    }

    @Override // k.MenuC0167m
    public final boolean f(C0169o c0169o) {
        return this.f2687z.f(c0169o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2686A;
    }

    @Override // k.MenuC0167m
    public final String j() {
        C0169o c0169o = this.f2686A;
        int i = c0169o != null ? c0169o.f2773a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // k.MenuC0167m
    public final MenuC0167m k() {
        return this.f2687z.k();
    }

    @Override // k.MenuC0167m
    public final boolean m() {
        return this.f2687z.m();
    }

    @Override // k.MenuC0167m
    public final boolean n() {
        return this.f2687z.n();
    }

    @Override // k.MenuC0167m
    public final boolean o() {
        return this.f2687z.o();
    }

    @Override // k.MenuC0167m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2687z.setGroupDividerEnabled(z2);
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
        this.f2686A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0167m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2687z.setQwertyMode(z2);
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
        this.f2686A.setIcon(i);
        return this;
    }
}
