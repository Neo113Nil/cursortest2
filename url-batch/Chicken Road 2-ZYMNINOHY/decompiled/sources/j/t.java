package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* renamed from: w, reason: collision with root package name */
    public final j f13720w;

    /* renamed from: x, reason: collision with root package name */
    public final k f13721x;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f13720w = jVar;
        this.f13721x = kVar;
    }

    @Override // j.j
    public final boolean d(k kVar) {
        return this.f13720w.d(kVar);
    }

    @Override // j.j
    public final boolean e(j jVar, MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f13720w.e(jVar, menuItem);
    }

    @Override // j.j
    public final boolean f(k kVar) {
        return this.f13720w.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f13721x;
    }

    @Override // j.j
    public final j j() {
        return this.f13720w.j();
    }

    @Override // j.j
    public final boolean l() {
        return this.f13720w.l();
    }

    @Override // j.j
    public final boolean m() {
        return this.f13720w.m();
    }

    @Override // j.j
    public final boolean n() {
        return this.f13720w.n();
    }

    @Override // j.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f13720w.setGroupDividerEnabled(z);
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
        this.f13721x.setIcon(drawable);
        return this;
    }

    @Override // j.j, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f13720w.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        q(0, null, i4, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        q(i4, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.f13721x.setIcon(i4);
        return this;
    }
}
