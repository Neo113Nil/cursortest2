package y5;

import D5.v;
import D5.w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import v5.C0977c;
import v5.C0978d;
import x5.C1020j;

/* loaded from: classes.dex */
public final class m implements I4.h, Closeable {

    /* renamed from: m, reason: collision with root package name */
    public static final Logger f8696m = Logger.getLogger(m.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final h f8697d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.n f8698e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8699i;

    /* renamed from: l, reason: collision with root package name */
    public final C1020j f8700l;

    public m(M5.a aVar, Supplier supplier, ArrayList arrayList, C1020j c1020j) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add((g) obj);
        }
        g iVar = arrayList2.isEmpty() ? j.f8685d : arrayList2.size() == 1 ? (g) arrayList2.get(0) : new i(new ArrayList(arrayList2));
        this.f8697d = new h(aVar, supplier, iVar);
        this.f8698e = new P0.n(new w(3, this));
        this.f8700l = c1020j;
        this.f8699i = iVar instanceof j;
    }

    @Override // I4.h
    public final I4.g a(String str) {
        if (this.f8699i) {
            return ((I4.h) H4.d.c(I4.d.f1279d, "io.opentelemetry.api.incubator.logs.ExtendedDefaultLoggerProvider")).a(str);
        }
        if (str.isEmpty()) {
            f8696m.fine("Logger requested without instrumentation scope name.");
            str = "unknown";
        }
        return new v(this.f8698e, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    @Override // I4.h
    public final I4.f get() {
        return (I4.f) this.f8698e.g(C4.b.f297l, "noop");
    }

    public final C0977c shutdown() {
        if (this.f8697d.f8682e != null) {
            f8696m.log(Level.INFO, "Calling shutdown() multiple times.");
            return C0977c.f8229e;
        }
        h hVar = this.f8697d;
        synchronized (hVar.f8678a) {
            try {
                if (hVar.f8682e != null) {
                    return hVar.f8682e;
                }
                hVar.f8682e = hVar.f8681d.shutdown();
                return hVar.f8682e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkLoggerProvider{clock=");
        h hVar = this.f8697d;
        hVar.getClass();
        sb.append(C0978d.f8235a);
        sb.append(", resource=");
        sb.append(hVar.f8679b);
        sb.append(", logLimits=");
        sb.append((C1048b) hVar.f8680c.get());
        sb.append(", logRecordProcessor=");
        sb.append(hVar.f8681d);
        sb.append(", loggerConfigurator=");
        sb.append(this.f8700l);
        sb.append('}');
        return sb.toString();
    }
}
