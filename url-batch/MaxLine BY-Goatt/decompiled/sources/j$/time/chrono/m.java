package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface m extends Comparable {
    static m of(String str) {
        ConcurrentHashMap concurrentHashMap = a.a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = a.a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) a.b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.q()) || str.equals(mVar2.u())) {
                        return mVar2;
                    }
                }
                j$.time.h.a("Unknown chronology: ".concat(str));
                return null;
            }
            p pVar = p.l;
            pVar.getClass();
            a.B(pVar, "Hijrah-umalqura");
            w wVar = w.c;
            wVar.getClass();
            a.B(wVar, "Japanese");
            b0 b0Var = b0.c;
            b0Var.getClass();
            a.B(b0Var, "Minguo");
            h0 h0Var = h0.c;
            h0Var.getClass();
            a.B(h0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.q().equals("ISO")) {
                        a.B(aVar, aVar.q());
                    }
                }
                t tVar = t.c;
                tVar.getClass();
                a.B(tVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    static m r(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        m mVar = (m) temporalAccessor.b(j$.time.temporal.r.b);
        t tVar = t.c;
        if (mVar != null) {
            return mVar;
        }
        Objects.requireNonNull(tVar, "defaultObj");
        return tVar;
    }

    List A();

    n C(int i);

    int D(n nVar, int i);

    b H(TemporalAccessor temporalAccessor);

    default e I(LocalDateTime localDateTime) {
        try {
            return H(localDateTime).L(j$.time.l.G(localDateTime));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    b M();

    b Q(int i, int i2, int i3);

    b S(Map map, j$.time.format.e0 e0Var);

    j T(Instant instant, j$.time.y yVar);

    boolean X(long j);

    boolean equals(Object obj);

    int hashCode();

    b p(long j);

    String q();

    String toString();

    String u();

    b v(int i, int i2);

    j$.time.temporal.u z(j$.time.temporal.a aVar);
}
