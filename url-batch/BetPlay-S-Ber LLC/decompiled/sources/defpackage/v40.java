package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class v40 extends au implements SubMenu {
    public final eu A;
    public final au z;

    public v40(Context context, au auVar, eu euVar) {
        super(context);
        this.z = auVar;
        this.A = euVar;
    }

    @Override // defpackage.au
    public final boolean d(eu euVar) {
        return this.z.d(euVar);
    }

    @Override // defpackage.au
    public final boolean e(au auVar, MenuItem menuItem) {
        return super.e(auVar, menuItem) || this.z.e(auVar, menuItem);
    }

    @Override // defpackage.au
    public final boolean f(eu euVar) {
        return this.z.f(euVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.au
    public final String j() {
        eu euVar = this.A;
        int i = euVar != null ? euVar.a : 0;
        if (i == 0) {
            return null;
        }
        return o30.e("android:menu:actionviewstates:", i);
    }

    @Override // defpackage.au
    public final au k() {
        return this.z.k();
    }

    @Override // defpackage.au
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.au
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.au
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.au, android.view.Menu
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

    @Override // defpackage.au, android.view.Menu
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
