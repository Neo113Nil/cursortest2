package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ker implements kla {
    public static final Logger a = Logger.getLogger(ker.class.getName());
    public final ScheduledExecutorService b;
    public final kbw c;
    public kgo d;
    public kuq e;

    public ker(ScheduledExecutorService scheduledExecutorService, kbw kbwVar) {
        this.b = scheduledExecutorService;
        this.c = kbwVar;
    }

    @Override // defpackage.kla
    public final void a() {
        kbw kbwVar = this.c;
        kbwVar.c();
        kbwVar.execute(new iaq(this, 15));
    }
}
