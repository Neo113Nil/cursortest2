package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dlc implements dlh {
    final /* synthetic */ boolean a;

    public dlc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dlh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(dks dksVar) {
        dla dlaVar = dksVar.b;
        dlaVar.g(this);
        boolean z = false;
        if (this.a && dlaVar.c) {
            z = true;
        }
        if (z) {
            dlaVar.e();
        }
        dksVar.e();
        if (z) {
            dlaVar.d();
        }
    }
}
