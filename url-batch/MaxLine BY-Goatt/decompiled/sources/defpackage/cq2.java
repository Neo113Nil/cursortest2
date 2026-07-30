package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cq2 extends fk1 implements SubMenu {
    public final lk1 A;
    public final fk1 z;

    public cq2(Context context, fk1 fk1Var, lk1 lk1Var) {
        super(context);
        this.z = fk1Var;
        this.A = lk1Var;
    }

    @Override // defpackage.fk1
    public final boolean d(lk1 lk1Var) {
        return this.z.d(lk1Var);
    }

    @Override // defpackage.fk1
    public final boolean e(fk1 fk1Var, MenuItem menuItem) {
        return super.e(fk1Var, menuItem) || this.z.e(fk1Var, menuItem);
    }

    @Override // defpackage.fk1
    public final boolean f(lk1 lk1Var) {
        return this.z.f(lk1Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.fk1
    public final String j() {
        lk1 lk1Var = this.A;
        int i = lk1Var != null ? lk1Var.a : 0;
        if (i == 0) {
            return null;
        }
        return in1.k(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.fk1
    public final fk1 k() {
        return this.z.k();
    }

    @Override // defpackage.fk1
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.fk1
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.fk1
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.fk1, android.view.Menu
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

    @Override // defpackage.fk1, android.view.Menu
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
