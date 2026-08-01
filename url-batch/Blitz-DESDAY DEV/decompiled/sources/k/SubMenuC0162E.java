package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0162E extends m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final o f2705A;

    /* renamed from: z, reason: collision with root package name */
    public final m f2706z;

    public SubMenuC0162E(Context context, m mVar, o oVar) {
        super(context);
        this.f2706z = mVar;
        this.f2705A = oVar;
    }

    @Override // k.m
    public final boolean d(o oVar) {
        return this.f2706z.d(oVar);
    }

    @Override // k.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f2706z.e(mVar, menuItem);
    }

    @Override // k.m
    public final boolean f(o oVar) {
        return this.f2706z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2705A;
    }

    @Override // k.m
    public final String j() {
        o oVar = this.f2705A;
        int i = oVar != null ? oVar.f2792a : 0;
        if (i == 0) {
            return null;
        }
        return X0.a.e("android:menu:actionviewstates:", i);
    }

    @Override // k.m
    public final m k() {
        return this.f2706z.k();
    }

    @Override // k.m
    public final boolean m() {
        return this.f2706z.m();
    }

    @Override // k.m
    public final boolean n() {
        return this.f2706z.n();
    }

    @Override // k.m
    public final boolean o() {
        return this.f2706z.o();
    }

    @Override // k.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2706z.setGroupDividerEnabled(z2);
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
        this.f2705A.setIcon(drawable);
        return this;
    }

    @Override // k.m, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2706z.setQwertyMode(z2);
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
        this.f2705A.setIcon(i);
        return this;
    }
}
