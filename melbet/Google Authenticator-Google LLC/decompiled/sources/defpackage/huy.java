package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huy extends hsv implements Runnable {
    private hvi a;

    public huy(hvi hviVar) {
        this.a = hviVar;
    }

    @Override // defpackage.hsw
    protected final String a() {
        hvi hviVar = this.a;
        if (hviVar != null) {
            return a.aa(hviVar, "delegate=[", "]");
        }
        return null;
    }

    @Override // defpackage.hsw
    protected final void b() {
        this.a = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hvi hviVar = this.a;
        if (hviVar != null) {
            q(hviVar);
        }
    }
}
