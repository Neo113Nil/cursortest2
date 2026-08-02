package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ieq extends kav {
    final /* synthetic */ ier a;
    private kaa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieq(ier ierVar, iwr iwrVar) {
        super(iwrVar);
        this.a = ierVar;
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        if (kaaVar.b(idg.b) == null) {
            kaa kaaVar2 = this.b;
            if (kaaVar2 != null) {
                this.f.b(kaaVar2);
                this.b = null;
            }
            this.f.a(kbqVar, kaaVar);
            return;
        }
        ier ierVar = this.a;
        synchronized (ierVar.a) {
            ierVar.f = ierVar.c.b(ierVar.d, ierVar.e.d(idg.a, true));
            Iterator it = ierVar.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void b(kaa kaaVar) {
        this.b = kaaVar;
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void c(Object obj) {
        kaa kaaVar = this.b;
        if (kaaVar != null) {
            this.f.b(kaaVar);
            this.b = null;
        }
        this.f.c(obj);
    }
}
