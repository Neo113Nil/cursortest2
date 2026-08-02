package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kho extends kgt {
    final /* synthetic */ kfg a;
    final /* synthetic */ khp b;

    public kho(khp khpVar, kfg kfgVar) {
        this.a = kfgVar;
        this.b = khpVar;
    }

    @Override // defpackage.kgt
    protected final kfg b() {
        return this.a;
    }

    @Override // defpackage.kgt, defpackage.kfg
    public final void t(kfi kfiVar) {
        this.b.a.b();
        this.a.t(new khn(this, kfiVar));
    }
}
