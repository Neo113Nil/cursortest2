package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjx extends jzi {
    final /* synthetic */ kjy a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public kjx(kjy kjyVar) {
        this.a = kjyVar;
    }

    @Override // defpackage.jzi
    public final jze a(jzf jzfVar) {
        if (this.b.compareAndSet(false, true)) {
            kjy kjyVar = this.a;
            kjyVar.f.c().execute(new kgf((jzk) kjyVar, 20));
        }
        return jze.a;
    }
}
