package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s extends i implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final i f4144v;

    /* renamed from: w, reason: collision with root package name */
    public final j f4145w;

    public s(Context context, i iVar, j jVar) {
        super(context);
        this.f4144v = iVar;
        this.f4145w = jVar;
    }

    @Override // k.i
    public final boolean d(j jVar) {
        return this.f4144v.d(jVar);
    }

    @Override // k.i
    public final boolean e(i iVar, MenuItem menuItem) {
        return super.e(iVar, menuItem) || this.f4144v.e(iVar, menuItem);
    }

    @Override // k.i
    public final boolean f(j jVar) {
        return this.f4144v.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4145w;
    }

    @Override // k.i
    public final i j() {
        return this.f4144v.j();
    }

    @Override // k.i
    public final boolean l() {
        return this.f4144v.l();
    }

    @Override // k.i
    public final boolean m() {
        return this.f4144v.m();
    }

    @Override // k.i
    public final boolean n() {
        return this.f4144v.n();
    }

    @Override // k.i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f4144v.setGroupDividerEnabled(z3);
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
        this.f4145w.setIcon(drawable);
        return this;
    }

    @Override // k.i, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f4144v.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        q(0, null, i, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        q(i, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4145w.setIcon(i);
        return this;
    }
}
