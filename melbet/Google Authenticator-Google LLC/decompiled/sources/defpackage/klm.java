package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klm extends kft {
    final /* synthetic */ klp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klm(klp klpVar) {
        super(klpVar.a);
        this.a = klpVar;
    }

    @Override // defpackage.kft
    public final void a() {
        try {
            int i = kob.a;
            this.a.c().b();
        } catch (Throwable th) {
            this.a.f(th);
            throw th;
        }
    }
}
