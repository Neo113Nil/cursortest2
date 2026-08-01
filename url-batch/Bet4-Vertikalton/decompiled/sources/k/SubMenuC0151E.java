package k;

import Y.V;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0151E extends MenuC0164m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0166o f2625A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0164m f2626z;

    public SubMenuC0151E(Context context, MenuC0164m menuC0164m, C0166o c0166o) {
        super(context);
        this.f2626z = menuC0164m;
        this.f2625A = c0166o;
    }

    @Override // k.MenuC0164m
    public final boolean d(C0166o c0166o) {
        return this.f2626z.d(c0166o);
    }

    @Override // k.MenuC0164m
    public final boolean e(MenuC0164m menuC0164m, MenuItem menuItem) {
        return super.e(menuC0164m, menuItem) || this.f2626z.e(menuC0164m, menuItem);
    }

    @Override // k.MenuC0164m
    public final boolean f(C0166o c0166o) {
        return this.f2626z.f(c0166o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2625A;
    }

    @Override // k.MenuC0164m
    public final String j() {
        C0166o c0166o = this.f2625A;
        int i = c0166o != null ? c0166o.f2712a : 0;
        if (i == 0) {
            return null;
        }
        return V.e("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0164m
    public final MenuC0164m k() {
        return this.f2626z.k();
    }

    @Override // k.MenuC0164m
    public final boolean m() {
        return this.f2626z.m();
    }

    @Override // k.MenuC0164m
    public final boolean n() {
        return this.f2626z.n();
    }

    @Override // k.MenuC0164m
    public final boolean o() {
        return this.f2626z.o();
    }

    @Override // k.MenuC0164m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2626z.setGroupDividerEnabled(z2);
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
        this.f2625A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0164m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2626z.setQwertyMode(z2);
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
        this.f2625A.setIcon(i);
        return this;
    }
}
