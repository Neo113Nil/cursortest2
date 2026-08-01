package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends i implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final i f5729v;

    /* renamed from: w, reason: collision with root package name */
    public final j f5730w;

    public s(Context context, i iVar, j jVar) {
        super(context);
        this.f5729v = iVar;
        this.f5730w = jVar;
    }

    @Override // l.i
    public final boolean d(j jVar) {
        return this.f5729v.d(jVar);
    }

    @Override // l.i
    public final boolean e(i iVar, MenuItem menuItem) {
        return super.e(iVar, menuItem) || this.f5729v.e(iVar, menuItem);
    }

    @Override // l.i
    public final boolean f(j jVar) {
        return this.f5729v.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f5730w;
    }

    @Override // l.i
    public final i j() {
        return this.f5729v.j();
    }

    @Override // l.i
    public final boolean l() {
        return this.f5729v.l();
    }

    @Override // l.i
    public final boolean m() {
        return this.f5729v.m();
    }

    @Override // l.i
    public final boolean n() {
        return this.f5729v.n();
    }

    @Override // l.i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f5729v.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f5730w.setIcon(drawable);
        return this;
    }

    @Override // l.i, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f5729v.setQwertyMode(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        q(0, null, i3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        q(i3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f5730w.setIcon(i3);
        return this;
    }
}
