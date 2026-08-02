package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class a implements Comparable {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static a n(String str) {
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            a aVar = (a) concurrentHashMap.get(str);
            if (aVar == null) {
                aVar = (a) b.get(str);
            }
            if (aVar != null) {
                return aVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(a.class).iterator();
                while (it.hasNext()) {
                    a aVar2 = (a) it.next();
                    if (str.equals(aVar2.j()) || str.equals(aVar2.h())) {
                        return aVar2;
                    }
                }
                j$.time.i.d("Unknown chronology: ".concat(str));
                return null;
            }
            o oVar = o.l;
            oVar.getClass();
            t(oVar, "Hijrah-umalqura");
            v vVar = v.c;
            vVar.getClass();
            t(vVar, "Japanese");
            a0 a0Var = a0.c;
            a0Var.getClass();
            t(a0Var, "Minguo");
            g0 g0Var = g0.c;
            g0Var.getClass();
            t(g0Var, "ThaiBuddhist");
            try {
                for (a aVar3 : Arrays.asList(new a[0])) {
                    if (!aVar3.j().equals("ISO")) {
                        t(aVar3, aVar3.j());
                    }
                }
                s sVar = s.c;
                sVar.getClass();
                t(sVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static a t(a aVar, String str) {
        String h;
        a aVar2 = (a) a.putIfAbsent(str, aVar);
        if (aVar2 == null && (h = aVar.h()) != null) {
            b.putIfAbsent(h, aVar);
        }
        return aVar2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return j().compareTo(((a) obj).j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && j().compareTo(((a) obj).j()) == 0;
    }

    public b f(Temporal temporal) {
        return j$.time.j.v(temporal);
    }

    public m g(int i) {
        if (i == 1) {
            return r.AH;
        }
        j$.time.i.d("invalid Hijrah era");
        return null;
    }

    public String h() {
        return "islamic-umalqura";
    }

    public final int hashCode() {
        return j().hashCode() ^ getClass().hashCode();
    }

    public String j() {
        return "Hijrah-umalqura";
    }

    public e k(Temporal temporal) {
        try {
            return f(temporal).q(j$.time.n.v(temporal));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    public j$.time.temporal.q o(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    public final String toString() {
        return j();
    }

    public j u(Instant instant, j$.time.b0 b0Var) {
        return l.u(this, instant, b0Var);
    }

    public j v(Temporal temporal) {
        try {
            j$.time.b0 t = j$.time.b0.t(temporal);
            try {
                return u(Instant.u(temporal), t);
            } catch (j$.time.c unused) {
                return l.t(t, null, g.t(this, this.k(temporal)));
            }
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }
}
