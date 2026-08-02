package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cbt extends ox {
    final /* synthetic */ boolean a;
    final /* synthetic */ cbw b;

    public cbt(cbw cbwVar, boolean z) {
        this.a = z;
        this.b = cbwVar;
    }

    @Override // defpackage.ox
    public final void b(int i, CharSequence charSequence) {
        this.b.j.k(!this.a);
    }

    @Override // defpackage.ox
    public final void h(bsh bshVar) {
        cbw cbwVar = this.b;
        dev devVar = cbwVar.c.d;
        boolean z = this.a;
        cbwVar.e.j(cbp.k(devVar.d(z)), new cbp(Boolean.valueOf(z)), cbwVar.g);
    }
}
