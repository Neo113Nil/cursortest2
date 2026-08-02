package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwl {
    public static final ldb a = new ldb("REMOVED_TASK");
    public static final ldb b = new ldb("CLOSED_EMPTY");

    public static final long a(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }
}
