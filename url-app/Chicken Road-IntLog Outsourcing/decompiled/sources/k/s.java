package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class s extends i implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final i f10665v;

    /* renamed from: w, reason: collision with root package name */
    public final j f10666w;

    public s(Context context, i iVar, j jVar) {
        super(context);
        this.f10665v = iVar;
        this.f10666w = jVar;
    }

    @Override // k.i
    public final boolean d(j jVar) {
        return this.f10665v.d(jVar);
    }

    @Override // k.i
    public final boolean e(i iVar, MenuItem menuItem) {
        super.e(iVar, menuItem);
        return this.f10665v.e(iVar, menuItem);
    }

    @Override // k.i
    public final boolean f(j jVar) {
        return this.f10665v.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f10666w;
    }

    @Override // k.i
    public final i j() {
        return this.f10665v.j();
    }

    @Override // k.i
    public final boolean l() {
        return this.f10665v.l();
    }

    @Override // k.i
    public final boolean m() {
        return this.f10665v.m();
    }

    @Override // k.i
    public final boolean n() {
        return this.f10665v.n();
    }

    @Override // k.i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f10665v.setGroupDividerEnabled(z);
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
        this.f10666w.setIcon(drawable);
        return this;
    }

    @Override // k.i, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f10665v.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        q(0, null, i2, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        q(i2, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f10666w.setIcon(i2);
        return this;
    }
}
