package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvx extends lcy {
    public final kui b;

    public kvx(kqn kqnVar, kqj kqjVar) {
        super(kqnVar, kqjVar);
        this.b = new kui(0, kul.a);
    }

    @Override // defpackage.lcy, defpackage.kum
    protected final void bX(Object obj) {
        kui kuiVar;
        do {
            kuiVar = this.b;
            int i = kuiVar.b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                kqj kqjVar = this.c;
                lcd.a(ixe.d(kqjVar), ixg.a(obj, kqjVar));
                return;
            }
        } while (!kuiVar.d(0, 2));
    }

    @Override // defpackage.lcy, defpackage.kxb
    protected final void n(Object obj) {
        bX(obj);
    }
}
