package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gw extends gd implements SubMenu {
    public final gd l;
    public final gf m;

    public gw(Context context, gd gdVar, gf gfVar) {
        super(context);
        this.l = gdVar;
        this.m = gfVar;
    }

    @Override // defpackage.gd
    public final gd a() {
        return this.l.a();
    }

    @Override // defpackage.gd
    public final String d() {
        int i = this.m.a;
        if (i == 0) {
            return null;
        }
        return a.Y(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.m;
    }

    @Override // defpackage.gd
    public final void p(gb gbVar) {
        this.l.p(gbVar);
    }

    @Override // defpackage.gd, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // defpackage.gd, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // defpackage.gd
    public final boolean t(gf gfVar) {
        return this.l.t(gfVar);
    }

    @Override // defpackage.gd
    public final boolean u(gd gdVar, MenuItem menuItem) {
        return super.u(gdVar, menuItem) || this.l.u(gdVar, menuItem);
    }

    @Override // defpackage.gd
    public final boolean v(gf gfVar) {
        return this.l.v(gfVar);
    }

    @Override // defpackage.gd
    public final boolean w() {
        return this.l.w();
    }

    @Override // defpackage.gd
    public final boolean x() {
        return this.l.x();
    }

    @Override // defpackage.gd
    public final boolean y() {
        return this.l.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }
}
