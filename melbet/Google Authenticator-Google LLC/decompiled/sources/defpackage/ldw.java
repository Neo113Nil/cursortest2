package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ldw implements kuv, kyc {
    public final kuw a;
    final /* synthetic */ ldx b;

    public ldw(ldx ldxVar, kuw kuwVar) {
        this.b = ldxVar;
        this.a = kuwVar;
    }

    @Override // defpackage.kyc
    public final void D(lbx lbxVar, int i) {
        throw null;
    }

    @Override // defpackage.kuv
    public final void a(Object obj) {
        this.a.a(obj);
    }

    @Override // defpackage.kuv
    public final void b(krt krtVar) {
        throw null;
    }

    @Override // defpackage.kqj
    public final kqn bU() {
        return this.a.b;
    }

    @Override // defpackage.kuv
    public final /* bridge */ /* synthetic */ void c(kvj kvjVar, Object obj) {
        throw null;
    }

    @Override // defpackage.kqj
    public final void ca(Object obj) {
        this.a.ca(obj);
    }

    @Override // defpackage.kuv
    public final boolean h() {
        throw null;
    }

    @Override // defpackage.kuv
    public final /* bridge */ /* synthetic */ Object i(Object obj, kry kryVar) {
        boolean z = kvo.a;
        ldx ldxVar = this.b;
        ldv ldvVar = new ldv(ldxVar, 0);
        ldb F = this.a.F((kow) obj, ldvVar);
        if (F != null) {
            ldxVar.a.c(null);
        }
        return F;
    }

    @Override // defpackage.kuv
    public final void j(Throwable th) {
        throw null;
    }

    @Override // defpackage.kuv
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        boolean z = kvo.a;
        ldx ldxVar = this.b;
        ldxVar.a.c(null);
        koy koyVar = new koy(ldxVar, 5);
        kuw kuwVar = this.a;
        kuwVar.B(obj, kuwVar.e, new ldv(koyVar, 1));
    }
}
