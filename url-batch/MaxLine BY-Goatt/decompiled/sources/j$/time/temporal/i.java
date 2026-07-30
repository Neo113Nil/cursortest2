package j$.time.temporal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        j$.time.f.B(31556952L, 0);
        j$.time.f.B(7889238L, 0);
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final m s(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            return mVar.i(Math.addExact(mVar.e(r4), j), j.c);
        }
        if (i == 2) {
            return mVar.l(j / 4, b.YEARS).l((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
