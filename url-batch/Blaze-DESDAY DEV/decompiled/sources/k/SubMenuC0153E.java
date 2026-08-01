package k;

import Y.V;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0153E extends MenuC0166m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0168o f2653A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0166m f2654z;

    public SubMenuC0153E(Context context, MenuC0166m menuC0166m, C0168o c0168o) {
        super(context);
        this.f2654z = menuC0166m;
        this.f2653A = c0168o;
    }

    @Override // k.MenuC0166m
    public final boolean d(C0168o c0168o) {
        return this.f2654z.d(c0168o);
    }

    @Override // k.MenuC0166m
    public final boolean e(MenuC0166m menuC0166m, MenuItem menuItem) {
        return super.e(menuC0166m, menuItem) || this.f2654z.e(menuC0166m, menuItem);
    }

    @Override // k.MenuC0166m
    public final boolean f(C0168o c0168o) {
        return this.f2654z.f(c0168o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2653A;
    }

    @Override // k.MenuC0166m
    public final String j() {
        C0168o c0168o = this.f2653A;
        int i = c0168o != null ? c0168o.f2740a : 0;
        if (i == 0) {
            return null;
        }
        return V.e("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0166m
    public final MenuC0166m k() {
        return this.f2654z.k();
    }

    @Override // k.MenuC0166m
    public final boolean m() {
        return this.f2654z.m();
    }

    @Override // k.MenuC0166m
    public final boolean n() {
        return this.f2654z.n();
    }

    @Override // k.MenuC0166m
    public final boolean o() {
        return this.f2654z.o();
    }

    @Override // k.MenuC0166m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2654z.setGroupDividerEnabled(z2);
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
        this.f2653A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0166m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2654z.setQwertyMode(z2);
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
        this.f2653A.setIcon(i);
        return this;
    }
}
