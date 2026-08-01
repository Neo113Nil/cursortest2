package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class m40 extends mt implements SubMenu {
    public final pt A;
    public final mt z;

    public m40(Context context, mt mtVar, pt ptVar) {
        super(context);
        this.z = mtVar;
        this.A = ptVar;
    }

    @Override // defpackage.mt
    public final boolean d(pt ptVar) {
        return this.z.d(ptVar);
    }

    @Override // defpackage.mt
    public final boolean e(mt mtVar, MenuItem menuItem) {
        return super.e(mtVar, menuItem) || this.z.e(mtVar, menuItem);
    }

    @Override // defpackage.mt
    public final boolean f(pt ptVar) {
        return this.z.f(ptVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.mt
    public final String j() {
        pt ptVar = this.A;
        int i = ptVar != null ? ptVar.a : 0;
        if (i == 0) {
            return null;
        }
        return d30.e("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.mt
    public final mt k() {
        return this.z.k();
    }

    @Override // defpackage.mt
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.mt
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.mt
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.mt, android.view.Menu
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

    @Override // defpackage.mt, android.view.Menu
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
