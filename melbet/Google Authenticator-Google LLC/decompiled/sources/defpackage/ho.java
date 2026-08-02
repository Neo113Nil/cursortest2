package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ho implements gb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ho(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gb
    public final void F(gd gdVar) {
        int i = this.b;
        if (i == 0) {
            gb gbVar = ((ActionMenuView) this.a).d;
            if (gbVar != null) {
                gbVar.F(gdVar);
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            Toolbar toolbar = (Toolbar) obj;
            if (!toolbar.a.m()) {
                toolbar.x.l(gdVar);
            }
            gb gbVar2 = toolbar.v;
            if (gbVar2 != null) {
                gbVar2.F(gdVar);
                return;
            }
            return;
        }
        ef efVar = (ef) obj;
        if (efVar.c.m()) {
            efVar.a.onPanelClosed(108, gdVar);
            return;
        }
        Window.Callback callback = efVar.a;
        if (callback.onPreparePanel(0, null, gdVar)) {
            callback.onMenuOpened(108, gdVar);
        }
    }

    @Override // defpackage.gb
    public final boolean J(gd gdVar, MenuItem menuItem) {
        kee keeVar;
        if (this.b == 0 && (keeVar = ((ActionMenuView) this.a).e) != null) {
            Toolbar toolbar = (Toolbar) keeVar.a;
            if (toolbar.x.m(menuItem)) {
                return true;
            }
            kee keeVar2 = toolbar.y;
            return keeVar2 != null && ((ef) keeVar2.a).a.onMenuItemSelected(0, menuItem);
        }
        return false;
    }
}
