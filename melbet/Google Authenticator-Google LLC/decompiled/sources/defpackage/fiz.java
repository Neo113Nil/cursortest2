package defpackage;

import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fiz extends gd {
    @Override // defpackage.gd, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        gf gfVar = (gf) c(i, i2, i3, charSequence);
        fjk fjkVar = new fjk(this.a, this, gfVar);
        gfVar.l(fjkVar);
        return fjkVar;
    }
}
