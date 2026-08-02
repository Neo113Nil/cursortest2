package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class au extends bb {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ ok b;
    final /* synthetic */ ob c;
    final /* synthetic */ bd d;
    final /* synthetic */ kee e;

    public au(bd bdVar, kee keeVar, AtomicReference atomicReference, ok okVar, ob obVar) {
        this.d = bdVar;
        this.e = keeVar;
        this.a = atomicReference;
        this.b = okVar;
        this.c = obVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [bl, oi] */
    @Override // defpackage.bb
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        bd bdVar = this.d;
        sb.append(bdVar.m);
        sb.append("_rq#");
        sb.append(bdVar.ae.getAndIncrement());
        String sb2 = sb.toString();
        bd bdVar2 = (bd) this.e.a;
        ?? r3 = bdVar2.D;
        this.a.set((r3 instanceof oi ? r3.c() : bdVar2.E().g).b(sb2, bdVar, this.b, this.c));
    }
}
