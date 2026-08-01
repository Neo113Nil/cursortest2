package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p70 extends mw implements SubMenu {
    public final qw A;
    public final mw z;

    public p70(Context context, mw mwVar, qw qwVar) {
        super(context);
        this.z = mwVar;
        this.A = qwVar;
    }

    @Override // defpackage.mw
    public final boolean d(qw qwVar) {
        return this.z.d(qwVar);
    }

    @Override // defpackage.mw
    public final boolean e(mw mwVar, MenuItem menuItem) {
        return super.e(mwVar, menuItem) || this.z.e(mwVar, menuItem);
    }

    @Override // defpackage.mw
    public final boolean f(qw qwVar) {
        return this.z.f(qwVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.mw
    public final String j() {
        qw qwVar = this.A;
        int i = qwVar != null ? qwVar.a : 0;
        if (i == 0) {
            return null;
        }
        return f60.e("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.mw
    public final mw k() {
        return this.z.k();
    }

    @Override // defpackage.mw
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.mw
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.mw
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.mw, android.view.Menu
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

    @Override // defpackage.mw, android.view.Menu
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
