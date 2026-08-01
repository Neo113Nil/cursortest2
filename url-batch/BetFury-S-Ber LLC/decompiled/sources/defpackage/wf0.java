package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wf0 extends r10 implements SubMenu {
    public final u10 A;
    public final r10 z;

    public wf0(Context context, r10 r10Var, u10 u10Var) {
        super(context);
        this.z = r10Var;
        this.A = u10Var;
    }

    @Override // defpackage.r10
    public final boolean d(u10 u10Var) {
        return this.z.d(u10Var);
    }

    @Override // defpackage.r10
    public final boolean e(r10 r10Var, MenuItem menuItem) {
        return super.e(r10Var, menuItem) || this.z.e(r10Var, menuItem);
    }

    @Override // defpackage.r10
    public final boolean f(u10 u10Var) {
        return this.z.f(u10Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.r10
    public final String j() {
        u10 u10Var = this.A;
        int i = u10Var != null ? u10Var.a : 0;
        if (i == 0) {
            return null;
        }
        return r7.b("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.r10
    public final r10 k() {
        return this.z.k();
    }

    @Override // defpackage.r10
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.r10
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.r10
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.r10, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
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
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.r10, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
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
}
