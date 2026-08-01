package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0187E extends MenuC0200m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0202o f2992A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0200m f2993z;

    public SubMenuC0187E(Context context, MenuC0200m menuC0200m, C0202o c0202o) {
        super(context);
        this.f2993z = menuC0200m;
        this.f2992A = c0202o;
    }

    @Override // k.MenuC0200m
    public final boolean d(C0202o c0202o) {
        return this.f2993z.d(c0202o);
    }

    @Override // k.MenuC0200m
    public final boolean e(MenuC0200m menuC0200m, MenuItem menuItem) {
        return super.e(menuC0200m, menuItem) || this.f2993z.e(menuC0200m, menuItem);
    }

    @Override // k.MenuC0200m
    public final boolean f(C0202o c0202o) {
        return this.f2993z.f(c0202o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2992A;
    }

    @Override // k.MenuC0200m
    public final String j() {
        C0202o c0202o = this.f2992A;
        int i = c0202o != null ? c0202o.f3085a : 0;
        if (i == 0) {
            return null;
        }
        return X0.e.d("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0200m
    public final MenuC0200m k() {
        return this.f2993z.k();
    }

    @Override // k.MenuC0200m
    public final boolean m() {
        return this.f2993z.m();
    }

    @Override // k.MenuC0200m
    public final boolean n() {
        return this.f2993z.n();
    }

    @Override // k.MenuC0200m
    public final boolean o() {
        return this.f2993z.o();
    }

    @Override // k.MenuC0200m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2993z.setGroupDividerEnabled(z2);
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
        this.f2992A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0200m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2993z.setQwertyMode(z2);
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
        this.f2992A.setIcon(i);
        return this;
    }
}
