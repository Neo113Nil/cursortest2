package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfb extends kft {
    final /* synthetic */ kmo a;
    final /* synthetic */ kfe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfb(kfe kfeVar, kmo kmoVar) {
        super(kfeVar.b.e);
        this.a = kmoVar;
        this.b = kfeVar;
    }

    @Override // defpackage.kft
    public final void a() {
        int i = kob.a;
        kfe kfeVar = this.b;
        kff kffVar = kfeVar.b;
        if (kfeVar.a != null) {
            khd.e(this.a);
            return;
        }
        while (true) {
            try {
                InputStream e = this.a.e();
                if (e == null) {
                    return;
                }
                try {
                    kfeVar.c.c(kffVar.b.e.b(e));
                    e.close();
                } catch (Throwable th) {
                    khd.f(e);
                    throw th;
                }
            } catch (Throwable th2) {
                khd.e(this.a);
                this.b.b(kbq.c.d(th2).e("Failed to read message."));
                return;
            }
        }
    }
}
