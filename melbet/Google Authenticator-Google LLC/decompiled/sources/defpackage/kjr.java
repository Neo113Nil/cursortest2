package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjr extends jzi {
    final /* synthetic */ kju a;
    private final kju b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public kjr(kju kjuVar, kju kjuVar2) {
        this.a = kjuVar;
        this.b = kjuVar2;
    }

    @Override // defpackage.jzi
    public final jze a(jzf jzfVar) {
        if (this.c.compareAndSet(false, true)) {
            this.a.i.c().execute(new kgf((jzk) this.b, 19));
        }
        return jze.a;
    }
}
