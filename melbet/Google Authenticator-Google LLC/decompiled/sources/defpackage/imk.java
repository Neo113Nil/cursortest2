package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imk {
    public static jkb a(Duration duration) {
        return jmv.c(duration.getSeconds(), duration.getNano());
    }

    public static Duration b(jkb jkbVar) {
        return Duration.ofSeconds(jmv.c(jkbVar.b, jkbVar.c).b, r4.c);
    }

    public static Instant c(jmh jmhVar) {
        return Instant.ofEpochSecond(jmx.c(jmhVar.b, jmhVar.c).b, r4.c);
    }
}
