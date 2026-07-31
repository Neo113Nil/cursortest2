package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final j f4873v;

    /* renamed from: w, reason: collision with root package name */
    public final k f4874w;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f4873v = jVar;
        this.f4874w = kVar;
    }

    @Override // j.j
    public final boolean d(k kVar) {
        return this.f4873v.d(kVar);
    }

    @Override // j.j
    public final boolean e(j jVar, MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f4873v.e(jVar, menuItem);
    }

    @Override // j.j
    public final boolean f(k kVar) {
        return this.f4873v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4874w;
    }

    @Override // j.j
    public final j j() {
        return this.f4873v.j();
    }

    @Override // j.j
    public final boolean l() {
        return this.f4873v.l();
    }

    @Override // j.j
    public final boolean m() {
        return this.f4873v.m();
    }

    @Override // j.j
    public final boolean n() {
        return this.f4873v.n();
    }

    @Override // j.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z5) {
        this.f4873v.setGroupDividerEnabled(z5);
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
        this.f4874w.setIcon(drawable);
        return this;
    }

    @Override // j.j, android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f4873v.setQwertyMode(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        q(0, null, i7, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        q(i7, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f4874w.setIcon(i7);
        return this;
    }
}
