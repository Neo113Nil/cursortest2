package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bsb extends ns {
    final /* synthetic */ bse a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsb(bse bseVar) {
        super(true);
        this.a = bseVar;
    }

    @Override // defpackage.ns
    public final void b() {
        bsa bsaVar = (bsa) this.a.b;
        int i = bse.b(bsaVar).b;
        if (i <= 0 || i >= 4) {
            bsaVar.E().finish();
        } else {
            bse.b(bsaVar).h(i - 1);
        }
    }
}
