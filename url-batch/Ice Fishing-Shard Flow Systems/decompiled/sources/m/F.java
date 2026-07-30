package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class F extends m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final m f6344A;

    /* renamed from: B, reason: collision with root package name */
    public final o f6345B;

    public F(Context context, m mVar, o oVar) {
        super(context);
        this.f6344A = mVar;
        this.f6345B = oVar;
    }

    @Override // m.m
    public final boolean d(o oVar) {
        return this.f6344A.d(oVar);
    }

    @Override // m.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f6344A.e(mVar, menuItem);
    }

    @Override // m.m
    public final boolean f(o oVar) {
        return this.f6344A.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f6345B;
    }

    @Override // m.m
    public final String j() {
        o oVar = this.f6345B;
        int i2 = oVar != null ? oVar.f6440a : 0;
        if (i2 == 0) {
            return null;
        }
        return C4.p.g(i2, "android:menu:actionviewstates:");
    }

    @Override // m.m
    public final m k() {
        return this.f6344A.k();
    }

    @Override // m.m
    public final boolean m() {
        return this.f6344A.m();
    }

    @Override // m.m
    public final boolean n() {
        return this.f6344A.n();
    }

    @Override // m.m
    public final boolean o() {
        return this.f6344A.o();
    }

    @Override // m.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z7) {
        this.f6344A.setGroupDividerEnabled(z7);
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
        this.f6345B.setIcon(drawable);
        return this;
    }

    @Override // m.m, android.view.Menu
    public final void setQwertyMode(boolean z7) {
        this.f6344A.setQwertyMode(z7);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        u(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f6345B.setIcon(i2);
        return this;
    }
}
