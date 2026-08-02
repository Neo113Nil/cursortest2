package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvz implements Executor {
    public final kvj a;

    public kvz(kvj kvjVar) {
        this.a = kvjVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kvj kvjVar = this.a;
        kqo kqoVar = kqo.a;
        if (lcd.c(kvjVar, kqoVar)) {
            lcd.b(kvjVar, kqoVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
