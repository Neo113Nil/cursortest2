package l;

import Z.V;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0156E extends MenuC0169m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0171o f2753A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0169m f2754z;

    public SubMenuC0156E(Context context, MenuC0169m menuC0169m, C0171o c0171o) {
        super(context);
        this.f2754z = menuC0169m;
        this.f2753A = c0171o;
    }

    @Override // l.MenuC0169m
    public final boolean d(C0171o c0171o) {
        return this.f2754z.d(c0171o);
    }

    @Override // l.MenuC0169m
    public final boolean e(MenuC0169m menuC0169m, MenuItem menuItem) {
        return super.e(menuC0169m, menuItem) || this.f2754z.e(menuC0169m, menuItem);
    }

    @Override // l.MenuC0169m
    public final boolean f(C0171o c0171o) {
        return this.f2754z.f(c0171o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2753A;
    }

    @Override // l.MenuC0169m
    public final String j() {
        C0171o c0171o = this.f2753A;
        int i = c0171o != null ? c0171o.f2843a : 0;
        if (i == 0) {
            return null;
        }
        return V.e("android:menu:actionviewstates:", i);
    }

    @Override // l.MenuC0169m
    public final MenuC0169m k() {
        return this.f2754z.k();
    }

    @Override // l.MenuC0169m
    public final boolean m() {
        return this.f2754z.m();
    }

    @Override // l.MenuC0169m
    public final boolean n() {
        return this.f2754z.n();
    }

    @Override // l.MenuC0169m
    public final boolean o() {
        return this.f2754z.o();
    }

    @Override // l.MenuC0169m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2754z.setGroupDividerEnabled(z2);
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
        this.f2753A.setIcon(drawable);
        return this;
    }

    @Override // l.MenuC0169m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2754z.setQwertyMode(z2);
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
        this.f2753A.setIcon(i);
        return this;
    }
}
