package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfa extends kft {
    final /* synthetic */ kaa a;
    final /* synthetic */ kfe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfa(kfe kfeVar, kaa kaaVar) {
        super(kfeVar.b.e);
        this.a = kaaVar;
        this.b = kfeVar;
    }

    @Override // defpackage.kft
    public final void a() {
        int i = kob.a;
        kfe kfeVar = this.b;
        if (kfeVar.a == null) {
            try {
                kfeVar.c.b(this.a);
            } catch (Throwable th) {
                this.b.b(kbq.c.d(th).e("Failed to read headers"));
            }
        }
    }
}
