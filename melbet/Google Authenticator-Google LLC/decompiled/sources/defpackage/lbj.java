package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbj implements kqj, kqx {
    private final kqj a;
    private final kqn b;

    public lbj(kqj kqjVar, kqn kqnVar) {
        this.a = kqjVar;
        this.b = kqnVar;
    }

    @Override // defpackage.kqj
    public final kqn bU() {
        return this.b;
    }

    @Override // defpackage.kqj
    public final void ca(Object obj) {
        this.a.ca(obj);
    }

    @Override // defpackage.kqx
    public final StackTraceElement f() {
        return null;
    }

    @Override // defpackage.kqx
    public final kqx g() {
        kqj kqjVar = this.a;
        if (kqjVar instanceof kqx) {
            return (kqx) kqjVar;
        }
        return null;
    }
}
