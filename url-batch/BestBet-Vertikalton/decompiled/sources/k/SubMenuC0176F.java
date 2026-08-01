package k;

import G1.AbstractC0001b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0176F extends MenuC0189m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0192p f3103A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0189m f3104z;

    public SubMenuC0176F(Context context, MenuC0189m menuC0189m, C0192p c0192p) {
        super(context);
        this.f3104z = menuC0189m;
        this.f3103A = c0192p;
    }

    @Override // k.MenuC0189m
    public final boolean d(C0192p c0192p) {
        return this.f3104z.d(c0192p);
    }

    @Override // k.MenuC0189m
    public final boolean e(MenuC0189m menuC0189m, MenuItem menuItem) {
        return super.e(menuC0189m, menuItem) || this.f3104z.e(menuC0189m, menuItem);
    }

    @Override // k.MenuC0189m
    public final boolean f(C0192p c0192p) {
        return this.f3104z.f(c0192p);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3103A;
    }

    @Override // k.MenuC0189m
    public final String j() {
        C0192p c0192p = this.f3103A;
        int i = c0192p != null ? c0192p.f3191a : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC0001b.f("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0189m
    public final MenuC0189m k() {
        return this.f3104z.k();
    }

    @Override // k.MenuC0189m
    public final boolean m() {
        return this.f3104z.m();
    }

    @Override // k.MenuC0189m
    public final boolean n() {
        return this.f3104z.n();
    }

    @Override // k.MenuC0189m
    public final boolean o() {
        return this.f3104z.o();
    }

    @Override // k.MenuC0189m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3104z.setGroupDividerEnabled(z2);
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
        this.f3103A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0189m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3104z.setQwertyMode(z2);
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
        this.f3103A.setIcon(i);
        return this;
    }
}
