package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class apg extends apf {
    final /* synthetic */ qi a;
    final /* synthetic */ aph b;

    public apg(aph aphVar, qi qiVar) {
        this.b = aphVar;
        this.a = qiVar;
    }

    @Override // defpackage.apf, defpackage.apb
    public final void b(ape apeVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(apeVar);
        apeVar.y(this);
    }
}
