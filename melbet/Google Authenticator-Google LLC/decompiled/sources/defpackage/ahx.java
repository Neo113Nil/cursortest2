package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahx implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ ahy a;

    public ahx(ahy ahyVar) {
        this.a = ahyVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        ahy ahyVar = this.a;
        boolean z2 = ahyVar.ak;
        if (z) {
            ahyVar.ak = z2 | ahyVar.aj.add(ahyVar.am[i].toString());
        } else {
            ahyVar.ak = z2 | ahyVar.aj.remove(ahyVar.am[i].toString());
        }
    }
}
