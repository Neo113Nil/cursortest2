package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class knq extends jzc {
    @Override // defpackage.jzc
    public final jzh b(jyz jyzVar) {
        return g().b(jyzVar);
    }

    @Override // defpackage.jzc
    public final kbw c() {
        return g().c();
    }

    @Override // defpackage.jzc
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // defpackage.jzc
    public final void e() {
        g().e();
    }

    @Override // defpackage.jzc
    public void f(jxi jxiVar, jzi jziVar) {
        throw null;
    }

    protected abstract jzc g();

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("delegate", g());
        return T.toString();
    }
}
