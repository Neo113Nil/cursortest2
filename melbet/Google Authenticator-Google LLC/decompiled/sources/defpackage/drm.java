package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drm implements aep {
    final /* synthetic */ dsf a;
    final /* synthetic */ aer b;
    final /* synthetic */ SelectedAccountDisc c;

    public drm(SelectedAccountDisc selectedAccountDisc, dsf dsfVar, aer aerVar) {
        this.a = dsfVar;
        this.b = aerVar;
        this.c = selectedAccountDisc;
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        if (aejVar == aej.ON_START) {
            this.c.b(this.a, this.b);
            aerVar.L().c(this);
        }
    }
}
