package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuy extends kve {
    public final kuh a;

    public kuy(kqj kqjVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.ab(kqjVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new kuh(false, kul.a);
    }
}
