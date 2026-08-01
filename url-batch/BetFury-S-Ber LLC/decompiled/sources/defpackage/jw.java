package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jw extends ka {
    public final mw n;

    public jw(dg dgVar, mw mwVar) {
        super(dgVar, 1);
        this.n = mwVar;
    }

    @Override // defpackage.ka
    public final Throwable t(mw mwVar) {
        Throwable c;
        mw mwVar2 = this.n;
        mwVar2.getClass();
        Object obj = mw.f.get(mwVar2);
        return (!(obj instanceof lw) || (c = ((lw) obj).c()) == null) ? obj instanceof ld ? ((ld) obj).a : mwVar.s() : c;
    }

    @Override // defpackage.ka
    public final String z() {
        return "AwaitContinuation";
    }
}
