package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwb implements kwc {
    private final Future a;

    public kwb(Future future) {
        this.a = future;
    }

    @Override // defpackage.kwc
    public final void bQ() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + "]";
    }
}
