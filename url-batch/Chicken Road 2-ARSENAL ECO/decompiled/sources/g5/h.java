package g5;

import H1.A;
import R4.m;
import d4.InterfaceC0329k;
import d4.InterfaceC0330l;
import f5.C0387a;
import h5.InterfaceC0413d;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h implements InterfaceC0330l, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f4296i = Logger.getLogger(h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final k f4297f;

    /* renamed from: g, reason: collision with root package name */
    public final A f4298g = new A(new m(3, this));

    /* renamed from: h, reason: collision with root package name */
    public final Q4.i f4299h;

    public h(O4.d dVar, InterfaceC0400c interfaceC0400c, C0387a c0387a, Supplier supplier, InterfaceC0413d interfaceC0413d, List list, Q4.i iVar) {
        this.f4297f = new k(dVar, interfaceC0400c, c0387a, supplier, interfaceC0413d, list);
        this.f4299h = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // d4.InterfaceC0330l
    public final InterfaceC0329k get() {
        return (InterfaceC0329k) this.f4298g.a(V3.a.f2706i, "noop");
    }

    public final O4.c shutdown() {
        if (this.f4297f.f4315h != null) {
            f4296i.log(Level.INFO, "Calling shutdown() multiple times.");
            return O4.c.f1787e;
        }
        k kVar = this.f4297f;
        synchronized (kVar.f4308a) {
            try {
                if (kVar.f4315h != null) {
                    return kVar.f4315h;
                }
                kVar.f4315h = kVar.f4314g.shutdown();
                return kVar.f4315h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        k kVar = this.f4297f;
        sb.append(kVar.f4309b);
        sb.append(", idGenerator=");
        sb.append(kVar.f4310c);
        sb.append(", resource=");
        sb.append(kVar.f4311d);
        sb.append(", spanLimitsSupplier=");
        sb.append((C0398a) kVar.f4312e.get());
        sb.append(", sampler=");
        sb.append(kVar.f4313f);
        sb.append(", spanProcessor=");
        sb.append(kVar.f4314g);
        sb.append(", tracerConfigurator=");
        sb.append(this.f4299h);
        sb.append('}');
        return sb.toString();
    }
}
