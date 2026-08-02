package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dro extends dja {
    final /* synthetic */ drp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dro(drp drpVar) {
        super(null);
        this.a = drpVar;
    }

    @Override // defpackage.dja
    public final void h(hel helVar) {
        this.a.b();
    }

    @Override // defpackage.dja
    public final void i() {
        this.a.c();
    }

    @Override // defpackage.dja
    public final void j(Object obj) {
        drp drpVar = this.a;
        drpVar.c();
        drpVar.a(obj);
    }
}
