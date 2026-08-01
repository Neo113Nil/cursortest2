package defpackage;

import com.moontiko.really.admiralcasino.MainActivity2;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tt extends ut implements ks {
    public final MainActivity2 j;
    public final /* synthetic */ rx k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(rx rxVar, MainActivity2 mainActivity2, mu muVar) {
        super(rxVar, muVar);
        this.k = rxVar;
        this.j = mainActivity2;
    }

    @Override // defpackage.ut
    public final void b() {
        this.j.f.f(this);
    }

    @Override // defpackage.ut
    public final boolean c(MainActivity2 mainActivity2) {
        return this.j == mainActivity2;
    }

    @Override // defpackage.ut
    public final boolean d() {
        return this.j.f.c.compareTo(hs.i) >= 0;
    }

    @Override // defpackage.ks
    public final void f(ms msVar, gs gsVar) {
        os osVar = this.j.f;
        hs hsVar = osVar.c;
        if (hsVar != hs.f) {
            hs hsVar2 = null;
            while (hsVar2 != hsVar) {
                a(d());
                hsVar2 = hsVar;
                hsVar = osVar.c;
            }
            return;
        }
        rx rxVar = this.k;
        rxVar.getClass();
        rx.a("removeObserver");
        ut utVar = (ut) rxVar.b.b(this.f);
        if (utVar == null) {
            return;
        }
        utVar.b();
        utVar.a(false);
    }
}
