package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wj implements Runnable {
    private final Callable a;
    private final wo b;
    private final Handler c;

    public wj(Handler handler, Callable callable, wo woVar) {
        this.a = callable;
        this.b = woVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bsh bshVar;
        try {
            bshVar = ((we) this.a).call();
        } catch (Exception unused) {
            bshVar = null;
        }
        this.c.post(new at(this.b, bshVar, 17, (byte[]) null));
    }
}
