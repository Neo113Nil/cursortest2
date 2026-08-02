package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ft {
    final Context a;
    public qy b;
    public qy c;

    public ft(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof vo)) {
            return menuItem;
        }
        vo voVar = (vo) menuItem;
        qy qyVar = this.b;
        if (qyVar == null) {
            qyVar = new qy(0);
            this.b = qyVar;
        }
        MenuItem menuItem2 = (MenuItem) qyVar.get(voVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        gk gkVar = new gk(this.a, voVar);
        this.b.put(voVar, gkVar);
        return gkVar;
    }

    final SubMenu b(SubMenu subMenu) {
        if (!(subMenu instanceof vp)) {
            return subMenu;
        }
        vp vpVar = (vp) subMenu;
        qy qyVar = this.c;
        if (qyVar == null) {
            qyVar = new qy(0);
            this.c = qyVar;
        }
        SubMenu subMenu2 = (SubMenu) qyVar.get(vpVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        gx gxVar = new gx(this.a, vpVar);
        this.c.put(vpVar, gxVar);
        return gxVar;
    }
}
