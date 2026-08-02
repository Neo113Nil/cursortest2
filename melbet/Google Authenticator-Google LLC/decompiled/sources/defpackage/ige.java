package defpackage;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ige implements kbi {
    public final igc[] a;

    public ige(igc... igcVarArr) {
        this.a = igcVarArr;
    }

    @Override // defpackage.kbi
    public final ixf a(kbg kbgVar, kaa kaaVar, kbh kbhVar) {
        kbhVar.getClass();
        jxr k = jxr.k();
        k.getClass();
        for (char c = 0; c <= 0; c = 1) {
            igc igcVar = this.a[0];
            k = k.l(igcVar.c, new AtomicReference()).l(igcVar.d, new AtomicReference());
            jzw jzwVar = igcVar.a;
            if (kaaVar.i(jzwVar)) {
                k = k.l(igcVar.b, kaaVar.c(jzwVar));
            }
        }
        igd igdVar = new igd(kbgVar, this, k);
        jxr a = k.a();
        try {
            return new kax(kbhVar.a(igdVar, kaaVar), k);
        } finally {
            k.f(a);
        }
    }

    public final void b(kaa kaaVar, jxr jxrVar, boolean z) {
        igc igcVar = this.a[0];
        Parcelable parcelable = (Parcelable) ((AtomicReference) (z ? igcVar.c : igcVar.d).a(jxrVar)).getAndSet(null);
        if (parcelable != null) {
            kaaVar.h(igcVar.a, parcelable);
        }
    }
}
