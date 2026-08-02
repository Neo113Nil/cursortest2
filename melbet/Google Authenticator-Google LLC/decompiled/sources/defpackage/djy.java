package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class djy extends kav {
    final /* synthetic */ dkb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djy(iwr iwrVar, dkb dkbVar) {
        super(iwrVar);
        this.a = dkbVar;
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        dkb dkbVar = this.a;
        synchronized (dkbVar.a) {
            if (!dkbVar.c) {
                dkbVar.c = true;
                dka dkaVar = dkbVar.b;
                if (dkaVar == null) {
                    eqa eqaVar = dkbVar.d;
                    eqaVar.p = kbqVar.o.r;
                    eim.a().c(eqaVar);
                } else {
                    synchronized (dkaVar.a) {
                        eqa eqaVar2 = dkaVar.b;
                        int i = dkaVar.d;
                        int i2 = dkaVar.e;
                        eqaVar2.c = SystemClock.elapsedRealtime() - eqaVar2.a;
                        eqaVar2.d = i;
                        eqaVar2.e = i2;
                        eqaVar2.p = kbqVar.o.r;
                        eim.a().c(eqaVar2);
                        dkaVar.c = true;
                    }
                }
            }
        }
        super.a(kbqVar, kaaVar);
    }
}
