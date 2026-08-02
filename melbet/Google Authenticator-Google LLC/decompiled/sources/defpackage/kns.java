package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kns {
    public final Object a;
    public final jzk b;
    final /* synthetic */ knu e;
    public jzi d = new jzb(jze.a);
    public jxi c = jxi.a;

    public kns(knu knuVar, Object obj, jza jzaVar) {
        this.e = knuVar;
        this.a = obj;
        this.b = jzaVar.a(a());
    }

    protected knr a() {
        return new knr(this);
    }

    protected final void b() {
        this.b.d();
        this.c = jxi.e;
        knu.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
