package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class goy extends kav {
    final /* synthetic */ goz a;
    final /* synthetic */ iee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goy(goz gozVar, iwr iwrVar, iee ieeVar) {
        super(iwrVar);
        this.b = ieeVar;
        this.a = gozVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [hac, java.lang.Object] */
    @Override // defpackage.kav, defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        Iterable b = kaaVar.b(idg.c);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gpa gpaVar = this.a.a;
        long j = elapsedRealtime - gpaVar.a;
        int i = kbqVar.o.r;
        fdx fdxVar = (fdx) this.b.e.bB();
        ikj ikjVar = gpaVar.b;
        fdxVar.b(j, ikjVar.b, ikjVar.a, Integer.valueOf(i), Boolean.valueOf(b != null));
        super.a(kbqVar, kaaVar);
    }
}
