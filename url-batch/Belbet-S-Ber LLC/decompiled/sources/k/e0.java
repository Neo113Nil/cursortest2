package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e0 extends m implements SubMenu {
    public final o A;

    /* renamed from: z, reason: collision with root package name */
    public final m f2177z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f2177z = mVar;
        this.A = oVar;
    }

    @Override // k.m
    public final boolean d(o oVar) {
        return this.f2177z.d(oVar);
    }

    @Override // k.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f2177z.e(mVar, menuItem);
    }

    @Override // k.m
    public final boolean f(o oVar) {
        return this.f2177z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // k.m
    public final String j() {
        o oVar = this.A;
        int i = oVar != null ? oVar.f2234a : 0;
        if (i == 0) {
            return null;
        }
        return a4.b.f("android:menu:actionviewstates:", i);
    }

    @Override // k.m
    public final m k() {
        return this.f2177z.k();
    }

    @Override // k.m
    public final boolean m() {
        return this.f2177z.m();
    }

    @Override // k.m
    public final boolean n() {
        return this.f2177z.n();
    }

    @Override // k.m
    public final boolean o() {
        return this.f2177z.o();
    }

    @Override // k.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f2177z.setGroupDividerEnabled(z4);
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

    @Override // k.m, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f2177z.setQwertyMode(z4);
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

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
