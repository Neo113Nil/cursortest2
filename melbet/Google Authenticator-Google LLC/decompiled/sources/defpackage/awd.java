package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class awd implements awg {
    public final awp a;

    public awd(awp awpVar) {
        this.a = awpVar;
    }

    @Override // defpackage.awg
    public final kzq a(ary aryVar) {
        aryVar.getClass();
        return new kzl(new akn(this, (kqj) null, 2));
    }

    @Override // defpackage.awg
    public final boolean c(axt axtVar) {
        return b(axtVar) && e(this.a.b());
    }

    protected abstract int d();

    protected boolean e(Object obj) {
        throw null;
    }
}
