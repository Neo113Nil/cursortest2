package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agc implements Runnable {
    private final aej a;
    private boolean b;
    private final ael c;

    public agc(ael aelVar, aej aejVar) {
        aejVar.getClass();
        this.c = aelVar;
        this.a = aejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c.b(this.a);
        this.b = true;
    }
}
