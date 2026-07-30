package m7;

import X6.m;
import b6.C0530a;
import j6.InterfaceC4608j;
import j6.InterfaceC4609k;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import l7.C4707a;
import n7.C4817c;

/* renamed from: m7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4793g implements InterfaceC4609k, Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f39591w = Logger.getLogger(C4793g.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final C4796j f39592n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.i f39593u = new S0.i(new m(3, this));

    /* renamed from: v, reason: collision with root package name */
    public final W6.h f39594v;

    public C4793g(U6.d dVar, EnumC4791e enumC4791e, C4707a c4707a, D5.a aVar, C4817c c4817c, ArrayList arrayList, W6.h hVar) {
        this.f39592n = new C4796j(dVar, enumC4791e, c4707a, aVar, c4817c, arrayList);
        this.f39594v = hVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // j6.InterfaceC4609k
    public final InterfaceC4608j get() {
        return (InterfaceC4608j) this.f39593u.h(C0530a.f5557w, "noop");
    }

    public final U6.c shutdown() {
        if (this.f39592n.f39610h != null) {
            f39591w.log(Level.INFO, "Calling shutdown() multiple times.");
            return U6.c.f3310e;
        }
        C4796j c4796j = this.f39592n;
        synchronized (c4796j.f39603a) {
            try {
                if (c4796j.f39610h != null) {
                    return c4796j.f39610h;
                }
                c4796j.f39610h = c4796j.f39609g.shutdown();
                return c4796j.f39610h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkTracerProvider{clock=");
        C4796j c4796j = this.f39592n;
        sb.append(c4796j.f39604b);
        sb.append(", idGenerator=");
        sb.append(c4796j.f39605c);
        sb.append(", resource=");
        sb.append(c4796j.f39606d);
        sb.append(", spanLimitsSupplier=");
        c4796j.f39607e.getClass();
        sb.append(C4787a.f39581a);
        sb.append(", sampler=");
        sb.append(c4796j.f39608f);
        sb.append(", spanProcessor=");
        sb.append(c4796j.f39609g);
        sb.append(", tracerConfigurator=");
        sb.append(this.f39594v);
        sb.append('}');
        return sb.toString();
    }
}
