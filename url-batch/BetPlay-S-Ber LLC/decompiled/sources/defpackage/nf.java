package defpackage;

import android.view.View;
import androidx.fragment.app.g;
import androidx.fragment.app.i;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class nf extends mk {
    public final /* synthetic */ i f;
    public final /* synthetic */ g g;

    public nf(g gVar, i iVar) {
        this.g = gVar;
        this.f = iVar;
    }

    @Override // defpackage.mk
    public final View m(int i) {
        i iVar = this.f;
        return iVar.n() ? iVar.m(i) : this.g.onFindViewById(i);
    }

    @Override // defpackage.mk
    public final boolean n() {
        return this.f.n() || this.g.onHasView();
    }
}
