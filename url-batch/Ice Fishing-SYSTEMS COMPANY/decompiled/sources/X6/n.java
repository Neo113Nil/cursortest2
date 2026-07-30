package X6;

import b6.C0530a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import l7.C4707a;

/* loaded from: classes2.dex */
public final class n implements h6.h, Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final Logger f3871x = Logger.getLogger(n.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final h f3872n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.i f3873u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3874v;

    /* renamed from: w, reason: collision with root package name */
    public final W6.h f3875w;

    public n(C4707a c4707a, Supplier supplier, ArrayList arrayList, W6.h hVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((g) it.next());
        }
        g iVar = arrayList2.isEmpty() ? j.f3858n : arrayList2.size() == 1 ? (g) arrayList2.get(0) : new i(new ArrayList(arrayList2));
        this.f3872n = new h(c4707a, supplier, iVar);
        this.f3873u = new S0.i(new m(0, this));
        this.f3875w = hVar;
        this.f3874v = iVar instanceof j;
    }

    @Override // h6.h
    public final h6.g a(String str) {
        if (this.f3874v) {
            return ((h6.h) g6.d.c(h6.d.f38236n, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).a(str);
        }
        if (str.isEmpty()) {
            f3871x.fine("Logger requested without instrumentation scope name.");
            str = com.anythink.core.common.v.m.f16967e;
        }
        return new S0.c(7, this.f3873u, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // h6.h
    public final h6.f get() {
        return (h6.f) this.f3873u.h(C0530a.f5557w, "noop");
    }

    public final U6.c shutdown() {
        if (this.f3872n.f3855e != null) {
            f3871x.log(Level.INFO, "Calling shutdown() multiple times.");
            return U6.c.f3310e;
        }
        h hVar = this.f3872n;
        synchronized (hVar.f3851a) {
            try {
                if (hVar.f3855e != null) {
                    return hVar.f3855e;
                }
                hVar.f3855e = hVar.f3854d.shutdown();
                return hVar.f3855e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        h hVar = this.f3872n;
        hVar.getClass();
        sb.append(U6.d.f3316a);
        sb.append(", resource=");
        sb.append(hVar.f3852b);
        sb.append(", logLimits=");
        sb.append((b) hVar.f3853c.get());
        sb.append(", logRecordProcessor=");
        sb.append(hVar.f3854d);
        sb.append(", loggerConfigurator=");
        sb.append(this.f3875w);
        sb.append('}');
        return sb.toString();
    }
}
