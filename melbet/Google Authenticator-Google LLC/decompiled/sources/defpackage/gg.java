package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gg extends tw implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int c = 0;
    public final ActionProvider a;
    final /* synthetic */ gk b;
    private kee d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(gk gkVar, ActionProvider actionProvider) {
        super((byte[]) null);
        this.b = gkVar;
        this.a = actionProvider;
    }

    @Override // defpackage.tw
    public final View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.tw
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.b(subMenu));
    }

    @Override // defpackage.tw
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.tw
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override // defpackage.tw
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.tw
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.tw
    public final void g(kee keeVar) {
        this.d = keeVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        kee keeVar = this.d;
        if (keeVar != null) {
            ((gf) keeVar.a).j.B();
        }
    }
}
