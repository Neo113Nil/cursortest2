package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.w0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class e0 extends m implements SubMenu {
    public final o A;

    /* renamed from: z, reason: collision with root package name */
    public final m f2024z;

    public e0(Context context, m mVar, o oVar) {
        super(context);
        this.f2024z = mVar;
        this.A = oVar;
    }

    @Override // k.m
    public final boolean d(o oVar) {
        return this.f2024z.d(oVar);
    }

    @Override // k.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f2024z.e(mVar, menuItem);
    }

    @Override // k.m
    public final boolean f(o oVar) {
        return this.f2024z.f(oVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // k.m
    public final String j() {
        o oVar = this.A;
        int i = oVar != null ? oVar.f2085a : 0;
        if (i == 0) {
            return null;
        }
        return w0.d("android:menu:actionviewstates:", i);
    }

    @Override // k.m
    public final m k() {
        return this.f2024z.k();
    }

    @Override // k.m
    public final boolean m() {
        return this.f2024z.m();
    }

    @Override // k.m
    public final boolean n() {
        return this.f2024z.n();
    }

    @Override // k.m
    public final boolean o() {
        return this.f2024z.o();
    }

    @Override // k.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f2024z.setGroupDividerEnabled(z3);
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
    public final void setQwertyMode(boolean z3) {
        this.f2024z.setQwertyMode(z3);
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
