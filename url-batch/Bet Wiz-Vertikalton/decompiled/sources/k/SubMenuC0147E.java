package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0147E extends MenuC0160m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0162o f2601A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0160m f2602z;

    public SubMenuC0147E(Context context, MenuC0160m menuC0160m, C0162o c0162o) {
        super(context);
        this.f2602z = menuC0160m;
        this.f2601A = c0162o;
    }

    @Override // k.MenuC0160m
    public final boolean d(C0162o c0162o) {
        return this.f2602z.d(c0162o);
    }

    @Override // k.MenuC0160m
    public final boolean e(MenuC0160m menuC0160m, MenuItem menuItem) {
        return super.e(menuC0160m, menuItem) || this.f2602z.e(menuC0160m, menuItem);
    }

    @Override // k.MenuC0160m
    public final boolean f(C0162o c0162o) {
        return this.f2602z.f(c0162o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2601A;
    }

    @Override // k.MenuC0160m
    public final String j() {
        C0162o c0162o = this.f2601A;
        int i = c0162o != null ? c0162o.f2688a : 0;
        if (i == 0) {
            return null;
        }
        return T0.c.d("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0160m
    public final MenuC0160m k() {
        return this.f2602z.k();
    }

    @Override // k.MenuC0160m
    public final boolean m() {
        return this.f2602z.m();
    }

    @Override // k.MenuC0160m
    public final boolean n() {
        return this.f2602z.n();
    }

    @Override // k.MenuC0160m
    public final boolean o() {
        return this.f2602z.o();
    }

    @Override // k.MenuC0160m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2602z.setGroupDividerEnabled(z2);
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
        this.f2601A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0160m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2602z.setQwertyMode(z2);
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
        this.f2601A.setIcon(i);
        return this;
    }
}
