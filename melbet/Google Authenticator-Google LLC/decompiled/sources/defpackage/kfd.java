package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfd extends kft {
    final /* synthetic */ kfe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfd(kfe kfeVar) {
        super(kfeVar.b.e);
        this.a = kfeVar;
    }

    @Override // defpackage.kft
    public final void a() {
        int i = kob.a;
        kfe kfeVar = this.a;
        if (kfeVar.a == null) {
            try {
                kfeVar.c.d();
            } catch (Throwable th) {
                this.a.b(kbq.c.d(th).e("Failed to call onReady."));
            }
        }
    }
}
