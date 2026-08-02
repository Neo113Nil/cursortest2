package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axd implements axb {
    public final ajf a = new axc();
    private final ajw b;

    public axd(ajw ajwVar) {
        this.b = ajwVar;
    }

    @Override // defpackage.axb
    public final Long a(String str) {
        return (Long) abf.e(this.b, true, false, new aes(str, 7, (char[]) null));
    }

    @Override // defpackage.axb
    public final void b(axa axaVar) {
        abf.e(this.b, false, true, new aes(this, axaVar, 6, null));
    }
}
