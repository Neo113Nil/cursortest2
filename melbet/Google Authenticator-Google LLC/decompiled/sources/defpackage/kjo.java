package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjo implements jzj {
    public kjs a;
    final /* synthetic */ kju b;

    public kjo(kju kjuVar) {
        this.b = kjuVar;
    }

    @Override // defpackage.jzj
    public final void a(jxj jxjVar) {
        kju kjuVar = this.b;
        if (kjuVar.p) {
            kju.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{jxjVar, this.a.a});
            return;
        }
        kju.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{jxjVar, this.a.a});
        this.a.d = jxjVar;
        kjp kjpVar = kjuVar.k;
        if (kjpVar.f() && this.a == kjuVar.j.get(kjpVar.b())) {
            kjuVar.i(this.a);
        }
    }
}
