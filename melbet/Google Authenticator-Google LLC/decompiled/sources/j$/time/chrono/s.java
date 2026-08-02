package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class s extends a implements Serializable {
    public static final s c = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    private s() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static boolean w(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.a
    public final m g(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        j$.time.i.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String h() {
        return "iso8601";
    }

    @Override // j$.time.chrono.a
    public final String j() {
        return "ISO";
    }

    @Override // j$.time.chrono.a
    public final e k(Temporal temporal) {
        return j$.time.l.u(temporal);
    }

    @Override // j$.time.chrono.a
    public final j u(Instant instant, j$.time.b0 b0Var) {
        Objects.a(instant, "instant");
        return j$.time.f0.j(instant.getEpochSecond(), instant.getNano(), b0Var);
    }

    @Override // j$.time.chrono.a
    public final j v(Temporal temporal) {
        return j$.time.f0.t(temporal);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
