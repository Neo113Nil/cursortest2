package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lcy extends kum implements kqx {
    public final kqj c;

    public lcy(kqn kqnVar, kqj kqjVar) {
        super(kqnVar, true);
        this.c = kqjVar;
    }

    @Override // defpackage.kum
    protected void bX(Object obj) {
        kqj kqjVar = this.c;
        kqjVar.ca(ixg.a(obj, kqjVar));
    }

    @Override // defpackage.kqx
    public final StackTraceElement f() {
        return null;
    }

    @Override // defpackage.kqx
    public final kqx g() {
        kqj kqjVar = this.c;
        if (kqjVar instanceof kqx) {
            return (kqx) kqjVar;
        }
        return null;
    }

    @Override // defpackage.kxb
    protected void n(Object obj) {
        kqj kqjVar = this.c;
        lcd.a(ixe.d(kqjVar), ixg.a(obj, kqjVar));
    }

    @Override // defpackage.kxb
    protected final boolean o() {
        return true;
    }

    public void m() {
    }
}
