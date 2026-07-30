package j$.time.temporal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public enum b implements s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");

    public final String a;

    static {
        j$.time.f.G(1L);
        j$.time.f.G(1000L);
        j$.time.f.G(1000000L);
        j$.time.f.B(1L, 0);
        j$.time.f.B(60L, 0);
        j$.time.f.B(3600L, 0);
        j$.time.f.B(43200L, 0);
        j$.time.f.B(86400L, 0);
        j$.time.f.B(604800L, 0);
        j$.time.f.B(2629746L, 0);
        j$.time.f.B(31556952L, 0);
        j$.time.f.B(315569520L, 0);
        j$.time.f.B(3155695200L, 0);
        j$.time.f.B(31556952000L, 0);
        j$.time.f.B(31556952000000000L, 0);
        j$.time.f.B(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999L, 1000000000L)), (int) Math.floorMod(999999999L, 1000000000L));
    }

    b(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final m s(m mVar, long j) {
        return mVar.l(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
