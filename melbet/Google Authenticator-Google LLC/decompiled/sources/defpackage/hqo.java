package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hqo implements Runnable {
    final /* synthetic */ hvw a;
    final /* synthetic */ hqq b;

    public hqo(hqq hqqVar, hvw hvwVar) {
        this.a = hvwVar;
        this.b = hqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            hvw hvwVar = this.a;
            if (!hvwVar.isCancelled()) {
                if (hnu.aR(hvwVar) == hqq.b) {
                    return;
                }
            }
        } catch (ExecutionException unused) {
        }
        this.b.q(this.a);
    }
}
