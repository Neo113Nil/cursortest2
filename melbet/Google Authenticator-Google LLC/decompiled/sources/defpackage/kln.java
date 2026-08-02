package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kln extends kft {
    final /* synthetic */ kmo a;
    final /* synthetic */ klp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kln(klp klpVar, kmo kmoVar) {
        super(klpVar.a);
        this.a = kmoVar;
        this.b = klpVar;
    }

    @Override // defpackage.kft
    public final void a() {
        try {
            int i = kob.a;
            this.b.c().d(this.a);
        } catch (Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
