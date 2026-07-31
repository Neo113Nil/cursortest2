package R4;

import H1.A;
import f5.C0387a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import u0.C0682l;

/* loaded from: classes.dex */
public final class n implements b4.h, Closeable {

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f2127j = Logger.getLogger(n.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final h f2128f;

    /* renamed from: g, reason: collision with root package name */
    public final A f2129g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2130h;

    /* renamed from: i, reason: collision with root package name */
    public final Q4.i f2131i;

    public n(C0387a c0387a, Supplier supplier, ArrayList arrayList, Q4.i iVar) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            arrayList2.add((g) obj);
        }
        g iVar2 = arrayList2.isEmpty() ? j.f2114f : arrayList2.size() == 1 ? (g) arrayList2.get(0) : new i(new ArrayList(arrayList2));
        this.f2128f = new h(c0387a, supplier, iVar2);
        this.f2129g = new A(new m(0, this));
        this.f2131i = iVar;
        this.f2130h = iVar2 instanceof j;
    }

    @Override // b4.h
    public final b4.g a(String str) {
        if (this.f2130h) {
            return ((b4.h) a4.d.c(b4.d.f3609f, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).a(str);
        }
        if (str.isEmpty()) {
            f2127j.fine("Logger requested without instrumentation scope name.");
            str = "unknown";
        }
        return new C0682l(this.f2129g, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // b4.h
    public final b4.f get() {
        return (b4.f) this.f2129g.a(V3.a.f2706i, "noop");
    }

    public final O4.c shutdown() {
        if (this.f2128f.f2111e != null) {
            f2127j.log(Level.INFO, "Calling shutdown() multiple times.");
            return O4.c.f1787e;
        }
        h hVar = this.f2128f;
        synchronized (hVar.f2107a) {
            try {
                if (hVar.f2111e != null) {
                    return hVar.f2111e;
                }
                hVar.f2111e = hVar.f2110d.shutdown();
                return hVar.f2111e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        h hVar = this.f2128f;
        hVar.getClass();
        sb.append(O4.d.f1793a);
        sb.append(", resource=");
        sb.append(hVar.f2108b);
        sb.append(", logLimits=");
        sb.append((b) hVar.f2109c.get());
        sb.append(", logRecordProcessor=");
        sb.append(hVar.f2110d);
        sb.append(", loggerConfigurator=");
        sb.append(this.f2131i);
        sb.append('}');
        return sb.toString();
    }
}
