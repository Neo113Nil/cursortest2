package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kii extends jzc {
    jzk a;
    final /* synthetic */ kiq b;

    public kii(kiq kiqVar) {
        this.b = kiqVar;
    }

    @Override // defpackage.jzc
    public final jwy a() {
        return this.b.G;
    }

    @Override // defpackage.jzc
    public final /* bridge */ /* synthetic */ jzh b(jyz jyzVar) {
        kiq kiqVar = this.b;
        kiqVar.m.c();
        hoq.I(!kiqVar.B, "Channel is being terminated");
        return new ken(kiqVar, jyzVar);
    }

    @Override // defpackage.jzc
    public final kbw c() {
        return this.b.m;
    }

    @Override // defpackage.jzc
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.jzc
    public final void e() {
        kbw kbwVar = this.b.m;
        kbwVar.c();
        kbwVar.execute(new kgf(this, 13));
    }

    @Override // defpackage.jzc
    public final void f(jxi jxiVar, jzi jziVar) {
        kiq kiqVar = this.b;
        kiqVar.m.c();
        jxiVar.getClass();
        if (this != kiqVar.t || kiqVar.u) {
            return;
        }
        kiqVar.j(jziVar);
        if (jxiVar != jxi.e) {
            kiqVar.G.b(2, "Entering {0} state with picker: {1}", jxiVar, jziVar);
            kiqVar.o.a(jxiVar);
        }
    }
}
