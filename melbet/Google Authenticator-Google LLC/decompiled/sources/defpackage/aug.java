package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aug extends kra implements krz {
    int a;
    public /* synthetic */ Object b;
    public /* synthetic */ long c;

    public aug(kqj kqjVar) {
        super(4, kqjVar);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            asq.a().d(aui.a, "Cannot check for unfinished work", (Throwable) obj2);
            long min = Math.min(j * 30000, aui.b);
            this.a = 1;
            if (ixh.f(min, this) == kqpVar) {
                return kqpVar;
            }
        }
        return true;
    }
}
