package k;

import X.V;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0148E extends MenuC0161m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final C0163o f2552A;

    /* renamed from: z, reason: collision with root package name */
    public final MenuC0161m f2553z;

    public SubMenuC0148E(Context context, MenuC0161m menuC0161m, C0163o c0163o) {
        super(context);
        this.f2553z = menuC0161m;
        this.f2552A = c0163o;
    }

    @Override // k.MenuC0161m
    public final boolean d(C0163o c0163o) {
        return this.f2553z.d(c0163o);
    }

    @Override // k.MenuC0161m
    public final boolean e(MenuC0161m menuC0161m, MenuItem menuItem) {
        return super.e(menuC0161m, menuItem) || this.f2553z.e(menuC0161m, menuItem);
    }

    @Override // k.MenuC0161m
    public final boolean f(C0163o c0163o) {
        return this.f2553z.f(c0163o);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2552A;
    }

    @Override // k.MenuC0161m
    public final String j() {
        C0163o c0163o = this.f2552A;
        int i = c0163o != null ? c0163o.f2639a : 0;
        if (i == 0) {
            return null;
        }
        return V.d("android:menu:actionviewstates:", i);
    }

    @Override // k.MenuC0161m
    public final MenuC0161m k() {
        return this.f2553z.k();
    }

    @Override // k.MenuC0161m
    public final boolean m() {
        return this.f2553z.m();
    }

    @Override // k.MenuC0161m
    public final boolean n() {
        return this.f2553z.n();
    }

    @Override // k.MenuC0161m
    public final boolean o() {
        return this.f2553z.o();
    }

    @Override // k.MenuC0161m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2553z.setGroupDividerEnabled(z2);
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
        this.f2552A.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0161m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2553z.setQwertyMode(z2);
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
        this.f2552A.setIcon(i);
        return this;
    }
}
