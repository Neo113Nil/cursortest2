package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqx {
    public final emr a;

    static {
        new eqx();
    }

    public eqx(long j, long j2) {
        if (j2 < j) {
            throw new IllegalArgumentException(hoq.w("End time %s is before start time %s.", Long.valueOf(j2), Long.valueOf(j)));
        }
        this.a = new emr(new ems(j, j), new ems(j2, j2));
    }

    private eqx() {
        this.a = new emr();
    }
}
