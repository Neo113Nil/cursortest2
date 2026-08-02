package defpackage;

import j$.time.Instant;
import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dod {
    private static final TimeZone a;
    private volatile long b;

    static {
        int i = hpe.a;
        a = DesugarTimeZone.getTimeZone("America/Los_Angeles");
    }

    public dod() {
        new HashSet();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(Instant.now().toEpochMilli());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        this.b = gregorianCalendar.getTimeInMillis();
    }
}
