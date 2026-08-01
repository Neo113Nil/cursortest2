package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.w0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e0 extends m implements SubMenu {
    public final o A;

    /* renamed from: z, reason: collision with root package name */
    public final m f2156z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f2156z = mVar;
        this.A = oVar;
    }

    @Override // j.m
    public final boolean d(o oVar) {
        return this.f2156z.d(oVar);
    }

    @Override // j.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f2156z.e(mVar, menuItem);
    }

    @Override // j.m
    public final boolean f(o oVar) {
        return this.f2156z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // j.m
    public final String j() {
        o oVar = this.A;
        int i4 = oVar != null ? oVar.f2211a : 0;
        if (i4 == 0) {
            return null;
        }
        return w0.e("android:menu:actionviewstates:", i4);
    }

    @Override // j.m
    public final m k() {
        return this.f2156z.k();
    }

    @Override // j.m
    public final boolean m() {
        return this.f2156z.m();
    }

    @Override // j.m
    public final boolean n() {
        return this.f2156z.n();
    }

    @Override // j.m
    public final boolean o() {
        return this.f2156z.o();
    }

    @Override // j.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f2156z.setGroupDividerEnabled(z3);
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

    @Override // j.m, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f2156z.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        u(0, null, i4, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        u(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.A.setIcon(i4);
        return this;
    }
}
