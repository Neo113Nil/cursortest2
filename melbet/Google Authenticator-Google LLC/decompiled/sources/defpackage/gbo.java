package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gbo implements hut {
    final /* synthetic */ gbp a;

    public gbo(gbp gbpVar) {
        this.a = gbpVar;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.hut
    public final void b(Object obj) {
        gbp gbpVar = this.a;
        gbpVar.e = obj;
        gbpVar.b = true;
        gbpVar.a();
    }
}
